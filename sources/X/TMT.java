package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMT implements TMU<Effect> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    @Override // X.TMU
    public final C74513TMf LIZ(C69610RTq listMeta) {
        o.LJIIIZ(listMeta, "listMeta");
        InterfaceC65784Pro<InterfaceC84497XEf> interfaceC65784Pro = this.LIZ;
        String str = listMeta.LIZIZ;
        int i = this.LIZIZ;
        String str2 = listMeta.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        return new C74513TMf(interfaceC65784Pro, str, i, new TPF(0, 0, "", str2, true), this.LIZJ);
    }

    public TMT(boolean z, InterfaceC65784Pro effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
        this.LIZIZ = 75;
        this.LIZJ = z;
    }
}
