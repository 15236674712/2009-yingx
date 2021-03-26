    public static void main(String[] args) {

        /*String random = getRandom(6);
        log.info("验证码随机数：{}",random);

        sendPhoneCode("15010729294",random);*/

        String postData="account=zhangcn&password=123456&mobile=15236674712&content=您的验证码是：8888。请不要把验证码泄露给其他人。如非本人操作，可不用理会！";
        String postUrl="http://sms.106jiekou.com/utf8/sms.aspx";

        /**
         *  postData:  参数
         *  postUrl:   url地址
         * */
        String sms = SMS(postData, postUrl);
        int a=20;
		
		String str="200";
    }
