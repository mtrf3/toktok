package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class InteractPermission implements Serializable {

    @InterfaceC65349Pkn("allow_adding_to_story")
    public int allowAddingToStory;

    @InterfaceC65349Pkn("allow_create_sticker")
    public InteractionPermission allowCreateSticker;

    @InterfaceC65349Pkn("allow_story_switch_to_post")
    public InteractionPermission allowStorySwitchToPost;

    @InterfaceC65349Pkn("duet")
    public int duet;

    @InterfaceC65349Pkn("duet_privacy_setting")
    public int duetPrivacySettingControl;

    @InterfaceC65349Pkn("stitch")
    public int stitch;

    @InterfaceC65349Pkn("stitch_privacy_setting")
    public int stitchPrivacySettingControl;

    @InterfaceC65349Pkn("upvote")
    public int upvote;

    public final int getAllowAddingToStory() {
        return this.allowAddingToStory;
    }

    public final InteractionPermission getAllowCreateSticker() {
        return this.allowCreateSticker;
    }

    public final InteractionPermission getAllowStorySwitchToPost() {
        return this.allowStorySwitchToPost;
    }

    public final int getDuet() {
        return this.duet;
    }

    public final int getDuetPrivacySettingControl() {
        return this.duetPrivacySettingControl;
    }

    public final int getStitch() {
        return this.stitch;
    }

    public final int getStitchPrivacySettingControl() {
        return this.stitchPrivacySettingControl;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    public final void setAllowAddingToStory(int i) {
        this.allowAddingToStory = i;
    }

    public final void setAllowCreateSticker(InteractionPermission interactionPermission) {
        this.allowCreateSticker = interactionPermission;
    }

    public final void setAllowStorySwitchToPost(InteractionPermission interactionPermission) {
        this.allowStorySwitchToPost = interactionPermission;
    }

    public final void setDuet(int i) {
        this.duet = i;
    }

    public final void setDuetPrivacySettingControl(int i) {
        this.duetPrivacySettingControl = i;
    }

    public final void setStitch(int i) {
        this.stitch = i;
    }

    public final void setStitchPrivacySettingControl(int i) {
        this.stitchPrivacySettingControl = i;
    }

    public final void setUpvote(int i) {
        this.upvote = i;
    }
}
