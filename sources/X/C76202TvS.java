package X;

import Y.ACListenerS38S0300000_13;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76202TvS extends AbstractC76213Tvd<C76032Tsi> implements InterfaceC75959TrX {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public EnumC76210Tva LJLLL;
    public EnumC75958TrW LJLLLL;
    public final /* synthetic */ C76201TvR LJLLLLLL;

    @Override // X.InterfaceC75959TrX
    public final C2A7 LIZIZ() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-inviteBtn>(...)");
        return (C2A7) value;
    }

    @Override // X.InterfaceC75966Tre
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LJLLLLLL.LJFF;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LJLLLLLL.LIZLLL;
    }

    public final C47121t6 N() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-dotText>(...)");
        return (C47121t6) value;
    }

    public final C47121t6 P() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-reserveAnchorTagText>(...)");
        return (C47121t6) value;
    }

    public final C2A7 Q() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-reserveBtn>(...)");
        return (C2A7) value;
    }

    public final C47121t6 T() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-reserveWaitingTimeText>(...)");
        return (C47121t6) value;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LJLLLLLL.LIZJ;
    }

    @Override // X.InterfaceC75959TrX
    public final EnumC75958TrW LLLLL() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC75959TrX
    public final void LJJJLZIJ(EnumC75958TrW state) {
        o.LJIIIZ(state, "state");
        this.LJLLLL = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76202TvS(C76201TvR c76201TvR, View view) {
        super(view);
        this.LJLLLLLL = c76201TvR;
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 655));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 656));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 658));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 659));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 653));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 652));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 649));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 648));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 650));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 654));
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 660));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 651));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 657));
        this.LJLLL = EnumC76210Tva.UNKNOWN;
        this.LJLLLL = EnumC75958TrW.NORMAL;
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C76032Tsi data = (C76032Tsi) obj;
        o.LJIIIZ(data, "data");
        U(this, data, i, false);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C76032Tsi data = (C76032Tsi) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        U(this, data, i, true);
    }

    public final void U(C76202TvS c76202TvS, C76032Tsi c76032Tsi, int i, boolean z) {
        boolean z2;
        RivalExtraInfo.ReserveInfo reserveInfo;
        long j;
        String LJIILL;
        RivalExtraInfo.ReserveInfo reserveInfo2;
        User owner = c76032Tsi.LJLIL.getOwner();
        if (!z) {
            Object value = c76202TvS.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-reserveAvatarImage>(...)");
            ImageView imageView = (ImageView) value;
            C31665Cbl.LJIIJ(imageView, owner.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.cuk);
            if (c76032Tsi.LJLIL.getStatus() == 4) {
                Object value2 = c76202TvS.LJLJI.getValue();
                o.LJIIIIZZ(value2, "<get-reserveLiving>(...)");
                ((ImageView) value2).setVisibility(8);
                Object value3 = c76202TvS.LJLIL.getValue();
                o.LJIIIIZZ(value3, "<get-reserveAvatarBorderImage>(...)");
                ((ImageView) value3).setVisibility(8);
            } else {
                Object value4 = c76202TvS.LJLJI.getValue();
                o.LJIIIIZZ(value4, "<get-reserveLiving>(...)");
                ((ImageView) value4).setVisibility(0);
                Object value5 = c76202TvS.LJLIL.getValue();
                o.LJIIIIZZ(value5, "<get-reserveAvatarBorderImage>(...)");
                ((ImageView) value5).setVisibility(0);
                Object value6 = c76202TvS.LJLJI.getValue();
                o.LJIIIIZZ(value6, "<get-reserveLiving>(...)");
                C15490jB.LJ((View) value6, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
            }
        }
        Object value7 = c76202TvS.LJLJJL.getValue();
        o.LJIIIIZZ(value7, "<get-reserveAnchorNameText>(...)");
        ((TextView) value7).setText(C05170If.LIZ(owner));
        RivalExtraInfo rivalExtraInfo = c76032Tsi.LJLJJI;
        if (rivalExtraInfo != null && (reserveInfo2 = rivalExtraInfo.reserveInfo) != null && reserveInfo2.replyStatus == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Object value8 = c76202TvS.LJLJJLL.getValue();
            o.LJIIIIZZ(value8, "<get-layoutReserveCoHost>(...)");
            ((View) value8).setVisibility(8);
            c76202TvS.T().setVisibility(0);
            if (c76032Tsi.LJLIL.getStatus() == 4) {
                c76202TvS.T().setText(C15380j0.LJIILJJIL(R.string.owk));
                c76202TvS.T().setVisibility(0);
            } else {
                C47121t6 T = c76202TvS.T();
                long id = c76032Tsi.LJLIL.getId();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Long l = (Long) ((HashMap) C75893TqT.LIZIZ).get(Long.valueOf(id));
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = currentTimeMillis;
                }
                long j2 = currentTimeMillis - j;
                if (j2 <= 60) {
                    LJIILL = C15380j0.LJIILL(R.string.owm, 1);
                    o.LJIIIIZZ(LJIILL, "getString(R.string.pm_waited_timecount_minute, 1)");
                } else if (j2 < 3600) {
                    LJIILL = C15380j0.LJIILL(R.string.owm, Long.valueOf(j2 / 60));
                    o.LJIIIIZZ(LJIILL, "getString(R.string.pm_wa…nt_minute, duration / 60)");
                } else {
                    LJIILL = C15380j0.LJIILL(R.string.owl, Long.valueOf(j2 / 3600));
                    o.LJIIIIZZ(LJIILL, "getString(R.string.pm_wa…nt_hour, duration / 3600)");
                }
                T.setText(LJIILL);
                c76202TvS.T().setVisibility(0);
            }
        } else {
            c76202TvS.T().setVisibility(8);
            Object value9 = c76202TvS.LJLJJLL.getValue();
            o.LJIIIIZZ(value9, "<get-layoutReserveCoHost>(...)");
            ((View) value9).setVisibility(0);
            int userCount = c76032Tsi.LJLIL.getUserCount();
            String LIZ = C76099Ttn.LIZ(c76032Tsi.LJLIL.getStatus());
            if (userCount == 0) {
                Object value10 = c76202TvS.LJLJL.getValue();
                o.LJIIIIZZ(value10, "<get-audienceView>(...)");
                ((ImageView) value10).setVisibility(8);
                Object value11 = c76202TvS.LJLJLJ.getValue();
                o.LJIIIIZZ(value11, "<get-audienceCntText>(...)");
                ((View) value11).setVisibility(8);
                c76202TvS.N().setVisibility(8);
                if (C29306Beo.LJIJJLI(LIZ)) {
                    c76202TvS.P().setVisibility(0);
                    c76202TvS.P().setText(LIZ);
                } else {
                    c76202TvS.P().setVisibility(8);
                }
            } else {
                Object value12 = c76202TvS.LJLJL.getValue();
                o.LJIIIIZZ(value12, "<get-audienceView>(...)");
                ((ImageView) value12).setVisibility(0);
                Object value13 = c76202TvS.LJLJLJ.getValue();
                o.LJIIIIZZ(value13, "<get-audienceCntText>(...)");
                ((View) value13).setVisibility(0);
                Object value14 = c76202TvS.LJLJLJ.getValue();
                o.LJIIIIZZ(value14, "<get-audienceCntText>(...)");
                ((TextView) value14).setText(b.LJIIL(userCount));
                if (C29306Beo.LJIJJLI(LIZ)) {
                    c76202TvS.N().setVisibility(0);
                    c76202TvS.P().setText(LIZ);
                    c76202TvS.P().setVisibility(0);
                } else {
                    c76202TvS.N().setVisibility(8);
                    c76202TvS.P().setVisibility(8);
                }
                c76202TvS.N().setVisibility(0);
            }
        }
        if (z2 && (!((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
            Object value15 = c76202TvS.LJLJJI.getValue();
            o.LJIIIIZZ(value15, "<get-reserveResponsedText>(...)");
            ((View) value15).setVisibility(0);
        } else {
            Object value16 = c76202TvS.LJLJJI.getValue();
            o.LJIIIIZZ(value16, "<get-reserveResponsedText>(...)");
            ((View) value16).setVisibility(8);
        }
        if (!(!((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
            c76202TvS.Q().setVisibility(0);
            Object value17 = c76202TvS.LJLLILLLL.getValue();
            o.LJIIIIZZ(value17, "<get-inviteBtn>(...)");
            ((View) value17).setVisibility(8);
            RivalExtraInfo rivalExtraInfo2 = c76032Tsi.LJLJJI;
            if (rivalExtraInfo2 != null && (reserveInfo = rivalExtraInfo2.reserveInfo) != null && reserveInfo.replyStatus == 1) {
                c76202TvS.LJLLL = EnumC76210Tva.WAIT_FOR_ME;
            } else {
                c76202TvS.LJLLL = EnumC76210Tva.UNKNOWN;
            }
            int i2 = C76209TvZ.LIZ[c76202TvS.LJLLL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C2A7 Q = c76202TvS.Q();
                    Q.LJJLL(R.style.a39);
                    Q.setEnabled(false);
                    Q.setText(C15380j0.LJIILJJIL(R.string.kj4));
                }
            } else {
                C2A7 Q2 = c76202TvS.Q();
                Q2.LJJLL(R.style.a39);
                Q2.setEnabled(true);
                Q2.setText(C15380j0.LJIILJJIL(R.string.kjc));
            }
            C16880lQ.LJJIII(c76202TvS.Q(), new ACListenerS38S0300000_13(this, c76202TvS, c76032Tsi, 8));
            return;
        }
        c76202TvS.Q().setVisibility(8);
        Object value18 = c76202TvS.LJLLILLLL.getValue();
        o.LJIIIIZZ(value18, "<get-inviteBtn>(...)");
        ((View) value18).setVisibility(0);
        C75953TrR.LJJ(c76202TvS, c76032Tsi);
    }
}
