package com.ss.android.ugc.aweme.creative.model;

import X.C36431ERn;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DraftInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<DraftInfo> CREATOR = new C36431ERn();

    @InterfaceC65349Pkn("draftId")
    public final String draftId;

    @InterfaceC65349Pkn("enableSubmission")
    public boolean enableSubmission;

    @InterfaceC65349Pkn("hintStarlingKey")
    public final String hintStarlingKey;

    @InterfaceC65349Pkn("needSubmission")
    public boolean needSubmission;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftInfo() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.DraftInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.draftId, Boolean.valueOf(this.needSubmission), Boolean.valueOf(this.enableSubmission), this.hintStarlingKey};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.draftId);
        out.writeInt(this.needSubmission ? 1 : 0);
        out.writeInt(this.enableSubmission ? 1 : 0);
        out.writeString(this.hintStarlingKey);
    }

    public DraftInfo(String draftId, boolean z, boolean z2, String hintStarlingKey) {
        o.LJIIIZ(draftId, "draftId");
        o.LJIIIZ(hintStarlingKey, "hintStarlingKey");
        this.draftId = draftId;
        this.needSubmission = z;
        this.enableSubmission = z2;
        this.hintStarlingKey = hintStarlingKey;
    }

    public /* synthetic */ DraftInfo(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? "" : str2);
    }
}
