package com.ss.android.ugc.aweme.paidcontent.assem;

import X.A3Q;
import X.A3U;
import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C25594A2s;
import X.C25612A3k;
import X.C25616A3o;
import X.C25617A3p;
import X.C25619A3r;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9BD;
import X.InterfaceC65784Pro;
import X.SI2;
import X.SYL;
import X.TBT;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionDetailVideoListAssem extends UIListContentAssem<PaidContentDetailVideoListViewModel> {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C214378bB LJLJJI;
    public final C62822Ol8 LJLJJL;
    public C73305Spp LJLJJLL;

    public PaidContentCollectionDetailVideoListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C25594A2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailPaymentViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 549), C25616A3o.INSTANCE, null);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 551);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class);
        C25617A3p c25617A3p = C25617A3p.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 550);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ2, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c25617A3p, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 548));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final PaidContentDetailVideoListViewModel A3() {
        return (PaidContentDetailVideoListViewModel) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 4;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        A3().hv0().LIZ();
    }

    @Override // X.C8W0
    public final void onResume() {
        List<ITEM> listGetAll;
        super.onResume();
        PaidContentDetailVideoListViewModel A3 = A3();
        if (!A3.hv0().isEmpty() && (listGetAll = A3.listGetAll()) != 0) {
            for (ITEM item : listGetAll) {
                Aweme aweme = item.LJLIL.getAweme();
                if (aweme != null) {
                    IPaidContentCollectionPlayProgressService hv0 = A3.hv0();
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    long j = 1000;
                    Long LJFF = hv0.LJFF(aweme.mPaidContentInfo.getPaidContentResumeTimestamp() * j, aid);
                    if (LJFF != null) {
                        long longValue = LJFF.longValue() / j;
                        aweme.mPaidContentInfo.setPaidContentResumeTimestamp(longValue);
                        boolean isComplete = item.LJLIL.isComplete();
                        if ((aweme.mPaidContentInfo.getPaidContentResumeTimestamp() * 1.0d) / (item.LJLIL.getVideoDuration() / j) >= A3.hv0().LJ()) {
                            isComplete = true;
                        }
                        int listIndexOf = A3.listIndexOf((PaidContentDetailVideoListViewModel) item);
                        PaidVideoItem model = PaidVideoItem.copy$default(item.LJLIL, 0L, false, false, aweme, isComplete, 0L, longValue, 0L, 167, null);
                        boolean z = item.LJLILLLLZI;
                        boolean z2 = item.LJLJI;
                        o.LJIIIZ(model, "model");
                        A3.listSetItemAt(listIndexOf, (int) new A3U(model, z, z2));
                    }
                }
            }
        }
        PowerAdapter powerAdapter = v3().LLLF;
        powerAdapter.getClass();
        powerAdapter.LLIILZL(new SI2(powerAdapter));
        PaidContentDetailVideoListViewModel A32 = A3();
        A32.getClass();
        A32.withState(new AqS135S0200000_4((List) new ArrayList(), (List<PaidVideoItem>) A32, (PaidContentDetailVideoListViewModel) 137));
    }

    public final void E3(C73306Spq c73306Spq) {
        Context context;
        PaidContentImageSettings.LIZ.getClass();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(PaidContentImageSettings.LIZ().couldntLoadImage.light);
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            context = c73305Spp.getContext();
        } else {
            context = null;
        }
        LJIIIIZZ.LIZJ = context;
        LJIIIIZZ.LJIIIZ(new C25612A3k(this, c73306Spq));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJLL = (C73305Spp) getContainerView().findViewById(R.id.hfz);
        SYL v3 = v3();
        getContainerView().getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.A3l
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                A3V a3v = (A3V) obj;
                a3v.getClass();
                return C208708Ha.LIZLLL(a3v);
            }
        }, null, null, null, new AqS170S0100000_4(this, 482), 14, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.A3i
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A3V) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 147), 4);
        if (A3Q.LIZ()) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(v3().getContext()), R.layout.ais, v3(), false);
            C8YN.LJII(this, A3(), new TBT() { // from class: X.A3j
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((A3V) obj).LJLJJL;
                }
            }, C213688a4.LIZLLL(), new C25619A3r((TuxTextView) LLLLIILL.findViewById(R.id.hgd), (TuxIconView) LLLLIILL.findViewById(R.id.hgc), LLLLIILL, this), 4);
        }
    }
}
