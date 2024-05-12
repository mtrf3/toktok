package X;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;

/* renamed from: X.Ffb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39547Ffb implements Callback {
    public final /* synthetic */ Callback LIZ;

    public C39547Ffb(Callback callback) {
        this.LIZ = callback;
    }

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (this.LIZ == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
        if (objArr.length > 1) {
            javaOnlyMap.put("data", objArr[1]);
        }
        this.LIZ.invoke(javaOnlyMap);
    }
}
