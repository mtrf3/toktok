package X;

import Y.ACallableS109S0100000_6;
import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLEHttpClientCallbackDelegate;
import com.bytedance.ies.nle.editor_jni.NLEHttpType;
import com.bytedance.ies.nle.editor_jni.SWIGTYPE_p_void;
import com.bytedance.ies.nle.editor_jni.UnorderedMapStrStr;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EZa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36626EZa extends INLEHTTPClientDelegateWrapper {
    public final void LIZ(String str, NLEHttpType nLEHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, byte[] bArr, String str2, SWIGTYPE_p_void sWIGTYPE_p_void, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate) {
        Pair pair;
        C64797Pbt<TypedInput> execute;
        InputStream in;
        PVJ pvj;
        C64797Pbt<TypedInput> execute2;
        InputStream in2;
        if (str != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!TextUtils.isEmpty(str)) {
                try {
                    android.net.Uri uri = UriProtector.parse(str);
                    StringBuilder sb = new StringBuilder();
                    o.LJIIIIZZ(uri, "uri");
                    String scheme = uri.getScheme();
                    String host = uri.getHost();
                    int port = uri.getPort();
                    if (host != null) {
                        if (scheme != null) {
                            sb.append(scheme);
                            sb.append("://");
                        }
                        sb.append(host);
                        if (port > 0) {
                            sb.append(':');
                            sb.append(port);
                        }
                    }
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "buffer.toString()");
                    String encodedPath = uri.getEncodedPath();
                    String encodedQuery = uri.getEncodedQuery();
                    if (encodedQuery == null) {
                        pair = new Pair(sb2, encodedPath);
                    } else {
                        Object[] array = s.LJLJJL(encodedQuery, new String[]{"&"}, 0, 6).toArray(new String[0]);
                        if (array != null) {
                            for (String str3 : (String[]) array) {
                                int LJJLIIIJJIZ = s.LJJLIIIJJIZ(str3, '=', 0, false, 6);
                                if (LJJLIIIJJIZ >= 0) {
                                    String substring = str3.substring(0, LJJLIIIJJIZ);
                                    o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    String decode = URLDecoder.decode(substring, "UTF-8");
                                    o.LJIIIIZZ(decode, "URLDecoder.decode(\n     …SET\n                    )");
                                    String substring2 = str3.substring(LJJLIIIJJIZ + 1);
                                    o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
                                    String decode2 = URLDecoder.decode(substring2, "UTF-8");
                                    o.LJIIIIZZ(decode2, "URLDecoder.decode(\n     …                        )");
                                    linkedHashMap.put(decode, decode2);
                                } else {
                                    String decode3 = URLDecoder.decode(str3, "UTF-8");
                                    o.LJIIIIZZ(decode3, "URLDecoder.decode(\n     …SET\n                    )");
                                    linkedHashMap.put(decode3, "");
                                }
                            }
                            pair = new Pair(sb2, encodedPath);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    String baseUrl = (String) pair.first;
                    C36630EZe c36630EZe = new C36630EZe(nLEHttpType, j, nLEHttpClientCallbackDelegate, sWIGTYPE_p_void);
                    byte[] bArr2 = null;
                    int i = -1001;
                    if (nLEHttpType == NLEHttpType.HTTP_POST) {
                        if (str2 == null || bArr == null) {
                            pvj = null;
                        } else {
                            pvj = PVP.LIZLLL(C39745Fin.LIZJ(str2), bArr);
                        }
                        o.LJIIIIZZ(baseUrl, "baseUrl");
                        InterfaceC37276Ek4<TypedInput> postBody = ((C36627EZb) this).LIZIZ(baseUrl).postBody(Integer.MAX_VALUE, str, pvj, unorderedMapStrStr);
                        if (postBody != null && (execute2 = postBody.execute()) != null) {
                            if (execute2.LIZIZ()) {
                                TypedInput typedInput = execute2.LIZIZ;
                                if (typedInput != null && (in2 = typedInput.in()) != null) {
                                    bArr2 = C62848OlY.LJFF(in2);
                                }
                                TypedInput typedInput2 = execute2.LIZIZ;
                                if (typedInput2 != null) {
                                    typedInput2.length();
                                }
                                c36630EZe.LIZIZ(bArr2);
                                return;
                            }
                            i = execute2.LIZ.LIZIZ;
                        }
                        c36630EZe.LIZ(i, null);
                        return;
                    }
                    o.LJIIIIZZ(baseUrl, "baseUrl");
                    InterfaceC37276Ek4<TypedInput> doGet = ((C36627EZb) this).LIZIZ(baseUrl).doGet(!s.LJJJLZIJ(baseUrl, "cdn", false), Integer.MAX_VALUE, str, linkedHashMap, unorderedMapStrStr);
                    if (doGet != null && (execute = doGet.execute()) != null) {
                        if (execute.LIZIZ()) {
                            TypedInput typedInput3 = execute.LIZIZ;
                            if (typedInput3 != null && (in = typedInput3.in()) != null) {
                                bArr2 = C62848OlY.LJFF(in);
                            }
                            TypedInput typedInput4 = execute.LIZIZ;
                            if (typedInput4 != null) {
                                typedInput4.length();
                            }
                            c36630EZe.LIZIZ(bArr2);
                            return;
                        }
                        i = execute.LIZ.LIZIZ;
                    }
                    c36630EZe.LIZ(i, null);
                    return;
                } catch (Exception unused) {
                    throw new IOException("parseUrl url is fail !!!");
                }
            }
            throw new IOException("parseUrl url is null !!!");
        }
        throw new NetworkErrorException("url or item is null");
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper
    public final boolean requestNet(String str, NLEHttpType nLEHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, NLEHttpClientCallbackDelegate nLEHttpClientCallbackDelegate) {
        C10K.LIZJ(new ACallableS109S0100000_6(new C36629EZd(this, str, nLEHttpType, j, unorderedMapStrStr, bArr, str2, sWIGTYPE_p_void, nLEHttpClientCallbackDelegate), 23));
        return true;
    }
}
