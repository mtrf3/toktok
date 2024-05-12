package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TNz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74559TNz implements TO4 {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;
    public final int LIZJ;

    public C74559TNz(InterfaceC65784Pro effectPlatform, InterfaceC65784Pro searchNameSupplier) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(searchNameSupplier, "searchNameSupplier");
        this.LIZ = effectPlatform;
        this.LIZIZ = searchNameSupplier;
        this.LIZJ = 30;
    }

    @Override // X.TO4
    public final TO0 LIZ(int i, String str, String str2) {
        return new TO0(this.LIZ, i, str, str2, this.LIZJ);
    }
}
