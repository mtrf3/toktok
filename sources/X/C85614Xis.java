package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xis, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85614Xis implements InterfaceC16710l9 {
    public final /* synthetic */ TwoStepVerifyEmailFor2046Fragment LIZ;

    public C85614Xis(TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment) {
        this.LIZ = twoStepVerifyEmailFor2046Fragment;
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
