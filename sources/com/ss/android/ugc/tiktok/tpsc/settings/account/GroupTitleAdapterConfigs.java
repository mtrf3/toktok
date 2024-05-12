package com.ss.android.ugc.tiktok.tpsc.settings.account;

import X.C69894Rbu;
import X.EnumC69895Rbv;
import X.F9E;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GroupTitleAdapterConfigs extends F9E implements Parcelable {
    public static final Parcelable.Creator<GroupTitleAdapterConfigs> CREATOR = new C69894Rbu();
    public final EnumC69895Rbv style;
    public final List<Parcelable> subAdapter;
    public final int titleRes;
    public final int topPending;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.titleRes), this.style, this.subAdapter, Integer.valueOf(this.topPending)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.titleRes);
        out.writeString(this.style.name());
        Iterator LIZJ = UC7.LIZJ(this.subAdapter, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        out.writeInt(this.topPending);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GroupTitleAdapterConfigs(int r3, java.util.List r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L15
            X.Rbv r1 = X.EnumC69895Rbv.PRIVACY_GROUP_TITLE_ITEM_V2
        L6:
            r0 = r6 & 4
            if (r0 == 0) goto Lc
            X.OQg r4 = X.C61878OQg.INSTANCE
        Lc:
            r0 = r6 & 8
            if (r0 == 0) goto L11
            r5 = 0
        L11:
            r2.<init>(r3, r1, r4, r5)
            return
        L15:
            r1 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs.<init>(int, java.util.List, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupTitleAdapterConfigs(int i, EnumC69895Rbv style, List<? extends Parcelable> subAdapter, int i2) {
        o.LJIIIZ(style, "style");
        o.LJIIIZ(subAdapter, "subAdapter");
        this.titleRes = i;
        this.style = style;
        this.subAdapter = subAdapter;
        this.topPending = i2;
    }
}
