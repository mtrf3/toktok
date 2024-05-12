package com.ss.android.ugc.aweme.feed.landscape;

import X.C214348b8;
import X.C217318fv;
import X.C217328fw;
import X.C217338fx;
import X.C217348fy;
import X.C217388g2;
import X.C217628gQ;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C5H3;
import X.C62623Ohv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7MY;
import X.C8VR;
import X.C8YN;
import X.EnumC210578Of;
import X.EnumC215578d7;
import X.InterfaceC217378g1;
import X.InterfaceC55102Lju;
import X.KR8;
import X.O6R;
import X.ORZ;
import X.TBT;
import Y.IDComparatorS31S0000000_3;
import Y.IDLListenerS191S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeInteractEntrancesContainer extends BaseContainer implements LandscapeEntrancesControlAbility, InterfaceC55102Lju {
    public final C62822Ol8 LLFFF;
    public final C221138m5 LLFII;
    public final C221138m5 LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public View LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public String LLIIIJ;
    public boolean LLIIIL;
    public final int LLIIIZ;
    public final int LLIIJI;
    public final int LLIIJLIL;
    public final int LLIIL;
    public final List<InterfaceC217378g1> LLIILII;
    public final IDLListenerS191S0100000_3 LLIILZL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1215530286) {
            return null;
        }
        return this;
    }

    public LandscapeInteractEntrancesContainer() {
        new LinkedHashMap();
        this.LLFFF = C221108m2.LIZIZ(C217388g2.LJLIL);
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 401));
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C217338fx.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoDescVM.class), C217348fy.INSTANCE);
        this.LLIIII = -1;
        this.LLIIIILZ = -1;
        this.LLIIIJ = "";
        this.LLIIIZ = C7MY.LIZIZ(56);
        this.LLIIJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        this.LLIIJLIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        this.LLIIL = C7MY.LIZIZ(30);
        this.LLIILII = new ArrayList();
        this.LLIILZL = new IDLListenerS191S0100000_3(this, 5);
    }

    public final InteractBizTopAreaAttachAbility p4() {
        return (InteractBizTopAreaAttachAbility) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return EnumC210578Of.LANDSCAPE_INTERACT_ENTRANCES_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility
    public final void Fp0(boolean z) {
        if (!this.LLIIIL) {
            return;
        }
        List<InterfaceC217378g1> list = this.LLIILII;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<InterfaceC217378g1> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().F1()) {
                if (z) {
                    View view = this.LLII;
                    if (view == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                View view2 = this.LLII;
                if (view2 == null) {
                    return;
                }
                view2.setVisibility(8);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility
    public final void XQ(InterfaceC217378g1 interfaceC217378g1) {
        Object obj;
        EnumC215578d7 enumC215578d7;
        if (interfaceC217378g1 != null && !((ArrayList) this.LLIILII).contains(interfaceC217378g1)) {
            ((ArrayList) this.LLIILII).add(interfaceC217378g1);
        }
        List<InterfaceC217378g1> list = this.LLIILII;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC217378g1) next).F1()) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            View view = this.LLII;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC217378g1) it2.next()).b2();
        }
        View view2 = this.LLII;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((InterfaceC217378g1) next2).LLII()) {
                arrayList3.add(next2);
            }
        }
        List LLILII = ORZ.LLILII(new IDComparatorS31S0000000_3(2), arrayList3);
        if (LLILII.isEmpty()) {
            obj = ListProtector.get(arrayList, 0);
        } else {
            obj = ListProtector.get(LLILII, 0);
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            InterfaceC217378g1 interfaceC217378g12 = (InterfaceC217378g1) it4.next();
            if (o.LJ(interfaceC217378g12, obj)) {
                enumC215578d7 = EnumC215578d7.SHOW_FULL_ENTRANCE;
            } else if (interfaceC217378g12.F1()) {
                enumC215578d7 = EnumC215578d7.SHOW_ICON_ONLY;
            } else {
                enumC215578d7 = EnumC215578d7.HIDE;
            }
            interfaceC217378g12.LLJIJIL(enumC215578d7);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        int i = a1().LIZ;
        C217628gQ c217628gQ = C217628gQ.LIZIZ;
        if (c217628gQ.LJIIIZ(i, item.getAweme())) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(LandscapeEntranceAssem.class));
        }
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        if (c62623Ohv.LJFF(item.getAweme())) {
            C8VR.LIZJ(this, c62623Ohv.LJIIJ());
        }
        if (!c217628gQ.LJI(i, item.getAweme())) {
            View view = this.LLII;
            if (view != null) {
                view.setVisibility(8);
            }
            this.LLIIIL = false;
            return;
        }
        this.LLIIIL = true;
        View view2 = this.LLII;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLFII.getValue();
        if (rootCellCommonAbility == null) {
            return;
        }
        rootCellCommonAbility.o7(new IDLListenerS191S0100000_3(this, 0));
    }

    public final void n4(int i) {
        RelativeLayout.LayoutParams layoutParams;
        View view = this.LLII;
        if (view == null) {
            return;
        }
        if (o.LJ(this.LLIIIJ, "align_video")) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null && layoutParams.topMargin == this.LLIIJLIL + i) {
                return;
            }
        }
        this.LLIIIJ = "align_video";
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(8);
        layoutParams4.bottomMargin = 0;
        layoutParams4.addRule(10);
        layoutParams4.topMargin = i + this.LLIIJLIL;
        view.setLayoutParams(layoutParams4);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLII = getContainerView().findViewById(R.id.ffk);
        C8VR.LIZ(this, new AqS169S0100000_3(this, 220));
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8g0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C217328fw.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.83Z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83X) obj).LJLJLJ;
            }
        }, null, C217318fv.LJLIL, 6);
    }
}
