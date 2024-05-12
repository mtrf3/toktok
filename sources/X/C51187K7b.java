package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;

/* renamed from: X.K7b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51187K7b extends KL6 {
    public final /* synthetic */ EcBaseDiscoverAndSearchFragmentNew LJLILLLLZI;

    public C51187K7b(EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew) {
        this.LJLILLLLZI = ecBaseDiscoverAndSearchFragmentNew;
    }

    @Override // X.KL6
    public final void LIZLLL(View view) {
        EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = this.LJLILLLLZI;
        T5T t5t = ecBaseDiscoverAndSearchFragmentNew.LJLJI;
        if (t5t == null) {
            return;
        }
        ecBaseDiscoverAndSearchFragmentNew.Ol(t5t.getText().toString());
        ecBaseDiscoverAndSearchFragmentNew.nm("click_search");
    }
}
