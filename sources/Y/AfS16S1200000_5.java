package Y;

import X.BZI;
import X.C05490Jl;
import X.C07250Qf;
import X.C15510jD;
import X.C162476Zf;
import X.C28439BEd;
import X.C28787BRn;
import X.C29306Beo;
import X.C31130CJq;
import X.C32003ChD;
import X.C32609Cqz;
import X.C32624CrE;
import X.C32632CrM;
import X.C32633CrN;
import X.C44;
import X.C47061t0;
import X.C81705W4v;
import X.CFX;
import X.EnumC32608Cqy;
import X.EnumC32618Cr8;
import X.EnumC32627CrH;
import X.InterfaceC32642CrW;
import X.InterfaceC64592gB;
import X.W5I;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconDailyEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS16S1200000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS16S1200000_5 afS16S1200000_5, Object obj) {
        C31130CJq c31130CJq = (C31130CJq) afS16S1200000_5.l1;
        C44 c44 = (C44) afS16S1200000_5.l2;
        String str = afS16S1200000_5.s0;
        Throwable th = (Throwable) obj;
        c31130CJq.getClass();
        c44.onFailed(th);
        C31130CJq.LIZIZ(str, th);
        C31130CJq.LIZ(0, 0, "Fetch Fail", "smooth".equals(str));
    }

    public static final void accept$1(AfS16S1200000_5 afS16S1200000_5, Object obj) {
        C28439BEd c28439BEd = (C28439BEd) afS16S1200000_5.l1;
        User user = (User) afS16S1200000_5.l2;
        String str = afS16S1200000_5.s0;
        c28439BEd.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_mute_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(((C05490Jl) obj).LIZ), "default_mute_set");
        LIZ.LJIJJ(user.getIdStr(), "to_user_id");
        LIZ.LJIJJ("admin_pannel", "entry_point");
        LIZ.LJIJJ(Long.valueOf(c28439BEd.LJLLJ), "anchor_id");
        C07250Qf.LIZJ(c28439BEd.LJLLILLLL, LIZ, "room_id", str, "admin_type");
        LIZ.LJIJJ("cancel", "action_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void accept$2(AfS16S1200000_5 afS16S1200000_5, Object obj) {
        C32633CrN c32633CrN;
        if (o.LJ(((EnumC32618Cr8) afS16S1200000_5.l1).getValue(), "daily") && !LiveGiftIconDailyEffect.INSTANCE.getValue()) {
            return;
        }
        int i = C32632CrM.LIZ[((EnumC32618Cr8) afS16S1200000_5.l1).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c32633CrN = new C32633CrN(EnumC32608Cqy.EVENT, EnumC32627CrH.ANIMATION, C32003ChD.LIZ);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    c32633CrN = new C32633CrN(EnumC32608Cqy.WEEKLY_RANKING_GIFT, EnumC32627CrH.ANIMATION, C32003ChD.LIZ);
                }
            } else {
                c32633CrN = new C32633CrN(EnumC32608Cqy.MATCH_ITEM_AWARD_GUIDE, EnumC32627CrH.ANIMATION, 0L);
            }
        } else {
            c32633CrN = new C32633CrN(EnumC32608Cqy.EVENT, EnumC32627CrH.ANIMATION, 0L);
        }
        InterfaceC32642CrW mIView = ((C32609Cqz) afS16S1200000_5.l2).getMIView();
        if (mIView != null) {
            mIView.LIZ(c32633CrN);
        }
        String str = afS16S1200000_5.s0;
        if (str == null) {
            str = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_2"), "ttlive_gift_icon_effect_normal_without_background.webp");
        }
        C29306Beo.LJJLIIIJJI(((C32609Cqz) afS16S1200000_5.l2).LJLJJI, true);
        C47061t0 c47061t0 = ((C32609Cqz) afS16S1200000_5.l2).LJLJJI;
        if (c47061t0 == null) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(str);
        LIZJ.LJIIJ = true;
        LIZJ.LJII = new C32624CrE((C32609Cqz) afS16S1200000_5.l2, (EnumC32618Cr8) afS16S1200000_5.l1);
        c47061t0.setController(LIZJ.LIZ());
    }

    public AfS16S1200000_5(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
