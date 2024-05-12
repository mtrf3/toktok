package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239779b3 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends C239799b5>, C76800UCe> {
    public static final C239779b3 LJLIL = new C239779b3();

    public C239779b3() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends C239799b5> c43i) {
        Fragment LIZLLL;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends C239799b5> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C239799b5 c239799b5 = (C239799b5) it.LIZ;
        if (c239799b5 != null) {
            if (c239799b5.LJLIL) {
                int i = C240089bY.LIZ[c239799b5.LJLILLLLZI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        Fragment LIZLLL2 = C212428Vi.LIZLLL(selectSubscribe);
                        if (LIZLLL2 != null) {
                            C26045AKb c26045AKb = new C26045AKb(LIZLLL2);
                            c26045AKb.LJIIIZ(LIZLLL2.getString(R.string.jiy));
                            c26045AKb.LJIIJ();
                        }
                    } else {
                        Fragment LIZLLL3 = C212428Vi.LIZLLL(selectSubscribe);
                        if (LIZLLL3 != null) {
                            C26045AKb c26045AKb2 = new C26045AKb(LIZLLL3);
                            c26045AKb2.LJIIIZ(LIZLLL3.getString(R.string.jiz, Integer.valueOf(c239799b5.LJLJI)));
                            c26045AKb2.LJIIJ();
                        }
                    }
                } else {
                    Fragment LIZLLL4 = C212428Vi.LIZLLL(selectSubscribe);
                    if (LIZLLL4 != null) {
                        C31811Ce7.LIZJ(LIZLLL4, R.string.jix);
                    }
                }
            } else {
                int i2 = C240089bY.LIZ[c239799b5.LJLILLLLZI.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3 && (LIZLLL = C212428Vi.LIZLLL(selectSubscribe)) != null) {
                        C26045AKb c26045AKb3 = new C26045AKb(LIZLLL);
                        c26045AKb3.LJIIIZ(LIZLLL.getString(R.string.jj0));
                        c26045AKb3.LJIIJ();
                    }
                } else {
                    Fragment LIZLLL5 = C212428Vi.LIZLLL(selectSubscribe);
                    if (LIZLLL5 != null) {
                        C31811Ce7.LIZJ(LIZLLL5, R.string.jj1);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
