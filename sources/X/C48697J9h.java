package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import ujb.s;

/* renamed from: X.J9h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48697J9h {
    public static final /* synthetic */ int LIZ = 0;

    public static final JSONArray LIZIZ(View view) {
        JSONArray jSONArray = new JSONArray();
        if (view == null) {
            jSONArray.put("top view is null.");
        } else if (view instanceof ViewGroup) {
            LinkedList linkedList = new LinkedList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LIZ((ViewGroup) view, linkedList, linkedHashSet);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                StringBuilder sb = new StringBuilder();
                if (!list.isEmpty()) {
                    int size = list.size() - 1;
                    for (int i = 0; i < size; i++) {
                        sb.append(LJ((View) ListProtector.get(list, i)));
                        sb.append("->");
                    }
                    ViewGroup viewGroup = (ViewGroup) ListProtector.get(list, C47261Igj.LJJI(list));
                    sb.append(LJ(viewGroup));
                    sb.append("[");
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        sb.append(LJ(viewGroup.getChildAt(i2)));
                        if (i2 < viewGroup.getChildCount() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append("]");
                    jSONArray.put(sb.toString());
                }
            }
        }
        return jSONArray;
    }

    public static final String LIZLLL(ActivityC45651qj activity) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        try {
            List<Fragment> LJJJJLI = activity.getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (it.hasNext()) {
                String LJFF = LJFF(it.next().getView());
                if (LJFF.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return LJFF;
                }
            }
            return "";
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get fragment null view has exception, e:");
            LIZ2.append(e);
            C0NB.LJ("ttlive_exception", X1D.LIZIZ(LIZ2));
            String message = e.getMessage();
            if (message == null) {
                return "null";
            }
            return message;
        }
    }

    public static final String LJ(View view) {
        if (view == null) {
            return "null";
        }
        if (view.getId() == -1) {
            return "no-id";
        }
        try {
            String fullId = view.getResources().getResourceName(view.getId());
            o.LJIIIIZZ(fullId, "fullId");
            int LJJLIIIJL = s.LJJLIIIJL(fullId, "id/", 0, false, 6);
            if (LJJLIIIJL < 0) {
                return fullId;
            }
            String substring = fullId.substring(LJJLIIIJL + 3);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        } catch (Resources.NotFoundException unused) {
            return "id-not-found";
        }
    }

    public static final String LJFF(View view) {
        if (view == null) {
            return "top view is null.";
        }
        if (view instanceof ViewGroup) {
            LinkedList linkedList = new LinkedList();
            if (LIZJ((ViewGroup) view, linkedList)) {
                StringBuilder sb = new StringBuilder();
                if (linkedList.isEmpty()) {
                    return "contain null view, but get parent view failed.";
                }
                int size = linkedList.size() - 1;
                for (int i = 0; i < size; i++) {
                    Object obj = linkedList.get(i);
                    o.LJIIIIZZ(obj, "parents[index]");
                    sb.append(LJ((View) obj));
                    sb.append("->");
                }
                ViewGroup viewGroup = (ViewGroup) linkedList.peekLast();
                if (viewGroup != null) {
                    sb.append(LJ(viewGroup));
                    sb.append("[");
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        sb.append(LJ(viewGroup.getChildAt(i2)));
                        if (i2 < viewGroup.getChildCount() - 1) {
                            sb.append(",");
                        }
                    }
                    return C0EH.LIZJ(sb, "]", "coordinate.toString()");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return "";
        }
        return "";
    }

    public static List LJI(ActivityC45651qj activityC45651qj) {
        List<Fragment> LJJJJLI = activityC45651qj.getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        Iterator<Fragment> it = LJJJJLI.iterator();
        while (it.hasNext()) {
            List<Fragment> LJJJJLI2 = it.next().getChildFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI2, "fragment.childFragmentManager.fragments");
            if (!LJJJJLI2.isEmpty()) {
                Iterator<Fragment> it2 = LJJJJLI2.iterator();
                while (it2.hasNext()) {
                    List<Fragment> LJJJJLI3 = it2.next().getChildFragmentManager().LJJJJLI();
                    o.LJIIIIZZ(LJJJJLI3, "child.childFragmentManager.fragments");
                    if (!LJJJJLI3.isEmpty()) {
                        arrayList.addAll(LJJJJLI3);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean LIZJ(ViewGroup viewGroup, Deque<ViewGroup> deque) {
        LinkedList linkedList = (LinkedList) deque;
        linkedList.addLast(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) == null) {
                return true;
            }
        }
        int childCount2 = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ViewGroup) && LIZJ((ViewGroup) childAt, deque)) {
                return true;
            }
        }
        Object peekLast = linkedList.peekLast();
        if (!o.LJ(peekLast, viewGroup)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("current stack top viewGroup isn't ");
            LIZ2.append(LJ(viewGroup));
            LIZ2.append(", it is ");
            LIZ2.append(peekLast);
            LIZ2.append('.');
            C0NB.LJIIL("ttlive_exception", X1D.LIZIZ(LIZ2));
        }
        linkedList.removeLast();
        return false;
    }

    public static void LIZ(ViewGroup viewGroup, Deque deque, java.util.Set set) {
        if (viewGroup.getChildCount() == 0) {
            return;
        }
        LinkedList linkedList = (LinkedList) deque;
        linkedList.addLast(viewGroup);
        if (linkedList.size() == 4) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(deque, 10));
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            set.add(arrayList);
        } else {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    LIZ((ViewGroup) childAt, deque, set);
                }
            }
        }
        linkedList.removeLast();
    }
}
