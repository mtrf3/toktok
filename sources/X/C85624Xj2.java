package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xj2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85624Xj2 implements InterfaceC228778yP {
    public final /* synthetic */ VerifyPasswordFragment LJLIL;

    @Override // X.InterfaceC228778yP
    public final void onHide() {
        View next = this.LJLIL._$_findCachedViewById(R.id.h0u);
        o.LJIIIIZZ(next, "next");
        next.setVisibility(0);
    }

    @Override // X.InterfaceC228778yP
    public final void onShow() {
        View next = this.LJLIL._$_findCachedViewById(R.id.h0u);
        o.LJIIIIZZ(next, "next");
        next.setVisibility(8);
    }

    public C85624Xj2(VerifyPasswordFragment verifyPasswordFragment) {
        this.LJLIL = verifyPasswordFragment;
    }
}
