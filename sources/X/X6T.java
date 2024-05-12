package X;

import Y.IDDListenerS396S0100000_15;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X6T {
    public static final ConcurrentHashMap<LifecycleOwner, CopyOnWriteArraySet<String>> LJIIJJI = new ConcurrentHashMap<>();
    public static final HashMap<LifecycleOwner, LifecycleEventObserver> LJIIL = new HashMap<>();
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public String LIZJ;
    public InterfaceC88472Yns<? super View, C76800UCe> LIZLLL;
    public final Rect LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public volatile XKQ LJIIIIZZ;
    public final IDDListenerS396S0100000_15 LJIIIZ;
    public final X6U LJIIJ;

    public final void LIZ() {
        boolean globalVisibleRect;
        this.LJFF = SystemClock.elapsedRealtime();
        if (!this.LIZ.isShown()) {
            globalVisibleRect = false;
        } else {
            globalVisibleRect = this.LIZ.getGlobalVisibleRect(this.LJ);
            if (globalVisibleRect && !this.LJI && !this.LJII) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet = LJIIJJI.get(this.LIZIZ);
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.add(this.LIZJ);
                }
                this.LIZLLL.invoke(this.LIZ);
            }
        }
        this.LJI = globalVisibleRect;
    }

    public X6T(View targetView, LifecycleOwner lifecycleOwner, String id, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(id, "id");
        this.LIZ = targetView;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = id;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = new Rect();
        this.LJFF = SystemClock.elapsedRealtime();
        this.LJIIIZ = new IDDListenerS396S0100000_15(this, 0);
        this.LJIIJ = new X6U(this);
    }
}
