package X;

import java.lang.reflect.Array;

/* renamed from: X.PYx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64651PYx extends PZ1<Object> {
    public final /* synthetic */ PZ1 LIZ;

    public C64651PYx(PZ1 pz1) {
        this.LIZ = pz1;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZ.LIZ(c64638PYk, Array.get(obj, i));
        }
    }
}
