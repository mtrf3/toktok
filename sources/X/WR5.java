package X;

import Y.AfS66S0100000_14;
import Y.IDhS107S0100000_14;
import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.UpdateFilterBoxBody;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WR5 extends TMY<C81288VvI> implements TPO {
    public final C5H3<FilterBoxApi> LIZJ;
    public final C44211HWt LIZLLL;
    public final InterfaceC139745e6<InterfaceC84497XEf> LJ;
    public final InterfaceC82281WQz LJFF;

    @Override // X.TMY
    public final AbstractC73672Svk<C81288VvI> LJIIIIZZ() {
        FilterBoxApi value = this.LIZJ.getValue();
        String str = this.LIZLLL.LJLJLJ.get();
        o.LJIIIIZZ(str, "effectParams.effectAccessKeyProvider.get()");
        String str2 = this.LIZLLL.LJLJJLL.get();
        o.LJIIIIZZ(str2, "effectParams.effectSdkVersionProvider.get()");
        String str3 = this.LIZLLL.LJLJJI.get();
        o.LJIIIIZZ(str3, "effectParams.appVersionProvider.get()");
        String str4 = this.LIZLLL.LJLJI.get();
        o.LJIIIIZZ(str4, "effectParams.regionProvider.get()");
        String str5 = this.LIZLLL.LJLJJL.get();
        o.LJIIIIZZ(str5, "effectParams.panelProvider.get()");
        AbstractC73672Svk LJJIIJZLJL = value.listFilterBox(str, str2, str3, str4, str5).LJIJI(new IDhS107S0100000_14(this, 5)).LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "filterBoxApi.value.listF…         }.toObservable()");
        return LJJIIJZLJL;
    }

    public final void LJIIJ() {
        InterfaceC84497XEf interfaceC84497XEf = this.LJ.get();
        String str = this.LIZLLL.LJLJJL.get();
        o.LJIIIIZZ(str, "effectParams.panelProvider.get()");
        interfaceC84497XEf.LJJJJLI(str, false, false, WRA.LIZ);
    }

    @Override // X.TPO
    public final AbstractC73638SvC<Object> LIZLLL(java.util.Set<Integer> filterIdSet) {
        o.LJIIIZ(filterIdSet, "filterIdSet");
        if (filterIdSet.isEmpty()) {
            return AbstractC73638SvC.LJIIZILJ(C73536StY.LJLIL);
        }
        C73521StJ c73521StJ = new C73521StJ();
        this.LIZJ.getValue().updateFilterBox(LJIIIZ(filterIdSet, WR6.INSERT)).LJIILIIL(new AfS66S0100000_14(this, 34)).LJIJI(WR7.LJLIL).LJJIIJ(T16.LIZ()).LIZ(c73521StJ);
        return new C73497Ssv(c73521StJ);
    }

    @Override // X.TPO
    public final AbstractC73638SvC<Object> LJ(java.util.Set<Integer> filterIdSet) {
        o.LJIIIZ(filterIdSet, "filterIdSet");
        if (filterIdSet.isEmpty()) {
            return AbstractC73638SvC.LJIIZILJ(C73536StY.LJLIL);
        }
        C73521StJ c73521StJ = new C73521StJ();
        this.LIZJ.getValue().updateFilterBox(LJIIIZ(filterIdSet, WR6.REMOVE)).LJIILIIL(new AfS66S0100000_14(this, 35)).LJIJI(WR8.LJLIL).LJJIIJ(T16.LIZ()).LIZ(c73521StJ);
        return new C73497Ssv(c73521StJ);
    }

    public final UpdateFilterBoxBody LJIIIZ(java.util.Set<Integer> set, WR6 wr6) {
        String LLD = ORZ.LLD(set, ",", null, null, null, 62);
        int i = wr6.LJLIL;
        String str = this.LIZLLL.LJLIL.get();
        o.LJIIIIZZ(str, "effectParams.deviceIdProvider.get()");
        String str2 = this.LIZLLL.LJLJJL.get();
        o.LJIIIIZZ(str2, "effectParams.panelProvider.get()");
        String str3 = this.LIZLLL.LJLJJLL.get();
        o.LJIIIIZZ(str3, "effectParams.effectSdkVersionProvider.get()");
        String str4 = this.LIZLLL.LJLJL.get();
        o.LJIIIIZZ(str4, "effectParams.effectChannelProvider.get()");
        String str5 = this.LIZLLL.LJLJI.get();
        o.LJIIIIZZ(str5, "effectParams.regionProvider.get()");
        String str6 = this.LIZLLL.LJLJLJ.get();
        o.LJIIIIZZ(str6, "effectParams.effectAccessKeyProvider.get()");
        String str7 = this.LIZLLL.LJLJJI.get();
        o.LJIIIIZZ(str7, "effectParams.appVersionProvider.get()");
        return new UpdateFilterBoxBody(LLD, i, str, str2, str3, str4, str5, str6, str7);
    }

    public WR5(C62822Ol8 c62822Ol8, C44211HWt effectParams, InterfaceC139745e6 effectPlatform, InterfaceC82281WQz interfaceC82281WQz) {
        o.LJIIIZ(effectParams, "effectParams");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZJ = c62822Ol8;
        this.LIZLLL = effectParams;
        this.LJ = effectPlatform;
        this.LJFF = interfaceC82281WQz;
    }
}
