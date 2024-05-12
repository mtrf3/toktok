package X;

import com.bytedance.ies.android.base.runtime.depend.IALogDepend;
import kotlin.jvm.internal.o;

/* renamed from: X.N0a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58648N0a implements InterfaceC58549MyP {
    public final /* synthetic */ IALogDepend LIZ;
    public final /* synthetic */ String LIZIZ;

    public C58648N0a(IALogDepend iALogDepend, String str) {
        this.LIZ = iALogDepend;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC58549MyP
    public final java.util.Map LIZ(M95 m95, String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        IALogDepend iALogDepend = this.LIZ;
        String str = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(eventName);
        LIZ.append(" = ");
        LIZ.append(map);
        iALogDepend.d(str, X1D.LIZIZ(LIZ));
        return map;
    }
}
