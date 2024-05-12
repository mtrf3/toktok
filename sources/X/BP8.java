package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.setting.GameLiveAutoRotateSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BP8 {
    public final Context LIZ;
    public long LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public WeakReference<InterfaceC28173B3x> LJIIIIZZ;
    public int LIZIZ = -1;
    public final AtomicInteger LIZLLL = new AtomicInteger(-1);
    public BPA LJI = BPA.IDLE;
    public final BP9 LJII = new BP9(this, C15380j0.LIZLLL());

    public BP8(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    public final void LIZ(int i) {
        int i2;
        boolean enableP2L;
        PowerManager powerManager;
        WeakReference<InterfaceC28173B3x> weakReference;
        InterfaceC28173B3x interfaceC28173B3x;
        ActivityC45651qj LIZIZ;
        boolean z;
        ActivityC45651qj LIZIZ2;
        if (Settings.System.getInt(C15380j0.LIZLLL().getContentResolver(), "accelerometer_rotation", 0) != 1 || this.LIZLLL.get() == i) {
            return;
        }
        GameLiveAutoRotateSetting gameLiveAutoRotateSetting = GameLiveAutoRotateSetting.INSTANCE;
        if (gameLiveAutoRotateSetting.disable()) {
            return;
        }
        Context context = this.LIZ;
        if (context != null && (LIZIZ2 = C29306Beo.LIZIZ(context)) != null) {
            i2 = LIZIZ2.getRequestedOrientation();
        } else {
            i2 = 1;
        }
        if (i2 != i) {
            if (C29306Beo.LJIIZILJ(i)) {
                if (i2 == 1) {
                    if (!gameLiveAutoRotateSetting.enableP2L()) {
                        return;
                    }
                    if (gameLiveAutoRotateSetting.enableP2L() && !gameLiveAutoRotateSetting.enableL2L() && !(!C29306Beo.LJIIZILJ(this.LIZLLL.get()))) {
                        return;
                    }
                } else {
                    enableP2L = gameLiveAutoRotateSetting.enableL2L();
                }
            } else if (i != 1 || !C29306Beo.LJIIZILJ(i2)) {
                return;
            } else {
                enableP2L = gameLiveAutoRotateSetting.enableP2L();
            }
            if (!enableP2L) {
                return;
            }
        }
        Context context2 = this.LIZ;
        if (context2 == null) {
            return;
        }
        B4K LIZJ = B4J.LIZJ(C16880lQ.LJLLJ(context2.getClass()));
        if ((LIZJ != null && LIZJ.dg()) || AnonymousClass149.LIZ.LIZJ()) {
            return;
        }
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if ((LIZ != null && ((ArrayList) LIZ.LJLJL).size() > 0) || ((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            return;
        }
        C31999Ch9.LIZJ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C31999Ch9.LIZ);
        linkedHashMap.putAll(C31999Ch9.LIZIZ);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            Boolean bool = null;
            if (it.hasNext()) {
                InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) ((Reference) ((Map.Entry) it.next()).getValue()).get();
                if (interfaceC60761Nsz != null) {
                    View LIZJ2 = interfaceC60761Nsz.LIZJ();
                    if (LIZJ2 != null) {
                        if (LIZJ2.getGlobalVisibleRect(new Rect()) && LIZJ2.getWidth() > 0 && LIZJ2.getHeight() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    if (C29306Beo.LJJIFFI(bool) && (interfaceC60761Nsz.getHybridContext() instanceof SparkContext)) {
                        C60737Nsb hybridContext = interfaceC60761Nsz.getHybridContext();
                        o.LJII(hybridContext, "null cannot be cast to non-null type com.bytedance.hybrid.spark.SparkContext");
                        if (((SparkContext) hybridContext).LJIIZILJ(-1) instanceof SparkPopupSchemaParam) {
                            return;
                        }
                    }
                }
            } else {
                Object LLILL = C16880lQ.LLILL(context2, "power");
                if (!(LLILL instanceof PowerManager) || (powerManager = (PowerManager) LLILL) == null || !powerManager.isInteractive()) {
                    return;
                }
                if ((Build.VERSION.SDK_INT < 24 || (LIZIZ = C29306Beo.LIZIZ(context2)) == null || !LIZIZ.isInPictureInPictureMode()) && (weakReference = this.LJIIIIZZ) != null && (interfaceC28173B3x = weakReference.get()) != null) {
                    interfaceC28173B3x.LIZ(i);
                    return;
                }
                return;
            }
        }
    }
}
