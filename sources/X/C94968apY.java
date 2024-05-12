package X;

import android.view.View;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.apY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94968apY extends AER {
    public final TT2DSPPlatformInfo LJZI;
    public final String LJZL;
    public final C2068389v LL;
    public final View.OnClickListener LLD;
    public final Object LLF;
    public final boolean LLFF;
    public final Integer LLFFF;
    public final AET LLFII;
    public final boolean LLFZ;
    public final String LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final View.OnClickListener LLIIII;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((this.LJZI.hashCode() * 31) + this.LJZL.hashCode()) * 31;
        C2068389v c2068389v = this.LL;
        int i = 0;
        if (c2068389v == null) {
            hashCode = 0;
        } else {
            hashCode = c2068389v.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        View.OnClickListener onClickListener = this.LLD;
        if (onClickListener == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onClickListener.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj = this.LLF;
        if (obj == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LLFF;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        Integer num = this.LLFFF;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int hashCode7 = (((i7 + hashCode4) * 31) + this.LLFII.hashCode()) * 31;
        boolean z2 = this.LLFZ;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode7 + i8) * 31;
        String str = this.LLI;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        boolean z3 = this.LLIFFJFJJ;
        int i11 = z3;
        if (z3 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        if (!this.LLII) {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        View.OnClickListener onClickListener2 = this.LLIIII;
        if (onClickListener2 != null) {
            i = onClickListener2.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        return "DspPlatformItem(dspPlatformInfo=" + this.LJZI + ", title=" + this.LJZL + ", icon=" + this.LL + ", onClickListener=" + this.LLD + ", tag=" + this.LLF + ", visibility=" + this.LLFF + ", label=" + this.LLFFF + ", cellVariant=" + this.LLFII + ", divider=" + this.LLFZ + ", subTitle=" + this.LLI + ", enable=" + this.LLIFFJFJJ + ", loading=" + this.LLII + ", disableClickListener=" + this.LLIIII + ')';
    }

    @Override // X.AER, X.AEC
    public final Object LIZ() {
        return this.LLF;
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLFF;
    }

    @Override // X.AER
    public final AET LJFF() {
        return this.LLFII;
    }

    @Override // X.AER
    public final View.OnClickListener LJI() {
        return this.LLIIII;
    }

    @Override // X.AER
    public final boolean LJII() {
        return this.LLFZ;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LL;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLII;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLI;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LJZL;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94968apY(TT2DSPPlatformInfo tT2DSPPlatformInfo, String title, C2068389v c2068389v, View.OnClickListener onClickListener, Object obj, boolean z, Integer num, AET cellVariant, boolean z2, String str, boolean z3, boolean z4, View.OnClickListener onClickListener2) {
        super(title, null, null, false, false, null, false, false, null, null, null, false, false, 16382);
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = tT2DSPPlatformInfo;
        this.LJZL = title;
        this.LL = c2068389v;
        this.LLD = onClickListener;
        this.LLF = obj;
        this.LLFF = z;
        this.LLFFF = num;
        this.LLFII = cellVariant;
        this.LLFZ = z2;
        this.LLI = str;
        this.LLIFFJFJJ = z3;
        this.LLII = z4;
        this.LLIIII = onClickListener2;
    }
}
