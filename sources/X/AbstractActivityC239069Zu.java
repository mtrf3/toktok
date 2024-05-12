package X;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC239069Zu extends ActivityC86117Xqz implements InterfaceC70422pa {
    public C84673XKz LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        XIA xia = C78613UtF.LIZJ;
        C84673XKz c84673XKz = this.LJLIL;
        if (c84673XKz != null) {
            return xia.plus(c84673XKz);
        }
        o.LJIJI("job");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C84673XKz c84673XKz = this.LJLIL;
        if (c84673XKz != null) {
            c84673XKz.LIZIZ(null);
        } else {
            o.LJIJI("job");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(C239079Zv.LJLIL);
        super.onCreate(bundle);
        this.LJLIL = C79146V4k.LJIILIIL();
    }
}
