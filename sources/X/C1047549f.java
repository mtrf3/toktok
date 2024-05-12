package X;

import Y.ALAdapterS0S0200000_1;
import Y.IDrS41S0100000_1;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.49f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047549f implements InterfaceC1029942l {
    public final View LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final AbstractC1029742j LJLJI;
    public final C99033ud LJLJJI;
    public final ChatRoomViewModel LJLJJL;
    public final InterfaceC1047349d LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public final Context LJZI;
    public final int LJZL;
    public boolean LL;
    public final View LLD;
    public final View LLF;
    public final View LLFF;
    public final TextView LLFFF;
    public final TextView LLFII;
    public final ChatLinearLayoutManager LLFZ;
    public C84661XKn LLI;
    public Animator LLIFFJFJJ;
    public Animator LLII;
    public final C64962gm LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public EnumC1048349n LLIIIZ;

    @Override // X.InterfaceC1029942l
    public final void Hp() {
    }

    public final void LJ() {
        this.LLIIIILZ = true;
        Animator animator = this.LLIFFJFJJ;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLII;
        if (animator2 != null) {
            animator2.cancel();
        }
        C84661XKn c84661XKn = this.LLI;
        if (c84661XKn != null && c84661XKn.isActive()) {
            c84661XKn.LIZIZ(null);
        }
        C48841JEv.LIZJ(this.LLIIII, null);
    }

    @Override // X.InterfaceC1029942l
    public final void Og() {
    }

    public static void LJFF(View view) {
        GradientDrawable gradientDrawable;
        if (C90193gN.LIZ()) {
            float LJIIIIZZ = C1DF.LJIIIIZZ(16);
            float LJIIIIZZ2 = C1DF.LJIIIIZZ(16);
            Drawable background = view.getBackground();
            if (!(background instanceof GradientDrawable) || (gradientDrawable = (GradientDrawable) background) == null) {
                return;
            }
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, LJIIIIZZ, LJIIIIZZ, LJIIIIZZ2, LJIIIIZZ2, 0.0f, 0.0f});
        }
    }

    @Override // X.InterfaceC1029942l
    public final void Ah(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC1029942l
    public final void IP(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Animator animator = this.LLIFFJFJJ;
        if (animator != null) {
            animator.cancel();
        }
        if (this.LLII != null) {
            return;
        }
        float width = this.LLD.getWidth();
        if (C90193gN.LIZ()) {
            width = -width;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hideUnreadMessageTips: ");
        LIZ.append(width);
        C34B.LIZIZ("UnreadMessageTips", X1D.LIZIZ(LIZ));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLD, "translationX", 0.0f, width);
        if (ofFloat != null) {
            ofFloat.setDuration(240L);
            ofFloat.addListener(new ALAdapterS0S0200000_1(this, interfaceC65784Pro, 1));
            ofFloat.start();
        } else {
            ofFloat = null;
        }
        this.LLII = ofFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1048049k
            if (r0 == 0) goto L5f
            r6 = r8
            X.49k r6 = (X.C1048049k) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto L65
            X.49f r4 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            if (r3 == 0) goto L36
            androidx.recyclerview.widget.RecyclerView r2 = r4.LJLILLLLZI
            Y.ARunnableS37S0100000_1 r1 = new Y.ARunnableS37S0100000_1
            r0 = 66
            r1.<init>(r4, r0)
            r2.post(r1)
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3b:
            X.C141335gf.LIZJ(r1)
            X.UtN r0 = X.C36636EZk.LIZ
            X.2gm r3 = X.C48841JEv.LIZ(r0)
            X.49e r2 = new X.49e
            r1 = 0
            r2.<init>(r7, r1)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r3, r1, r1, r2, r0)
            r7.LLI = r0
            r6.LJLIL = r7
            r6.LJLJJI = r4
            java.lang.Object r1 = r0.LJJIJ(r6)
            if (r1 != r5) goto L5d
            return r5
        L5d:
            r4 = r7
            goto L22
        L5f:
            X.49k r6 = new X.49k
            r6.<init>(r7, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047549f.LIZJ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC1029942l
    public final void QG(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void Vj(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh callback: ");
        LIZ.append(this.LJLLI);
        C34B.LJI("UnreadMessageTips", X1D.LIZIZ(LIZ));
        if (this.LJLLI) {
            int i = C1048249m.LIZ[this.LLIIIZ.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    return;
                }
                XKX.LIZLLL(this.LLIIII, null, null, new C1047249c(this, this.LJLLJ, null), 3);
                return;
            }
            XKX.LIZLLL(this.LLIIII, null, null, new C1047149b(this, null), 3);
            return;
        }
        if (this.LJLJI.getItemCount() <= 0 || this.LJLLL <= 0 || this.LJLJLJ || !this.LL) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C1047849i(this, null), 3);
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public final void LIZLLL(long j, EnumC1048349n target) {
        o.LJIIIZ(target, "target");
        if (j == -1 || this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        this.LLIIIZ = target;
        LIZIZ(new AqS151S0100000_1(this, 777));
        int i = C1048249m.LIZ[this.LLIIIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJLLL = 50L;
                this.LJLLJ = j;
                XKX.LIZLLL(this.LLIIII, null, null, new C1047249c(this, j, null), 3);
                return;
            }
            XKX.LIZLLL(this.LLIIII, null, null, new C1047249c(this, j, null), 3);
            return;
        }
        XKX.LIZLLL(this.LLIIII, null, null, new C1047149b(this, null), 3);
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r8, long r10, long r12, X.InterfaceC67352kd<? super java.lang.Boolean> r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof X.C1047949j
            if (r0 == 0) goto L65
            r5 = r14
            X.49j r5 = (X.C1047949j) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r4 = r5.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 != r2) goto L6b
            X.49f r2 = r5.LJLILLLLZI
            X.49f r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L24:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L35
            boolean r0 = r4.booleanValue()
        L2c:
            r2.LJLL = r0
            boolean r0 = r1.LJLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            r0 = 0
            goto L2c
        L37:
            X.C141335gf.LIZJ(r4)
            java.lang.String r1 = "UnreadMessageTips"
            java.lang.String r0 = "checkShowUnreadMessageTips"
            X.C34B.LJI(r1, r0)
            r7.LJLJLJ = r2
            X.UtN r0 = X.C36636EZk.LIZ
            X.2gm r1 = X.C48841JEv.LIZ(r0)
            X.49g r6 = new X.49g
            r14 = 0
            r6.<init>(r7, r8, r10, r12, r14)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r1, r14, r14, r6, r0)
            r5.LJLIL = r7
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r2
            java.lang.Object r4 = r0.LJJIJ(r5)
            if (r4 != r3) goto L62
            return r3
        L62:
            r2 = r7
            r1 = r7
            goto L24
        L65:
            X.49j r5 = new X.49j
            r5.<init>(r7, r14)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047549f.LIZ(long, long, long, X.2kd):java.lang.Object");
    }

    public C1047549f(View rootView, RecyclerView recyclerView, AbstractC1029742j adapter, C99033ud sessionInfo, ChatRoomViewModel chatRoomViewModel, InterfaceC1047349d interfaceC1047349d) {
        TextView textView;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(chatRoomViewModel, "chatRoomViewModel");
        this.LJLIL = rootView;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = adapter;
        this.LJLJJI = sessionInfo;
        this.LJLJJL = chatRoomViewModel;
        this.LJLJJLL = interfaceC1047349d;
        this.LJLLLLLL = -1;
        Context context = rootView.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        this.LJZI = context;
        this.LJZL = C1DF.LJIIIZ(60);
        View findViewById = rootView.findViewById(R.id.mu9);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.unread_tips_container)");
        this.LLD = findViewById;
        View unreadTipView$lambda$0 = rootView.findViewById(R.id.mu7);
        o.LJIIIIZZ(unreadTipView$lambda$0, "unreadTipView$lambda$0");
        LJFF(unreadTipView$lambda$0);
        this.LLF = unreadTipView$lambda$0;
        View unreadMentionView$lambda$1 = rootView.findViewById(R.id.mu4);
        o.LJIIIIZZ(unreadMentionView$lambda$1, "unreadMentionView$lambda$1");
        LJFF(unreadMentionView$lambda$1);
        this.LLFF = unreadMentionView$lambda$1;
        this.LLFFF = (TextView) rootView.findViewById(R.id.mu6);
        ChatLinearLayoutManager chatLinearLayoutManager = null;
        if (C81253Gv.LIZ()) {
            textView = (TextView) rootView.findViewById(R.id.mu3);
        } else {
            textView = null;
        }
        this.LLFII = textView;
        if (recyclerView.getLayoutManager() instanceof ChatLinearLayoutManager) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager");
            chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager;
        }
        this.LLFZ = chatLinearLayoutManager;
        this.LLIIII = C48841JEv.LIZ(EXV.LIZ);
        this.LLIIIZ = EnumC1048349n.LAST_UNREAD;
        recyclerView.LJIIJJI(new IDrS41S0100000_1(this, 7));
    }
}
