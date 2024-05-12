package com.bytedance.bmf_mods.downloader;

import X.C10K;
import X.C16880lQ;
import X.C39745Fin;
import X.C62848OlY;
import X.C64797Pbt;
import X.C65083PgV;
import X.EJ6;
import X.EZX;
import X.PVC;
import X.PVJ;
import X.PVP;
import X.X1D;
import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackAction;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.MsgExtParam;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes34.dex */
public class BMFTTNetClientImpl extends IDAVHTTPClientDelegateWrapper {
    public final String TAG = "DAVResource";
    public ConcurrentHashMap<Long, Long> contentLengthMap = new ConcurrentHashMap<>();

    private List<EJ6> setHeaders(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (String str : map.keySet()) {
                arrayList.add(new EJ6(str, map.get(str)));
            }
        }
        return arrayList;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public long getContentLength(long j) {
        if (this.contentLengthMap.get(Long.valueOf(j)) != null) {
            return this.contentLengthMap.get(Long.valueOf(j)).longValue();
        }
        return 0L;
    }

    public boolean request(String str, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        Pair<String, String> pair;
        C64797Pbt<TypedInput> execute;
        long j2;
        InputStream in;
        PVJ pvj;
        if (str != null && http_type != null) {
            byte[] bArr2 = null;
            try {
                pair = EZX.LIZJ(str, mapStringString2);
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                pair = null;
            }
            String str3 = (String) pair.first;
            String str4 = (String) pair.second;
            IDavResourceNetworkApi iDavResourceNetworkApi = (IDavResourceNetworkApi) C65083PgV.LJIIIIZZ(IDavResourceNetworkApi.class, str3);
            List<EJ6> arrayList = new ArrayList<>();
            if (mapStringString != null && !mapStringString.isEmpty()) {
                arrayList = setHeaders(mapStringString);
            }
            if (http_type == HTTP_TYPE.HTTP_POST) {
                if (str2 == null || bArr == null) {
                    pvj = null;
                } else {
                    pvj = PVP.LIZLLL(C39745Fin.LIZJ(str2), bArr);
                }
                execute = iDavResourceNetworkApi.davResourcePost(true, Integer.MAX_VALUE, str4, pvj, arrayList).execute();
            } else {
                execute = iDavResourceNetworkApi.davResourceGet(Boolean.valueOf(!str3.contains("cdn")), Integer.MAX_VALUE, str4, mapStringString2, arrayList).execute();
            }
            if (execute != null && execute.LIZIZ()) {
                TypedInput typedInput = execute.LIZIZ;
                if (typedInput != null && (in = typedInput.in()) != null) {
                    bArr2 = C62848OlY.LJFF(in);
                }
                MsgExtParam msgExtParam = new MsgExtParam();
                msgExtParam.setEHttpType(http_type);
                msgExtParam.setUiReqId(j);
                this.contentLengthMap.put(Long.valueOf(j), Long.valueOf(execute.LIZIZ.length()));
                HttpClientCallbackAction httpClientCallbackAction = HttpClientCallbackAction.SUCCESS;
                if (bArr2 != null) {
                    j2 = bArr2.length;
                } else {
                    j2 = 0;
                }
                httpClientCallbackDelegate.onCallback(sWIGTYPE_p_void, httpClientCallbackAction, bArr2, j2, msgExtParam);
                return true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("http response code:");
            LIZ.append(execute.LIZ.LIZIZ);
            throw new NetworkErrorException(X1D.LIZIZ(LIZ));
        }
        throw new NetworkErrorException("url or httpType is null");
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public boolean requestNet(final String str, final HTTP_TYPE http_type, final long j, final MapStringString mapStringString, final MapStringString mapStringString2, final String str2, final byte[] bArr, final SWIGTYPE_p_void sWIGTYPE_p_void, final HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (str == null || sWIGTYPE_p_void == null || httpClientCallbackDelegate == null) {
            return false;
        }
        C10K.LIZIZ(new Callable() { // from class: com.bytedance.bmf_mods.downloader.BMFTTNetClientImpl.1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                try {
                    z = BMFTTNetClientImpl.this.request(str, http_type, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate);
                } catch (Exception unused) {
                    MsgExtParam msgExtParam = new MsgExtParam();
                    HTTP_TYPE http_type2 = http_type;
                    if (http_type2 != null) {
                        msgExtParam.setEHttpType(http_type2);
                    } else {
                        msgExtParam.setEHttpType(HTTP_TYPE.HTTP_GET);
                    }
                    msgExtParam.setUiReqId(j);
                    msgExtParam.setErrorCode(-1);
                    httpClientCallbackDelegate.onCallback(sWIGTYPE_p_void, HttpClientCallbackAction.FAIL, "Network Failed".getBytes(PVC.LIZ), r4.length, msgExtParam);
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, C10K.LJI, null);
        return true;
    }
}
