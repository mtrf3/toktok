package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TNp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74549TNp implements TNA {
    public final Context LIZ;
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;

    @Override // X.TNA
    public final C74551TNr create() {
        String rootPath = new File(C16880lQ.LLIIJLIL(this.LIZ), "effect").getAbsolutePath();
        o.LJIIIIZZ(rootPath, "rootPath");
        C74554TNu c74554TNu = new C74554TNu(rootPath);
        C74550TNq c74550TNq = new C74550TNq(c74554TNu, new AqS162S0100000_12(this, 0));
        return new C74551TNr(new C74559TNz(this.LIZIZ, this.LIZJ), new C74552TNs(c74554TNu, c74550TNq), c74550TNq, c74554TNu);
    }

    public C74549TNp(Context context, C74541TNh effectPlatform, C74543TNj searchNameSupplier) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(searchNameSupplier, "searchNameSupplier");
        this.LIZ = context;
        this.LIZIZ = effectPlatform;
        this.LIZJ = searchNameSupplier;
    }
}
