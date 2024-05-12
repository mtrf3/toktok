package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JGJ {
    public static void LIZ(Aweme aweme) {
        ViewGroup viewGroup;
        if (!C48873JGb.LIZ() || aweme == null) {
            return;
        }
        HashSet hashSet = (HashSet) JGI.LLIILII.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Aweme mAweme = ((JGI) next).getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            }
            if (o.LJ(str, aweme.getAid())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (view.isAttachedToWindow() && view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    int indexOfChild = viewGroup.indexOfChild(view);
                    C16880lQ.LLIFFJFJJ(indexOfChild, viewGroup);
                    viewGroup.addView(view, indexOfChild);
                }
            }
        }
    }
}
