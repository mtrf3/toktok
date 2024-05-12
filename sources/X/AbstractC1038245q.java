package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0300000_1;
import Y.AObserverS65S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS7S0110000_1;
import Y.IDCListenerS294S0100000_1;
import Y.IDTListenerS111S0100000_1;
import Y.IDTListenerS87S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* renamed from: X.45q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1038245q extends AbstractC1029742j implements G27 {
    public final C99033ud LJLJLLL;
    public final LifecycleOwner LJLL;
    public final HashSet<String> LJLLI;
    public InterfaceC99713vj LJLLILLLL;
    public final View.OnClickListener LJLLJ;
    public C46Q LJLLL;
    public final IDCListenerS294S0100000_1 LJLLLL;
    public final IDTListenerS111S0100000_1 LJLLLLLL;
    public final C93183lC LJLZ;
    public final IMUser LJZ;
    public final C1038545t LJZI;
    public final C92183ja LJZL;
    public final C1038345r LL;
    public final MutableLiveData<C93063l0> LLD;
    public final MutableLiveData<Integer> LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public SuggestedReplyViewModel LLFII;

    public abstract void LLD(AbstractC1041546x abstractC1041546x, IMUser iMUser, C109544Rq c109544Rq, C109544Rq c109544Rq2);

    public final void onDestroy() {
        Iterator<AbstractC1041546x> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromWindow();
        }
        this.LJLJI.clear();
        C9XU.LIZLLL(this);
    }

    @Override // X.AbstractC1029742j
    /* renamed from: LJZI */
    public final void onViewAttachedToWindow(AbstractC1041546x holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.l0(this.LLFF, true);
    }

    public final void LLFF(boolean z) {
        this.LLFF = z;
        Iterator<AbstractC1041546x> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().l0(z, false);
        }
    }

    @Override // X.AbstractC1029742j, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJZL.LJIIJ = recyclerView;
    }

    @Override // X.AbstractC1029742j, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJZL.LJIIJ = null;
    }

    public static void LLF(AbstractC1038245q abstractC1038245q, AbstractC89473fD event) {
        List<C109544Rq> messageList;
        List<? extends C109544Rq> list;
        List<C109544Rq> LJ;
        InterfaceC99713vj interfaceC99713vj = abstractC1038245q.LJLLILLLL;
        if (interfaceC99713vj == null || (messageList = interfaceC99713vj.LJ()) == null) {
            messageList = C61878OQg.INSTANCE;
        }
        abstractC1038245q.getClass();
        o.LJIIIZ(event, "event");
        o.LJIIIZ(messageList, "messageList");
        if (C93793mB.LJIIL((C109544Rq) ORZ.LJLLLL(messageList))) {
            if ((event instanceof C89463fC) && abstractC1038245q.LJZL.LIZIZ()) {
                abstractC1038245q.LLFFF = true;
            }
            if (abstractC1038245q.LJZL.LIZIZ() && !(event instanceof C91563ia)) {
                return;
            }
            Iterator<InterfaceC1029942l> it = abstractC1038245q.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().Ah(event);
            }
            InterfaceC99713vj interfaceC99713vj2 = abstractC1038245q.LJLLILLLL;
            if (interfaceC99713vj2 != null && (LJ = interfaceC99713vj2.LJ()) != null) {
                list = C109434Rf.LJIILLIIL(LJ);
            } else {
                list = C61878OQg.INSTANCE;
            }
            abstractC1038245q.LL(list, true, null);
            return;
        }
        List<? extends C109544Rq> LJIILLIIL = C109434Rf.LJIILLIIL(messageList);
        if (abstractC1038245q.LJLJLLL.isReportPage() && (event instanceof C91613if)) {
            List<C109544Rq> selectMsgList = abstractC1038245q.LJLJLLL.getSelectMsgList();
            if (selectMsgList == null || !(!selectMsgList.isEmpty())) {
                selectMsgList = C109434Rf.LJI(abstractC1038245q.LJLJLLL.getDefaultMsgSelectedNum(), LJIILLIIL);
            }
            abstractC1038245q.LJZL(ORZ.LLJJ(selectMsgList));
        }
        if ((event instanceof C89463fC) && abstractC1038245q.LJZL.LIZIZ()) {
            abstractC1038245q.LLFFF = true;
        } else {
            abstractC1038245q.LL(LJIILLIIL, true ^ (event instanceof C91613if), new ARunnableS7S0110000_1(abstractC1038245q, C1029542h.LIZ(event, LJIILLIIL, abstractC1038245q.LJZL.LIZIZ(), new C1029842k(abstractC1038245q), new C1030042m(abstractC1038245q)), 5));
        }
        if (!(event instanceof C91613if)) {
            return;
        }
        C109544Rq LJIIIIZZ = C109434Rf.LJIIIIZZ(abstractC1038245q.LJLJLLL, LJIILLIIL);
        if (LJIIIIZZ != null) {
            abstractC1038245q.LLD.postValue(new C93063l0(LJIIIIZZ, EnumC93173lB.PUSH_NOTIFICATION));
        }
        C54502LaE.LIZLLL("im_chat_room", null, 6);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C109544Rq c109544Rq;
        C109544Rq c109544Rq2;
        boolean z;
        boolean z2;
        C99033ud c99033ud;
        View view;
        ConstraintLayout constraintLayout;
        View view2;
        BaseContent LIZJ;
        final AbstractC1041546x holder = (AbstractC1041546x) viewHolder;
        o.LJIIIZ(holder, "holder");
        C110134Tx c110134Tx = EnumC110124Tw.Companion;
        int itemViewType = holder.getItemViewType();
        c110134Tx.getClass();
        final EnumC110124Tw LJ = C110134Tx.LJ(itemViewType);
        C3UX c3ux = new C3UX(LJ) { // from class: X.3Ug
            public final EnumC110124Tw LJ;

            public final int hashCode() {
                return Objects.hash(this.LJ);
            }

            @Override // X.C3UX
            public final String toString() {
                return C78966Uyw.LJJJLL("ViewHolderBindingTracker:%s", this.LJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("chatroom_viewholder_onbind_time", LJ.name(), 0.001f, C3US.TEA);
                o.LJIIIZ(LJ, "viewType");
                this.LJ = LJ;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C84743Ug)) {
                    return false;
                }
                return C78966Uyw.LJIIIZ(new Object[]{((C84743Ug) obj).LJ}, new Object[]{this.LJ});
            }
        };
        boolean z3 = true;
        C84683Ua.LJFF.LIZIZ(c3ux, true);
        IMMessage iMMessage = (IMMessage) ListProtector.get(getCurrentList(), i);
        C109544Rq msg = iMMessage.getMessage();
        if (i < getItemCount() - 1) {
            c109544Rq = LJLZ(i + 1);
        } else {
            c109544Rq = null;
        }
        if (i > 0) {
            c109544Rq2 = LJLZ(i - 1);
        } else {
            c109544Rq2 = null;
        }
        LLD(holder, this.LJZ, msg, c109544Rq);
        holder.P(msg, c109544Rq, c109544Rq2, i);
        C1038545t state = this.LJZI;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(msg, "msg");
        if (msg.getMsgType() == 5 && (LIZJ = C110134Tx.LIZJ(msg)) != null && LIZJ.type == 505) {
            z = true;
        } else {
            z = false;
        }
        NaviStatusCode naviStatusCode = C4FF.LJLJJI.LIZ;
        if (naviStatusCode == null || C46E.LIZ[naviStatusCode.ordinal()] != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!state.LIZ && !msg.isSelf() && z && z2) {
            msg.addLocalExt("show_navi_tip", "");
            state.LIZ = true;
        }
        String conversationId = msg.getConversationId();
        if (conversationId != null && holder.LJLLLL == null) {
            C84283Sm.LIZ.getClass();
            if (!C84283Sm.LJI(conversationId)) {
                GestureDetector gestureDetector = new GestureDetector(holder.itemView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.471
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onDoubleTapEvent(MotionEvent e) {
                        o.LJIIIZ(e, "e");
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onDoubleTap(MotionEvent e) {
                        InterfaceC1039746f interfaceC1039746f;
                        C109544Rq c109544Rq3;
                        BaseTemplate LJIILL;
                        BaseResponseComponent LLILLJJLI;
                        o.LJIIIZ(e, "e");
                        C34B.LIZIZ("IMBaseViewHolder", "onDoubleTap called");
                        C109544Rq c109544Rq4 = AbstractC1041546x.this.LJZI;
                        if ((c109544Rq4 == null || !C69648RVc.LIZIZ(c109544Rq4) || ((c109544Rq3 = AbstractC1041546x.this.LJZI) != null && (LJIILL = C1DJ.LJIILL(c109544Rq3)) != null && (LLILLJJLI = LJIILL.LLILLJJLI()) != null && C69648RVc.LIZ(LLILLJJLI, C47X.DIGG))) && (interfaceC1039746f = AbstractC1041546x.this.LLFFF) != null) {
                            interfaceC1039746f.LIZ("double_click", true);
                        }
                        return true;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onSingleTapConfirmed(MotionEvent e) {
                        o.LJIIIZ(e, "e");
                        C34B.LJI("IMBaseViewHolder", "onSingleTapConfirmed called");
                        int rawX = (int) e.getRawX();
                        int rawY = (int) e.getRawY();
                        AbstractC1041546x abstractC1041546x = AbstractC1041546x.this;
                        AnonymousClass470 anonymousClass470 = abstractC1041546x.LJLJJI;
                        if (anonymousClass470 != null) {
                            View view3 = anonymousClass470.LIZ;
                            view3.getLocationOnScreen(abstractC1041546x.LLIIII);
                            int[] iArr = abstractC1041546x.LLIIII;
                            int i2 = iArr[0];
                            int i3 = iArr[1];
                            int width = view3.getWidth();
                            int height = view3.getHeight();
                            if (rawX >= i2 && rawX <= i2 + width && rawY >= i3 && rawY <= i3 + height) {
                                View.OnClickListener onClickListener = anonymousClass470.LIZIZ;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("onSingleTapConfirmed called:");
                                LIZ.append(onClickListener);
                                C34B.LJI("IMBaseViewHolder", X1D.LIZIZ(LIZ));
                                if (onClickListener != null) {
                                    onClickListener.onClick(anonymousClass470.LIZ);
                                }
                            }
                        }
                        return super.onSingleTapConfirmed(e);
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent e) {
                        o.LJIIIZ(e, "e");
                        C34B.LIZIZ("IMBaseViewHolder", "onSingleTapUp called");
                        return super.onSingleTapUp(e);
                    }
                });
                holder.LJLLLL = gestureDetector;
                AnonymousClass470 anonymousClass470 = holder.LJLJJI;
                if (anonymousClass470 != null) {
                    IDTListenerS111S0100000_1 iDTListenerS111S0100000_1 = new IDTListenerS111S0100000_1(holder, 4);
                    ArrayList arrayList = (ArrayList) anonymousClass470.LIZJ;
                    if (!arrayList.contains(iDTListenerS111S0100000_1)) {
                        arrayList.add(iDTListenerS111S0100000_1);
                    }
                    anonymousClass470.LIZ.setOnTouchListener(new IDTListenerS87S0200000_1(gestureDetector, anonymousClass470, 0));
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("confirmClickListener fail with type:");
                    LIZ.append(holder.LJLIL);
                    C34B.LJI("IMBaseViewHolder", X1D.LIZIZ(LIZ));
                }
            }
        }
        boolean isLastReceivedMsg = iMMessage.getState().isLastReceivedMsg();
        int i2 = 8;
        if (C4LS.LIZIZ() && (msg.getMsgType() == 5 || msg.getMsgType() == 1805)) {
            holder.LLFFF = null;
            View findViewById = holder.itemView.findViewById(R.id.g2w);
            o.LJIIIIZZ(findViewById, "itemView.findViewById<Vi…oup>(R.id.ll_dm_reaction)");
            findViewById.setVisibility(8);
        } else {
            if (holder.LLFFF == null && (c99033ud = holder.LJLLL) != null) {
                holder.c0(c99033ud);
            }
            InterfaceC1039746f interfaceC1039746f = holder.LLFFF;
            if (interfaceC1039746f != null) {
                interfaceC1039746f.LIZIZ(msg, isLastReceivedMsg, holder.LJLILLLLZI);
                if (msg.getPropertyItemListMap() != null && holder.LJLILLLLZI.length() > 0) {
                    holder.LJLILLLLZI = "";
                }
            }
        }
        boolean isReportPage = this.LJLJLLL.isReportPage();
        boolean isMsgSelected = iMMessage.getState().isMsgSelected();
        C5H3 LJJIJL = C17N.LJJIJL(new AqS151S0100000_1(holder, 804));
        if (!isReportPage || holder.LJLJL == null) {
            if (!C1044648c.LIZ() && (view = (View) LJJIJL.getValue()) != null) {
                view.setVisibility(8);
            }
            AnonymousClass472<C71897SJp> anonymousClass472 = holder.LJLJL;
            if (anonymousClass472 != null) {
                anonymousClass472.LIZIZ();
            }
        } else {
            C5H3 LJJIJL2 = C17N.LJJIJL(new AqS151S0100000_1(holder, 808));
            View view3 = holder.LJLJLJ;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = holder.LJLJLJ;
            if (view4 != null) {
                C16880lQ.LJIIJ(new ACListenerS27S0300000_1(holder, msg, LJJIJL2, 6), view4);
            }
            if (C1044648c.LIZ()) {
                if (!AbstractC1041546x.f0(msg) || !C98793uF.LIZIZ(msg)) {
                    z3 = false;
                }
            } else {
                z3 = AbstractC1041546x.f0(msg);
            }
            if (!C1044648c.LIZ() && (view2 = (View) LJJIJL.getValue()) != null) {
                if (z3) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
            }
            if (z3) {
                View view5 = (View) LJJIJL2.getValue();
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                C71897SJp c71897SJp = (C71897SJp) LJJIJL2.getValue();
                if (c71897SJp != null) {
                    c71897SJp.setChecked(isMsgSelected);
                }
                if (C1044648c.LIZ() && holder.LJLIL.getMessagePositionType() == C47R.START && holder.LJLIL.getContentLayoutId() != null && (constraintLayout = (ConstraintLayout) holder.itemView.findViewById(R.id.k29)) != null) {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    anonymousClass064.LJII(constraintLayout);
                    anonymousClass064.LJIIIIZZ(R.id.acf, 6, R.id.b7o, 7);
                    anonymousClass064.LIZIZ(constraintLayout);
                }
            } else {
                holder.LJLJL.LIZIZ();
            }
        }
        holder.LJLJJL = i;
        if (!this.LJLLI.contains(msg.getUuid())) {
            this.LJLLI.add(msg.getUuid());
            holder.h0(msg);
        }
        Iterator<InterfaceC1029942l> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().s50(holder, msg);
        }
        C84683Ua.LJFF.LIZ(c3ux, C46B.LIZLLL);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        PopupWindow popupWindow;
        o.LJIIIZ(newConfig, "newConfig");
        if (this.LJZL.LIZIZ() && (popupWindow = this.LJZL.LJII) != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View view;
        AbstractC1041546x viewHolder;
        Queue<View> queue;
        boolean z;
        int i2;
        o.LJIIIZ(parent, "parent");
        EnumC110124Tw.Companion.getClass();
        final EnumC110124Tw LJ = C110134Tx.LJ(i);
        C3UX c3ux = new C3UX(LJ) { // from class: X.3Y5
            public final EnumC110124Tw LJ;
            public final String LJFF;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3Y5) && this.LJ == ((C3Y5) obj).LJ;
            }

            public final int hashCode() {
                return this.LJ.hashCode();
            }

            @Override // X.C3UX
            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(super.toString());
                LIZ.append(this.LJFF);
                return X1D.LIZIZ(LIZ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("chatroom_viewholder_inflate_time", LJ.name(), 0.0f, C3US.TEA, 4);
                o.LJIIIZ(LJ, "viewType");
                this.LJ = LJ;
                this.LJFF = AnonymousClass629.LIZ("randomUUID().toString()");
            }
        };
        C84683Ua c84683Ua = C84683Ua.LJFF;
        boolean z2 = true;
        c84683Ua.LIZIZ(c3ux, true);
        C1038345r c1038345r = this.LL;
        Integer contentLayoutId = LJ.getContentLayoutId();
        c1038345r.getClass();
        boolean z3 = false;
        if (C1044648c.LIZ() && contentLayoutId != null) {
            C1038445s c1038445s = c1038345r.LIZLLL;
            int intValue = contentLayoutId.intValue();
            c1038445s.getClass();
            C47R messagePositionType = LJ.getMessagePositionType();
            C47R c47r = C47R.START;
            if (messagePositionType == c47r) {
                queue = c1038445s.LIZJ;
            } else {
                queue = c1038445s.LIZLLL;
            }
            view = queue.poll();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Is from cache = ");
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C34B.LJI("SkeletonLayoutInflater", X1D.LIZIZ(LIZ));
            if (view == null) {
                AnonymousClass469 anonymousClass469 = c1038445s.LIZIZ.LIZIZ;
                if (LJ.getMessagePositionType() == c47r) {
                    c1038445s.LIZ.LIZ();
                    i2 = R.layout.b4_;
                } else {
                    c1038445s.LIZ.LIZIZ();
                    i2 = R.layout.b4c;
                }
                view = (View) anonymousClass469.invoke(Integer.valueOf(i2), parent, Boolean.FALSE);
            }
            View contentParent = view.findViewById(R.id.bst);
            AnonymousClass469 anonymousClass4692 = c1038445s.LIZIZ.LIZIZ;
            Integer valueOf = Integer.valueOf(intValue);
            o.LJIIIIZZ(contentParent, "contentParent");
            anonymousClass4692.invoke(valueOf, (ViewGroup) contentParent, Boolean.TRUE);
        } else {
            C68410Qt4 c68410Qt4 = c1038345r.LJ;
            c68410Qt4.getClass();
            view = (View) ((AnonymousClass468) c68410Qt4.LJLIL).LIZIZ.invoke(Integer.valueOf(LJ.getItemLayoutId()), parent, Boolean.FALSE);
        }
        if (c1038345r.LIZ.isReportPage()) {
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(c1038345r.LIZIZ);
            frameLayout.setLayoutParams(layoutParams);
            if (C1044648c.LIZ() && LJ.getMessagePositionType() == C47R.START) {
                C26338AVi.LJI(view, AnonymousClass391.LIZJ(16), null, null, null, false, 30);
            }
            frameLayout.addView(view);
            View view2 = (View) c1038345r.LIZJ.LIZIZ.invoke(Integer.valueOf(R.layout.b3r), parent, Boolean.FALSE);
            view2.setImportantForAccessibility(4);
            frameLayout.addView(view2);
            new C33921Uu(Boolean.class).LJ(frameLayout, Boolean.TRUE);
            C16300kU.LJIJ(view, 4);
            h0.LJIJI(frameLayout, new IDaS88S0000000_1(11));
            viewHolder = LJ.getViewHolder(frameLayout);
        } else {
            viewHolder = LJ.getViewHolder(view);
        }
        c84683Ua.LIZ(c3ux, C46B.LIZLLL);
        Iterator<InterfaceC1029942l> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().rD(viewHolder);
        }
        new Object() { // from class: X.46F
        }.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_im_report_recycle_view", false) || !this.LJLJLLL.isReportPage()) {
            z3 = true;
        }
        viewHolder.setIsRecyclable(z3);
        C99033ud sessionInfo = this.LJLJLLL;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        viewHolder.LJLLL = sessionInfo;
        viewHolder.c0(sessionInfo);
        viewHolder.LLII = this.LJLLL;
        viewHolder.i0(this.LJLLLL);
        IDTListenerS111S0100000_1 iDTListenerS111S0100000_1 = this.LJLLLLLL;
        C119624mk c119624mk = viewHolder.LJLJJLL;
        if (c119624mk != null) {
            c119624mk.setOnTouchListener(iDTListenerS111S0100000_1);
        }
        AnonymousClass470 anonymousClass470 = viewHolder.LJLJJI;
        if (anonymousClass470 != null && iDTListenerS111S0100000_1 != null) {
            ArrayList arrayList = (ArrayList) anonymousClass470.LIZJ;
            if (!arrayList.contains(iDTListenerS111S0100000_1)) {
                arrayList.add(iDTListenerS111S0100000_1);
            }
        }
        viewHolder.setOnClickListener(this.LJLLJ);
        viewHolder.LLFII.LJIIJJI = this.LJLZ;
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view3 = viewHolder.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z2 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                    stringBuffer.append(" holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.3lC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.46S] */
    public AbstractC1038245q(final C99033ud sessionInfo, LifecycleOwner owner, Context context) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(owner, "owner");
        this.LJLJLLL = sessionInfo;
        this.LJLL = owner;
        this.LJLLI = new HashSet<>();
        C1038545t c1038545t = new C1038545t(0);
        this.LJZI = c1038545t;
        this.LL = new C1038345r(context, sessionInfo);
        MutableLiveData<C93063l0> mutableLiveData = new MutableLiveData<>();
        this.LLD = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LLF = mutableLiveData2;
        this.LLFF = true;
        IMUser fromUser = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        this.LJZ = fromUser;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 1023);
        NaviCreationSignal.SingleLiveData signal = NaviCreationSignal.LIZ;
        o.LJIIIZ(signal, "signal");
        signal.observe(owner, new AObserverS65S0200000_1(aqS151S0100000_1, c1038545t, 1));
        this.LJLLJ = new ACListenerS21S0100000_1(new AnonymousClass463(sessionInfo, mutableLiveData, owner, new InterfaceC1042747j() { // from class: X.46S
            @Override // X.InterfaceC1042747j
            public final void LIZ(C109544Rq c109544Rq) {
                SuggestedReplyViewModel suggestedReplyViewModel;
                List<C109544Rq> list;
                if (c109544Rq == null || !SuggestedReplyExperiment.LIZJ()) {
                    return;
                }
                AbstractC1038245q abstractC1038245q = AbstractC1038245q.this;
                SuggestedReplyViewModel suggestedReplyViewModel2 = abstractC1038245q.LLFII;
                if (suggestedReplyViewModel2 != null) {
                    InterfaceC99713vj interfaceC99713vj = abstractC1038245q.LJLLILLLL;
                    if (interfaceC99713vj != null) {
                        list = interfaceC99713vj.LJ();
                    } else {
                        list = null;
                    }
                    if (SuggestedReplyExperiment.LIZJ() && !c109544Rq.isSelf() && ((c109544Rq.getMsgType() == 8 || c109544Rq.getMsgType() == 1809) && list != null && !list.isEmpty())) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (C109544Rq c109544Rq2 : list) {
                            if (c109544Rq2.getMsgId() != c109544Rq.getMsgId() && c109544Rq2.getLocalExt().containsKey("SUGGESTED_REPLIES")) {
                                suggestedReplyViewModel2.LJLIL.LIZ(c109544Rq2);
                                linkedHashSet.add(Long.valueOf(c109544Rq2.getMsgId()));
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Number) it.next()).longValue();
                            C46T c46t = suggestedReplyViewModel2.LJLJLJ.get(Long.valueOf(longValue));
                            if (c46t != null) {
                                C46W.LIZJ(C98583tu.LIZJ(suggestedReplyViewModel2.LJLJJI), c46t.getMsg(), "under_video", "click_other_video", suggestedReplyViewModel2.iv0(c46t.getMsg()), c46t.getDisplayStyle());
                                suggestedReplyViewModel2.LJLJLJ.remove(Long.valueOf(longValue));
                            }
                        }
                        suggestedReplyViewModel2.sv0();
                    }
                }
                SuggestedReplyViewModel suggestedReplyViewModel3 = AbstractC1038245q.this.LLFII;
                if (suggestedReplyViewModel3 == null || !SuggestedReplyViewModel.hv0(suggestedReplyViewModel3, c109544Rq) || (suggestedReplyViewModel = AbstractC1038245q.this.LLFII) == null) {
                    return;
                }
                suggestedReplyViewModel.qv0(c109544Rq);
            }

            @Override // X.InterfaceC1042747j
            public final ARunnableS37S0100000_1 LIZIZ(C109544Rq message) {
                o.LJIIIZ(message, "message");
                return new ARunnableS37S0100000_1(message, 156);
            }

            @Override // X.InterfaceC1042747j
            public final void LIZJ(View v, String str, C109544Rq c109544Rq, C99033ud sessionInfo2, String str2, boolean z) {
                List LJJIJ;
                List<C109544Rq> list;
                o.LJIIIZ(v, "v");
                o.LJIIIZ(sessionInfo2, "sessionInfo");
                if (z) {
                    InterfaceC99713vj interfaceC99713vj = AbstractC1038245q.this.LJLLILLLL;
                    if (interfaceC99713vj == null || (list = interfaceC99713vj.LJ()) == null) {
                        list = C61878OQg.INSTANCE;
                    }
                    C98913uR.LIZLLL(v, list, str, c109544Rq, sessionInfo2, str2, true);
                    return;
                }
                if (c109544Rq == null) {
                    LJJIJ = C61878OQg.INSTANCE;
                } else {
                    LJJIJ = C47261Igj.LJJIJ(c109544Rq);
                }
                C98913uR.LIZLLL(v, LJJIJ, str, c109544Rq, sessionInfo2, str2, false);
            }
        }, new C1049449y(null)), 263);
        C95003o8 c95003o8 = new C95003o8();
        C92183ja c92183ja = new C92183ja(sessionInfo, fromUser, mutableLiveData, mutableLiveData2, new AqS151S0100000_1(this, 1024), c95003o8, new C92203jc(this));
        this.LJZL = c92183ja;
        this.LJLLLL = new IDCListenerS294S0100000_1(c92183ja, 5);
        this.LJLLLLLL = new IDTListenerS111S0100000_1(c95003o8, 9);
        this.LJLLL = sessionInfo.isReportPage() ? new C46Q() { // from class: X.3uZ
            @Override // X.C46Q
            public final void LIZ(int i, boolean z) {
                if (i >= AbstractC1038245q.this.getItemCount() || i < 0) {
                    return;
                }
                C109544Rq LJLZ = AbstractC1038245q.this.LJLZ(i);
                java.util.Set<C109544Rq> value = AbstractC1038245q.this.LJLILLLLZI.getValue();
                if (value == null) {
                    value = new LinkedHashSet();
                }
                java.util.Set LLJILLL = ORZ.LLJILLL(value);
                boolean contains = LLJILLL.contains(LJLZ);
                if (z) {
                    if (contains) {
                        return;
                    }
                    LLJILLL.add(LJLZ);
                    AbstractC1038245q.this.LJZL(LLJILLL);
                    AbstractC1038245q abstractC1038245q = AbstractC1038245q.this;
                    List currentList = abstractC1038245q.getCurrentList();
                    o.LJIIIIZZ(currentList, "currentList");
                    ArrayList arrayList = new ArrayList(C32I.LJJL(currentList, 10));
                    Iterator it = currentList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((IMMessage) it.next()).getMessage());
                    }
                    abstractC1038245q.LL(arrayList, true, null);
                    return;
                }
                if (!contains) {
                    return;
                }
                LLJILLL.remove(LJLZ);
                AbstractC1038245q.this.LJZL(LLJILLL);
                AbstractC1038245q abstractC1038245q2 = AbstractC1038245q.this;
                List currentList2 = abstractC1038245q2.getCurrentList();
                o.LJIIIIZZ(currentList2, "currentList");
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(currentList2, 10));
                Iterator it2 = currentList2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((IMMessage) it2.next()).getMessage());
                }
                abstractC1038245q2.LL(arrayList2, true, null);
            }
        } : null;
        this.LJLZ = new InterfaceC93803mC() { // from class: X.3lC
            @Override // X.InterfaceC93803mC
            public final void LIZ(C109544Rq c109544Rq) {
                AbstractC1038245q.this.LLD.setValue(new C93063l0(c109544Rq, EnumC93173lB.SWIPE_TO_REPLY));
            }
        };
        if (C114394eJ.LIZ()) {
            LJLLLLLL(new InterfaceC1029942l(sessionInfo) { // from class: X.3WK
                public final C99033ud LJLIL;
                public final java.util.Set<String> LJLILLLLZI;

                @Override // X.InterfaceC1029942l
                public final void Hp() {
                }

                @Override // X.InterfaceC1029942l
                public final void Og() {
                }

                {
                    o.LJIIIZ(sessionInfo, "sessionInfo");
                    this.LJLIL = sessionInfo;
                    this.LJLILLLLZI = new LinkedHashSet();
                }

                @Override // X.InterfaceC1029942l
                public final void Ah(AbstractC89473fD event) {
                    o.LJIIIZ(event, "event");
                }

                @Override // X.InterfaceC1029942l
                public final void IP(AbstractC1041546x viewHolder) {
                    o.LJIIIZ(viewHolder, "viewHolder");
                }

                @Override // X.InterfaceC1029942l
                public final void QG(AbstractC1041546x viewHolder) {
                    o.LJIIIZ(viewHolder, "viewHolder");
                }

                @Override // X.InterfaceC1029942l
                public final void Vj(List<? extends C109544Rq> list) {
                    o.LJIIIZ(list, "list");
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

                @Override // X.InterfaceC1029942l
                public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
                    String str;
                    o.LJIIIZ(holder, "holder");
                    if (C93793mB.LJIIZILJ(c109544Rq) && !this.LJLILLLLZI.contains(c109544Rq.getUuid())) {
                        java.util.Set<String> set = this.LJLILLLLZI;
                        String uuid = c109544Rq.getUuid();
                        o.LJIIIIZZ(uuid, "message.uuid");
                        set.add(uuid);
                        C99033ud sessionInfo2 = this.LJLIL;
                        C85323Wm onEventV3 = C772831o.LIZ();
                        o.LJIIIZ(sessionInfo2, "sessionInfo");
                        o.LJIIIZ(onEventV3, "onEventV3");
                        int chatType = sessionInfo2.getChatType();
                        if (chatType != 0) {
                            if (chatType != 1) {
                                if (chatType != 3) {
                                    str = "unknown";
                                } else {
                                    str = "group";
                                }
                            } else {
                                str = "stranger";
                            }
                        } else {
                            str = "private";
                        }
                        C1HQ LIZJ = HXX.LIZJ("enter_from", "chat", "chat_type", str);
                        LIZJ.put("conversation_id", sessionInfo2.getConversationId());
                        LIZJ.put("message_type", C106674Gp.LJFF(c109544Rq, null));
                        LIZJ.put("sender_id", String.valueOf(c109544Rq.getSender()));
                        onEventV3.LIZIZ("show_dm_moderation_cell", LIZJ);
                    }
                }
            });
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C9XU.LIZIZ(LJIJJ, this);
        }
        submitList(C61878OQg.INSTANCE);
    }
}
