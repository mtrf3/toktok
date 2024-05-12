package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* renamed from: X.Rpy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70766Rpy implements InterfaceC70769Rq1 {
    public final /* synthetic */ C27583As7 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C70756Rpo LJLJI;
    public final /* synthetic */ Image LJLJJI;

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

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        C70765Rpx LJJIJ;
        this.LJLIL.LIZLLL(th);
        if (this.LJLILLLLZI && (LJJIJ = this.LJLJI.LJJIJ()) != null) {
            LJJIJ.LIZ(this.LJLJJI, false, false);
        }
    }

    public C70766Rpy(C27583As7 c27583As7, boolean z, C70756Rpo c70756Rpo, Image image) {
        this.LJLIL = c27583As7;
        this.LJLILLLLZI = z;
        this.LJLJI = c70756Rpo;
        this.LJLJJI = image;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C70765Rpx LJJIJ;
        this.LJLIL.LIZJ(c2047581v);
        if (this.LJLILLLLZI && (LJJIJ = this.LJLJI.LJJIJ()) != null) {
            LJJIJ.LIZ(this.LJLJJI, true, false);
        }
    }
}
