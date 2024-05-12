package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.AlsLogicContainer;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;
import ud2.ApS179S0200000_7;
import ud2.ApS181S0200000_14;
import ud2.ApS201S0100000_14;
import ud2.ApS76S0201000_14;

/* loaded from: classes15.dex */
public final class WT6 extends AbstractC65781Prl implements InterfaceC88472Yns<C275416g, C76800UCe> {
    public final /* synthetic */ WMH LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C82622Wbi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WT6(WMH wmh, C82622Wbi c82622Wbi, boolean z) {
        super(1);
        this.LJLIL = wmh;
        this.LJLILLLLZI = z;
        this.LJLJI = c82622Wbi;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C275416g c275416g) {
        boolean z;
        int i;
        C275416g attach = c275416g;
        o.LJIIIZ(attach, "$this$attach");
        View requireViewById = this.LJLIL.requireViewById(R.id.iri);
        o.LJIIIIZZ(requireViewById, "parentScene.requireViewB…R.id.record_normal_scene)");
        int LJ = C77318UWc.LJ((ViewGroup) requireViewById);
        C0I7 c0i7 = C0I7.IMMEDIATE;
        C275516h c275516h = new C275516h();
        AlsLogicContainer alsLogicContainer = attach.LIZ;
        alsLogicContainer.LJLLJ.LIZLLL(WL9.class, null, new ApS201S0100000_14(attach, c275516h, 40));
        alsLogicContainer.LJII(0, c0i7, alsLogicContainer.LIZLLL(W13.class, WL9.class), null, null, WL9.class, W13.class, null);
        WMH wmh = this.LJLIL;
        C275516h c275516h2 = new C275516h();
        AlsLogicContainer alsLogicContainer2 = attach.LIZ;
        alsLogicContainer2.LJLLJ.LIZLLL(WX9.class, null, new ApS181S0200000_14(attach, c275516h2, wmh, 99));
        alsLogicContainer2.LJII(0, c0i7, alsLogicContainer2.LIZLLL(InterfaceC82353WTt.class, WX9.class), null, null, WX9.class, InterfaceC82353WTt.class, null);
        WMH wmh2 = this.LJLIL;
        C275516h c275516h3 = new C275516h();
        AlsLogicContainer alsLogicContainer3 = attach.LIZ;
        alsLogicContainer3.LJLLJ.LIZLLL(I3A.class, null, new ApS179S0200000_7(attach, c275516h3, wmh2, 30));
        alsLogicContainer3.LJII(0, c0i7, alsLogicContainer3.LIZLLL(InterfaceC160396Rf.class, I3A.class), null, null, I3A.class, InterfaceC160396Rf.class, null);
        C0I7 LIZ = C53564L0m.LIZ();
        WMH wmh3 = this.LJLIL;
        C275516h c275516h4 = new C275516h();
        AlsLogicContainer alsLogicContainer4 = attach.LIZ;
        alsLogicContainer4.LJLLJ.LIZLLL(C46065I6b.class, null, new ApS181S0200000_14(attach, c275516h4, wmh3, 105));
        boolean z2 = false;
        alsLogicContainer4.LJII(0, LIZ, alsLogicContainer4.LIZLLL(HXE.class, C46065I6b.class), null, null, C46065I6b.class, HXE.class, null);
        if (this.LJLILLLLZI) {
            WMH wmh4 = this.LJLIL;
            C275516h c275516h5 = new C275516h();
            AlsLogicContainer alsLogicContainer5 = attach.LIZ;
            alsLogicContainer5.LJLLJ.LIZLLL(C82306WRy.class, null, new ApS76S0201000_14(attach, c275516h5, wmh4, LJ, 0));
            z2 = false;
            alsLogicContainer5.LJII(0, c0i7, alsLogicContainer5.LIZLLL(InterfaceC82325WSr.class, C82306WRy.class), null, null, C82306WRy.class, InterfaceC82325WSr.class, null);
        }
        if (C46125I8j.LIZIZ()) {
            EnumC06840Oq enumC06840Oq = EnumC06840Oq.HIDE;
            WMH wmh5 = this.LJLIL;
            attach.LIZ.LIZIZ(c0i7, null, I8W.class, C82763Wdz.class, AbstractC56012Ht.class, z2 ? 1 : 0, enumC06840Oq, new AqS145S0200000_14(attach, new C275516h(), wmh5, 53));
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(z2).getStoryService();
        if (C43119Gw7.LIZ() || ((ShortVideoContext) this.LJLJI.LJ(ShortVideoContext.class, null)).LJJIJIIJIL() || C41669GWz.LIZ() || (IMService.createIIMServicebyMonsterPlugin(z2).getCameraService().LIZ() && ((ShortVideoContext) this.LJLJI.LJ(ShortVideoContext.class, null)).creativeModel.initialModel.dmCameraModel.enterFromDM)) {
            WMH wmh6 = this.LJLIL;
            C275516h c275516h6 = new C275516h();
            AlsLogicContainer alsLogicContainer6 = attach.LIZ;
            alsLogicContainer6.LJLLJ.LIZLLL(WUU.class, null, new ApS181S0200000_14(attach, c275516h6, wmh6, 33));
            z = z2;
            alsLogicContainer6.LJII(z ? 1 : 0, c0i7, alsLogicContainer6.LIZLLL(InterfaceC45891Hzj.class, WUU.class), null, null, WUU.class, InterfaceC45891Hzj.class, null);
        } else {
            WMH wmh7 = this.LJLIL;
            C275516h c275516h7 = new C275516h();
            AlsLogicContainer alsLogicContainer7 = attach.LIZ;
            alsLogicContainer7.LJLLJ.LIZLLL(WUV.class, null, new ApS181S0200000_14(attach, c275516h7, wmh7, 35));
            z = z2;
            alsLogicContainer7.LJII(z ? 1 : 0, c0i7, alsLogicContainer7.LIZLLL(InterfaceC45995I3j.class, WUV.class), null, null, WUV.class, InterfaceC45995I3j.class, null);
        }
        WMH wmh8 = this.LJLIL;
        C275516h c275516h8 = new C275516h();
        AlsLogicContainer alsLogicContainer8 = attach.LIZ;
        alsLogicContainer8.LJLLJ.LIZLLL(C82317WSj.class, null, new ApS181S0200000_14(attach, c275516h8, wmh8, 39));
        boolean z3 = z;
        alsLogicContainer8.LJII(z3 ? 1 : 0, c0i7, alsLogicContainer8.LIZLLL(I3K.class, C82317WSj.class), null, null, C82317WSj.class, I3K.class, null);
        if (((ShortVideoContext) this.LJLJI.LJ(ShortVideoContext.class, null)).LJJIJIIJIL()) {
            WMH wmh9 = this.LJLIL;
            C275516h c275516h9 = new C275516h();
            AlsLogicContainer alsLogicContainer9 = attach.LIZ;
            alsLogicContainer9.LJLLJ.LIZLLL(C82328WSu.class, null, new ApS179S0200000_7(attach, c275516h9, wmh9, 18));
            C29831Fb LIZLLL = alsLogicContainer9.LIZLLL(InterfaceC45979I2t.class, C82328WSu.class);
            i = z3 ? 1 : 0;
            alsLogicContainer9.LJII(i, c0i7, LIZLLL, null, null, C82328WSu.class, InterfaceC45979I2t.class, null);
        } else if (IMService.createIIMServicebyMonsterPlugin(z3).getCameraService().LIZ() && ((ShortVideoContext) this.LJLJI.LJ(ShortVideoContext.class, null)).creativeModel.initialModel.dmCameraModel.enterFromDM) {
            WMH wmh10 = this.LJLIL;
            C275516h c275516h10 = new C275516h();
            AlsLogicContainer alsLogicContainer10 = attach.LIZ;
            alsLogicContainer10.LJLLJ.LIZLLL(C82328WSu.class, null, new ApS179S0200000_7(attach, c275516h10, wmh10, 26));
            C29831Fb LIZLLL2 = alsLogicContainer10.LIZLLL(InterfaceC45979I2t.class, C82328WSu.class);
            i = z3 ? 1 : 0;
            alsLogicContainer10.LJII(i, c0i7, LIZLLL2, null, null, C82328WSu.class, InterfaceC45979I2t.class, null);
        } else {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(z3).getStoryService();
            if (C43119Gw7.LIZ() || C41669GWz.LIZ()) {
                WMH wmh11 = this.LJLIL;
                C275516h c275516h11 = new C275516h();
                AlsLogicContainer alsLogicContainer11 = attach.LIZ;
                alsLogicContainer11.LJLLJ.LIZLLL(C82328WSu.class, null, new ApS179S0200000_7(attach, c275516h11, wmh11, 28));
                C29831Fb LIZLLL3 = alsLogicContainer11.LIZLLL(InterfaceC45979I2t.class, C82328WSu.class);
                i = z3 ? 1 : 0;
                alsLogicContainer11.LJII(i, c0i7, LIZLLL3, null, null, C82328WSu.class, InterfaceC45979I2t.class, null);
            } else {
                WMH wmh12 = this.LJLIL;
                C275516h c275516h12 = new C275516h();
                AlsLogicContainer alsLogicContainer12 = attach.LIZ;
                alsLogicContainer12.LJLLJ.LIZLLL(C82329WSv.class, null, new ApS181S0200000_14(attach, c275516h12, wmh12, 90));
                C29831Fb LIZLLL4 = alsLogicContainer12.LIZLLL(InterfaceC45979I2t.class, C82329WSv.class);
                i = z3 ? 1 : 0;
                alsLogicContainer12.LJII(i, c0i7, LIZLLL4, null, null, C82329WSv.class, InterfaceC45979I2t.class, null);
            }
        }
        WMH wmh13 = this.LJLIL;
        C275516h c275516h13 = new C275516h();
        AlsLogicContainer alsLogicContainer13 = attach.LIZ;
        alsLogicContainer13.LJLLJ.LIZLLL(WLC.class, null, new ApS181S0200000_14(attach, c275516h13, wmh13, 94));
        int i2 = i;
        alsLogicContainer13.LJII(i2, c0i7, alsLogicContainer13.LIZLLL(InterfaceC45999I3n.class, WLC.class), null, null, WLC.class, InterfaceC45999I3n.class, null);
        C275516h c275516h14 = new C275516h();
        AlsLogicContainer alsLogicContainer14 = attach.LIZ;
        alsLogicContainer14.LJLLJ.LIZLLL(C173776rt.class, null, new ApS201S0100000_14(attach, c275516h14, 37));
        alsLogicContainer14.LJII(i2, c0i7, alsLogicContainer14.LIZLLL(InterfaceC170076lv.class, C173776rt.class), null, null, C173776rt.class, InterfaceC170076lv.class, null);
        attach.LIZ.LIZIZ(c0i7, null, InterfaceC45308HqK.class, C45946I1m.class, C171146ne.class, R.id.is1, EnumC06840Oq.HIDE, new AqS138S0200000_7(attach, new C275516h(), this.LJLIL, 106));
        if (L2L.LIZJ(this.LJLJI)) {
            OSZ LIZLLL5 = C77318UWc.LIZLLL(this.LJLJI);
            attach.LIZ.LIZJ((C0I7) LIZLLL5.getFirst(), (C0IB) LIZLLL5.getSecond(), InterfaceC136505Xi.class, C136485Xg.class, R.id.iri, EnumC06840Oq.SHOW, new AqS133S0200000_2(attach, new C275516h(), this.LJLIL, 146));
        } else {
            attach.LIZ.LIZJ(c0i7, null, InterfaceC136505Xi.class, C136485Xg.class, R.id.iri, EnumC06840Oq.SHOW, new AqS133S0200000_2(attach, new C275516h(), this.LJLIL, 147));
        }
        return C76800UCe.LIZ;
    }
}
