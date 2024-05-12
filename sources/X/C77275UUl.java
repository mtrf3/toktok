package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.android.live.design.app.LiveDialog;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.UUl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77275UUl implements InterfaceC73592SuS, C0K7 {
    public static final C77275UUl LJLIL = new C77275UUl();
    public static final C77275UUl LJLILLLLZI = new C77275UUl();

    public static C84657XKj LIZ() {
        return new C84657XKj(null);
    }

    public static final HashSet LIZLLL(Object... objArr) {
        HashSet hashSet = new HashSet(C51029K0z.LJJIIZ(objArr.length));
        ORY.LJJLIIIJLLLLLLLZ(hashSet, objArr);
        return hashSet;
    }

    public static final java.util.Set LJ(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(objArr.length));
        ORY.LJJLIIIJLLLLLLLZ(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static final java.util.Set LJFF(java.util.Set set) {
        int size = set.size();
        if (size != 0) {
            if (size != 1) {
                return set;
            }
            return LJII(set.iterator().next());
        }
        return OQY.INSTANCE;
    }

    public static final java.util.Set LJII(Object obj) {
        java.util.Set singleton = Collections.singleton(obj);
        o.LJIIIIZZ(singleton, "singleton(element)");
        return singleton;
    }

    public static final java.util.Set LJIIIIZZ(Object... elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.length > 0) {
            return ORY.LJLIL(elements);
        }
        return OQY.INSTANCE;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        BEA.LIZ.getClass();
        BE9.LIZJ(BEA.LJ() ? 1 : 0, "got_it");
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        if (event.LIZ != null) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(XKM xkm, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = C62848OlY.LIZ("Channel was consumed, consumer had failed", th);
        }
        xkm.LIZIZ(cancellationException);
    }

    public static final void LJI(RectF rectF, int i, int i2, int i3, int i4) {
        o.LJIIIZ(rectF, "<this>");
        rectF.set(i, i2, i3, i4);
    }

    public static final void LIZJ(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        o.LJIIIZ(canvas, "<this>");
        o.LJIIIZ(paint, "paint");
        canvas.drawRect(i, i2, i3, i4, paint);
    }
}
