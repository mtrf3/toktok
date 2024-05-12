package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* renamed from: X.Pei, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64972Pei {
    public EnumC64973Pej LIZ = EnumC64973Pej.POST;
    public String LIZIZ;
    public java.util.Map<String, String> LIZJ;
    public java.util.Map<String, String> LIZLLL;
    public byte[] LJ;
    public C64999Pf9 LJFF;
    public String LJI;
    public java.util.Map<String, String> LJII;
    public InterfaceC65228Piq LJIIIIZZ;

    public final byte[] LIZ() {
        boolean z;
        byte[] bArr;
        byte[] bArr2 = this.LJ;
        if (bArr2 != null) {
            return bArr2;
        }
        C64999Pf9 c64999Pf9 = this.LJFF;
        if (c64999Pf9 != null) {
            C64966Pec c64966Pec = c64999Pf9.LIZ;
            Object obj = c64999Pf9.LIZIZ;
            c64966Pec.getClass();
            try {
                byte[] bytes = ((TypedByteArray) c64966Pec.LIZ.LIZ(obj)).getBytes();
                o.LJIIIIZZ(bytes, "{\n            httpReques…deBody.encode()\n        }");
                return bytes;
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unable to convert ");
                LIZ.append(obj);
                LIZ.append(" to TypedOutput");
                throw new RuntimeException(X1D.LIZIZ(LIZ), e);
            }
        }
        java.util.Map<String, String> map = this.LJII;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            java.util.Map<String, String> map2 = this.LJII;
            if (map2 == null || map2.isEmpty()) {
                bArr = new byte[0];
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (String str : map2.keySet()) {
                    String str2 = map2.get(str);
                    if (str != null && str2 != null) {
                        if (byteArrayOutputStream.size() > 0) {
                            byteArrayOutputStream.write(38);
                        }
                        try {
                            String encode = URLEncoder.encode(str, "UTF-8");
                            String encode2 = URLEncoder.encode(str2, "UTF-8");
                            byteArrayOutputStream.write(encode.getBytes("UTF-8"));
                            byteArrayOutputStream.write(61);
                            byteArrayOutputStream.write(encode2.getBytes("UTF-8"));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                bArr = byteArrayOutputStream.toByteArray();
            }
            o.LJIIIIZZ(bArr, "{\n            FormUrlEnc…quest.fieldMap)\n        }");
            return bArr;
        }
        return new byte[0];
    }
}
