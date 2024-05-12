package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC91380Ztg;
import X.AbstractC91590Zx4;
import X.C17N;
import X.C26045AKb;
import X.C32I;
import X.C72808Sho;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C8RL;
import X.C91295ZsJ;
import X.C91395Ztv;
import X.C91422ZuM;
import X.C91423ZuN;
import X.C91473ZvB;
import X.C91508Zvk;
import X.C91509Zvl;
import X.C91621ZxZ;
import X.C91622Zxa;
import X.EnumC91294ZsI;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.InterfaceC91296ZsK;
import X.L41;
import X.ORZ;
import X.SYL;
import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspSlotReusedAssem;
import com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes22.dex */
public class IDqS444S0100000_29 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS444S0100000_29(UpsellLandingPageSlotAssem upsellLandingPageSlotAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = upsellLandingPageSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS444S0100000_29(MDAudioQueueAssem mDAudioQueueAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = mDAudioQueueAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS444S0100000_29(CollectAssem collectAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = collectAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS444S0100000_29(MDQueueViewModel mDQueueViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = mDQueueViewModel;
    }

    public static final Object invoke$0(IDqS444S0100000_29 iDqS444S0100000_29, Object selectSubscribe, Object obj) {
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91422ZuM c91422ZuM = (C91422ZuM) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c91422ZuM != null) {
            CollectAssem collectAssem = (CollectAssem) iDqS444S0100000_29.l0;
            collectAssem.getClass();
            Iterator<DspStruct> it = c91422ZuM.LJLIL.iterator();
            while (it.hasNext()) {
                Dsp musicDspInfo = it.next().getDspMusic().getMusicDspInfo();
                String str = null;
                if (musicDspInfo != null) {
                    str = musicDspInfo.getFullClipId();
                }
                C91395Ztv c91395Ztv = collectAssem.LLFII;
                if (c91395Ztv != null && (interfaceC91296ZsK = c91395Ztv.LJLIL) != null && str != null && o.LJ(str, interfaceC91296ZsK.LIZIZ())) {
                    interfaceC91296ZsK.LJIIJJI(1);
                    collectAssem.l4(true);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS444S0100000_29 iDqS444S0100000_29, Object selectSubscribe, Object obj) {
        CollectAssem collectAssem;
        IAudioPlayerAbility Z3;
        AbstractC91590Zx4 HS;
        AbstractC91380Ztg LJIIZILJ;
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList;
        boolean z;
        InterfaceC91296ZsK interfaceC91296ZsK;
        FrameLayout frameLayout;
        int i;
        int i2;
        int i3;
        boolean z2;
        C91423ZuN c91423ZuN = (C91423ZuN) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c91423ZuN != null && (Z3 = (collectAssem = (CollectAssem) iDqS444S0100000_29.l0).Z3()) != null && (HS = Z3.HS()) != null && (LJIIZILJ = HS.LJIIZILJ()) != null && (copyOnWriteArrayList = LJIIZILJ.LJLIL) != null) {
            if (c91423ZuN.LJLJI == 1) {
                z = true;
            } else {
                z = false;
            }
            C91395Ztv c91395Ztv = collectAssem.LLFII;
            if (c91395Ztv != null && (interfaceC91296ZsK = c91395Ztv.LJLIL) != null) {
                Iterator<InterfaceC91296ZsK> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC91296ZsK next = it.next();
                    if (o.LJ(next.getId(), c91423ZuN.LJLIL)) {
                        if (o.LJ(interfaceC91296ZsK.getId(), c91423ZuN.LJLIL)) {
                            if (c91423ZuN.LJLJJI) {
                                i3 = c91423ZuN.LJLJI;
                            } else if (c91423ZuN.LJLJI == 1) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            interfaceC91296ZsK.LJIIJJI(i3);
                            if (interfaceC91296ZsK.w4() == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            collectAssem.l4(z2);
                        }
                        next.LJIJ(-1);
                    }
                }
                if (o.LJ(interfaceC91296ZsK.getId(), c91423ZuN.LJLIL) && (frameLayout = collectAssem.LLFZ) != null) {
                    if (c91423ZuN.LJLJJI) {
                        L41.LIZ.getClass();
                        if (!L41.LIZJ()) {
                            C26045AKb c26045AKb = new C26045AKb(frameLayout);
                            Resources resources = frameLayout.getContext().getResources();
                            if (z) {
                                i2 = R.string.ga4;
                            } else {
                                i2 = R.string.ga6;
                            }
                            c26045AKb.LJIIIZ(resources.getString(i2));
                            c26045AKb.LJIIJ();
                        }
                    } else {
                        C26045AKb c26045AKb2 = new C26045AKb(frameLayout);
                        Resources resources2 = frameLayout.getContext().getResources();
                        if (z) {
                            i = R.string.dgl;
                        } else {
                            i = R.string.cgd;
                        }
                        c26045AKb2.LJIIIZ(resources2.getString(i));
                        c26045AKb2.LJIIJ();
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS444S0100000_29 iDqS444S0100000_29, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (o.LJ(obj, Boolean.TRUE)) {
            ((C73305Spp) ((MDAudioQueueAssem) iDqS444S0100000_29.l0).LJLJI.getValue()).LJFF();
            ((C73305Spp) ((MDAudioQueueAssem) iDqS444S0100000_29.l0).LJLJI.getValue()).setVisibility(0);
        } else {
            ((C73305Spp) ((MDAudioQueueAssem) iDqS444S0100000_29.l0).LJLJI.getValue()).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS444S0100000_29 iDqS444S0100000_29, Object id, Object context) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(context, "context");
        ((MDQueueViewModel) iDqS444S0100000_29.l0).gv0().getClass();
        throw null;
    }

    public static final Object invoke$4(IDqS444S0100000_29 iDqS444S0100000_29, Object obj, Object obj2) {
        String id = (String) obj;
        Context context = (Context) obj2;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(context, "context");
        ((MDQueueViewModel) iDqS444S0100000_29.l0).hv0(context, id);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS444S0100000_29 iDqS444S0100000_29, Object selectSubscribe, Object obj) {
        EnumC91294ZsI it = (EnumC91294ZsI) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        int i = C91295ZsJ.LIZ[it.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C17N.LJJIIJZLJL(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLIIIILZ);
                C17N.LJJLIIIJJI(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLII);
            } else {
                C17N.LJJIIJZLJL(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLII);
                C17N.LJJLIIIJJI(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLIIIILZ);
                C73305Spp c73305Spp = ((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLIIIILZ;
                if (c73305Spp != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new IDqS421S0100000_29((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0, 82));
                    c73305Spp.setStatus(c73306Spq);
                }
            }
        } else {
            C17N.LJJIIJZLJL(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLII);
            C17N.LJJLIIIJJI(((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLIIIILZ);
            C73305Spp c73305Spp2 = ((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLIIIILZ;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS444S0100000_29 iDqS444S0100000_29, Object obj, Object obj2) {
        int i;
        C72808Sho<InterfaceC57784Mm4> state;
        C72808Sho<InterfaceC57784Mm4> state2;
        BaseDspSlotReusedAssem selectSubscribe = (BaseDspSlotReusedAssem) obj;
        List it = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (!it.isEmpty()) {
            IContainerUtilityAbility m4 = ((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).m4();
            if (m4 != null && m4.SC()) {
                i = 3;
            } else {
                i = 4;
            }
            List<C8RL> LLILLL = ORZ.LLILLL(it, i);
            UpsellLandingPageSlotAssem upsellLandingPageSlotAssem = (UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0;
            ArrayList arrayList = new ArrayList(C32I.LJJL(LLILLL, 10));
            for (C8RL c8rl : LLILLL) {
                String str = null;
                if (c8rl instanceof C91508Zvk) {
                    C91508Zvk c91508Zvk = (C91508Zvk) c8rl;
                    C91621ZxZ c91621ZxZ = new C91621ZxZ(upsellLandingPageSlotAssem);
                    C91473ZvB x5 = selectSubscribe.x5();
                    if (x5 != null) {
                        str = x5.LJLIL;
                    }
                    String id = c91508Zvk.LJLIL;
                    UrlModel urlModel = c91508Zvk.LJLILLLLZI;
                    String artistName = c91508Zvk.LJLJI;
                    long j = c91508Zvk.LJLJJI;
                    DspExtraStruct dspExtraStruct = c91508Zvk.LJLJJL;
                    C91395Ztv c91395Ztv = c91508Zvk.LJLJJLL;
                    o.LJIIIZ(id, "id");
                    o.LJIIIZ(artistName, "artistName");
                    c8rl = new C91508Zvk(id, urlModel, artistName, j, dspExtraStruct, c91395Ztv, str, c91621ZxZ);
                } else if (c8rl instanceof C91509Zvl) {
                    C91509Zvl c91509Zvl = (C91509Zvl) c8rl;
                    C91622Zxa c91622Zxa = new C91622Zxa(upsellLandingPageSlotAssem);
                    C91473ZvB x52 = selectSubscribe.x5();
                    if (x52 != null) {
                        str = x52.LJLIL;
                    }
                    String id2 = c91509Zvl.LJLIL;
                    UrlModel urlModel2 = c91509Zvl.LJLILLLLZI;
                    String str2 = c91509Zvl.LJLJI;
                    String str3 = c91509Zvl.LJLJJI;
                    Long l = c91509Zvl.LJLJJL;
                    Long l2 = c91509Zvl.LJLJJLL;
                    boolean z = c91509Zvl.LJLJL;
                    boolean z2 = c91509Zvl.LJLJLJ;
                    DspExtraStruct dspExtraStruct2 = c91509Zvl.LJLJLLL;
                    C91395Ztv c91395Ztv2 = c91509Zvl.LJLL;
                    o.LJIIIZ(id2, "id");
                    c8rl = new C91509Zvl(id2, urlModel2, str2, str3, l, l2, z, z2, dspExtraStruct2, c91395Ztv2, str, c91622Zxa);
                }
                arrayList.add(c8rl);
            }
            SYL syl = ((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLII;
            if (syl != null && (state2 = syl.getState()) != null) {
                state2.LJFF();
            }
            SYL syl2 = ((UpsellLandingPageSlotAssem) iDqS444S0100000_29.l0).LLII;
            if (syl2 != null && (state = syl2.getState()) != null) {
                state.LJ(arrayList);
            }
        }
        return C76800UCe.LIZ;
    }
}
