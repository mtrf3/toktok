package X;

import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import kotlin.jvm.internal.o;

/* renamed from: X.UcR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77571UcR {
    public static C77568UcO LIZ(DefaultLocationData originData) {
        o.LJIIIZ(originData, "originData");
        C77568UcO c77568UcO = new C77568UcO(originData.country, originData.state, originData.county, originData.city, null, 16);
        c77568UcO.LJFF = originData.LIZ;
        String str = originData.LIZIZ;
        o.LJIIIZ(str, "<set-?>");
        c77568UcO.LJI = str;
        return c77568UcO;
    }
}
