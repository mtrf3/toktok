package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.UCc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76798UCc extends W4V<Object> {
    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // X.W4V
    public final void LJIIJ(String str, Object obj, Animatable animatable) {
        if (animatable != null && !animatable.isRunning()) {
            animatable.start();
        }
    }
}
