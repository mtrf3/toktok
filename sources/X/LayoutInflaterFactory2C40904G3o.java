package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G3o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class LayoutInflaterFactory2C40904G3o implements LayoutInflater.Factory2 {
    public final AnonymousClass027 LJLIL;

    public LayoutInflaterFactory2C40904G3o(AnonymousClass027 anonymousClass027) {
        this.LJLIL = anonymousClass027;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String name, Context context, AttributeSet attrs) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        return onCreateView(null, name, context, attrs);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String name, Context context, AttributeSet attrs) {
        View LJI;
        boolean z;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        AnonymousClass027 anonymousClass027 = this.LJLIL;
        if (anonymousClass027 == null) {
            LJI = null;
        } else {
            LJI = anonymousClass027.LJI(view, name, context, attrs);
        }
        if (LJI == null) {
            List<String> list = C40905G3p.LIZ().LJIIIZ;
            if (list == null || !list.contains(name)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    LJI = (View) Class.forName(name).getConstructor(Context.class, AttributeSet.class).newInstance(context, attrs);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            LJI = null;
        }
        if (LJI != null) {
            C64286PKw c64286PKw = C40905G3p.LJ;
            if (c64286PKw != null) {
                Iterator it = ((ArrayList) c64286PKw.LIZ).iterator();
                while (it.hasNext()) {
                    OSZ osz = (OSZ) it.next();
                    if (((Class) osz.getFirst()).isInstance(LJI)) {
                        ((G42) osz.getSecond()).LIZ(LJI, attrs);
                    }
                }
            } else {
                o.LJIJI("viewTransformerManager");
                throw null;
            }
        }
        return LJI;
    }
}
