package X;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVS extends WebChromeClient {
    public View LIZ;
    public final /* synthetic */ NVO LIZIZ;

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        boolean z;
        C59297NOz c59297NOz;
        C59296NOy c59296NOy;
        Integer value;
        C59297NOz c59297NOz2;
        ViewGroup viewGroup;
        View view = this.LIZIZ.LJLILLLLZI;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.k8p)) != null) {
            C16880lQ.LJLLL(this.LIZ, viewGroup);
        }
        this.LIZ = null;
        NVO nvo = this.LIZIZ;
        NP1 np1 = nvo.LJLJLLL;
        if (np1 != null && (c59297NOz2 = np1.LJJIL) != null) {
            z = o.LJ(c59297NOz2.getValue(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            KL2.LJIILLIIL(8, nvo.LJLJJL);
            KL2.LJIILLIIL(8, nvo.LJLJJI);
            return;
        }
        NP1 np12 = nvo.LJLJLLL;
        if (np12 == null || (c59296NOy = np12.LJJI) == null || (value = c59296NOy.getValue()) == null || value.intValue() != 1) {
            NP1 np13 = nvo.LJLJLLL;
            if (np13 != null && (c59297NOz = np13.LJ) != null && o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
                return;
            }
            KL2.LJIILLIIL(0, nvo.LJLJI);
            KL2.LJIILLIIL(0, nvo.LJLJJL);
            return;
        }
        KL2.LJIILLIIL(8, nvo.LJLJJL);
        KL2.LJIILLIIL(0, nvo.LJLJJI);
        KL2.LJIILLIIL(0, nvo.LJLJI);
    }

    public NVS(NVO nvo) {
        this.LIZIZ = nvo;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup viewGroup;
        this.LIZ = view;
        View view2 = this.LIZIZ.LJLILLLLZI;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.k8p)) != null) {
            viewGroup.addView(this.LIZ);
        }
        NVO nvo = this.LIZIZ;
        KL2.LJIILLIIL(8, nvo.LJLJI);
        KL2.LJIILLIIL(8, nvo.LJLJJL);
    }
}
