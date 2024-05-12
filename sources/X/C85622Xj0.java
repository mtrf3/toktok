package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xj0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85622Xj0 implements InterfaceC16710l9 {
    public final /* synthetic */ VerifyPasswordFragment LIZ;

    public C85622Xj0(VerifyPasswordFragment verifyPasswordFragment) {
        this.LIZ = verifyPasswordFragment;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        if (c16800lI.LJII(8)) {
            View next = this.LIZ._$_findCachedViewById(R.id.h0u);
            o.LJIIIIZZ(next, "next");
            next.setVisibility(8);
        } else {
            View next2 = this.LIZ._$_findCachedViewById(R.id.h0u);
            o.LJIIIIZZ(next2, "next");
            next2.setVisibility(0);
        }
        return c16800lI;
    }
}
