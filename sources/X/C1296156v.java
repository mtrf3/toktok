package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.56v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1296156v extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final boolean LJLJLJ;
    public final float LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Boolean.valueOf(this.LJLJLJ), Float.valueOf(this.LJLJLLL)};
    }

    public C1296156v(int i, int i2, int i3, int i4, int i5, float f, int i6) {
        boolean z;
        if ((i6 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i6 & 2) != 0 ? 45 : i;
        i2 = (i6 & 4) != 0 ? 45 : i2;
        i3 = (i6 & 8) != 0 ? 0 : i3;
        i4 = (i6 & 16) != 0 ? R.drawable.as0 : i4;
        i5 = (i6 & 32) != 0 ? R.drawable.as0 : i5;
        f = (i6 & 256) != 0 ? 0.3f : f;
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = 0;
        this.LJLJLJ = false;
        this.LJLJLLL = f;
    }
}
