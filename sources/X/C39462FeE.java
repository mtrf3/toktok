package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FeE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39462FeE extends AbstractC39461FeD {
    @Override // X.AbstractC39461FeD
    public final List<EnumC37847EtH> LIZ() {
        return C47261Igj.LJJIJ(EnumC37847EtH.ALL);
    }

    @Override // X.AbstractC39461FeD
    public final boolean LIZIZ(Context context, String schema, java.util.Map extraInfo) {
        Object LIZ;
        Object LIZ2;
        String str;
        InterfaceC60761Nsz LJI;
        View LIZJ;
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(extraInfo, "extraInfo");
        android.net.Uri parse = UriProtector.parse(schema);
        try {
            LIZ = UriProtector.getQueryParameter(parse, "btm_c_code");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        try {
            LIZ2 = UriProtector.getQueryParameter(parse, "btm_d_code");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        String str3 = (String) LIZ2;
        C39359FcZ c39359FcZ = SparkContext.Companion;
        Object obj = extraInfo.get("container_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        c39359FcZ.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
        if (LIZIZ != null && (LJI = LIZIZ.LJI()) != null && (LIZJ = LJI.LIZJ()) != null) {
            if (str2 == null) {
                if (str3 != null) {
                    str2 = "c0";
                } else {
                    return false;
                }
            }
            if (str3 == null) {
                str3 = "d0";
            }
            C12460eI.LJIILJJIL(LIZJ, str2, str3, null, null);
            return false;
        }
        return false;
    }
}
