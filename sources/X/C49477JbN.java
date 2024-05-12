package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JbN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49477JbN implements InterfaceC49479JbP {
    public static final int[] LIZIZ = new int[2];
    public final boolean LIZ = C90193gN.LIZIZ(EF7.LIZIZ());

    @Override // X.InterfaceC49479JbP
    public final void LIZ(RecyclerView recyclerView, Collection collection) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC49479JbP
    public InterfaceC49482JbS LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC49482JbS> collection) {
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        InterfaceC49482JbS interfaceC49482JbS = null;
        if (collection.isEmpty() || i != 0) {
            return null;
        }
        int i3 = -1;
        if (this.LIZ) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (!recyclerView.canScrollHorizontally(i2)) {
            Iterator<? extends InterfaceC49482JbS> it = collection.iterator();
            if (it.hasNext()) {
                interfaceC49482JbS = it.next();
                if (it.hasNext()) {
                    int position = interfaceC49482JbS.getPosition();
                    do {
                        InterfaceC49482JbS next = it.next();
                        int position2 = next.getPosition();
                        if (position > position2) {
                            interfaceC49482JbS = next;
                            position = position2;
                        }
                    } while (it.hasNext());
                }
            }
            return interfaceC49482JbS;
        }
        if (!this.LIZ) {
            i3 = 1;
        }
        if (!recyclerView.canScrollHorizontally(i3)) {
            Iterator<? extends InterfaceC49482JbS> it2 = collection.iterator();
            if (it2.hasNext()) {
                interfaceC49482JbS = it2.next();
                if (it2.hasNext()) {
                    int position3 = interfaceC49482JbS.getPosition();
                    do {
                        InterfaceC49482JbS next2 = it2.next();
                        int position4 = next2.getPosition();
                        if (position3 < position4) {
                            interfaceC49482JbS = next2;
                            position3 = position4;
                        }
                    } while (it2.hasNext());
                }
            }
            return interfaceC49482JbS;
        }
        int[] iArr = LIZIZ;
        recyclerView.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        recyclerView.getLocationOnScreen(iArr);
        int width = ((recyclerView.getWidth() + iArr[0]) + i4) / 2;
        Iterator<? extends InterfaceC49482JbS> it3 = collection.iterator();
        if (it3.hasNext()) {
            interfaceC49482JbS = it3.next();
            if (it3.hasNext()) {
                InterfaceC49482JbS interfaceC49482JbS2 = interfaceC49482JbS;
                interfaceC49482JbS2.getView().getLocationOnScreen(iArr);
                int abs = Math.abs(iArr[0] - width);
                View view = interfaceC49482JbS2.getView();
                view.getLocationOnScreen(iArr);
                int abs2 = Math.abs((view.getWidth() + iArr[0]) - width) + abs;
                do {
                    InterfaceC49482JbS next3 = it3.next();
                    InterfaceC49482JbS interfaceC49482JbS3 = next3;
                    interfaceC49482JbS3.getView().getLocationOnScreen(iArr);
                    int abs3 = Math.abs(iArr[0] - width);
                    View view2 = interfaceC49482JbS3.getView();
                    view2.getLocationOnScreen(iArr);
                    int abs4 = Math.abs((view2.getWidth() + iArr[0]) - width) + abs3;
                    if (abs2 > abs4) {
                        interfaceC49482JbS = next3;
                        abs2 = abs4;
                    }
                } while (it3.hasNext());
            }
        }
        return interfaceC49482JbS;
    }
}
