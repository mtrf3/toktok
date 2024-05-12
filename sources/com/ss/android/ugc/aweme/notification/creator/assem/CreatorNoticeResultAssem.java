package com.ss.android.ugc.aweme.notification.creator.assem;

import X.AbstractC029409q;
import X.C213688a4;
import X.C214298b3;
import X.C221018lt;
import X.C221108m2;
import X.C223318pb;
import X.C2NU;
import X.C2U8;
import X.C56649MLd;
import X.C56760MPk;
import X.C56831MSd;
import X.C56832MSe;
import X.C56833MSf;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.EF7;
import X.InterfaceC56828MSa;
import X.KL2;
import X.MDN;
import X.MQ1;
import X.MR4;
import X.MSA;
import X.MT7;
import X.TBT;
import X.V1B;
import X.XKX;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class CreatorNoticeResultAssem extends UIContentAssem implements InterfaceC56828MSa {
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 371));

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public CreatorNoticeResultAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeResultVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 375), C56833MSf.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS159S0100000_9(LIZ2, 376), C56832MSe.INSTANCE, null);
        this.LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 374));
        this.LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 373));
        this.LJLJJLL = V1B.LJZI(new AqS159S0100000_9(this, 372));
    }

    public final C223318pb A3() {
        return (C223318pb) this.LJLJJI.getValue();
    }

    public final CreatorNoticeResultVM x3() {
        return (CreatorNoticeResultVM) this.LJLILLLLZI.getValue();
    }

    public void C3() {
        x3().qv0(MT7.REFRESH);
    }

    public void v3() {
        x3().qv0(MT7.CHANGE_TAB);
    }

    @Override // X.InterfaceC56828MSa
    public final void e3(MusNotice musNotice) {
        CreatorNoticeTabVM creatorNoticeTabVM = (CreatorNoticeTabVM) this.LJLJI.getValue();
        if (musNotice != null) {
            EF7.LIZIZ();
            if (C2NU.LIZ.LIZIZ()) {
                if (musNotice.type == 225) {
                    C56760MPk.LJ(musNotice);
                }
                String str = musNotice.nid;
                o.LJIIIIZZ(str, "notice.nid");
                C2U8.LIZ(new MR4(str));
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(creatorNoticeTabVM), C78613UtF.LIZJ, null, new MDN(musNotice, creatorNoticeTabVM, null), 2);
                creatorNoticeTabVM.setState(new AqS175S0100000_9(musNotice, 532));
                return;
            }
            C221018lt.LIZIZ("Creators_Inbox", "deleteData net unavailable");
            creatorNoticeTabVM.setState(MSA.LJLIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        A3().setNestedScrollEnabledWhenNonTouch(false);
        A3().setOnRefreshListener(new AqS159S0100000_9(this, 770));
        RecyclerView recyclerView = (RecyclerView) this.LJLJJL.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter((AbstractC029409q) this.LJLIL.getValue());
            recyclerView.getContext();
            recyclerView.setLayoutManager(new FixedLinearlayoutManager());
            C56649MLd.LIZ(recyclerView, A3());
            recyclerView.LJIIJJI(new C56831MSd());
            recyclerView.LJIIJJI(new MQ1(recyclerView.getContext()));
            recyclerView.setClipToPadding(false);
            recyclerView.setPadding(0, 0, 0, (int) KL2.LIZJ(recyclerView.getContext(), 19.0f));
            LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
            RecyclerView recyclerView2 = (RecyclerView) this.LJLJJL.getValue();
            o.LJIIIIZZ(recyclerView2, "recyclerView");
            LJIIIIZZ.LIZ(recyclerView2);
        }
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.MSg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), new AqS175S0100000_9(this, 392), null, new AqS175S0100000_9(this, 393), 8, null);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((MT0) obj).LJLJLJ);
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 74), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJL;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 75), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 76), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 73), 4);
    }
}
