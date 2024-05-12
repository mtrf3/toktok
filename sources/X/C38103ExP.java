package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ExP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38103ExP extends O6R {
    public final C38089ExB LJLJJI;
    public final /* synthetic */ InterfaceC60761Nsz LJLJJL;
    public final /* synthetic */ AbstractC38127Exn<Object, ?> LJLJJLL;
    public final /* synthetic */ SparkContext LJLJL;

    @Override // X.O6R
    public final void LJJIII() {
    }

    @Override // X.O6R, X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIIZ(context, "context");
        C38089ExB c38089ExB = this.LJLJJI;
        if (c38089ExB == null) {
            return;
        }
        c38089ExB.LIZ = context;
    }

    public C38103ExP(InterfaceC60761Nsz interfaceC60761Nsz, AbstractC38127Exn<Object, ?> abstractC38127Exn, SparkContext sparkContext) {
        C38089ExB LIZIZ;
        this.LJLJJL = interfaceC60761Nsz;
        this.LJLJJLL = abstractC38127Exn;
        this.LJLJL = sparkContext;
        if (interfaceC60761Nsz == null) {
            LIZIZ = null;
        } else {
            LIZIZ = C38088ExA.LIZIZ(interfaceC60761Nsz);
        }
        this.LJLJJI = LIZIZ;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        JSONObject jSONObject;
        EnumC39924Flg enumC39924Flg;
        o.LJIIIZ(bridgeName, "bridgeName");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLJJL;
        if (interfaceC60761Nsz == null) {
            return;
        }
        AbstractC38127Exn<Object, ?> abstractC38127Exn = this.LJLJJLL;
        SparkContext sparkContext = this.LJLJL;
        try {
            Object LIZ = C38110ExW.LIZ(str, abstractC38127Exn);
            C38089ExB c38089ExB = this.LJLJJI;
            if (c38089ExB == null) {
                c38089ExB = C38088ExA.LIZIZ(interfaceC60761Nsz);
            }
            Object invoke = abstractC38127Exn.invoke(LIZ, c38089ExB);
            if (invoke instanceof JSONObject) {
                jSONObject = (JSONObject) invoke;
            } else if (invoke != null) {
                jSONObject = new JSONObject(C09650Zl.LIZIZ.LJIILL(invoke));
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
                JSONObject jSONObject2 = new JSONObject();
                if (invoke != null) {
                    jSONObject2.put("data", jSONObject);
                }
                jSONObject = jSONObject2;
            }
            jSONObject.put("code", 1);
            c37945Eur.LIZ(1, "success", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
