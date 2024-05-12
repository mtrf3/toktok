package com.ss.android.ugc.aweme.creative.model;

import X.H8P;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MirrorMode implements Parcelable {
    public static final Parcelable.Creator<MirrorMode> CREATOR = new H8P();

    @InterfaceC65349Pkn("is_use_mirror")
    public boolean isUseMirror;

    @InterfaceC65349Pkn("last_seg_is_use_mirror")
    public boolean lastSegIsUseMirror;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MirrorMode() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.MirrorMode.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isUseMirror ? 1 : 0);
        out.writeInt(this.lastSegIsUseMirror ? 1 : 0);
    }

    public MirrorMode(boolean z, boolean z2) {
        this.isUseMirror = z;
        this.lastSegIsUseMirror = z2;
    }

    public /* synthetic */ MirrorMode(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
