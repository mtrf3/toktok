package X;

import Y.ACListenerS47S0200000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import o53.IDdS478S0100000_13;

/* renamed from: X.U3t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76581U3t extends AbstractC31414CUo<GetShowRankResponse.ShowRankUser, C76584U3w> {
    public final Context LIZIZ;
    public final C73318Sq2 LIZJ = new C73318Sq2();

    public C76581U3t(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.AbstractC31414CUo
    public final void LJ(C76584U3w holder) {
        o.LJIIIZ(holder, "holder");
        this.LIZJ.LIZLLL();
    }

    public final void LJI(GetShowRankResponse.ShowRankUser showRankUser) {
        if (!C74947TbD.LJ("openUserProfile", this.LIZIZ, this.LIZJ)) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(showRankUser.userId, "multi_guest");
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "profile_card";
        userProfileEvent.cardEnterFrom = "guest_ranking";
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76584U3w c76584U3w, GetShowRankResponse.ShowRankUser showRankUser) {
        List<String> list;
        C76584U3w holder = c76584U3w;
        GetShowRankResponse.ShowRankUser item = showRankUser;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-rankNumTextView>(...)");
        ((TextView) value).setText(String.valueOf(item.order));
        Object value2 = holder.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-rankNumTextView>(...)");
        int i = 0;
        ((View) value2).setVisibility(0);
        Object value3 = holder.LJLJI.getValue();
        o.LJIIIIZZ(value3, "<get-userImageViewBorder>(...)");
        C29306Beo.LJJLIIIJJI((View) value3, false);
        BQO LIZ = C15650jR.LIZ();
        ImageModel imageModel = item.avatarThumb;
        if (imageModel != null) {
            list = imageModel.mUrls;
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        LIZ2.LJIIL = Boolean.TRUE;
        LIZ2.LJIIIIZZ = R.drawable.cuk;
        Object value4 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value4, "<get-userImageView>(...)");
        LIZ2.LJIIJJI((View) value4);
        Object value5 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value5, "<get-userImageView>(...)");
        C16880lQ.LJIILLIIL((ImageView) value5, new ACListenerS47S0200000_13(this, item, 13));
        C47061t0 L = holder.L();
        long j = item.followStatus;
        if (j == 2 || j == 1) {
            i = 8;
        }
        L.setVisibility(i);
        C16880lQ.LJJI(L, new ACListenerS47S0200000_13(this, item, 11));
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(C15510jD.LJIIIZ("tiktok_live_interaction_resource", "ttlive_rank_follow_anim.webp"));
        LIZJ.LJII = new IDdS478S0100000_13(holder, 1);
        L.setController(LIZJ.LIZ());
        Object value6 = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value6, "<get-userNameTextView>(...)");
        ((TextView) value6).setText(item.nickname);
        Object value7 = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value7, "<get-userNameTextView>(...)");
        ((View) value7).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS47S0200000_13(this, item, 12)));
        if (item.score >= 0) {
            Object value8 = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value8, "<get-ticketCountTextView>(...)");
            String LJIILJJIL = b.LJIILJJIL(item.score);
            o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(item.score)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = LJIILJJIL.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            ((TextView) value8).setText(upperCase);
        } else {
            Object value9 = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value9, "<get-ticketCountTextView>(...)");
            ((TextView) value9).setText("");
        }
        InterfaceC92693kP LJIIJJI = new C73440Ss0(C73943T0h.LIZ().LJ(CJ5.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIFFI(UCI.LJLIL).LJJIFFI(new C76580U3s(item)).LJJIFFI(new U40(this, item)).LJIJJLI(new AfS65S0100000_13(holder, 100)).LJIJJ(C29191Bcx.LJLIL)).LJIIIIZZ().LJIIJJI();
        C73318Sq2 cb = this.LIZJ;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJIIJJI);
    }

    @Override // X.AbstractC31414CUo
    public final C76584U3w LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C76584U3w(parent);
    }
}
