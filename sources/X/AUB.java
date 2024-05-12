package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUB implements InterfaceC26329AUz {
    public final /* synthetic */ AUA LIZ;

    public AUB(AUA aua) {
        this.LIZ = aua;
    }

    @Override // X.InterfaceC26329AUz
    public final void onData(String filePath) {
        APR apr = this.LIZ.LJFF;
        if (apr != null) {
            o.LJIIIIZZ(filePath, "filePath");
            apr.LIZIZ(filePath);
        }
        AUA.LJI = true;
    }
}
