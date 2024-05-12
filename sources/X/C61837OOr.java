package X;

import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.OOr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61837OOr implements InterfaceC63764P0u {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        C36746EbW.LIZ(4, "onAppBackground");
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        C36746EbW.LIZ(4, "onAppForeground");
        if (o.LJ(this.LJLIL, "ordersubmit") || o.LJ(this.LJLIL, "orderdetail")) {
            C3QO c3qo = new C3QO(this.LJLILLLLZI, new C61838OOs(this.LJLIL));
            System.currentTimeMillis();
            c3qo.LIZLLL.sendEmptyMessage(1);
            c3qo.LIZLLL.sendEmptyMessageDelayed(2, 5000L);
        }
        ActivityStack.removeAppBackGroundListener(this);
        C61836OOq.LIZ = null;
    }

    public C61837OOr(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
