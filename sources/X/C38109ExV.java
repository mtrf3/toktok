package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ExV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38109ExV extends O6R {
    public final /* synthetic */ SparkContext LJLJJI;
    public final /* synthetic */ AbstractC38127Exn<Object, ?> LJLJJL;

    public C38109ExV(SparkContext sparkContext, AbstractC38127Exn<Object, ?> abstractC38127Exn) {
        this.LJLJJI = sparkContext;
        this.LJLJJL = abstractC38127Exn;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        Object LIZ;
        JSONObject jSONObject;
        EnumC39924Flg enumC39924Flg;
        o.LJIIIZ(bridgeName, "bridgeName");
        if (this.LJLJJI.LJI() == null) {
            return;
        }
        AbstractC38127Exn<Object, ?> abstractC38127Exn = this.LJLJJL;
        SparkContext sparkContext = this.LJLJJI;
        try {
            Object invoke = abstractC38127Exn.invoke(C38108ExU.LIZJ(str, abstractC38127Exn), C38108ExU.LIZIZ(sparkContext.LJI()));
            if (invoke instanceof JSONObject) {
                jSONObject = (JSONObject) invoke;
            } else if (invoke != null) {
                try {
                    LIZ = new JSONObject(C65358Pkw.LIZ.LJIILL(invoke));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                JSONObject jSONObject2 = new JSONObject();
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = jSONObject2;
                }
                jSONObject = (JSONObject) LIZ;
            } else {
                jSONObject = new JSONObject();
            }
            InterfaceC60710NsA interfaceC60710NsA = sparkContext.hybridParams;
            if (interfaceC60710NsA != null) {
                enumC39924Flg = interfaceC60710NsA.getType();
            } else {
                enumC39924Flg = null;
            }
            if (enumC39924Flg != EnumC39924Flg.WEB) {
                JSONObject jSONObject3 = new JSONObject();
                if (invoke != null) {
                    jSONObject3.put("data", jSONObject);
                }
                jSONObject = jSONObject3;
            }
            jSONObject.put("code", 1);
            c37945Eur.LIZ(1, "success", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }
}
