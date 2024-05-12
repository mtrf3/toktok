package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* loaded from: classes12.dex */
public final class QDW<T> implements InterfaceC65016PfQ<TypedInput, QDX<T>> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;

    @Override // X.InterfaceC65016PfQ
    public final Object LIZ(TypedInput typedInput) {
        TypedInput typedInput2 = typedInput;
        QDT qdt = new QDT(typedInput2.in());
        C49932Jii c49932Jii = new C49932Jii();
        QDX qdx = new QDX(new QDU(qdt, c49932Jii));
        qdx.LJLJJI = c49932Jii;
        return new QDZ(new QDY(qdx, new C66630QDa(this, typedInput2, qdx)), qdx);
    }

    public QDW(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
