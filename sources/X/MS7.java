package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MS7 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, MQ2, C76800UCe> {
    public static final MS7 LJLIL = new MS7();

    public MS7() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, MQ2 state) {
        UIAssem selectSubscribe = uIAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
        if (LIZLLL != null) {
            if (state == MQ2.NET_ERR) {
                C31811Ce7.LIZJ(LIZLLL, R.string.img);
            } else if (state == MQ2.REQ_ERR) {
                C31811Ce7.LIZJ(LIZLLL, R.string.hfw);
            }
        }
        return C76800UCe.LIZ;
    }
}
