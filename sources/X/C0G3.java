package X;

import Y.IDComparatorS333S0100000;
import android.graphics.Rect;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.0G3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0G3 {
    public final SpannedGridLayoutManager LIZ;
    public final C0LY LIZIZ;
    public final IDComparatorS333S0100000 LIZJ;
    public final java.util.Map<Integer, java.util.Set<Integer>> LIZLLL;
    public final java.util.Map<Integer, Rect> LJ;
    public final List<Rect> LJFF;

    public final int LIZIZ() {
        int paddingTop;
        int paddingBottom;
        if (this.LIZIZ == C0LY.VERTICAL) {
            SpannedGridLayoutManager spannedGridLayoutManager = this.LIZ;
            paddingTop = spannedGridLayoutManager.LJLLLL - spannedGridLayoutManager.getPaddingLeft();
            paddingBottom = this.LIZ.getPaddingRight();
        } else {
            SpannedGridLayoutManager spannedGridLayoutManager2 = this.LIZ;
            paddingTop = spannedGridLayoutManager2.LJLLLLLL - spannedGridLayoutManager2.getPaddingTop();
            paddingBottom = this.LIZ.getPaddingBottom();
        }
        return (paddingTop - paddingBottom) / this.LIZ.LJZ;
    }

    public C0G3(SpannedGridLayoutManager layoutManager, C0LY orientation) {
        Rect rect;
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(orientation, "orientation");
        this.LIZ = layoutManager;
        this.LIZIZ = orientation;
        this.LIZJ = new IDComparatorS333S0100000(this, 0);
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        if (orientation == C0LY.VERTICAL) {
            rect = new Rect(0, 0, layoutManager.LJZ, Integer.MAX_VALUE);
        } else {
            rect = new Rect(0, 0, Integer.MAX_VALUE, layoutManager.LJZ);
        }
        arrayList.add(rect);
    }

    public final Rect LIZ(int i, C0G4 c0g4) {
        Rect rect = (Rect) ((LinkedHashMap) this.LJ).get(Integer.valueOf(i));
        if (rect == null) {
            Iterator it = ((ArrayList) this.LJFF).iterator();
            while (it.hasNext()) {
                Rect rect2 = (Rect) it.next();
                int i2 = rect2.left;
                int i3 = rect2.top;
                if (rect2.contains(new Rect(i2, i3, c0g4.LIZ + i2, c0g4.LIZIZ + i3))) {
                    int i4 = rect2.left;
                    int i5 = rect2.top;
                    return new Rect(i4, i5, c0g4.LIZ + i4, c0g4.LIZIZ + i5);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return rect;
    }
}
