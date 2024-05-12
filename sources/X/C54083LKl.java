package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_top_moving_reminder")
/* renamed from: X.LKl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54083LKl extends AbstractC56325M8r<PopupWindow> {
    public final ActivityC45651qj LJLIL;
    public final C53516KzQ LJLILLLLZI;
    public final InterfaceC54084LKm LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final int LJLJJLL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
        }
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        LDR animationDirection;
        boolean z;
        MainActivityScope LJJLIIIJJI;
        HomePageViewPagerAbility LJJJJ;
        o.LJIIIZ(context, "context");
        IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) this.LJLJJL.getValue();
        if (iMFToolBarAbility != null && iMFToolBarAbility.R8()) {
            this.LJLJI.LJIILL();
            C53516KzQ c53516KzQ = this.LJLILLLLZI;
            View view = c53516KzQ.LIZ;
            if (view != null) {
                if (c53516KzQ.LJ == 3) {
                    animationDirection = LDR.LEFT;
                } else {
                    animationDirection = LDR.RIGHT;
                }
                ActivityC45651qj activityC45651qj = this.LJLIL;
                Context context2 = context.LIZ;
                String str = c53516KzQ.LIZIZ;
                int i = c53516KzQ.LJFF;
                int i2 = c53516KzQ.LJI;
                AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(this, 349);
                AqS175S0100000_9 aqS175S0100000_92 = new AqS175S0100000_9(this, 350);
                AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 708);
                AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(this, 709);
                o.LJIIIZ(context2, "context");
                o.LJIIIZ(animationDirection, "animationDirection");
                Rect LIZJ = C73098SmU.LIZJ(view);
                C34K c34k = new C34K();
                if (activityC45651qj != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj)) != null && (LJJJJ = C78688UuS.LJJJJ(LJJLIIIJJI)) != null) {
                    LJJJJ.ii(new LFU(c34k, aqS159S0100000_92));
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i3 = LIZJ.bottom;
                int LJIILL = (i3 - ((i3 - LIZJ.top) / 2)) - C17N.LJIILL(18.0d);
                float f = LIZJ.left;
                float f2 = LER.LIZLLL;
                if (f < f2 || LER.LIZJ - LIZJ.right < f2) {
                    z = true;
                } else {
                    z = false;
                }
                LER.LIZIZ = new LDQ(context2, str, i, i2, aqS175S0100000_9, animationDirection, aqS175S0100000_92, aqS159S0100000_9, aqS159S0100000_92, z);
                if (C90193gN.LIZ()) {
                    if (animationDirection == LDR.RIGHT) {
                        int centerX = (LIZJ.centerX() - C17N.LJIILL(12.0d)) - i;
                        LDQ ldq = LER.LIZIZ;
                        o.LJII(ldq, "null cannot be cast to non-null type com.ss.android.ugc.aweme.utils.TabMovingPopWindow");
                        C16880lQ.LLLFZ(ldq, view, 0, centerX, LJIILL);
                    } else {
                        float f3 = (LER.LIZJ - LIZJ.right) - i;
                        LDQ ldq2 = LER.LIZIZ;
                        o.LJII(ldq2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.utils.TabMovingPopWindow");
                        C16880lQ.LLLFZ(ldq2, view, 8388661, (int) f3, LJIILL);
                    }
                } else if (animationDirection == LDR.LEFT) {
                    int i4 = iArr[0] - i;
                    LDQ ldq3 = LER.LIZIZ;
                    o.LJII(ldq3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.utils.TabMovingPopWindow");
                    C16880lQ.LLLFZ(ldq3, view, 0, i4, LJIILL);
                } else {
                    float f4 = (LER.LIZJ - LIZJ.right) - i2;
                    LDQ ldq4 = LER.LIZIZ;
                    o.LJII(ldq4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.utils.TabMovingPopWindow");
                    C16880lQ.LLLFZ(ldq4, view, 8388661, (int) f4, LJIILL);
                }
                return LER.LIZIZ;
            }
        } else {
            C221018lt.LJFF("MovingReminderPopWindowTask", "topToolBarAbility is null or should not show");
        }
        return null;
    }

    public C54083LKl(ActivityC45651qj activityC45651qj, C53516KzQ data, InterfaceC54084LKm movingReminder, AqS159S0100000_9 aqS159S0100000_9) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(movingReminder, "movingReminder");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = data;
        this.LJLJI = movingReminder;
        this.LJLJJI = aqS159S0100000_9;
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 710));
        this.LJLJJLL = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }
}
