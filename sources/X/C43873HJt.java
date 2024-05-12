package X;

import Y.ARunnableS2S2201000_7;
import android.os.Handler;

/* renamed from: X.HJt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43873HJt implements InterfaceC84052Wym {
    public final /* synthetic */ C43870HJq LIZ;
    public final /* synthetic */ InterfaceC43874HJu LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;

    public /* synthetic */ C43873HJt(C43870HJq c43870HJq, InterfaceC43874HJu interfaceC43874HJu, String str, String str2, int i) {
        this.LIZ = c43870HJq;
        this.LIZIZ = interfaceC43874HJu;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
    }

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        C43870HJq c43870HJq = this.LIZ;
        InterfaceC43874HJu interfaceC43874HJu = this.LIZIZ;
        String str = this.LIZJ;
        String str2 = this.LIZLLL;
        int i2 = this.LJ;
        c43870HJq.getClass();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS2S2201000_7(c43870HJq, str, interfaceC43874HJu, str2, i2, 1));
    }
}
