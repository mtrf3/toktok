package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NSv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59397NSv extends AbstractViewOnClickListenerC59394NSs {
    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZJ() {
        NativeCardInfo nativeCardInfo;
        AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View LIZ = LIZ(R.layout.bjv, this.LJLIL);
            View findViewById = LIZ.findViewById(R.id.rz);
            o.LJIIIIZZ(findViewById, "shopLayout.findViewById(R.id.ad_image)");
            C62846OlW c62846OlW = (C62846OlW) findViewById;
            if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                c62846OlW.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIIJ);
                C78765Uvh.LJIIIIZZ(c62846OlW, C78769Uvl.LIZ(R.drawable.b3y));
            } else {
                c62846OlW.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJJLZIJ);
                C78765Uvh.LJIIIZ(c62846OlW, nativeCardInfo.imageUrl, -1, -1);
            }
            C16880lQ.LJJJJJL(c62846OlW, this);
            View findViewById2 = LIZ.findViewById(R.id.ue);
            o.LJIIIIZZ(findViewById2, "shopLayout.findViewById(R.id.ad_title)");
            TextView textView = (TextView) findViewById2;
            if (TextUtils.isEmpty(nativeCardInfo.title)) {
                textView.setVisibility(8);
            } else {
                textView.setText(nativeCardInfo.title);
            }
            View findViewById3 = LIZ.findViewById(R.id.s8);
            o.LJIIIIZZ(findViewById3, "shopLayout.findViewById(R.id.ad_label)");
            TextView textView2 = (TextView) findViewById3;
            if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(nativeCardInfo.featureLabel);
            }
            C16880lQ.LJIIZILJ((LinearLayout) LIZ.findViewById(R.id.uf), this);
            View findViewById4 = LIZ.findViewById(R.id.sn);
            o.LJIIIIZZ(findViewById4, "shopLayout.findViewById(R.id.ad_like_layout)");
            LinearLayout linearLayout = (LinearLayout) findViewById4;
            View findViewById5 = LIZ.findViewById(R.id.tt);
            o.LJIIIIZZ(findViewById5, "shopLayout.findViewById(R.id.ad_rating_view)");
            C227098vh c227098vh = (C227098vh) findViewById5;
            View findViewById6 = LIZ.findViewById(R.id.q6);
            o.LJIIIIZZ(findViewById6, "shopLayout.findViewById(R.id.ad_app_use_number)");
            TextView textView3 = (TextView) findViewById6;
            int i = nativeCardInfo.feedbackRate;
            if (i < 80) {
                linearLayout.setVisibility(8);
            } else if (i < 90) {
                c227098vh.setRatingProgress(4.0f);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(nativeCardInfo.feedbackRate);
                LIZ2.append(this.LJLILLLLZI.getString(R.string.gsb));
                textView3.setText(X1D.LIZIZ(LIZ2));
            } else if (i <= 100) {
                c227098vh.setRatingProgress(5.0f);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(nativeCardInfo.feedbackRate);
                LIZ3.append(this.LJLILLLLZI.getString(R.string.gsb));
                textView3.setText(X1D.LIZIZ(LIZ3));
            } else {
                c227098vh.setRatingProgress(5.0f);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("100");
                LIZ4.append(this.LJLILLLLZI.getString(R.string.gsb));
                textView3.setText(X1D.LIZIZ(LIZ4));
            }
            C16880lQ.LJIIZILJ(linearLayout, this);
            View findViewById7 = LIZ.findViewById(R.id.tm);
            o.LJIIIIZZ(findViewById7, "shopLayout.findViewById(R.id.ad_price)");
            View findViewById8 = LIZ.findViewById(R.id.tx);
            o.LJIIIIZZ(findViewById8, "shopLayout.findViewById(R.id.ad_service)");
            ((TextView) findViewById7).setText(nativeCardInfo.originPrice);
            ((TextView) findViewById8).setText(nativeCardInfo.service);
            C16880lQ.LJIIZILJ((LinearLayout) LIZ.findViewById(R.id.tn), this);
        }
    }

    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZLLL(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.rz) {
            this.LJLJJI.LIZ(19);
            return;
        }
        if (valueOf.intValue() == R.id.uf) {
            this.LJLJJI.LIZ(20);
        } else if (valueOf.intValue() == R.id.sn) {
            this.LJLJJI.LIZ(13);
        } else {
            if (valueOf.intValue() != R.id.tn) {
                return;
            }
            this.LJLJJI.LIZ(21);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59397NSv(LinearLayout feedAdLayout, NQD nqd) {
        super(feedAdLayout, nqd);
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
    }
}
