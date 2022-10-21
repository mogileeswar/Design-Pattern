package Online_trading.Person;

import Enums.UserType;
    private UserType userType;
    private String userName;
    private String password;

// below mentioned consturctor is used for UserInfo
    public UserInfo(UserType userType, String userName, String password){
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }
// to get the user type below mentioned method is used
    public UserType getUsertype()
    {
        return usertye;
    }
// to get username below mentioned method is used
    public String getUserName()
    {
        return userName;
    }
// to get password below mentioned method is used
    public String getPassword()
    {
        return password;
    }