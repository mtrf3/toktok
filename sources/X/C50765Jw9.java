package X;

import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jw9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50765Jw9 implements InterfaceC51050K1u {
    public final Object LIZ;

    public /* synthetic */ C50765Jw9(C68241QqL c68241QqL) {
        this.LIZ = c68241QqL;
    }

    public C50765Jw9(int i) {
        if (i != 3) {
            this.LIZ = new WeakHashMap();
        } else {
            this.LIZ = new HashMap();
        }
    }

    public final void LIZIZ(InterfaceC50310Joo interfaceC50310Joo) {
        C50742Jvm.LIZ(interfaceC50310Joo, (C50650JuI) this.LIZ);
    }

    public final Object LIZJ(Class cls) {
        Object obj = ((HashMap) this.LIZ).get(cls);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    public /* synthetic */ C50765Jw9(C50650JuI immutableData) {
        o.LJIIIZ(immutableData, "immutableData");
        this.LIZ = immutableData;
    }

    @Override // X.InterfaceC51050K1u
    public final void LIZ(String str, int i, Throwable th, byte[] bArr, java.util.Map map) {
        ((C68241QqL) this.LIZ).LJIIJJI(str, i, th, bArr, map);
    }
}
