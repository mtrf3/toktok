package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.pb.ProtoResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class R2M implements InterfaceC65228Piq {
    public final Type LIZ;

    public R2M(Type type) {
        this.LIZ = type;
    }

    public static <T> T LIZLLL(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static RequestError LJI(R2O r2o) {
        RequestError requestError = new RequestError();
        requestError.message = r2o.LIZIZ;
        requestError.prompts = r2o.LIZJ;
        requestError.alert = r2o.LIZLLL;
        return requestError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65228Piq
    public final Object LIZ(byte[] bArr) {
        Object LJ;
        Type type = this.LIZ;
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        if (actualTypeArguments.length >= 1) {
            Type type2 = actualTypeArguments[0];
            if (!(type2 instanceof Class)) {
                return null;
            }
            clsArr[0] = type2;
        }
        if (actualTypeArguments.length == 2) {
            Type type3 = actualTypeArguments[1];
            if (!(type3 instanceof Class)) {
                return null;
            }
            clsArr[1] = type3;
        } else if (actualTypeArguments.length > 2) {
            return null;
        }
        if (rawType != C28467BFf.class && rawType != BOH.class && rawType != BaseResponse.class && rawType != BaseListResponse.class && rawType != R2P.class) {
            return null;
        }
        Q9H q9h = new Q9H();
        q9h.LJIIL(new Q9L(new ByteArrayInputStream(bArr)));
        try {
            ProtoResponse LIZ = ProtoResponse.LIZ(q9h);
            byte[] bArr2 = LIZ.body;
            if (bArr2 != null) {
                q9h.LJIIL(new Q9M(bArr2));
            }
            if (LIZ.body == null) {
                q9h = null;
            }
            if (rawType == C28467BFf.class) {
                LJ = LJII(clsArr[0], q9h, LIZ.header);
            } else {
                if (rawType == BOH.class) {
                    return LJFF(clsArr[0], q9h, LIZ.header);
                }
                if (rawType == BaseResponse.class) {
                    LJ = LIZJ(clsArr[0], clsArr[1], q9h, LIZ.header);
                } else if (rawType == R2P.class) {
                    LJ = LJ(clsArr[0], q9h, LIZ.header);
                } else {
                    return LIZIZ(clsArr[0], clsArr[1], q9h, LIZ.header);
                }
            }
            if (LJ == null) {
                return null;
            }
            return LJ;
        } catch (IOException | Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static R2P LJ(Class cls, Q9H q9h, R2O r2o) {
        R2P r2p = new R2P();
        r2p.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        r2p.extra = extra;
        if (r2o.LIZ == 0) {
            if (q9h != null) {
                C65124PhA.LIZLLL().getClass();
                r2p.data = C65124PhA.LJ(cls).LIZ(q9h);
            } else {
                r2p.data = LIZLLL(cls);
            }
        } else {
            r2p.LJ = LJI(r2o);
        }
        return r2p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static BOH LJFF(Class cls, Q9H q9h, R2O r2o) {
        BOH boh = new BOH();
        boh.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        boh.extra = extra;
        if (r2o.LIZ == 0) {
            boh.data = new ArrayList();
            if (q9h != null) {
                long LIZJ = q9h.LIZJ();
                while (true) {
                    int LJI = q9h.LJI();
                    if (LJI == -1) {
                        break;
                    }
                    if (LJI == 1) {
                        List<T> list = boh.data;
                        C65124PhA.LIZLLL().getClass();
                        list.add(C65124PhA.LJ(cls).LIZ(q9h));
                    } else {
                        Q9J.LIZJ(q9h);
                    }
                }
                q9h.LJ(LIZJ);
            }
        } else {
            boh.LIZLLL = LJI(r2o);
        }
        return boh;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    public static C28467BFf LJII(Class cls, Q9H q9h, R2O r2o) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.statusCode = r2o.LIZ;
        ?? extra = new Extra();
        extra.now = r2o.LJ;
        c28467BFf.extra = extra;
        if (r2o.LIZ == 0) {
            if (q9h != null) {
                long LIZJ = q9h.LIZJ();
                while (true) {
                    int LJI = q9h.LJI();
                    if (LJI == -1) {
                        break;
                    }
                    if (LJI == 1) {
                        C65124PhA.LIZLLL().getClass();
                        c28467BFf.data = C65124PhA.LJ(cls).LIZ(q9h);
                    } else {
                        Q9J.LIZJ(q9h);
                    }
                }
                q9h.LJ(LIZJ);
                if (c28467BFf.data == 0) {
                    c28467BFf.data = LIZLLL(cls);
                }
            } else {
                c28467BFf.data = LIZLLL(cls);
            }
        } else {
            c28467BFf.LJ = LJI(r2o);
        }
        return c28467BFf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseListResponse LIZIZ(Class cls, Class cls2, Q9H q9h, R2O r2o) {
        R r;
        BaseListResponse baseListResponse = new BaseListResponse();
        int i = r2o.LIZ;
        baseListResponse.statusCode = i;
        if (i == 0) {
            baseListResponse.data = new ArrayList();
            if (q9h != null) {
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
                    } else {
                        List<T> list = baseListResponse.data;
                        C65124PhA.LIZLLL().getClass();
                        list.add(C65124PhA.LJ(cls).LIZ(q9h));
                    }
                }
                q9h.LJ(LIZJ);
                if (baseListResponse.extra == 0) {
                    baseListResponse.extra = (R) LIZLLL(cls2);
                }
            } else {
                baseListResponse.extra = (R) LIZLLL(cls2);
            }
        } else {
            baseListResponse.LIZLLL = LJI(r2o);
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
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, java.lang.Object] */
    public static BaseResponse LIZJ(Class cls, Class cls2, Q9H q9h, R2O r2o) {
        R r;
        BaseResponse baseResponse = new BaseResponse();
        int i = r2o.LIZ;
        baseResponse.statusCode = i;
        if (i == 0) {
            if (q9h != null) {
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
                    } else {
                        C65124PhA.LIZLLL().getClass();
                        baseResponse.data = C65124PhA.LJ(cls).LIZ(q9h);
                    }
                }
                q9h.LJ(LIZJ);
                if (baseResponse.data == 0) {
                    baseResponse.data = LIZLLL(cls);
                }
                if (baseResponse.extra == 0) {
                    baseResponse.extra = (R) LIZLLL(cls2);
                }
            } else {
                baseResponse.data = LIZLLL(cls);
                baseResponse.extra = (R) LIZLLL(cls2);
            }
        } else {
            baseResponse.LJ = LJI(r2o);
            if (TextUtils.isEmpty(r2o.LJFF)) {
                r = 0;
            } else {
                r = (R) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, r2o.LJFF, cls2);
            }
            baseResponse.extra = r;
        }
        return baseResponse;
    }
}
