package kotlin.jvm.internal;

import X.ACW;
import X.AbstractC57774Mlu;
import X.AbstractC65781Prl;
import X.C162476Zf;
import X.C34K;
import X.C57776Mlw;
import X.C57777Mlx;
import X.C57983MpH;
import X.C61328O5c;
import X.C61878OQg;
import X.C6DL;
import X.C6DO;
import X.C76800UCe;
import X.C79004UzY;
import X.C86661Xzl;
import X.C86670Xzu;
import X.C8HZ;
import X.EnumC86689Y0n;
import X.EnumC86777Y3x;
import X.HG3;
import X.InterfaceC2064788l;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.L2D;
import X.RBX;
import X.SZP;
import X.ViewOnClickListenerC86668Xzs;
import X.Y04;
import Y.ACListenerS40S0300000_15;
import Y.ACListenerS49S0200000_15;
import android.content.Context;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS6S0600000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS6S0600000_15 aqS6S0600000_15, Object obj) {
        List list;
        C8HZ c8hz;
        InterfaceC2064788l it = (InterfaceC2064788l) obj;
        o.LJIIIZ(it, "it");
        AbstractC57774Mlu abstractC57774Mlu = (AbstractC57774Mlu) aqS6S0600000_15.l0;
        if (abstractC57774Mlu instanceof C57776Mlw) {
            list = ((C57776Mlw) abstractC57774Mlu).LIZIZ;
        } else if (abstractC57774Mlu instanceof C57983MpH) {
            list = ((C57983MpH) abstractC57774Mlu).LIZLLL;
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<ITEM of com.bytedance.ext_power_list.AssemSingleListViewModel>");
        } else {
            list = C61878OQg.INSTANCE;
        }
        Collection collection = it.getListState().LJLJJI;
        C8HZ listState = it.getListState();
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) aqS6S0600000_15.l1;
        SZP szp = (SZP) aqS6S0600000_15.l2;
        if (collection == null) {
            collection = C61878OQg.INSTANCE;
        }
        List onLoadPageAddData = assemSingleListViewModel.onLoadPageAddData(szp, collection, list);
        if (onLoadPageAddData != null) {
            listState = C8HZ.LIZIZ(it.getListState(), null, null, null, C61328O5c.LJ(onLoadPageAddData), 7);
        }
        AssemSingleListViewModel assemSingleListViewModel2 = (AssemSingleListViewModel) aqS6S0600000_15.l1;
        AbstractC57774Mlu abstractC57774Mlu2 = (AbstractC57774Mlu) aqS6S0600000_15.l0;
        Object obj2 = null;
        if (abstractC57774Mlu2 instanceof C57776Mlw) {
            c8hz = (C8HZ) ((InterfaceC88473Ynt) aqS6S0600000_15.l3).invoke(listState, null, null);
        } else if (abstractC57774Mlu2 instanceof C57983MpH) {
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) aqS6S0600000_15.l3;
            C57983MpH c57983MpH = (C57983MpH) abstractC57774Mlu2;
            Object obj3 = c57983MpH.LIZIZ;
            if (obj3 == null) {
                obj3 = null;
            }
            Object obj4 = c57983MpH.LIZJ;
            if (obj4 != null) {
                obj2 = obj4;
            }
            c8hz = (C8HZ) interfaceC88473Ynt.invoke(listState, obj3, obj2);
        } else if (abstractC57774Mlu2 instanceof C57777Mlx) {
            c8hz = (C8HZ) ((InterfaceC88471Ynr) aqS6S0600000_15.l4).invoke(listState, ((C57777Mlx) abstractC57774Mlu2).LIZIZ);
        } else {
            throw new C162476Zf();
        }
        assemSingleListViewModel2.newState(c8hz);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS6S0600000_15.l5;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0600000_15 aqS6S0600000_15, Object obj) {
        Aweme aweme;
        String str;
        int i;
        Aweme aweme2;
        int i2;
        Aweme aweme3;
        C6DL actions = (C6DL) obj;
        o.LJIIIZ(actions, "$this$actions");
        if (((VideoCLACaptionViewModel) aqS6S0600000_15.l0).xv0()) {
            C6DO c6do = new C6DO();
            VideoCLACaptionViewModel videoCLACaptionViewModel = (VideoCLACaptionViewModel) aqS6S0600000_15.l0;
            c6do.LIZJ = R.string.fiq;
            c6do.LJFF = new ACListenerS49S0200000_15(videoCLACaptionViewModel, actions, 26);
            ((ArrayList) actions.LIZIZ).add(c6do);
            ((C34K) aqS6S0600000_15.l1).element = true;
        }
        if ((((VideoCLACaptionViewModel) aqS6S0600000_15.l0).LJLLILLLL || ACW.LIZIZ()) && !C79004UzY.LJJIJIIJI(actions.LIZ)) {
            C6DO c6do2 = new C6DO();
            VideoCLACaptionViewModel videoCLACaptionViewModel2 = (VideoCLACaptionViewModel) aqS6S0600000_15.l0;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS6S0600000_15.l2;
            c6do2.LIZJ = R.string.tmk;
            c6do2.LJFF = new ACListenerS40S0300000_15(videoCLACaptionViewModel2, interfaceC65784Pro, actions, 4);
            ((ArrayList) actions.LIZIZ).add(c6do2);
        }
        String LIZ = SharePrefCache.inst().getSelectedTranslationLanguage().LIZ();
        o.LJIIIIZZ(LIZ, "inst().selectedTranslationLanguage.cache");
        VideoItemParams gv0 = ((VideoCLACaptionViewModel) aqS6S0600000_15.l0).gv0();
        Aweme aweme4 = null;
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        String LJIIIZ = C86670Xzu.LJIIIZ(aweme);
        VideoItemParams gv02 = ((VideoCLACaptionViewModel) aqS6S0600000_15.l0).gv0();
        if (gv02 != null && (aweme3 = gv02.getAweme()) != null) {
            str = aweme3.getAuthorUid();
        } else {
            str = null;
        }
        boolean LJJJJIZL = ujb.o.LJJJJIZL(str, ((RBX) HG3.LJIILL()).getCurUserId(), false);
        if (L2D.LIZ() && !o.LJ(LIZ, LJIIIZ) && !LJJJJIZL) {
            C6DO c6do3 = new C6DO();
            VideoCLACaptionViewModel videoCLACaptionViewModel3 = (VideoCLACaptionViewModel) aqS6S0600000_15.l0;
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS6S0600000_15.l3;
            InterfaceC65784Pro interfaceC65784Pro3 = (InterfaceC65784Pro) aqS6S0600000_15.l4;
            InterfaceC65784Pro interfaceC65784Pro4 = (InterfaceC65784Pro) aqS6S0600000_15.l5;
            if (videoCLACaptionViewModel3.LJLLILLLL) {
                i = R.string.qfs;
            } else {
                i = R.string.qfr;
            }
            c6do3.LIZJ = i;
            VideoItemParams gv03 = videoCLACaptionViewModel3.gv0();
            if (gv03 != null) {
                aweme2 = gv03.getAweme();
            } else {
                aweme2 = null;
            }
            if (Y04.LIZIZ(aweme2)) {
                i2 = R.attr.dj;
            } else {
                i2 = R.attr.dn;
            }
            c6do3.LJ = i2;
            c6do3.LJFF = new ViewOnClickListenerC86668Xzs(videoCLACaptionViewModel3, interfaceC65784Pro2, interfaceC65784Pro3, interfaceC65784Pro4);
            ((ArrayList) actions.LIZIZ).add(c6do3);
        }
        C86661Xzl nv0 = ((VideoCLACaptionViewModel) aqS6S0600000_15.l0).nv0();
        VideoCLACaptionViewModel videoCLACaptionViewModel4 = (VideoCLACaptionViewModel) aqS6S0600000_15.l0;
        boolean z = videoCLACaptionViewModel4.LJLLILLLL;
        EnumC86777Y3x enumC86777Y3x = EnumC86777Y3x.CLICK_SUBTITLE;
        EnumC86689Y0n LLZLL = videoCLACaptionViewModel4.LLZLL();
        Context context = actions.LIZ;
        VideoItemParams gv04 = ((VideoCLACaptionViewModel) aqS6S0600000_15.l0).gv0();
        if (gv04 != null) {
            aweme4 = gv04.getAweme();
        }
        C86661Xzl.LJIIZILJ(nv0, z, enumC86777Y3x, null, "edit", LLZLL, null, null, null, C79004UzY.LJJJIL(context, aweme4), 228);
        ((C34K) aqS6S0600000_15.l1).element = true;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS6S0600000_15(AbstractC57774Mlu abstractC57774Mlu, AbstractC57774Mlu<ITEM> abstractC57774Mlu2, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, SZP szp, InterfaceC88473Ynt<? super C8HZ<ITEM>, ? super Cursor, ? super Cursor, C8HZ<ITEM>> interfaceC88473Ynt, InterfaceC88471Ynr<? super C8HZ<ITEM>, ? super Throwable, C8HZ<ITEM>> interfaceC88471Ynr, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = abstractC57774Mlu;
        this.l1 = abstractC57774Mlu2;
        this.l2 = assemSingleListViewModel;
        this.l3 = szp;
        this.l4 = interfaceC88473Ynt;
        this.l5 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0600000_15(VideoCLACaptionViewModel videoCLACaptionViewModel, C34K c34k, AqS165S0100000_15 aqS165S0100000_15, AqS165S0100000_15 aqS165S0100000_152, AqS165S0100000_15 aqS165S0100000_153, AqS165S0100000_15 aqS165S0100000_154, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoCLACaptionViewModel;
        this.l1 = c34k;
        this.l2 = aqS165S0100000_15;
        this.l3 = aqS165S0100000_152;
        this.l4 = aqS165S0100000_153;
        this.l5 = aqS165S0100000_154;
    }
}
