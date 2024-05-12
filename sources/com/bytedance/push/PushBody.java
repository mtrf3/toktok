package com.bytedance.push;

import X.C16880lQ;
import X.C47135Ieh;
import X.Q89;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new IDCreatorS54S0000000_11(11);
    public long expire_time;
    public String extra;
    public final String groupId;
    public long id;
    public int imageType;
    public String imageUrl;
    public boolean mIsPassThough;
    public String mNotificationChannelId;
    public int messageType;
    public JSONObject msgData;
    public final boolean needFilterMsgByUid;
    public String open_url;
    public long rid64;
    public final boolean showWhen;
    public final String targetSecUid;
    public String text;
    public String title;
    public boolean useLED;
    public boolean useSound;
    public boolean useVibrator;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String LIZ() {
        JSONObject jSONObject = this.msgData;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushBody{id=");
        LIZ.append(this.id);
        LIZ.append(", rid64=");
        LIZ.append(this.rid64);
        LIZ.append(", groupId='");
        Q89.LIZIZ(LIZ, this.groupId, '\'', ", showWhen=");
        LIZ.append(this.showWhen);
        LIZ.append(", targetSecUid='");
        Q89.LIZIZ(LIZ, this.targetSecUid, '\'', ", needFilterMsgByUid=");
        LIZ.append(this.needFilterMsgByUid);
        LIZ.append(", extra='");
        Q89.LIZIZ(LIZ, this.extra, '\'', ", mNotificationChannelId='");
        Q89.LIZIZ(LIZ, this.mNotificationChannelId, '\'', ", mIsPassThough=");
        LIZ.append(this.mIsPassThough);
        LIZ.append(", msgData=");
        LIZ.append(this.msgData);
        LIZ.append(", text='");
        Q89.LIZIZ(LIZ, this.text, '\'', ", title='");
        Q89.LIZIZ(LIZ, this.title, '\'', ", imageUrl='");
        Q89.LIZIZ(LIZ, this.imageUrl, '\'', ", imageType=");
        LIZ.append(this.imageType);
        LIZ.append(", open_url='");
        Q89.LIZIZ(LIZ, this.open_url, '\'', ", useLED=");
        LIZ.append(this.useLED);
        LIZ.append(", useSound=");
        LIZ.append(this.useSound);
        LIZ.append(", useVibrator=");
        LIZ.append(this.useVibrator);
        LIZ.append(", messageType=");
        LIZ.append(this.messageType);
        LIZ.append(", expire_time=");
        return C47135Ieh.LIZIZ(LIZ, this.expire_time, '}', LIZ);
    }

    public PushBody(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.msgData = jSONObject;
        this.open_url = jSONObject.optString("open_url");
        this.text = jSONObject.optString("text");
        this.title = jSONObject.optString("title");
        this.imageUrl = jSONObject.optString("image_url");
        this.id = jSONObject.optLong("id", 0L);
        this.rid64 = jSONObject.optLong("rid64", 0L);
        this.useLED = LIZIZ(jSONObject, "use_led");
        this.useSound = LIZIZ(jSONObject, "sound");
        this.useVibrator = LIZIZ(jSONObject, "use_vibrator");
        this.imageType = jSONObject.optInt("image_type", 0);
        if (jSONObject.optInt("pass_through", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsPassThough = z;
        this.mNotificationChannelId = jSONObject.optString("notify_channel");
        this.messageType = jSONObject.optInt("msg_from");
        this.groupId = jSONObject.optString("group_id_str");
        if (jSONObject.optInt("st", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.showWhen = z2;
        this.targetSecUid = jSONObject.optString("ttpush_sec_target_uid");
        this.needFilterMsgByUid = jSONObject.optInt("ttpush_need_filter_uid", 0) > 0;
        this.extra = jSONObject.optString("extra_str");
        this.expire_time = jSONObject.optLong("expire_time");
    }

    public PushBody(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.id = parcel.readLong();
        this.rid64 = parcel.readLong();
        this.groupId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.showWhen = z;
        this.targetSecUid = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needFilterMsgByUid = z2;
        this.extra = parcel.readString();
        this.mNotificationChannelId = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mIsPassThough = z3;
        try {
            this.msgData = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.imageUrl = parcel.readString();
        this.imageType = parcel.readInt();
        this.open_url = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.useLED = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.useSound = z5;
        this.useVibrator = parcel.readByte() != 0;
        this.messageType = parcel.readInt();
        this.expire_time = parcel.readLong();
    }

    public static boolean LIZIZ(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return false;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt >= 1) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.rid64);
        parcel.writeString(this.groupId);
        parcel.writeByte(this.showWhen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.targetSecUid);
        parcel.writeByte(this.needFilterMsgByUid ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeString(this.mNotificationChannelId);
        parcel.writeByte(this.mIsPassThough ? (byte) 1 : (byte) 0);
        parcel.writeString(this.msgData.toString());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageType);
        parcel.writeString(this.open_url);
        parcel.writeByte(this.useLED ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useVibrator ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.messageType);
        parcel.writeLong(this.expire_time);
    }
}
