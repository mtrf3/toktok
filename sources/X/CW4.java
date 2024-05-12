package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.AfS0S0100400_5;
import Y.AfS17S0001000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.MsgViewShowingTabChannel;
import com.bytedance.android.live.publicscreen.api.NonGiftMessageChannel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.live.publicscreen.impl.api.HighLightApi;
import com.bytedance.android.live.publicscreen.impl.game.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.game.HighLightCutConfigSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CW4 extends CUC {
    public static final C73849Syb<Integer> LLFZ = new C73849Syb<>();
    public static final C73849Syb<String> LLI = new C73849Syb<>();
    public final Context LJLJI;
    public final InterfaceC31286CPq LJLJJI;
    public final CWK LJLJJL;
    public final DataChannel LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public final C31435CVj LJLJLLL;
    public final C73318Sq2 LJLL;
    public final C62822Ol8 LJLLI;
    public final CW7 LJLLILLLL;
    public long LJLLJ;
    public final AtomicInteger LJLLL;
    public C31450CVy LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public long LJZ;
    public long LJZI;
    public int LJZL;
    public int LL;
    public long LLD;
    public CreateHighLightResult LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final java.util.Map<Integer, View> LLFII;

    @Override // X.CUC
    public final void LJIIL() {
    }

    public final View LJIIZILJ(int i) {
        java.util.Map<Integer, View> map = this.LLFII;
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

    @Override // X.CUC
    public void setTipsView(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.CUC
    public final void LJIIIIZZ() {
        String str;
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("LiveGameMsgView", "click save to draft.");
        }
        CreateHighLightResult createHighLightResult = this.LLF;
        if (createHighLightResult == null || (str = createHighLightResult.fragmentIdStr) == null) {
            str = "";
        }
        C46104I7o.LJJIZ(this.LLD, str);
        ((IGameService) CN1.LIZ(IGameService.class)).Wg(str);
    }

    @Override // X.CUC
    public final void LJIIIZ() {
        InterfaceC31286CPq interfaceC31286CPq;
        C0NB.LJIIIZ("LiveGameMsgView", "onDestroy()");
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            DataChannel dataChannel = this.LJLJJLL;
            dataChannel.getClass();
            dataChannel.jv0(this);
        }
        this.LJLL.dispose();
        C31450CVy c31450CVy = this.LJLLLL;
        if (c31450CVy != null && (interfaceC31286CPq = c31450CVy.LJLJJI) != null) {
            interfaceC31286CPq.LIZJ(c31450CVy.LJLLILLLL);
        }
    }

    @Override // X.CUC
    public final void LJIILIIL() {
        Boolean LIZJ = InterfaceC30442Bx8.B0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ.booleanValue()) {
            if (!this.LLFF) {
                C31450CVy c31450CVy = (C31450CVy) findViewById(R.id.fww);
                this.LJLLLL = c31450CVy;
                InterfaceC31286CPq interfaceC31286CPq = this.LJLJJI;
                if (interfaceC31286CPq != null && c31450CVy != null) {
                    c31450CVy.LIZIZ(interfaceC31286CPq, C87277YNd.LJIIJJI(154), null);
                }
                this.LLFF = true;
            }
            Integer num = (Integer) this.LJLJJLL.kv0(MsgViewShowingTabChannel.class);
            if (num != null && num.intValue() == 1) {
                LJIL();
            } else {
                LJIJJLI();
            }
            if (!LJIIZILJ(R.id.lrl).hasOnClickListeners()) {
                C16880lQ.LJJIIZ((C47121t6) LJIIZILJ(R.id.lrl), new ACListenerS25S0100000_5(this, 436));
            }
            if (!LJIIZILJ(R.id.lrm).hasOnClickListeners()) {
                C16880lQ.LJJIIZ((C47121t6) LJIIZILJ(R.id.lrm), new ACListenerS25S0100000_5(this, 437));
            }
            this.LJLJJLL.mv0(NonGiftMessageChannel.class, this, new AqS171S0100000_5(this, 845));
            this.LJZ = System.currentTimeMillis();
        } else {
            C31450CVy c31450CVy2 = this.LJLLLL;
            if (c31450CVy2 != null) {
                C87277YNd.LJJIIZI(c31450CVy2);
            }
            View layout_comment_all = LJIIZILJ(R.id.fhf);
            o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
            C87277YNd.LJJIJ(layout_comment_all);
            View red_dot = LJIIZILJ(R.id.isy);
            o.LJIIIIZZ(red_dot, "red_dot");
            C87277YNd.LJJIIZI(red_dot);
            View view_float_window_line = LJIIZILJ(R.id.na9);
            o.LJIIIIZZ(view_float_window_line, "view_float_window_line");
            C87277YNd.LJJIJ(view_float_window_line);
            View layout_msg_tab = LJIIZILJ(R.id.fjq);
            o.LJIIIIZZ(layout_msg_tab, "layout_msg_tab");
            C87277YNd.LJJIIZ(layout_msg_tab);
            setMsgViewTabState(-1);
        }
        LJJII();
        LJJI(true);
    }

    public final void LJJII() {
        boolean collapsed;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.B0;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ.booleanValue()) {
            View layout_msg_tab = LJIIZILJ(R.id.fjq);
            o.LJIIIIZZ(layout_msg_tab, "layout_msg_tab");
            C87277YNd.LJJIJ(layout_msg_tab);
            View view_float_window_line = LJIIZILJ(R.id.na9);
            o.LJIIIIZZ(view_float_window_line, "view_float_window_line");
            C87277YNd.LJJIIZ(view_float_window_line);
        }
        Boolean LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ2.booleanValue()) {
            collapsed = true;
            if (!getCollapsed() && this.LJLLILLLL.LIZIZ.size() > 1) {
                collapsed = false;
            }
        } else {
            collapsed = getCollapsed();
        }
        if (collapsed) {
            View container_view = LJIIZILJ(R.id.bss);
            o.LJIIIIZZ(container_view, "container_view");
            C87277YNd.LJJIIZ(container_view);
            CRD crd = this.LJLLILLLL.LIZJ;
            if (crd != null) {
                if (crd instanceof CQJ) {
                    CQK cqk = (CQK) crd;
                    View default_gift_message = LJIIZILJ(R.id.c5g);
                    o.LJIIIIZZ(default_gift_message, "default_gift_message");
                    C87277YNd.LJJIIZ(default_gift_message);
                    View default_chat_message = LJIIZILJ(R.id.c56);
                    o.LJIIIIZZ(default_chat_message, "default_chat_message");
                    C87277YNd.LJJIJ(default_chat_message);
                    ((TextView) LJIIZILJ(R.id.mzt)).setText(cqk.LLFII());
                    ((TextView) LJIIZILJ(R.id.b9x)).setText(cqk.getContent());
                    return;
                }
                LJJ(crd);
                return;
            }
            return;
        }
        View container_view2 = LJIIZILJ(R.id.bss);
        o.LJIIIIZZ(container_view2, "container_view");
        C87277YNd.LJJIJ(container_view2);
        View default_gift_message2 = LJIIZILJ(R.id.c5g);
        o.LJIIIIZZ(default_gift_message2, "default_gift_message");
        C87277YNd.LJJIIZ(default_gift_message2);
        View default_chat_message2 = LJIIZILJ(R.id.c56);
        o.LJIIIIZZ(default_chat_message2, "default_chat_message");
        C87277YNd.LJJIIZ(default_chat_message2);
    }

    public final String getAnchorId() {
        return (String) this.LJLZ.getValue();
    }

    @Override // X.CUC
    public int getCurTabMsg() {
        Integer num = (Integer) this.LJLJJLL.kv0(MsgViewShowingTabChannel.class);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return new LifecycleRegistry(this);
    }

    public final int getMaxListSize() {
        return ((Number) this.LJLLI.getValue()).intValue();
    }

    public final long getRoomId() {
        return ((Number) this.LJLLLLLL.getValue()).longValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0NB.LJIIIZ("LiveGameMsgView", "onDetachedFromWindow()");
        this.LJLL.dispose();
        super.onDetachedFromWindow();
    }

    @Override // X.CUC
    public final boolean LJII() {
        return LJIIZILJ(R.id.axv).isSelected();
    }

    public final void LJIJJLI() {
        ((TextView) LJIIZILJ(R.id.lrl)).setSelected(true);
        ((TextView) LJIIZILJ(R.id.lrm)).setSelected(false);
        C31450CVy c31450CVy = this.LJLLLL;
        if (c31450CVy != null) {
            C87277YNd.LJJIIZI(c31450CVy);
        }
        View layout_comment_all = LJIIZILJ(R.id.fhf);
        o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
        C87277YNd.LJJIJ(layout_comment_all);
        setMsgViewTabState(0);
        View LJIIZILJ = LJIIZILJ(R.id.isy);
        if (LJIIZILJ != null) {
            C87277YNd.LJJIIZI(LJIIZILJ);
        }
    }

    public final void LJIL() {
        ((TextView) LJIIZILJ(R.id.lrm)).setSelected(true);
        ((TextView) LJIIZILJ(R.id.lrl)).setSelected(false);
        View layout_comment_all = LJIIZILJ(R.id.fhf);
        o.LJIIIIZZ(layout_comment_all, "layout_comment_all");
        C87277YNd.LJJIIZI(layout_comment_all);
        C31450CVy c31450CVy = this.LJLLLL;
        if (c31450CVy != null) {
            C87277YNd.LJJIJ(c31450CVy);
        }
        setMsgViewTabState(1);
    }

    public final boolean getCollapsed() {
        if (getState() == 3 || getState() == 2) {
            return true;
        }
        return false;
    }

    public final Context getActivity() {
        return this.LJLJI;
    }

    public final CWK getCallback() {
        return this.LJLJJL;
    }

    @Override // X.CUC
    public int getState() {
        return this.LJZL;
    }

    private final void setMsgViewTabState(int i) {
        if (i == this.LL) {
            return;
        }
        this.LL = i;
        this.LJLJJLL.rv0(MsgViewShowingTabChannel.class, Integer.valueOf(i));
        C31450CVy c31450CVy = this.LJLLLL;
        if (c31450CVy != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            c31450CVy.setIsActivitiesTab(z);
        }
    }

    @Override // X.CUC
    public final void LJI(CQP cqp) {
        if (this.LLFFF) {
            C0NB.LJ("LiveGameMsgView", "bindTextPresenter already binded");
            return;
        }
        C73893SzJ LJIILL = cqp.LJIILL();
        if (LJIILL == null) {
            C0NB.LJ("LiveGameMsgView", "bindTextPresenter observeFloatWindowMsgList return null");
            return;
        }
        this.LLFFF = true;
        C73318Sq2 c73318Sq2 = this.LJLL;
        C73454SsE LJJJ = this.LJLLILLLL.LJFF.LJJJ(C73969T1h.LIZIZ());
        AfS57S0100000_5 afS57S0100000_5 = new AfS57S0100000_5(this, 353);
        AfS17S0001000_5 afS17S0001000_5 = BTJ.LIZ;
        c73318Sq2.LIZ(LJJJ.LJJJLIIL(afS57S0100000_5, afS17S0001000_5));
        this.LJLL.LIZ(LJIILL.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new CW5(this), afS17S0001000_5));
    }

    @Override // X.CUC
    public final void LJIIJ(boolean z) {
        if (z) {
            LJIIZILJ(R.id.axv).setEnabled(false);
            LJIIZILJ(R.id.axv).setAlpha(0.34f);
        } else {
            LJIIZILJ(R.id.axv).setEnabled(true);
            LJIIZILJ(R.id.axv).setAlpha(1.0f);
        }
    }

    @Override // X.CUC
    public final void LJIIJJI(boolean z) {
        Boolean bool;
        StringBuilder LJI = JBR.LJI("onPauseStateChange(). paused=", z, ", btn_pause.isSelected=");
        View LJIIZILJ = LJIIZILJ(R.id.axv);
        if (LJIIZILJ != null) {
            bool = Boolean.valueOf(LJIIZILJ.isSelected());
        } else {
            bool = null;
        }
        LJI.append(bool);
        C0NB.LJIIIZ("LiveGameMsgView", X1D.LIZIZ(LJI));
        if (LJIIZILJ(R.id.axv).isSelected() != z) {
            ((ImageView) LJIIZILJ(R.id.axv)).setSelected(z);
        }
    }

    public final void LJJ(CRD crd) {
        View default_chat_message = LJIIZILJ(R.id.c56);
        o.LJIIIIZZ(default_chat_message, "default_chat_message");
        C87277YNd.LJJIIZ(default_chat_message);
        View default_gift_message = LJIIZILJ(R.id.c5g);
        o.LJIIIIZZ(default_gift_message, "default_gift_message");
        C87277YNd.LJJIJ(default_gift_message);
        if (crd == null) {
            ((TextView) LJIIZILJ(R.id.dtp)).setText(getResources().getText(R.string.ntt));
            return;
        }
        TextView gift_message_content = (TextView) LJIIZILJ(R.id.dtp);
        o.LJIIIIZZ(gift_message_content, "gift_message_content");
        C78939UyV.LJJJ(gift_message_content, crd);
    }

    public final void LJJI(boolean z) {
        Boolean LIZJ = InterfaceC30442Bx8.B0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_GIFT_SEPARATE.value");
        if (LIZJ.booleanValue()) {
            View layout_arrow = LJIIZILJ(R.id.fgo);
            o.LJIIIIZZ(layout_arrow, "layout_arrow");
            C87277YNd.LJJIJ(layout_arrow);
            int state = getState();
            if (state != 1) {
                if (state != 2) {
                    return;
                }
                ((LiveIconView) LJIIZILJ(R.id.exx)).setIconAttr(R.attr.asj);
                LJIIZILJ(R.id.exx).setRotation(0.0f);
                return;
            }
            ((LiveIconView) LJIIZILJ(R.id.exx)).setIconAttr(R.attr.asj);
            LJIIZILJ(R.id.exx).setRotation(180.0f);
            return;
        }
        if (!z) {
            if (this.LJLLILLLL.LIZIZ.size() > 1 && getState() != 3) {
                View layout_arrow2 = LJIIZILJ(R.id.fgo);
                o.LJIIIIZZ(layout_arrow2, "layout_arrow");
                C87277YNd.LJJIJ(layout_arrow2);
                return;
            } else {
                View layout_arrow3 = LJIIZILJ(R.id.fgo);
                o.LJIIIIZZ(layout_arrow3, "layout_arrow");
                C87277YNd.LJJIIZI(layout_arrow3);
                return;
            }
        }
        int state2 = getState();
        if (state2 != 1) {
            if (state2 != 2) {
                if (state2 != 3) {
                    return;
                }
                View layout_arrow4 = LJIIZILJ(R.id.fgo);
                o.LJIIIIZZ(layout_arrow4, "layout_arrow");
                C87277YNd.LJJIIZI(layout_arrow4);
                return;
            }
            ((LiveIconView) LJIIZILJ(R.id.exx)).setIconAttr(R.attr.asj);
            LJIIZILJ(R.id.exx).setRotation(0.0f);
            if (this.LJLLILLLL.LIZIZ.size() > 1) {
                View layout_arrow5 = LJIIZILJ(R.id.fgo);
                o.LJIIIIZZ(layout_arrow5, "layout_arrow");
                C87277YNd.LJJIJ(layout_arrow5);
                return;
            } else {
                View layout_arrow6 = LJIIZILJ(R.id.fgo);
                o.LJIIIIZZ(layout_arrow6, "layout_arrow");
                C87277YNd.LJJIIZI(layout_arrow6);
                return;
            }
        }
        View layout_arrow7 = LJIIZILJ(R.id.fgo);
        o.LJIIIIZZ(layout_arrow7, "layout_arrow");
        C87277YNd.LJJIJ(layout_arrow7);
        ((LiveIconView) LJIIZILJ(R.id.exx)).setIconAttr(R.attr.asj);
        LJIIZILJ(R.id.exx).setRotation(180.0f);
    }

    @Override // X.CUC
    public void setMsgBtnActive(boolean z) {
        ((ImageView) LJIIZILJ(R.id.ax9)).setSelected(z);
        if (z) {
            ((LiveIconView) LJIIZILJ(R.id.ax9)).setIconAttr(R.attr.as4);
        } else {
            ((LiveIconView) LJIIZILJ(R.id.ax9)).setIconAttr(R.attr.as6);
        }
    }

    @Override // X.CUC
    public void setState(int i) {
        if (i == this.LJZL) {
            return;
        }
        this.LJZL = i;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    View bar_container = LJIIZILJ(R.id.agm);
                    o.LJIIIIZZ(bar_container, "bar_container");
                    C87277YNd.LJJIIZ(bar_container);
                    LJJII();
                }
            } else {
                LJJII();
                View bar_container2 = LJIIZILJ(R.id.agm);
                o.LJIIIIZZ(bar_container2, "bar_container");
                C87277YNd.LJJIJ(bar_container2);
            }
        } else {
            LJJII();
            View bar_container3 = LJIIZILJ(R.id.agm);
            o.LJIIIIZZ(bar_container3, "bar_container");
            C87277YNd.LJJIJ(bar_container3);
        }
        LJJI(true);
        this.LJLJJL.LJ(getState());
    }

    @Override // X.CUC
    public final void LJIILJJIL(ChatMessage chatMessage, ChatMessage chatMessage2) {
        this.LJLLILLLL.LJFF.onNext(new OSZ<>(chatMessage, chatMessage2));
    }

    public final void LJIJJ(int i, String str) {
        this.LJLJJLL.rv0(TipMessageChannel.class, new CWR(str, true, i, null, null, 24));
    }

    public static int LJJIFFI(ArrayList arrayList, ChatMessage chatMessage, ChatMessage chatMessage2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CW4(ActivityC45651qj activity, InterfaceC31286CPq interfaceC31286CPq, C37681ds c37681ds, DataChannel dataChannel) {
        super(activity, dataChannel);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LLFII = new LinkedHashMap();
        this.LJLJI = activity;
        this.LJLJJI = interfaceC31286CPq;
        this.LJLJJL = c37681ds;
        this.LJLJJLL = dataChannel;
        this.LJLJL = 300000;
        this.LJLJLJ = 60000;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLL = c73318Sq2;
        this.LJLLI = C221108m2.LIZIZ(C31431CVf.LJLIL);
        CW7 cw7 = new CW7();
        this.LJLLILLLL = cw7;
        this.LJLLL = new AtomicInteger(0);
        this.LJLLLLLL = C221108m2.LIZIZ(C28180B4e.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(CWT.LJLIL);
        this.LJZ = System.currentTimeMillis();
        this.LJZI = System.currentTimeMillis();
        this.LJZL = 2;
        this.LL = -1;
        C0NB.LJIIIZ("LiveGameMsgView", "init()");
        View.inflate(activity, R.layout.djz, this);
        ((AbstractC019505v) LJIIZILJ(R.id.agz)).setReferencedIds(new int[]{R.id.fhf, R.id.fww});
        C16880lQ.LJJII((LiveIconView) LJIIZILJ(R.id.exx), new ACListenerS25S0100000_5(this, 441));
        setState(2);
        C131855Fl c131855Fl = (C131855Fl) LJIIZILJ(R.id.bss);
        float LJIIJ = C87277YNd.LJIIJ(20);
        c131855Fl.LJLILLLLZI = 0;
        c131855Fl.LJLJI = LJIIJ;
        c131855Fl.invalidate();
        C31435CVj c31435CVj = new C31435CVj(activity, cw7.LIZIZ);
        this.LJLJLLL = c31435CVj;
        GameMsgLinearLayoutManager gameMsgLinearLayoutManager = new GameMsgLinearLayoutManager();
        ((CW0) LJIIZILJ(R.id.isn)).setMaxHeight(C87277YNd.LJIIJJI(154));
        ((RecyclerView) LJIIZILJ(R.id.isn)).setLayoutManager(gameMsgLinearLayoutManager);
        ((RecyclerView) LJIIZILJ(R.id.isn)).setItemAnimator(null);
        ((RecyclerView) LJIIZILJ(R.id.isn)).setAdapter(c31435CVj);
        C73454SsE LJJJ = LLFZ.LJJJ(C73969T1h.LIZIZ());
        AfS57S0100000_5 afS57S0100000_5 = new AfS57S0100000_5(this, 351);
        AfS17S0001000_5 afS17S0001000_5 = BTJ.LIZ;
        c73318Sq2.LIZ(LJJJ.LJJJLIIL(afS57S0100000_5, afS17S0001000_5));
        c73318Sq2.LIZ(LLI.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 352), afS17S0001000_5));
        LJJ(null);
        ((TextView) LJIIZILJ(R.id.b9x)).setMinLines(2);
        ((TextView) LJIIZILJ(R.id.b9x)).setMaxLines(2);
        ((TextView) LJIIZILJ(R.id.dtp)).setMinLines(3);
        ((TextView) LJIIZILJ(R.id.dtp)).setMaxLines(3);
        setMsgBtnActive(true);
        C16880lQ.LJJII((LiveIconView) LJIIZILJ(R.id.ax9), new ACListenerS25S0100000_5(this, 447));
        C16880lQ.LJJII((LiveIconView) LJIIZILJ(R.id.ayo), new ACListenerS25S0100000_5(this, 449));
        C16880lQ.LJIILLIIL((ImageView) LJIIZILJ(R.id.axv), new ACListenerS25S0100000_5(this, 451));
        Boolean LIZJ = InterfaceC30442Bx8.LLJJJ.LIZJ();
        o.LJIIIIZZ(LIZJ, "SERVER_ENABLE_HIGHLIGHT_BUTTON.value");
        if (LIZJ.booleanValue()) {
            ((ImageView) LJIIZILJ(R.id.awc)).setVisibility(0);
        } else {
            ((ImageView) LJIIZILJ(R.id.awc)).setVisibility(8);
        }
        C16880lQ.LJIILLIIL((ImageView) LJIIZILJ(R.id.awc), new ACListenerS40S0200000_5(g0.LJIILL(getContext()), this, 86));
        if (C30922CBq.LIZIZ) {
            this.LJLJL = HighLightCutConfigSetting.INSTANCE.getValue().getMinCutInterval() * 1000;
        }
    }

    public final boolean LJIJ(long j, long j2, long j3, long j4) {
        if (j3 < this.LJLJLJ) {
            String string = this.LJLJI.getString(R.string.l9e);
            o.LJIIIIZZ(string, "activity.getString(R.string.pm_flowball_hightoast)");
            LJIJJ(1, string);
            C46104I7o.LJJIL(0, j4, "", false);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZJ = V10.LIZJ("duration < 1min, curTime=", j, ", liveStartTime=");
                LIZJ.append(j2);
                LIZJ.append(", liveDuration=");
                LIZJ.append(j3);
                C0NB.LJIIIZ("LiveGameMsgView", X1D.LIZIZ(LIZJ));
            }
            C78555UsJ.LJJIJ(1, 0, j, j2, j3, this.LJLLJ, j4, "duration < 1min");
            return false;
        }
        if (j - this.LJLLJ < this.LJLJL) {
            String string2 = this.LJLJI.getString(R.string.l9f);
            o.LJIIIIZZ(string2, "activity.getString(R.str…g.pm_flowball_hightoast2)");
            LJIJJ(1, string2);
            C46104I7o.LJJIL(1, j4, "", false);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZJ2 = V10.LIZJ("click interval < 5min, curTime=", j, ", liveStartTime=");
                LIZJ2.append(j2);
                LIZJ2.append(", liveDuration=");
                LIZJ2.append(j3);
                C0NB.LJIIIZ("LiveGameMsgView", X1D.LIZIZ(LIZJ2));
            }
            C78555UsJ.LJJIJ(0, 0, j, j2, j3, this.LJLLJ, j4, "click interval < 5min");
            return false;
        }
        return true;
    }

    public final void LJIJI(long j, long j2, long j3, long j4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("highlight");
        LIZ.append(this.LJLLL.get());
        C1EW.LIZ(((HighLightApi) Q7L.LIZIZ(HighLightApi.class)).createHighLightVideo(0L, j4, 0L, System.currentTimeMillis() / 1000, X1D.LIZIZ(LIZ), 1)).LJJJLIIL(new AfS0S0100400_5(j4, j, j2, j3, this, 2), new AfS0S0100400_5(j, j2, j3, j4, this, 3));
    }
}
