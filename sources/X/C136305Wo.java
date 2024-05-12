package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136305Wo extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final CharSequence LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final OSZ<Float, Float> LJLL;

    public C136305Wo() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL, Boolean.valueOf(this.LJLJLJ), Boolean.valueOf(this.LJLJLLL), this.LJLL};
    }

    public C136305Wo(int i, int i2, int i3, InterfaceC65784Pro interfaceC65784Pro, boolean z, boolean z2, OSZ textMarginStartEnd, int i4) {
        int i5;
        String text;
        i = (i4 & 1) != 0 ? -1 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        if ((i4 & 4) != 0) {
            i5 = R.attr.go;
        } else {
            i5 = R.attr.dj;
        }
        i3 = (i4 & 8) != 0 ? R.attr.go : i3;
        if ((i4 & 32) != 0) {
            text = "";
        } else {
            text = null;
        }
        z = (i4 & 128) != 0 ? true : z;
        z2 = (i4 & 256) != 0 ? false : z2;
        textMarginStartEnd = (i4 & 512) != 0 ? new OSZ(Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(8.0f))), Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(12.0f)))) : textMarginStartEnd;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(textMarginStartEnd, "textMarginStartEnd");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i5;
        this.LJLJJI = i3;
        this.LJLJJL = 0;
        this.LJLJJLL = text;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = textMarginStartEnd;
    }
}
