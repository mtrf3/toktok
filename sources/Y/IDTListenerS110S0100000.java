package Y;

import X.AbstractC12520eO;
import X.C15380j0;
import X.C16230kN;
import X.C1G2;
import X.C1I1;
import X.C1VL;
import X.C2AJ;
import X.C30031Fv;
import X.C30051Fx;
import X.C31691Mf;
import X.C32811Qn;
import X.C37781e2;
import X.C47959Irz;
import X.C87277YNd;
import X.CVC;
import X.CZV;
import X.XKX;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragmentOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDTListenerS110S0100000 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS110S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        String str;
        CZV czv;
        if (motionEvent.getAction() == 0) {
            ((C30031Fv) iDTListenerS110S0100000.l0).setStartX((int) motionEvent.getRawX());
            ((C30031Fv) iDTListenerS110S0100000.l0).setCanHide(true);
        } else {
            if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 2) || !((C30031Fv) iDTListenerS110S0100000.l0).getCanHide()) {
                return true;
            }
            ((C30031Fv) iDTListenerS110S0100000.l0).setEndX((int) motionEvent.getRawX());
            int LJIIJJI = C87277YNd.LJIIJJI(8);
            int endX = ((C30031Fv) iDTListenerS110S0100000.l0).getEndX() - ((C30031Fv) iDTListenerS110S0100000.l0).getStartX();
            if (C15380j0.LJIIZILJ() ? endX > LJIIJJI : endX < (-LJIIJJI)) {
                C30031Fv c30031Fv = (C30031Fv) iDTListenerS110S0100000.l0;
                c30031Fv.setHideNum(c30031Fv.getHideNum() + 1);
                C30031Fv c30031Fv2 = (C30031Fv) iDTListenerS110S0100000.l0;
                CVC cvc = c30031Fv2.LJLJLLL;
                if (cvc == null || (str = cvc.LJLIL) == null) {
                    str = "";
                }
                c30031Fv2.LJLLJ = str;
                c30031Fv2.LJLLL = true;
                c30031Fv2.LJJLL(true);
                ((C30031Fv) iDTListenerS110S0100000.l0).setCanHide(false);
                C30031Fv c30031Fv3 = (C30031Fv) iDTListenerS110S0100000.l0;
                CVC cvc2 = c30031Fv3.LJLJLLL;
                if (cvc2 != null) {
                    czv = cvc2.LJLLI;
                } else {
                    czv = null;
                }
                if (czv == CZV.BLANK) {
                    c30031Fv3.LJLLJ = "";
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$1(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        ((C30051Fx) iDTListenerS110S0100000.l0).LJLJI.invoke();
        return true;
    }

    public static final boolean onTouch$2(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        return ((C1G2) iDTListenerS110S0100000.l0).LIZLLL(motionEvent);
    }

    public static final boolean onTouch$3(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        return ((C1G2) iDTListenerS110S0100000.l0).LIZLLL(motionEvent);
    }

    public static final boolean onTouch$4(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ((LiveSheetFragment) iDTListenerS110S0100000.l0).Hl(false);
        }
        return true;
    }

    public static final boolean onTouch$5(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || C47959Irz.LIZ(motionEvent, ((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0).LJLLLLLL) > 5.0f || C1I1.LIZIZ(motionEvent, ((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0).LJLZ) > 5.0f) {
                return false;
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0), null, null, new C2AJ((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0, null), 3);
            return false;
        }
        ((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0).LJLLLLLL = motionEvent.getX();
        ((KaraokeSearchSongListFragment) iDTListenerS110S0100000.l0).LJLZ = motionEvent.getY();
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        if (C31691Mf.LJIIIZ()) {
            int action = motionEvent.getAction() & 255;
            if (action != 1) {
                if (action == 2) {
                    ((LiveGoalBackgroundDialogFragment) iDTListenerS110S0100000.l0).xl(true);
                }
            } else {
                ((LiveGoalBackgroundDialogFragment) iDTListenerS110S0100000.l0).xl(false);
            }
            Object value = ((LiveGoalBackgroundDialogFragment) iDTListenerS110S0100000.l0).LJLJL.getValue();
            o.LJIIIIZZ(value, "<get-liveBroadcastGestureDetector>(...)");
            return ((AbstractC12520eO) value).LIZ(motionEvent, new C32811Qn(view.getWidth(), view.getHeight(), view.getTop(), view.getLeft()));
        }
        C16230kN c16230kN = (C16230kN) ((LiveGoalBackgroundDialogFragment) iDTListenerS110S0100000.l0).LJLJLJ.getValue();
        if (c16230kN == null) {
            return true;
        }
        c16230kN.LIZ(motionEvent);
        return true;
    }

    public static final boolean onTouch$7(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        float f;
        LiveEffectNewDialogFragmentOpt liveEffectNewDialogFragmentOpt = (LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0;
        if (liveEffectNewDialogFragmentOpt.LJLJJI == null) {
            liveEffectNewDialogFragmentOpt.LJLJJI = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = ((LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0).LJLJJI;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported() && !C1VL.LJ && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            VelocityTracker velocityTracker2 = ((LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0).LJLJJI;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = ((LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0).LJLJJI;
            if (velocityTracker3 != null) {
                f = velocityTracker3.getXVelocity();
            } else {
                f = 0.0f;
            }
            if (Math.abs(f) > 100.0f) {
                GestureDetector gestureDetector = ((LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0).LJLJJL;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
            } else {
                C1VL.LIZ.LJI(null);
            }
        } else {
            GestureDetector gestureDetector2 = ((LiveEffectNewDialogFragmentOpt) iDTListenerS110S0100000.l0).LJLJJL;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public static final boolean onTouch$8(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        float f;
        LiveEffectNewDialogFragment liveEffectNewDialogFragment = (LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0;
        if (liveEffectNewDialogFragment.LJLLILLLL == null) {
            liveEffectNewDialogFragment.LJLLILLLL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = ((LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0).LJLLILLLL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported() && !C1VL.LJ && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            VelocityTracker velocityTracker2 = ((LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0).LJLLILLLL;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            VelocityTracker velocityTracker3 = ((LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0).LJLLILLLL;
            if (velocityTracker3 != null) {
                f = velocityTracker3.getXVelocity();
            } else {
                f = 0.0f;
            }
            if (Math.abs(f) > 100.0f) {
                GestureDetector gestureDetector = ((LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0).LJLJLLL;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
            } else {
                C1VL.LIZ.LJI(null);
            }
        } else {
            GestureDetector gestureDetector2 = ((LiveEffectNewDialogFragment) iDTListenerS110S0100000.l0).LJLJLLL;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public static final boolean onTouch$9(IDTListenerS110S0100000 iDTListenerS110S0100000, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C37781e2) iDTListenerS110S0100000.l0).setStartX((int) motionEvent.getRawX());
            ((C37781e2) iDTListenerS110S0100000.l0).setCanHide(true);
        } else {
            if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 2) || !((C37781e2) iDTListenerS110S0100000.l0).getCanHide()) {
                return true;
            }
            ((C37781e2) iDTListenerS110S0100000.l0).setEndX((int) motionEvent.getRawX());
            int LJIIJJI = C87277YNd.LJIIJJI(8);
            int endX = ((C37781e2) iDTListenerS110S0100000.l0).getEndX() - ((C37781e2) iDTListenerS110S0100000.l0).getStartX();
            if (C15380j0.LJIIZILJ() ? endX > LJIIJJI : endX < (-LJIIJJI)) {
                ((C37781e2) iDTListenerS110S0100000.l0).LJJLJLI(true, true);
                C37781e2 c37781e2 = (C37781e2) iDTListenerS110S0100000.l0;
                c37781e2.LJLLI++;
                c37781e2.LJJLL(false);
            }
        }
        return true;
    }
}
