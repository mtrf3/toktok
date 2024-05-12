package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AVS;
import X.AbstractC82843My;
import X.C04270Et;
import X.C17N;
import X.C221108m2;
import X.C3TE;
import X.C3TR;
import X.C62822Ol8;
import X.C82483Lo;
import X.C82493Lp;
import X.InterfaceC82723Mm;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SessionListMessageRequestCellVH extends SessionListBaseVH {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final AVS c0() {
        return (AVS) this.LJLLLLLL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListMessageRequestCellVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 612));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 613));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public final void L(InterfaceC82723Mm interfaceC82723Mm) {
        SmartAvatarImageView P;
        Object avatar = ((C3TR) interfaceC82723Mm).getAvatar();
        if (!(avatar instanceof Integer) || (P = P()) == null) {
            return;
        }
        P.setImageDrawable(C04270Et.LIZIZ(P.getContext(), ((Number) avatar).intValue()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    /* renamed from: a0 */
    public final void v0(InterfaceC82723Mm interfaceC82723Mm, int i) {
        View view;
        C3TR c3tr = (C3TR) interfaceC82723Mm;
        super.v0(c3tr, i);
        if (c3tr.getShowRightArrow() && (view = (View) this.LJLLLL.getValue()) != null) {
            view.setVisibility(0);
        }
        AbstractC82843My sessionUnreadViewState = c3tr.getSessionUnreadViewState();
        if (sessionUnreadViewState instanceof C82493Lp) {
            AVS c0 = c0();
            if (c0 != null) {
                c0.setVariant(1);
            }
            AVS c02 = c0();
            if (c02 != null) {
                C17N.LJJLIIIJJI(c02);
            }
            AVS c03 = c0();
            if (c03 != null) {
                c03.setCount(((C82493Lp) sessionUnreadViewState).getNum());
            }
        } else if (sessionUnreadViewState instanceof C82483Lo) {
            AVS c04 = c0();
            if (c04 != null) {
                c04.setVariant(0);
            }
            AVS c05 = c0();
            if (c05 != null) {
                C17N.LJJLIIIJJI(c05);
            }
        } else {
            AVS c06 = c0();
            if (c06 != null) {
                C17N.LJJIIJZLJL(c06);
            }
        }
        if (!C3TE.LIZIZ()) {
            return;
        }
        if (c3tr.getSessionUnreadViewState() instanceof C82493Lp) {
            TuxTextView V = V();
            if ((V instanceof TuxTextView) && V != null) {
                V.setTuxFont(42);
            }
            TuxTextView U = U();
            if (!(U instanceof TuxTextView) || U == null) {
                return;
            }
            U.setTuxFont(52);
            U.setTextColorRes(R.attr.go);
            return;
        }
        TuxTextView V2 = V();
        if ((V2 instanceof TuxTextView) && V2 != null) {
            V2.setTuxFont(41);
        }
        TuxTextView U2 = U();
        if (!(U2 instanceof TuxTextView) || U2 == null) {
            return;
        }
        U2.setTuxFont(51);
        U2.setTextColorRes(R.attr.dt);
    }
}
