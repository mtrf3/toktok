package com.ss.android.ugc.aweme.mix.mixdetail;

import X.AbstractC72278SYg;
import X.C0B4;
import X.C111944aM;
import X.C1C8;
import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C228308xe;
import X.C228378xl;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C72300SZc;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C86V;
import X.C8YN;
import X.C9BD;
import X.InterfaceC228208xU;
import X.Q8U;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerAssem;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS122S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixFeedManagerAssem extends UIContentAssem implements InterfaceC228208xU {
    public static final int LJLJJL = 8;
    public C1C8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public String LJLJI;
    public Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC228208xU, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public MixFeedManagerAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosManageViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 497), C228308xe.INSTANCE, null);
    }

    public final MixVideosManageViewModel v3() {
        return (MixVideosManageViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC228208xU
    public void LJLI(PowerCell<?> powerCell) {
        C1C8 c1c8;
        if (powerCell != null && (c1c8 = this.LJLIL) != null) {
            c1c8.LJIJI(powerCell);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0B4, T, X.8xl] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        final C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.kf_);
        final SYL syl = (SYL) view.findViewById(R.id.gkp);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.8xg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228228xW) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS122S0300000_3(syl, c73305Spp, this, 0), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.8xc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228228xW) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS166S0200000_3(this, c73305Spp, 8), 4);
        syl.LLLF.LJZL(MixFeedManageCell.class);
        syl.setLifecycleOwner(this);
        syl.setHasFixedSize(true);
        syl.LJLJLLL((AbstractC72278SYg) v3().LJLJJLL.getValue());
        syl.LJII(new C111944aM(), -1);
        syl.LJLJLJ(new C72300SZc() { // from class: X.8xb
            @Override // X.C72300SZc
            public final void LIZLLL() {
            }

            @Override // X.C72300SZc
            public final void LJFF() {
            }

            @Override // X.C72300SZc
            public final void LJ() {
                C212428Vi.LIZ(this);
            }

            @Override // X.C72300SZc
            public final void LJII() {
                c73305Spp.setVisibility(0);
                c73305Spp.LJFF();
            }

            @Override // X.C72300SZc
            public final void LJIIIIZZ() {
                if (syl.getState().LJIIIIZZ() == 0) {
                    MixFeedManagerAssem mixFeedManagerAssem = this;
                    C73305Spp statusView = c73305Spp;
                    o.LJIIIIZZ(statusView, "statusView");
                    mixFeedManagerAssem.x3(statusView);
                    return;
                }
                c73305Spp.setVisibility(8);
            }

            @Override // X.C72300SZc
            public final void LJI(Exception exc) {
                C73305Spp statusView = c73305Spp;
                o.LJIIIIZZ(statusView, "statusView");
                C26045AKb c26045AKb = new C26045AKb(statusView);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                C73305Spp c73305Spp2 = c73305Spp;
                C73306Spq c73306Spq = new C73306Spq();
                String string = c73305Spp.getContext().getString(R.string.rf3);
                o.LJIIIIZZ(string, "statusView.context.getSt…R.string.something_wrong)");
                c73306Spq.LJI = string;
                c73305Spp2.setStatus(c73306Spq);
            }
        });
        String str = v3().LJLILLLLZI;
        this.LJLJI = str;
        if (str != null) {
            MixVideosManageViewModel v3 = v3();
            String str2 = this.LJLJI;
            o.LJI(str2);
            v3.getClass();
            v3.LJLILLLLZI = str2;
            ((PowerPageSource) v3.LJLJJLL.getValue()).getOperator().refresh();
        }
        C68322mC c68322mC = new C68322mC();
        ?? c228378xl = new C228378xl(syl, v3(), false);
        c68322mC.element = c228378xl;
        C1C8 c1c8 = new C1C8(c228378xl);
        this.LJLIL = c1c8;
        c1c8.LJII(syl);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.8xa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228228xW) obj).LJLJJI;
            }
        }, null, new AqS185S0100000_3(c68322mC, (C68322mC<C0B4>) 56), 6);
    }

    public final void x3(C73305Spp c73305Spp) {
        c73305Spp.setVisibility(0);
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_no_video;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        String string = C86V.LJ().getString(R.string.g33);
        o.LJIIIIZZ(string, "getResources().getString(R.string.empty_prompt)");
        c73306Spq.LJFF = Q8U.LIZIZ(new Object[]{v3().LJLJI}, 1, string, "format(format, *args)");
        String string2 = c73305Spp.getContext().getString(R.string.g31);
        o.LJIIIIZZ(string2, "view.context.getString(R.string.empty_playlist)");
        c73306Spq.LJI = string2;
        c73305Spp.setStatus(c73306Spq);
    }
}
