package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftAnimationChannel;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimaEndEvent;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicGiftSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS80S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UDy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76846UDy {
    public final Context LIZ;
    public final InterfaceC75179Tex LIZIZ;
    public final DataChannel LIZJ;
    public Future<?> LIZLLL;
    public UE4 LJ;
    public int LJFF;
    public int LJI;
    public C42951mN<FrameLayout> LJII;
    public C42951mN<C2A4> LJIIIIZZ;
    public C42951mN<C2A4> LJIIIZ;
    public AnimatedDrawable2 LJIIJ;
    public AnimatedDrawable2 LJIIJJI;
    public boolean LJIIL;
    public final C76714U8w LJIILIIL;

    public static boolean LJI() {
        if (C8E.LIZJ().VY()) {
            return true;
        }
        if (C8E.LIZJ().Xu0() && C8E.LIZJ().Yu0() >= 1) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Point point) {
        o.LJIIIZ(point, "<this>");
        if (point.x == 0 && point.y == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(C14500ha c14500ha) {
        int i = c14500ha.LIZ.LIZIZ;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public final void LIZ(View view) {
        o.LJIIIZ(view, "view");
        this.LJ = (UE4) view.findViewById(R.id.dss);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.ov0(LiveLinkMicGiftAnimationChannel.class, this, new C76847UDz(this));
        dataChannelGlobal.ov0(SmallFlyMicGiftAnimaEndEvent.class, this, new AqS179S0100000_13(this, 158));
        dataChannelGlobal.ov0(ScreenClearEvent.class, this, new UE7(this));
        dataChannelGlobal.ov0(StopFlyMicGiftAnimationEvent.class, this, new UE2(this));
        C8E.LJ().Aq(this.LJIILIIL);
        LIZIZ(this.LIZIZ);
    }

    public final void LIZIZ(InterfaceC75179Tex window) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(window, "window");
        float width = window.LLLILZLLLI().width();
        int i = (int) (0.03f * width);
        this.LJI = i;
        int i2 = (int) (width * 0.18f);
        this.LJFF = i2;
        UE4 ue4 = this.LJ;
        if (ue4 != null) {
            if (i2 != 0) {
                ue4.LJLILLLLZI = i2;
            }
            ViewGroup.LayoutParams layoutParams = ue4.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginEnd(i);
            }
            ViewGroup.LayoutParams layoutParams2 = ue4.getLayoutParams();
            if ((layoutParams2 instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.rightMargin = i;
            }
            ue4.LJLJJI = false;
            ue4.LJI("onLayoutSwitch");
        }
    }

    public final void LIZJ(View view) {
        o.LJIIIZ(view, "view");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        C8E.LJ().zF(this.LJIILIIL);
        Future<?> future = this.LIZLLL;
        if (future != null) {
            future.cancel(false);
        }
        AnimatedDrawable2 animatedDrawable2 = this.LJIIJ;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        AnimatedDrawable2 animatedDrawable22 = this.LJIIJJI;
        if (animatedDrawable22 != null) {
            animatedDrawable22.stop();
        }
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = false;
        if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable()) {
            this.LJIIIIZZ = null;
            this.LJIIIZ = null;
        }
    }

    public final void LIZLLL(C33611Tp c33611Tp) {
        String LIZ;
        int LJIIL;
        FrameLayout frameLayout;
        C2A4 LJIIIIZZ;
        java.util.Map map;
        Integer num;
        if (!MultiGuestFlyMicGiftSwitcherSetting.INSTANCE.isEnable()) {
            return;
        }
        UE3 ue3 = c33611Tp.LJLIL;
        long j = ue3.LJ;
        long j2 = ue3.LIZLLL;
        if (this.LIZIZ.LJJIL().compareTo(EnumC75419Tip.StateJoined) < 0 || !o.LJ(C74947TbD.LJJIFFI(Long.valueOf(j)), this.LIZIZ.LJJ())) {
            return;
        }
        if (j2 == 0 || j == 0) {
            int i = c33611Tp.LJLJI;
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp, 1, i, 2, TV3.LJIIIIZZ(LJ));
            if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                StackTraceElement LJ2 = C32014ChO.LJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_GiftExpressionHelper_", LJ2, LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_GiftExpressionHelper_", 166, LIZ3);
            }
            C32014ChO.LIZJ(LIZ, "sendUid or receiverUid is invalid so return", null);
            return;
        }
        if (!LJI()) {
            C33611Tp c33611Tp2 = new C33611Tp(c33611Tp.LJLIL, new OSZ(new Point(0, 0), new Point(0, 0)), 2, 0L, 8);
            int i2 = c33611Tp.LJLJI;
            User LJ3 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ3, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp2, 5, i2, 2, TV3.LJIIIIZZ(LJ3));
            C0NB.LIZIZ("GiftExpressionHelper", "layout condition is invalid, so return");
            return;
        }
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(BDA.class)) != null && (num = (Integer) map.get(Long.valueOf(j))) != null) {
            LJIIL = num.intValue();
        } else {
            LJIIL = C74947TbD.LJIIL(this.LIZIZ);
        }
        MultiGuestFlyMicViewUsePoolSetting multiGuestFlyMicViewUsePoolSetting = MultiGuestFlyMicViewUsePoolSetting.INSTANCE;
        if (multiGuestFlyMicViewUsePoolSetting.isEnable()) {
            if (this.LJII == null) {
                this.LJII = new C42951mN<>();
            }
            C42951mN<FrameLayout> c42951mN = this.LJII;
            if (c42951mN == null || (frameLayout = c42951mN.LIZIZ()) == null) {
                frameLayout = new FrameLayout(this.LIZ);
                frameLayout.setId(R.id.ala);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                frameLayout.setLayoutParams(layoutParams);
            }
        } else {
            frameLayout = new FrameLayout(this.LIZ);
            frameLayout.setId(R.id.ala);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int i3 = (int) (LJIIL * 2.3f);
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.height = i3;
        layoutParams3.width = i3;
        frameLayout.setLayoutParams(layoutParams3);
        this.LIZIZ.LJJIJIL().addView(frameLayout);
        if (multiGuestFlyMicViewUsePoolSetting.isEnable()) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C42951mN<>();
            }
            C42951mN<C2A4> c42951mN2 = this.LJIIIIZZ;
            if (c42951mN2 == null || (LJIIIIZZ = c42951mN2.LIZIZ()) == null) {
                LJIIIIZZ = LJIIIIZZ(LJIIL, this.LIZ);
            }
        } else {
            LJIIIIZZ = LJIIIIZZ(LJIIL, this.LIZ);
        }
        ViewGroup.LayoutParams layoutParams4 = LJIIIIZZ.getLayoutParams();
        o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        double d = 0.8f;
        double d2 = LJIIL;
        layoutParams5.setMarginStart((int) (Math.random() * d * d2));
        layoutParams5.topMargin = (int) (Math.random() * d * d2);
        LJIIIIZZ.setLayoutParams(layoutParams5);
        frameLayout.addView(LJIIIIZZ);
        C14480hY.LIZ(LJIIIIZZ, this.LIZ, c33611Tp.LJLIL.LJIIJJI, new UE0(this, frameLayout, LJIIIIZZ, c33611Tp), new AqS80S0400000_13(this, frameLayout, LJIIIIZZ, c33611Tp, 0));
    }

    public final C2A4 LJII(C14500ha c14500ha) {
        int LJIIL;
        java.util.Map map;
        Integer num;
        C2A4 c2a4 = new C2A4(this.LIZ);
        c2a4.setId(R.id.al_);
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(BDA.class)) != null && (num = (Integer) map.get(Long.valueOf(c14500ha.LIZ.LJ))) != null) {
            LJIIL = num.intValue();
        } else {
            LJIIL = C74947TbD.LJIIL(this.LIZIZ);
        }
        int i = (int) (LJIIL * 2.2f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        c2a4.setLayoutParams(layoutParams);
        return c2a4;
    }

    public static C2A4 LJIIIIZZ(int i, Context context) {
        C2A4 c2a4 = new C2A4(context);
        c2a4.setId(R.id.k5l);
        int i2 = (int) (i * 1.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 8388659;
        c2a4.setLayoutParams(layoutParams);
        return c2a4;
    }

    public C76846UDy(Context context, InterfaceC75179Tex window, DataChannel dataChannel) {
        o.LJIIIZ(window, "window");
        this.LIZ = context;
        this.LIZIZ = window;
        this.LIZJ = dataChannel;
        this.LJIILIIL = new C76714U8w(this);
    }
}
