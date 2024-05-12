package com.ss.android.ugc.aweme.sticker.panel.guide;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes15.dex */
public class ExtraParams implements Parcelable {
    public static final Parcelable.Creator<ExtraParams> CREATOR = new IDCreatorS56S0000000_14(11);

    @InterfaceC65349Pkn("clickable_open_url")
    public String clickableOpenUrl;

    @InterfaceC65349Pkn("clickable_web_url")
    public String clickableWebUrl;

    @InterfaceC65349Pkn("enable_new_prompt")
    public int enableNewPrompt;

    @InterfaceC65349Pkn("gif_type")
    public int gifType;

    @InterfaceC65349Pkn("interaction_icon")
    public String interactionIcon;

    @InterfaceC65349Pkn("interaction_text")
    public String interactionText;

    @InterfaceC65349Pkn("interaction_type")
    public int interactionType;

    @InterfaceC65349Pkn("interaction_url")
    public String interactionUrl;

    @InterfaceC65349Pkn("lottie_type")
    public int lottieType;

    @InterfaceC65349Pkn("manual_close")
    public int manualClose;

    @InterfaceC65349Pkn("prop_offline_toast")
    public String offlineToast;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean enableNewPrompt() {
        if (this.enableNewPrompt == 1) {
            return true;
        }
        return false;
    }

    public boolean isGifValid() {
        int i = this.gifType;
        if (1 == i || 2 == i) {
            return true;
        }
        return false;
    }

    public boolean isLottieValid() {
        int i = this.lottieType;
        if (1 == i || 2 == i) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType == 1 && !TextUtils.isEmpty(this.interactionText) && (!TextUtils.isEmpty(this.interactionUrl) || !TextUtils.isEmpty(this.clickableOpenUrl) || !TextUtils.isEmpty(this.clickableWebUrl))) {
            return true;
        }
        return false;
    }

    public ExtraParams() {
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getOfflineToast() {
        return this.offlineToast;
    }

    public ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
        this.offlineToast = parcel.readString();
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setOfflineToast(String str) {
        this.offlineToast = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
        parcel.writeString(this.offlineToast);
    }
}
