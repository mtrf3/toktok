package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C242649fg;
import X.C242779ft;
import X.C29S;
import X.C3C5;
import X.C44008HOy;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C76800UCe;
import X.C78926UyI;
import X.C78939UyV;
import X.C79045V0n;
import X.C86V;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightsFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C214298b3 LJLIL;
    public long LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public HighlightsFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightsListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 374);
        C242779ft c242779ft = C242779ft.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c242779ft, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c242779ft, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String LJFF = C86V.LJFF(R.string.fa9);
        o.LJIIIIZZ(LJFF, "getString(R.string.ecom_…highlight_bag_page_title)");
        c9kf.LIZJ = LJFF;
        c235119Kp.LIZJ = c9kf;
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                c235119Kp.LIZJ(LJI.intValue());
            }
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 373));
        c235119Kp.LIZLLL(LIZJ);
        return c235119Kp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLIL.getValue();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
        String roomId = highlightsListViewModel.LJLILLLLZI;
        String authorId = highlightsListViewModel.LJLJI;
        boolean LJ = o.LJ(((C242649fg) highlightsListViewModel.getState()).LJLIL, new C72912tb(Boolean.TRUE));
        boolean z = highlightsListViewModel.LJLJJI;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        Map LIZIZ = C44008HOy.LIZIZ(roomId, authorId, LJ, z);
        LIZIZ.put("stay_time", Long.valueOf(currentTimeMillis));
        b.LJJIJIIJI("livesdk_tiktokec_stay_page", LIZIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLILLLLZI = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) arguments.getParcelable("uri")) != null) {
            String LJIJJLI = C78939UyV.LJIJJLI(uri, "room_id");
            if (LJIJJLI == null) {
                LJIJJLI = CardStruct.IStatusCode.DEFAULT;
            }
            String LJIJJLI2 = C78939UyV.LJIJJLI(uri, "author_id");
            if (LJIJJLI2 == null && (LJIJJLI2 = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) == null) {
                LJIJJLI2 = "";
            }
            HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLIL.getValue();
            highlightsListViewModel.LJLILLLLZI = LJIJJLI;
            highlightsListViewModel.LJLJI = LJIJJLI2;
        }
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 396));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aq2, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
