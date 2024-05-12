package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8l */
/* loaded from: classes14.dex */
public class C76703U8l {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final AtomicBoolean LIZ;
    public final boolean LIZIZ;
    public final Context LIZJ;
    public final U92 LIZLLL;
    public final U9E LJ;
    public int LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public Layout LJIIIIZZ;

    public void LIZ() {
        C32014ChO.LIZJ(LJIIJ(122), "clear", null);
        LIZLLL().LIZ();
        LJ().LIZ();
    }

    public final C76706U8o LIZLLL() {
        return (C76706U8o) this.LJI.getValue();
    }

    public final C76705U8n LJ() {
        return (C76705U8n) this.LJII.getValue();
    }

    public final java.util.Set<String> LJII() {
        HashSet hashSet = new HashSet();
        Iterator<C76711U8t> it = LIZIZ().iterator();
        while (it.hasNext()) {
            String str = it.next().LJLIL.LIZJ;
            if (str != null) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final boolean LJIIIZ() {
        if (this.LIZIZ || this.LIZ.get()) {
            return true;
        }
        return false;
    }

    public List<C76711U8t> LIZIZ() {
        AbstractC76704U8m LJ;
        if (LJIIIZ()) {
            LJ = LIZLLL();
        } else {
            LJ = LJ();
        }
        return LJ.LJFF;
    }

    public String LJIIIIZZ() {
        if (LJIIIZ()) {
            return LIZLLL().LJ;
        }
        return LJ().LJ;
    }

    public static String LJIIJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_MicDataCenter_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_MicDataCenter_", i, LIZ2);
    }

    public Layout LIZJ(boolean z) {
        if (LJIIIZ()) {
            Layout layout = LIZLLL().LIZLLL;
            if (layout == null) {
                if (z) {
                    return LJ().LIZLLL;
                }
                return null;
            }
            return layout;
        }
        return LJ().LIZLLL;
    }

    public C76711U8t LJFF(int i) {
        if (LJIIIZ()) {
            C76711U8t LJI = LIZLLL().LJI(i);
            String LJIIJ = LJIIJ(113);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getMicWindow = ");
            LIZ.append(i);
            LIZ.append(" - ");
            LIZ.append(LJI);
            C32014ChO.LJFF(LJIIJ, X1D.LIZIZ(LIZ));
            return LJI;
        }
        return LJ().LJI(i);
    }

    public C76711U8t LJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C76711U8t c76711U8t = null;
        if (LJIIIZ()) {
            C76706U8o LIZLLL = LIZLLL();
            LIZLLL.getClass();
            Iterator<C76711U8t> it = LIZLLL.LJFF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C76711U8t next = it.next();
                if (o.LJ(linkMicId, next.LJLIL.LIZJ)) {
                    c76711U8t = next;
                    break;
                }
            }
            return c76711U8t;
        }
        C76705U8n LJ = LJ();
        LJ.getClass();
        Iterator<C76711U8t> it2 = LJ.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C76711U8t next2 = it2.next();
            if (o.LJ(linkMicId, next2.LJLIL.LIZJ)) {
                c76711U8t = next2;
                break;
            }
        }
        return c76711U8t;
    }

    public void LJIIJJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        String LJIIJ = LJIIJ(88);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeMicDataByLinkMicId linkMicId = ");
        LIZ.append(linkMicId);
        C32014ChO.LJFF(LJIIJ, X1D.LIZIZ(LIZ));
        LIZLLL().LIZLLL(linkMicId);
        LJ().LIZLLL(linkMicId);
    }

    public final int LJIIL(int i) {
        return this.LIZLLL.LJIILIIL(i);
    }

    public void LJIILIIL(Layout layout) {
        o.LJIIIZ(layout, "layout");
        String LJIIJ = LJIIJ(66);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLayout layout=");
        LIZ.append(layout);
        C32014ChO.LJFF(LJIIJ, X1D.LIZIZ(LIZ));
        this.LJIIIIZZ = layout;
        if (LJIIIZ()) {
            LIZLLL().LJ(layout);
        } else {
            LJ().LJ(layout);
        }
    }

    public static /* synthetic */ boolean LJIILL(C76703U8l c76703U8l, C76701U8j c76701U8j) {
        return c76703U8l.LJIILJJIL(c76701U8j, null);
    }

    public boolean LJIILJJIL(C76701U8j c76701U8j, FrameLayout frameLayout) {
        String LJIIJ = LJIIJ(49);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateOrInsertMicData linked = ");
        LIZ.append(LJIIIZ());
        LIZ.append(" data = ");
        LIZ.append(c76701U8j);
        C32014ChO.LJFF(LJIIJ, X1D.LIZIZ(LIZ));
        if (LJIIIZ()) {
            return LIZLLL().LJFF(c76701U8j, frameLayout);
        }
        return LJ().LJFF(c76701U8j, frameLayout);
    }

    public C76703U8l(AtomicBoolean isLinked, boolean z, Context context, U92 positionManager, U9E mappingHelper) {
        o.LJIIIZ(isLinked, "isLinked");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(positionManager, "positionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LIZ = isLinked;
        this.LIZIZ = z;
        this.LIZJ = context;
        this.LIZLLL = positionManager;
        this.LJ = mappingHelper;
        this.LJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 523));
        this.LJII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 524));
    }
}
