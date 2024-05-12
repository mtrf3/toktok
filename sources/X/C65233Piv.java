package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: X.Piv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65233Piv<T> implements InterfaceC65017PfR<T, PVP> {
    public static final C39745Fin LJLJI = C39745Fin.LIZIZ("application/json; charset=UTF-8");
    public static final Charset LJLJJI = Charset.forName("UTF-8");
    public final Gson LJLIL;
    public final TypeAdapter<T> LJLILLLLZI;

    @Override // X.InterfaceC65017PfR
    public final PVP LIZ(Object obj) {
        C64533PUj c64533PUj = new C64533PUj();
        C65403Plf LJIILIIL = this.LJLIL.LJIILIIL(new OutputStreamWriter(new C64540PUq(c64533PUj), LJLJJI));
        this.LJLILLLLZI.write(LJIILIIL, obj);
        LJIILIIL.close();
        return new PVV(LJLJI, c64533PUj.LJIIL());
    }

    public C65233Piv(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LJLIL = gson;
        this.LJLILLLLZI = typeAdapter;
    }
}
