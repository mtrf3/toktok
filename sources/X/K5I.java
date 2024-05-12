package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* loaded from: classes9.dex */
public final class K5I extends KL6 {
    public final /* synthetic */ BaseDiscoverAndSearchFragmentNew LJLILLLLZI;

    public K5I(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        this.LJLILLLLZI = baseDiscoverAndSearchFragmentNew;
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        this.LJLILLLLZI.sm();
        Z9N z9n = Z9N.LIZIZ;
        z9n.LIZ.LLLIIII(this.LJLILLLLZI.LL.longValue(), "normal_search", false);
    }

    @Override // X.KL6, X.KL7, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        this.LJLILLLLZI.LL = Long.valueOf(System.currentTimeMillis());
        if (motionEvent.getAction() == 0) {
            BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = this.LJLILLLLZI;
            baseDiscoverAndSearchFragmentNew.getClass();
            if (C50541JsX.LIZ().enableNormal) {
                String obj = baseDiscoverAndSearchFragmentNew.LJLJJL.getText().toString();
                String charSequence = baseDiscoverAndSearchFragmentNew.LJLJJL.getHint().toString();
                if (TextUtils.isEmpty(obj) && !TextUtils.isEmpty(charSequence) && !baseDiscoverAndSearchFragmentNew.dm(charSequence)) {
                    z = true;
                    obj = charSequence;
                } else {
                    z = false;
                }
                String trim = obj.trim();
                if (!TextUtils.isEmpty(trim)) {
                    SearchResultParam Pl = baseDiscoverAndSearchFragmentNew.Pl(trim, z);
                    Pl.setPrefetchId(C49924Jia.LIZIZ());
                    Pl.setPrefetchType("press");
                    Z9N z9n = Z9N.LIZIZ;
                    z9n.LIZ.LJLLI(baseDiscoverAndSearchFragmentNew.mo49getActivity(), Pl);
                }
            }
        }
        return super.onTouch(view, motionEvent);
    }
}
