package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.publicscreen.impl.game.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CVy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31450CVy extends FrameLayout {
    public static final /* synthetic */ int LJLLL = 0;
    public C31435CVj LJLIL;
    public final CW0 LJLILLLLZI;
    public final TextView LJLJI;
    public InterfaceC31286CPq LJLJJI;
    public final TextView LJLJJL;
    public final boolean LJLJJLL;
    public final ArrayList<C31291CPv> LJLJL;
    public C31291CPv LJLJLJ;
    public boolean LJLJLLL;
    public final C28462BFa LJLL;
    public C31453CWb LJLLI;
    public final C31451CVz LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
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

    public final void setIsActivitiesTab(boolean z) {
    }

    public final void LIZJ() {
        if (!this.LJLJL.isEmpty()) {
            if (this.LJLJLLL) {
                C31291CPv c31291CPv = this.LJLJLJ;
                if (c31291CPv != null) {
                    C78939UyV.LJJJ(this.LJLJJL, c31291CPv);
                }
                C87277YNd.LJJIJ(this.LJLJJL);
                C87277YNd.LJJIIZ(this.LJLILLLLZI);
            } else {
                C87277YNd.LJJIIZ(this.LJLJJL);
                C87277YNd.LJJIJ(this.LJLILLLLZI);
            }
            C87277YNd.LJJIIZ(this.LJLJI);
            return;
        }
        C87277YNd.LJJIIZ(this.LJLJJL);
        C87277YNd.LJJIIZ(this.LJLILLLLZI);
        C87277YNd.LJJIJ(this.LJLJI);
    }

    public final boolean getCollapsed() {
        return this.LJLJLLL;
    }

    public final void setCollapsed(boolean z) {
        this.LJLJLLL = z;
        LIZJ();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LJLJJI != null && i == 0) {
            this.LJLL.LIZIZ("tab_switch", !this.LJLJL.isEmpty());
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31450CVy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        long j;
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        boolean isExperimentGroup = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
        this.LJLJJLL = isExperimentGroup;
        this.LJLJL = new ArrayList<>();
        this.LJLJLLL = true;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLL = new C28462BFa(valueOf, j, "message_hover");
        if (isExperimentGroup) {
            View.inflate(context, R.layout.dk6, this);
        } else {
            View.inflate(context, R.layout.dk5, this);
        }
        C131855Fl c131855Fl = (C131855Fl) LIZ(R.id.dt4);
        float LJIIJ = C87277YNd.LJIIJ(20);
        c131855Fl.LJLILLLLZI = 0;
        c131855Fl.LJLJI = LJIIJ;
        c131855Fl.invalidate();
        View findViewById = findViewById(R.id.lrg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ttlive…cycler_view_gift_history)");
        CW0 cw0 = (CW0) findViewById;
        this.LJLILLLLZI = cw0;
        View findViewById2 = findViewById(R.id.lpf);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ttlive_gift_history_empty)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.dt5);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.gift_history_message_content)");
        this.LJLJJL = (TextView) findViewById3;
        if (isExperimentGroup) {
            ViewGroup.LayoutParams layoutParams = LIZ(R.id.dt4).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = -1;
            LIZ(R.id.dt4).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = cw0.getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.height = -1;
            cw0.setLayoutParams(layoutParams4);
        }
        this.LJLLILLLL = new C31451CVz(this);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        C31453CWb c31453CWb;
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (this.LJLJJI == null) {
            return;
        }
        if (i == 0 && getVisibility() == 0) {
            InterfaceC31286CPq interfaceC31286CPq = this.LJLJJI;
            if (interfaceC31286CPq != null) {
                interfaceC31286CPq.LIZIZ();
            }
            if (this.LJLJJLL && (c31453CWb = this.LJLLI) != null) {
                C31453CWb.LIZLLL(c31453CWb, EnumC31433CVh.NORMAL, 6);
            }
            this.LJLL.LIZIZ("hover_unfold", !this.LJLJL.isEmpty());
            return;
        }
        this.LJLL.LIZ(!this.LJLJL.isEmpty());
    }

    public final void LIZIZ(InterfaceC31286CPq interfaceC31286CPq, int i, DataChannel dataChannel) {
        LinearLayoutManager gameMsgLinearLayoutManager;
        this.LJLJJI = interfaceC31286CPq;
        this.LJLJL.clear();
        List<GiftMessage> LIZ = interfaceC31286CPq.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("listMessage = ");
        LIZ2.append(LIZ.size());
        C0NB.LJIIIZ("LiveGameGiftHistoryView", X1D.LIZIZ(LIZ2));
        Iterator<GiftMessage> it = LIZ.iterator();
        while (it.hasNext()) {
            this.LJLJL.add(new C31291CPv(it.next()));
        }
        if (!this.LJLJL.isEmpty()) {
            this.LJLJLJ = (C31291CPv) ORZ.LLFF(this.LJLJL);
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLIL = new C31435CVj(context, this.LJLJL);
        LIZJ();
        if (this.LJLJJLL) {
            getContext();
            gameMsgLinearLayoutManager = new SmoothLinearLayoutManager();
            gameMsgLinearLayoutManager.LLJJIJIIJIL(true);
        } else {
            getContext();
            gameMsgLinearLayoutManager = new GameMsgLinearLayoutManager();
        }
        this.LJLILLLLZI.setMaxHeight(i);
        this.LJLILLLLZI.setLayoutManager(gameMsgLinearLayoutManager);
        if (this.LJLJJLL) {
            C87009YCv c87009YCv = new C87009YCv(CW1.LJLIL, CW2.LJLIL);
            c87009YCv.LJI = false;
            c87009YCv.LJJ = new AqS155S0100000_5(this, 55);
            this.LJLILLLLZI.setItemAnimator(c87009YCv);
            CW0 cw0 = this.LJLILLLLZI;
            C47121t6 messages_hint_view = (C47121t6) LIZ(R.id.gia);
            o.LJIIIIZZ(messages_hint_view, "messages_hint_view");
            this.LJLLI = new C31453CWb(cw0, messages_hint_view, dataChannel, false, null);
        } else {
            this.LJLILLLLZI.setItemAnimator(null);
        }
        this.LJLILLLLZI.setAdapter(this.LJLIL);
        InterfaceC31286CPq interfaceC31286CPq2 = this.LJLJJI;
        if (interfaceC31286CPq2 != null) {
            interfaceC31286CPq2.LJ(this.LJLLILLLL);
        }
    }
}
