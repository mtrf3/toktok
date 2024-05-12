package com.ss.android.ugc.aweme.creative.model;

import X.C42136GgG;
import X.C42137GgH;
import X.GPV;
import X.GX2;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowsShootModel implements Parcelable {

    @GPV
    public String backAudioPath;

    @GPV
    public Bitmap backBitmap;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("backImagePath")
    public String backImagePath;

    @GX2
    @InterfaceC65349Pkn("backImageSharePath")
    public String backImageSharePath;

    @GPV
    public String backVideoPath;

    @GPV
    public String firstContentType;

    @GPV
    public boolean firstShootBack;

    @GPV
    public Bitmap frontBitmap;

    @GPV
    public boolean frontImageInLargeWindow;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("frontImagePath")
    public String frontImagePath;

    @GX2
    @InterfaceC65349Pkn("frontImageSharePath")
    public String frontImageSharePath;

    @GPV
    public boolean isFirstStart;

    @InterfaceC65349Pkn("is_normal_publish")
    public boolean isNormalPublish;

    @GPV
    public String lightStatus;

    @GX2
    @InterfaceC65349Pkn("ltrCompileImage")
    public String ltrCompileImage;

    @GPV
    public String multiCameraMode;

    @InterfaceC65349Pkn("nowsExtra")
    public NowsExtra nowsExtra;

    @GX2
    @InterfaceC65349Pkn("rtlCompileImage")
    public String rtlCompileImage;

    @GPV
    public long switchCameraStartTime;

    @GX2
    @InterfaceC65349Pkn("syntheticVideoPath")
    public String syntheticVideoPath;

    @InterfaceC65349Pkn("type")
    public int type;

    @GPV
    public int videoDuration;
    public static final C42137GgH Companion = new C42137GgH();
    public static final Parcelable.Creator<NowsShootModel> CREATOR = new C42136GgG();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowsShootModel() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r12 = 0
            r15 = 8191(0x1fff, float:1.1478E-41)
            r0 = r17
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r1
            r14 = r2
            r16 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.NowsShootModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeString(this.backImagePath);
        out.writeString(this.frontImagePath);
        out.writeString(this.backImageSharePath);
        out.writeString(this.frontImageSharePath);
        this.nowsExtra.writeToParcel(out, i);
        out.writeString(this.ltrCompileImage);
        out.writeString(this.rtlCompileImage);
        out.writeString(this.syntheticVideoPath);
        out.writeString(this.multiCameraMode);
        out.writeInt(this.isFirstStart ? 1 : 0);
        out.writeLong(this.switchCameraStartTime);
        out.writeString(this.firstContentType);
    }

    public NowsShootModel(int i, String str, String str2, String str3, String str4, NowsExtra nowsExtra, String str5, String str6, String str7, String multiCameraMode, boolean z, long j, String str8) {
        o.LJIIIZ(nowsExtra, "nowsExtra");
        o.LJIIIZ(multiCameraMode, "multiCameraMode");
        this.type = i;
        this.backImagePath = str;
        this.frontImagePath = str2;
        this.backImageSharePath = str3;
        this.frontImageSharePath = str4;
        this.nowsExtra = nowsExtra;
        this.ltrCompileImage = str5;
        this.rtlCompileImage = str6;
        this.syntheticVideoPath = str7;
        this.multiCameraMode = multiCameraMode;
        this.isFirstStart = z;
        this.switchCameraStartTime = j;
        this.firstContentType = str8;
        this.lightStatus = "off";
        this.firstShootBack = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ NowsShootModel(int i, String str, String str2, String str3, String str4, NowsExtra nowsExtra, String str5, String str6, String str7, String str8, boolean z, long j, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? new NowsExtra(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2097151, 0 == true ? 1 : 0) : nowsExtra, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) == 0 ? z : false, (i2 & 2048) != 0 ? 0L : j, (i2 & 4096) == 0 ? str9 : null);
    }
}
