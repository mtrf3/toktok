package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a1;

/* renamed from: X.8rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C224708rq implements InterfaceC51679KPz {
    public final String LJLIL;
    public final C224478rT LJLILLLLZI = new C224478rT(1);
    public final C50908JyS LJLJI = new C50908JyS();

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public int getPageType(int i) {
        return i + 3000;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        if (this.LJLILLLLZI.getData() == null || C79004UzY.LJJIFFI(this.LJLILLLLZI.getData().items)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJI.LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLJI.LIZIZ();
        this.LJLJI.LJJII();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLILLLLZI;
    }

    public C224708rq(String str) {
        String LJ;
        if (TextUtils.isEmpty(str)) {
            LJ = "";
        } else {
            LJ = a1.LJ("[", str, "]");
        }
        this.LJLIL = LJ;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA kqa) {
        C50908JyS c50908JyS = this.LJLJI;
        c50908JyS.LJLILLLLZI = kqa;
        c50908JyS.LJJ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String str) {
        C50908JyS c50908JyS;
        T t;
        Aweme i6 = AwemeService.LIZ().i6(str);
        if (i6 == null) {
            i6 = AwemeService.LIZ().n6(str);
        }
        if (i6 != null && (t = (c50908JyS = this.LJLJI).LJLIL) != 0 && t.getData() != null && ((BatchDetailList) c50908JyS.LJLIL.getData()).items != null) {
            ((BatchDetailList) c50908JyS.LJLIL.getData()).items.remove(i6);
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public void request(int i, M89 m89, int i2, boolean z) {
        this.LJLJI.LJIILL(this.LJLIL, m89.getPushParams(), m89.getEventType());
    }
}
