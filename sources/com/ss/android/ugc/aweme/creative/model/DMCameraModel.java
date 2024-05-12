package com.ss.android.ugc.aweme.creative.model;

import X.C43990HOg;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMCameraModel implements Parcelable {
    public static final Parcelable.Creator<DMCameraModel> CREATOR = new C43990HOg();

    @InterfaceC65349Pkn("chat_type")
    public int chatType;

    @InterfaceC65349Pkn("enterDM")
    public String enterDM;

    @InterfaceC65349Pkn("enterFromDM")
    public boolean enterFromDM;

    @InterfaceC65349Pkn("is_video")
    public Boolean isVideo;

    @InterfaceC65349Pkn("maxSelectableVideoDuration")
    public int maxSelectableVideoDuration;

    @InterfaceC65349Pkn("receiverNickname")
    public String receiverNickname;

    @InterfaceC65349Pkn("session_id")
    public String sessionID;

    @GPV
    public boolean shouldDisplayTnsNoticeAlbum;

    @InterfaceC65349Pkn("showShootingTNSFlag")
    public boolean shouldDisplayTnsNoticeShooting;

    @GPV
    public int tnsNoticeRes;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMCameraModel() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r2
            r10 = r1
            r12 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.DMCameraModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeInt(this.enterFromDM ? 1 : 0);
        out.writeString(this.enterDM);
        out.writeInt(this.shouldDisplayTnsNoticeShooting ? 1 : 0);
        out.writeString(this.receiverNickname);
        Boolean bool = this.isVideo;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeInt(this.maxSelectableVideoDuration);
        out.writeInt(this.shouldDisplayTnsNoticeAlbum ? 1 : 0);
        out.writeInt(this.tnsNoticeRes);
        out.writeString(this.sessionID);
        out.writeInt(this.chatType);
    }

    public DMCameraModel(boolean z, String str, boolean z2, String str2, Boolean bool, int i, boolean z3, int i2, String sessionID, int i3) {
        o.LJIIIZ(sessionID, "sessionID");
        this.enterFromDM = z;
        this.enterDM = str;
        this.shouldDisplayTnsNoticeShooting = z2;
        this.receiverNickname = str2;
        this.isVideo = bool;
        this.maxSelectableVideoDuration = i;
        this.shouldDisplayTnsNoticeAlbum = z3;
        this.tnsNoticeRes = i2;
        this.sessionID = sessionID;
        this.chatType = i3;
    }

    public /* synthetic */ DMCameraModel(boolean z, String str, boolean z2, String str2, Boolean bool, int i, boolean z3, int i2, String str3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? null : bool, (i4 & 32) != 0 ? -1 : i, (i4 & 64) != 0 ? false : z3, (i4 & 128) == 0 ? i2 : 0, (i4 & 256) == 0 ? str3 : "", (i4 & 512) == 0 ? i3 : -1);
    }
}
