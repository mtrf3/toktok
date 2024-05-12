package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.BgWidget;
import defpackage.e1;
import java.util.List;

/* renamed from: X.UwA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78794UwA implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ UrlModel LJLJI;
    public final /* synthetic */ BgWidget LJLJJI;
    public final /* synthetic */ UrlModel LJLJJL;

    public RunnableC78794UwA(int i, int i2, UrlModel urlModel, BgWidget bgWidget, UrlModel urlModel2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = urlModel;
        this.LJLJJI = bgWidget;
        this.LJLJJL = urlModel2;
    }

    public final void LIZ() {
        float f = (this.LJLIL * 1.0f) / this.LJLILLLLZI;
        List<String> list = null;
        if (e1.LIZ(31744, "live_preview_background_image_setting", true, false) && this.LJLJI != null) {
            C78765Uvh.LJI(this.LJLJJI.LJZ(), this.LJLJI, this.LJLIL, this.LJLILLLLZI, null);
            return;
        }
        if (C53200KuK.LIZ()) {
            BQO LIZ = C15650jR.LIZ();
            UrlModel urlModel = this.LJLJJL;
            if (urlModel != null) {
                list = urlModel.getUrlList();
            }
            C78720Uuy LJIIIIZZ = LIZ.LJIIIIZZ("preview", list);
            LJIIIIZZ.LJIILL = f;
            LJIIIIZZ.LJIILLIIL = 5;
            LJIIIIZZ.LJIJJ = true;
            LJIIIIZZ.LJIIJJI(this.LJLJJI.LJZ());
            return;
        }
        C78765Uvh.LJI(this.LJLJJI.LJZ(), this.LJLJJL, this.LJLIL, this.LJLILLLLZI, C47261Igj.LJIILIIL(f));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
