package X;

import android.view.View;
import com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.528, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass528 {
    public final AnonymousClass527 LIZ;
    public C52A LIZJ;
    public final java.util.Set<C52A> LIZIZ = new LinkedHashSet();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(AnonymousClass529.LJLIL);

    public AnonymousClass528(AnonymousClass525 anonymousClass525) {
        this.LIZ = anonymousClass525;
    }

    public final void LIZ(AnonymousClass523 funcItem, View view) {
        C52A c52a;
        o.LJIIIZ(funcItem, "funcItem");
        Iterator<C52A> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                c52a = it.next();
                if (c52a.LIZ(funcItem)) {
                    break;
                }
            } else {
                c52a = null;
                break;
            }
        }
        C52A c52a2 = c52a;
        if (c52a2 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("functionHandler for '");
            LIZ.append(funcItem.LIZJ);
            LIZ.append("' is not found");
            C132105Gk.LIZJ(X1D.LIZIZ(LIZ));
            return;
        }
        this.LIZJ = c52a2;
        if (!((ArrayList) funcItem.LIZ).isEmpty()) {
            if (!c52a2.LIZLLL(funcItem) || view == null) {
                ((FunctionBarViewModel) this.LIZLLL.getValue()).showChildList(funcItem, this.LIZ.LIZ(funcItem));
                return;
            } else {
                c52a2.LIZIZ(funcItem, view);
                return;
            }
        }
        c52a2.LIZIZ(funcItem, view);
    }
}
