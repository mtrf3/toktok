package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TiL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75389TiL extends AbstractC76218Tvi<C75181Tez> {
    public final InterfaceC88472Yns<Integer, Long> LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;

    public final C47121t6 M() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-rankNumTextView>(...)");
        return (C47121t6) value;
    }

    public final ImageView N() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-userImageView>(...)");
        return (ImageView) value;
    }

    public final C73116Smm P() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-userImageViewBorder>(...)");
        return (C73116Smm) value;
    }

    public final C47121t6 Q() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-userNameTextView>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C75389TiL(View view, InterfaceC88472Yns<? super Integer, Long> getScoreByRank) {
        super(view);
        o.LJIIIZ(getScoreByRank, "getScoreByRank");
        this.LJLIL = getScoreByRank;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 403));
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 406));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 407));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 408));
        this.LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 405));
        this.LJLJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 404));
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List<String> list;
        User user;
        String LIZJ;
        int i2;
        Long invoke;
        User user2;
        ImageModel avatarThumb;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C75181Tez data = (C75181Tez) obj;
        o.LJIIIZ(data, "data");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = C15380j0.LIZ(0.0f);
        }
        this.itemView.setLayoutParams(marginLayoutParams);
        if (data.LJLJI) {
            this.itemView.setBackgroundResource(R.drawable.ci_);
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = C15380j0.LIZ(8.0f);
                }
            } else {
                marginLayoutParams2 = null;
            }
            this.itemView.setLayoutParams(marginLayoutParams2);
        } else if (data.LJLIL == 1) {
            this.itemView.setBackgroundResource(R.drawable.cia);
        } else if (data.LJLJJI) {
            this.itemView.setBackgroundResource(R.drawable.ci9);
        } else {
            this.itemView.setBackgroundColor(C15380j0.LIZIZ(R.color.abc));
        }
        if (data.LJLILLLLZI.giftScore <= 0) {
            M().setText("-");
            M().setTextColor(C15380j0.LIZIZ(R.color.z5));
            M().setVisibility(0);
        } else {
            M().setText(String.valueOf(data.LJLIL));
            int i3 = data.LJLIL;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        M().setTextColor(C15380j0.LIZIZ(R.color.z5));
                        M().setVisibility(0);
                    } else {
                        M().setTextColor(C15380j0.LIZIZ(R.color.z8));
                    }
                } else {
                    M().setTextColor(C15380j0.LIZIZ(R.color.z7));
                }
            } else {
                M().setTextColor(C15380j0.LIZIZ(R.color.z6));
            }
            int i4 = data.LJLIL;
            if (1 <= i4 && i4 < 4) {
                M().setVisibility(0);
            }
        }
        int i5 = data.LJLIL;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    C29306Beo.LJJLIIIJJI(P(), false);
                } else {
                    int LIZ = C15380j0.LIZ(38.0f);
                    C29306Beo.LJJLIIIJJI(P(), true);
                    P().setBackgroundColor(C15380j0.LIZIZ(R.color.z8));
                    C29306Beo.LJJLIIIJJIZ(LIZ, LIZ, N());
                }
            } else {
                int LIZ2 = C15380j0.LIZ(38.0f);
                C29306Beo.LJJLIIIJJI(P(), true);
                P().setBackgroundColor(C15380j0.LIZIZ(R.color.z7));
                C29306Beo.LJJLIIIJJIZ(LIZ2, LIZ2, N());
            }
        } else {
            int LIZ3 = C15380j0.LIZ(38.0f);
            C29306Beo.LJJLIIIJJI(P(), true);
            P().setBackgroundColor(C15380j0.LIZIZ(R.color.z6));
            C29306Beo.LJJLIIIJJIZ(LIZ3, LIZ3, N());
        }
        BQO LIZ4 = C15650jR.LIZ();
        LinkPlayerInfo linkPlayerInfo = data.LJLILLLLZI.listUser;
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null && (avatarThumb = user2.getAvatarThumb()) != null) {
            list = avatarThumb.mUrls;
        } else {
            list = null;
        }
        C78720Uuy LIZ5 = LIZ4.LIZ(list);
        LIZ5.LJIIL = Boolean.TRUE;
        LIZ5.LJIIIIZZ = R.drawable.cuk;
        LIZ5.LJIIJJI(N());
        C47121t6 Q = Q();
        LinkPlayerInfo linkPlayerInfo2 = data.LJLILLLLZI.listUser;
        if (linkPlayerInfo2 != null) {
            user = linkPlayerInfo2.mUser;
        } else {
            user = null;
        }
        Q.setText(C05170If.LIZ(user));
        if (data.LJLILLLLZI.giftScore > 0) {
            Object value = this.LJLJL.getValue();
            o.LJIIIIZZ(value, "<get-ticketCountImageView>(...)");
            C87277YNd.LJJIJ((View) value);
            Object value2 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value2, "<get-ticketCountTextView>(...)");
            TextView textView = (TextView) value2;
            Integer num = data.LJLJJL;
            if (num != null) {
                int i6 = data.LJLIL;
                int intValue = num.intValue();
                long j = data.LJLILLLLZI.giftScore;
                int i7 = OnlineAudienceDisplayStrategySetting.INSTANCE.getValue().displayNumberN;
                String LJIILJJIL = b.LJIILJJIL(j);
                o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(ticketCount)");
                Locale locale = Locale.ROOT;
                LIZJ = OKG.LIZJ(locale, "ROOT", LJIILJJIL, locale, "this as java.lang.String).toUpperCase(locale)");
                if (j >= 10 && i6 < (i2 = intValue - i7) && i6 < i2 && (invoke = this.LJLIL.invoke(Integer.valueOf(i2))) != null) {
                    String LJIIIZ = b.LJIIIZ(invoke.longValue());
                    o.LJIIIIZZ(LJIIIZ, "getAudienceScoreDisplaye…tegy(standardTicketCount)");
                    LIZJ = LJIIIZ.toUpperCase(locale);
                    o.LJIIIIZZ(LIZJ, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
            } else {
                String LJIILJJIL2 = b.LJIILJJIL(data.LJLILLLLZI.giftScore);
                o.LJIIIIZZ(LJIILJJIL2, "getDisplayCountForCoin(data.applier.giftScore)");
                Locale locale2 = Locale.ROOT;
                LIZJ = OKG.LIZJ(locale2, "ROOT", LJIILJJIL2, locale2, "this as java.lang.String).toUpperCase(locale)");
            }
            textView.setText(LIZJ);
            Object value3 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value3, "<get-ticketCountTextView>(...)");
            C87277YNd.LJJIJ((View) value3);
            ViewGroup.LayoutParams layoutParams3 = Q().getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams3.topMargin = C15380j0.LIZ(13.0f);
            }
            Q().setLayoutParams(marginLayoutParams3);
            return;
        }
        Object value4 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value4, "<get-ticketCountTextView>(...)");
        C87277YNd.LJJIIZ((View) value4);
        Object value5 = this.LJLJL.getValue();
        o.LJIIIIZZ(value5, "<get-ticketCountImageView>(...)");
        C87277YNd.LJJIIZ((View) value5);
        ViewGroup.LayoutParams layoutParams4 = Q().getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            marginLayoutParams3.topMargin = C15380j0.LIZ(0.0f);
        }
        Q().setLayoutParams(marginLayoutParams3);
        C29306Beo.LJJLIIIJJI(P(), false);
    }
}
