package X;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Uid, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77955Uid implements InterfaceC28344BAm {
    public final RankPageController LJLIL;
    public final InterfaceC78023Ujj LJLILLLLZI;
    public boolean LJLJI;
    public final HandlerC28345BAn LJLJJI = new HandlerC28345BAn(this);
    public View LJLJJL;
    public final RankTypeV2 LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;

    public final void LIZ(RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra) {
        InterfaceC78023Ujj interfaceC78023Ujj;
        int i;
        int i2;
        String str;
        View view;
        InterfaceC77978Uj0 interfaceC77978Uj0;
        LayoutInflater J2;
        if (!this.LJLJI && this.LJLJL && weeklyRookieRankExtra != null && (interfaceC78023Ujj = this.LJLILLLLZI) != null && interfaceC78023Ujj.C0()) {
            this.LJLJI = true;
            this.LJLJJI.removeMessages(1);
            if (this.LJLJLJ && weeklyRookieRankExtra.lastrankanchorbeyondthreshold) {
                if (o.LJ(this.LJLJJLL, RankTypeV2.LIZJ)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(C30725C4b.LIZ()));
                    int i3 = calendar.get(3);
                    C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.r;
                    Long showedTime = c48459J0d.LIZJ();
                    o.LJIIIIZZ(showedTime, "showedTime");
                    calendar.setTime(new Date(showedTime.longValue()));
                    int i4 = calendar.get(3);
                    c48459J0d.LIZ(Long.valueOf(C30725C4b.LIZ()));
                    if (i3 == i4) {
                        return;
                    }
                } else {
                    RankTypeV2 rankTypeV2 = this.LJLJJLL;
                    if (rankTypeV2 != null) {
                        i = rankTypeV2.type;
                    } else {
                        i = 0;
                    }
                    String valueOf = String.valueOf(i);
                    C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.h3;
                    java.util.Map<String, String> LIZJ = c48459J0d2.LIZJ();
                    RankTypeV2 rankTypeV22 = this.LJLJJLL;
                    if (rankTypeV22 != null) {
                        i2 = rankTypeV22.showRankKeepUpTip;
                    } else {
                        i2 = 0;
                    }
                    if (LIZJ == null || (str = LIZJ.get(valueOf)) == null) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    long LJJII = C1E4.LJJII(str);
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(new Date(C30725C4b.LIZ()));
                        int i5 = calendar2.get(3);
                        calendar2.setTime(new Date(LJJII));
                        if (i5 == calendar2.get(3)) {
                            return;
                        }
                    } else {
                        Calendar calendar3 = Calendar.getInstance();
                        o.LJIIIIZZ(calendar3, "getInstance()");
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.setTimeInMillis(LJJII);
                        if (calendar3.get(6) == calendar4.get(6)) {
                            return;
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(valueOf, String.valueOf(C30725C4b.LIZ()));
                    if (LIZJ != null) {
                        linkedHashMap.putAll(LIZJ);
                    }
                    c48459J0d2.LIZ(linkedHashMap);
                }
                InterfaceC78023Ujj interfaceC78023Ujj2 = this.LJLILLLLZI;
                View view2 = null;
                if (interfaceC78023Ujj2 != null) {
                    view = interfaceC78023Ujj2.Le();
                } else {
                    view = null;
                }
                if (this.LJLJJL == null && view != null && (view instanceof ViewGroup)) {
                    InterfaceC78023Ujj interfaceC78023Ujj3 = this.LJLILLLLZI;
                    if (interfaceC78023Ujj3 != null && (J2 = interfaceC78023Ujj3.J2()) != null) {
                        view2 = C16880lQ.LLLLIILL(J2, R.layout.dcf, (ViewGroup) view, false);
                    }
                    this.LJLJJL = view2;
                }
                View view3 = this.LJLJJL;
                if (view3 == null) {
                    return;
                }
                RankPageController rankPageController = this.LJLIL;
                if (rankPageController != null && (interfaceC77978Uj0 = rankPageController.LJLJL) != null) {
                    interfaceC77978Uj0.xh(view3, true);
                }
                view3.setVisibility(0);
                C16880lQ.LJIIJ(ViewOnClickListenerC78014Uja.LJLIL, view3);
                this.LJLJJI.sendEmptyMessageDelayed(1, 5000L);
                C2A7 c2a7 = (C2A7) view3.findViewById(R.id.azu);
                if (c2a7 != null) {
                    C16880lQ.LJJIII(c2a7, new C77981Uj3(view3, this));
                }
                View findViewById = view3.findViewById(R.id.fbe);
                if (findViewById != null) {
                    C15490jB.LJ(findViewById, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_rank_rookie_list_tip_bg.png");
                }
                View findViewById2 = view3.findViewById(R.id.fbf);
                if (findViewById2 != null) {
                    C15490jB.LJ(findViewById2, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_3"), "ttlive_rank_rookie_tip_pic.webp");
                }
                TextView textView = (TextView) view3.findViewById(R.id.mo2);
                if (textView == null) {
                    return;
                }
                textView.setText(C15380j0.LJIILJJIL(R.string.nz0));
            }
        }
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Integer valueOf;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null || valueOf.intValue() != 1) {
            C0NB.LJ("RankTipController", " unknown message");
            return;
        }
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public C77955Uid(RankPageController rankPageController, RankListController rankListController, InterfaceC78023Ujj interfaceC78023Ujj) {
        RankTypeV2 rankTypeV2;
        boolean z;
        RankRootViewModel LIZ;
        C31526CYw c31526CYw;
        this.LJLIL = rankPageController;
        this.LJLILLLLZI = interfaceC78023Ujj;
        if (rankListController != null && (c31526CYw = rankListController.LJLJI) != null) {
            rankTypeV2 = c31526CYw.LIZIZ;
        } else {
            rankTypeV2 = null;
        }
        this.LJLJJLL = rankTypeV2;
        boolean z2 = false;
        if (o.LJ(rankTypeV2, RankTypeV2.LIZJ) || (rankTypeV2 != null && rankTypeV2.showRankKeepUpTip > 0)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        if (rankListController != null && (LIZ = rankListController.LIZ()) != null) {
            z2 = LIZ.LJLJI;
        }
        this.LJLJLJ = z2;
    }
}
