package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* renamed from: X.1NE, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1NE implements InterfaceC65016PfQ {
    @Override // X.InterfaceC65016PfQ
    public Object LIZ(Object obj) {
        TypedInput typedInput = (TypedInput) obj;
        if (typedInput instanceof TypedByteArray) {
            String str = "UTF-8";
            if (typedInput.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
            }
            return new String(((TypedByteArray) typedInput).getBytes(), str);
        }
        return null;
    }

    public static String LIZIZ(StringBuilder sb, List list, char c, StringBuilder sb2) {
        sb.append(list);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }
}
