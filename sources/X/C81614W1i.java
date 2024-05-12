package X;

import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.W1i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81614W1i implements C0GX {
    public final /* synthetic */ C31883CfH LIZ;
    public final /* synthetic */ C29701Eo LIZIZ;
    public final /* synthetic */ boolean LIZJ = true;

    public C81614W1i(C31883CfH c31883CfH, C29701Eo c29701Eo) {
        this.LIZ = c31883CfH;
        this.LIZIZ = c29701Eo;
    }

    @Override // X.C0GX
    public final void LIZ(C0GY c0gy) {
        if (c0gy == null) {
            return;
        }
        try {
            java.util.Map<String, C0GY> map = C77126UOs.LIZ;
            String str = this.LIZ.LIZ;
            o.LJIIIIZZ(str, "entity.mPath");
            ((WeakHashMap) map).put(str, c0gy);
            this.LIZIZ.setComposition(c0gy);
            if (this.LIZJ) {
                this.LIZIZ.playAnimation();
            }
        } catch (Exception unused) {
        }
    }
}
