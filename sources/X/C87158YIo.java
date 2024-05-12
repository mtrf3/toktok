package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.YIo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87158YIo {
    public static final C87158YIo LIZJ = new C87158YIo();
    public final ConcurrentMap LIZIZ = new ConcurrentHashMap();
    public final YJD LIZ = new YJD();

    public final YIV LIZ(Class cls) {
        Class cls2;
        if (cls != null) {
            YIV yiv = (YIV) ((ConcurrentHashMap) this.LIZIZ).get(cls);
            if (yiv == null) {
                YJD yjd = this.LIZ;
                yjd.getClass();
                if (YIN.class.isAssignableFrom(cls) || (cls2 = C87152YIi.LIZ) == null || cls2.isAssignableFrom(cls)) {
                    InterfaceC87182YJm LIZIZ = yjd.LIZ.LIZIZ(cls);
                    if (LIZIZ.LIZ()) {
                        if (YIN.class.isAssignableFrom(cls)) {
                            yiv = new C87161YIr(C87152YIi.LIZLLL, YJI.LIZ, LIZIZ.zza());
                        } else {
                            YJH yjh = C87152YIi.LIZIZ;
                            AbstractC87178YJi abstractC87178YJi = YJI.LIZIZ;
                            if (abstractC87178YJi != null) {
                                yiv = new C87161YIr(yjh, abstractC87178YJi, LIZIZ.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                    } else if (YIN.class.isAssignableFrom(cls)) {
                        if (LIZIZ.LIZIZ() == 1) {
                            yiv = C87151YIh.LJJIFFI(LIZIZ, XM6.LIZIZ, C87152YIi.LIZLLL, YJI.LIZ, C65879PtL.LIZIZ);
                        } else {
                            yiv = C87151YIh.LJJIFFI(LIZIZ, XM6.LIZIZ, C87152YIi.LIZLLL, null, C65879PtL.LIZIZ);
                        }
                    } else if (LIZIZ.LIZIZ() == 1) {
                        XM4 xm4 = XM6.LIZ;
                        YJH yjh2 = C87152YIi.LIZIZ;
                        AbstractC87178YJi abstractC87178YJi2 = YJI.LIZIZ;
                        if (abstractC87178YJi2 != null) {
                            yiv = C87151YIh.LJJIFFI(LIZIZ, xm4, yjh2, abstractC87178YJi2, C65879PtL.LIZ);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        yiv = C87151YIh.LJJIFFI(LIZIZ, XM6.LIZ, C87152YIi.LIZJ, null, C65879PtL.LIZ);
                    }
                    YIV yiv2 = (YIV) ((ConcurrentHashMap) this.LIZIZ).putIfAbsent(cls, yiv);
                    if (yiv2 != null) {
                        return yiv2;
                    }
                } else {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return yiv;
        }
        throw new NullPointerException("messageType");
    }
}
