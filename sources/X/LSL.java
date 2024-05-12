package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* loaded from: classes10.dex */
public final class LSL extends AbstractC56402Jg {
    public final /* synthetic */ DiggPanelComponent LIZ;

    public LSL(DiggPanelComponent diggPanelComponent) {
        this.LIZ = diggPanelComponent;
    }

    @Override // X.AbstractC56402Jg, X.InterfaceC110644Vw
    public final void LIZJ(View view, MotionEvent motionEvent, MotionEvent motionEvent2) {
        int i;
        boolean z;
        Object obj;
        String str;
        int i2;
        String groupId;
        IViewPagerComponentAbility viewPagerComponentAbility = this.LIZ.getViewPagerComponentAbility();
        Aweme aweme = null;
        if (viewPagerComponentAbility != null) {
            aweme = viewPagerComponentAbility.getCurrentAweme();
        }
        DiggPanelComponent diggPanelComponent = this.LIZ;
        diggPanelComponent.getClass();
        if ((L95.LIZIZ() && (TextUtils.equals(C56509MFt.LJ(diggPanelComponent.getPanelContext()), "from_duet_mode") || TextUtils.equals(C56509MFt.LJ(diggPanelComponent.getPanelContext()), "from_duet_mode_detail"))) || ONM.LJI(aweme) || C72083SQt.LJLI(aweme) || C72083SQt.LJLIL(aweme) || C72083SQt.LJL(aweme) || C224868s6.LIZLLL(aweme)) {
            return;
        }
        this.LIZ.handleDoubleClick(motionEvent);
        if (!C56509MFt.LJIIIZ(this.LIZ.getPanelContext())) {
            return;
        }
        String LIZLLL = C56509MFt.LIZLLL(this.LIZ.getPanelContext());
        if (!LPO.LIZ() || motionEvent == null || motionEvent2 == null) {
            return;
        }
        float x = motionEvent2.getX();
        int i3 = LPX.LIZIZ;
        float f = i3 / 2;
        int i4 = 2;
        if (x > f) {
            i = 2;
        } else {
            i = 1;
        }
        if (motionEvent.getX() <= f) {
            i4 = 1;
        }
        if (i == i4) {
            z = true;
        } else {
            z = false;
        }
        if (LPX.LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "double_digg");
            float f2 = 100;
            float f3 = i3;
            c188727au.LIZIZ((motionEvent2.getX() * f2) / f3, "x");
            float y = motionEvent2.getY() * f2;
            float f4 = LPX.LIZJ;
            c188727au.LIZIZ(y / f4, "y");
            c188727au.LIZIZ(((motionEvent.getX() - motionEvent2.getX()) * f2) / f3, "dx");
            c188727au.LIZIZ(((motionEvent.getY() - motionEvent2.getY()) * f2) / f4, "dy");
            if (!z) {
                i4 = 0;
            }
            c188727au.LIZLLL(i4, "side");
            c188727au.LIZLLL(LPX.LIZIZ() ? 1 : 0, "rtl");
            c188727au.LJIIIZ("enter_from", LIZLLL);
            String str2 = "";
            if (aweme == null) {
                obj = "";
            } else {
                obj = Integer.valueOf(aweme.getAwemeType());
            }
            c188727au.LJFF(obj, "aweme_type");
            if (aweme == null || (str = aweme.getAuthorUid()) == null) {
                str = "";
            }
            c188727au.LJIIIZ("author_id", str);
            if (aweme != null && (groupId = aweme.getGroupId()) != null) {
                str2 = groupId;
            }
            c188727au.LJIIIZ("group_id", str2);
            if (aweme != null && aweme.isAd() && aweme.getAwemeType() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "is_ads");
            FMX.LJIIL("event_hot_area", c188727au.LIZ);
        }
        Keva keva = LPX.LIZ;
        keva.storeInt("double_digg", keva.getInt("double_digg", 0) + 1);
        keva.storeLong("double_digg_time", System.currentTimeMillis());
    }
}
