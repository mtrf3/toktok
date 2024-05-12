package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescVideoBrickVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS29S0100100_4;

/* renamed from: X.AtO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27662AtO implements IPR {
    public final /* synthetic */ ProductDescVideoBrickVH LJLIL;

    @Override // X.IPR
    public final void LIZIZ(int i) {
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
    }

    @Override // X.IPR
    public final void LJJJI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
    }

    @Override // X.IPR
    public final void LIZ() {
        Video video;
        IWF iwf;
        Aweme aweme = this.LJLIL.LJLL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            ProductDescVideoBrickVH productDescVideoBrickVH = this.LJLIL;
            if (video.getVideoLength() <= 0) {
                C27606AsU c27606AsU = productDescVideoBrickVH.LJLLILLLL;
                if (c27606AsU != null) {
                    C46580IPw c46580IPw = productDescVideoBrickVH.LJLJLLL;
                    long j = 0;
                    if (c46580IPw != null && (iwf = c46580IPw.LJII) != null) {
                        j = iwf.getDuration();
                    }
                    c27606AsU.LJ = Integer.valueOf((int) (j / 1000));
                }
                C73062Slu c73062Slu = productDescVideoBrickVH.LJLLI;
                if (c73062Slu == null) {
                    return;
                }
                c73062Slu.setParams(productDescVideoBrickVH.LJLLILLLL);
            }
        }
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        ProductDescVideoBrickVH productDescVideoBrickVH = this.LJLIL;
        if (productDescVideoBrickVH.LJLLJ != 0 && !productDescVideoBrickVH.LJLLL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ProductDescVideoBrickVH productDescVideoBrickVH2 = this.LJLIL;
            long j = elapsedRealtime - productDescVideoBrickVH2.LJLLJ;
            InterfaceC71003Rtn interfaceC71003Rtn = (InterfaceC71003Rtn) productDescVideoBrickVH2.LJLJLJ.getValue();
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70950Rsw(), new AqS29S0100100_4(this.LJLIL, j, 3));
            }
            this.LJLIL.LJLLJ = 0L;
        }
        this.LJLIL.LJLLL = false;
    }

    public C27662AtO(ProductDescVideoBrickVH productDescVideoBrickVH) {
        this.LJLIL = productDescVideoBrickVH;
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        if (this.LJLIL.LJLLJ != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ProductDescVideoBrickVH productDescVideoBrickVH = this.LJLIL;
            long j = elapsedRealtime - productDescVideoBrickVH.LJLLJ;
            InterfaceC71003Rtn interfaceC71003Rtn = (InterfaceC71003Rtn) productDescVideoBrickVH.LJLJLJ.getValue();
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70950Rsw(), new AqS29S0100100_4(this.LJLIL, j, 4));
            }
            this.LJLIL.LJLLJ = 0L;
        }
    }
}
