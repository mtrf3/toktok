package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;

/* loaded from: classes9.dex */
public final class KT2 extends AbstractC72439Sbr {
    public final /* synthetic */ SmartImageView LJLIL;
    public final /* synthetic */ SearchFeedbackOptionalFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public KT2(SmartImageView smartImageView, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, String str) {
        this.LJLIL = smartImageView;
        this.LJLILLLLZI = searchFeedbackOptionalFragment;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLILLLLZI.vl(this.LJLIL, this.LJLJI);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.setBackground(null);
    }
}
