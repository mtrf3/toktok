package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C176996x5;
import X.C188727au;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C73969T1h;
import X.C76800UCe;
import X.C770830u;
import X.C78897Uxp;
import X.C90203gO;
import X.C90903hW;
import X.C9KF;
import X.EFJ;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC789838c;
import X.InterfaceC92693kP;
import X.T16;
import Y.ACListenerS21S0100000_1;
import Y.IDxS303S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VGSupportPanelFragment extends Fragment implements InterfaceC219588ja {
    public static boolean LJLLJ;
    public C176996x5 LJLIL;
    public C90203gO LJLILLLLZI;
    public TuxSheet LJLJI;
    public Aweme LJLJJI;
    public String LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public GiftSupporterPanelResponse LJLJL;
    public final InterfaceC789838c LJLJLJ;
    public C223338pd LJLJLLL;
    public RecyclerView LJLL;
    public LinearLayout LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public VGSupportPanelFragment() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LJLJLJ = C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.tp_);
        o.LJIIIIZZ(string, "getString(R.string.videogifts_comments_bar)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 49));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    public final void vl() {
        VGGETSupporterPanelService vGGETSupporterPanelService = (VGGETSupporterPanelService) this.LJLJLJ.create(VGGETSupporterPanelService.class);
        C223338pd c223338pd = this.LJLJLLL;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
            vGGETSupporterPanelService.getSupporterPanel(this.LJLJJL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS303S0100000_1(this, 2));
        } else {
            o.LJIJI("tuxDualBallView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.LJLJJL = str;
        View findViewById = view.findViewById(R.id.kud);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.supporter_panel_list)");
        this.LJLL = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.kue);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.supporter_panel_loader)");
        this.LJLJLLL = (C223338pd) findViewById2;
        View findViewById3 = view.findViewById(R.id.kua);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.s…orter_panel_error_layout)");
        this.LJLLI = (LinearLayout) findViewById3;
        C90203gO c90203gO = new C90203gO();
        this.LJLILLLLZI = c90203gO;
        c90203gO.LJLJJI = new AqS167S0100000_1(this, 36);
        RecyclerView recyclerView = this.LJLL;
        if (recyclerView != null) {
            C90203gO c90203gO2 = this.LJLILLLLZI;
            if (c90203gO2 != null) {
                recyclerView.setAdapter(c90203gO2);
                RecyclerView recyclerView2 = this.LJLL;
                if (recyclerView2 != null) {
                    getContext();
                    recyclerView2.setLayoutManager(new LinearLayoutManager());
                    GiftSupporterPanelResponse giftSupporterPanelResponse = this.LJLJL;
                    if (giftSupporterPanelResponse == null) {
                        vl();
                    } else {
                        C90203gO c90203gO3 = this.LJLILLLLZI;
                        if (c90203gO3 != null) {
                            wl(c90203gO3, giftSupporterPanelResponse, false);
                        } else {
                            o.LJIJI("adapter");
                            throw null;
                        }
                    }
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kub);
                    tuxTextView.setClickable(true);
                    C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0100000_1(this, 32));
                    C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 33), view.findViewById(R.id.kuf));
                    return;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.pp, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.kuf);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        Context context = LLLLIILL.getContext();
        o.LJIIIIZZ(context, "context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        C78897Uxp.LJJJJJL(findViewById, C32151Nz.LJIIZILJ(2));
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    public final void wl(C90203gO c90203gO, GiftSupporterPanelResponse giftSupporterPanelResponse, boolean z) {
        GiftSupporterPanelTopBanner giftSupporterPanelTopBanner;
        List<GiftAndSenders> list;
        String str;
        String str2;
        Integer num;
        String str3;
        List<GiftAndSenders> list2;
        int i;
        GiftSupporterPanelInfo giftSupporterPanelInfo = giftSupporterPanelResponse.data;
        if (giftSupporterPanelInfo != null) {
            giftSupporterPanelTopBanner = giftSupporterPanelInfo.topBanner;
        } else {
            giftSupporterPanelTopBanner = null;
        }
        c90203gO.LJLIL = giftSupporterPanelTopBanner;
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "gift_summary_stripe");
            c188727au.LJIIIZ("enter_method", "click");
            Aweme aweme = this.LJLJJI;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme aweme2 = this.LJLJJI;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("author_id", str2);
            if (giftSupporterPanelInfo != null && (list2 = giftSupporterPanelInfo.otherGifts) != null) {
                int size = list2.size();
                if (giftSupporterPanelInfo.topBanner != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                num = Integer.valueOf(size + i);
            } else {
                num = null;
            }
            c188727au.LJFF(num, "num_results");
            if (giftSupporterPanelTopBanner != null) {
                str3 = "premium";
            } else {
                str3 = "";
            }
            c188727au.LJIIIZ("banner", str3);
            FMX.LJIIL("show_top_gift_list", c188727au.LIZ);
        }
        if (giftSupporterPanelInfo != null && (list = giftSupporterPanelInfo.otherGifts) != null) {
            c90203gO.LJLILLLLZI = list;
        }
        c90203gO.notifyDataSetChanged();
        RecyclerView recyclerView = this.LJLL;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        } else {
            o.LJIJI("recyclerView");
            throw null;
        }
    }
}
