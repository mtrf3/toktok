package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ph9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65123Ph9 implements InterfaceC31677Cbx<C65126PhC> {
    public final InterfaceC37276Ek4<TypedInput> LIZ;

    public final C65126PhC LIZ() {
        TypedInput typedInput;
        String str;
        try {
            if (!AV1.LJIIJJI() && !AV1.LJIIL()) {
                C64797Pbt<TypedInput> execute = this.LIZ.execute();
                TypedInput typedInput2 = execute.LIZIZ;
                byte[] bArr = null;
                if (typedInput2 != null) {
                    typedInput = typedInput2;
                    if (typedInput != null) {
                        if (typedInput instanceof TypedByteArray) {
                            bArr = ((TypedByteArray) typedInput).getBytes();
                        } else {
                            InputStream in = typedInput.in();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            if (in != null) {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int read = in.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                    }
                } else {
                    typedInput = execute.LIZJ != null ? null : null;
                }
                String str2 = "";
                C36910EeA c36910EeA = execute.LIZ;
                if (c36910EeA != null) {
                    str = c36910EeA.LIZJ;
                    str2 = c36910EeA.LIZ;
                } else {
                    str = "no reason";
                }
                List<EJ6> list = c36910EeA.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (EJ6 ej6 : list) {
                    arrayList.add(new C05130Ib(ej6.LIZ, ej6.LIZIZ));
                }
                C65126PhC c65126PhC = new C65126PhC();
                c65126PhC.LIZ = str2;
                c65126PhC.LIZIZ = execute.LIZ.LIZIZ;
                c65126PhC.LJFF = str;
                c65126PhC.LIZJ = arrayList;
                c65126PhC.LJ = bArr;
                if (typedInput != null) {
                    c65126PhC.LIZLLL = typedInput.mimeType();
                }
                return c65126PhC;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("error_msg", "Internet request has been intercepted, because of ftc.");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJIIJJI("ttlive_minor_mode_live", 1, jSONObject);
            throw new C0TL(0, 1, "ftc don`t allow to access.");
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            if (!(e2 instanceof C64799Pbv)) {
                if (!(e2 instanceof C64698PaI)) {
                    if (e2 instanceof IOException) {
                        throw e2;
                    }
                    throw new IOException(e2);
                }
                C64698PaI c64698PaI = (C64698PaI) e2;
                throw new C0TL(c64698PaI.getCronetInternalErrorCode(), c64698PaI.getCronetInternalErrorCode(), c64698PaI.getMessage());
            }
            C64799Pbv c64799Pbv = (C64799Pbv) e2;
            throw new C0TL(c64799Pbv.getStatusCode(), c64799Pbv.getCronetInternalErrorCode(), c64799Pbv.getMessage());
        }
    }

    public C65123Ph9(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4) {
        this.LIZ = interfaceC37276Ek4;
    }
}
