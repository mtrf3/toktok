package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NSx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59399NSx extends AbstractViewOnClickListenerC59394NSs {
    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZJ() {
        NativeCardInfo nativeCardInfo;
        AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View findViewById = LIZ(R.layout.bjw, this.LJLIL).findViewById(R.id.us);
            o.LJIIIIZZ(findViewById, "webLayout.findViewById(R.id.ad_web_image)");
            C62846OlW c62846OlW = (C62846OlW) findViewById;
            c62846OlW.setVisibility(0);
            C78765Uvh.LJFF(c62846OlW, nativeCardInfo.image);
            C16880lQ.LJJJJJL(c62846OlW, this);
        }
    }

    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZLLL(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.us) {
            return;
        }
        this.LJLJJI.LIZ(19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59399NSx(LinearLayout feedAdLayout, NQD nqd) {
        super(feedAdLayout, nqd);
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
    }
}
