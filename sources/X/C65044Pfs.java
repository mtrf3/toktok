package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;

/* renamed from: X.Pfs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65044Pfs implements InterfaceC65016PfQ<TypedInput, String> {
    public static final C65044Pfs LIZ = new C65044Pfs();

    @Override // X.InterfaceC65016PfQ
    public final String LIZ(TypedInput typedInput) {
        TypedInput typedInput2 = typedInput;
        if (typedInput2 instanceof TypedByteArray) {
            String str = "UTF-8";
            if (typedInput2.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput2.mimeType(), "UTF-8");
            }
            return new String(((TypedByteArray) typedInput2).getBytes(), str);
        }
        return null;
    }
}
