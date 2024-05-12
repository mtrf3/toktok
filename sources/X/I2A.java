package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class I2A extends F9E {
    public final Effect LJLIL;
    public final int LJLILLLLZI;

    public I2A() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ I2A(int i) {
        this(-1, null);
    }

    public I2A(int i, Effect effect) {
        this.LJLIL = effect;
        this.LJLILLLLZI = i;
    }
}
