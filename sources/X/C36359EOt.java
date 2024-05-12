package X;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EOt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36359EOt extends C36360EOu {
    public final /* synthetic */ List LJLIL;

    public C36359EOt(List list) {
        this.LJLIL = list;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        List list = this.LJLIL;
        if (activity == null || list == null) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(C16880lQ.LLLLL(activity), "input_method");
            if (inputMethodManager == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField((String) it.next());
                    if (declaredField != null) {
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField.get(inputMethodManager);
                        if (obj != null && (obj instanceof View) && ((View) obj).getContext() == activity) {
                            declaredField.set(inputMethodManager, null);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
