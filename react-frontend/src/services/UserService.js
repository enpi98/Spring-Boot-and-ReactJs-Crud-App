import axios from 'axios';

const USER_URL="http://localhost:8080/Users/getUsers"
const USER_URL_2="http://localhost:8080/Users/createUser"
const USER_URL_3="http://localhost:8080/Users/updateUser"
const USER_URL_4="http://localhost:8080/Users/deleteUser"


class UserService{
    getUsers(){
        return axios.get(USER_URL);
    }
    createUser(user){
        return axios.post(USER_URL_2,user);
    }
    getUserById(userId){
        return axios.get(USER_URL + '/' + userId);
    }
    updateUser(user){
        return axios.put(USER_URL_3,user);
    }
   
    deleteUser(userId){
        return axios.delete(USER_URL_4 + '/' + userId);
    }
   
}

export default new UserService()






