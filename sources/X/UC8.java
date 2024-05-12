package X;

import Y.ALAdapterS10S0200000_13;
import Y.IDComparatorS41S0000000_13;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftEvent;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class UC8 extends AbstractC32579CqV implements OnMessageListener, InterfaceC28344BAm {
    public static int LJLZ;
    public static LinkedList<C78072UkW> LJZ;
    public static C78072UkW LJZI;
    public static boolean LJZL;
    public final LifecycleOwner LJLJL;
    public IMessageManager LJLJLJ;
    public C47061t0 LJLJLLL;
    public C47121t6 LJLL;
    public UCA LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final LinkedList<C78072UkW> LJLLL;
    public int LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // X.AbstractC32579CqV
    public final void onStart() {
        LJLZ = 0;
        LJZI = null;
        LJZ = this.LJLLL;
        IMessageManager iMessageManager = this.LJLJLJ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this);
        }
    }

    @Override // X.AbstractC32579CqV
    public final int LJIIL() {
        return EnumC32750CtG.GIFT_MATCH_TRAY_LEAF.getZIndex();
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILIIL() {
        View view = this.LJLJJI;
        if (view != null) {
            view.setVisibility(8);
        }
        LJZ = null;
        this.LJLLL.clear();
        IMessageManager iMessageManager = this.LJLJLJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public final DataChannel LJJI() {
        Fragment fragment;
        GiftLeafRootViewModel giftLeafRootViewModel;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || (giftLeafRootViewModel = (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class)) == null) {
            return null;
        }
        return giftLeafRootViewModel.LJLIL;
    }

    public final HandlerC28345BAn LJJIFFI() {
        return (HandlerC28345BAn) this.LJLLLLLL.getValue();
    }

    public final void LJJIIJ() {
        ObjectAnimator ofFloat;
        UCA uca = this.LJLLI;
        if (uca == UCA.HIDE || uca == UCA.HIDING) {
            return;
        }
        LJJIFFI().removeMessages(this.LJLLILLLL);
        LJJIFFI().removeMessages(this.LJLLJ);
        View view = this.LJLJJI;
        if (view == null || (ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f)) == null) {
            return;
        }
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new ALAdapterS10S0200000_13(this, view, 0));
        ofFloat.start();
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILL() {
        IMessageManager iMessageManager;
        DataChannel LJJI = LJJI();
        if (LJJI != null) {
            iMessageManager = (IMessageManager) LJJI.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJLJ = iMessageManager;
        DataChannel LJJI2 = LJJI();
        if (LJJI2 != null) {
            LJJI2.lv0(this.LJLJL, MatchGiftEvent.class, new AqS179S0100000_13(this, 35));
            LJJI2.lv0(this.LJLJL, BattleTaskGuideTipShowChannel.class, new AqS179S0100000_13(this, 36));
        }
    }

    public UC8(Context context) {
        super(context, EnumC32750CtG.GIFT_MATCH_TRAY_LEAF.getZIndex());
        this.LJLJL = null;
        this.LJLLI = UCA.HIDE;
        this.LJLLILLLL = 100;
        this.LJLLJ = 200;
        this.LJLLL = new LinkedList<>();
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d9, code lost:
    
        if (r6 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C78072UkW r14) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UC8.LJJIII(X.UkW):void");
    }

    public final void LJJIIJZLJL(C78072UkW c78072UkW) {
        int i;
        int i2 = c78072UkW.LJJJLL;
        C78072UkW c78072UkW2 = LJZI;
        if (c78072UkW2 != null) {
            i = c78072UkW2.LJJJLL;
        } else {
            i = 0;
        }
        if (i2 < i) {
            return;
        }
        LJZI = c78072UkW;
        int i3 = i2 - this.LJLLLL;
        if (i3 == 1) {
            C47121t6 c47121t6 = this.LJLL;
            if (c47121t6 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('x');
                int i4 = this.LJLLLL + 1;
                this.LJLLLL = i4;
                LIZ.append(i4);
                LIZ.append(' ');
                c47121t6.setText(X1D.LIZIZ(LIZ));
            }
            c78072UkW.LJJJZ = c78072UkW.LJJJLL - this.LJLLLL;
            LJLZ++;
            C32463Cod.LJFF(c78072UkW);
            LJJIFFI().removeMessages(this.LJLLJ);
            LJJIFFI().removeMessages(this.LJLLILLLL);
            LJJIFFI().sendEmptyMessageDelayed(this.LJLLILLLL, 2000L);
            return;
        }
        if (i3 <= 1) {
            return;
        }
        C47121t6 c47121t62 = this.LJLL;
        if (c47121t62 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('x');
            int i5 = this.LJLLLL + 1;
            this.LJLLLL = i5;
            LIZ2.append(i5);
            LIZ2.append(' ');
            c47121t62.setText(X1D.LIZIZ(LIZ2));
        }
        c78072UkW.LJJJZ = c78072UkW.LJJJLL - this.LJLLLL;
        LJLZ++;
        C32463Cod.LJFF(c78072UkW);
        LJJIFFI().removeMessages(this.LJLLJ);
        LJJIFFI().sendEmptyMessageDelayed(this.LJLLJ, 400L);
        LJJIFFI().removeMessages(this.LJLLILLLL);
        LJJIFFI().sendEmptyMessageDelayed(this.LJLLILLLL, 2000L);
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        C78072UkW c78072UkW;
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i == this.LJLLILLLL) {
            LJJIIJ();
        } else {
            if (i != this.LJLLJ || (c78072UkW = LJZI) == null) {
                return;
            }
            LJJIIJZLJL(c78072UkW);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof LinkMicBattleArmiesMessage)) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = (LinkMicBattleArmiesMessage) iMessage;
            if (linkMicBattleArmiesMessage.giftCount > 0 && this.LJLJI.LIZ == EnumC32545Cpx.START) {
                LJZL = true;
                C78072UkW c78072UkW = new C78072UkW(null);
                c78072UkW.LJJJJZI = linkMicBattleArmiesMessage.fromUserId;
                c78072UkW.LJJJJIZL = linkMicBattleArmiesMessage.giftId;
                c78072UkW.LIZLLL = linkMicBattleArmiesMessage.totalDiamondCount;
                c78072UkW.LJJJLIIL = linkMicBattleArmiesMessage.giftCount;
                c78072UkW.LJJJLL = linkMicBattleArmiesMessage.repeatCount;
                c78072UkW.LJJJJ = linkMicBattleArmiesMessage.gifIconImage;
                c78072UkW.LJJJLZIJ = true;
                c78072UkW.LJJJZ = this.LJLLLL;
                LJJIII(c78072UkW);
            }
        }
    }

    public final void LJJII(C78072UkW c78072UkW, boolean z) {
        if (!z) {
            this.LJLLL.offer(c78072UkW);
        } else {
            this.LJLLL.offerFirst(c78072UkW);
        }
        LinkedList<C78072UkW> linkedList = this.LJLLL;
        if (linkedList.size() > 1) {
            C40675Fxn.LJJLIIIJ(linkedList, new IDComparatorS41S0000000_13(1));
        }
    }
}
