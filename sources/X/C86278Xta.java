package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.jvm.internal.o;

/* renamed from: X.Xta, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86278Xta implements InterfaceC61107NyZ {
    public final /* synthetic */ C86277XtZ LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ InterfaceC86279Xtb LIZLLL;
    public final /* synthetic */ CompletionBlock LJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIJ(results, "results");
        int length = results.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C164906da c164906da = results[i];
            if (o.LJ(c164906da.LIZ, this.LIZIZ)) {
                if (c164906da.LIZ()) {
                    this.LIZ.LJII(this.LIZJ, this.LIZLLL, this.LJ);
                    return;
                }
            } else {
                i++;
            }
        }
        C31626Cb8.LIZ(this.LJ, 0, "request permission denied", 4);
    }

    public C86278Xta(C86277XtZ c86277XtZ, String str, Context context, InterfaceC86279Xtb interfaceC86279Xtb, C37356ElM c37356ElM) {
        this.LIZ = c86277XtZ;
        this.LIZIZ = str;
        this.LIZJ = context;
        this.LIZLLL = interfaceC86279Xtb;
        this.LJ = c37356ElM;
    }
}
