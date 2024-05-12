package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.ttnet.IDownloadApi;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* renamed from: X.Iwe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48248Iwe implements InterfaceC84217X3l {
    public IDownloadApi LIZ;

    @Override // X.InterfaceC84217X3l
    public final X5F LIZ(String str, List list) {
        boolean z;
        String str2;
        InputStream inputStream;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (!C40680Fxs.LIZIZ(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str4 = "";
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            z = false;
            while (it.hasNext()) {
                HttpHeader httpHeader = (HttpHeader) it.next();
                if (TextUtils.equals(httpHeader.name, "downloader_scene")) {
                    str4 = httpHeader.value;
                } else if ("extra_ttnet_common_param".equalsIgnoreCase(httpHeader.name)) {
                    z = true;
                } else {
                    String str5 = httpHeader.name;
                    if (TextUtils.equals(str5, "User-Agent")) {
                        String str6 = httpHeader.value;
                        StringBuilder sb = new StringBuilder();
                        int length = str6.length();
                        for (int i = 0; i < length; i++) {
                            char charAt = str6.charAt(i);
                            if (charAt <= 31 || charAt >= 127) {
                                sb.append(C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                            } else {
                                sb.append(charAt);
                            }
                        }
                        str3 = sb.toString();
                    } else {
                        str3 = httpHeader.value;
                    }
                    arrayList.add(new EJ6(str5, str3));
                }
            }
        } else {
            z = false;
        }
        if (this.LIZ == null) {
            this.LIZ = (IDownloadApi) C40084FoG.LIZIZ(str).LIZ.LIZ(IDownloadApi.class);
        }
        String str7 = null;
        InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4 = this.LIZ.get(z, str, arrayList, null);
        try {
            C64797Pbt<TypedInput> execute = interfaceC37276Ek4.execute();
            TypedInput typedInput = execute.LIZIZ;
            if (typedInput != null) {
                InputStream in = typedInput.in();
                List<EJ6> list2 = execute.LIZ.LIZLLL;
                if (list2 != null) {
                    for (EJ6 ej6 : list2) {
                        if (ej6.LIZ.equals("Content-Encoding")) {
                            str7 = ej6.LIZIZ;
                        }
                    }
                    if (str7 != null && "gzip".equalsIgnoreCase(str7) && !(in instanceof GZIPInputStream)) {
                        inputStream = new GZIPInputStream(in);
                        return new C48149Iv3(inputStream, execute, currentTimeMillis, str4, interfaceC37276Ek4);
                    }
                }
                inputStream = in;
                return new C48149Iv3(inputStream, execute, currentTimeMillis, str4, interfaceC37276Ek4);
            }
            return null;
        } catch (Exception e) {
            if (e instanceof C64799Pbv) {
                str2 = ((C64799Pbv) e).getRequestLog();
            } else {
                str2 = null;
            }
            C48150Iv4.LIZ(1, str4, currentTimeMillis, str2, e.getMessage());
            return null;
        }
    }
}
