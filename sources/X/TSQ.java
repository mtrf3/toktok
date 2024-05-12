package X;

import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS43S0200000_13;
import Y.IDAListenerS6S0300000_13;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.LeftSlotToolbarVisibilityChannel;
import com.bytedance.android.live.slot.BottomLeftSlotVisibilityChannel;
import com.bytedance.android.livesdk.event.NotifyGamePartnershipIconVisible;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSQ {
    public static boolean LJII;
    public final DataChannel LIZ;
    public final MultiGuestDataHolder LIZIZ;
    public final LifecycleOwner LIZJ;
    public final Room LIZLLL;
    public final List<ObjectAnimator> LJ;
    public boolean LJFF;
    public final TSP LJI;

    public final void LJFF() {
        LJII = false;
        LIZIZ(EnumC30204BtI.MULTI_GUEST_VIDEO, new ARunnableS49S0100000_13(this, 153));
        LIZIZ(EnumC30204BtI.MULTI_GUEST_MIC, new ARunnableS49S0100000_13(this, 154));
        LIZIZ(EnumC30204BtI.MULTI_GUEST_MANAGE, new ARunnableS49S0100000_13(this, 155));
        LIZ(EnumC30204BtI.MULTIGUEST);
        if (this.LJFF) {
            LIZ(EnumC30204BtI.QUESTION);
        }
        if (this.LIZLLL != null) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Lk();
            if (C30627C0h.LJLIL.LIZ(this.LIZLLL.getId())) {
                EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
                if (!enumC30204BtI.isShowing(this.LIZ) && !enumC30204BtI.isShowingInInteractionDialog(this.LIZ)) {
                    ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(this.LIZ);
                    LIZ(enumC30204BtI);
                }
            }
        }
        this.LIZ.qv0(CommentWidgetStyleChangeEvent.class, Boolean.FALSE);
    }

    public final void LIZLLL() {
        C0NB.LJIIIZ("MultiGuestsToolbar", "onWidgetCreate");
        C8E.LJ().e3(this.LJI);
        DataChannel dataChannel = this.LIZ;
        dataChannel.lv0(this.LIZJ, BottomLeftSlotVisibilityChannel.class, new AqS179S0100000_13(this, 464));
        dataChannel.lv0(this.LIZJ, NotifyGamePartnershipIconVisible.class, new AqS179S0100000_13(this, 465));
        dataChannel.lv0(this.LIZJ, LeftSlotToolbarVisibilityChannel.class, new AqS179S0100000_13(this, 466));
    }

    public final void LJ() {
        C0NB.LJIIIZ("MultiGuestsToolbar", "onWidgetDestroy");
        C8E.LJ().X3(this.LJI);
        if (LJII) {
            LJFF();
        }
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
        }
        ((ArrayList) this.LJ).clear();
        View view = EnumC30204BtI.MULTIGUEST.getView(this.LIZ);
        if (view != null) {
            view.setAlpha(1.0f);
            C74776TWi.LJIIJ(this.LIZ);
        }
    }

    public final void LIZ(EnumC30204BtI enumC30204BtI) {
        PathInterpolator LIZIZ;
        View view = enumC30204BtI.getView(this.LIZ);
        if (view != null) {
            List<ObjectAnimator> list = this.LJ;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            if (LJII) {
                LIZIZ = C18950ol.LIZIZ(0.0f, 0.0f, 0.58f, 1.0f);
            } else {
                LIZIZ = C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
            }
            ofFloat.setInterpolator(LIZIZ);
            ofFloat.setDuration(400L);
            ofFloat.addListener(new IDAListenerS6S0300000_13(view, enumC30204BtI, this, 0));
            ofFloat.setStartDelay(100L);
            ofFloat.start();
            ((ArrayList) list).add(ofFloat);
        }
    }

    public final void LIZIZ(EnumC30204BtI enumC30204BtI, Runnable runnable) {
        PathInterpolator LIZIZ;
        View view = enumC30204BtI.getView(this.LIZ);
        if (view != null) {
            List<ObjectAnimator> list = this.LJ;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            if (LJII) {
                LIZIZ = C18950ol.LIZIZ(0.0f, 0.0f, 0.58f, 1.0f);
            } else {
                LIZIZ = C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
            }
            ofFloat.setInterpolator(LIZIZ);
            ofFloat.setDuration(250L);
            ofFloat.addListener(new IDAListenerS43S0200000_13(runnable, view, 8));
            ofFloat.start();
            ((ArrayList) list).add(ofFloat);
        }
    }

    public final void LIZJ(EnumC30204BtI enumC30204BtI, InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf) {
        enumC30204BtI.load(this.LIZ, interfaceViewOnClickListenerC30227Btf);
        enumC30204BtI.hide(this.LIZ);
        LIZ(enumC30204BtI);
    }

    public TSQ(DataChannel dataChannel, MultiGuestDataHolder multiGuestDataHolder, LiveWidget lifeCycleOwner, Room room) {
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = multiGuestDataHolder;
        this.LIZJ = lifeCycleOwner;
        this.LIZLLL = room;
        this.LJ = new ArrayList();
        this.LJI = new TSP(this);
    }
}
