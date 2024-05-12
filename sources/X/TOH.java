package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOH implements TM2 {
    public InterfaceC65784Pro<? extends TOE> LIZ;
    public InterfaceC65784Pro<? extends TOQ> LIZIZ;
    public final Context LIZJ;
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZLLL;
    public final InterfaceC65784Pro<String> LJ;
    public final InterfaceC65784Pro<String> LJFF;

    @Override // X.TM2
    public final TOI create() {
        TOE tol;
        TOQ top;
        InterfaceC65784Pro<? extends TOE> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro == null || (tol = interfaceC65784Pro.invoke()) == null) {
            String rootPath = new File(C16880lQ.LLIIJLIL(this.LIZJ), "effect").getAbsolutePath();
            o.LJIIIIZZ(rootPath, "rootPath");
            tol = new TOL(rootPath);
        }
        TOC toc = new TOC(tol, new AqS162S0100000_12(this, 1281));
        TOK tok = new TOK(toc, tol);
        InterfaceC65784Pro<? extends TOQ> interfaceC65784Pro2 = this.LIZIZ;
        if (interfaceC65784Pro2 == null || (top = interfaceC65784Pro2.invoke()) == null) {
            top = new TOP(this.LIZLLL, this.LJ, this.LJFF);
        }
        return new TOI(top, tok, toc, tol);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TOH(Context context, InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, InterfaceC65784Pro<String> providerNameSupplier, InterfaceC65784Pro<String> providerSourceSupplier) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerNameSupplier, "providerNameSupplier");
        o.LJIIIZ(providerSourceSupplier, "providerSourceSupplier");
        this.LIZJ = context;
        this.LIZLLL = effectPlatform;
        this.LJ = providerNameSupplier;
        this.LJFF = providerSourceSupplier;
    }
}
