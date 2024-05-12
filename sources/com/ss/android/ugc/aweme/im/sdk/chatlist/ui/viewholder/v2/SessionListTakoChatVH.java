package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AnonymousClass064;
import X.AnonymousClass636;
import X.C04270Et;
import X.C0F1;
import X.C1B6;
import X.C221108m2;
import X.C29701Eo;
import X.C3TE;
import X.C3TP;
import X.C3TU;
import X.C53705L5x;
import X.C62822Ol8;
import X.C84563To;
import X.C90193gN;
import X.C96503qY;
import X.C96533qb;
import X.C96573qf;
import X.C96893rB;
import X.C96943rG;
import X.C96963rI;
import X.C97353rv;
import X.EnumC96553qd;
import X.InterfaceC82723Mm;
import X.SY9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SessionListTakoChatVH extends SessionListIMBaseVH {
    public C3TP LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final C62822Ol8 LLII;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C29701Eo z0() {
        Object value = this.LLII.getValue();
        o.LJIIIIZZ(value, "<get-avatarLottieView>(...)");
        return (C29701Eo) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListTakoChatVH(View view) {
        super(view);
        Drawable LIZIZ;
        o.LJIIIZ(view, "view");
        this.LLII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 624));
        C29701Eo z0 = z0();
        if (C0F1.LIZIZ(view, "view.context")) {
            LIZIZ = C04270Et.LIZIZ(view.getContext(), R.drawable.bg8);
        } else {
            LIZIZ = C04270Et.LIZIZ(view.getContext(), R.drawable.bg7);
        }
        z0.setBackground(LIZIZ);
    }

    public final void A0(boolean z) {
        int i;
        C29701Eo z0 = z0();
        int i2 = 4;
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        z0.setVisibility(i);
        SmartAvatarImageView P = P();
        if (P == null) {
            return;
        }
        if (!z) {
            i2 = 0;
        }
        P.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void L(InterfaceC82723Mm interfaceC82723Mm) {
        boolean z;
        float f;
        boolean z2;
        Context context;
        this.LLFZ = (C3TP) interfaceC82723Mm;
        C97353rv LJII = C96963rI.LJII();
        SmartAvatarImageView P = P();
        if (P != null && (context = P.getContext()) != null) {
            z = AnonymousClass636.LJIILJJIL(context);
        } else {
            z = false;
        }
        LJII.getClass();
        String LJIILIIL = SearchServiceImpl.LLLZI().LJIILIIL(z);
        if (LJIILIIL == null) {
            LJIILIIL = "";
        }
        if (!this.LLI) {
            this.LLI = true;
            if (LJIILIIL.length() > 0 && C1B6.LIZIZ(LJIILIIL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLIFFJFJJ = z2;
        }
        if (this.LLIFFJFJJ) {
            A0(true);
            C29701Eo z0 = z0();
            if (C90193gN.LIZ()) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            z0.setScaleX(f);
            C53705L5x.LIZ(z0(), LJIILIIL, new AqS151S0100000_1(this, 825));
            return;
        }
        A0(false);
        C96943rG LJFF = C96963rI.LJFF();
        SmartAvatarImageView P2 = P();
        int intValue = ((Number) C96503qY.LJII.getValue()).intValue();
        LJFF.getClass();
        C96943rG.LIZ(intValue, P2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.C3X3
    public final void LLL(C96533qb c96533qb) {
        super.LLL(c96533qb);
        if (c96533qb.LIZIZ != -1) {
            C29701Eo z0 = z0();
            int i = c96533qb.LIZIZ;
            g0.LJJIJIIJI(i, i, z0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void c0(C3TU c3tu) {
        ConstraintLayout constraintLayout;
        super.c0(c3tu);
        if (C96573qf.LIZLLL() || C3TE.LIZIZ()) {
            View view = this.itemView;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout);
                anonymousClass064.LJIIIIZZ(R.id.fgj, 3, R.id.jqa, 3);
                anonymousClass064.LJIIIIZZ(R.id.fgj, 4, R.id.jqa, 4);
                anonymousClass064.LIZIZ(constraintLayout);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void f0(C3TU c3tu) {
        C96963rI.LIZLLL().getClass();
        if (C84563To.LIZIZ()) {
            AppCompatTextView p0 = p0();
            if (p0 != null) {
                C96503qY m0 = m0();
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                m0.getClass();
                p0.setText(C96503qY.LIZLLL(context, c3tu));
                p0.setVisibility(0);
                return;
            }
            return;
        }
        AppCompatTextView p02 = p0();
        if (p02 == null) {
            return;
        }
        p02.setVisibility(8);
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
        return m0().LIZJ(enumC96553qd);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean t0(C3TU c3tu) {
        boolean z;
        C3TP c3tp = (C3TP) c3tu;
        if (C96893rB.LIZ() && c3tp.getReadStatus() != EnumC96553qd.FAILED) {
            z = true;
        } else {
            z = false;
        }
        if (c3tp.getShowReadStatus() && !c3tp.getHasUnreadMsg() && !c3tp.isShowingTypingStatus() && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListIMBaseVH
    public final void w0(C3TU c3tu) {
        C3TP c3tp = (C3TP) c3tu;
        if (c3tp.getHasUnreadMsg()) {
            x0(c3tp.getSessionUnreadViewState());
        }
    }
}
