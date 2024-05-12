package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C107794Kx;
import X.C113554cx;
import X.C16880lQ;
import X.C191937g5;
import X.C191947g6;
import X.C192087gK;
import X.C192137gP;
import X.C192147gQ;
import X.C192307gg;
import X.C192487gy;
import X.C192517h1;
import X.C193227iA;
import X.C193627io;
import X.C1DG;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C249109q6;
import X.C26045AKb;
import X.C26227ARb;
import X.C26231ARf;
import X.C33Q;
import X.C34K;
import X.C3C8;
import X.C52535Kjb;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78926UyI;
import X.C78999UzT;
import X.C8VV;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.EnumC2063587z;
import X.EnumC84576XHg;
import X.FMX;
import X.InterfaceC192177gT;
import X.InterfaceC192297gf;
import X.InterfaceC192387go;
import X.InterfaceC192527h2;
import X.InterfaceC193237iB;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC61213O0r;
import X.InterfaceC64592gB;
import X.InterfaceC74235TBn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M8L;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.RBY;
import X.T16;
import X.TBT;
import X.TBW;
import X.UC0;
import Y.ARunnableS7S0101000_3;
import Y.AfS21S1300000_3;
import Y.AfS53S0100000_1;
import Y.AfS55S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S13S0200000_3;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class CollectionContentFragment extends BasePage implements KPL, DeleteAbility, ReNameAbility, ChangePrivacyAbility, InterfaceC192387go, InterfaceC192297gf, InterfaceC192527h2 {
    public static final int LJLLL = 8;
    public String LJLJJI;
    public String LJLJJL;
    public Integer LJLJJLL;
    public int LJLJL;
    public CollectionDetail LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C5H3 LJLL;
    public final InterfaceC74235TBn<C76800UCe> LJLLI;
    public CollectionManageRequest LJLLILLLL;
    public Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLLJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public int getLayout() {
        return R.layout.auz;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.JBS
    public /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC192387go, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public CollectionContentFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 236);
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionContentViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ, 237);
        C192137gP c192137gP = C192137gP.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), aqS153S0100000_3, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c192137gP, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS153S0100000_3, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c192137gP, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b3;
        this.LJLL = C221108m2.LIZIZ(C192147gQ.LJLIL);
        this.LJLLI = new C192087gK(this);
    }

    @Override // X.InterfaceC192297gf
    public void Ae() {
        M8L.LIZ("click more button");
        FMX.LJIILL("collection_setting_click", new OSZ("collection_video", "enter_from"), new OSZ(this.LJLJJI, "collection_id"));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        String str = this.LJLJJL;
        if (str == null || str.length() == 0 || C192307gg.LIZ()) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("collection_id", String.valueOf(getId()));
            String str2 = Ml().name;
            if (str2 != null) {
                oszArr[1] = new OSZ("collection_name", str2);
                oszArr[2] = new OSZ("enter_from", this.LJLJJL);
                FMX.LJIIL("click_collection_share", C113554cx.LJJLIIIIJ(oszArr));
                Ql();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        CollectionOperationSheetFragment collectionOperationSheetFragment = new CollectionOperationSheetFragment();
        collectionOperationSheetFragment.LJLIL = new InterfaceC192177gT() { // from class: X.7gL
            @Override // X.InterfaceC192177gT
            public final void LIZ() {
                FMX.LJIILL("change_collection_name_click", new OSZ("collection_video", "enter_from"), new OSZ(CollectionContentFragment.this.LJLJJI, "collection_id"));
                CollectionContentFragment.this.Rl();
            }

            @Override // X.InterfaceC192177gT
            public final void LIZIZ() {
                FMX.LJIILL("delete_collection_click", new OSZ("collection_video", "enter_from"), new OSZ(CollectionContentFragment.this.LJLJJI, "collection_id"));
                CollectionContentFragment.this.Jl();
            }
        };
        TuxSheet tuxSheet = C249109q6.LIZ(1).LIZ;
        tuxSheet.LJLLILLLL = collectionOperationSheetFragment;
        C1DG.LJII(mo49getActivity, "activity.supportFragmentManager", tuxSheet, "VideoCollectionOperation");
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public boolean Gl() {
        C34K c34k = new C34K();
        Xl(Ll(), new AqS134S0200000_3(c34k, this, 59));
        return c34k.element;
    }

    public final C73318Sq2 Kl() {
        return (C73318Sq2) this.LJLL.getValue();
    }

    public final VideoCollectionContentViewModel Ll() {
        return (VideoCollectionContentViewModel) this.LJLJLLL.getValue();
    }

    public final CollectionDetail Ml() {
        CollectionDetail collectionDetail = this.LJLJLJ;
        if (collectionDetail != null) {
            return collectionDetail;
        }
        o.LJIJI("initializeDetail");
        throw null;
    }

    public final void Ql() {
        long j;
        boolean z;
        String str;
        String str2;
        Integer num;
        Long l;
        C68322mC c68322mC = new C68322mC();
        Xl(Ll(), new AqS169S0100000_3(c68322mC, (C68322mC<List<Aweme>>) LiveTryModeCountDownThresholdSetting.DEFAULT));
        ShareService LJJJLZIJ = ShareServiceImpl.LJJJLZIJ();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String str3 = Ml().id;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = Ml().uid;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = Ml().name;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = Ml().creatorName;
        if (str7 != null) {
            str4 = str7;
        }
        CollectionDetail.Statistic statistic = Ml().statistic;
        if (statistic != null && (l = statistic.total) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CollectionDetail.Status status = Ml().status;
        if (status == null || (num = status.state) == null || num.intValue() != 3) {
            z = false;
        } else {
            z = true;
        }
        List list = (List) c68322mC.element;
        String str8 = this.LJLJJL;
        CollectionDetail.ShareStruct shareStruct = Ml().shareInfo;
        String str9 = null;
        if (shareStruct != null) {
            str = shareStruct.url;
        } else {
            str = null;
        }
        CollectionDetail.ShareStruct shareStruct2 = Ml().shareInfo;
        if (shareStruct2 != null) {
            str2 = shareStruct2.desc;
        } else {
            str2 = null;
        }
        CollectionDetail.ShareStruct shareStruct3 = Ml().shareInfo;
        if (shareStruct3 != null) {
            str9 = shareStruct3.title;
        }
        LJJJLZIJ.LJIILLIIL(requireContext, new C193627io(str3, str5, str6, str4, j, z, list, str8, str, str2, str9));
    }

    @Override // X.InterfaceC192297gf
    public boolean cc() {
        long j;
        boolean z;
        Integer num;
        Long l;
        C68322mC c68322mC = new C68322mC();
        Xl(Ll(), new AqS169S0100000_3(c68322mC, (C68322mC<List<Aweme>>) 119));
        ShareService LJJJLZIJ = ShareServiceImpl.LJJJLZIJ();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String str = Ml().id;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = Ml().uid;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Ml().name;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Ml().creatorName;
        if (str5 != null) {
            str2 = str5;
        }
        CollectionDetail.Statistic statistic = Ml().statistic;
        if (statistic != null && (l = statistic.total) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CollectionDetail.Status status = Ml().status;
        if (status == null || (num = status.state) == null || num.intValue() != 3) {
            z = false;
        } else {
            z = true;
        }
        return LJJJLZIJ.LJIJ(requireContext, new C193627io(str, str3, str4, str2, j, z, (List) c68322mC.element, this.LJLJJL, null, null, null));
    }

    @Override // X.InterfaceC192297gf
    public void A2() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Xl(Ll(), new AqS134S0200000_3(mo49getActivity, this, 58));
    }

    public final void Jl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Au2S13S0200000_3 au2S13S0200000_3 = new Au2S13S0200000_3(mo49getActivity, this, 2);
        C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
        c26227ARb.LJII = false;
        String string = mo49getActivity.getString(R.string.gbk);
        o.LJIIIIZZ(string, "activity.getString(R.str…_collection_prompt_title)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Ml().name}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        c26227ARb.LJFF(LLLZ);
        c26227ARb.LIZ(R.string.gbx);
        UC0.LIZJ(c26227ARb, new AqS134S0200000_3(au2S13S0200000_3, this, 56));
        new C26231ARf(c26227ARb).LIZLLL();
    }

    public final boolean Nl() {
        String str;
        String str2 = Ml().uid;
        if (str2 != null) {
            RBY LJFF = AccountService.LJIJ().LJFF();
            if (LJFF != null) {
                str = LJFF.getCurUserId();
            } else {
                str = null;
            }
            return o.LJ(str2, str);
        }
        return true;
    }

    @Override // X.InterfaceC192297gf
    public void O5() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Xl(Ll(), new AqS134S0200000_3(mo49getActivity, this, 57));
    }

    public final void Rl() {
        final ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        String string = mo49getActivity.getString(R.string.gb_);
        o.LJIIIIZZ(string, "activity.getString(R.str…w_collection_change_name)");
        String str = Ml().name;
        String string2 = mo49getActivity.getString(R.string.q8h);
        o.LJIIIIZZ(string2, "activity.getString(R.string.save)");
        C193227iA.LIZIZ(supportFragmentManager, string, str, string2, true, false, new InterfaceC193237iB() { // from class: X.7g7
            @Override // X.InterfaceC193237iB
            public final void LIZ(int i, String s) {
                o.LJIIIZ(s, "s");
                if (this.LJLJJI == null) {
                    return;
                }
                FMX.LJIILL("change_collection_name_save", new OSZ("collection_video", "enter_from"), new OSZ(this.LJLJJI, "collection_id"));
                CollectionManageRequest collectionManageRequest = new CollectionManageRequest(3, this.LJLJJI, s, null, null, null, null, null, null, 504, null);
                C73454SsE LJJJ = new C192487gy().LIZJ.LJJJIL(collectionManageRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                CollectionContentFragment collectionContentFragment = this;
                ActivityC45651qj activityC45651qj = mo49getActivity;
                C78999UzT.LJFF(LJJJ.LJJJLIIL(new AfS21S1300000_3(collectionContentFragment, s, collectionManageRequest, activityC45651qj, 0), new AfS53S0100000_1(activityC45651qj, 25)), this.Kl());
            }
        });
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Kl().LIZLLL();
        EventBus.LIZJ().LJIJ(this);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ((InterfaceC88473Ynt) this.LJLLI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int i;
        long j;
        Long l;
        super.onResume();
        CollectionManageRequest collectionManageRequest = this.LJLLILLLL;
        if (collectionManageRequest != null) {
            if (collectionManageRequest.operation == 10) {
                List<String> list = collectionManageRequest.addIds;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                CollectionDetail.Statistic statistic = Ml().statistic;
                if (statistic != null && (l = statistic.total) != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                CollectionDetail.Statistic statistic2 = Ml().statistic;
                if (statistic2 != null) {
                    statistic2.total = Long.valueOf(j + i);
                }
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                C26045AKb c26045AKb = new C26045AKb(requireActivity);
                c26045AKb.LJIIIZ(getResources().getQuantityString(R.plurals.fk, i, String.valueOf(i)));
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LJIIJ();
            }
            this.LJLLILLLL = null;
        }
        Integer num = this.LJLJJLL;
        if (num != null) {
            int intValue = num.intValue();
            View view = getView();
            if (view != null) {
                view.postDelayed(new ARunnableS7S0101000_3(intValue, this, 3), 500L);
            }
            this.LJLJJLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.DeleteAbility
    public void Ip() {
        Jl();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.ReNameAbility
    public void Ni0() {
        Rl();
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.ChangePrivacyAbility
    public void Gs0(final boolean z) {
        boolean z2;
        Integer num;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        CollectionDetail.Status status = Ml().status;
        int i = 1;
        if (status == null || (num = status.state) == null || num.intValue() != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        final boolean z3 = !z2;
        String str = this.LJLJJI;
        if (z3) {
            i = 3;
        }
        C78999UzT.LJFF(new C192487gy().LIZJ.LJJJIL(new CollectionManageRequest(4, str, null, null, null, null, null, null, Integer.valueOf(i), 252, null)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.7gI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                int i2;
                RecyclerView recyclerView;
                AbstractC029409q adapter;
                CollectionDetail.Status status2;
                int i3;
                C2U8.LIZ(new C192157gR(CollectionContentFragment.this.LJLJJI, z3));
                C26045AKb c26045AKb = new C26045AKb(CollectionContentFragment.this);
                if (z3) {
                    i2 = R.string.hzl;
                } else {
                    i2 = R.string.hzg;
                }
                c26045AKb.LJIIIIZZ(i2);
                c26045AKb.LJIIJ();
                CollectionDetail Ml = CollectionContentFragment.this.Ml();
                if (Ml != null && (status2 = Ml.status) != null) {
                    if (z3) {
                        i3 = 3;
                    } else {
                        i3 = 1;
                    }
                    status2.state = i3;
                }
                View view = CollectionContentFragment.this.getView();
                if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.bh0)) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(0);
                }
                if (z) {
                    CollectionContentFragment.this.Ql();
                }
            }
        }, new AfS55S0100000_3(mo49getActivity, 14)), Kl());
    }

    @Override // X.InterfaceC192387go
    public void Hd(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        FMX.LJIILL("remove_unavailable_from_collection", new OSZ("collection_video", "enter_from"));
        C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
        c26227ARb.LJII = false;
        c26227ARb.LJFF(mo49getActivity.getResources().getString(R.string.gcb));
        c26227ARb.LIZ(R.string.gc_);
        UC0.LIZJ(c26227ARb, new AqS107S0300000_3(aweme, this, mo49getActivity, 6));
        new C26231ARf(c26227ARb).LIZLLL();
    }

    public final void Hl(View view) {
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 55));
        EventBus.LIZJ().LJIILJJIL(this);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ReNameAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, DeleteAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ChangePrivacyAbility.class, null);
    }

    public final void Tl(CollectionDetail collectionDetail) {
        o.LJIIIZ(collectionDetail, "<set-?>");
        this.LJLJLJ = collectionDetail;
    }

    @QD3
    public final void handleOnOperationEvent(C191937g5 e) {
        o.LJIIIZ(e, "e");
        CollectionManageRequest collectionManageRequest = e.LJLIL;
        int i = collectionManageRequest.operation;
        if (i == 10) {
            this.LJLLILLLL = collectionManageRequest;
        } else if (i == 2) {
            return;
        }
        Ll().gv0(true);
    }

    @QD3
    public final void handleOnShareCompleteEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ("video_collection", event.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), getView(), event);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF((InterfaceC88473Ynt) this.LJLLI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(this);
            }
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R Xl(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void Yl(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String LLLZ = C16880lQ.LLLZ("enter video collection detail, collection id is %s", Arrays.copyOf(new Object[]{this.LJLJJI}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        M8L.LIZ(LLLZ);
        AssemViewModel.asyncSubscribe$default(Ll(), new TBT() { // from class: X.7gO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLIL;
            }
        }, null, new AqS134S0200000_3(this, view, 60), null, new AqS134S0200000_3(this, view, 61), 10, null);
        VideoCollectionContentViewModel.hv0(Ll());
    }

    @Override // X.InterfaceC192387go
    public void qi(View itemView, Aweme aweme) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(aweme, "aweme");
        Xl(Ll(), new C191947g6(itemView, this, aweme));
    }

    public final void Ol(String str, Object obj, EnumC84576XHg enumC84576XHg) {
        if (enumC84576XHg == EnumC84576XHg.Mutation) {
            Ll().gv0(true);
        }
    }

    public void Pl(String str, boolean z, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, z, enumC2063587z);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R Wl(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    @Override // X.AnonymousClass885
    public /* bridge */ /* synthetic */ void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        Pl(str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (source == EnumC2063587z.MUTATION) {
            Ll().gv0(true);
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R Vl(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw Il(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw Sl(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
