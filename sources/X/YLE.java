package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessTouchEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YLE extends AbstractC32821Qo implements ScaleGestureDetector.OnScaleGestureListener {
    public final C16230kN LJLIL;
    public final ScaleGestureDetector LJLILLLLZI;
    public final YLF LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public float LJLJLLL = 1.0f;
    public EnumC46486IMg LJLL = EnumC46486IMg.BEF_GESTURE_TYPE_PAN;
    public boolean LJLLI;
    public MotionEvent LJLLILLLL;
    public final int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final DataChannel LJLLLLLL;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public static boolean LJI() {
        C0WF LIZJ = C30355Bvj.LIZJ();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZJ.LIZ(C0TY.LIZIZ));
        arrayList.addAll(LIZJ.LIZ("livebackground"));
        arrayList.addAll(LIZJ.LIZ("livegame"));
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<String> list = ((LiveEffect) it.next()).types;
                if (list != null && list.size() > 0) {
                    return list.contains("TouchGes");
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return this.LJLLJ;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.LJLL = EnumC46486IMg.BEF_GESTURE_TYPE_SCALE;
        MotionEvent motionEvent = this.LJLLILLLL;
        if (motionEvent != null) {
            LJII(201, LJFF(motionEvent, true));
            this.LJLLILLLL = null;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() / this.LJLJLLL;
        YLH ylh = new YLH();
        ylh.LJI = scaleFactor;
        ylh.LJFF = 3.0f;
        LJII(205, ylh);
        this.LJLJLLL = scaleGestureDetector.getScaleFactor();
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.LJLJLLL = 1.0f;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLL = EnumC46486IMg.BEF_GESTURE_TYPE_TAP;
        MotionEvent motionEvent2 = this.LJLLILLLL;
        if (motionEvent2 != null) {
            LJII(201, LJFF(motionEvent2, true));
            this.LJLLILLLL = null;
        }
        LJII(206, LJFF(motionEvent, false));
        return false;
    }

    public static void LJII(int i, YLH ylh) {
        if (ylh != null) {
            C73943T0h.LIZ().LIZIZ(new YLM(i, ylh));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyTouchEvent event is null, action: ");
        LIZ.append(i);
        C0NB.LJ("EffectGestureDetector", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        if (!LJI() || this.LJLLLLLL.kv0(LiveCenterStatusChannel.class) != EnumC30738C4o.DISMISS || this.LJLLLLLL.kv0(LiveExtendedScreenStatus.class) != EnumC31158CKs.HIDE) {
            return false;
        }
        if (this.LJLLLLLL.kv0(UserIsAnchorChannel.class) != null && ((Boolean) this.LJLLLLLL.kv0(UserIsAnchorChannel.class)).booleanValue() && this.LJLLLL) {
            if (this.LJLLL) {
                return true;
            }
            if (event.getAction() == 0) {
                this.LJLLLLLL.pv0(DrawGuessTouchEvent.class);
            }
        }
        this.LJLJJL = (int) c32811Qn.LJLIL;
        this.LJLJJLL = (int) c32811Qn.LJLILLLLZI;
        this.LJLJL = (int) c32811Qn.LJLJI;
        this.LJLJLJ = (int) c32811Qn.LJLJJI;
        YLF ylf = this.LJLJI;
        ylf.getClass();
        o.LJIIIZ(event, "event");
        int action = event.getAction() & 255;
        if (!ylf.LJFF) {
            if (action != 2) {
                if (action == 5) {
                    ylf.LIZIZ();
                    ylf.LIZIZ = MotionEvent.obtain(event);
                    ylf.LIZJ(event);
                    boolean LIZ = ylf.LIZ(event);
                    ylf.LJIIL = LIZ;
                    if (!LIZ) {
                        ylf.LJIIJJI.getClass();
                        ylf.LJFF = true;
                    }
                }
            } else if (ylf.LJIIL) {
                boolean LIZ2 = ylf.LIZ(event);
                ylf.LJIIL = LIZ2;
                if (!LIZ2) {
                    ylf.LJIIJJI.getClass();
                    ylf.LJFF = true;
                }
            }
        } else if (action != 2) {
            if (action != 3) {
                if (action == 6) {
                    ylf.LIZJ(event);
                    if (!ylf.LJIIL) {
                        YLL yll = (YLL) ylf.LJIIJJI;
                        yll.getClass();
                        YLH ylh = new YLH();
                        ylh.LJII = (float) (Math.atan2(ylf.LJIIIIZZ, ylf.LJII) - Math.atan2(ylf.LJIIJ, ylf.LJIIIZ));
                        ylh.LJFF = 6.0f;
                        yll.LIZ.getClass();
                        LJII(208, ylh);
                    }
                    ylf.LIZIZ();
                }
            } else {
                if (!ylf.LJIIL) {
                    YLL yll2 = (YLL) ylf.LJIIJJI;
                    yll2.getClass();
                    YLH ylh2 = new YLH();
                    ylh2.LJII = (float) (Math.atan2(ylf.LJIIIIZZ, ylf.LJII) - Math.atan2(ylf.LJIIJ, ylf.LJIIIZ));
                    ylh2.LJFF = 6.0f;
                    yll2.LIZ.getClass();
                    LJII(208, ylh2);
                }
                ylf.LIZIZ();
            }
        } else {
            ylf.LIZJ(event);
            if (ylf.LIZLLL / ylf.LJ > 0.67f) {
                YLL yll3 = (YLL) ylf.LJIIJJI;
                yll3.getClass();
                YLH ylh3 = new YLH();
                ylh3.LJII = (float) (Math.atan2(ylf.LJIIIIZZ, ylf.LJII) - Math.atan2(ylf.LJIIJ, ylf.LJIIIZ));
                ylh3.LJFF = 6.0f;
                yll3.LIZ.getClass();
                LJII(208, ylh3);
                MotionEvent motionEvent = ylf.LIZIZ;
                if (motionEvent != null) {
                    motionEvent.recycle();
                    ylf.LIZIZ = MotionEvent.obtain(event);
                }
            }
        }
        if ((event.getAction() & 255) == 2) {
            this.LJLLLLLL.qv0(MoveLiveGoalEffectEvent.class, Boolean.TRUE);
            for (int i = 0; i < event.getPointerCount(); i++) {
                C73943T0h.LIZ().LIZIZ(new YLM(207, LJ(event.getPointerId(i), event)));
            }
        } else {
            C73943T0h.LIZ().LIZIZ(new YLM(207, LJ(event.getPointerId(event.getActionIndex()), event)));
        }
        C0NB.LJ("AmazingEngineTouch", "notifyTouchEvent: ACTION_AMAZING_TOUCH");
        int action2 = event.getAction() & 255;
        this.LJLILLLLZI.onTouchEvent(event);
        if (action2 == 0) {
            this.LJLJJI = false;
        }
        if (event.getPointerCount() > 1) {
            this.LJLJJI = true;
        }
        if (!this.LJLJJI) {
            this.LJLIL.LIZ(event);
        }
        if (action2 != 0) {
            if (action2 == 1) {
                this.LJLLI = false;
                LJII(202, LJFF(event, true));
            }
        } else {
            this.LJLLI = true;
            this.LJLLILLLL = event;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r4 != 6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.YLH LJ(long r7, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YLE.LJ(long, android.view.MotionEvent):X.YLH");
    }

    public final YLH LJFF(MotionEvent motionEvent, boolean z) {
        float x;
        float y;
        EnumC46486IMg enumC46486IMg;
        YLH ylh = new YLH();
        if (Math.abs(this.LJLJLJ) > 10) {
            x = motionEvent.getX() - this.LJLJLJ;
        } else {
            x = motionEvent.getX();
        }
        ylh.LIZIZ = x / this.LJLJJL;
        if (Math.abs(this.LJLJL) > 10) {
            y = motionEvent.getY() - this.LJLJL;
        } else {
            y = motionEvent.getY();
        }
        float f = y / this.LJLJJLL;
        ylh.LIZJ = f;
        float f2 = ylh.LIZIZ;
        if (f2 > 0.0f) {
            if (f2 >= 1.0f) {
                f2 = 1.0f;
            }
        } else {
            f2 = 0.0f;
        }
        ylh.LIZIZ = f2;
        if (f > 0.0f) {
            if (f >= 1.0f) {
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        ylh.LIZJ = f;
        if (z && (enumC46486IMg = this.LJLL) != null) {
            ylh.LIZ = enumC46486IMg.ordinal();
        }
        return ylh;
    }

    public YLE(Context context, DataChannel dataChannel, int i) {
        this.LJLLJ = i;
        this.LJLLLLLL = dataChannel;
        this.LJLJJL = C16880lQ.LLLLL(context).getResources().getDisplayMetrics().widthPixels;
        this.LJLJJLL = C16880lQ.LLLLL(context).getResources().getDisplayMetrics().heightPixels;
        C16230kN c16230kN = new C16230kN(context, this);
        this.LJLIL = c16230kN;
        c16230kN.LIZ.LIZ.setIsLongpressEnabled(false);
        c16230kN.LIZIZ(this);
        this.LJLILLLLZI = new ScaleGestureDetector(context, this);
        this.LJLJI = new YLF(context, new YLL(this));
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LJLLI) {
            this.LJLLI = false;
        }
        this.LJLL = EnumC46486IMg.BEF_GESTURE_TYPE_PAN;
        MotionEvent motionEvent3 = this.LJLLILLLL;
        if (motionEvent3 != null) {
            LJII(201, LJFF(motionEvent3, true));
            this.LJLLILLLL = null;
        }
        YLH LJFF = LJFF(motionEvent2, false);
        LJFF.LIZLLL = f / this.LJLJJL;
        LJFF.LJ = f2 / this.LJLJJLL;
        LJFF.LJFF = 1.0f;
        LJII(203, LJFF);
        return true;
    }
}
