package X;

import Y.IDCListenerS135S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30011Ft extends ConstraintLayout {
    public final Context LJLIL;
    public C12D LJLILLLLZI;
    public XKQ LJLJI;
    public final ConstraintLayout LJLJJI;
    public final ConstraintLayout LJLJJL;
    public final GradientDrawable LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public DataChannel LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public int LJLLJ;
    public final ValueAnimator LJLLL;
    public final ValueAnimator LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    private final String getAnchorId() {
        return (String) this.LJLZ.getValue();
    }

    private final long getRoomId() {
        return ((Number) this.LJLLLLLL.getValue()).longValue();
    }

    @Override // android.view.View
    public final GradientDrawable getBackground() {
        return this.LJLJJLL;
    }

    public final int getBlackColor() {
        return this.LJLJLLL;
    }

    public final ConstraintLayout getCommentView() {
        return this.LJLJJI;
    }

    public final ConstraintLayout getContentView() {
        return this.LJLJJL;
    }

    public final DataChannel getDataChannel() {
        return this.LJLL;
    }

    public final C12D getSmallMoreView() {
        return this.LJLILLLLZI;
    }

    public final void LJJLL(boolean z) {
        String str;
        if (z) {
            str = "livesdk_anchor_floating_comment_msg_show";
        } else {
            str = "livesdk_anchor_floating_comment_msg_cancel";
        }
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIJJ(Long.valueOf(getRoomId()), "room_id");
        LIZ.LJIJJ(getAnchorId(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLLILLLL), "user_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLLI), "show_duration");
        UFE.LIZIZ(this.LJLLJ, LIZ, "cancel_cnt");
    }

    public final void setBlackColor(int i) {
        this.LJLJLLL = i;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLL = dataChannel;
    }

    public final void setSmallMoreView(C12D c12d) {
        this.LJLILLLLZI = c12d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30011Ft(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30011Ft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinkedHashMap LJFF = C62850Ola.LJFF(context, "ctx");
        this.LJZ = LJFF;
        this.LJLIL = context;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LJLJJLL = gradientDrawable;
        this.LJLJL = true;
        this.LJLJLJ = true;
        this.LJLJLLL = C15380j0.LIZIZ(R.color.c_);
        this.LJLLI = 2000L;
        this.LJLLLLLL = C221108m2.LIZIZ(C46751sV.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C46741sU.LJLIL);
        o.LJII(ViewGroup.inflate(context, R.layout.dkt, this), "null cannot be cast to non-null type android.view.ViewGroup");
        Integer valueOf = Integer.valueOf(R.id.f3j);
        View view = (View) LJFF.get(valueOf);
        if (view == null) {
            view = findViewById(R.id.f3j);
            if (view != null) {
                LJFF.put(valueOf, view);
            } else {
                view = null;
            }
        }
        C16880lQ.LJJII((LiveIconView) view, new IDCListenerS135S0100000(this, 14));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C87277YNd.LJIIJJI(4));
        View findViewById = findViewById(R.id.bkt);
        o.LJIIIIZZ(findViewById, "findViewById<ConstraintL…>(R.id.comment_item_view)");
        this.LJLJJI = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.k5u);
        o.LJIIIIZZ(findViewById2, "findViewById<ConstraintLayout>(R.id.small_view)");
        this.LJLJJL = (ConstraintLayout) findViewById2;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 4));
        this.LJLLL = ofFloat;
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new IDUListenerS263S0100000(this, 5));
        this.LJLLLL = ofFloat2;
    }

    public final void LJJLJLI(ChatMessage chatMessage, boolean z, boolean z2, int i, boolean z3) {
        long j;
        Boolean bool;
        long j2;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLLJ = i;
        CSA kh = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).kh(this.LJLIL, chatMessage);
        User user = chatMessage.atUser;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        this.LJLLILLLL = j;
        this.LJLJJI.removeAllViews();
        this.LJLJJI.addView(kh, -1, -2);
        XKQ xkq = this.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C12D c12d = this.LJLILLLLZI;
        if (c12d != null) {
            bool = Boolean.valueOf(c12d.LJ());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            j2 = 5000;
        } else {
            j2 = 2000;
        }
        this.LJLLI = j2;
        this.LJLJI = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C55772Gv(this, null), 2);
        this.LJLJJLL.setColor(this.LJLJLLL);
        this.LJLJJL.setBackground(this.LJLJJLL);
        if (z3) {
            this.LJLLL.cancel();
            this.LJLLLL.cancel();
            this.LJLLL.start();
            this.LJLLLL.start();
        }
        LJJLL(true);
    }
}
