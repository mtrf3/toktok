package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAIMusicInfoList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hqd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45327Hqd implements InterfaceC83472WpQ {
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "get_music_cache";
    }

    public C45327Hqd(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 575));
    }

    @Override // X.InterfaceC83472WpQ
    public final Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Object obj2;
        String str = (String) obj;
        InterfaceC83402WoI interfaceC83402WoI = (InterfaceC83402WoI) this.LJLILLLLZI.getValue();
        if (interfaceC83402WoI != null) {
            obj2 = interfaceC83402WoI.Mx(ActionAIMusicInfoList.class);
        } else {
            obj2 = null;
        }
        if (str != null && (obj2 instanceof ActionAIMusicInfoList)) {
            ActionAIMusicInfoList actionAIMusicInfoList = (ActionAIMusicInfoList) obj2;
            if (!actionAIMusicInfoList.getMusicInfoList().isEmpty()) {
                int optInt = new JSONObject(str).optInt("index", -1);
                if (optInt == -1 || optInt >= actionAIMusicInfoList.getMusicInfoList().size()) {
                    C83429Woj c83429Woj = new C83429Woj(null, null, "", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
                    C3C5.m7constructorimpl(c83429Woj);
                    return c83429Woj;
                }
                C83429Woj c83429Woj2 = new C83429Woj(new C45241HpF(obj2, new Integer(optInt), false), null, "change another music from cache for user.", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
                C3C5.m7constructorimpl(c83429Woj2);
                return c83429Woj2;
            }
        }
        C83429Woj c83429Woj3 = new C83429Woj(null, null, "", false, str, EnumC45236HpA.SUCCESS, null, null, 200);
        C3C5.m7constructorimpl(c83429Woj3);
        return c83429Woj3;
    }
}
