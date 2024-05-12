package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;

/* renamed from: X.Xyd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86591Xyd implements OnPermissionGrantCallback {
    public final /* synthetic */ C45881HzZ LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C86589Xyb LIZJ;
    public final /* synthetic */ InterfaceC45882Hza LIZLLL;

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
    public final void onAllGranted() {
        this.LIZ.LJIIJ(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
    public final void onNotGranted() {
        this.LIZLLL.LIZ(0, "request permission denied", null);
    }

    public C86591Xyd(C45881HzZ c45881HzZ, Context context, C86589Xyb c86589Xyb, C86590Xyc c86590Xyc) {
        this.LIZ = c45881HzZ;
        this.LIZIZ = context;
        this.LIZJ = c86589Xyb;
        this.LIZLLL = c86590Xyc;
    }
}
