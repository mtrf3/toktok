package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVT extends C59827Ndv {
    public View LJLIL;
    public final /* synthetic */ BaseCommonBizRootContainer LJLILLLLZI;

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C59297NOz c59297NOz;
        C59297NOz c59297NOz2;
        C59296NOy c59296NOy;
        Integer value;
        C16880lQ.LJLLL(this.LJLIL, (ViewGroup) this.LJLILLLLZI.LJFF().findViewById(R.id.b0w));
        this.LJLIL = null;
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LJLILLLLZI;
        C59304NPg c59304NPg = baseCommonBizRootContainer.LJLL;
        if (c59304NPg == null || (c59297NOz = c59304NPg.LJJIL) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            baseCommonBizRootContainer.LIZLLL();
            return;
        }
        C59304NPg c59304NPg2 = baseCommonBizRootContainer.LJLL;
        if (c59304NPg2 == null || (c59296NOy = c59304NPg2.LJJI) == null || (value = c59296NOy.getValue()) == null || value.intValue() != 1) {
            C59304NPg c59304NPg3 = baseCommonBizRootContainer.LJLL;
            if (c59304NPg3 != null && (c59297NOz2 = c59304NPg3.LJ) != null && o.LJ(c59297NOz2.getValue(), Boolean.TRUE)) {
                return;
            }
            KL2.LJIILLIIL(0, baseCommonBizRootContainer.LJLJJI);
            KL2.LJIILLIIL(0, baseCommonBizRootContainer.LJLJJLL);
            return;
        }
        KL2.LJIILLIIL(8, baseCommonBizRootContainer.LJLJJLL);
        KL2.LJIILLIIL(0, baseCommonBizRootContainer.LJLJJL);
        KL2.LJIILLIIL(0, baseCommonBizRootContainer.LJLJJI);
        C59462NVi c59462NVi = baseCommonBizRootContainer.LJLJJI;
        if (c59462NVi == null) {
            return;
        }
        c59462NVi.setBackgroundColor(0);
        c59462NVi.LIZ(R.id.aj1).setVisibility(8);
        c59462NVi.LIZ(R.id.title).setVisibility(0);
        ((AppCompatImageView) c59462NVi.LIZ(R.id.az6)).setImageResource(R.drawable.a98);
        ((AppCompatImageView) c59462NVi.LIZ(R.id.bfl)).setImageResource(R.drawable.a8y);
        ((AppCompatImageView) c59462NVi.LIZ(R.id.iwu)).setImageResource(R.drawable.a95);
    }

    public NVT(BaseCommonBizRootContainer baseCommonBizRootContainer) {
        this.LJLILLLLZI = baseCommonBizRootContainer;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        C59304NPg c59304NPg;
        Boolean value;
        C59462NVi c59462NVi;
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LJLILLLLZI;
        baseCommonBizRootContainer.getClass();
        if (C59454NVa.LIZIZ(str) || (c59304NPg = baseCommonBizRootContainer.LJLL) == null || (value = c59304NPg.LJJLIIJ.getValue()) == null || !value.booleanValue() || TextUtils.isEmpty(str) || (c59462NVi = baseCommonBizRootContainer.LJLJJI) == null) {
            return;
        }
        o.LJI(str);
        c59462NVi.setTitle(str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.LJLIL = view;
        ((ViewGroup) this.LJLILLLLZI.LJFF().findViewById(R.id.b0w)).addView(this.LJLIL);
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LJLILLLLZI;
        KL2.LJIILLIIL(8, baseCommonBizRootContainer.LJLJJI);
        KL2.LJIILLIIL(8, baseCommonBizRootContainer.LJLJJLL);
    }
}
