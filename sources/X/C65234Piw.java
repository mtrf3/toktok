package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: X.Piw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65234Piw<T> implements InterfaceC65016PfQ<T, TypedOutput> {
    public static final Charset LIZJ = Charset.forName("UTF-8");
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;

    @Override // X.InterfaceC65016PfQ
    public final TypedOutput LIZ(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        C65403Plf LJIILIIL = this.LIZ.LJIILIIL(new OutputStreamWriter(byteArrayOutputStream, LIZJ));
        this.LIZIZ.write(LJIILIIL, obj);
        LJIILIIL.close();
        return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }

    public C65234Piw(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
