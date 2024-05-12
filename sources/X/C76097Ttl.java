package X;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76097Ttl extends AbstractC31414CUo<C76006TsI, C76098Ttm> {
    public static void LJI(C76098Ttm c76098Ttm, C76006TsI c76006TsI) {
        int i;
        String LIZ;
        int i2;
        String LIZIZ;
        if (c76006TsI.LIZLLL) {
            c76098Ttm.M().setVisibility(0);
            C15490jB.LJ(c76098Ttm.M(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_co_host_breathe_1.webp");
        } else {
            c76098Ttm.M().clearAnimation();
            c76098Ttm.M().setVisibility(8);
        }
        Object value = c76098Ttm.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-ivUserAvatarImage>(...)");
        ImageView imageView = (ImageView) value;
        C31665Cbl.LJIIJ(imageView, c76006TsI.LIZ.avatarThumb, imageView.getWidth(), imageView.getHeight(), R.drawable.cuk);
        Object value2 = c76098Ttm.LJLJJL.getValue();
        o.LJIIIIZZ(value2, "<get-tvUserName>(...)");
        InviterRivalExtra inviterRivalExtra = c76006TsI.LIZ;
        ((TextView) value2).setText(C05170If.LIZIZ(inviterRivalExtra.displayId, inviterRivalExtra.nickname));
        Object value3 = c76098Ttm.LJLJJLL.getValue();
        o.LJIIIIZZ(value3, "<get-userBadge>(...)");
        ImageView imageView2 = (ImageView) value3;
        User user = c76006TsI.LIZJ;
        if (user != null && user.getAuthenticationInfo() != null) {
            i = 0;
        } else {
            i = 8;
        }
        imageView2.setVisibility(i);
        Object value4 = c76098Ttm.LJLJL.getValue();
        o.LJIIIIZZ(value4, "<get-ivAudience>(...)");
        ImageView imageView3 = (ImageView) value4;
        Object value5 = c76098Ttm.LJLJLJ.getValue();
        o.LJIIIIZZ(value5, "<get-tvOnlineAudienceNum>(...)");
        TextView textView = (TextView) value5;
        long j = c76006TsI.LIZ.userCount;
        if (j > 0) {
            if (j < 1000) {
                LIZIZ = String.valueOf(j);
            } else if (j < 100000) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZIZ = C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ2, "k", LIZ2);
            } else if (j < 1000000) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZIZ = C03660Ck.LIZIZ("%.0f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ3, "k", LIZ3);
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZIZ = C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ4, "m", LIZ4);
            }
            o.LJIIIIZZ(LIZIZ, "if (argsIsStr) {\n       …\n            } else count");
            imageView3.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(LIZIZ);
        } else {
            imageView3.setVisibility(8);
            textView.setVisibility(8);
        }
        RivalExtraInfo.Tag tag = c76006TsI.LIZIZ;
        if (tag == null || (LIZ = tag.tagText) == null) {
            LIZ = C76099Ttn.LIZ(c76006TsI.LIZ.followStatus);
        }
        boolean LJ = C38354F3m.LJ(LIZ);
        C47121t6 L = c76098Ttm.L();
        if (LJ) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        L.setVisibility(i2);
        c76098Ttm.L().setText(LIZ);
        if (c76006TsI.LIZ.isBestTeammate) {
            B5G.LIZIZ().LJLIIL = Long.valueOf(c76006TsI.LIZ.userId);
            Object value6 = c76098Ttm.LJLL.getValue();
            o.LJIIIIZZ(value6, "<get-bestTeammateView>(...)");
            C29306Beo.LJJLJLI((View) value6);
            Object value7 = c76098Ttm.LJLL.getValue();
            o.LJIIIIZZ(value7, "<get-bestTeammateView>(...)");
            ((C76217Tvh) value7).LIZIZ(16.0f);
            Object value8 = c76098Ttm.LJLL.getValue();
            o.LJIIIIZZ(value8, "<get-bestTeammateView>(...)");
            ((C76217Tvh) value8).LJLJJI = false;
            Object value9 = c76098Ttm.LJLJJLL.getValue();
            o.LJIIIIZZ(value9, "<get-userBadge>(...)");
            ((ImageView) value9).setVisibility(8);
            c76098Ttm.L().setVisibility(0);
            c76098Ttm.L().setText(C15380j0.LJIILJJIL(R.string.ol3));
        }
        C72818Shy.LIZ(new C76052yf(SystemClock.uptimeMillis(), null, "team_match_close_campaign_page"));
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76098Ttm c76098Ttm, C76006TsI c76006TsI) {
        C76098Ttm viewHolder = c76098Ttm;
        C76006TsI item = c76006TsI;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(item, "item");
        LJI(viewHolder, item);
    }

    @Override // X.AbstractC31414CUo
    public final C76098Ttm LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.dbv, parent, false);
        o.LJIIIIZZ(it, "it");
        C76098Ttm c76098Ttm = new C76098Ttm(it);
        Object value = c76098Ttm.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-ivUserAvatarBoard>(...)");
        C15620jO.LIZ((C47061t0) value, R.drawable.d5s);
        Object value2 = c76098Ttm.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-ivUserAvatarLiving>(...)");
        C15490jB.LJ((View) value2, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
        return c76098Ttm;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(C76098Ttm c76098Ttm, C76006TsI c76006TsI, List payloads) {
        C76098Ttm holder = c76098Ttm;
        C76006TsI item = c76006TsI;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.size() <= 0) {
            LIZ(holder, item);
        } else {
            LJI(holder, item);
        }
    }
}
