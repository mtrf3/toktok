package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.AbstractC030109x;
import X.C16880lQ;
import X.C17N;
import X.C213688a4;
import X.C214348b8;
import X.C219248j2;
import X.C219608jc;
import X.C219858k1;
import X.C219868k2;
import X.C219888k4;
import X.C219988kE;
import X.C221018lt;
import X.C221108m2;
import X.C32151Nz;
import X.C50420Jqa;
import X.C51029K0z;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73305Spp;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC57784Mm4;
import X.InterfaceC74236TBo;
import X.QD3;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import android.os.Handler;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.cell.AddYoursHubItemCell;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class AddYoursHubListAssem extends ReusedUISlotAssem<AddYoursHubListAssem> implements C8XO<C219988kE> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final InterfaceC115514g7 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final Handler LLFZ;
    public final C62822Ol8 LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();

    static {
        TBT tbt = new TBT(AddYoursHubListAssem.class, "hubListViewModel", "getHubListViewModel()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.gj;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AddYoursHubListAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursHubListViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 1427), null, C219888k4.INSTANCE, null, null);
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1424));
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1425));
        this.LLFZ = new Handler(C16880lQ.LLJJJJ());
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1426));
    }

    public final AddYoursHubListViewModel m4() {
        return (AddYoursHubListViewModel) this.LLFF.LIZ(this, LLII[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        n4();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void n4() {
        C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.kf_));
        this.LLFZ.removeCallbacksAndMessages(null);
    }

    @Override // X.C8XO
    public final void F0(C219988kE c219988kE) {
        String str;
        Integer num;
        C219608jc mB;
        C219988kE item = c219988kE;
        o.LJIIIZ(item, "item");
        if (item.LJLIL == -1) {
            return;
        }
        AddYoursHubListViewModel m4 = m4();
        AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) this.LLFFF.getValue();
        Integer num2 = null;
        if (addYoursHubAbility != null && (mB = addYoursHubAbility.mB()) != null) {
            str = mB.LIZ;
        } else {
            str = null;
        }
        m4.LJLIL = str;
        m4().LJLILLLLZI = item.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hubSubType, subType = ");
        LIZ.append(item.LJLIL);
        LIZ.append(", addYoursHubAbility = ");
        Object value = this.LLFFF.getValue();
        if (value != null) {
            num = Integer.valueOf(value.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", addYoursTabAbility = ");
        Object value2 = this.LLFII.getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.hashCode());
        }
        LIZ.append(num2);
        LIZ.append(", assem = ");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        m4().manualListRefresh();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C219988kE c219988kE) {
        return true;
    }

    @QD3
    public final void onTopicChanged(C219248j2 ev) {
        o.LJIIIZ(ev, "ev");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update topic event: ");
        LIZ.append(ev.LJLIL.getTopicId());
        C221018lt.LJFF("AddYoursHubListAssem", X1D.LIZIZ(LIZ));
        AddYoursHubListViewModel m4 = m4();
        AddYoursTopic topic = ev.LJLIL;
        m4.getClass();
        o.LJIIIZ(topic, "topic");
        m4.withState(new AqS134S0200000_3(m4, topic, 259));
    }

    @QD3
    public final void onVideoEvent(C50420Jqa ev) {
        String str;
        o.LJIIIZ(ev, "ev");
        if (ev.LJLIL == 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delete aweme event, param: ");
            LIZ.append(ev.LJLILLLLZI);
            C221018lt.LJFF("AddYoursHubListAssem", X1D.LIZIZ(LIZ));
            Object obj = ev.LJLILLLLZI;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                AddYoursHubListViewModel m4 = m4();
                m4.getClass();
                m4.withState(new AqS57S1100000_3(str, m4, 37));
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        c73305Spp.setTopMargin(C32151Nz.LJIIZILJ(146));
        c73305Spp.setButtonTopMargin(C32151Nz.LJIIZILJ(20));
        this.LLFZ.postDelayed(new ARunnableS39S0100000_3(new ARunnableS39S0100000_3(this, 174), 173), 300L);
        SYL syl = (SYL) _$_findCachedViewById(R.id.i04);
        AbstractC030109x itemAnimator = syl.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        syl.LLLF.LJZL(AddYoursHubItemCell.class);
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add_yours_hub_list_");
        LIZ.append(((C219988kE) C51029K0z.LJIILLIIL(this)).LJLIL);
        String name = X1D.LIZIZ(LIZ);
        o.LJIIIZ(name, "name");
        c57939MoZ.LJI = name;
        syl.setListConfig(c57939MoZ);
        syl.LJLJLLL(m4().getConfig());
        AddYoursHubListViewModel m4 = m4();
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        o.LJIIIIZZ(state, "state");
        m4.setListState(state);
        AssemViewModel.asyncSubscribe$default(m4(), new TBT() { // from class: X.8k0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C219708jm c219708jm = (C219708jm) obj;
                c219708jm.getClass();
                return C208708Ha.LIZLLL(c219708jm);
            }
        }, null, new AqS169S0100000_3(this, 781), null, new AqS169S0100000_3(this, 783), 10, null);
        C8YN.LJII(this, m4(), new TBT() { // from class: X.8jn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219708jm) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C219858k1.LJLIL, 4);
        C8YN.LJII(this, m4(), new TBT() { // from class: X.8jo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219708jm) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C219868k2.LJLIL, 4);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C219988kE c219988kE) {
    }
}
