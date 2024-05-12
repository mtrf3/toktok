package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_top_live_pop")
/* loaded from: classes10.dex */
public final class LQN extends AbstractC56325M8r<PopupWindow> {
    public final ActivityC45651qj LJLIL;
    public final LiveBubbleData LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        Window window;
        View decorView;
        Context context2;
        long j;
        Window window2;
        View decorView2;
        Window window3;
        View decorView3;
        List<String> list;
        User owner;
        ImageModel avatarThumb;
        Window window4;
        View decorView4;
        o.LJIIIZ(context, "context");
        LiveBubbleData data = this.LJLILLLLZI;
        o.LJIIIZ(data, "data");
        Context context3 = null;
        if (LQM.LJIIZILJ || LQM.LJIJI) {
            ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).unregisterObserverInnerPush();
            return null;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null || (window = LJIIIIZZ.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getContext() == null) {
            return null;
        }
        LQM.LJIIZILJ = true;
        ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).observerIsShowInnerPush();
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 != null && (window4 = LJIIIIZZ2.getWindow()) != null && (decorView4 = window4.getDecorView()) != null) {
            context2 = decorView4.getContext();
        } else {
            context2 = null;
        }
        LQ1 lq1 = new LQ1(context2);
        LQM.LJIILLIIL = lq1;
        lq1.LJ.setText(data.getBubbleTitle());
        if (data.getShowHead()) {
            lq1.LIZIZ.setVisibility(0);
            lq1.LIZJ.setVisibility(0);
            lq1.LIZLLL.setVisibility(8);
            Room roomData = data.getRoomData();
            if (roomData != null && (owner = roomData.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
                list = avatarThumb.mUrls;
            } else {
                list = null;
            }
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(list);
            LIZ.LJIIL = Boolean.TRUE;
            LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            LIZ.LJIJI = Boolean.FALSE;
            LIZ.LJIIJJI(lq1.LIZJ);
            C47061t0 c47061t0 = lq1.LIZJ;
            lq1.LIZ = new C53887LCx(c47061t0, c47061t0, lq1.LIZIZ);
        } else {
            lq1.LIZIZ.setVisibility(4);
            lq1.LIZJ.setVisibility(4);
            lq1.LIZLLL.setVisibility(0);
        }
        LQ1 lq12 = LQM.LJIILLIIL;
        if (lq12 != null) {
            lq12.LJIILJJIL = LQM.LJIJJ;
        }
        int LIZ2 = C15380j0.LIZ(8.0f) + C63081OpJ.LJJJJLI(EF7.LIZIZ());
        Activity LJIIIIZZ3 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ3 != null && (window2 = LJIIIIZZ3.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            Activity LJIIIIZZ4 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ4 != null && (window3 = LJIIIIZZ4.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                context3 = decorView3.getContext();
            }
            if (CCJ.LIZ(context3)) {
                LQ1 lq13 = LQM.LJIILLIIL;
                if (lq13 != null) {
                    C16880lQ.LLLIIL(lq13, decorView2, 53, LIZ2);
                }
            } else {
                LQ1 lq14 = LQM.LJIILLIIL;
                if (lq14 != null) {
                    C16880lQ.LLLIIL(lq14, decorView2, 51, LIZ2);
                }
            }
        }
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        LQQ lqq = LQQ.LJLIL;
        BubbleSettingData bubbleSettingData = LQM.LJIILL;
        if (bubbleSettingData != null) {
            j = bubbleSettingData.getStayInterval();
        } else {
            j = 0;
        }
        handler.postDelayed(lqq, j * 1000);
        LQ1 lq15 = LQM.LJIILLIIL;
        if (lq15 != null) {
            lq15.setOnDismissListener(LQL.LJLIL);
        }
        return LQM.LJIILLIIL;
    }

    public LQN(ActivityC45651qj activityC45651qj, LiveBubbleData data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = data;
        this.LJLJI = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }
}
