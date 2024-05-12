package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.aMP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class ActivityC93161aMP extends C29S {
    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C91851a1H.LIZ.remove(toString());
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C91851a1H.LIZ.putIfAbsent(toString(), new WeakReference<>(this));
    }
}
