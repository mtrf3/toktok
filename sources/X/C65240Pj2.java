package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.Pj2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65240Pj2<T> implements InterfaceC65016PfQ<TypedInput, T> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;

    @Override // X.InterfaceC65016PfQ
    public final Object LIZ(TypedInput typedInput) {
        TypedInput typedInput2 = typedInput;
        String str = "UTF-8";
        if (typedInput2.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput2.mimeType(), "UTF-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput2.in(), str);
        try {
            T read = this.LIZIZ.read(this.LIZ.LJIIL(inputStreamReader));
            if ((read instanceof InterfaceC65243Pj5) && (typedInput2 instanceof TypedByteArray)) {
                ((InterfaceC65243Pj5) read).setJsonData(new String(((TypedByteArray) typedInput2).getBytes(), str));
            }
            return read;
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public C65240Pj2(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
