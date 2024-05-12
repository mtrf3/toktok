package X;

import Y.IDCListenerS108S0200000_1;
import Y.IDCListenerS294S0100000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.46x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1041546x extends RecyclerView.ViewHolder {
    public final EnumC110124Tw LJLIL;
    public String LJLILLLLZI;
    public final int LJLJI;
    public final AnonymousClass470 LJLJJI;
    public int LJLJJL;
    public final C119624mk LJLJJLL;
    public final AnonymousClass472<C71897SJp> LJLJL;
    public final View LJLJLJ;
    public final AnonymousClass472<TuxTextView> LJLJLLL;
    public final AnonymousClass472<TuxTextView> LJLL;
    public final C47E LJLLI;
    public final ViewOnTouchListenerC100423ws LJLLILLLL;
    public final C101253yD LJLLJ;
    public C99033ud LJLLL;
    public GestureDetector LJLLLL;
    public final TuxIconView LJLLLLLL;
    public final AnonymousClass474 LJLZ;
    public ChatPageNudgeViewModel LJZ;
    public C109544Rq LJZI;
    public String LJZL;
    public final AnonymousClass472<View> LL;
    public final AnonymousClass472<TuxIconView> LLD;
    public final AnonymousClass462 LLF;
    public IMContact LLFF;
    public InterfaceC1039746f LLFFF;
    public final C47N LLFII;
    public IMUser LLFZ;
    public boolean LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public C46Q LLII;
    public final int[] LLIIII;

    public void M() {
    }

    public void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
    }

    public boolean V(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        return false;
    }

    public boolean X(C109544Rq c109544Rq) {
        return false;
    }

    public void onAttachedToWindow() {
        IMContact iMContact;
        C109544Rq c109544Rq;
        C109544Rq c109544Rq2;
        this.LLI = true;
        AnonymousClass462 anonymousClass462 = this.LLF;
        if (anonymousClass462 != null && ((((c109544Rq = anonymousClass462.LIZLLL) != null && c109544Rq.getMsgStatus() == 5) || ((c109544Rq2 = anonymousClass462.LIZLLL) != null && c109544Rq2.getMsgStatus() == 2)) && anonymousClass462.LIZIZ(anonymousClass462.LJI))) {
            C1042547h.LJIIJJI(anonymousClass462.LIZLLL);
        }
        C109544Rq c109544Rq3 = this.LJZI;
        if (c109544Rq3 != null) {
            C84823Uo.LIZ(c109544Rq3);
        }
        if (!TextUtils.isEmpty(this.LJZL) && !EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        C119624mk c119624mk = this.LJLJJLL;
        if (c119624mk != null && c119624mk.getVisibility() == 0 && (iMContact = this.LLFF) != null) {
            g0(this.LJZI, iMContact);
        }
    }

    public void LJJJJIZL() {
        AnonymousClass462 anonymousClass462 = this.LLF;
        if (anonymousClass462 != null) {
            anonymousClass462.LJI = null;
            anonymousClass462.LIZLLL = null;
        }
        this.LJLILLLLZI = "";
        this.LJZI = null;
        this.LJZL = null;
        this.LLFF = null;
        InterfaceC1039746f interfaceC1039746f = this.LLFFF;
        if (interfaceC1039746f != null) {
            interfaceC1039746f.LLZ();
        }
        this.LLI = false;
    }

    public View a0() {
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            return anonymousClass470.LIZ;
        }
        return null;
    }

    public boolean Y() {
        return C1044648c.LIZ();
    }

    public void onDetachedFromWindow() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
        this.LLI = false;
        C47N c47n = this.LLFII;
        c47n.LIZIZ = 0.0f;
        c47n.LIZJ = 0.0f;
        c47n.LIZLLL = 0.0f;
        c47n.LJ = 0.0f;
        c47n.LJIIJ = false;
        c47n.LJIIIZ = false;
        c47n.LIZIZ(null, 0.0f);
        c47n.LIZ();
    }

    public static boolean f0(C109544Rq c109544Rq) {
        if (c109544Rq != null && (c109544Rq.getMsgStatus() == 2 || c109544Rq.getMsgStatus() == 5)) {
            return true;
        }
        return false;
    }

    public final void L(View view) {
        if (view == null) {
            return;
        }
        java.util.Set set = (java.util.Set) this.LLFII.LJI.getValue();
        if (set.contains(view)) {
            return;
        }
        set.add(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.47B] */
    public final void c0(C99033ud c99033ud) {
        EnumC110124Tw enumC110124Tw;
        AnonymousClass470 anonymousClass470;
        C98523to c98523to;
        Context context = this.itemView.getContext();
        C111774a5 c111774a5 = null;
        if (c99033ud.isTakoChat$im_base_release() || (enumC110124Tw = this.LJLIL) == EnumC110124Tw.UNSUPPORTED_RECEIVE || enumC110124Tw == EnumC110124Tw.UNSUPPORTED_SEND) {
            return;
        }
        if ((c99033ud.isFriendChat() || c99033ud.isEnterpriseChat() || c99033ud.isGroupChat() || ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && c98523to.isTCM())) && (anonymousClass470 = this.LJLJJI) != null && this.LLFFF == null) {
            if (C1044648c.LIZ() && this.LJLIL.getContentLayoutId() != null) {
                C111764a4 c111764a4 = (C111764a4) this.itemView.findViewById(R.id.g2w);
                if (c111764a4 != 0) {
                    L(c111764a4);
                    boolean isDissolvedGroup = c99033ud.isDissolvedGroup();
                    InterfaceC111904aI interfaceC111904aI = new InterfaceC111904aI() { // from class: X.47A
                        @Override // X.InterfaceC111904aI
                        public final void LIZ() {
                            AbstractC1041546x abstractC1041546x = AbstractC1041546x.this;
                            abstractC1041546x.getClass();
                            abstractC1041546x.LJLILLLLZI = "❤️";
                        }
                    };
                    c111764a4.LJLLL = isDissolvedGroup;
                    c111764a4.LJLLLL = interfaceC111904aI;
                    c111774a5 = c111764a4;
                }
            } else {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.g2w);
                if (viewGroup == null) {
                    return;
                }
                L(viewGroup);
                C1040046i c1040046i = InterfaceC1039746f.LJJJJJL;
                o.LJIIIIZZ(context, "context");
                boolean isGroupChat = c99033ud.isGroupChat();
                boolean isDissolvedGroup2 = c99033ud.isDissolvedGroup();
                ?? r9 = new InterfaceC111904aI() { // from class: X.47B
                    @Override // X.InterfaceC111904aI
                    public final void LIZ() {
                        AbstractC1041546x abstractC1041546x = AbstractC1041546x.this;
                        abstractC1041546x.getClass();
                        abstractC1041546x.LJLILLLLZI = "❤️";
                    }
                };
                c1040046i.getClass();
                c111774a5 = new C111774a5(context, viewGroup, anonymousClass470, isGroupChat, isDissolvedGroup2, r9);
            }
            this.LLFFF = c111774a5;
        }
    }

    public void h0(C109544Rq c109544Rq) {
        if (C93793mB.LJ(c109544Rq)) {
            C1042547h.LJIIIIZZ(c109544Rq, "show");
        }
    }

    public void i0(View.OnLongClickListener onLongClickListener) {
        o.LJIIIZ(onLongClickListener, "onLongClickListener");
        C119624mk c119624mk = this.LJLJJLL;
        if (c119624mk != null) {
            c119624mk.setOnLongClickListener(new IDCListenerS108S0200000_1(this, (IDCListenerS294S0100000_1) onLongClickListener, 2));
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ.setOnLongClickListener(new IDCListenerS108S0200000_1(this, (IDCListenerS294S0100000_1) onLongClickListener, 3));
        }
    }

    @QD3
    public final void onUserUpdate(C39R event) {
        IMUser LJIIJ;
        TuxTextView LIZ;
        o.LJIIIZ(event, "event");
        if (!TextUtils.equals(this.LJZL, event.LJLIL) || (LJIIJ = C80533Eb.LJIIJ(event.LJLIL, event.LJLILLLLZI)) == null) {
            return;
        }
        if ((C1041346v.LIZIZ() & 4) == 0) {
            UrlModel avatarThumb = LJIIJ.getAvatarThumb();
            if (!X(this.LJZI)) {
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    C78765Uvh.LIZ(this.LJLJJLL, R.drawable.b0p);
                } else {
                    C4AS.LJII(this.LJLJJLL, avatarThumb, "BaseViewHolder:onUserUpdate", null, null, 0, 0, 504);
                }
            }
        }
        AnonymousClass472<TuxTextView> anonymousClass472 = this.LJLJLLL;
        if (anonymousClass472 == null || (LIZ = anonymousClass472.LIZ()) == null) {
            return;
        }
        LIZ.setText(LJIIJ.getDisplayName());
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        C119624mk c119624mk = this.LJLJJLL;
        if (c119624mk != null) {
            C16880lQ.LJJJJIZL(c119624mk, onClickListener);
        }
        AnonymousClass472<TuxIconView> anonymousClass472 = this.LLD;
        anonymousClass472.LIZJ = onClickListener;
        if (anonymousClass472.LIZIZ.LIZIZ()) {
            anonymousClass472.LIZ();
        }
        AnonymousClass472<View> anonymousClass4722 = this.LL;
        anonymousClass4722.LIZJ = onClickListener;
        if (anonymousClass4722.LIZIZ.LIZIZ()) {
            anonymousClass4722.LIZ();
        }
        if (this.LJLIL.getMessagePositionType() == C47R.END) {
            if (C43J.LIZLLL()) {
                C47E c47e = this.LJLLI;
                if (c47e == null) {
                    return;
                }
                c47e.setOnNotSentClickCallback(new AqS167S0100000_1(onClickListener, 255));
                return;
            }
            TuxIconView tuxIconView = this.LJLLLLLL;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, onClickListener);
            }
            this.LJLLILLLL.LIZ(this.LJLLLLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1041546x(View itemView, EnumC110124Tw type) {
        super(itemView);
        C47E c47e;
        AnonymousClass474 anonymousClass474;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = "";
        this.LJLLILLLL = new ViewOnTouchListenerC100423ws();
        Context context = itemView.getContext();
        this.LJLJI = (int) KL2.LIZJ(context, 8.0f);
        C47N c47n = new C47N();
        this.LLFII = c47n;
        o.LJIIIIZZ(context, "context");
        this.LJLLJ = new C101253yD(AnonymousClass636.LJIIIIZZ(R.attr.e2, context), null, "chat", null);
        AnonymousClass479.LIZ.getClass();
        this.LJLJLLL = new AnonymousClass472<>(R.id.mzt, AnonymousClass473.LIZ(R.id.dz9, itemView));
        this.LJLJJLL = (C119624mk) itemView.findViewById(R.id.acf);
        this.LJLJLJ = itemView.findViewById(R.id.naz);
        this.LJLL = new AnonymousClass472<>(R.id.h4b, AnonymousClass473.LIZ(R.id.gno, itemView));
        this.LJLJL = new AnonymousClass472<>(R.id.b7o, AnonymousClass473.LIZ(R.id.b7p, itemView));
        KeyEvent.Callback findViewById = itemView.findViewById(R.id.gi1);
        if (findViewById instanceof C47E) {
            c47e = (C47E) findViewById;
        } else {
            c47e = null;
        }
        this.LJLLI = c47e;
        TuxIconView tuxIconView = (TuxIconView) itemView.findViewById(R.id.kf1);
        this.LJLLLLLL = tuxIconView;
        if (tuxIconView != null) {
            anonymousClass474 = new AnonymousClass474(tuxIconView);
        } else {
            anonymousClass474 = null;
        }
        this.LJLZ = anonymousClass474;
        View findViewById2 = itemView.findViewById(R.id.bst);
        this.LJLJJI = findViewById2 != null ? new AnonymousClass470(findViewById2) : null;
        AnonymousClass479 LIZ = AnonymousClass473.LIZ(R.id.ee0, itemView);
        AnonymousClass472<TuxIconView> anonymousClass472 = new AnonymousClass472<>(R.id.dlw, LIZ);
        this.LLD = anonymousClass472;
        AnonymousClass472<View> anonymousClass4722 = new AnonymousClass472<>(R.id.iw9, LIZ);
        this.LL = anonymousClass4722;
        this.LLF = new AnonymousClass462(anonymousClass472, anonymousClass4722, itemView.getContext());
        L(itemView.findViewById(R.id.j7l));
        L(itemView.findViewById(R.id.edz));
        View findViewById3 = itemView.findViewById(R.id.kwr);
        if (findViewById3 != null) {
            c47n.LJII = findViewById3;
        }
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 802));
        this.LLIIII = new int[2];
    }

    public final void Q(C109544Rq c109544Rq, IMContact iMContact) {
        C119624mk c119624mk = this.LJLJJLL;
        if (c119624mk != null && c119624mk.getVisibility() == 0) {
            this.LJLJJLL.setTag(67108864, String.valueOf(c109544Rq.getSender()));
            this.LJLJJLL.setTag(50331648, 3);
            this.LJLLILLLL.LIZ(this.LJLJJLL);
            g0(c109544Rq, iMContact);
            C94733nh.LIZ(this.LJLJJLL, iMContact);
        }
    }

    public final void U(IMUser iMUser, C109544Rq msg) {
        String str;
        String str2;
        o.LJIIIZ(msg, "msg");
        this.LLFZ = iMUser;
        C101253yD c101253yD = this.LJLLJ;
        c101253yD.LJLJL = iMUser;
        if (iMUser != null) {
            str = iMUser.getUid();
        } else {
            str = null;
        }
        c101253yD.LJLJJI = str;
        if (iMUser != null) {
            str2 = iMUser.getSecUid();
        } else {
            str2 = null;
        }
        c101253yD.LJLJJL = str2;
        this.LJZL = null;
        if (iMUser == null) {
            this.LJZL = String.valueOf(msg.getSender());
            C80533Eb.LJIIJ(String.valueOf(msg.getSender()), msg.getSecSender());
            return;
        }
        this.LLFF = iMUser;
        Q(msg, iMUser);
        AnonymousClass472<TuxTextView> anonymousClass472 = this.LJLJLLL;
        if (anonymousClass472 != null) {
            anonymousClass472.LIZIZ();
        }
    }

    public final void g0(C109544Rq c109544Rq, IMContact iMContact) {
        if (X(c109544Rq)) {
            return;
        }
        if ((C1041346v.LIZIZ() & 4) != 0) {
            InterfaceC1040946r interfaceC1040946r = (InterfaceC1040946r) this.LLIFFJFJJ.getValue();
            if (interfaceC1040946r != null) {
                interfaceC1040946r.LIZ(iMContact, 0, 0);
                return;
            }
            return;
        }
        C4AS.LJII(this.LJLJJLL, iMContact.getDisplayAvatar(), "BaseViewHolder:avatar", null, null, 0, 0, 504);
    }

    public final void l0(boolean z, boolean z2) {
        C47N c47n = this.LLFII;
        c47n.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isConversationAbleToInput ");
        LIZ.append(z);
        C34B.LIZIZ("WipeForReplyGestureHelper", X1D.LIZIZ(LIZ));
        c47n.LJIIL = z;
        AnonymousClass462 anonymousClass462 = this.LLF;
        if (anonymousClass462 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isConversationAbleToInput ");
            LIZ2.append(z);
            C34B.LIZIZ("ForwardOrReplyIcon", X1D.LIZIZ(LIZ2));
            if (anonymousClass462.LJII == z) {
                return;
            }
            anonymousClass462.LJII = z;
            anonymousClass462.LIZ(!z2);
        }
    }

    public void T(C81243Gu c81243Gu, C109544Rq msg, C109544Rq c109544Rq) {
        o.LJIIIZ(msg, "msg");
        this.LJZL = null;
        if (c81243Gu == null || C44384HbQ.LJLIIIL(c81243Gu) == null || !o.LJ(c81243Gu.getUid(), String.valueOf(msg.getSender()))) {
            return;
        }
        this.LLFF = c81243Gu;
        Q(msg, c81243Gu);
        if (this.LJLJLLL == null) {
            return;
        }
        if (!msg.isSelf()) {
            int i = 0;
            if (msg.getConversationType() == AbstractC63505Ow9.LIZIZ) {
                TuxTextView LIZ = this.LJLJLLL.LIZ();
                if (LIZ != null) {
                    LIZ.setText(c81243Gu.getDisplayName());
                }
                if (LIZ != null) {
                    o.LJIIIIZZ(this.itemView.getContext(), "itemView.context");
                    LIZ.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)) + ((int) ((C63081OpJ.LJJJJL(r0) / 375) * 239)));
                    Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    LIZ.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
                    if (!C78939UyV.LJJIJIIJIL(msg, c109544Rq)) {
                        i = 8;
                    }
                    LIZ.setVisibility(i);
                }
                L(LIZ);
                return;
            }
        }
        this.LJLJLLL.LIZIZ();
    }

    public void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
        boolean z;
        C4KA c4ka;
        C49V c49v;
        View findViewById;
        C4KA c4ka2;
        boolean z2;
        int i2;
        int LJIIIZ;
        boolean z3;
        boolean z4;
        int LJIIIZ2;
        boolean z5;
        int LJIIIZ3;
        int LJIIIZ4;
        boolean z6;
        long j;
        boolean z7;
        long j2;
        int i3;
        o.LJIIIZ(msg, "msg");
        this.LJZI = msg;
        C47N c47n = this.LLFII;
        c47n.LJFF = this.itemView;
        c47n.LIZ = msg;
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(134217728, msg);
            L(this.LJLJJI.LIZ);
        }
        C119624mk c119624mk = this.LJLJJLL;
        boolean z8 = true;
        boolean z9 = false;
        if (c119624mk != null) {
            c119624mk.setTag(134217728, msg);
            String conversationId = msg.getConversationId();
            if (conversationId != null) {
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                if (C100013wD.LIZ(C4WC.LIZIZ.LIZ(conversationId)) && (C100013wD.LIZIZ & 16) != 16) {
                    this.LJLJJLL.setEnabled(false);
                }
            }
            C119624mk c119624mk2 = this.LJLJJLL;
            boolean LJJIJIL = C78939UyV.LJJIJIL(msg, c109544Rq2);
            if (msg.isSelf()) {
                i3 = 8;
            } else if (LJJIJIL) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            c119624mk2.setVisibility(i3);
        }
        ChatPageNudgeViewModel chatPageNudgeViewModel = this.LJZ;
        if (chatPageNudgeViewModel != null && (C4FU.LJFF(msg) || C4FU.LJI(msg))) {
            C1041746z c1041746z = new C1041746z(msg);
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
            C109544Rq LIZJ = c63164Oqe.LIZJ(chatPageNudgeViewModel.LJLJJL, chatPageNudgeViewModel.LJLJJI);
            if (LIZJ != null) {
                j = LIZJ.getOrderIndex();
            } else {
                j = -1;
            }
            if (msg.getOrderIndex() > j) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                if (msg.getOrderIndex() > chatPageNudgeViewModel.LJLJL && c1041746z.LIZ() != EnumC1041646y.INTERACTED && c1041746z.LIZ() != EnumC1041646y.NOT_AVAILABLE) {
                    if (c1041746z.LIZ() == EnumC1041646y.NOT_INTERACT) {
                        c1041746z.LIZ.addLocalExt("nudge_state_key", EnumC1041646y.READY_TO_INTERACT.getValue());
                    }
                    if (chatPageNudgeViewModel.LJLJL < msg.getOrderIndex()) {
                        j2 = msg.getOrderIndex();
                    } else {
                        j2 = chatPageNudgeViewModel.LJLJL;
                    }
                    chatPageNudgeViewModel.LJLJL = j2;
                }
            }
            EnumC1041646y LIZ = c1041746z.LIZ();
            EnumC1041646y enumC1041646y = EnumC1041646y.NOT_AVAILABLE;
            if (LIZ != enumC1041646y && c1041746z.LIZ() != EnumC1041646y.INTERACTED) {
                c1041746z.LIZ.addLocalExt("nudge_state_key", enumC1041646y.getValue());
                C31G.LIZ();
                c63164Oqe.LJIIZILJ(null, c1041746z.LIZ);
            }
        }
        this.LJLL.LIZIZ();
        C110134Tx c110134Tx = EnumC110124Tw.Companion;
        int itemViewType = getItemViewType();
        c110134Tx.getClass();
        if (C110134Tx.LJ(itemViewType).getMessagePositionType() == C47R.END) {
            if (C43J.LIZLLL()) {
                C47E c47e = this.LJLLI;
                if (c47e != null) {
                    if (i == 0 || (i == 1 && C1031943f.LIZ(c109544Rq2))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c47e.LIZ(msg, z6);
                }
            } else {
                AnonymousClass474 anonymousClass474 = this.LJLZ;
                if (anonymousClass474 != null) {
                    TuxIconView tuxIconView = anonymousClass474.LIZ;
                    tuxIconView.setTag(50331648, 6);
                    tuxIconView.setTag(134217728, msg);
                    anonymousClass474.LIZIZ = msg;
                    anonymousClass474.LIZ();
                }
            }
        }
        M();
        if (msg.getReferenceInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean LJJIJIIJIL = C78939UyV.LJJIJIIJIL(msg, c109544Rq);
        boolean LJJIJIL2 = C78939UyV.LJJIJIL(msg, c109544Rq2);
        if (!V(msg)) {
            int i4 = 12;
            if (getItemViewType() == EnumC110124Tw.DATE_SEPARATOR.getViewType() && c109544Rq2 != null) {
                if (c109544Rq2.getMsgType() == 1 || c109544Rq2.getMsgType() == 1031) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                View view = this.itemView;
                int paddingLeft = view.getPaddingLeft();
                boolean LJJIJIIJIL2 = C78939UyV.LJJIJIIJIL(c109544Rq2, c109544Rq);
                if (z5) {
                    LJIIIZ3 = C1DF.LJIIIZ(8);
                } else {
                    if (!LJJIJIIJIL2) {
                        i4 = 2;
                    }
                    LJIIIZ3 = C1DF.LJIIIZ(i4);
                }
                int paddingRight = this.itemView.getPaddingRight();
                if (z5) {
                    LJIIIZ4 = C1DF.LJIIIZ(8);
                } else {
                    LJIIIZ4 = C1DF.LJIIIZ(2);
                }
                view.setPadding(paddingLeft, LJIIIZ3, paddingRight, LJIIIZ4);
            } else {
                if (msg.getMsgType() == 1 || msg.getMsgType() == 1031) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (msg.getMsgType() == 4001) {
                    LJIIIZ = C7MY.LIZIZ(16);
                } else if (z2) {
                    LJIIIZ = C1DF.LJIIIZ(8);
                } else {
                    if (LJJIJIL2) {
                        i2 = 12;
                    } else {
                        i2 = 2;
                    }
                    LJIIIZ = C1DF.LJIIIZ(i2);
                }
                if (c109544Rq != null && c109544Rq.getMsgType() == 4006) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.itemView;
                int paddingLeft2 = view2.getPaddingLeft();
                if (LJJIJIIJIL && !z3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2) {
                    LJIIIZ2 = C1DF.LJIIIZ(8);
                } else {
                    if (!z4) {
                        i4 = 2;
                    }
                    LJIIIZ2 = C1DF.LJIIIZ(i4);
                }
                view2.setPadding(paddingLeft2, LJIIIZ2, this.itemView.getPaddingRight(), LJIIIZ);
            }
        }
        if (msg.isSelf()) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            if (LJJIJIIJIL && !z) {
                z9 = true;
            }
            C4AH LIZ2 = C49W.LIZ(true, z9, C90193gN.LIZ());
            C48E c48e = new C48E(AnonymousClass636.LJIIIIZZ(R.attr.cr, context));
            Integer num = C49R.LIZ.LJIIIIZZ;
            if (num != null) {
                c4ka2 = new C1042347f(num.intValue());
            } else {
                c4ka2 = C1042447g.LJLIL;
            }
            c49v = new C49V(LIZ2, c4ka2, c48e);
        } else {
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            if (!LJJIJIIJIL || z) {
                z8 = false;
            }
            C4AH LIZ3 = C49W.LIZ(false, z8, C90193gN.LIZ());
            C48E c48e2 = new C48E(AnonymousClass636.LJIIIIZZ(R.attr.cr, context2));
            Integer num2 = C49R.LIZ.LJIIIIZZ;
            if (num2 != null) {
                c4ka = new C1042347f(num2.intValue());
            } else {
                c4ka = C1042447g.LJLIL;
            }
            c49v = new C49V(LIZ3, c4ka, c48e2);
        }
        if (!Y() && (findViewById = this.itemView.findViewById(R.id.bst)) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            C77413UZt.LJFF(gradientDrawable, c49v);
            findViewById.setBackground(gradientDrawable);
        }
        N(c49v, msg, c109544Rq, c109544Rq2);
    }
}
