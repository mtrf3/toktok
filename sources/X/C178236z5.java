package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomDefaultCommentAssem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178236z5 {
    public final ViewGroup LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C178246z6.LJLIL);
    public String LIZJ = "";

    public final HashMap<String, AbstractBottomPriorityComponent> LIZLLL() {
        return (HashMap) this.LIZIZ.getValue();
    }

    public final void LJ() {
        for (String str : C177226xS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getProtocolForCurrentAweme: ");
            LIZ.append(str);
            C71Y.LIZ("BottomBarProtocolManager", X1D.LIZIZ(LIZ));
            if (LIZ(str)) {
                return;
            }
        }
        throw new IllegalStateException("No valid protocol found!");
    }

    public final AbstractBottomPriorityComponent LIZIZ() {
        return LIZLLL().get(this.LIZJ);
    }

    public final BottomDefaultCommentAssem LIZJ() {
        AbstractBottomPriorityComponent abstractBottomPriorityComponent = LIZLLL().get("default_comment");
        if (abstractBottomPriorityComponent == null || (abstractBottomPriorityComponent instanceof BottomDefaultCommentAssem)) {
            return (BottomDefaultCommentAssem) abstractBottomPriorityComponent;
        }
        return null;
    }

    public C178236z5(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public final boolean LIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractBottomPriorityComponent abstractBottomPriorityComponent = LIZLLL().get(tag);
        if (abstractBottomPriorityComponent != null && abstractBottomPriorityComponent.LJJLIIJ()) {
            String str = this.LIZJ;
            if (!o.LJ(str, tag)) {
                ViewGroup viewGroup = this.LIZ;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                ViewGroup viewGroup2 = this.LIZ;
                if (viewGroup2 != null) {
                    viewGroup2.addView(abstractBottomPriorityComponent.getContainerView());
                }
                this.LIZJ = tag;
            }
            AbstractBottomPriorityComponent abstractBottomPriorityComponent2 = LIZLLL().get(str);
            if (abstractBottomPriorityComponent2 != null) {
                abstractBottomPriorityComponent2.F3();
            }
            abstractBottomPriorityComponent.C3(str);
            return true;
        }
        return false;
    }
}
