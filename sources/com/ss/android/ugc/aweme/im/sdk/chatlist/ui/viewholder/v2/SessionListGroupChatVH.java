package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AnonymousClass064;
import X.C1040846q;
import X.C1041346v;
import X.C2068389v;
import X.C221108m2;
import X.C3L4;
import X.C3TQ;
import X.C3TU;
import X.C3TV;
import X.C62822Ol8;
import X.C771431a;
import X.C81803Iy;
import X.C96503qY;
import X.C96583qg;
import X.C96613qj;
import X.C96893rB;
import X.EnumC96553qd;
import X.InterfaceC1040946r;
import X.InterfaceC82723Mm;
import X.SY9;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SessionListGroupChatVH extends SessionListIMBaseVH {
    public final C62822Ol8 LLFZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.MMN
    public final void onAttach() {
        String sessionId;
        C3L4 LIZJ;
        super.onAttach();
        C81803Iy LIZ = C771431a.LIZ();
        C3TQ c3tq = (C3TQ) this.LJLLILLLL;
        if (c3tq == null || (sessionId = c3tq.getSessionId()) == null || (LIZJ = LIZ.LIZJ(sessionId)) == null) {
            return;
        }
        C3TV.LJFF(C3TV.LIZ, LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.MMN
    public final void onDetach() {
        super.onDetach();
        InterfaceC1040946r l0 = l0();
        if (l0 != null) {
            l0.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListGroupChatVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LLFZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 599));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void L(InterfaceC82723Mm interfaceC82723Mm) {
        C3TQ c3tq = (C3TQ) interfaceC82723Mm;
        Object avatar = c3tq.getAvatar();
        if (avatar instanceof String) {
            if ((C1041346v.LIZIZ() & 1) != 0 && l0() != null) {
                InterfaceC1040946r l0 = l0();
                if (l0 != null) {
                    C1040846q.LIZ(l0, c3tq.getSessionId(), (String) avatar, null, this.LJLJLLL.LIZIZ, 0, 20);
                    return;
                }
                return;
            }
            super.L(c3tq);
            return;
        }
        super.L(c3tq);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void f0(C3TU c3tu) {
        AppCompatTextView p0 = p0();
        if (p0 != null) {
            C96503qY m0 = m0();
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            m0.getClass();
            p0.setText(C96503qY.LIZLLL(context, c3tu));
            p0.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void h0(C3TU c3tu) {
        ConstraintLayout constraintLayout;
        if (i0()) {
            View view = this.itemView;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJIIIIZZ(R.id.la4, 7, R.id.n3m, 6);
                anonymousClass064.LJIIIIZZ(R.id.btt, 7, R.id.n3m, 6);
                anonymousClass064.LIZIZ(constraintLayout);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final SY9 o0(EnumC96553qd enumC96553qd) {
        C96503qY m0 = m0();
        m0.getClass();
        if (enumC96553qd != null) {
            int i = C96583qg.LIZ[enumC96553qd.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return m0.LIZIZ();
                }
            } else {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_arrow_left_circle_ltr;
                c2068389v.LJ = Integer.valueOf(R.attr.gv);
                c2068389v.LIZIZ = C96613qj.LIZIZ();
                c2068389v.LIZJ = C96613qj.LIZIZ();
                return c2068389v.LIZ(m0.LIZ);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean t0(C3TU c3tu) {
        boolean z;
        C3TQ c3tq = (C3TQ) c3tu;
        if (C96893rB.LIZ() && c3tq.getReadStatus() != EnumC96553qd.FAILED) {
            z = true;
        } else {
            z = false;
        }
        if (c3tq.getShowReadStatus() && !c3tq.getHasUnreadMsg() && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void w0(C3TU c3tu) {
        C3TQ c3tq = (C3TQ) c3tu;
        if (c3tq.isBlock()) {
            ImageView imageView = (ImageView) this.LL.getValue();
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
            return;
        }
        if (c3tq.isMute()) {
            if (c3tq.getHasUnreadMsg()) {
                x0(c3tq.getSessionUnreadViewState());
            }
            ImageView imageView2 = (ImageView) this.LJZL.getValue();
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(0);
            return;
        }
        if (!c3tq.getHasUnreadMsg()) {
            return;
        }
        x0(c3tq.getSessionUnreadViewState());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    /* renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void v0(C3TQ c3tq, int i) {
        int i2;
        super.v0(c3tq, i);
        TuxIconView tuxIconView = (TuxIconView) this.LLFZ.getValue();
        if (tuxIconView != null) {
            if (c3tq.getHasUnreadMention()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
            if (c3tq.isMute()) {
                tuxIconView.setTintColorRes(R.attr.gp);
            } else {
                tuxIconView.setTintColorRes(R.attr.eb);
            }
        }
    }
}
