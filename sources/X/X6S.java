package X;

import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public final class X6S extends IDAVHTTPClientDelegateWrapper {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C172326pY.LJLIL);

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final long getContentLength(long j) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ.getValue()).get(Long.valueOf(j));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean request(java.lang.String r20, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE r21, long r22, com.ss.ugc.android.davinciresource.jni.MapStringString r24, com.ss.ugc.android.davinciresource.jni.MapStringString r25, java.lang.String r26, byte[] r27, com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void r28, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X6S.request(java.lang.String, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE, long, com.ss.ugc.android.davinciresource.jni.MapStringString, com.ss.ugc.android.davinciresource.jni.MapStringString, java.lang.String, byte[], com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate):boolean");
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final boolean requestNet(String str, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (str == null || sWIGTYPE_p_void == null || httpClientCallbackDelegate == null) {
            return false;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new X6J(str, this, http_type, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate, null), 2);
        return true;
    }
}
