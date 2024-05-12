package X;

import Y.IDd0S17S0000000_11;
import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68501QuX implements InterfaceC68511Quh {
    public final AbstractC03300Ba LIZ;
    public final C68491QuN LIZIZ;
    public final C68493QuP LIZJ;
    public final IDd0S17S0000000_11 LIZLLL;
    public final IDd0S17S0000000_11 LJ;

    public C68501QuX(AppDatabase appDatabase) {
        this.LIZ = appDatabase;
        this.LIZIZ = new C68491QuN(appDatabase);
        this.LIZJ = new C68493QuP(appDatabase);
        this.LIZLLL = new IDd0S17S0000000_11(appDatabase, 14);
        this.LJ = new IDd0S17S0000000_11(appDatabase, 15);
    }
}
