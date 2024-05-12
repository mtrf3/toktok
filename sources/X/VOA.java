package X;

import com.lynx.jsbridge.LynxAccessibilityModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public final class VOA extends VO1 {
    public final /* synthetic */ ReadableMap LJLILLLLZI;
    public final /* synthetic */ Callback LJLJI;
    public final /* synthetic */ LynxAccessibilityModule LJLJJI;

    @Override // X.VO1
    public final void LIZ() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.LJLJJI.registerMutationStyleInner(this.LJLILLLLZI, javaOnlyMap);
        this.LJLJI.invoke(javaOnlyMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VOA(LynxAccessibilityModule lynxAccessibilityModule, VNU vnu, ReadableMap readableMap, Callback callback) {
        super(vnu);
        this.LJLJJI = lynxAccessibilityModule;
        this.LJLILLLLZI = readableMap;
        this.LJLJI = callback;
    }
}
