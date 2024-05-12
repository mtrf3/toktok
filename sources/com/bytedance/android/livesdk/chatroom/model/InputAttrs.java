package com.bytedance.android.livesdk.chatroom.model;

import Y.IDCreatorS49S0000000_5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class InputAttrs implements Parcelable {
    public static final Parcelable.Creator<InputAttrs> CREATOR = new IDCreatorS49S0000000_5(0);
    public List<EmoteWithIndex> atEmoteWithIndexList;
    public String atName;
    public boolean canSendDanmu;
    public String content;
    public boolean emoteEnabled;
    public EmoteFixTextHelper emoteFixTextHelperForText;
    public boolean hasDraft;
    public String hint;
    public String input;
    public String inputWithEmote;
    public boolean isBroadcaster;
    public boolean isDanmuOpen;
    public boolean isOfficial;
    public boolean isQAStrengthen;
    public boolean isUserBanned;
    public boolean isUserBannedWholeLive;
    public String mCommentMethod;
    public ReplyInfo replyInfo;
    public String requestPage;
    public ISendCommentEvent.Sender sender;
    public String starlingKey;
    public JSONObject trackInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public InputAttrs() {
        this.isUserBannedWholeLive = true;
        this.canSendDanmu = true;
        this.replyInfo = new ReplyInfo();
        this.mCommentMethod = "";
    }

    public InputAttrs(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.isUserBannedWholeLive = true;
        this.canSendDanmu = true;
        this.replyInfo = new ReplyInfo();
        this.mCommentMethod = "";
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDanmuOpen = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isBroadcaster = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUserBanned = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isUserBannedWholeLive = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.hasDraft = z5;
        this.input = parcel.readString();
        this.emoteFixTextHelperForText = (EmoteFixTextHelper) parcel.readParcelable(EmoteFixTextHelper.class.getClassLoader());
        this.replyInfo = (ReplyInfo) parcel.readParcelable(ReplyInfo.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.canSendDanmu = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isOfficial = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.emoteEnabled = z8;
        this.isQAStrengthen = parcel.readByte() != 0;
        this.inputWithEmote = parcel.readString();
        this.requestPage = parcel.readString();
        this.hint = parcel.readString();
        this.sender = (ISendCommentEvent.Sender) parcel.readParcelable(ISendCommentEvent.Sender.class.getClassLoader());
        this.mCommentMethod = parcel.readString();
        this.starlingKey = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isDanmuOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isBroadcaster ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUserBanned ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUserBannedWholeLive ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasDraft ? (byte) 1 : (byte) 0);
        parcel.writeString(this.input);
        parcel.writeParcelable(this.emoteFixTextHelperForText, i);
        parcel.writeParcelable(this.replyInfo, i);
        parcel.writeByte(this.canSendDanmu ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isOfficial ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.emoteEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isQAStrengthen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.inputWithEmote);
        parcel.writeString(this.requestPage);
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.sender, i);
        parcel.writeString(this.mCommentMethod);
        parcel.writeString(this.starlingKey);
    }
}
