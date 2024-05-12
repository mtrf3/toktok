package Y;

import X.AbstractC31462CWk;
import X.B4I;
import X.B4V;
import X.C28565BIz;
import X.C29889BoD;
import X.C31563Ca7;
import X.C31580CaO;
import X.C31634CbG;
import X.C31753CdB;
import X.C31811Ce7;
import X.C39223FaN;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC31146CKg;
import X.X1D;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS6S1100000_5 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Object obj;
        Field declaredField;
        B4V b4v = (B4V) this.l1;
        View view = b4v.LIZ;
        o.LJII(view, "null cannot be cast to non-null type android.view.SurfaceView");
        SurfaceView surfaceView = (SurfaceView) view;
        String str = this.s0;
        b4v.getClass();
        Rect rect = null;
        try {
            Class<? super Object> superclass = surfaceView.getClass().getSuperclass();
            if (superclass == null || (declaredField = superclass.getDeclaredField("mRTLastReportedPosition")) == null) {
                obj = null;
            } else {
                declaredField.setAccessible(true);
                obj = declaredField.get(surfaceView);
            }
            o.LJII(obj, "null cannot be cast to non-null type android.graphics.Rect");
            rect = (Rect) obj;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getSurfaceViewPos failed, Exception = ");
            LIZ.append(e);
            B4I.LIZ("AbnormalSurfaceView", X1D.LIZIZ(LIZ));
        }
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (rect != null && rect.centerX() < i) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("abnormal case, unselected SurfaceView still on screen, try set gone/visible.... detach reason=");
            LIZ2.append(str);
            B4I.LIZIZ("AbnormalSurfaceView", X1D.LIZIZ(LIZ2));
            surfaceView.setVisibility(8);
            surfaceView.setVisibility(0);
        }
    }

    public final void LIZ$1() {
        Iterator it = ((ArrayList) ((C31563Ca7) this.l1).LJLZ.getBadgeManager().LJ).iterator();
        while (it.hasNext()) {
            AbstractC31462CWk abstractC31462CWk = (AbstractC31462CWk) it.next();
            if (abstractC31462CWk instanceof C31634CbG) {
                C31634CbG c31634CbG = (C31634CbG) abstractC31462CWk;
                C31580CaO c31580CaO = c31634CbG.LJIJJ;
                if (c31580CaO != null) {
                    c31580CaO.LJJLIIIIJ = this.s0;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("change text animation: ");
                C31811Ce7.LJ(LIZ, this.s0, LIZ, "UserLevelPanel");
                C31580CaO c31580CaO2 = c31634CbG.LJIJJ;
                if (c31580CaO2 != null) {
                    c31580CaO2.LJJLI = 0;
                    c31580CaO2.LJJL = 255;
                    Object value = c31580CaO2.LJJLIIIJL.getValue();
                    o.LJIIIIZZ(value, "<get-oldTextHideAnimator>(...)");
                    ((ValueAnimator) value).start();
                    Object value2 = c31580CaO2.LJJLIIIJJIZ.getValue();
                    o.LJIIIIZZ(value2, "<get-newTextShowAnimator>(...)");
                    ((ValueAnimator) value2).start();
                }
            }
        }
    }

    public static final void run$0(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        boolean LIZ;
        try {
            ((C28565BIz) aRunnableS6S1100000_5.l1).LJFF(aRunnableS6S1100000_5.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        InterfaceC31146CKg interfaceC31146CKg;
        String str;
        C31753CdB c31753CdB = (C31753CdB) aRunnableS6S1100000_5.l1;
        String str2 = aRunnableS6S1100000_5.s0;
        c31753CdB.getClass();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        C31753CdB.LIZIZ = str2;
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null) {
            C29889BoD LIZIZ = C29889BoD.LIZIZ(context);
            LIZIZ.LJII(str2, "hardware_info_cpu_soc");
            LIZIZ.LIZ();
        }
        WeakReference<InterfaceC31146CKg> weakReference = c31753CdB.LIZ;
        if (weakReference == null || (interfaceC31146CKg = weakReference.get()) == null || (str = C31753CdB.LIZIZ) == null) {
            return;
        }
        interfaceC31146CKg.LIZ(str);
    }

    public static final void run$2(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        try {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((SubOnlyLiveSettingDialogNew) aRunnableS6S1100000_5.l1).getContext(), aRunnableS6S1100000_5.s0);
            InterfaceC30442Bx8.J3.LIZJ(Boolean.TRUE);
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$3(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        try {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((SubOnlyLiveSettingFragment) aRunnableS6S1100000_5.l1).getContext(), aRunnableS6S1100000_5.s0);
            InterfaceC30442Bx8.J3.LIZJ(Boolean.TRUE);
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$4(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        boolean LIZ;
        try {
            aRunnableS6S1100000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS6S1100000_5 aRunnableS6S1100000_5) {
        boolean LIZ;
        try {
            aRunnableS6S1100000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S1100000_5(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
