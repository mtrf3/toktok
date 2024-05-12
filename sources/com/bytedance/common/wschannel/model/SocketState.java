package com.bytedance.common.wschannel.model;

import X.C16880lQ;
import X.Q89;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new IDCreatorS54S0000000_11(6);
    public int channelId;
    public int channelType;
    public int connectionState;
    public int connectionType;
    public String connectionUrl;
    public String error;
    public int errorCode;
    public boolean privateProtocolEnabled;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LJJIII() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.channelId);
            jSONObject.put("type", this.connectionType);
            jSONObject.put("state", this.connectionState);
            jSONObject.put("url", this.connectionUrl);
            jSONObject.put("channel_type", this.channelType);
            jSONObject.put("error", this.error);
            jSONObject.put("error_code", this.errorCode);
            if (this.privateProtocolEnabled) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("private_protocol_enable", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocketState{connectionType=");
        LIZ.append(this.connectionType);
        LIZ.append(", connectionState=");
        LIZ.append(this.connectionState);
        LIZ.append(", connectionUrl='");
        Q89.LIZIZ(LIZ, this.connectionUrl, '\'', ", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", channelType=");
        LIZ.append(this.channelType);
        LIZ.append(", error='");
        Q89.LIZIZ(LIZ, this.error, '\'', ", privateProtocol=");
        LIZ.append(this.privateProtocolEnabled);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public SocketState() {
    }

    public SocketState(Parcel parcel) {
        boolean z;
        this.connectionType = parcel.readInt();
        this.connectionState = parcel.readInt();
        this.connectionUrl = parcel.readString();
        this.channelId = parcel.readInt();
        this.channelType = parcel.readInt();
        this.error = parcel.readString();
        this.errorCode = parcel.readInt();
        if (parcel.readInt() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.privateProtocolEnabled = z;
    }

    public static SocketState LIZ(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.channelId = jSONObject.optInt("channel_id", LiveLayoutPreloadThreadPriority.DEFAULT);
        socketState.connectionType = jSONObject.optInt("type", -1);
        socketState.connectionState = jSONObject.optInt("state", -1);
        socketState.connectionUrl = jSONObject.optString("url", "");
        socketState.channelType = jSONObject.optInt("channel_type");
        socketState.error = jSONObject.optString("error", "");
        socketState.errorCode = jSONObject.optInt("error_code");
        boolean z = false;
        if (jSONObject.optInt("private_protocol_enable", 0) > 0) {
            z = true;
        }
        socketState.privateProtocolEnabled = z;
        return socketState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectionType);
        parcel.writeInt(this.connectionState);
        parcel.writeString(this.connectionUrl);
        parcel.writeInt(this.channelId);
        parcel.writeInt(this.channelType);
        parcel.writeString(this.error);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.privateProtocolEnabled ? 1 : 0);
    }
}
