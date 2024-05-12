package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.ui.CountryListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.MusicClassDetailFragment;

/* loaded from: classes8.dex */
public final /* synthetic */ class GBI implements GBJ, InterfaceC85026XYo {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC85026XYo
    public final void LIZ() {
        ((MusicClassDetailFragment) this.LJLIL).LJIIJJI();
    }

    public /* synthetic */ GBI(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.GBJ
    public final void LIZIZ(String str) {
        CountryListActivity countryListActivity = (CountryListActivity) this.LJLIL;
        for (int i = 0; i < countryListActivity.LJLJI.size(); i++) {
            if (TextUtils.equals(((C86804Y4y) ListProtector.get(countryListActivity.LJLJI, i)).LJLILLLLZI, str)) {
                ((LinearLayoutManager) countryListActivity.LJLIL.getLayoutManager()).LJFF(i, 0);
                return;
            }
        }
    }
}
