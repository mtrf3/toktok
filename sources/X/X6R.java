package X;

import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public final class X6R extends IDAVHTTPClientDelegateWrapper {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(X6O.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(X6N.LJLIL);

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final long getContentLength(long j) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ.getValue()).get(Long.valueOf(j));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean request(java.lang.String r19, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE r20, long r21, com.ss.ugc.android.davinciresource.jni.MapStringString r23, com.ss.ugc.android.davinciresource.jni.MapStringString r24, java.lang.String r25, byte[] r26, com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void r27, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate r28) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X6R.request(java.lang.String, com.ss.ugc.android.davinciresource.jni.HTTP_TYPE, long, com.ss.ugc.android.davinciresource.jni.MapStringString, com.ss.ugc.android.davinciresource.jni.MapStringString, java.lang.String, byte[], com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void, com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate):boolean");
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper
    public final boolean requestNet(String str, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate) {
        if (str == null || sWIGTYPE_p_void == null || httpClientCallbackDelegate == null) {
            return false;
        }
        C10K.LIZIZ(new X6K(str, this, http_type, j, mapStringString, mapStringString2, str2, bArr, sWIGTYPE_p_void, httpClientCallbackDelegate), C10K.LJI, null);
        return true;
    }
}
