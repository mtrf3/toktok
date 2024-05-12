package com.ss.android.ugc.aweme.live;

import X.O6V;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveGameDualDeviceActivityArgs implements IRouteArg {
    public static final Parcelable.Creator<LiveGameDualDeviceActivityArgs> CREATOR = new O6V();
    public String roomId;
    public String sourceIp;
    public int sourcePort;
    public int version;
    public int videoHeight;
    public int videoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveGameDualDeviceActivityArgs() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r2
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs.<init>():void");
    }

    public static LiveGameDualDeviceActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("source_ip")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("source_ip"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("source_port")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("source_port"), Integer.class);
            if (num == null) {
                i += 2;
            }
        } else {
            i += 2;
            num = null;
        }
        if (bundle.containsKey("room_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("room_id"), String.class);
        } else {
            i += 4;
            str2 = null;
        }
        if (bundle.containsKey("video_w")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("video_w"), Integer.class);
            if (num2 == null) {
                i += 8;
            }
        } else {
            i += 8;
            num2 = null;
        }
        if (bundle.containsKey("video_h")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("video_h"), Integer.class);
            if (num3 == null) {
                i += 16;
            }
        } else {
            i += 16;
            num3 = null;
        }
        if (!bundle.containsKey("ver") || (num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("ver"), Integer.class)) == null) {
            i += 32;
        }
        return new LiveGameDualDeviceActivityArgs(str, num != null ? num.intValue() : 0, str2, num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0, num4 != null ? num4.intValue() : 0, i, null);
    }

    public static /* synthetic */ LiveGameDualDeviceActivityArgs copy$default(LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs, String str, int i, String str2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = liveGameDualDeviceActivityArgs.sourceIp;
        }
        if ((i5 & 2) != 0) {
            i = liveGameDualDeviceActivityArgs.sourcePort;
        }
        if ((i5 & 4) != 0) {
            str2 = liveGameDualDeviceActivityArgs.roomId;
        }
        if ((i5 & 8) != 0) {
            i2 = liveGameDualDeviceActivityArgs.videoWidth;
        }
        if ((i5 & 16) != 0) {
            i3 = liveGameDualDeviceActivityArgs.videoHeight;
        }
        if ((i5 & 32) != 0) {
            i4 = liveGameDualDeviceActivityArgs.version;
        }
        return liveGameDualDeviceActivityArgs.copy(str, i, str2, i2, i3, i4);
    }

    public final LiveGameDualDeviceActivityArgs copy(String str, int i, String str2, int i2, int i3, int i4) {
        return new LiveGameDualDeviceActivityArgs(str, i, str2, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveGameDualDeviceActivityArgs)) {
            return false;
        }
        LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs = (LiveGameDualDeviceActivityArgs) obj;
        return o.LJ(this.sourceIp, liveGameDualDeviceActivityArgs.sourceIp) && this.sourcePort == liveGameDualDeviceActivityArgs.sourcePort && o.LJ(this.roomId, liveGameDualDeviceActivityArgs.roomId) && this.videoWidth == liveGameDualDeviceActivityArgs.videoWidth && this.videoHeight == liveGameDualDeviceActivityArgs.videoHeight && this.version == liveGameDualDeviceActivityArgs.version;
    }

    public int hashCode() {
        String str = this.sourceIp;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.sourcePort) * 31;
        String str2 = this.roomId;
        return ((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31) + this.version;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sourceIp);
        out.writeInt(this.sourcePort);
        out.writeString(this.roomId);
        out.writeInt(this.videoWidth);
        out.writeInt(this.videoHeight);
        out.writeInt(this.version);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveGameDualDeviceActivityArgs(sourceIp=");
        LIZ.append(this.sourceIp);
        LIZ.append(", sourcePort=");
        LIZ.append(this.sourcePort);
        LIZ.append(", roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", videoWidth=");
        LIZ.append(this.videoWidth);
        LIZ.append(", videoHeight=");
        LIZ.append(this.videoHeight);
        LIZ.append(", version=");
        return b0.LIZJ(LIZ, this.version, ')', LIZ);
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSourceIp() {
        return this.sourceIp;
    }

    public final int getSourcePort() {
        return this.sourcePort;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSourceIp(String str) {
        this.sourceIp = str;
    }

    public final void setSourcePort(int i) {
        this.sourcePort = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public LiveGameDualDeviceActivityArgs(String str, int i, String str2, int i2, int i3, int i4) {
        this.sourceIp = str;
        this.sourcePort = i;
        this.roomId = str2;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.version = i4;
    }

    public /* synthetic */ LiveGameDualDeviceActivityArgs(String str, int i, String str2, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? -1 : i, (i5 & 4) == 0 ? str2 : null, (i5 & 8) != 0 ? -1 : i2, (i5 & 16) == 0 ? i3 : -1, (i5 & 32) != 0 ? 1 : i4);
    }
}
