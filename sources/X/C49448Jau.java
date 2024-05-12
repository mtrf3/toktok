package X;

import android.text.Spannable;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.Jau, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49448Jau {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49449Jav.LJLIL);
    public final InterfaceC49388JZw LIZ;

    public C49448Jau(InterfaceC49388JZw interfaceC49388JZw) {
        this.LIZ = interfaceC49388JZw;
    }

    public final void LIZ(Spannable spannable, String str, int i) {
        List<HighlightInfo> LIZ;
        HighlightInfo highlightInfo;
        List<Position> positions;
        List<HighlightInfo> LIZ2 = this.LIZ.LIZ();
        if (LIZ2 == null || LIZ2.isEmpty()) {
            return;
        }
        C62822Ol8 c62822Ol8 = LIZIZ;
        java.util.Map map = (java.util.Map) ((WeakHashMap) c62822Ol8.getValue()).get(LIZ2);
        if ((map == null || map.isEmpty()) && (LIZ = this.LIZ.LIZ()) != null && (!LIZ.isEmpty())) {
            java.util.Map map2 = (java.util.Map) ((WeakHashMap) c62822Ol8.getValue()).get(LIZ);
            if (map2 == null) {
                map2 = new LinkedHashMap();
            }
            for (HighlightInfo highlightInfo2 : LIZ) {
                String field = highlightInfo2.getField();
                if (field != null) {
                    map2.put(field, highlightInfo2);
                }
            }
            ((WeakHashMap) LIZIZ.getValue()).put(LIZ, map2);
        }
        java.util.Map map3 = (java.util.Map) ((WeakHashMap) LIZIZ.getValue()).get(LIZ2);
        if (map3 == null || (highlightInfo = (HighlightInfo) map3.get(str)) == null || (positions = highlightInfo.getPositions()) == null) {
            return;
        }
        for (Position position : positions) {
            String obj = spannable.toString();
            int codePointCount = obj.codePointCount(0, obj.length());
            int codePointCount2 = obj.codePointCount(0, i);
            int begin = position.getBegin() + codePointCount2;
            int end = position.getEnd() + codePointCount2;
            if (begin >= 0 && begin <= codePointCount && end >= 0 && end <= codePointCount) {
                int offsetByCodePoints = obj.offsetByCodePoints(0, begin);
                int offsetByCodePoints2 = obj.offsetByCodePoints(0, end);
                InterfaceC49388JZw interfaceC49388JZw = this.LIZ;
                Position position2 = new Position();
                position2.setBegin(offsetByCodePoints);
                position2.setEnd(offsetByCodePoints2);
                List<Object> LIZIZ2 = interfaceC49388JZw.LIZIZ(obj, str, position2);
                if (LIZIZ2 != null) {
                    Iterator<Object> it = LIZIZ2.iterator();
                    while (it.hasNext()) {
                        spannable.setSpan(it.next(), offsetByCodePoints, offsetByCodePoints2, 33);
                    }
                }
            }
        }
    }
}
