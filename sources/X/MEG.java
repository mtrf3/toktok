package X;

import Y.ARunnableS6S0310000_9;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MEG {
    public final ActivityC45651qj LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final Stack<View> LIZLLL;
    public final java.util.Map<String, MEJ> LJ;
    public final java.util.Map<MEJ, View> LJFF;
    public final SafeHandler LJI;
    public final long LJII;

    public abstract int LIZ();

    public abstract Aweme LIZIZ();

    public abstract String LIZJ();

    public abstract void LJ(boolean z);

    public final void LJFF() {
        boolean z;
        Stack<View> stack = this.LIZLLL;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            Iterator<T> it = stack.iterator();
            while (it.hasNext()) {
                z = true;
                if (!(it.next() instanceof C54066LJu)) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            this.LIZIZ.setVisibility(8);
            this.LIZJ.setVisibility(0);
        } else if (this.LIZLLL.empty()) {
            this.LIZIZ.setVisibility(0);
            this.LIZJ.setVisibility(8);
        } else {
            this.LIZIZ.setVisibility(0);
            this.LIZJ.setVisibility(0);
        }
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        Boolean bool;
        o.LJIIIZ(event, "event");
        if (event.LJLZ != System.identityHashCode(this.LIZ)) {
            return;
        }
        int i = event.LJLIL;
        if (i != 72) {
            if (i != 73) {
                if (i != 76 || !C8OB.LIZ()) {
                    return;
                }
                LIZLLL(event, MEH.EDGE_SPEEDUP);
                return;
            }
            Object obj = event.LJLILLLLZI;
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                if (bool.booleanValue()) {
                    this.LIZIZ.setVisibility(0);
                    this.LIZJ.setVisibility(8);
                    return;
                } else {
                    this.LIZIZ.setVisibility(8);
                    this.LIZJ.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (!AnonymousClass843.LIZ()) {
            return;
        }
        LIZLLL(event, MEH.DESC_BAR);
    }

    public final void LIZLLL(C50420Jqa c50420Jqa, MEH meh) {
        MEJ c86926Y9q;
        String typeName = meh.getTypeName();
        boolean z = true;
        if (((HashMap) this.LJ).containsKey(typeName)) {
            c86926Y9q = (MEJ) ((HashMap) this.LJ).get(typeName);
            if (c86926Y9q == null) {
                return;
            }
        } else {
            int i = MEI.LIZ[meh.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                } else {
                    c86926Y9q = new ME2();
                }
            } else {
                c86926Y9q = new C86926Y9q(this.LIZ);
            }
            java.util.Map<String, MEJ> map = this.LJ;
            View LIZJ = c86926Y9q.LIZJ(this.LIZ, this.LIZJ);
            if (LIZJ == null) {
                LIZJ = new C54066LJu(this.LIZ);
            }
            ((HashMap) this.LJFF).put(c86926Y9q, LIZJ);
            ((HashMap) map).put(typeName, c86926Y9q);
        }
        ME4 LIZIZ = c86926Y9q.LIZIZ(c50420Jqa);
        if (LIZIZ == ME4.NONE) {
            return;
        }
        if (LIZIZ != ME4.IN) {
            z = false;
        }
        this.LJI.post(new ARunnableS6S0310000_9(this, c50420Jqa, c86926Y9q, z, 2));
    }

    public MEG(ActivityC45651qj activity, View originalBottomView, ViewGroup viewGroup) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalBottomView, "originalBottomView");
        this.LIZ = activity;
        this.LIZIZ = originalBottomView;
        this.LIZJ = viewGroup;
        this.LIZLLL = new Stack<>();
        this.LJ = new HashMap();
        this.LJFF = new HashMap();
        this.LJI = new SafeHandler(activity);
        this.LJII = 200L;
        C42625Go9.LIZIZ(this);
        C16880lQ.LJIIL(viewGroup, ViewOnClickListenerC54065LJt.LJLIL);
    }
}
