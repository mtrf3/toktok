package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import X.H9S;
import X.HH1;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetExtraInfo extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<DuetExtraInfo> CREATOR = new H9S();

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("duet_audio_path")
    public final String duetAudioPath;

    @InterfaceC65349Pkn("duet_layout_direction")
    public final int duetLayoutDirection;

    @InterfaceC65349Pkn("duet_layout_mode")
    public final String duetLayoutMode;

    @InterfaceC65349Pkn("duet_video_height")
    public final int duetVideoHeight;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("duet_video_path")
    public final String duetVideoPath;

    @InterfaceC65349Pkn("duet_video_width")
    public final int duetVideoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuetExtraInfo() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r3
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.DuetExtraInfo.<init>():void");
    }

    public static /* synthetic */ DuetExtraInfo copy$default(DuetExtraInfo duetExtraInfo, String str, String str2, int i, int i2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = duetExtraInfo.duetVideoPath;
        }
        if ((i4 & 2) != 0) {
            str2 = duetExtraInfo.duetAudioPath;
        }
        if ((i4 & 4) != 0) {
            i = duetExtraInfo.duetVideoWidth;
        }
        if ((i4 & 8) != 0) {
            i2 = duetExtraInfo.duetVideoHeight;
        }
        if ((i4 & 16) != 0) {
            str3 = duetExtraInfo.duetLayoutMode;
        }
        if ((i4 & 32) != 0) {
            i3 = duetExtraInfo.duetLayoutDirection;
        }
        return duetExtraInfo.copy(str, str2, i, i2, str3, i3);
    }

    public final DuetExtraInfo copy(String duetVideoPath, String duetAudioPath, int i, int i2, String duetLayoutMode, int i3) {
        o.LJIIIZ(duetVideoPath, "duetVideoPath");
        o.LJIIIZ(duetAudioPath, "duetAudioPath");
        o.LJIIIZ(duetLayoutMode, "duetLayoutMode");
        return new DuetExtraInfo(duetVideoPath, duetAudioPath, i, i2, duetLayoutMode, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.duetVideoPath, this.duetAudioPath, Integer.valueOf(this.duetVideoWidth), Integer.valueOf(this.duetVideoHeight), this.duetLayoutMode, Integer.valueOf(this.duetLayoutDirection)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.duetVideoPath);
        out.writeString(this.duetAudioPath);
        out.writeInt(this.duetVideoWidth);
        out.writeInt(this.duetVideoHeight);
        out.writeString(this.duetLayoutMode);
        out.writeInt(this.duetLayoutDirection);
    }

    public final String getDuetAudioPath() {
        return this.duetAudioPath;
    }

    public final int getDuetLayoutDirection() {
        return this.duetLayoutDirection;
    }

    public final String getDuetLayoutMode() {
        return this.duetLayoutMode;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final String getDuetVideoPath() {
        return this.duetVideoPath;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public DuetExtraInfo(String str, String str2, int i, int i2, String str3, int i3) {
        HH1.LIZ(str, "duetVideoPath", str2, "duetAudioPath", str3, "duetLayoutMode");
        this.duetVideoPath = str;
        this.duetAudioPath = str2;
        this.duetVideoWidth = i;
        this.duetVideoHeight = i2;
        this.duetLayoutMode = str3;
        this.duetLayoutDirection = i3;
    }

    public /* synthetic */ DuetExtraInfo(String str, String str2, int i, int i2, String str3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? str3 : "", (i4 & 32) != 0 ? 0 : i3);
    }
}
