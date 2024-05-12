package X;

import java.lang.reflect.Array;

/* renamed from: X.Pek, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64974Pek extends AbstractC64964Pea<Object> {
    public final /* synthetic */ AbstractC64964Pea LIZ;

    public C64974Pek(AbstractC64964Pea abstractC64964Pea) {
        this.LIZ = abstractC64964Pea;
    }

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZ.LIZ(c64970Peg, Array.get(obj, i));
        }
    }
}
