package X;

import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.bddatefmt.BDDateFormat;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Bid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29543Bid extends AbstractC29447Bh5 {
    public ViewGroup LJLJJL;
    public C47121t6 LJLJJLL;
    public FrameLayout LJLJL;
    public View LJLJLJ;
    public User LJLJLLL;
    public final boolean LJLL;

    public final void LJIIJJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        User user = this.LJLJLLL;
        if (user != null) {
            if (user.ecommerceEntrance != null) {
                View view = this.LJLJLJ;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.topMargin = C15380j0.LIZ(0.0f);
                        return;
                    }
                    return;
                }
                o.LJIJI("contentView");
                throw null;
            }
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                    return;
                }
                marginLayoutParams.topMargin = C15380j0.LIZ(20.0f);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LJLL;
    }

    public C29543Bid(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        boolean z;
        if (c29484Bhg.LIZJ.LIZJ() || c29484Bhg.LIZJ.LJ() || c29484Bhg.LIZJ.LIZ.coHostEnable) {
            z = true;
        } else {
            z = false;
        }
        this.LJLL = z;
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.czv, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…_event_cell, null, false)");
        this.LJLJLJ = LLLLIILL;
        this.LJLJJL = (ViewGroup) LLLLIILL.findViewById(R.id.d09);
        View view = this.LJLJLJ;
        if (view != null) {
            view.findViewById(R.id.d0h);
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                this.LJLJJLL = (C47121t6) view2.findViewById(R.id.d0i);
                View view3 = this.LJLJLJ;
                if (view3 != null) {
                    this.LJLJL = (FrameLayout) view3.findViewById(R.id.d07);
                    View view4 = this.LJLJLJ;
                    if (view4 != null) {
                        return view4;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final C29463BhL LJIIIIZZ(User user) {
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        C29463BhL c29463BhL;
        User user2 = this.LJLJLLL;
        if (user2 != null) {
            List<LiveEventInfo> list = user2.upcomingEventList;
            if (list != null) {
                liveEventInfo = (LiveEventInfo) ORZ.LJLLLL(list);
            } else {
                liveEventInfo = null;
            }
            List<LiveEventInfo> list2 = user.upcomingEventList;
            if (list2 != null) {
                liveEventInfo2 = (LiveEventInfo) ORZ.LJLLLL(list2);
            } else {
                liveEventInfo2 = null;
            }
            if (liveEventInfo != null) {
                if (liveEventInfo2 != null) {
                    if (o.LJ(liveEventInfo2.eventId, liveEventInfo.eventId)) {
                        c29463BhL = new C29463BhL(false, EnumC29515BiB.LIVE_EVENT);
                    } else {
                        LJIIL(liveEventInfo2);
                        c29463BhL = new C29463BhL(true, EnumC29515BiB.LIVE_EVENT);
                    }
                } else {
                    View view = this.LJLJLJ;
                    if (view != null) {
                        C29306Beo.LJI(view);
                        c29463BhL = new C29463BhL(true, EnumC29515BiB.LIVE_EVENT);
                    } else {
                        o.LJIJI("contentView");
                        throw null;
                    }
                }
            } else if (liveEventInfo2 != null) {
                LJIIL(liveEventInfo2);
                LJIILIIL("show", liveEventInfo2);
                c29463BhL = new C29463BhL(true, EnumC29515BiB.LIVE_EVENT);
            } else {
                c29463BhL = new C29463BhL(false, EnumC29515BiB.LIVE_EVENT);
            }
            this.LJLJLLL = user;
            LJIIJJI();
            return c29463BhL;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    public final void LJIIL(LiveEventInfo liveEventInfo) {
        String LIZJ;
        long LIZ = C29544Bie.LIZ();
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            Long l = liveEventInfo.startTime;
            o.LJIIIIZZ(l, "liveEventInfo.startTime");
            long longValue = l.longValue();
            long millis = TimeUnit.SECONDS.toMillis(longValue);
            if (longValue == 0) {
                LIZJ = "";
            } else {
                C29545Bif LIZIZ = C29544Bie.LIZIZ();
                long j = LIZIZ.LIZ - LIZ;
                LIZIZ.LIZ = j;
                long j2 = LIZIZ.LIZIZ - LIZ;
                if (millis > j && millis < j2) {
                    LIZJ = BDDateFormat.LIZJ((BDDateFormat) Z8W.LIZJ.getValue(), millis);
                } else {
                    C29545Bif LIZIZ2 = C29544Bie.LIZIZ();
                    if (millis > LIZIZ2.LIZ && millis < LIZIZ2.LIZIZ) {
                        LIZJ = BDDateFormat.LIZJ((BDDateFormat) Z8W.LIZLLL.getValue(), millis);
                    } else {
                        C29545Bif LIZIZ3 = C29544Bie.LIZIZ();
                        long j3 = LIZIZ3.LIZ + LIZ;
                        LIZIZ3.LIZ = j3;
                        long j4 = LIZIZ3.LIZIZ + LIZ;
                        if (millis > j3 && millis < j4) {
                            LIZJ = BDDateFormat.LIZJ((BDDateFormat) Z8W.LJ.getValue(), millis);
                        } else {
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(millis);
                            if (calendar2.get(1) == calendar.get(1)) {
                                LIZJ = BDDateFormat.LIZJ((BDDateFormat) Z8W.LIZIZ.getValue(), millis);
                            } else {
                                LIZJ = BDDateFormat.LIZJ((BDDateFormat) Z8W.LIZ.getValue(), millis);
                            }
                        }
                    }
                }
            }
            c47121t6.setText(LIZJ);
        }
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS40S0200000_5(liveEventInfo, this, 94));
        }
        View view = this.LJLJLJ;
        if (view != null) {
            C29306Beo.LJJLJLI(view);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.AbstractC29447Bh5
    public final void LJIIJ(User user, boolean z) {
        LiveEventInfo liveEventInfo;
        o.LJIIIZ(user, "user");
        this.LJLJLLL = user;
        List<LiveEventInfo> list = user.upcomingEventList;
        if (list != null && (liveEventInfo = (LiveEventInfo) ORZ.LJLLLL(list)) != null) {
            LJIIL(liveEventInfo);
            LJIILIIL("show", liveEventInfo);
        }
        LJIIJJI();
    }

    public final void LJIILIIL(String str, LiveEventInfo liveEventInfo) {
        String str2;
        String str3;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_event_card");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJIJJ("profile", "enter_from");
        Boolean bool = liveEventInfo.isPaidEvent;
        o.LJIIIIZZ(bool, "info.isPaidEvent");
        LIZ.LJIJJ(Integer.valueOf(!bool.booleanValue() ? 1 : 0), "is_free");
        if (this.LJLIL.LIZJ.LIZ()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        LIZ.LJIJJ(str, "action_type");
        if (this.LJLIL.LIZJ.LIZ()) {
            if (this.LJLIL.LIZJ.LIZLLL()) {
                str3 = "self_anchor";
            } else {
                str3 = "link_anchor";
            }
        } else if (this.LJLIL.LIZJ.LIZJ()) {
            str3 = "audience_c_host_anchor";
        } else {
            str3 = "audience_c_link_anchor";
        }
        LIZ.LJIJJ(str3, "request_page");
        LIZ.LJJIIJZLJL();
    }
}
