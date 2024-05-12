package X;

import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GpD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42691GpD {
    public final WMA<?> LIZ;
    public EnumC42692GpE LIZIZ;
    public final Handler LIZJ;

    public final void LIZJ() {
        LIZ(new AqS157S0100000_7(this, 331));
    }

    public final void LIZLLL() {
        LIZ(new AqS157S0100000_7(this, 332));
    }

    public final void LJFF() {
        LIZ(new AqS157S0100000_7(this, 333));
    }

    public final void LJI() {
        LIZ(new AqS157S0100000_7(this, 334));
    }

    public final void LJII() {
        LIZ(new AqS157S0100000_7(this, 335));
    }

    public C42691GpD(WMA<?> lifecycleDispatcher) {
        o.LJIIIZ(lifecycleDispatcher, "lifecycleDispatcher");
        this.LIZ = lifecycleDispatcher;
        this.LIZIZ = EnumC42692GpE.NONE;
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
    }

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Throwable th) {
            this.LIZJ.post(new ARunnableS43S0100000_7(th, 56));
            throw th;
        }
    }

    public final void LJ(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        LIZ(new AqS154S0200000_7(this, outState, 51));
    }

    public final void LIZIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        LIZ(new AqS96S0300000_7(this, activity, bundle, 10));
    }
}
