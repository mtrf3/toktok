package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BZZ extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final BZZ LJLIL = new BZZ();

    public BZZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue() && C7N.LJII().isUsingAccompanimentBusiness()) {
            C7N.LJII().pauseAccompanimentPlay(Boolean.TRUE);
            C30868C9o.LIZJ(R.string.meu);
        }
        return C76800UCe.LIZ;
    }
}
