package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.56t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1295956t extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;
    public final int LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), this.LJLJL, Integer.valueOf(this.LJLJLJ)};
    }

    public C1295956t(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        String selectText;
        z = (i4 & 1) != 0 ? true : z;
        i = (i4 & 2) != 0 ? 49 : i;
        i2 = (i4 & 4) != 0 ? 49 : i2;
        i3 = (i4 & 8) != 0 ? R.drawable.arz : i3;
        if ((i4 & 16) != 0) {
            i5 = R.drawable.as4;
        } else {
            i5 = 0;
        }
        if ((i4 & 32) != 0) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        if ((i4 & 64) != 0) {
            selectText = "";
        } else {
            selectText = null;
        }
        int i7 = (i4 & 128) != 0 ? R.color.yi : 0;
        o.LJIIIZ(selectText, "selectText");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i5;
        this.LJLJJLL = i6;
        this.LJLJL = selectText;
        this.LJLJLJ = i7;
    }
}
