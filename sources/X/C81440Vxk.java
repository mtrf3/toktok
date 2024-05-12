package X;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81440Vxk {
    public static final String LIZ(Object obj) {
        if (o.LJ(obj, C44269HYz.LIZ)) {
            return "video_15";
        }
        if (o.LJ(obj, C44269HYz.LIZIZ)) {
            return "video_60";
        }
        if (o.LJ(obj, C44269HYz.LIZJ)) {
            return "video_180";
        }
        if (o.LJ(obj, "RecordCombinePhoto")) {
            return "photo";
        }
        if (o.LJ(obj, C44269HYz.LIZLLL)) {
            return "video_600";
        }
        if (o.LJ(obj, "by_default")) {
            return "by_default";
        }
        if (o.LJ(obj, I38.RECORD_NOW.getTag())) {
            return C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName();
        }
        if (o.LJ(obj, I38.RECORD_LIGHTENING_TEXT.getTag())) {
            return "text";
        }
        if (o.LJ(obj, "RecordAlbum")) {
            return "upload_tab";
        }
        if (o.LJ(obj, "RecordBottomStory")) {
            return "fast_shoot";
        }
        return "-1";
    }

    public static final java.util.Set<String> LIZIZ(int i) {
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 18) {
                        return null;
                    }
                    return C77275UUl.LJII("RecordShoot600s");
                }
                return C77275UUl.LJIIIIZZ("RecordShoot180s", "RecordShoot600s");
            }
            return C77275UUl.LJIIIIZZ("RecordShoot60s", "RecordShoot180s", "RecordShoot600s");
        }
        return C77275UUl.LJIIIIZZ("RecordShoot15s", "RecordShoot60s", "RecordShoot180s", "RecordShoot600s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
    
        if (r8.contains(r6) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View LIZJ(X.C119344mI r7, java.util.Set<java.lang.String> r8) {
        /*
            java.lang.String r6 = X.C44269HYz.LIZLLL
            boolean r0 = r8.contains(r6)
            r5 = 0
            if (r0 == 0) goto Lc
        L9:
            if (r6 != 0) goto L1e
        Lb:
            return r5
        Lc:
            java.lang.String r6 = X.C44269HYz.LIZJ
            boolean r0 = r8.contains(r6)
            if (r0 == 0) goto L15
            goto L9
        L15:
            java.lang.String r6 = X.C44269HYz.LIZIZ
            boolean r0 = r8.contains(r6)
            if (r0 == 0) goto Lb
            goto L9
        L1e:
            int r4 = r7.getChildCount()
            r3 = 0
        L23:
            if (r3 >= r4) goto L3d
            android.view.View r2 = r7.getChildAt(r3)
            java.lang.Object r1 = r2.getTag()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3b
        L31:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r6)
            if (r0 == 0) goto L38
            return r2
        L38:
            int r3 = r3 + 1
            goto L23
        L3b:
            r1 = r5
            goto L31
        L3d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81440Vxk.LIZJ(X.4mI, java.util.Set):android.view.View");
    }

    public static void LIZLLL(java.util.Map map, java.util.Set set) {
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            if (set.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJ(ViewOnTouchListenerC81419VxP tabHost, java.util.Set<String> visibleTabTags, java.util.Map<Integer, View> invisibleTabs) {
        o.LJIIIZ(tabHost, "tabHost");
        o.LJIIIZ(visibleTabTags, "visibleTabTags");
        o.LJIIIZ(invisibleTabs, "invisibleTabs");
        SortedMap LJJJJJ = C51029K0z.LJJJJJ(invisibleTabs);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : ((TreeMap) LJJJJJ).entrySet()) {
            Integer index = (Integer) entry.getKey();
            View view = (View) entry.getValue();
            Object tag = view.getTag();
            if ((tag instanceof String) && tag != null && !visibleTabTags.contains(tag)) {
                o.LJIIIIZZ(index, "index");
                int intValue = index.intValue();
                LinearLayout linearLayout = tabHost.LJLJL;
                if (linearLayout != null && linearLayout.getChildCount() >= intValue) {
                    tabHost.LJLJL.addView(view, intValue);
                    int i = tabHost.LJLIL;
                    if (intValue <= i) {
                        tabHost.LJLIL = i + 1;
                    }
                    tabHost.requestLayout();
                }
                visibleTabTags.add(tag);
                linkedHashSet.add(index);
            }
        }
        LIZLLL(invisibleTabs, linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJFF(java.util.Set<String> set, ViewOnTouchListenerC81419VxP tabHost, C119344mI c119344mI, java.util.Set<String> visibleTabTags, java.util.Map<Integer, View> invisibleTabs) {
        View childAt;
        InterfaceC81422VxS interfaceC81422VxS;
        o.LJIIIZ(tabHost, "tabHost");
        o.LJIIIZ(visibleTabTags, "visibleTabTags");
        o.LJIIIZ(invisibleTabs, "invisibleTabs");
        if (set == null) {
            return;
        }
        if (set.size() == visibleTabTags.size() && visibleTabTags.containsAll(set)) {
            return;
        }
        int childCount = c119344mI.getChildCount();
        Iterator it = ((TreeMap) C51029K0z.LJJJJJ(invisibleTabs)).entrySet().iterator();
        while (it.hasNext()) {
            Object tag = ((View) ((Map.Entry) it.next()).getValue()).getTag();
            if ((tag instanceof String) && tag != null && set.contains(tag)) {
                childCount++;
            }
        }
        C40511Fv9 LJIJJ = C78842Uww.LJIJJ(C78842Uww.LJJ(0, c119344mI.getChildCount()));
        int i = LJIJJ.LJLIL;
        int i2 = LJIJJ.LJLILLLLZI;
        int i3 = LJIJJ.LJLJI;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                Object tag2 = c119344mI.getChildAt(i).getTag();
                if ((tag2 instanceof String) && tag2 != null && !set.contains(tag2)) {
                    childCount--;
                }
                if (i == i2) {
                    break;
                } else {
                    i += i3;
                }
            }
        }
        if (childCount <= 0) {
            tabHost.setVisibility(8);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : ((TreeMap) C51029K0z.LJJJJJ(invisibleTabs)).entrySet()) {
            Integer index = (Integer) entry.getKey();
            View view = (View) entry.getValue();
            Object tag3 = view.getTag();
            if ((tag3 instanceof String) && tag3 != null && set.contains(tag3)) {
                o.LJIIIIZZ(index, "index");
                int intValue = index.intValue();
                LinearLayout linearLayout = tabHost.LJLJL;
                if (linearLayout != null && linearLayout.getChildCount() >= intValue) {
                    tabHost.LJLJL.addView(view, intValue);
                    int i4 = tabHost.LJLIL;
                    if (intValue <= i4) {
                        tabHost.LJLIL = i4 + 1;
                    }
                    tabHost.requestLayout();
                }
                visibleTabTags.add(tag3);
                linkedHashSet.add(index);
            }
        }
        LIZLLL(invisibleTabs, linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C40511Fv9 LJIJJ2 = C78842Uww.LJIJJ(C78842Uww.LJJ(0, c119344mI.getChildCount()));
        int i5 = LJIJJ2.LJLIL;
        int i6 = LJIJJ2.LJLILLLLZI;
        int i7 = LJIJJ2.LJLJI;
        if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
            while (true) {
                View childAt2 = c119344mI.getChildAt(i5);
                Object tag4 = childAt2.getTag();
                if ((tag4 instanceof String) && tag4 != null && !set.contains(tag4)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("remove tab the index is ");
                    LIZ.append(tabHost.LJLIL);
                    LIZ.append(" index: ");
                    LIZ.append(i5);
                    C170666ms.LIZIZ(X1D.LIZIZ(LIZ));
                    LinearLayout linearLayout2 = tabHost.LJLJL;
                    if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(i5)) != null) {
                        Object LJ = tabHost.LJ(tabHost.LJLIL);
                        C16880lQ.LJZI(tabHost.LJLJL, childAt);
                        if (tabHost.LJLIL >= tabHost.LJLJL.getChildCount()) {
                            int max = Math.max(tabHost.LJLJL.getChildCount() - 1, 0);
                            tabHost.LJLIL = max;
                            Object LJ2 = tabHost.LJ(max);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("remove tab the current index is ");
                            LIZ2.append(tabHost.LJLIL);
                            C170666ms.LIZIZ(X1D.LIZIZ(LIZ2));
                            if (!LJ.equals(LJ2) && (interfaceC81422VxS = tabHost.LJLJLLL) != null) {
                                interfaceC81422VxS.LIZ(LJ, tabHost.LJLIL, 0, false, true);
                            }
                        }
                        if (tabHost.LJLILLLLZI >= tabHost.LJLJL.getChildCount()) {
                            tabHost.LJLILLLLZI = Math.max(tabHost.LJLJL.getChildCount() - 1, 0);
                        }
                        tabHost.LJLLJ = Math.min(Math.max(tabHost.LJLJL.getChildCount() - 1, 0), tabHost.LJLLJ);
                        tabHost.requestLayout();
                    }
                    linkedHashSet2.add(tag4);
                    invisibleTabs.put(Integer.valueOf(i5), childAt2);
                }
                if (i5 == i6) {
                    break;
                } else {
                    i5 += i7;
                }
            }
        }
        visibleTabTags.removeAll(linkedHashSet2);
    }
}
