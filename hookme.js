Java.perform(function () {
    var ShareAwemeContent = Java.use("com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent");

    ShareAwemeContent.generateSharePackage.implementation = function () {
        console.log("[*] generateSharePackage method called.");
        console.log("Author Username: " + this.getAuthorUsername());
        console.log("Content Name: " + this.getContentName());
        console.log("Content Thumb URL: " + (this.getContentThumb() ? this.getContentThumb().url : "No URL"));
        console.log("Cover URL: " + (this.getCoverUrl() ? this.getCoverUrl().url : "No URL"));
        console.log("Diamond Game ID: " + this.getDiamondGameId());
        console.log("Height: " + this.getHeight());
        console.log("Hot Spot Create Time: " + this.getHotSpotCreateTime());
        console.log("Is Ad Fake: " + this.isAdFake());
        console.log("Is Hot Spot Video: " + this.isHotSpotVideo());
        console.log("Is Story: " + this.isStory());
        console.log("Item ID: " + this.getItemId());
        console.log("Need Skip Strange: " + this.getNeedSkipStrange());
        console.log("Sec UID: " + this.getSecUid());
        console.log("Title: " + this.getTitle());
        console.log("User: " + this.getUser());
        console.log("Width: " + this.getWidth());
        console.log("Send Method: " + this.getSendMethod());
        console.log("Aweme Msg Hint: " + this.getAwemeMsgHint());

        // Continue with the original method execution
        return this.generateSharePackage.apply(this, arguments);
    };
});
