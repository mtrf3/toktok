package X;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.core.JSProxy;

/* loaded from: classes15.dex */
public final class VNE implements Callback {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ TemplateAssembler LIZIZ;

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (this.LIZ < 0) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
        if (objArr.length > 1) {
            javaOnlyMap.put("data", objArr[1]);
        }
        JSProxy jSProxy = this.LIZIZ.LJFF;
        if (jSProxy != null) {
            jSProxy.LIZJ(this.LIZ, javaOnlyMap);
        }
    }

    public VNE(TemplateAssembler templateAssembler, int i) {
        this.LIZIZ = templateAssembler;
        this.LIZ = i;
    }
}
