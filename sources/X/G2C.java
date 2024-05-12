package X;

import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2C extends G46 {
    public volatile boolean LIZJ;

    public final int LJIILL() {
        Intent intent;
        InterfaceC28616BKy interfaceC28616BKy;
        ActivityC86117Xqz activityC86117Xqz;
        WeakReference<ActivityC86117Xqz> weakReference = this.LIZIZ;
        InterfaceC28616BKy interfaceC28616BKy2 = null;
        if (weakReference != null && (activityC86117Xqz = weakReference.get()) != null) {
            intent = activityC86117Xqz.getIntent();
        } else {
            intent = null;
        }
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC28616BKy = it.next();
                if (interfaceC28616BKy instanceof BLD) {
                    break;
                }
            } else {
                interfaceC28616BKy = null;
                break;
            }
        }
        if (interfaceC28616BKy instanceof BLD) {
            interfaceC28616BKy2 = interfaceC28616BKy;
        }
        BLD bld = (BLD) interfaceC28616BKy2;
        if (bld != null) {
            return bld.LJLIL;
        }
        if (intent != null) {
            return intent.getIntExtra("activity_translation_type", -1);
        }
        return -1;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void finish() {
        ActivityC86117Xqz activityC86117Xqz;
        WeakReference<ActivityC86117Xqz> weakReference = this.LIZIZ;
        if (weakReference != null && (activityC86117Xqz = weakReference.get()) != null) {
            C201037ul.LIZ(LJIILL(), activityC86117Xqz, false);
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityResumed(ActivityC86117Xqz activity) {
        ActivityC86117Xqz activityC86117Xqz;
        o.LJIIIZ(activity, "activity");
        if (!this.LIZJ) {
            WeakReference<ActivityC86117Xqz> weakReference = this.LIZIZ;
            if (weakReference != null && (activityC86117Xqz = weakReference.get()) != null) {
                C201037ul.LIZ(LJIILL(), activityC86117Xqz, true);
            }
            this.LIZJ = true;
        }
    }
}
