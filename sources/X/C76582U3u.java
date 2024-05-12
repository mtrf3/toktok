package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS47S0200000_13;
import Y.AfS64S0100000_12;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRankMedalTypeSetting;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import o53.IDdS478S0100000_13;

/* renamed from: X.U3u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76582U3u extends AbstractC31414CUo<FanTicketRanklistResponse.RanklistUser, C76583U3v> {
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Context LIZLLL;
    public final User LJ;
    public final FanTicketRanklistResponse.ResponseData LJFF;
    public final C73318Sq2 LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final void LJI(FanTicketRanklistResponse.RanklistUser ranklistUser) {
        User user;
        String str;
        if (C74947TbD.LJ("openUserProfile", this.LIZLLL, this.LJI) && (user = ranklistUser.user) != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user, "multi_guest");
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "guest_connection";
            userProfileEvent.mClickUserPosition = "profile_card";
            if (this.LIZIZ) {
                str = "guest_ranking_popup";
            } else {
                str = "guest_ranking";
            }
            userProfileEvent.cardEnterFrom = str;
            C73943T0h.LIZ().LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // X.AbstractC31414CUo
    public final void LIZ(C76583U3v c76583U3v, FanTicketRanklistResponse.RanklistUser ranklistUser) {
        List<String> list;
        int i;
        User user;
        boolean z;
        List<BadgeStruct> badgeList;
        ImageModel avatarThumb;
        C76583U3v holder = c76583U3v;
        FanTicketRanklistResponse.RanklistUser item = ranklistUser;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.M().setVisibility(0);
        holder.M();
        if (item.score <= 0) {
            holder.M().setText("-");
            holder.M().setTextColor(C15380j0.LIZIZ(R.color.z5));
            holder.M().setVisibility(0);
        } else {
            holder.M().setText(String.valueOf(item.index));
            long j = item.index;
            if (j == 1) {
                holder.M().setTextColor(C15380j0.LIZIZ(R.color.z6));
            } else if (j == 2) {
                holder.M().setTextColor(C15380j0.LIZIZ(R.color.z7));
            } else if (j == 3) {
                holder.M().setTextColor(C15380j0.LIZIZ(R.color.z8));
            } else {
                holder.M().setTextColor(C15380j0.LIZIZ(R.color.z5));
                holder.M().setVisibility(0);
            }
            long j2 = item.index;
            if (1 <= j2 && j2 < 4) {
                holder.M().setVisibility(0);
            }
        }
        long j3 = item.index;
        if (j3 == 1) {
            int LIZ = C15380j0.LIZ(38.0f);
            C29306Beo.LJJLIIIJJI(holder.Q(), true);
            holder.Q().setBackgroundColor(C15380j0.LIZIZ(R.color.z6));
            C29306Beo.LJJLIIIJJIZ(LIZ, LIZ, holder.P());
        } else if (j3 == 2) {
            int LIZ2 = C15380j0.LIZ(38.0f);
            C29306Beo.LJJLIIIJJI(holder.Q(), true);
            holder.Q().setBackgroundColor(C15380j0.LIZIZ(R.color.z7));
            C29306Beo.LJJLIIIJJIZ(LIZ2, LIZ2, holder.P());
        } else if (j3 == 3) {
            int LIZ3 = C15380j0.LIZ(38.0f);
            C29306Beo.LJJLIIIJJI(holder.Q(), true);
            holder.Q().setBackgroundColor(C15380j0.LIZIZ(R.color.z8));
            C29306Beo.LJJLIIIJJIZ(LIZ3, LIZ3, holder.P());
        } else {
            C29306Beo.LJJLIIIJJI(holder.Q(), false);
        }
        BQO LIZ4 = C15650jR.LIZ();
        User user2 = item.user;
        ?? r12 = 0;
        r12 = 0;
        if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
            list = avatarThumb.mUrls;
        } else {
            list = null;
        }
        C78720Uuy LIZ5 = LIZ4.LIZ(list);
        LIZ5.LJIIL = Boolean.TRUE;
        LIZ5.LJIIIIZZ = R.drawable.cuk;
        LIZ5.LJIIJJI(holder.P());
        C16880lQ.LJIILLIIL(holder.P(), new ACListenerS47S0200000_13(this, item, 16));
        C47061t0 L = holder.L();
        if (!C29619Bjr.LIZJ(item.user)) {
            i = 0;
        } else {
            i = 8;
        }
        L.setVisibility(i);
        C16880lQ.LJJI(L, new ACListenerS47S0200000_13(this, item, 14));
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_rank_follow_anim.webp"));
        LIZJ.LJII = new IDdS478S0100000_13(holder, 2);
        L.setController(LIZJ.LIZ());
        Object value = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-userNameTextView>(...)");
        ((TextView) value).setText(C05170If.LIZ(item.user));
        Object value2 = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-userNameTextView>(...)");
        ((View) value2).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS47S0200000_13(this, item, 15)));
        if (item.score > 0) {
            Object value3 = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value3, "<get-ticketCountTextView>(...)");
            String LJIILJJIL = b.LJIILJJIL(item.score);
            o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(item.score)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = LJIILJJIL.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            ((TextView) value3).setText(upperCase);
        } else {
            Object value4 = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value4, "<get-ticketCountTextView>(...)");
            ((TextView) value4).setText("");
        }
        User user3 = item.user;
        if (user3 == null || user3.getBadgeList() == null || ((user = item.user) != null && (badgeList = user.getBadgeList()) != null && badgeList.size() == 0)) {
            holder.N().setVisibility(8);
        } else {
            C31470CWs N = holder.N();
            if (Boolean.FALSE != null) {
                z = false;
            } else {
                z = true;
            }
            N.LJLJJLL = z;
            C31470CWs N2 = holder.N();
            N2.LJLJI = null;
            N2.LJLLILLLL = new C31472CWu(C15380j0.LJIIZILJ(), 7);
            User user4 = item.user;
            if (user4 != null) {
                C31470CWs N3 = holder.N();
                boolean LIZJ2 = TV3.LIZJ();
                List<BadgeStruct> badgeList2 = user4.getBadgeList();
                LiveSdkMultiGuestRankMedalTypeSetting liveSdkMultiGuestRankMedalTypeSetting = LiveSdkMultiGuestRankMedalTypeSetting.INSTANCE;
                if (liveSdkMultiGuestRankMedalTypeSetting.noMedal()) {
                    r12 = C61878OQg.INSTANCE;
                } else if (liveSdkMultiGuestRankMedalTypeSetting.onlyShowSubscribeMedal()) {
                    if (badgeList2 != null) {
                        r12 = new ArrayList();
                        for (BadgeStruct badgeStruct : badgeList2) {
                            int i2 = badgeStruct.badgeScene;
                            if (i2 == 4 || i2 == 7) {
                                r12.add(badgeStruct);
                            }
                        }
                    }
                } else if (liveSdkMultiGuestRankMedalTypeSetting.showAllMedal()) {
                    if (badgeList2 != null) {
                        r12 = new ArrayList();
                        for (BadgeStruct badgeStruct2 : badgeList2) {
                            int i3 = badgeStruct2.badgeScene;
                            if (i3 == 4 || i3 == 7 || i3 == 8) {
                                r12.add(badgeStruct2);
                            }
                        }
                    }
                } else {
                    r12 = badgeList2;
                }
                C31470CWs.LIZIZ(N3, LIZJ2, r12, user4, 3, null, 112);
            }
            holder.N().setVisibility(0);
        }
        C76585U3x c76585U3x = new C76585U3x(holder, item);
        InterfaceC92693kP LJJJLIIL = C73943T0h.LIZ().LJ(CJ5.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIFFI(C43659HBn.LJLJI).LJJIFFI(new C76587U3z(c76585U3x)).LJJIFFI(new C76586U3y(c76585U3x)).LJJJLIIL(new AfS65S0100000_13(c76585U3x, 116), new AfS64S0100000_12(this, 92));
        C73318Sq2 cb = this.LJI;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(item, 269), holder.itemView);
    }

    @Override // X.AbstractC31414CUo
    public final C76583U3v LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C76583U3v(parent);
    }

    public C76582U3u(boolean z, boolean z2, Context context, User user, FanTicketRanklistResponse.ResponseData responseData, C73318Sq2 compositeDisposable, boolean z3, boolean z4, int i) {
        z3 = (i & 64) != 0 ? false : z3;
        z4 = (i & 128) != 0 ? false : z4;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = context;
        this.LJ = user;
        this.LJFF = responseData;
        this.LJI = compositeDisposable;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
    }
}
