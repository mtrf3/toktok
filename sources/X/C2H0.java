package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.2H0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H0 extends C45101pq implements C12D {
    public final LinkedList<ChatMessage> LJLJLJ;
    public final LinkedList<GiftMessage> LJLJLLL;
    public final DataChannel LJLL;
    public final Context LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public InterfaceC92693kP LJLLJ;
    public C12U LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final LinearLayout LJZI;
    public final C30011Ft LJZL;
    public final C30031Fv LL;
    public final LinkedList<C37781e2> LLD;
    public final int LLF;
    public final int LLFF;

    public final void LLLZIL() {
        LLLZI(true);
        if (this.LJLLILLLL.LJFF() > 0) {
            C73318Sq2 c73318Sq2 = this.LJLLILLLL;
            InterfaceC92693kP interfaceC92693kP = this.LJLLJ;
            if (interfaceC92693kP != null) {
                c73318Sq2.LIZIZ(interfaceC92693kP);
            } else {
                o.LJIJI("observer");
                throw null;
            }
        }
    }

    @Override // X.C12D
    public final boolean LJ() {
        if (this.LJLJLJ.isEmpty() && this.LJLJLLL.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.C12D
    public final boolean LJJL() {
        Boolean bool;
        ChatMessage poll;
        boolean z;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("consumeChatMessage");
            LIZ.append(this.LJLJLLL.size());
            LIZ.append(this.LJLJLJ.size());
            C0NB.LJIIIZ("SmallMoreView", X1D.LIZIZ(LIZ));
        }
        C12U c12u = this.LJLLL;
        if (c12u != null) {
            InterfaceC266512v interfaceC266512v = c12u.LIZLLL;
            if (interfaceC266512v != null) {
                z = interfaceC266512v.LLIIIJ();
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) || !this.LJLJLLL.isEmpty() || C29306Beo.LJJIFFI((Boolean) this.LJLL.kv0(CZM.class)) || (poll = this.LJLJLJ.poll()) == null) {
            return false;
        }
        this.LJZL.LJJLJLI(poll, this.LJLZ, this.LJZ, this.LJLLLLLL, false);
        Boolean LIZJ = InterfaceC30442Bx8.LJJIJIIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_COMMENT_MSG_PUSH.value");
        LLLZ(LIZJ.booleanValue());
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("SmallMoreView", "show ChatMessage after another ChatMessage");
        }
        LLLZL();
        return true;
    }

    public final void LLLZL() {
        View view = this.LJLJJI;
        if (view != null) {
            view.measure(0, 0);
        }
        if (this.LJLJJI.getMeasuredWidth() != 0) {
            LLLLZIL(this.LJLJJI.getMeasuredWidth(), this.LJLJJI.getMeasuredHeight());
            C12U c12u = this.LJLLL;
            if (c12u != null) {
                c12u.LIZIZ(this.LJLJJI.getMeasuredWidth(), this.LJLJJI.getMeasuredHeight());
            }
        }
    }

    @Override // X.C45101pq
    public final void dismiss() {
        this.LJLLILLLL.dispose();
        C30011Ft c30011Ft = this.LJZL;
        DataChannel dataChannel = c30011Ft.LJLL;
        if (dataChannel != null) {
            dataChannel.jv0(c30011Ft);
        }
        super.dismiss();
    }

    @Override // X.C12D
    public final void LJIJ(boolean z) {
        C12U c12u;
        C3T c3t;
        if (z) {
            int i = this.LJLLLLLL + 1;
            this.LJLLLLLL = i;
            if (i >= 3 && (c12u = this.LJLLL) != null && (c3t = c12u.LJI) != null) {
                c3t.LIZLLL();
            }
        }
        XKQ xkq = this.LJZL.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C87277YNd.LJJIIZ(this.LJZL);
    }

    public final void LLLZ(boolean z) {
        int i;
        if (z) {
            Integer num = (Integer) this.LJLL.kv0(NewMessageNumChannel.class);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            this.LJLL.rv0(NewMessageNumChannel.class, Integer.valueOf(i - 1));
        }
    }

    public final void LLLZI(boolean z) {
        LJIJ(false);
        Iterator<C37781e2> it = this.LLD.iterator();
        while (it.hasNext()) {
            it.next().LJJLJLI(false, false);
        }
        this.LJZI.removeAllViews();
        this.LLD.clear();
        C87277YNd.LJJIIZ(this.LL);
        if (z) {
            View contentView = this.LJLJJI;
            o.LJIIIIZZ(contentView, "contentView");
            C87277YNd.LJJIIZ(contentView);
        }
    }

    @Override // X.C12D
    public final void LJI(C37781e2 giftItemView, boolean z) {
        C12U c12u;
        C3T c3t;
        o.LJIIIZ(giftItemView, "giftItemView");
        if (z) {
            int i = this.LJLLLL + 1;
            this.LJLLLL = i;
            if (i >= 3 && (c12u = this.LJLLL) != null && (c3t = c12u.LJI) != null) {
                c3t.LIZIZ();
            }
        }
        this.LLD.remove(giftItemView);
        C16880lQ.LJZI(this.LJZI, giftItemView);
        LLLZL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2H0(java.util.LinkedList r7, java.util.LinkedList r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            r6 = this;
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdkapi.host.IHostAppContext r0 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r0
            r5 = 0
            if (r0 == 0) goto Lb6
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r0.context()
            r0 = 2131886734(0x7f12028e, float:1.9408055E38)
            r1.<init>(r2, r0)
        L17:
            java.lang.String r0 = "getContextWithStyle()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "chatMessageList"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "giftMessageList"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "dataChannel"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r6.<init>(r1)
            r6.LJLJLJ = r7
            r6.LJLJLLL = r8
            r6.LJLL = r9
            r6.LJLLI = r1
            X.Sq2 r0 = new X.Sq2
            r0.<init>()
            r6.LJLLILLLL = r0
            r0 = 1
            r6.LJLZ = r0
            r6.LJZ = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r6.LLD = r0
            r0 = 215(0xd7, float:3.01E-43)
            int r0 = X.C87277YNd.LJIIJJI(r0)
            r6.LLF = r0
            r0 = 36
            int r0 = X.C87277YNd.LJIIJJI(r0)
            int r0 = r0 * 2
            r6.LLFF = r0
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r1)
            r0 = 2131564218(0x7f0d16ba, float:1.8753915E38)
            android.view.View r4 = X.C16880lQ.LLLZIIL(r0, r1, r5)
            r6.LJLJJI = r4
            r2 = 0
            r6.LLLLZ(r2, r2)
            r6.LLLLZIL(r2, r2)
            r0 = 2131367719(0x7f0a1727, float:1.8355368E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.String r0 = "contentView.findViewById(R.id.gift_view)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.LJZI = r1
            r0 = 2131364637(0x7f0a0b1d, float:1.8349117E38)
            android.view.View r3 = r4.findViewById(r0)
            java.lang.String r0 = "contentView.findViewById(R.id.comment_view)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.1Ft r3 = (X.C30011Ft) r3
            r6.LJZL = r3
            r0 = 2131376602(0x7f0a39da, float:1.8373385E38)
            android.view.View r1 = r4.findViewById(r0)
            java.lang.String r0 = "contentView.findViewById(R.id.star_comment_view)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.1Fv r1 = (X.C30031Fv) r1
            r6.LL = r1
            r1.LJJZ(r2, r9, r5)
            r3.LJLILLLLZI = r6
            r3.LJLL = r9
            java.lang.Class<com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel> r2 = com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel.class
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 347(0x15b, float:4.86E-43)
            r1.<init>(r3, r0)
            r9.mv0(r2, r3, r1)
            X.C87277YNd.LJJIIZ(r3)
            return
        Lb6:
            r1 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2H0.<init>(java.util.LinkedList, java.util.LinkedList, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
