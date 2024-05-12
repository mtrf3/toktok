package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.k;

/* renamed from: X.Pj4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65242Pj4<T> implements InterfaceC65017PfR<PVM, T> {
    public final Gson LJLIL;
    public final TypeAdapter<T> LJLILLLLZI;

    @Override // X.InterfaceC65017PfR
    public final Object LIZ(PVM pvm) {
        PVM pvm2 = pvm;
        C65385PlN LJIIL = this.LJLIL.LJIIL(pvm2.charStream());
        try {
            T read = this.LJLILLLLZI.read(LJIIL);
            if (LJIIL.LJJIJIL() == EnumC65386PlO.END_DOCUMENT) {
                return read;
            }
            throw new k("JSON document was not fully consumed.");
        } finally {
            pvm2.close();
        }
    }

    public C65242Pj4(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LJLIL = gson;
        this.LJLILLLLZI = typeAdapter;
    }
}
