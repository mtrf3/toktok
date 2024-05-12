package Y;

import X.C16880lQ;
import X.C29701Eo;
import X.C31684Cc4;
import X.C31688Cc8;
import X.C31692CcC;
import X.C31723Cch;
import X.InterfaceC04760Gq;
import X.InterfaceC31710CcU;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes6.dex */
public class AObserverS36S0400000_5 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS36S0400000_5 aObserverS36S0400000_5, Object obj) {
        Pair pair = (Pair) obj;
        if (((FrameSlotWidget) aObserverS36S0400000_5.l3).getView() == null || pair == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(((IFrameSlot.SlotViewModel) aObserverS36S0400000_5.l0).LJLILLLLZI.getValue()) && !bool.equals(pair.first)) {
            return;
        }
        if (!bool.equals(((IFrameSlot.SlotViewModel) aObserverS36S0400000_5.l0).LJLILLLLZI.getValue()) && bool.equals(pair.first)) {
            Iterator it = ((PriorityBlockingQueue) ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLJJI).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) ((HashMap) ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLJJL).get(next);
                if (((C31723Cch) aObserverS36S0400000_5.l1) != next && Boolean.TRUE.equals(slotViewModel.LJLILLLLZI.getValue())) {
                    slotViewModel.LJLILLLLZI.setValue(Boolean.FALSE);
                }
            }
            ((IFrameSlot.SlotViewModel) aObserverS36S0400000_5.l0).LJLILLLLZI.setValue(Boolean.TRUE);
        }
        Object obj2 = pair.first;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(obj2)) {
            DataChannel dataChannel = ((FrameSlotWidget) aObserverS36S0400000_5.l3).dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(FrameSlotVisibilityChannel.class, bool2);
            }
            ((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ.LLJJL("during_live");
            ((FrameSlotWidget) aObserverS36S0400000_5.l3).show();
            HashMap hashMap = new HashMap();
            FrameSlotWidget frameSlotWidget = (FrameSlotWidget) aObserverS36S0400000_5.l3;
            if (!frameSlotWidget.LJLJJLL) {
                C31688Cc8.LIZ(((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLJL, hashMap, frameSlotWidget.LJLIL.getDataContainer());
                C31684Cc4.LJFF(((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ, hashMap);
            }
            ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLJJLL = true;
            C31684Cc4.LIZJ("FrameSlotWidget", ((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ, "slot visible change, visible: true", hashMap);
            if (((FrameSlotWidget) aObserverS36S0400000_5.l3).getView() instanceof ViewGroup) {
                ((ViewGroup) ((FrameSlotWidget) aObserverS36S0400000_5.l3).getView()).removeAllViews();
            }
            FrameSlotWidget frameSlotWidget2 = (FrameSlotWidget) aObserverS36S0400000_5.l3;
            frameSlotWidget2.LJLILLLLZI = ((IFrameSlot) aObserverS36S0400000_5.l2).LJFF(frameSlotWidget2.getContext());
            if (((FrameSlotWidget) aObserverS36S0400000_5.l3).getView() instanceof ViewGroup) {
                ((ViewGroup) ((FrameSlotWidget) aObserverS36S0400000_5.l3).getView()).addView(((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLILLLLZI);
            }
            Animation LIZJ = ((IFrameSlot) aObserverS36S0400000_5.l2).LIZJ();
            if (LIZJ != null) {
                ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLILLLLZI.startAnimation(LIZJ);
                C31684Cc4.LIZIZ("FrameSlotWidget", ((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ, "slot start in anim");
            }
            View view = ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLILLLLZI;
            if (view == null || view.hasOnClickListeners()) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(aObserverS36S0400000_5, 42), ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLILLLLZI);
            return;
        }
        FrameSlotWidget frameSlotWidget3 = (FrameSlotWidget) aObserverS36S0400000_5.l3;
        if (frameSlotWidget3.LJLILLLLZI == null) {
            return;
        }
        DataChannel dataChannel2 = frameSlotWidget3.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(FrameSlotVisibilityChannel.class, Boolean.FALSE);
        }
        Animation LIZLLL = ((IFrameSlot) aObserverS36S0400000_5.l2).LIZLLL();
        if (LIZLLL == null || "visibility_reason_conflict".equals(pair.second) || "visibility_reason_dispose".equals(pair.second)) {
            if (((FrameSlotWidget) aObserverS36S0400000_5.l3).getView() instanceof ViewGroup) {
                ((ViewGroup) ((FrameSlotWidget) aObserverS36S0400000_5.l3).getView()).removeAllViews();
            }
            ((FrameSlotWidget) aObserverS36S0400000_5.l3).hide();
            C31684Cc4.LIZIZ("FrameSlotWidget", ((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ, "slot visible change, visible: false");
            return;
        }
        LIZLLL.setAnimationListener(new IDAListenerS232S0100000_5(aObserverS36S0400000_5, 1));
        ((FrameSlotWidget) aObserverS36S0400000_5.l3).LJLILLLLZI.startAnimation(LIZLLL);
        C31684Cc4.LIZIZ("FrameSlotWidget", ((C31723Cch) aObserverS36S0400000_5.l1).LIZIZ, "slot start end anim");
    }

    public static final void onChanged$1(AObserverS36S0400000_5 aObserverS36S0400000_5, Object obj) {
        String str;
        final BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS36S0400000_5.l0;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS36S0400000_5.l1;
        IIconSlot iIconSlot = (IIconSlot) aObserverS36S0400000_5.l2;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS36S0400000_5.l3;
        if (bottomLeftSlotWidget.LJLLJ && !TextUtils.isEmpty(slotViewModel.LLFF)) {
            str = slotViewModel.LLFF;
        } else {
            str = slotViewModel.LLF;
        }
        if (!Boolean.TRUE.equals(slotViewModel.LJLILLLLZI.getValue()) || TextUtils.isEmpty(str)) {
            bottomLeftSlotWidget.LJLJLJ.cancelAnimation();
            bottomLeftSlotWidget.LJLJLJ.setVisibility(8);
            bottomLeftSlotWidget.LJLILLLLZI.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = bottomLeftSlotWidget.LJZ;
            if (layoutParams != null) {
                bottomLeftSlotWidget.LJLJLJ.setLayoutParams(layoutParams);
                bottomLeftSlotWidget.LJZ = null;
                return;
            }
            return;
        }
        if (Boolean.FALSE.equals(obj)) {
            bottomLeftSlotWidget.LJLJLJ.cancelAnimation();
            bottomLeftSlotWidget.LJLJLJ.setVisibility(8);
            bottomLeftSlotWidget.LJLILLLLZI.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = bottomLeftSlotWidget.LJZ;
            if (layoutParams2 == null) {
                return;
            }
            bottomLeftSlotWidget.LJLJLJ.setLayoutParams(layoutParams2);
            bottomLeftSlotWidget.LJZ = null;
            return;
        }
        if (bottomLeftSlotWidget.LJLJLJ.isAnimating()) {
            bottomLeftSlotWidget.LJLJLJ.cancelAnimation();
        }
        bottomLeftSlotWidget.LJLJLJ.setVisibility(0);
        if (str.contains("http") || str.contains("https")) {
            bottomLeftSlotWidget.LJLJLJ.setAnimationFromUrl(str);
        } else {
            bottomLeftSlotWidget.LJLJLJ.setImageAssetsFolder(slotViewModel.LLD);
            bottomLeftSlotWidget.LJLJLJ.setAnimation(str);
        }
        bottomLeftSlotWidget.LJLJLJ.addAnimatorListener(bottomLeftSlotWidget.LJZI);
        bottomLeftSlotWidget.LJLJLJ.addAnimatorListener(iIconSlot.LIZIZ());
        bottomLeftSlotWidget.LJLJLJ.setFailureListener(new InterfaceC04760Gq() { // from class: X.CcO
            @Override // X.InterfaceC04760Gq
            public final void onResult(Object obj2) {
                BottomLeftSlotWidget bottomLeftSlotWidget2 = BottomLeftSlotWidget.this;
                C29701Eo c29701Eo = bottomLeftSlotWidget2.LJLJLJ;
                if (c29701Eo != null) {
                    c29701Eo.setVisibility(8);
                }
                ImageView imageView = bottomLeftSlotWidget2.LJLILLLLZI;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        });
        bottomLeftSlotWidget.LJLJLJ.playAnimation();
        C31684Cc4.LIZIZ("BottomLeftSlotWidget", interfaceC31710CcU, "slot start play anim");
    }

    public static final void onChanged$2(AObserverS36S0400000_5 aObserverS36S0400000_5, Object obj) {
        String str;
        if (((C31692CcC) aObserverS36S0400000_5.l3).LJLLILLLL && !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0).LLFF)) {
            str = ((IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0).LLFF;
        } else {
            str = ((IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0).LLF;
        }
        if (!Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0).LJLILLLLZI.getValue()) || TextUtils.isEmpty(str)) {
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.cancelAnimation();
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setVisibility(8);
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJLL.setVisibility(0);
            return;
        }
        if (Boolean.FALSE.equals(obj)) {
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.cancelAnimation();
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setVisibility(8);
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJLL.setVisibility(0);
            return;
        }
        ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setVisibility(0);
        if (str.contains("http") || str.contains("https")) {
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setAnimationFromUrl(str);
        } else {
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setImageAssetsFolder(((IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0).LLD);
            ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.setAnimation(str);
        }
        ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.addAnimatorListener(((IIconSlot) aObserverS36S0400000_5.l1).LIZIZ());
        ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.addAnimatorListener(new ALAdapterS4S0100000_5(aObserverS36S0400000_5, 52));
        C29701Eo c29701Eo = ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI;
        final IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS36S0400000_5.l0;
        c29701Eo.setFailureListener(new InterfaceC04760Gq() { // from class: X.CcF
            @Override // X.InterfaceC04760Gq
            public final void onResult(Object obj2) {
                IIconSlot.SlotViewModel.this.LJLLLL.setValue(Boolean.FALSE);
            }
        });
        ((C31692CcC) aObserverS36S0400000_5.l3).LJLJJI.playAnimation();
        C31684Cc4.LIZIZ("ToolbarAudienceSlotBehavior", (InterfaceC31710CcU) aObserverS36S0400000_5.l2, "slot start play anim");
    }

    public AObserverS36S0400000_5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
