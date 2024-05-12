package Y;

import X.AbstractC49155JQx;
import X.AbstractC49709Jf7;
import X.C0A2;
import X.C0A6;
import X.C35810E3q;
import X.C40443Fu3;
import X.C40517FvF;
import X.C49122JPq;
import X.C49153JQv;
import X.C49178JRu;
import X.C49189JSf;
import X.C49341JYb;
import X.C49475JbL;
import X.C49642Je2;
import X.C49956Jj6;
import X.C49957Jj7;
import X.C50222JnO;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51082K3a;
import X.C78855Ux9;
import X.C79004UzY;
import X.C8HS;
import X.IO5;
import X.InterfaceC029909v;
import X.InterfaceC49157JQz;
import X.InterfaceC49349JYj;
import X.InterfaceC49479JbP;
import X.InterfaceC49482JbS;
import X.InterfaceC55057LjB;
import X.JVO;
import X.JVP;
import X.JWC;
import X.JYJ;
import X.K3B;
import X.KGZ;
import X.SYL;
import X.X1D;
import Y.IDrS47S0100000_8;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDrS47S0100000_8 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
            case 3:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 4:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 8:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 9:
                LJIILJJIL$7(this, i, recyclerView);
                return;
            case 10:
                LJIILJJIL$8(this, i, recyclerView);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL$9(this, i, recyclerView);
                return;
            case 12:
                LJIILJJIL$10(this, i, recyclerView);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILJJIL$11(this, i, recyclerView);
                return;
            case 14:
                LJIILJJIL$12(this, i, recyclerView);
                return;
            case 15:
                LJIILJJIL$13(this, i, recyclerView);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJIILJJIL$14(this, i, recyclerView);
                return;
            case 17:
                LJIILJJIL$15(this, i, recyclerView);
                return;
            case 18:
                LJIILJJIL$16(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 5:
            case 7:
            case 8:
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case 17:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 6:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 10:
                LJIILL$6(this, recyclerView, i, i2);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJIILL$7(this, recyclerView, i, i2);
                return;
            case 18:
                LJIILL$8(this, recyclerView, i, i2);
                return;
            case 19:
                LJIILL$9(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS47S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        int i2;
        InterfaceC49157JQz interfaceC49157JQz;
        C49153JQv c49153JQv = (C49153JQv) iDrS47S0100000_8.l0;
        C0A2 layoutManager = c49153JQv.LIZ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).LJLZ == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c49153JQv.LJIIIIZZ.LIZJ(i2);
        C49153JQv c49153JQv2 = (C49153JQv) iDrS47S0100000_8.l0;
        c49153JQv2.LIZLLL = i;
        InterfaceC49157JQz interfaceC49157JQz2 = c49153JQv2.LJI;
        if (interfaceC49157JQz2 != null) {
            interfaceC49157JQz2.LJLZ(i, recyclerView);
        }
        if (i == 0) {
            C49153JQv c49153JQv3 = (C49153JQv) iDrS47S0100000_8.l0;
            if (c49153JQv3.LJ || (c49153JQv3.LJFF && (interfaceC49157JQz = c49153JQv3.LJI) != null && !interfaceC49157JQz.LIZLLL())) {
                ((C49153JQv) iDrS47S0100000_8.l0).LIZJ();
            }
            C49153JQv c49153JQv4 = (C49153JQv) iDrS47S0100000_8.l0;
            c49153JQv4.LJ = false;
            c49153JQv4.LJFF = false;
            return;
        }
        if (i == 2) {
            ((C49153JQv) iDrS47S0100000_8.l0).LJ = true;
        } else {
            if (i != 1) {
                return;
            }
            ((C49153JQv) iDrS47S0100000_8.l0).LJFF = true;
        }
    }

    public static final void LJIILJJIL$1(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((VerticalScrollDoubleColumnProvider) iDrS47S0100000_8.l0).LJLLJ = i;
        if (!C78855Ux9.LJII(((VerticalScrollDoubleColumnProvider) iDrS47S0100000_8.l0).LJLJJI) && i == 0) {
            VerticalScrollDoubleColumnProvider verticalScrollDoubleColumnProvider = (VerticalScrollDoubleColumnProvider) iDrS47S0100000_8.l0;
            verticalScrollDoubleColumnProvider.LJ(verticalScrollDoubleColumnProvider.LJLJL, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.JUH] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.JUH] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.JU8, X.JUF] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.JU8, X.JUF] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.JQq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.JQq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$10(Y.IDrS47S0100000_8 r7, int r8, androidx.recyclerview.widget.RecyclerView r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS47S0100000_8.LJIILJJIL$10(Y.IDrS47S0100000_8, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$11(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            ((KGZ) iDrS47S0100000_8.l0).LIZIZ();
        }
    }

    public static final void LJIILJJIL$12(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        boolean z;
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        SearchStateViewModel searchStateViewModel2 = ((SearchFragment) iDrS47S0100000_8.l0).LLIIL;
        if ((searchStateViewModel2 == null || (mutableLiveData = searchStateViewModel2.isResultRVScrolling) == null || !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) && (searchStateViewModel = ((SearchFragment) iDrS47S0100000_8.l0).LLIIL) != null) {
            searchStateViewModel.setIsResultRVScrolling(z);
        }
    }

    public static final void LJIILJJIL$13(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        if (i == 0 && ((AbstractC49709Jf7) iDrS47S0100000_8.l0).LJLJJLL.getItemCount() > 1) {
            AbstractC49709Jf7 abstractC49709Jf7 = (AbstractC49709Jf7) iDrS47S0100000_8.l0;
            if (abstractC49709Jf7.LJLJLJ) {
                abstractC49709Jf7.LJLJJLL.notifyItemChanged(1);
                ((AbstractC49709Jf7) iDrS47S0100000_8.l0).LJLJLJ = false;
            }
        }
    }

    public static final void LJIILJJIL$14(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        o.LJIIIZ(recyclerView, "recyclerView");
        C49475JbL c49475JbL = (C49475JbL) iDrS47S0100000_8.l0;
        InterfaceC49479JbP interfaceC49479JbP = c49475JbL.LIZJ;
        Set<InterfaceC49482JbS> keySet = c49475JbL.LIZ().keySet();
        o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
        InterfaceC49482JbS LIZIZ = interfaceC49479JbP.LIZIZ(recyclerView, i, keySet);
        if (LIZIZ != null && (searchServiceCenter$AutoPlayAbility = ((C49475JbL) iDrS47S0100000_8.l0).LIZ().get(LIZIZ)) != null) {
            ((C49475JbL) iDrS47S0100000_8.l0).LIZIZ(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void LJIILJJIL$15(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C49189JSf c49189JSf = (C49189JSf) iDrS47S0100000_8.l0;
        if (!c49189JSf.LJFF) {
            return;
        }
        c49189JSf.LJII = 0L;
        if (i == 0) {
            c49189JSf.LJII = System.currentTimeMillis();
            ((C49189JSf) iDrS47S0100000_8.l0).LJIIIIZZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL$16(Y.IDrS47S0100000_8 r14, int r15, androidx.recyclerview.widget.RecyclerView r16) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS47S0100000_8.LJIILJJIL$16(Y.IDrS47S0100000_8, int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static final void LJIILJJIL$2(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C49341JYb) iDrS47S0100000_8.l0).LJIIIZ.LIZIZ();
        C40517FvF LJLZ = ((C49341JYb) iDrS47S0100000_8.l0).LJFF.LJLZ(i, recyclerView);
        if (LJLZ != null) {
            C49341JYb c49341JYb = (C49341JYb) iDrS47S0100000_8.l0;
            int i2 = LJLZ.LJLIL;
            int i3 = LJLZ.LJLILLLLZI;
            if (i2 > i3) {
                return;
            }
            while (true) {
                c49341JYb.LIZ(i2);
                if (i2 != i3) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void LJIILJJIL$3(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ISearchSugContextAbility iSearchSugContextAbility = ((EcSearchSugAssem) iDrS47S0100000_8.l0).I3().LJLILLLLZI;
        if (iSearchSugContextAbility != null) {
            iSearchSugContextAbility.LLLFFI(false);
        }
    }

    public static final void LJIILJJIL$4(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 1) {
            return;
        }
        ((C49122JPq) iDrS47S0100000_8.l0).LJ = true;
    }

    public static final void LJIILJJIL$5(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C51082K3a c51082K3a = (C51082K3a) iDrS47S0100000_8.l0;
            if (c51082K3a.LIZLLL) {
                c51082K3a.LIZJ();
            }
        }
    }

    public static final void LJIILJJIL$6(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            K3B k3b = (K3B) iDrS47S0100000_8.l0;
            if (k3b.LJ) {
                k3b.LJFF();
            }
        }
    }

    public static final void LJIILJJIL$7(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            K3B k3b = (K3B) iDrS47S0100000_8.l0;
            if (k3b.LJ) {
                k3b.LJ();
            }
        }
    }

    public static final void LJIILJJIL$8(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C49956Jj6.LIZ = true;
        } else {
            if (C49957Jj7.LIZ().group == 0) {
                return;
            }
            C49956Jj6.LJ(recyclerView, (C8HS) iDrS47S0100000_8.l0);
        }
    }

    public static final void LJIILJJIL$9(IDrS47S0100000_8 iDrS47S0100000_8, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C8HS c8hs = (C8HS) iDrS47S0100000_8.l0;
            if (c8hs instanceof JVP) {
                InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("search_mix_feed_list");
                if (LIZIZ != null) {
                    LIZIZ.LIZ("lynx_count", String.valueOf(((JVP) c8hs).LJLLLLLL));
                }
                InterfaceC55057LjB LIZIZ2 = C40443Fu3.LIZIZ("search_mix_feed_list");
                if (LIZIZ2 != null) {
                    LIZIZ2.LIZ("position", String.valueOf(((JVP) c8hs).LJLZ));
                }
            }
            if (c8hs instanceof JVO) {
                InterfaceC55057LjB LIZIZ3 = C40443Fu3.LIZIZ("search_mix_feed_list");
                if (LIZIZ3 != null) {
                    LIZIZ3.LIZ("lynx_count", String.valueOf(((JVO) c8hs).LJLLL));
                }
                InterfaceC55057LjB LIZIZ4 = C40443Fu3.LIZIZ("search_mix_feed_list");
                if (LIZIZ4 != null) {
                    LIZIZ4.LIZ("position", String.valueOf(((JVO) c8hs).LJLLLL));
                }
            }
            if (o.LJ(IO5.LIZ().scene, "SCENE_SEARCH_SCROLL")) {
                IO5.LIZIZ();
            }
            if (!C49642Je2.LIZ().enableScrollJit) {
                return;
            }
            C35810E3q.LJIIJJI(C49642Je2.LIZ().scrollDuration);
            return;
        }
        if (!o.LJ(IO5.LIZ().scene, "SCENE_SEARCH_SCROLL")) {
            return;
        }
        IO5.LIZJ();
    }

    public static final void LJIILL$0(final IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        int i3;
        InterfaceC49157JQz interfaceC49157JQz;
        C49153JQv c49153JQv = (C49153JQv) iDrS47S0100000_8.l0;
        C0A2 layoutManager = c49153JQv.LIZ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).LJLZ == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c49153JQv.LJIIIIZZ.LIZJ(i3);
        C49153JQv c49153JQv2 = (C49153JQv) iDrS47S0100000_8.l0;
        InterfaceC49157JQz interfaceC49157JQz2 = c49153JQv2.LJI;
        if (interfaceC49157JQz2 != null) {
            c49153JQv2.LJIIIIZZ.LIZ();
            interfaceC49157JQz2.LJ();
        }
        C49153JQv c49153JQv3 = (C49153JQv) iDrS47S0100000_8.l0;
        if (c49153JQv3.LIZLLL == 1 && ((interfaceC49157JQz = c49153JQv3.LJI) == null || interfaceC49157JQz.LIZLLL())) {
            ((C49153JQv) iDrS47S0100000_8.l0).LIZJ();
        }
        if (((C49153JQv) iDrS47S0100000_8.l0).LIZLLL == 0 && i2 == 0) {
            if (recyclerView.getItemAnimator() != null) {
                recyclerView.getItemAnimator().LJIILL(new InterfaceC029909v() { // from class: X.JQy
                    @Override // X.InterfaceC029909v
                    public final void LIZ() {
                        ((C49153JQv) IDrS47S0100000_8.this.l0).LIZJ();
                    }
                });
            } else {
                ((C49153JQv) iDrS47S0100000_8.l0).LIZJ();
            }
        }
        ((C49153JQv) iDrS47S0100000_8.l0).LIZIZ();
        C49153JQv c49153JQv4 = (C49153JQv) iDrS47S0100000_8.l0;
        if (!C79004UzY.LJJIFFI(c49153JQv4.LIZIZ)) {
            for (AbstractC49155JQx abstractC49155JQx : c49153JQv4.LIZIZ) {
                if (c49153JQv4.LJIIIIZZ.LIZIZ(abstractC49155JQx.LIZIZ())) {
                    if (!abstractC49155JQx.LIZJ) {
                        abstractC49155JQx.LIZJ = true;
                    }
                } else if (abstractC49155JQx.LIZJ) {
                    abstractC49155JQx.LIZJ = false;
                }
            }
        }
        C49153JQv c49153JQv5 = (C49153JQv) iDrS47S0100000_8.l0;
        if (C79004UzY.LJJIFFI(c49153JQv5.LIZIZ)) {
            return;
        }
        Iterator<AbstractC49155JQx> it = c49153JQv5.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final void LJIILL$1(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScrolled: ");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (i2 == 0) {
            return;
        }
        ((VerticalScrollDoubleColumnProvider) iDrS47S0100000_8.l0).LJ(i2, true);
    }

    public static final void LJIILL$2(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((SearchBotHolder) iDrS47S0100000_8.l0).Q();
    }

    public static final void LJIILL$3(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((SearchTakoCardAssem) iDrS47S0100000_8.l0).u4();
    }

    public static final void LJIILL$4(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (JWC.LIZ.enableScrollAsyncBind) {
            C40517FvF LJZI = ((C49341JYb) iDrS47S0100000_8.l0).LJFF.LJZI(recyclerView, i2);
            if (LJZI != null) {
                C49341JYb c49341JYb = (C49341JYb) iDrS47S0100000_8.l0;
                int i3 = LJZI.LJLIL;
                int i4 = LJZI.LJLILLLLZI;
                if (i3 > i4) {
                    return;
                }
                while (true) {
                    c49341JYb.LIZ(i3);
                    if (i3 != i4) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            InterfaceC49349JYj interfaceC49349JYj = ((C49341JYb) iDrS47S0100000_8.l0).LJFF;
            if (interfaceC49349JYj instanceof JYJ) {
                ((JYJ) interfaceC49349JYj).LIZ = i2;
            }
        }
    }

    public static final void LJIILL$5(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C49122JPq) iDrS47S0100000_8.l0).LJFF = i;
    }

    public static final void LJIILL$6(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (C49956Jj6.LIZ && (C49957Jj7.LIZ().group == 2 || C49957Jj7.LIZ().group == 5)) {
            C49956Jj6.LJ(recyclerView, (C8HS) iDrS47S0100000_8.l0);
        } else {
            if (C49957Jj7.LIZ().group != 3 && C49957Jj7.LIZ().group != 6) {
                return;
            }
            C49956Jj6.LJ(recyclerView, (C8HS) iDrS47S0100000_8.l0);
        }
    }

    public static final void LJIILL$7(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && i2 == 0) {
            return;
        }
        C49475JbL c49475JbL = (C49475JbL) iDrS47S0100000_8.l0;
        if (c49475JbL.LJFF) {
            InterfaceC49479JbP interfaceC49479JbP = c49475JbL.LIZJ;
            Set<InterfaceC49482JbS> keySet = c49475JbL.LIZ().keySet();
            o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
            interfaceC49479JbP.LIZ(recyclerView, keySet);
        }
    }

    public static final void LJIILL$8(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C49178JRu) iDrS47S0100000_8.l0).LJFF = i;
    }

    public static final void LJIILL$9(IDrS47S0100000_8 iDrS47S0100000_8, RecyclerView recyclerView, int i, int i2) {
        Boolean hasShownResearchFilter;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((C50222JnO) iDrS47S0100000_8.l0).LJLIL.getParent() == null) {
            return;
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        SYL syl = ((C50222JnO) iDrS47S0100000_8.l0).LJLIL;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(syl);
        if (LIZLLL == null || (hasShownResearchFilter = LIZLLL.getHasShownResearchFilter()) == null || !hasShownResearchFilter.booleanValue()) {
            return;
        }
        C50222JnO c50222JnO = (C50222JnO) iDrS47S0100000_8.l0;
        c50222JnO.LJLIL.post(new ARunnableS14S0110000_8(c50222JnO, C78855Ux9.LJII(recyclerView), 14));
    }
}
