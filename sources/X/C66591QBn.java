package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.QBn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66591QBn {
    public static final String LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(AVExternalServiceImpl.LIZ().configService().cacheConfig().musicDir());
        LIZ2.append("rhythm/");
        LIZ = X1D.LIZIZ(LIZ2);
    }
}