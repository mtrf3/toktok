package com.bytedance.retrofit2;

import X.AbstractC64937Pe9;
import X.C09900aA;
import X.C16880lQ;
import X.C34028DXc;
import X.C64738Paw;
import X.C64908Pdg;
import X.C64950PeM;
import X.C65019PfT;
import X.C65065PgD;
import X.C65139PhP;
import X.E4Q;
import X.E4T;
import X.E6L;
import X.E8L;
import X.E8M;
import X.EF7;
import X.EJ6;
import X.EKC;
import X.ENX;
import X.ENY;
import X.FW5;
import X.InterfaceC195757mF;
import X.InterfaceC195787mI;
import X.InterfaceC28048Azc;
import X.InterfaceC36226EJq;
import X.InterfaceC36317ENd;
import X.InterfaceC36318ENe;
import X.InterfaceC36324ENk;
import X.InterfaceC36325ENl;
import X.InterfaceC36326ENm;
import X.InterfaceC36337ENx;
import X.InterfaceC37216Ej6;
import X.InterfaceC37346ElC;
import X.InterfaceC44209HWr;
import X.InterfaceC51460KHo;
import X.InterfaceC61611OFz;
import X.InterfaceC64660PZg;
import X.InterfaceC64805Pc1;
import X.InterfaceC64976Pem;
import X.InterfaceC64991Pf1;
import X.InterfaceC64993Pf3;
import X.InterfaceC64994Pf4;
import X.InterfaceC64995Pf5;
import X.InterfaceC64996Pf6;
import X.InterfaceC65016PfQ;
import X.X1D;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class RequestFactory<T> {
    public final boolean addCommonParam;
    public final InterfaceC64805Pc1 clientProvider;
    public final String contentTypeHeader;
    public final Object extraInfo;
    public final boolean hasBody;
    public final List<EJ6> headers;
    public final Executor httpExecutor;
    public final String httpMethod;
    public final List<InterfaceC37216Ej6> interceptors;
    public final boolean isFormEncoded;
    public final boolean isKotlinSuspendFunction;
    public final boolean isMultipart;
    public final boolean isResponseStreaming;
    public final int maxLength;
    public final Method method;
    public final AbstractC64937Pe9<?>[] parameterHandlers;
    public final int priorityLevel;
    public final String relativeUrl;
    public Object relativeUrl1;
    public final int requestPriorityLevel;
    public InterfaceC65016PfQ<TypedInput, T> responseConverter;
    public C64738Paw retrofitMetrics;
    public final InterfaceC64660PZg server;
    public final String serviceType;

    public Request toRequest(InterfaceC37346ElC interfaceC37346ElC, Object... objArr) {
        return com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toRequest(this, interfaceC37346ElC, objArr);
    }

    public Object toResponse(TypedInput typedInput) {
        return com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toResponse(this, typedInput);
    }

    public RequestFactory(C64950PeM c64950PeM) {
        C65019PfT c65019PfT = c64950PeM.LIZ;
        this.clientProvider = c65019PfT.LIZIZ;
        this.interceptors = c65019PfT.LJIIIIZZ;
        this.httpExecutor = c65019PfT.LJII;
        this.server = c65019PfT.LIZJ;
        this.responseConverter = null;
        this.httpMethod = c64950PeM.LJIJJ;
        this.relativeUrl = c64950PeM.LJJI;
        this.hasBody = c64950PeM.LJIJJLI;
        this.isFormEncoded = c64950PeM.LJIL;
        this.isMultipart = c64950PeM.LJJ;
        this.parameterHandlers = c64950PeM.LJJIIJZLJL;
        this.headers = c64950PeM.LJJIFFI;
        this.contentTypeHeader = c64950PeM.LJJII;
        this.priorityLevel = c64950PeM.LJI;
        this.requestPriorityLevel = c64950PeM.LJIIJ;
        this.serviceType = c64950PeM.LJII;
        this.isResponseStreaming = c64950PeM.LJIIIIZZ;
        this.maxLength = -1;
        this.addCommonParam = true;
        this.extraInfo = null;
        this.method = c64950PeM.LIZIZ;
        c65019PfT.getClass();
        this.isKotlinSuspendFunction = c64950PeM.LJJIIZ;
        this.retrofitMetrics = c64950PeM.LJFF;
    }

    public T com_bytedance_retrofit2_RequestFactory__toResponse$___twin___(TypedInput typedInput) {
        return this.responseConverter.LIZ(typedInput);
    }

    public static Object com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toResponse(RequestFactory requestFactory, TypedInput typedInput) {
        BufferedOutputStream bufferedOutputStream;
        File file;
        File[] listFiles;
        BufferedInputStream bufferedInputStream;
        try {
            return requestFactory.com_bytedance_retrofit2_RequestFactory__toResponse$___twin___(typedInput);
        } catch (Exception e) {
            if (typedInput != null && typedInput.mimeType() != null && (typedInput.mimeType().contains("application/json") || typedInput.mimeType().contains("application/x-protobuf"))) {
                String str = (String) requestFactory.relativeUrl1;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("urlpath", str);
                    jSONObject.put("errorDesc", e.getMessage());
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                C09900aA.LJ("parser_err", jSONObject);
                BufferedInputStream bufferedInputStream2 = null;
                try {
                    try {
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath());
                            LIZ.append(File.separator);
                            LIZ.append("parser");
                            file = new File(X1D.LIZIZ(LIZ));
                            if (!file.exists()) {
                                file.mkdir();
                            } else {
                                File[] listFiles2 = file.listFiles();
                                if (listFiles2 != null && listFiles2.length > 0) {
                                    for (File file2 : listFiles2) {
                                        if (file2.isFile() && file2.exists() && file2.lastModified() + 86400000 < System.currentTimeMillis()) {
                                            C16880lQ.LLLZZIL(file2);
                                        }
                                    }
                                }
                            }
                            listFiles = file.listFiles();
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        bufferedOutputStream = null;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = null;
                    } catch (Exception e5) {
                        e = e5;
                        bufferedOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                    }
                    if (listFiles == null || listFiles.length < 10) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(file);
                        LIZ2.append(File.separator);
                        LIZ2.append(str.hashCode());
                        LIZ2.append("_");
                        LIZ2.append(System.currentTimeMillis());
                        LIZ2.append("_");
                        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
                        LIZ2.append(".txt");
                        File file3 = new File(X1D.LIZIZ(LIZ2));
                        if (!file3.exists()) {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            try {
                                bufferedInputStream = new BufferedInputStream(typedInput.in());
                            } catch (FileNotFoundException e6) {
                                e = e6;
                            } catch (IOException e7) {
                                e = e7;
                            } catch (Exception e8) {
                                e = e8;
                            }
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream2 = bufferedInputStream;
                                bufferedInputStream2.close();
                            } catch (FileNotFoundException e9) {
                                e = e9;
                                bufferedInputStream2 = bufferedInputStream;
                                C16880lQ.LLLLIIL(e);
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                throw e;
                            } catch (IOException e10) {
                                e = e10;
                                bufferedInputStream2 = bufferedInputStream;
                                C16880lQ.LLLLIIL(e);
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                throw e;
                            } catch (Exception e11) {
                                e = e11;
                                bufferedInputStream2 = bufferedInputStream;
                                C16880lQ.LLLLIIL(e);
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedInputStream2 = bufferedInputStream;
                                try {
                                    bufferedInputStream2.close();
                                    bufferedOutputStream.close();
                                } catch (Exception e12) {
                                    C16880lQ.LLLLIIL(e12);
                                }
                                throw th;
                            }
                            bufferedOutputStream.close();
                        }
                    }
                    bufferedOutputStream = null;
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                } catch (Exception e13) {
                    C16880lQ.LLLLIIL(e13);
                }
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
    
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.retrofit2.client.Request com_bytedance_retrofit2_RequestFactory__toRequest$___twin___(X.InterfaceC37346ElC r33, java.lang.Object... r34) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestFactory.com_bytedance_retrofit2_RequestFactory__toRequest$___twin___(X.ElC, java.lang.Object[]):com.bytedance.retrofit2.client.Request");
    }

    public static Request com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_toRequest(RequestFactory requestFactory, InterfaceC37346ElC interfaceC37346ElC, Object[] objArr) {
        Request com_bytedance_retrofit2_RequestFactory__toRequest$___twin___ = requestFactory.com_bytedance_retrofit2_RequestFactory__toRequest$___twin___(interfaceC37346ElC, objArr);
        if (((Boolean) C34028DXc.LIZIZ.getValue()).booleanValue() && FW5.LJII) {
            ArrayList arrayList = new ArrayList(com_bytedance_retrofit2_RequestFactory__toRequest$___twin___.getHeaders());
            arrayList.add(new EJ6("x-tt-request-tag", "feed=0"));
            C64908Pdg newBuilder = com_bytedance_retrofit2_RequestFactory__toRequest$___twin___.newBuilder();
            newBuilder.LIZJ = arrayList;
            return newBuilder.LIZ();
        }
        return com_bytedance_retrofit2_RequestFactory__toRequest$___twin___;
    }

    public static Request com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toRequest(RequestFactory requestFactory, InterfaceC37346ElC interfaceC37346ElC, Object[] objArr) {
        Request com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_toRequest = com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_toRequest(requestFactory, interfaceC37346ElC, objArr);
        requestFactory.relativeUrl1 = com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_toRequest.getPath();
        return com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_toRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static RequestFactory parseAnnotations(C65019PfT c65019PfT, Method method, C64738Paw c64738Paw) {
        boolean z;
        C64950PeM c64950PeM = new C64950PeM(c65019PfT, method, c64738Paw);
        Annotation[] annotationArr = c64950PeM.LIZJ;
        int length = annotationArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            Annotation annotation = annotationArr[i2];
            if (annotation instanceof InterfaceC36317ENd) {
                c64950PeM.LIZLLL("DELETE", ((InterfaceC36317ENd) annotation).value(), i);
            } else if (annotation instanceof E8L) {
                c64950PeM.LIZLLL("GET", ((E8L) annotation).value(), i);
            } else if (annotation instanceof InterfaceC36325ENl) {
                c64950PeM.LIZLLL("HEAD", ((InterfaceC36325ENl) annotation).value(), i);
            } else if (annotation instanceof InterfaceC36337ENx) {
                c64950PeM.LIZLLL("PATCH", ((InterfaceC36337ENx) annotation).value(), true);
            } else if (annotation instanceof E8M) {
                c64950PeM.LIZLLL("POST", ((E8M) annotation).value(), true);
            } else if (annotation instanceof InterfaceC36318ENe) {
                c64950PeM.LIZLLL("PUT", ((InterfaceC36318ENe) annotation).value(), true);
            } else if (annotation instanceof InterfaceC36324ENk) {
                c64950PeM.LIZLLL("OPTIONS", ((InterfaceC36324ENk) annotation).value(), false);
            } else if (annotation instanceof InterfaceC36326ENm) {
                InterfaceC36326ENm interfaceC36326ENm = (InterfaceC36326ENm) annotation;
                c64950PeM.LIZLLL(interfaceC36326ENm.method(), interfaceC36326ENm.path(), interfaceC36326ENm.hasBody());
            } else if (annotation instanceof EKC) {
                String[] value = ((EKC) annotation).value();
                if (value.length != 0) {
                    c64950PeM.LJJIFFI = c64950PeM.LIZJ(value);
                } else {
                    throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "@Headers annotation is empty.", new Object[0]);
                }
            } else if (annotation instanceof ENY) {
                if (!c64950PeM.LJIL) {
                    c64950PeM.LJJ = true;
                } else {
                    throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
            } else if (annotation instanceof InterfaceC195757mF) {
                if (!c64950PeM.LJJ) {
                    c64950PeM.LJIL = true;
                } else {
                    throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
            } else if (annotation instanceof ENX) {
                c64950PeM.LJIIIIZZ = true;
            } else if (annotation instanceof E6L) {
                c64950PeM.LJI = ((E6L) annotation).value();
            } else if (annotation instanceof InterfaceC61611OFz) {
                c64950PeM.LJII = ((InterfaceC61611OFz) annotation).value();
            } else if (annotation instanceof InterfaceC44209HWr) {
                c64950PeM.LJIIJ = ((InterfaceC44209HWr) annotation).value();
            }
            if (C65065PgD.LIZIZ) {
                if (annotation instanceof InterfaceC64991Pf1) {
                    c64950PeM.LIZLLL("DELETE", ((InterfaceC64991Pf1) annotation).value(), false);
                } else if (annotation instanceof E4Q) {
                    c64950PeM.LIZLLL("GET", ((E4Q) annotation).value(), false);
                } else if (annotation instanceof InterfaceC64993Pf3) {
                    c64950PeM.LIZLLL("HEAD", ((InterfaceC64993Pf3) annotation).value(), false);
                } else if (annotation instanceof InterfaceC64995Pf5) {
                    c64950PeM.LIZLLL("PATCH", ((InterfaceC64995Pf5) annotation).value(), true);
                } else if (annotation instanceof E4T) {
                    c64950PeM.LIZLLL("POST", ((E4T) annotation).value(), true);
                } else if (annotation instanceof InterfaceC64996Pf6) {
                    c64950PeM.LIZLLL("PUT", ((InterfaceC64996Pf6) annotation).value(), true);
                } else if (annotation instanceof InterfaceC64994Pf4) {
                    c64950PeM.LIZLLL("OPTIONS", ((InterfaceC64994Pf4) annotation).value(), false);
                } else if (annotation instanceof InterfaceC64976Pem) {
                    InterfaceC64976Pem interfaceC64976Pem = (InterfaceC64976Pem) annotation;
                    c64950PeM.LIZLLL(interfaceC64976Pem.method(), interfaceC64976Pem.path(), interfaceC64976Pem.hasBody());
                } else if (annotation instanceof InterfaceC36226EJq) {
                    String[] value2 = ((InterfaceC36226EJq) annotation).value();
                    if (value2.length != 0) {
                        c64950PeM.LJJIFFI = c64950PeM.LIZJ(value2);
                    } else {
                        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC51460KHo) {
                    if (!c64950PeM.LJIL) {
                        c64950PeM.LJJ = true;
                    } else {
                        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC195787mI) {
                    if (!c64950PeM.LJJ) {
                        c64950PeM.LJIL = true;
                    } else {
                        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC28048Azc) {
                    c64950PeM.LJIIIIZZ = true;
                }
            }
            i2++;
            i = 0;
        }
        if (c64950PeM.LJIJJ != null) {
            if (!c64950PeM.LJIJJLI && !c64950PeM.LJIIIZ) {
                if (!c64950PeM.LJJ) {
                    if (c64950PeM.LJIL) {
                        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[i]);
                    }
                } else {
                    throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length2 = c64950PeM.LIZLLL.length;
            c64950PeM.LJJIIJZLJL = new AbstractC64937Pe9[length2];
            int i3 = length2 - 1;
            for (int i4 = i; i4 < length2; i4++) {
                AbstractC64937Pe9<?>[] abstractC64937Pe9Arr = c64950PeM.LJJIIJZLJL;
                Type type = c64950PeM.LJ[i4];
                Annotation[] annotationArr2 = c64950PeM.LIZLLL[i4];
                if (i4 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                abstractC64937Pe9Arr[i4] = c64950PeM.LJ(i4, type, annotationArr2, z);
            }
            if (c64950PeM.LJJI != null || c64950PeM.LJIJ) {
                if (!c64950PeM.LJIL) {
                    if (!c64950PeM.LJJ && !c64950PeM.LJIJJLI && !c64950PeM.LJIIIZ && c64950PeM.LJIILIIL) {
                        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                } else if (!c64950PeM.LJIIJJI) {
                    throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (!c64950PeM.LJJ || c64950PeM.LJIIL) {
                    return new RequestFactory(c64950PeM);
                }
                throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Multipart method must contain at least one @Part.", new Object[0]);
            }
            throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "Missing either @%s URL or @Url parameter.", c64950PeM.LJIJJ);
        }
        throw C65139PhP.LJIIIZ(c64950PeM.LIZIZ, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }
}
