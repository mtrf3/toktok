package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EwK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38036EwK implements InterfaceC40311Frv {
    public final /* synthetic */ SparkContext LIZ;

    public C38036EwK(SparkContext sparkContext) {
        this.LIZ = sparkContext;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        JSONObject jSONObject;
        o.LJIIIZ(eventName, "eventName");
        if (interfaceC78280Uns != null) {
            jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
        } else {
            jSONObject = new JSONObject();
        }
        C37942Euo c37942Euo = (C37942Euo) this.LIZ.LIZIZ(C37942Euo.class);
        if (c37942Euo != null) {
            c37942Euo.LIZ(eventName, jSONObject);
        }
    }
}
