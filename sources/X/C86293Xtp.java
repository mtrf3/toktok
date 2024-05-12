package X;

import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.Xtp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86293Xtp implements InterfaceC61107NyZ {
    public final /* synthetic */ OnPermissionGrantCallback LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        String str = this.LIZIZ;
        int length = results.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C164906da c164906da = results[i];
            if (o.LJ(c164906da.LIZ, str)) {
                if (c164906da.LIZ()) {
                    this.LIZ.onAllGranted();
                    return;
                }
            } else {
                i++;
            }
        }
        this.LIZ.onNotGranted();
    }

    public C86293Xtp(OnPermissionGrantCallback onPermissionGrantCallback, String str) {
        this.LIZ = onPermissionGrantCallback;
        this.LIZIZ = str;
    }
}
