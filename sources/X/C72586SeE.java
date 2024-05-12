package X;

import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.SeE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72586SeE {
    public static C72587SeF LIZ(m mVar, C72585SeD c72585SeD) {
        try {
            String key = mVar.LJJIJ("key").LJJIFFI();
            String thumbnail = mVar.LJJIJ("thumbnail").LJJIFFI();
            o.LJIIIIZZ(key, "key");
            o.LJIIIIZZ(thumbnail, "thumbnail");
            return new C72587SeF(key, thumbnail, c72585SeD);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
