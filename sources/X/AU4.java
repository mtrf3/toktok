package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* loaded from: classes5.dex */
public final class AU4 implements InterfaceC70769Rq1 {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<APY, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ AU5 LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.element = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AU4(C72242sW c72242sW, InterfaceC88472Yns<? super APY, C76800UCe> interfaceC88472Yns, AU5 au5) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = au5;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        InterfaceC88472Yns<APY, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        String str2 = null;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new APY(null, false, this.LJLJI));
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.element;
        AU5 au5 = this.LJLJI;
        if (au5 != null) {
            str = au5.getString();
        } else {
            str = null;
        }
        if (th != null) {
            str2 = th.getMessage();
        }
        C74512wB.LIZ(currentTimeMillis, str, str2, false);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        String str;
        InterfaceC88472Yns<APY, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new APY(animatable, true, this.LJLJI));
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.element;
        AU5 au5 = this.LJLJI;
        if (au5 != null) {
            str = au5.getString();
        } else {
            str = null;
        }
        C74512wB.LIZ(currentTimeMillis, str, null, true);
    }
}
