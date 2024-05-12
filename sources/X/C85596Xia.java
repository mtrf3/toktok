package X;

import Y.ACListenerS49S0200000_15;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xia, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C85596Xia extends TBS implements InterfaceC88472Yns<ViewGroup, C76800UCe> {
    public C85596Xia(Object obj) {
        super(1, obj, SignUpOrLoginActivity.class, "setupTnPView", "setupTnPView(Landroid/view/ViewGroup;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup viewGroup) {
        int i;
        int LJFF;
        ViewGroup p0 = viewGroup;
        o.LJIIIZ(p0, "p0");
        SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) this.receiver;
        signUpOrLoginActivity.getClass();
        TuxTextView tuxTextView = new TuxTextView(signUpOrLoginActivity, null, 6, 0);
        tuxTextView.setTuxFont(71);
        Integer LJI = C79045V0n.LJI(R.attr.gv, signUpOrLoginActivity);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        tuxTextView.setTextColor(i);
        tuxTextView.setGravity(17);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        p0.addView(tuxTextView);
        p0.setVisibility(0);
        ACListenerS49S0200000_15 aCListenerS49S0200000_15 = new ACListenerS49S0200000_15(signUpOrLoginActivity, p0, 12);
        ACListenerS49S0200000_15 aCListenerS49S0200000_152 = new ACListenerS49S0200000_15(signUpOrLoginActivity, p0, 13);
        ACListenerS49S0200000_15 aCListenerS49S0200000_153 = new ACListenerS49S0200000_15(signUpOrLoginActivity, p0, 14);
        if (C85837XmT.LJII().equals("TR")) {
            LJFF = R.string.t5f;
        } else {
            LJFF = C85837XmT.LJFF();
        }
        C85837XmT.LIZIZ(signUpOrLoginActivity, tuxTextView, aCListenerS49S0200000_15, aCListenerS49S0200000_152, aCListenerS49S0200000_153, LJFF, AGJ.ACCOUNT_AGE_GATE.getValue());
        return C76800UCe.LIZ;
    }
}
