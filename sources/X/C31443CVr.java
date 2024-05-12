package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorLevelChannel;
import com.bytedance.android.live.publicscreen.api.MsgViewShowingTabChannel;
import com.bytedance.android.live.publicscreen.api.NonGiftMessageChannel;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CVr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31443CVr extends LinearLayout {
    public final C31435CVj LJLIL;
    public C31450CVy LJLILLLLZI;
    public boolean LJLJI;
    public final C73318Sq2 LJLJJI;
    public int LJLJJL;
    public DataChannel LJLJJLL;
    public InterfaceC31286CPq LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C31429CVd LJLLL;
    public final C5H3 LJLLLL;
    public final C31436CVk LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public CWN LJZI;
    public final C31453CWb LJZL;
    public final java.util.Map<Integer, View> LL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final User getAnchor() {
        return (User) this.LJLLJ.getValue();
    }

    private final FrameLayout getFoldLayout() {
        return (FrameLayout) this.LJLZ.getValue();
    }

    private final FrameLayout getTitleLayout() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-titleLayout>(...)");
        return (FrameLayout) value;
    }

    public final void LJ() {
        Integer num;
        Boolean LIZJ = InterfaceC30442Bx8.B0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ.booleanValue()) {
            if (!this.LJLJLJ) {
                C31450CVy c31450CVy = (C31450CVy) findViewById(R.id.fww);
                this.LJLILLLLZI = c31450CVy;
                InterfaceC31286CPq interfaceC31286CPq = this.LJLJL;
                if (interfaceC31286CPq != null) {
                    if (c31450CVy != null) {
                        c31450CVy.setCollapsed(false);
                    }
                    C31450CVy c31450CVy2 = this.LJLILLLLZI;
                    if (c31450CVy2 != null) {
                        c31450CVy2.LIZIZ(interfaceC31286CPq, 0, this.LJLJJLL);
                    }
                }
                this.LJLJLJ = true;
            }
            DataChannel dataChannel = this.LJLJJLL;
            if (dataChannel != null && (num = (Integer) dataChannel.kv0(MsgViewShowingTabChannel.class)) != null && num.intValue() == 1) {
                LIZLLL();
            } else {
                LIZJ();
            }
            if (!LIZ(R.id.lrl).hasOnClickListeners()) {
                C16880lQ.LJJIIZ((C47121t6) LIZ(R.id.lrl), new ACListenerS25S0100000_5(this, 438));
            }
            if (!LIZ(R.id.lrm).hasOnClickListeners()) {
                C16880lQ.LJJIIZ((C47121t6) LIZ(R.id.lrm), new ACListenerS25S0100000_5(this, 439));
            }
            DataChannel dataChannel2 = this.LJLJJLL;
            if (dataChannel2 != null) {
                dataChannel2.mv0(NonGiftMessageChannel.class, this, new AqS171S0100000_5(this, 846));
            }
            DataChannel dataChannel3 = this.LJLJJLL;
            if (dataChannel3 != null) {
                dataChannel3.nv0(GameBackgroundColorLevelChannel.class, this, new AqS171S0100000_5(this, 847));
            }
        } else {
            C31450CVy c31450CVy3 = this.LJLILLLLZI;
            if (c31450CVy3 != null) {
                C87277YNd.LJJIIZI(c31450CVy3);
            }
            View layout_comment_all = LIZ(R.id.fhf);
            o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
            C87277YNd.LJJIJ(layout_comment_all);
            View red_dot = LIZ(R.id.isy);
            o.LJIIIIZZ(red_dot, "red_dot");
            C87277YNd.LJJIIZI(red_dot);
            View layout_msg_tab = LIZ(R.id.fjq);
            o.LJIIIIZZ(layout_msg_tab, "layout_msg_tab");
            C87277YNd.LJJIIZ(layout_msg_tab);
            setMsgViewTabState(-1);
        }
        LJIIIZ();
    }

    public final void LJFF() {
        View view;
        C31436CVk c31436CVk = this.LJLLLLLL;
        if (c31436CVk != null && (view = c31436CVk.itemView) != null) {
            view.animate().withLayer().translationY(-view.getHeight()).setDuration(50L).start();
        }
    }

    public final void LJIIIZ() {
        boolean z;
        Boolean LIZJ = InterfaceC30442Bx8.B0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ.booleanValue()) {
            View layout_msg_tab = LIZ(R.id.fjq);
            o.LJIIIIZZ(layout_msg_tab, "layout_msg_tab");
            C87277YNd.LJJIJ(layout_msg_tab);
        }
        if (this.LJLLL.LJ.size() == 0 && this.LJLLL.LJII == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View default_gift_message = LIZ(R.id.c5g);
            o.LJIIIIZZ(default_gift_message, "default_gift_message");
            C87277YNd.LJJIJ(default_gift_message);
            View container_view = LIZ(R.id.bss);
            o.LJIIIIZZ(container_view, "container_view");
            C87277YNd.LJJIIZI(container_view);
            return;
        }
        View default_gift_message2 = LIZ(R.id.c5g);
        o.LJIIIIZZ(default_gift_message2, "default_gift_message");
        C87277YNd.LJJIIZ(default_gift_message2);
        View container_view2 = LIZ(R.id.bss);
        o.LJIIIIZZ(container_view2, "container_view");
        C87277YNd.LJJIJ(container_view2);
    }

    public final String getAnchorId() {
        return (String) this.LJLLILLLL.getValue();
    }

    public final CW6 getGameFloatWindowLogHelper() {
        return (CW6) this.LJLL.getValue();
    }

    public final C31322CRa getMessageBehaviorProvider() {
        return (C31322CRa) this.LJLLLL.getValue();
    }

    public final long getRoomId() {
        return ((Number) this.LJLLI.getValue()).longValue();
    }

    public final void LIZIZ() {
        C31453CWb c31453CWb;
        if (C29306Beo.LJJIIJ(LIZ(R.id.fhf)) && (c31453CWb = this.LJZL) != null) {
            C31453CWb.LIZLLL(c31453CWb, EnumC31433CVh.NORMAL, 6);
        }
    }

    public final void LIZJ() {
        ((TextView) LIZ(R.id.lrl)).setSelected(true);
        ((TextView) LIZ(R.id.lrm)).setSelected(false);
        C31450CVy c31450CVy = this.LJLILLLLZI;
        if (c31450CVy != null) {
            C87277YNd.LJJIIZI(c31450CVy);
        }
        View layout_comment_all = LIZ(R.id.fhf);
        o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
        C87277YNd.LJJIJ(layout_comment_all);
        setMsgViewTabState(0);
        View LIZ = LIZ(R.id.isy);
        if (LIZ != null) {
            C87277YNd.LJJIIZI(LIZ);
        }
        LIZIZ();
    }

    public final void LIZLLL() {
        ((TextView) LIZ(R.id.lrm)).setSelected(true);
        ((TextView) LIZ(R.id.lrl)).setSelected(false);
        View layout_comment_all = LIZ(R.id.fhf);
        o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
        C87277YNd.LJJIIZI(layout_comment_all);
        C31450CVy c31450CVy = this.LJLILLLLZI;
        if (c31450CVy != null) {
            C87277YNd.LJJIJ(c31450CVy);
        }
        setMsgViewTabState(1);
    }

    public final CWN getFloatMsgViewCallback2() {
        return this.LJZI;
    }

    private final void setMsgViewTabState(int i) {
        if (i == this.LJLJJL) {
            return;
        }
        this.LJLJJL = i;
        DataChannel dataChannel = this.LJLJJLL;
        if (dataChannel != null) {
            dataChannel.rv0(MsgViewShowingTabChannel.class, Integer.valueOf(i));
        }
        C31450CVy c31450CVy = this.LJLILLLLZI;
        if (c31450CVy != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            c31450CVy.setIsActivitiesTab(z);
        }
    }

    public final void LJI(CQO<? extends CR6> cqo) {
        C31436CVk c31436CVk = this.LJLLLLLL;
        if (c31436CVk == null) {
            return;
        }
        C31429CVd c31429CVd = this.LJLLL;
        if (c31429CVd.LJII == null) {
            c31429CVd.LJII = cqo;
            View view = c31436CVk.itemView;
            if (view != null) {
                C87277YNd.LJJIJ(view);
            }
            FrameLayout foldLayout = getFoldLayout();
            o.LJIIIIZZ(foldLayout, "foldLayout");
            C87277YNd.LJJIJ(foldLayout);
            LJFF();
        } else {
            c31429CVd.LJII = cqo;
        }
        C31436CVk c31436CVk2 = this.LJLLLLLL;
        if (c31436CVk2 != null) {
            c31436CVk2.L(cqo);
        }
        LJIIIZ();
    }

    public final void LJII(float f) {
        FrameLayout titleLayout = getTitleLayout();
        titleLayout.setAlpha(f);
        if (f <= 0.0f) {
            C87277YNd.LJJIIZ(titleLayout);
        } else {
            C87277YNd.LJJIJ(titleLayout);
        }
    }

    public final void setFloatMsgViewCallback2(CWN cwn) {
        this.LJZI = cwn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31443CVr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C62850Ola.LJFF(context, "ctx");
        this.LJLJJI = new C73318Sq2();
        this.LJLJJL = -1;
        this.LJLJLLL = System.currentTimeMillis();
        this.LJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 409));
        this.LJLLI = C221108m2.LIZIZ(C28181B4f.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(C31445CVt.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(BGC.LJLIL);
        C31429CVd c31429CVd = new C31429CVd(new C31434CVi(this), new C31430CVe(this));
        this.LJLLL = c31429CVd;
        this.LJLLLL = C78996UzQ.LJJIJIIJI(CU9.LJLIL);
        this.LJLZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 428));
        this.LJZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 420));
        o.LJII(LinearLayout.inflate(getContext(), R.layout.dk1, this), "null cannot be cast to non-null type android.view.ViewGroup");
        setBackgroundResource(R.drawable.cdy);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C31435CVj c31435CVj = new C31435CVj(context2, c31429CVd.LJ);
        this.LJLIL = c31435CVj;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d7i, C16880lQ.LLZIL(getContext()), getFoldLayout());
        o.LJIIIIZZ(LLLZIIL, "from(context)\n          …mmon_message, foldLayout)");
        this.LJLLLLLL = new C31436CVk(LLLZIIL);
        FrameLayout foldLayout = getFoldLayout();
        o.LJIIIIZZ(foldLayout, "foldLayout");
        ViewGroup.LayoutParams layoutParams = foldLayout.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((C06F) layoutParams).LIZ;
        if (suctionBottomBehavior != null) {
            suctionBottomBehavior.LJ = true;
        }
        getContext();
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager();
        smoothLinearLayoutManager.LLIIIJ = 1.0f;
        smoothLinearLayoutManager.LLFZ = true;
        smoothLinearLayoutManager.LLIIIL = true;
        smoothLinearLayoutManager.LLJJIJIIJIL(true);
        C87009YCv c87009YCv = new C87009YCv(RunnableC31448CVw.LJLIL, RunnableC31449CVx.LJLIL);
        c87009YCv.LJI = false;
        c87009YCv.LJJ = new AqS155S0100000_5(this, 427);
        ((RecyclerView) LIZ(R.id.isn)).setItemAnimator(c87009YCv);
        ((RecyclerView) LIZ(R.id.isn)).setLayoutManager(smoothLinearLayoutManager);
        ((RecyclerView) LIZ(R.id.isn)).setAdapter(c31435CVj);
        C31255COl recycler_view = (C31255COl) LIZ(R.id.isn);
        o.LJIIIIZZ(recycler_view, "recycler_view");
        C47121t6 messages_hint_view = (C47121t6) LIZ(R.id.gia);
        o.LJIIIIZZ(messages_hint_view, "messages_hint_view");
        this.LJZL = new C31453CWb(recycler_view, messages_hint_view, this.LJLJJLL, true, new C31444CVs(this));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0 && getVisibility() == 0) {
            LIZIZ();
        }
    }

    public static int LJIIIIZZ(ArrayList arrayList, ChatMessage chatMessage, ChatMessage chatMessage2) {
        MESSAGE message;
        CQJ cqj = new CQJ(chatMessage2);
        CQQ cqq = null;
        int i = -1;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            CQO cqo = (CQO) ORZ.LJLLLLLL(size, arrayList);
            if (cqo != null && (message = cqo.LJIJJLI) != 0 && message.getMessageId() == chatMessage.getMessageId()) {
                cqq = cqo.LJLIIL();
                i = size;
            }
        }
        if (i != -1) {
            if (cqq != null) {
                cqj.LJIJJLI(cqq);
            }
            ListProtector.remove(arrayList, i);
            ListProtector.add(arrayList, i, cqj);
        }
        return i;
    }
}
