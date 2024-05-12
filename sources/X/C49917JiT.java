package X;

import X.AbstractC49793JgT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.JiT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49917JiT<T extends AbstractC49793JgT> extends C51031K1b<T> {
    public InterfaceC49928Jie LJLJJL;

    @Override // X.C8BR
    public final void LJJII() {
        T t = this.LJLIL;
        if (t != 0 && (t instanceof AbstractC49793JgT)) {
            ((AbstractC49793JgT) t).LJIIJ(0, "basepresenter new request");
        }
        super.LJJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public void onSuccess() {
        String str;
        GlobalDoodleConfig globalDoodleConfig;
        String str2;
        GlobalDoodleConfig globalDoodleConfig2;
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        boolean z = true;
        if (abstractC51036K1g.mListQueryType == 1) {
            K k = this.LJLILLLLZI;
            if (k instanceof InterfaceC49928Jie) {
                ((InterfaceC49928Jie) k).ta((SearchApiResult) abstractC51036K1g.getData());
            }
        }
        GlobalDoodleConfig globalDoodleConfig3 = ((SearchApiResult) this.LJLIL.getData()).globalDoodleConfig;
        InterfaceC49928Jie interfaceC49928Jie = this.LJLJJL;
        if (interfaceC49928Jie != null) {
            interfaceC49928Jie.oa(globalDoodleConfig3);
            AbstractC51036K1g abstractC51036K1g2 = (AbstractC51036K1g) this.LJLIL;
            if (abstractC51036K1g2.mListQueryType == 1) {
                this.LJLJJL.ua((SearchApiResult) abstractC51036K1g2.getData());
            }
        } else {
            K k2 = this.LJLILLLLZI;
            if (k2 instanceof InterfaceC49928Jie) {
                ((InterfaceC49928Jie) k2).oa(globalDoodleConfig3);
                AbstractC51036K1g abstractC51036K1g3 = (AbstractC51036K1g) this.LJLIL;
                if (abstractC51036K1g3.mListQueryType == 1) {
                    ((InterfaceC49928Jie) this.LJLILLLLZI).ua((SearchApiResult) abstractC51036K1g3.getData());
                }
            }
        }
        super.onSuccess();
        AbstractC51036K1g abstractC51036K1g4 = (AbstractC51036K1g) this.LJLIL;
        if (abstractC51036K1g4.mListQueryType != 1) {
            return;
        }
        K k3 = this.LJLILLLLZI;
        if (k3 instanceof InterfaceC49928Jie) {
            ((InterfaceC49928Jie) k3).va((SearchApiResult) abstractC51036K1g4.getData());
        }
        Object data = this.LJLIL.getData();
        InterfaceC49928Jie interfaceC49928Jie2 = this.LJLJJL;
        QueryCorrectInfo queryCorrectInfo = null;
        if (interfaceC49928Jie2 != null) {
            LJJIIZI(interfaceC49928Jie2);
            if (data instanceof SearchApiResult) {
                this.LJLJJL.qa((SearchApiResult) data);
            }
            InterfaceC49928Jie interfaceC49928Jie3 = this.LJLJJL;
            DynamicPatch dynamicPatch = ((SearchApiResult) this.LJLIL.getData()).dynamicMask;
            if (globalDoodleConfig3 != null) {
                str2 = globalDoodleConfig3.getUseScenario();
            } else {
                str2 = null;
            }
            interfaceC49928Jie3.xa(dynamicPatch, str2);
            InterfaceC49928Jie interfaceC49928Jie4 = this.LJLJJL;
            T t = this.LJLIL.mData;
            if (t != 0) {
                queryCorrectInfo = ((SearchApiResult) t).queryCorrectInfo;
            }
            interfaceC49928Jie4.wa(queryCorrectInfo);
            this.LJLJJL.pa((SearchApiResult) this.LJLIL.getData());
            InterfaceC49928Jie interfaceC49928Jie5 = this.LJLJJL;
            T t2 = this.LJLIL.mData;
            if (t2 == 0 || ((globalDoodleConfig2 = ((SearchApiResult) t2).globalDoodleConfig) != null && globalDoodleConfig2.getDisplayFilterBar() != 1)) {
                z = false;
            }
            interfaceC49928Jie5.ra(z);
            this.LJLJJL.bk();
            return;
        }
        K k4 = this.LJLILLLLZI;
        if (!(k4 instanceof InterfaceC49928Jie)) {
            return;
        }
        LJJIIZI((InterfaceC49928Jie) k4);
        if (data instanceof SearchApiResult) {
            this.LJLJJL.qa((SearchApiResult) data);
        }
        InterfaceC49928Jie interfaceC49928Jie6 = (InterfaceC49928Jie) this.LJLILLLLZI;
        DynamicPatch dynamicPatch2 = ((SearchApiResult) this.LJLIL.getData()).dynamicMask;
        if (globalDoodleConfig3 != null) {
            str = globalDoodleConfig3.getUseScenario();
        } else {
            str = null;
        }
        interfaceC49928Jie6.xa(dynamicPatch2, str);
        InterfaceC49928Jie interfaceC49928Jie7 = (InterfaceC49928Jie) this.LJLILLLLZI;
        T t3 = this.LJLIL.mData;
        if (t3 != 0) {
            queryCorrectInfo = ((SearchApiResult) t3).queryCorrectInfo;
        }
        interfaceC49928Jie7.wa(queryCorrectInfo);
        InterfaceC49928Jie interfaceC49928Jie8 = (InterfaceC49928Jie) this.LJLILLLLZI;
        T t4 = this.LJLIL.mData;
        interfaceC49928Jie8.Pk();
        ((InterfaceC49928Jie) this.LJLILLLLZI).pa((SearchApiResult) this.LJLIL.getData());
        InterfaceC49928Jie interfaceC49928Jie9 = this.LJLJJL;
        T t5 = this.LJLIL.mData;
        if (t5 == 0 || ((globalDoodleConfig = ((SearchApiResult) t5).globalDoodleConfig) != null && globalDoodleConfig.getDisplayFilterBar() != 1)) {
            z = false;
        }
        interfaceC49928Jie9.ra(z);
        ((InterfaceC49928Jie) this.LJLILLLLZI).bk();
    }

    @Override // X.C8BR
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public final void LJJI(InterfaceC223218pR interfaceC223218pR) {
        this.LJLILLLLZI = interfaceC223218pR;
        if (interfaceC223218pR instanceof InterfaceC49928Jie) {
            InterfaceC49928Jie interfaceC49928Jie = (InterfaceC49928Jie) interfaceC223218pR;
            this.LJLJJL = interfaceC49928Jie;
            T t = this.LJLIL;
            if (t != 0 && interfaceC49928Jie != null) {
                ((AbstractC49793JgT) t).LJLJL = interfaceC49928Jie.sa();
            }
        }
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        T t = this.LJLIL;
        if (t != 0) {
            InterfaceC49928Jie interfaceC49928Jie = this.LJLJJL;
            if (interfaceC49928Jie != null) {
                ((AbstractC49793JgT) t).LJLJJI = interfaceC49928Jie.LJLJLLL();
                ((AbstractC49793JgT) this.LJLIL).LJLJJL = this.LJLJJL.il();
                this.LJLJJL.yf(C79004UzY.LJJIFFI(((AbstractC51036K1g) this.LJLIL).getItems()));
            }
            ((AbstractC49793JgT) this.LJLIL).LJIIJ(1, "basePresenter new request");
        }
        InterfaceC49928Jie interfaceC49928Jie2 = this.LJLJJL;
        if (interfaceC49928Jie2 != null) {
            C49921JiX.LJ(interfaceC49928Jie2.LJLJLLL()).LJII();
            C49922JiY.LIZLLL(this.LJLJJL.LJLJLLL()).LIZLLL();
        }
        return super.LJIILL(objArr);
    }

    public void LJIJ(String str) {
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        AbstractC49793JgT abstractC49793JgT = (AbstractC49793JgT) t;
        abstractC49793JgT.getClass();
        o.LJIIIZ(str, "<set-?>");
        abstractC49793JgT.LJLLILLLL = str;
    }

    @Override // X.C8BR
    /* renamed from: LJJIIZ, reason: merged with bridge method [inline-methods] */
    public void LJJ(T t) {
        InterfaceC49928Jie interfaceC49928Jie;
        super.LJJ(t);
        T t2 = this.LJLIL;
        if (t2 != 0 && (interfaceC49928Jie = this.LJLJJL) != null) {
            ((AbstractC49793JgT) t2).LJLJL = interfaceC49928Jie.sa();
        }
    }

    public final void LJJIIZI(InterfaceC49928Jie interfaceC49928Jie) {
        T t = this.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).getItems() != null) {
            C49920JiW LJ = C49921JiX.LJ(interfaceC49928Jie.LJLJLLL());
            LJ.LIZJ(((AbstractC51036K1g) this.LJLIL).getItems().size());
            LJ.LJI();
            LJ.LJFF(((AbstractC49793JgT) this.LJLIL).LJLLI);
            LJ.LJIIJ((SearchApiResult) this.LJLIL.getData());
            LJ.LJIIJJI(0);
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(interfaceC49928Jie.LJLJLLL());
            int size = ((AbstractC51036K1g) this.LJLIL).getItems().size();
            LIZLLL.getClass();
            C49923JiZ c49923JiZ = C49936Jim.LIZ;
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJII = size;
            }
            LIZLLL.LIZJ();
            String str = ((AbstractC49793JgT) this.LJLIL).LJLLI;
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJIIJ = str;
            }
            SearchApiResult searchApiResult = (SearchApiResult) this.LJLIL.getData();
            if (!o.LJ(LIZLLL, c49923JiZ)) {
                LIZLLL.LJI = searchApiResult;
            }
            LIZLLL.LJI(0);
        }
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public void onFailed(Exception exc) {
        C16880lQ.LLLLIIL(exc);
        if (exc instanceof CancellationException) {
            return;
        }
        super.onFailed(exc);
        InterfaceC49928Jie interfaceC49928Jie = this.LJLJJL;
        if (interfaceC49928Jie == null) {
            K k = this.LJLILLLLZI;
            if (!(k instanceof InterfaceC49928Jie) || (interfaceC49928Jie = (InterfaceC49928Jie) k) == null) {
                return;
            }
        }
        C49920JiW LJ = C49921JiX.LJ(interfaceC49928Jie.LJLJLLL());
        LJ.LJI();
        LJ.LJIIJJI(1);
        String message = exc.getMessage();
        if (!o.LJ(LJ, C49567Jcp.LIZ)) {
            LJ.LJIJJ = message;
        }
        C49923JiZ LIZLLL = C49922JiY.LIZLLL(interfaceC49928Jie.LJLJLLL());
        LIZLLL.LIZJ();
        LIZLLL.LJI(1);
        String message2 = exc.getMessage();
        if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
            LIZLLL.LJIIL = message2;
        }
        C49950Jj0.LJ.LIZLLL(exc);
        if (((AbstractC51036K1g) this.LJLIL).mListQueryType == 1) {
            interfaceC49928Jie.qa(null);
            interfaceC49928Jie.wa(null);
        }
        interfaceC49928Jie.ua(null);
        interfaceC49928Jie.xa(null, null);
    }
}
