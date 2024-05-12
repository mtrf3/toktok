package com.ss.android.ugc.aweme.creative.model;

import X.C43524H6i;
import X.C43525H6j;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMMediaModel implements Parcelable {

    @InterfaceC65349Pkn("is_synthesised")
    public final boolean isSynthesised;

    @InterfaceC65349Pkn("output_cover_file")
    public final String outputCoverFile;

    @InterfaceC65349Pkn("photo_file")
    public final String photoFile;

    @InterfaceC65349Pkn("type")
    public final int type;
    public static final C43525H6j Companion = new C43525H6j();
    public static final Parcelable.Creator<DMMediaModel> CREATOR = new C43524H6i();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMMediaModel() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.DMMediaModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeString(this.photoFile);
        out.writeString(this.outputCoverFile);
        out.writeInt(this.isSynthesised ? 1 : 0);
    }

    public DMMediaModel(int i, String photoFile, String outputCoverFile, boolean z) {
        o.LJIIIZ(photoFile, "photoFile");
        o.LJIIIZ(outputCoverFile, "outputCoverFile");
        this.type = i;
        this.photoFile = photoFile;
        this.outputCoverFile = outputCoverFile;
        this.isSynthesised = z;
    }

    public /* synthetic */ DMMediaModel(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z);
    }
}
