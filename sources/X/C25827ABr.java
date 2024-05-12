package X;

import android.view.View;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.ABr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25827ABr extends AER {
    public final String LJZI;
    public final boolean LJZL;
    public final boolean LL;
    public final View.OnClickListener LLD;
    public final int LLF;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJZI.hashCode() * 31;
        boolean z = this.LJZL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        if (!this.LL) {
            i = 0;
        }
        int i4 = (i3 + i) * 31;
        View.OnClickListener onClickListener = this.LLD;
        if (onClickListener == null) {
            hashCode = 0;
        } else {
            hashCode = onClickListener.hashCode();
        }
        return ((i4 + hashCode) * 31) + this.LLF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadButtonItem(title=");
        LIZ.append(this.LJZI);
        LIZ.append(", blockEnd=");
        LIZ.append(this.LJZL);
        LIZ.append(", blockBegin=");
        LIZ.append(this.LL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LLD);
        LIZ.append(", textRes=");
        return b0.LIZJ(LIZ, this.LLF, ')', LIZ);
    }

    @Override // X.AER
    public final boolean LIZJ() {
        return this.LL;
    }

    @Override // X.AER
    public final boolean LJ() {
        return this.LJZL;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LJZI;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25827ABr)) {
            return false;
        }
        C25827ABr c25827ABr = (C25827ABr) obj;
        if (o.LJ(this.LJZI, c25827ABr.LJZI) && this.LJZL == c25827ABr.LJZL && this.LL == c25827ABr.LL && o.LJ(this.LLD, c25827ABr.LLD) && this.LLF == c25827ABr.LLF) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C25827ABr(View.OnClickListener onClickListener, int i) {
        this("", false, false, onClickListener, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25827ABr(String title, boolean z, boolean z2, View.OnClickListener onClickListener, int i) {
        super(title, null, null, false, false, null, false, false, null, null, null, z2, z, 10238);
        o.LJIIIZ(title, "title");
        this.LJZI = title;
        this.LJZL = z;
        this.LL = z2;
        this.LLD = onClickListener;
        this.LLF = i;
    }
}
