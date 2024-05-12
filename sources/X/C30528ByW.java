package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.ByW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30528ByW implements C0WD {
    public static final C30528ByW LJLIL = new C30528ByW();

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        if (o.LJ(str, C0TY.LIZIZ) || o.LJ(str, C0TY.LIZJ)) {
            if (z) {
                C30527ByV.LIZ.put(liveEffect.unzipPath, new OSZ<>(liveEffect, 0L));
            } else {
                C30527ByV.LIZ.remove(liveEffect.unzipPath);
            }
        }
    }
}
