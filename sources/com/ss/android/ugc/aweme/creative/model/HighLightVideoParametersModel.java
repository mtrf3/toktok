package com.ss.android.ugc.aweme.creative.model;

import X.HCS;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HighLightVideoParametersModel implements Parcelable {
    public static final Parcelable.Creator<HighLightVideoParametersModel> CREATOR = new HCS();

    @InterfaceC65349Pkn("video_fragment_id")
    public String fragmentId;

    @InterfaceC65349Pkn("video_fragment_type")
    public String fragmentType;

    @InterfaceC65349Pkn("is_ecom")
    public boolean isEcom;

    @InterfaceC65349Pkn("landing_to_record")
    public boolean landingToRecord;

    @InterfaceC65349Pkn("replay_title")
    public String replayTitle;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("suggest_video_toast")
    public String stickerHint;

    @InterfaceC65349Pkn("suggest_video_title")
    public String stickerText;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HighLightVideoParametersModel() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r7 = r1
            r8 = r5
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.fragmentId);
        out.writeString(this.fragmentType);
        out.writeString(this.roomId);
        out.writeString(this.replayTitle);
        out.writeInt(this.isEcom ? 1 : 0);
        out.writeString(this.stickerText);
        out.writeString(this.stickerHint);
        out.writeInt(this.landingToRecord ? 1 : 0);
    }

    public HighLightVideoParametersModel(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        this.fragmentId = str;
        this.fragmentType = str2;
        this.roomId = str3;
        this.replayTitle = str4;
        this.isEcom = z;
        this.stickerText = str5;
        this.stickerHint = str6;
        this.landingToRecord = z2;
    }

    public /* synthetic */ HighLightVideoParametersModel(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) == 0 ? z2 : false);
    }
}
