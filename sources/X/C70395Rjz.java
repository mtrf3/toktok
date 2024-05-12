package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Rjz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70395Rjz implements InterfaceC70769Rq1 {
    public final /* synthetic */ C27583As7 LJLIL;
    public final /* synthetic */ C70468RlA LJLILLLLZI;

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
    }

    public C70395Rjz(C27583As7 c27583As7, C70468RlA c70468RlA) {
        this.LJLIL = c27583As7;
        this.LJLILLLLZI = c70468RlA;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.LIZLLL(th);
        this.LJLILLLLZI.LJLILLLLZI.setVisibility(0);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.LIZJ(c2047581v);
        this.LJLILLLLZI.LJLILLLLZI.setVisibility(8);
    }
}
