package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MissionImageSticker extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MissionImageSticker> CREATOR = new Parcelable.Creator<MissionImageSticker>() { // from class: X.6bF
        @Override // android.os.Parcelable.Creator
        public final MissionImageSticker createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MissionImageSticker(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MissionImageSticker[] newArray(int i) {
            return new MissionImageSticker[i];
        }
    };

    @InterfaceC65349Pkn("image_height")
    public final int imageHeight;

    @InterfaceC65349Pkn("image_width")
    public final int imageWidth;

    @InterfaceC65349Pkn("logo_image_url")
    public final String logoImageUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MissionImageSticker() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker.<init>():void");
    }

    public static /* synthetic */ MissionImageSticker copy$default(MissionImageSticker missionImageSticker, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = missionImageSticker.logoImageUrl;
        }
        if ((i3 & 2) != 0) {
            i = missionImageSticker.imageWidth;
        }
        if ((i3 & 4) != 0) {
            i2 = missionImageSticker.imageHeight;
        }
        return missionImageSticker.copy(str, i, i2);
    }

    public final MissionImageSticker copy(String logoImageUrl, int i, int i2) {
        o.LJIIIZ(logoImageUrl, "logoImageUrl");
        return new MissionImageSticker(logoImageUrl, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.logoImageUrl, Integer.valueOf(this.imageWidth), Integer.valueOf(this.imageHeight)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.logoImageUrl);
        out.writeInt(this.imageWidth);
        out.writeInt(this.imageHeight);
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public MissionImageSticker(String logoImageUrl, int i, int i2) {
        o.LJIIIZ(logoImageUrl, "logoImageUrl");
        this.logoImageUrl = logoImageUrl;
        this.imageWidth = i;
        this.imageHeight = i2;
    }

    public /* synthetic */ MissionImageSticker(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
