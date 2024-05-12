package X;

import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.apm.impl.RetrofitMonitorService;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class EZ8 implements InterfaceC36632EZg {
    public final String LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final java.util.Map<String, TypedOutput> LIZJ = new HashMap();

    @Override // X.InterfaceC36632EZg
    public final C36633EZh finish() {
        int i;
        String str = this.LIZ;
        java.util.Map<String, TypedOutput> map = this.LIZJ;
        java.util.Map<String, String> map2 = this.LIZIZ;
        RetrofitMonitorService retrofitMonitorService = (RetrofitMonitorService) C65083PgV.LJIIIIZZ(RetrofitMonitorService.class, str);
        HashMap hashMap = new HashMap();
        byte[] bArr = null;
        try {
            C64797Pbt<TypedInput> execute = retrofitMonitorService.uploadFiles(str, map, DefaultTTNetImpl.convertHeaderMap(map2)).execute();
            bArr = DefaultTTNetImpl.toByteArray(execute.LIZIZ.in());
            List<EJ6> list = execute.LIZ.LIZLLL;
            if (!C17N.LJJIIZI(list)) {
                for (EJ6 ej6 : list) {
                    hashMap.put(ej6.LIZ, ej6.LIZIZ);
                }
            }
            i = execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            if (th instanceof C64802Pby) {
                i = ((C64802Pby) th).getStatusCode();
            } else {
                i = 0;
            }
            if (th instanceof C64799Pbv) {
                i = ((C64799Pbv) th).getStatusCode();
            }
        }
        return new C36633EZh(i, hashMap, bArr);
    }

    public EZ8(String str, java.util.Map map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZ(String str, String str2) {
        ((HashMap) this.LIZJ).put(str, new TypedString(str2));
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZIZ(String str, java.util.Map map) {
        ((HashMap) this.LIZJ).put("params.txt", new C36684EaW(str, map));
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZJ(String str, File file, java.util.Map map) {
        ((HashMap) this.LIZJ).put(str, new C36685EaX(map, new TypedFile(null, file)));
    }
}
