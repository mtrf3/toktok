package X;

import Y.AfS59S0100000_7;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gws, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43166Gws extends AbstractC41873Gc1 {
    public final boolean LJ;
    public final HashMap<WeakReference<Activity>, Boolean> LJFF;
    public C73411SrX LJI;

    public C43166Gws() {
        super("DefaultWavePublisher", 2);
        this.LJ = e1.LIZ(31744, "keep_screen_awake_until_post_done", true, false);
        this.LJFF = new HashMap<>();
    }

    public final void LJI(Activity activity) {
        boolean z;
        WindowManager.LayoutParams attributes;
        if (this.LJ) {
            HashMap<WeakReference<Activity>, Boolean> hashMap = this.LJFF;
            boolean z2 = true;
            if (!hashMap.isEmpty()) {
                Iterator<Map.Entry<WeakReference<Activity>, Boolean>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next().getKey().get(), activity)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                HashMap<WeakReference<Activity>, Boolean> hashMap2 = this.LJFF;
                WeakReference<Activity> weakReference = new WeakReference<>(activity);
                Window window = activity.getWindow();
                if (window == null || (attributes = window.getAttributes()) == null || (attributes.flags & 128) <= 0) {
                    z2 = false;
                }
                hashMap2.put(weakReference, Boolean.valueOf(z2));
            }
            try {
                Window window2 = activity.getWindow();
                if (window2 != null) {
                    window2.addFlags(128);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            C5OG.LIZJ(new AqS154S0200000_7(this, LJIIIIZZ, 151));
        }
        this.LJI = (C73411SrX) C84763XOl.LJ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS59S0100000_7(this, 92));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C5OG.LIZJ(new AqS154S0100000_4(this, 1278));
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C5OG.LIZJ(new AqS154S0100000_4(this, 1278));
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        C73411SrX c73411SrX = this.LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C5OG.LIZJ(new AqS154S0100000_4(this, 1278));
    }
}
