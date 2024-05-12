package X;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.U8q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76708U8q extends AbstractC76704U8m {
    public final Context LJI;
    public final U92 LJII;
    public final HashMap<Integer, C76711U8t> LJIIIIZZ;

    public final C76711U8t LJI(int i) {
        C76711U8t c76711U8t = this.LJIIIIZZ.get(Integer.valueOf(i));
        if (c76711U8t == null) {
            C76711U8t LIZIZ = LIZIZ(EnumC75419Tip.StateInit);
            this.LJIIIIZZ.put(Integer.valueOf(i), LIZIZ);
            return LIZIZ;
        }
        return c76711U8t;
    }

    @Override // X.AbstractC76704U8m
    public final boolean LJFF(C76701U8j c76701U8j, FrameLayout frameLayout) {
        boolean z;
        Object obj;
        C76701U8j c76701U8j2;
        String str;
        Long l;
        Long l2;
        boolean LJ;
        String str2;
        Iterator<C76711U8t> it = this.LJFF.iterator();
        while (true) {
            z = false;
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            C76711U8t next = it.next();
            C76711U8t c76711U8t = next;
            if (c76701U8j.LIZJ != null && (str2 = c76711U8t.LJLIL.LIZJ) != null) {
                String charSequence = s.LJZI(str2).toString();
                String str3 = c76701U8j.LIZJ;
                if (str3 != null) {
                    obj = s.LJZI(str3).toString();
                }
                LJ = o.LJ(charSequence, obj);
            } else {
                Long l3 = c76701U8j.LIZIZ;
                if (l3 != null && (l2 = c76711U8t.LJLIL.LIZIZ) != null) {
                    LJ = o.LJ(l2, l3);
                }
            }
            if (LJ) {
                obj = next;
                break;
            }
        }
        C76711U8t c76711U8t2 = (C76711U8t) obj;
        if (c76711U8t2 != null && (c76701U8j2 = c76711U8t2.LJLIL) != null) {
            EnumC75419Tip enumC75419Tip = c76701U8j2.LIZ;
            EnumC75419Tip enumC75419Tip2 = c76701U8j.LIZ;
            if (enumC75419Tip != null && (enumC75419Tip2 == null || !((HashSet) C76701U8j.LJIIIIZZ.getValue()).contains(new OSZ(enumC75419Tip, enumC75419Tip2)))) {
                return false;
            }
            if (c76701U8j2.LIZIZ == null && (l = c76701U8j.LIZIZ) != null) {
                c76701U8j2.LIZIZ = l;
            }
            if (c76701U8j2.LIZJ == null && (str = c76701U8j.LIZJ) != null) {
                c76701U8j2.LIZJ = str;
            }
            EnumC75419Tip enumC75419Tip3 = c76701U8j2.LIZ;
            EnumC75419Tip enumC75419Tip4 = c76701U8j.LIZ;
            if (enumC75419Tip3 != enumC75419Tip4 && enumC75419Tip4 != null) {
                if (enumC75419Tip3 != null) {
                    c76701U8j2.LJFF = enumC75419Tip3;
                }
                c76701U8j2.LIZ = enumC75419Tip4;
                z = true;
            }
            if (!o.LJ(c76701U8j.LIZLLL, c76701U8j2.LIZLLL)) {
                SurfaceView surfaceView = c76701U8j.LIZLLL;
                if (surfaceView == null) {
                    c76701U8j2.LJII = true;
                } else {
                    c76701U8j2.LIZLLL = surfaceView;
                }
                z = true;
            }
            if (!o.LJ(c76701U8j.LJ, c76701U8j2.LJ)) {
                WeakReference<ILayerControl.ILayer> weakReference = c76701U8j.LJ;
                if (weakReference == null) {
                    c76701U8j2.LJII = true;
                } else {
                    c76701U8j2.LJ = weakReference;
                }
                return true;
            }
            return z;
        }
        CopyOnWriteArrayList<C76711U8t> copyOnWriteArrayList = this.LJFF;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(this.LJI);
        }
        return copyOnWriteArrayList.add(new C76711U8t(c76701U8j, frameLayout));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76708U8q(Context context, U92 positionManager, U9E mappingHelper) {
        super(context, positionManager, mappingHelper);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(positionManager, "positionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LJI = context;
        this.LJII = positionManager;
        this.LJIIIIZZ = new HashMap<>();
    }
}
