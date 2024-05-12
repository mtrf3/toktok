package X;

import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.SmZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73103SmZ extends SparseArray<BaseInterpolator> {
    public C73103SmZ() {
        put(0, new LinearInterpolator());
        put(1, new AccelerateInterpolator());
        put(2, new DecelerateInterpolator());
        put(3, new AccelerateDecelerateInterpolator());
    }
}
