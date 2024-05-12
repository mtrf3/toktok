package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aJy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93010aJy extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, String, C76800UCe> {
    public static final C93010aJy LJLIL = new C93010aJy();

    public C93010aJy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, String str) {
        View view;
        View view2;
        UIAssem selectSubscribe = uIAssem;
        String str2 = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View view3 = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.gb);
        } else {
            view = null;
        }
        ((TextView) view).setText("");
        View containerView2 = selectSubscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.gb);
        } else {
            view2 = null;
        }
        ((C92630aDq) view2).LJLJJLL = true;
        View containerView3 = selectSubscribe.getContainerView();
        if (containerView3 != null) {
            view3 = containerView3.findViewById(R.id.gf);
        }
        ((SY4) view3).setEnabled(false);
        Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
        if (LIZLLL != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZLLL);
            c26045AKb.LJIIIZ(str2);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
