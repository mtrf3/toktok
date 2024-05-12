package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.ActivityC45651qj;
import X.B83;
import X.BZI;
import X.C06490Nh;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15510jD;
import X.C15640jQ;
import X.C16880lQ;
import X.C1EW;
import X.C28201B4z;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29S;
import X.C2A4;
import X.C2A7;
import X.C32562CqE;
import X.C3C5;
import X.C47121t6;
import X.C47261Igj;
import X.C65814PsI;
import X.C73933Szx;
import X.C76800UCe;
import X.C81705W4v;
import X.C86881Y7x;
import X.C90903hW;
import X.CFX;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.W4R;
import X.W5I;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscribeInviteLetterFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public String LJLIL;
    public String LJLILLLLZI;
    public C2A4 LJLJI;
    public C2A7 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public ImageView LJLJL;
    public LinearLayout LJLJLJ;

    public SubscribeInviteLetterFragment() {
        new LinkedHashMap();
        this.LJLIL = "";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("letter_enter_from");
            o.LJI(string);
            this.LJLIL = string;
            this.LJLILLLLZI = arguments.getString("letter_activity_id", null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.f64);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_letter_icon)");
        this.LJLJI = (C2A4) findViewById;
        View findViewById2 = view.findViewById(R.id.axs);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_open_letter)");
        this.LJLJJI = (C2A7) findViewById2;
        View findViewById3 = view.findViewById(R.id.f63);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_letter_bg)");
        this.LJLJL = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.m9l);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_inviter_name)");
        this.LJLJJL = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.m98);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_invitation_info)");
        this.LJLJJLL = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.g7e);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.ln_inviters)");
        this.LJLJLJ = (LinearLayout) findViewById6;
        String LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_invite_letter_bg.png");
        ImageView imageView = this.LJLJL;
        if (imageView != null) {
            ImageModel imageModel = new ImageModel(LJIIIZ, C47261Igj.LJJIJ(LJIIIZ));
            boolean z = false;
            C15640jQ.LJ(imageView, imageModel, 0);
            C2A4 c2a4 = this.LJLJI;
            if (c2a4 != null) {
                c2a4.setVisibility(0);
                Uri parse = UriProtector.parse(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_2"), "live_subscribe_invitation_letter.webp"));
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJI(parse);
                LIZJ.LJIIJ = true;
                LIZJ.LJII = new C32562CqE();
                W4R LIZ = LIZJ.LIZ();
                C2A4 c2a42 = this.LJLJI;
                if (c2a42 != null) {
                    c2a42.setController(LIZ);
                    String str = this.LJLILLLLZI;
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        InterfaceC30442Bx8.LJLLILLLL.LIZ(Boolean.FALSE);
                        C2A7 c2a7 = this.LJLJJI;
                        if (c2a7 != null) {
                            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 175));
                            C65814PsI.LIZ().getClass();
                            ((InterfaceC29856Bng) C1EW.LIZ(((SubscribeApi) C65814PsI.LIZJ(SubscribeApi.class)).getInviterList(4)).LIZJ(C73933Szx.LIZLLL(this))).LIZJ(new AfS57S0100000_5(this, 266), C28201B4z.LJLIL);
                        } else {
                            o.LJIJI("btnOpen");
                            throw null;
                        }
                    } else {
                        C47121t6 c47121t6 = this.LJLJJLL;
                        if (c47121t6 != null) {
                            String LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_sub_optin_envelop_desc");
                            if (LIZ2 == null) {
                                LIZ2 = C15380j0.LJIILJJIL(R.string.oda);
                            }
                            c47121t6.setText(LIZ2);
                            C2A7 c2a72 = this.LJLJJI;
                            if (c2a72 != null) {
                                String LIZ3 = C86881Y7x.LIZIZ().LIZ("pm_mt_sub_optin_envelop_btn");
                                if (LIZ3 == null) {
                                    LIZ3 = C15380j0.LJIILJJIL(R.string.od_);
                                }
                                c2a72.setText(LIZ3);
                                String str2 = this.LJLILLLLZI;
                                if (str2 != null) {
                                    InterfaceC30442Bx8.LJLLJ.LIZLLL(Boolean.TRUE, str2);
                                }
                                C2A7 c2a73 = this.LJLJJI;
                                if (c2a73 != null) {
                                    C16880lQ.LJJIII(c2a73, new ACListenerS25S0100000_5(this, 176));
                                } else {
                                    o.LJIJI("btnOpen");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("btnOpen");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tvInvitationContent");
                            throw null;
                        }
                    }
                    BZI LIZ4 = C28787BRn.LIZ("livesdk_subscription_invitation_popup_show");
                    LIZ4.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                    C06490Nh.LIZLLL(LIZ4, this.LJLIL, "entrance", "live_take_page", "event_page");
                    return;
                }
                o.LJIJI("ivLetterAnimView");
                throw null;
            }
            o.LJIJI("ivLetterAnimView");
            throw null;
        }
        o.LJIJI("ivBackground");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4h, viewGroup, false);
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
