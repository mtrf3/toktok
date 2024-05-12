package kotlin.jvm.internal;

import X.ARH;
import X.AbstractC65781Prl;
import X.AbstractC91394Ztu;
import X.C34K;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8V4;
import X.C91299ZsN;
import X.C91473ZvB;
import X.C91592Zx6;
import X.C91593Zx7;
import X.InterfaceC88472Yns;
import X.InterfaceC91288ZsC;
import X.InterfaceC91296ZsK;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.viewpager.DspViewPagerAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes22.dex */
public class IDqS29S0300000_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS29S0300000_29 iDqS29S0300000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS29S0300000_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptPlay((C91299ZsN) iDqS29S0300000_29.l1, (InterfaceC91296ZsK) iDqS29S0300000_29.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS29S0300000_29 iDqS29S0300000_29, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.ihf, new C91592Zx6((Context) iDqS29S0300000_29.l0, (InterfaceC91296ZsK) iDqS29S0300000_29.l1, (C91473ZvB) iDqS29S0300000_29.l2, "open_resso"));
        buttonGroup.LJI(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS29S0300000_29 iDqS29S0300000_29, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.igu, new C91593Zx7((Context) iDqS29S0300000_29.l0, (InterfaceC91296ZsK) iDqS29S0300000_29.l1, (C91473ZvB) iDqS29S0300000_29.l2, "download_resso"));
        buttonGroup.LJI(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS29S0300000_29 iDqS29S0300000_29, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(DspViewPagerAssem.class);
        uiContentAssem.LJIIIIZZ = new DspViewPagerAssem();
        Assembler assembler = (Assembler) iDqS29S0300000_29.l0;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDqS29S0300000_29.l1;
        assembler.mv0(basePlayerFragment, new IDqS173S0200000_29((AbstractC91394Ztu) iDqS29S0300000_29.l2, basePlayerFragment, 17));
        uiContentAssem.LJII = ((BasePlayerFragment) iDqS29S0300000_29.l1).LJLJJL;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS29S0300000_29(C34K c34k, C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = c91299ZsN;
        this.l2 = interfaceC91296ZsK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS29S0300000_29(Context context, InterfaceC91296ZsK interfaceC91296ZsK, C91473ZvB c91473ZvB, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = interfaceC91296ZsK;
        this.l2 = c91473ZvB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS29S0300000_29(Assembler assembler, BasePlayerFragment basePlayerFragment, AbstractC91394Ztu abstractC91394Ztu, int i) {
        super(1);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = basePlayerFragment;
        this.l2 = abstractC91394Ztu;
    }
}
