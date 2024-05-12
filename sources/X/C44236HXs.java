package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.HXs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44236HXs extends F9E {
    public final Effect LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public C44236HXs() {
        this(null, 0, 0, false, false, 63);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public C44236HXs(Effect effect, int i, int i2, boolean z, boolean z2, int i3) {
        effect = (i3 & 1) != 0 ? null : effect;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? -1 : i2;
        z = (i3 & 8) != 0 ? true : z;
        z2 = (i3 & 16) != 0 ? false : z2;
        this.LJLIL = effect;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = null;
    }
}
