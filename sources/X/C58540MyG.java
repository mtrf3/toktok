package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* renamed from: X.MyG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58540MyG extends AbstractC65781Prl implements InterfaceC65784Pro<C58544MyK> {
    public static final C58540MyG LJLIL = new C58540MyG();

    public C58540MyG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C58544MyK invoke() {
        InterfaceC58538MyE interfaceC58538MyE = (InterfaceC58538MyE) C58530My6.LIZ.getValue();
        Gson gson = (Gson) C58530My6.LIZIZ.getValue();
        o.LJIIIIZZ(gson, "gson");
        return new C58544MyK(new C58545MyL(new C58552MyS(interfaceC58538MyE, gson)));
    }
}
