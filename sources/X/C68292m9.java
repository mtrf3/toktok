package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68292m9 extends CopyOnWriteArrayList<C68262m6> {
    public C68262m6 last() {
        if (!isEmpty()) {
            return get(size() - 1);
        }
        return null;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C68262m6) {
            return super.contains(obj);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Iterator<C68262m6> it = iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().LIZ)) {
                    return true;
                }
            }
            return false;
        }
        if (!(obj instanceof Activity)) {
            return false;
        }
        String obj2 = obj.toString();
        Iterator<C68262m6> it2 = iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(obj2, it2.next().LIZ)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Activity activity) {
        for (int size = size() - 1; size >= 0; size--) {
            if (TextUtils.equals(activity.toString(), get(size).LIZ)) {
                remove(size);
                return;
            }
        }
    }

    public void add(Activity activity, Lifecycle.Event event) {
        String obj = activity.toString();
        Iterator it = iterator();
        while (it.hasNext()) {
            C68262m6 c68262m6 = (C68262m6) it.next();
            if (TextUtils.equals(obj, c68262m6.LIZ)) {
                if (event == Lifecycle.Event.ON_CREATE || event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_RESUME) {
                    remove(c68262m6);
                    c68262m6.LIZIZ = event;
                    add(c68262m6);
                    return;
                }
                c68262m6.LIZIZ = event;
                return;
            }
        }
        add(new C68262m6(activity, event));
        if (size() <= 10) {
            return;
        }
        remove(0);
    }
}
