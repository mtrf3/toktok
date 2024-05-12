package com.ss.android.ugc.aweme.paidcontent.manageseries.assem;

import X.A0J;
import X.A0Z;
import X.A13;
import X.A19;
import X.A1A;
import X.A1M;
import X.C16880lQ;
import X.C188727au;
import X.C1C8;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C25524A0a;
import X.C25547A0x;
import X.C39061g6;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.DialogC25756A8y;
import X.FMX;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDLListenerS7S0300000_4;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesNotificationViewModel;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageSeriesListAssem extends UISlotAssem {
    public RecyclerView LJLJLLL;
    public TuxTextView LJLL;
    public TuxIconView LJLLI;
    public TuxIconView LJLLILLLL;
    public TuxTextView LJLLJ;
    public LinearLayout LJLLL;
    public TuxTextView LJLLLL;
    public final C214298b3 LJLLLLLL;
    public final C214298b3 LJLZ;
    public final C55749LuL LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public C1C8 LL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aij;
    }

    public ManageSeriesListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ManageSeriesViewModel.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 584), A19.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ManageSeriesNotificationViewModel.class);
        this.LJLZ = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 586), A1A.INSTANCE, null);
        this.LJZ = new C55749LuL(C47704Ins.LIZJ(this, C25524A0a.class, "manage_series_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 583));
        this.LJZL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 582));
    }

    public final C25524A0a H3() {
        return (C25524A0a) this.LJZ.getValue();
    }

    public final DialogC25756A8y I3() {
        return (DialogC25756A8y) this.LJZL.getValue();
    }

    public final A13 K3() {
        return (A13) this.LJZI.getValue();
    }

    public final ManageSeriesViewModel L3() {
        return (ManageSeriesViewModel) this.LJLLLLLL.getValue();
    }

    public final void M3(ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo) {
        String str = managementPagePaidCollectionInfo.collectionId;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = H3().LJLILLLLZI;
        String str3 = H3().LJLIL;
        int i = managementPagePaidCollectionInfo.numVideos;
        ManagementPagePaidCollectionStatus status = managementPagePaidCollectionInfo.status;
        String str4 = H3().LJLJI;
        Boolean bool = H3().LJLJJI;
        o.LJIIIZ(status, "status");
        C188727au c188727au = new C188727au();
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("enter_from", str2);
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("collection_id", str3);
        c188727au.LIZLLL(i, "video_cnt");
        String lowerCase = status.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("collection_status", lowerCase);
        if (str4 == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("entry_point", str4);
        c188727au.LIZLLL(o.LJ(bool, Boolean.TRUE) ? 1 : 0, "is_new_collection");
        FMX.LJIIL("click_series_upload_new_video", c188727au.LIZ);
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        A0Z.LIZLLL(H3().LJLILLLLZI, H3().LJLJI, uuid);
        C39061g6 c39061g6 = new C39061g6("aweme://openShoot");
        c39061g6.LIZIZ("type", "series_creation");
        c39061g6.LIZIZ("collection_id", managementPagePaidCollectionInfo.collectionId);
        c39061g6.LIZIZ("collection_cover_url", managementPagePaidCollectionInfo.coverUrl);
        c39061g6.LIZIZ("collection_name", managementPagePaidCollectionInfo.name);
        String str6 = ((A0J) this.LJLZ.getValue().getState()).LJLJI;
        if (str6 != null) {
            str5 = str6;
        }
        c39061g6.LIZIZ("entry_point", str5);
        c39061g6.LIZIZ("shoot_way", "series_video_upload");
        c39061g6.LIZIZ("enter_from", H3().LJLILLLLZI);
        c39061g6.LIZIZ("creation_id", uuid);
        SmartRouter.buildRoute(getContext(), c39061g6.LIZJ()).open();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (RecyclerView) view.findViewById(R.id.gdt);
        this.LJLL = (TuxTextView) view.findViewById(R.id.ge1);
        this.LJLLI = (TuxIconView) view.findViewById(R.id.gd3);
        this.LJLLILLLL = (TuxIconView) view.findViewById(R.id.gd_);
        this.LJLLJ = (TuxTextView) view.findViewById(R.id.gd9);
        this.LJLLL = (LinearLayout) view.findViewById(R.id.gda);
        this.LJLLLL = (TuxTextView) view.findViewById(R.id.gdr);
        TuxIconView tuxIconView = this.LJLLI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 112));
        }
        TuxIconView tuxIconView2 = this.LJLLILLLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS24S0100000_4(this, 113));
        }
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS24S0100000_4(this, 110));
        }
        TuxTextView tuxTextView2 = this.LJLLLL;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS24S0100000_4(this, 111));
        }
        TuxIconView tuxIconView3 = this.LJLLI;
        if (tuxIconView3 != null && !A1M.LIZ.getBoolean("add_more_videos_tooltip_shown", false)) {
            tuxIconView3.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS7S0300000_4(tuxIconView3, this, view, 1));
        }
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A0n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJLLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 157), 4);
        RecyclerView recyclerView = this.LJLJLLL;
        if (recyclerView != null) {
            recyclerView.setAdapter(K3());
            this.LL = new C1C8(new C25547A0x(K3()));
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A12
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 152), 4);
        C8YN.LJIIJ(this, L3(), new TBT() { // from class: X.A11
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJLJ;
            }
        }, new TBT() { // from class: X.A0t
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLL;
            }
        }, C213688a4.LIZLLL(), new IDqS429S0100000_4(this, 8), 8);
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A0u
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 155), 4);
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A1D
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLLI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 156), 4);
        L3().asyncSubscribe(new TBT() { // from class: X.A0o
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 492), new AqS154S0100000_4(this, 585), new AqS170S0100000_4(this, 493));
        L3().asyncSubscribe(new TBT() { // from class: X.A0p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 494), new AqS154S0100000_4(this, 587), new AqS170S0100000_4(this, 495));
        L3().asyncSubscribe(new TBT() { // from class: X.A0q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 496), new AqS154S0100000_4(this, 588), new AqS170S0100000_4(this, 497));
        L3().asyncSubscribe(new TBT() { // from class: X.A0r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 490), new AqS154S0100000_4(this, 581), new AqS170S0100000_4(this, 491));
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A0w
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLLJ;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 153), 4);
        C8YN.LJII(this, L3(), new TBT() { // from class: X.A1C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLLILLLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 154), 4);
    }
}
