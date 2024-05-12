package com.bytedance.apm.impl;

import X.C17N;
import X.C36631EZf;
import X.C36633EZh;
import X.C64797Pbt;
import X.C64799Pbv;
import X.C64802Pby;
import X.C65083PgV;
import X.EJ6;
import X.EZ8;
import X.InterfaceC36632EZg;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class DefaultTTNetImpl implements IHttpService {
    public static List<EJ6> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        if (inputStream == null) {
            return new byte[0];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh doGet(String str, Map<String, String> map) {
        InterfaceC37276Ek4<TypedInput> fetch;
        List<EJ6> convertHeaderMap = convertHeaderMap(null);
        RetrofitMonitorService retrofitMonitorService = (RetrofitMonitorService) C65083PgV.LJIIIIZZ(RetrofitMonitorService.class, str);
        if (convertHeaderMap != null && convertHeaderMap.size() > 0) {
            fetch = retrofitMonitorService.fetch(str, convertHeaderMap, map, false);
        } else {
            fetch = retrofitMonitorService.fetch(str, map, false);
        }
        C64797Pbt<TypedInput> execute = fetch.execute();
        return new C36633EZh(execute.LIZ.LIZIZ, toByteArray(execute.LIZIZ.in()));
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z) {
        return new EZ8(str, null);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh doPost(String str, byte[] bArr, Map<String, String> map) {
        int i = 0;
        InterfaceC37276Ek4<TypedInput> report = ((RetrofitMonitorService) C65083PgV.LJIIIIZZ(RetrofitMonitorService.class, str)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap hashMap = new HashMap();
        byte[] bArr2 = null;
        try {
            C64797Pbt<TypedInput> execute = report.execute();
            bArr2 = toByteArray(execute.LIZIZ.in());
            List<EJ6> list = execute.LIZ.LIZLLL;
            if (!C17N.LJJIIZI(list)) {
                for (EJ6 ej6 : list) {
                    hashMap.put(ej6.LIZ, ej6.LIZIZ);
                }
            }
            i = execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            try {
                if (th instanceof C64802Pby) {
                    i = ((C64802Pby) th).getStatusCode();
                }
                if (th instanceof C64799Pbv) {
                    i = ((C64799Pbv) th).getStatusCode();
                }
            } catch (Exception unused) {
            }
        }
        return new C36633EZh(i, hashMap, bArr2);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh uploadFiles(String str, List<File> list, Map<String, String> map) {
        return C36631EZf.LIZ(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) {
        return new EZ8(str, map);
    }
}
