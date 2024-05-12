package com.ss.android.ugc.aweme.creative.model.record;

import X.C0MT;
import X.GPV;
import X.HM4;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordDowngradeModel implements Parcelable {
    public static final Parcelable.Creator<RecordDowngradeModel> CREATOR = new HM4();

    @InterfaceC65349Pkn("bitrate")
    public Float bitrate;

    @InterfaceC65349Pkn("enter_record_with_prop")
    public boolean enterRecordPageWithProp;

    @InterfaceC65349Pkn("force_recode")
    public boolean forceRecode;

    @GPV
    public boolean hasDowngradeBeforeCameraInit;

    @InterfaceC65349Pkn("resolution")
    public String resolution;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecordDowngradeModel() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r1
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasDowngradeBeforeCameraInit ? 1 : 0);
        out.writeInt(this.enterRecordPageWithProp ? 1 : 0);
        out.writeString(this.resolution);
        Float f = this.bitrate;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        out.writeInt(this.forceRecode ? 1 : 0);
    }

    public RecordDowngradeModel(boolean z, boolean z2, String str, Float f, boolean z3) {
        this.hasDowngradeBeforeCameraInit = z;
        this.enterRecordPageWithProp = z2;
        this.resolution = str;
        this.bitrate = f;
        this.forceRecode = z3;
    }

    public /* synthetic */ RecordDowngradeModel(boolean z, boolean z2, String str, Float f, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) == 0 ? f : null, (i & 16) != 0 ? false : z3);
    }
}
