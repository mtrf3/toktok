package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAITemplateData;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hpe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45266Hpe implements InterfaceC83472WpQ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;

    static {
        TBT tbt = new TBT(C45266Hpe.class, "actionAIApi", "getActionAIApi()Lcom/ss/android/ugc/aweme/actionai/bot/ActionAIApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "get_template_cache";
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45266Hpe(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, InterfaceC83402WoI.class, null);
    }

    @Override // X.InterfaceC83472WpQ
    public final Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        String str = (String) obj;
        Object Mx = ((InterfaceC83402WoI) this.LJLILLLLZI.LIZ(this, LJLJI[0])).Mx(ActionAITemplateData.class);
        if (str != null && (Mx instanceof ActionAITemplateData)) {
            ActionAITemplateData actionAITemplateData = (ActionAITemplateData) Mx;
            if (!actionAITemplateData.getTemplateInfoList().isEmpty()) {
                int optInt = new JSONObject(str).optInt("index", -1);
                if (optInt == -1 || optInt >= actionAITemplateData.getTemplateInfoList().size()) {
                    C83429Woj c83429Woj = new C83429Woj(null, null, "", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
                    C3C5.m7constructorimpl(c83429Woj);
                    return c83429Woj;
                }
                C83429Woj c83429Woj2 = new C83429Woj(new C45241HpF(Mx, new Integer(optInt), false), null, "change another template from cache for user.", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
                C3C5.m7constructorimpl(c83429Woj2);
                return c83429Woj2;
            }
        }
        C83429Woj c83429Woj3 = new C83429Woj(null, null, "", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
        C3C5.m7constructorimpl(c83429Woj3);
        return c83429Woj3;
    }
}
