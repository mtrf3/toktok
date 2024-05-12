package X;

import X.C51031K1b;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.common.presenter.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b1;

/* renamed from: X.Jqb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50421Jqb<MODEL extends a, PRESENTER extends C51031K1b<MODEL>> implements InterfaceC51679KPz {
    public MODEL mModel;
    public PRESENTER mPresenter;

    @Override // X.InterfaceC51679KPz
    public /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public int getPageType(int i) {
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public boolean init(Fragment fragment) {
        return true;
    }

    public boolean checkSelfInvalid() {
        if (this.mPresenter == null || this.mModel == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public boolean isDataEmpty() {
        MODEL model = this.mModel;
        if (model == null) {
            return true;
        }
        return model.isDataEmpty();
    }

    @Override // X.InterfaceC51679KPz
    public boolean isLoading() {
        return this.mPresenter.LJJIFFI();
    }

    @Override // X.InterfaceC51679KPz
    public void unInit() {
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LIZIZ();
            this.mPresenter.LJJII();
        }
    }

    @Override // X.InterfaceC51679KPz
    public Object getViewModel() {
        return this.mModel;
    }

    @Override // X.InterfaceC51679KPz
    public void bindView(KQA kqa) {
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LJJI(kqa);
            this.mPresenter.LJJIII(kqa);
            this.mPresenter.LJJ(this.mModel);
        }
    }

    @Override // X.InterfaceC51679KPz
    public boolean deleteItem(String str) {
        String str2;
        String name;
        Aweme LJIJJLI = C78996UzQ.LJIJJLI(str);
        PRESENTER presenter = this.mPresenter;
        if (presenter == null) {
            return false;
        }
        boolean LJJIIJ = presenter.LJJIIJ(LJIJJLI);
        StringBuilder LIZJ = b1.LIZJ("delete aweme: ", str);
        if (LJJIIJ) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        LIZJ.append(str2);
        T t = this.mPresenter.LJLIL;
        if (t == 0) {
            name = "null";
        } else {
            name = t.getClass().getName();
        }
        C1FJ.LJFF(LIZJ, name, LIZJ, 6, "DeleteAweme");
        return LJJIIJ;
    }

    @Override // X.InterfaceC51679KPz
    public void request(int i, M89 m89, int i2, boolean z) {
        PRESENTER presenter = this.mPresenter;
        if (presenter != null) {
            presenter.LJIILL(Integer.valueOf(i));
        }
    }
}
