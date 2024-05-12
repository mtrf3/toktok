package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Pg3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65055Pg3 implements InterfaceC65016PfQ<TypedInput, TypedInput> {
    public static final C65055Pg3 LIZ = new C65055Pg3();

    @Override // X.InterfaceC65016PfQ
    public final TypedInput LIZ(TypedInput typedInput) {
        TypedInput typedInput2 = typedInput;
        if (typedInput2 != null && !(typedInput2 instanceof TypedByteArray)) {
            String mimeType = typedInput2.mimeType();
            InputStream in = typedInput2.in();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (in != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = in.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                typedInput2 = new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray(), new String[0]);
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        return typedInput2;
    }
}
