package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.j;
import com.google.gson.m;
import java.io.ByteArrayInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class R2L extends AbstractC65022PfW {
    public final ThreadLocal<Q9H> LIZ = new ThreadLocal<>();
    public final C65238Pj0 LIZIZ;

    public R2L(C65238Pj0 c65238Pj0) {
        this.LIZIZ = c65238Pj0;
    }

    public static RequestError LJIIIZ(R2O r2o) {
        RequestError requestError = new RequestError();
        requestError.message = r2o.LIZIZ;
        requestError.prompts = r2o.LIZJ;
        requestError.alert = r2o.LIZLLL;
        return requestError;
    }

    public static boolean LJIILIIL(Class cls, Q9H q9h) {
        if (cls != null && cls != Void.class && cls != Object.class && cls != C76800UCe.class) {
            return true;
        }
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.UCe] */
    public static R2P LJII(Class cls, Q9H q9h, R2O r2o) {
        R2P r2p = new R2P();
        r2p.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        r2p.extra = extra;
        if (r2o.LIZ == 0) {
            if (LJIILIIL(cls, q9h)) {
                C65124PhA.LIZLLL().getClass();
                r2p.data = C65124PhA.LJ(cls).LIZ(q9h);
            } else if (cls == Void.class) {
                r2p.data = null;
            } else if (cls == C76800UCe.class) {
                r2p.data = C76800UCe.LIZ;
            } else {
                r2p.data = new Object();
            }
        } else {
            r2p.LJ = LJIIIZ(r2o);
        }
        return r2p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static BOH LJIIIIZZ(Class cls, Q9H q9h, R2O r2o) {
        BOH boh = new BOH();
        boh.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        boh.extra = extra;
        boh.data = new ArrayList();
        if (r2o.LIZ == 0) {
            long LIZJ = q9h.LIZJ();
            while (true) {
                int LJI = q9h.LJI();
                if (LJI == -1) {
                    break;
                }
                if (LJI == 1) {
                    if (LJIILIIL(cls, q9h)) {
                        List<T> list = boh.data;
                        C65124PhA.LIZLLL().getClass();
                        list.add(C65124PhA.LJ(cls).LIZ(q9h));
                    }
                } else {
                    Q9J.LIZJ(q9h);
                }
            }
            q9h.LJ(LIZJ);
        } else {
            boh.LIZLLL = LJIIIZ(r2o);
        }
        return boh;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, X.UCe] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static C28467BFf LJIIJ(Class cls, Q9H q9h, R2O r2o) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        c28467BFf.extra = extra;
        if (r2o.LIZ == 0) {
            long LIZJ = q9h.LIZJ();
            while (true) {
                int LJI = q9h.LJI();
                if (LJI == -1) {
                    break;
                }
                if (LJI == 1) {
                    if (LJIILIIL(cls, q9h)) {
                        C65124PhA.LIZLLL().getClass();
                        c28467BFf.data = C65124PhA.LJ(cls).LIZ(q9h);
                    } else if (cls == Void.class) {
                        c28467BFf.data = null;
                    } else if (cls == C76800UCe.class) {
                        c28467BFf.data = C76800UCe.LIZ;
                    } else {
                        c28467BFf.data = new Object();
                    }
                } else {
                    Q9J.LIZJ(q9h);
                }
            }
            q9h.LJ(LIZJ);
        } else {
            c28467BFf.LJ = LJIIIZ(r2o);
        }
        return c28467BFf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(final Type type, final Annotation[] annotationArr, final C65019PfT c65019PfT) {
        final String str;
        if (!(type instanceof ParameterizedType)) {
            return LJIIL(type, annotationArr, c65019PfT);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return LJIIL(type, annotationArr, c65019PfT);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final Class[] clsArr = new Class[2];
        int i = 0;
        if (actualTypeArguments.length >= 1) {
            Type type2 = actualTypeArguments[0];
            if (!(type2 instanceof Class)) {
                return LJIIL(type, annotationArr, c65019PfT);
            }
            clsArr[0] = type2;
        }
        if (actualTypeArguments.length == 2) {
            Type type3 = actualTypeArguments[1];
            if (!(type3 instanceof Class)) {
                return LJIIL(type, annotationArr, c65019PfT);
            }
            clsArr[1] = type3;
        } else if (actualTypeArguments.length > 2) {
            return LJIIL(type, annotationArr, c65019PfT);
        }
        final Class cls = (Class) rawType;
        if (cls != C28467BFf.class && cls != BOH.class && cls != BaseResponse.class && cls != BaseListResponse.class && cls != R2P.class) {
            return LJIIL(type, annotationArr, c65019PfT);
        }
        int length = annotationArr.length;
        while (true) {
            if (i < length) {
                Annotation annotation = annotationArr[i];
                if (annotation instanceof E8L) {
                    str = ((E8L) annotation).value();
                    break;
                }
                if (annotation instanceof E8M) {
                    str = ((E8M) annotation).value();
                    break;
                }
                i++;
            } else {
                str = null;
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "/";
        }
        return new InterfaceC65016PfQ() { // from class: X.R2N
            /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
            @Override // X.InterfaceC65016PfQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    r2 = r17
                    X.R2L r8 = X.R2L.this
                    java.lang.Class r7 = r2
                    java.lang.Class[] r6 = r3
                    java.lang.String r12 = r4
                    java.lang.reflect.Type r13 = r5
                    java.lang.annotation.Annotation[] r14 = r6
                    X.PfT r15 = r7
                    com.bytedance.retrofit2.mime.TypedInput r2 = (com.bytedance.retrofit2.mime.TypedInput) r2
                    r8.getClass()
                    java.lang.String r1 = r2.mimeType()
                    java.lang.String r0 = "application/x-protobuf"
                    boolean r0 = android.text.TextUtils.equals(r1, r0)
                    if (r0 == 0) goto Lc9
                    java.io.InputStream r1 = r2.in()
                    java.lang.ThreadLocal<X.Q9H> r0 = r8.LIZ
                    java.lang.Object r4 = r0.get()
                    X.Q9H r4 = (X.Q9H) r4
                    if (r4 != 0) goto L3b
                    X.Q9H r4 = new X.Q9H
                    r4.<init>()
                    java.lang.ThreadLocal<X.Q9H> r0 = r8.LIZ
                    r0.set(r4)
                L3b:
                    X.Q9L r0 = new X.Q9L
                    r0.<init>(r1)
                    r4.LJIIL(r0)
                    com.bytedance.android.live.network.response.pb.ProtoResponse r5 = com.bytedance.android.live.network.response.pb.ProtoResponse.LIZ(r4)
                    byte[] r1 = r5.body
                    X.Q9M r0 = new X.Q9M
                    r0.<init>(r1)
                    r4.LJIIL(r0)
                    java.lang.Class<X.BFf> r0 = X.C28467BFf.class
                    r3 = 0
                    r2 = 0
                    if (r7 != r0) goto L60
                    r1 = r6[r2]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2O r0 = r5.header     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.BFf r1 = X.R2L.LJIIJ(r1, r4, r0)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    goto L92
                L60:
                    java.lang.Class<X.BOH> r0 = X.BOH.class
                    if (r7 != r0) goto L76
                    r1 = r6[r2]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2O r0 = r5.header     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.BOH r0 = X.R2L.LJIIIIZZ(r1, r4, r0)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                L6c:
                    com.bytedance.android.livesdk.livesetting.message.UsePbObjectJsonPassThroughSetting r1 = com.bytedance.android.livesdk.livesetting.message.UsePbObjectJsonPassThroughSetting.INSTANCE     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    int r2 = r1.getValue()     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    r1 = 2
                    if (r3 == 0) goto Laf
                    goto La0
                L76:
                    java.lang.Class<com.bytedance.android.live.network.response.BaseResponse> r0 = com.bytedance.android.live.network.response.BaseResponse.class
                    r1 = 1
                    if (r7 != r0) goto L86
                    r2 = r6[r2]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    r1 = r6[r1]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2O r0 = r5.header     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    com.bytedance.android.live.network.response.BaseResponse r1 = X.R2L.LJI(r2, r1, r4, r0)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    goto L92
                L86:
                    java.lang.Class<X.R2P> r0 = X.R2P.class
                    if (r7 != r0) goto L95
                    r1 = r6[r2]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2O r0 = r5.header     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2P r1 = X.R2L.LJII(r1, r4, r0)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                L92:
                    r0 = r3
                    r3 = r1
                    goto L6c
                L95:
                    r2 = r6[r2]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    r1 = r6[r1]     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    X.R2O r0 = r5.header     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    com.bytedance.android.live.network.response.BaseListResponse r0 = X.R2L.LJFF(r2, r1, r4, r0)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    goto L6c
                La0:
                    if (r2 <= 0) goto Ld1
                    int r9 = r3.statusCode     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    T r10 = r3.data     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    R extends com.bytedance.android.livesdk.model.Extra r11 = r3.extra     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    java.lang.Object r0 = r8.LJIIJJI(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    if (r2 != r1) goto Ld1
                    goto Lbe
                Laf:
                    if (r2 <= 0) goto Lbe
                    int r9 = r0.statusCode     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    java.util.List<T> r10 = r0.data     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    R extends com.bytedance.android.livesdk.model.Extra r11 = r0.extra     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    java.lang.Object r3 = r8.LJIIJJI(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Lc0 java.io.IOException -> Lc7
                    if (r2 != r1) goto Lbe
                    goto Ld1
                Lbe:
                    r3 = r0
                    goto Ld1
                Lc0:
                    r1 = move-exception
                    java.io.IOException r0 = new java.io.IOException
                    r0.<init>(r1)
                    throw r0
                Lc7:
                    r0 = move-exception
                    throw r0
                Lc9:
                    X.Pj3 r0 = r8.LJIIL(r13, r14, r15)
                    java.lang.Object r3 = r0.LIZ(r2)
                Ld1:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.R2N.LIZ(java.lang.Object):java.lang.Object");
            }
        };
    }

    public final C65241Pj3 LJIIL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        return (C65241Pj3) this.LIZIZ.LIZLLL(type, annotationArr, c65019PfT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseListResponse LJFF(Class cls, Class cls2, Q9H q9h, R2O r2o) {
        R r;
        BaseListResponse baseListResponse = new BaseListResponse();
        int i = r2o.LIZ;
        baseListResponse.statusCode = i;
        if (i == 0) {
            baseListResponse.data = new ArrayList();
            long LIZJ = q9h.LIZJ();
            while (true) {
                int LJI = q9h.LJI();
                if (LJI == -1) {
                    break;
                }
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        C65124PhA.LIZLLL().getClass();
                        R r2 = (R) C65124PhA.LJ(cls2).LIZ(q9h);
                        baseListResponse.extra = r2;
                        r2.now = r2o.LJ;
                    }
                } else if (LJIILIIL(cls, q9h)) {
                    List<T> list = baseListResponse.data;
                    C65124PhA.LIZLLL().getClass();
                    list.add(C65124PhA.LJ(cls).LIZ(q9h));
                }
            }
            q9h.LJ(LIZJ);
        } else {
            baseListResponse.LIZLLL = LJIIIZ(r2o);
            if (TextUtils.isEmpty(r2o.LJFF)) {
                r = 0;
            } else {
                r = (R) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, r2o.LJFF, cls2);
            }
            baseListResponse.extra = r;
        }
        return baseListResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, X.UCe] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.Object] */
    public static BaseResponse LJI(Class cls, Class cls2, Q9H q9h, R2O r2o) {
        BaseResponse baseResponse = new BaseResponse();
        int i = r2o.LIZ;
        baseResponse.statusCode = i;
        R r = 0;
        if (i == 0) {
            long LIZJ = q9h.LIZJ();
            while (true) {
                int LJI = q9h.LJI();
                if (LJI == -1) {
                    break;
                }
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        C65124PhA.LIZLLL().getClass();
                        R r2 = (R) C65124PhA.LJ(cls2).LIZ(q9h);
                        baseResponse.extra = r2;
                        r2.now = r2o.LJ;
                    }
                } else if (LJIILIIL(cls, q9h)) {
                    C65124PhA.LIZLLL().getClass();
                    baseResponse.data = C65124PhA.LJ(cls).LIZ(q9h);
                } else if (cls == Void.class) {
                    baseResponse.data = null;
                } else if (cls == C76800UCe.class) {
                    baseResponse.data = C76800UCe.LIZ;
                } else {
                    baseResponse.data = new Object();
                }
            }
            q9h.LJ(LIZJ);
        } else {
            baseResponse.LJ = LJIIIZ(r2o);
            if (!TextUtils.isEmpty(r2o.LJFF)) {
                r = (R) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, r2o.LJFF, cls2);
            }
            baseResponse.extra = r;
        }
        return baseResponse;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        return this.LIZIZ.LIZJ(type, annotationArr, annotationArr2, c65019PfT);
    }

    public final Object LJIIJJI(int i, Object obj, Extra extra, String str, Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        m mVar = new m();
        mVar.LJJIIJ("status_code", Integer.valueOf(i));
        mVar.LJJII("data", GsonProtectorUtils.toJsonTree(C65120Ph6.LIZ(), obj));
        mVar.LJJII("extra", GsonProtectorUtils.toJsonTree(C65120Ph6.LIZ(), extra));
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LiveMtPbRequestsSetting.INSTANCE.getValue().getPassThroughApi());
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ArrayList arrayList = new ArrayList();
        byte[] bytes = GsonProtectorUtils.toJson(C65120Ph6.LIZ(), (j) mVar).getBytes();
        LIZLLL.getClass();
        return LJIIL(type, annotationArr, c65019PfT).LIZ(new R2Q(new ByteArrayInputStream(new String(((C65123Ph9) C65124PhA.LJFF(LIZIZ, arrayList, "application/json", bytes)).LIZ().LJ).getBytes(Charset.forName("UTF-8")))));
    }
}
