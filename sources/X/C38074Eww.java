package X;

import Y.ARunnableS1S1110000_6;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Eww, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38074Eww implements InterfaceC38034EwI {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ AbstractC38059Ewh LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Executor LIZLLL;
    public final /* synthetic */ C38072Ewu LJ;

    @Override // X.InterfaceC38034EwI
    public final void LIZ(String str) {
        boolean z;
        C38061Ewj c38061Ewj = C38113ExZ.LJIIJ;
        if (c38061Ewj.LIZ() != null && c38061Ewj.LIZ().LIZ(EnumC35578Dxm.PERMISSION_CONFIG_SYNC_PARSE_SWITCH)) {
            z = true;
        } else {
            z = false;
        }
        ARunnableS1S1110000_6 aRunnableS1S1110000_6 = new ARunnableS1S1110000_6(this, str, z, 0);
        if (z) {
            aRunnableS1S1110000_6.run();
        } else {
            this.LIZLLL.execute(aRunnableS1S1110000_6);
        }
    }

    public C38074Eww(C38072Ewu c38072Ewu, List list, C38062Ewk c38062Ewk, String str, Executor executor) {
        this.LJ = c38072Ewu;
        this.LIZ = list;
        this.LIZIZ = c38062Ewk;
        this.LIZJ = str;
        this.LIZLLL = executor;
    }
}
