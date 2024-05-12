Java.perform(function () {
    var ShareAwemeContent = Java.use("com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");
    ShareAwemeContent.generateSharePackage.implementation = function () {
        console.log("[*] Before serialization:");
        console.log("Content Name: " + this.getContentName());
        // Modify content if needed
        this.setContentName("Modified Content Name");
        return this.generateSharePackage.apply(this, arguments);
    };
});
