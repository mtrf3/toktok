package X;

import X.InterfaceC49926Jic;
import Y.ACallableS111S0100000_8;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JiV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49919JiV<TopView extends InterfaceC49926Jic> extends C8BR<C49825Jgz, TopView> {
    @Override // X.C8BR
    public final /* bridge */ /* synthetic */ void LJJ(C49825Jgz c49825Jgz) {
        throw null;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                kq().showLoadMoreLoading();
                return;
            }
            kq().Iw();
            return;
        }
        kq().LJII();
    }

    @Override // X.C8BR
    public final void LJJII() {
        T t = this.LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJIIJ(0, "search grid unBindModel");
            AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
            abstractC51036K1g.getClass();
            List items = abstractC51036K1g.getItems();
            if (items != null) {
                C10K.LIZIZ(new ACallableS111S0100000_8(items, 19), C38995FSd.LIZIZ(), null);
            }
        }
        super.LJJII();
    }

    public final InterfaceC49940Jiq LJJIIJ() {
        return ((InterfaceC49926Jic) this.LJLILLLLZI).uH();
    }

    public final void LJJIIJZLJL() {
        if (this.LJLIL == 0 || this.LJLILLLLZI == 0 || !LJJIIJ().isViewValid()) {
            return;
        }
        InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) this.LJLILLLLZI;
        Object data = this.LJLIL.getData();
        o.LJIIIIZZ(data, "mModel.data");
        interfaceC49926Jic.eI((SearchMixFeedList) data);
    }

    public final void WN() {
        K k;
        if (this.LJLIL == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC49926Jic) k).WN();
    }

    public final void clearCache() {
        InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) this.LJLILLLLZI;
        if (interfaceC49926Jic != null) {
            interfaceC49926Jic.clearCache();
        }
    }

    public final InterfaceC223218pR<?> kq() {
        return ((InterfaceC49926Jic) this.LJLILLLLZI).kq();
    }

    public final void o10() {
        K k;
        if (this.LJLIL == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC49926Jic) k).o10();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        if (this.LJLIL == 0 || this.LJLILLLLZI == 0 || !LJJIIJ().isViewValid()) {
            return;
        }
        ((InterfaceC49926Jic) this.LJLILLLLZI).oa(((SearchApiResult) this.LJLIL.getData()).globalDoodleConfig);
        C49791JgR.LIZLLL(Integer.valueOf(this.LJLILLLLZI.hashCode()), ((SearchMixFeedList) this.LJLIL.getData()).mBacktrace);
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        int i = abstractC51036K1g.mListQueryType;
        if (i != 1) {
            if (i != 4) {
                return;
            }
            ((SearchMixFeedList) abstractC51036K1g.getData()).mItems = ((AbstractC51036K1g) this.LJLIL).getItems();
            InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) this.LJLILLLLZI;
            Object data = this.LJLIL.getData();
            o.LJIIIIZZ(data, "mModel.data");
            interfaceC49926Jic.XJ((SearchMixFeedList) data);
            return;
        }
        if (abstractC51036K1g.getData() == 0) {
            kq().Ne();
            return;
        }
        C49920JiW LJ = C49921JiX.LJ(((InterfaceC49926Jic) this.LJLILLLLZI).jO().LJLJLLL());
        LJ.LIZJ(((AbstractC51036K1g) this.LJLIL).getItems().size());
        LJ.LJFF(((AbstractC49793JgT) this.LJLIL).LJLLI);
        LJ.LJIIJ((K4J) this.LJLIL.getData());
        ((SearchMixFeedList) this.LJLIL.getData()).mItems = ((AbstractC51036K1g) this.LJLIL).getItems();
        InterfaceC49926Jic interfaceC49926Jic2 = (InterfaceC49926Jic) this.LJLILLLLZI;
        Object data2 = this.LJLIL.getData();
        o.LJIIIIZZ(data2, "mModel.data");
        interfaceC49926Jic2.Fs0((SearchMixFeedList) data2);
    }

    public final void qL() {
        K k;
        if (this.LJLIL == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC49926Jic) k).qL();
    }

    public final void tR() {
        K k;
        if (this.LJLIL == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC49926Jic) k).tR();
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return false;
        }
        C49825Jgz c49825Jgz = (C49825Jgz) t;
        String str = (String) C49791JgR.LIZJ().get(Integer.valueOf(k.hashCode()));
        if (str == null) {
            str = "";
        }
        c49825Jgz.LJLZ = str;
        ((AbstractC49793JgT) this.LJLIL).LJIIJ(1, "new Request");
        ((AbstractC49793JgT) this.LJLIL).LJLJJI = ((InterfaceC49926Jic) this.LJLILLLLZI).jO().LJLJLLL();
        ((AbstractC49793JgT) this.LJLIL).LJLJJL = ((InterfaceC49926Jic) this.LJLILLLLZI).jO().il();
        ((InterfaceC49926Jic) this.LJLILLLLZI).jO().yf(C79004UzY.LJJIFFI(((AbstractC51036K1g) this.LJLIL).getItems()));
        return super.LJIILL(Arrays.copyOf(objArr, objArr.length));
    }

    public final void LJIJ(String s) {
        o.LJIIIZ(s, "s");
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        ((AbstractC49793JgT) t).LJLLILLLL = s;
    }

    public final void LJJIII(C49825Jgz c49825Jgz) {
        K k;
        super.LJJ(c49825Jgz);
        T t = this.LJLIL;
        if (t != 0 && (k = this.LJLILLLLZI) != 0) {
            ((AbstractC49793JgT) t).LJLJL = ((InterfaceC49926Jic) k).jO().sa();
        }
        c49825Jgz.onModelBound();
    }

    public final void LJJIIZI(String str) {
        C49825Jgz c49825Jgz = (C49825Jgz) this.LJLIL;
        if (c49825Jgz != null) {
            c49825Jgz.LJZL = str;
        }
    }

    public final void oa(GlobalDoodleConfig globalDoodleConfig) {
        InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) this.LJLILLLLZI;
        if (interfaceC49926Jic != null) {
            interfaceC49926Jic.oa(globalDoodleConfig);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        if (this.LJLIL == 0 || this.LJLILLLLZI == 0 || !LJJIIJ().isViewValid()) {
            return;
        }
        int i = ((AbstractC51036K1g) this.LJLIL).mListQueryType;
        if (i != 1) {
            if (i != 4) {
                return;
            }
            InterfaceC49926Jic interfaceC49926Jic = (InterfaceC49926Jic) this.LJLILLLLZI;
            o.LJI(exc);
            interfaceC49926Jic.L8(exc);
            return;
        }
        InterfaceC49926Jic interfaceC49926Jic2 = (InterfaceC49926Jic) this.LJLILLLLZI;
        o.LJI(exc);
        interfaceC49926Jic2.s6(exc);
    }

    public final void LJJIIZ(int i, Exception exc) {
        K k = this.LJLILLLLZI;
        if (k == 0) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                kq().Ne();
                return;
            } else {
                if (exc == null) {
                    return;
                }
                kq().cb0(exc);
                return;
            }
        }
        ((InterfaceC49926Jic) k).H30(true);
        ((InterfaceC49926Jic) this.LJLILLLLZI).JC(true);
    }
}
