package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;

/* renamed from: X.73K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73K {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, Lifecycle.State state) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        Context context = view.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("container")) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJIFFI(LJJJIL, state);
            c1b3.LJI();
        }
    }
}
