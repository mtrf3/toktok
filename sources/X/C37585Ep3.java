package X;

import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.google.gson.m;

/* renamed from: X.Ep3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37585Ep3 implements BQ6<m> {
    public final /* synthetic */ Callback LIZ;

    public C37585Ep3(Callback callback) {
        this.LIZ = callback;
    }

    @Override // X.BQ6
    public final void accept(m mVar) {
        m mVar2 = mVar;
        if (this.LIZ == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("code", 1);
        if (mVar2 != null) {
            javaOnlyMap.put("data", C37697Eqr.LIZIZ(mVar2));
        }
        this.LIZ.invoke(javaOnlyMap);
    }
}
