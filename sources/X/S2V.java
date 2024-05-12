package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;

/* loaded from: classes13.dex */
public final class S2V extends AbstractC72439Sbr {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ S2N LJLILLLLZI;
    public final /* synthetic */ PopupCardVO LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.element = System.currentTimeMillis();
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.element;
        InterfaceC71446S2g popCardViewCallback = this.LJLILLLLZI.getPopCardViewCallback();
        if (popCardViewCallback != null) {
            popCardViewCallback.LJ(this.LJLJI, this.LJLJJI, this.LJLJJL, false, currentTimeMillis);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL.element;
        InterfaceC71446S2g popCardViewCallback = this.LJLILLLLZI.getPopCardViewCallback();
        if (popCardViewCallback != null) {
            popCardViewCallback.LJ(this.LJLJI, this.LJLJJI, this.LJLJJL, true, currentTimeMillis);
        }
    }

    public S2V(C72242sW c72242sW, S2N s2n, PopupCardVO popupCardVO, boolean z, boolean z2) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = s2n;
        this.LJLJI = popupCardVO;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }
}
