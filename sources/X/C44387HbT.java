package X;

import java.util.List;

/* renamed from: X.HbT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44387HbT implements InterfaceC46813IYv {
    public final /* synthetic */ C44398Hbe LIZ;
    public final /* synthetic */ C44388HbU LIZIZ;

    @Override // X.InterfaceC46813IYv
    public final List<String> LIZ() {
        return this.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC46813IYv
    public final int LIZIZ() {
        return this.LIZ.LIZJ;
    }

    @Override // X.InterfaceC46813IYv
    public final String LIZJ() {
        return (String) this.LIZIZ.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC46813IYv
    public final int getBitRate() {
        C44386HbS c44386HbS = this.LIZ.LJFF;
        if (c44386HbS == null) {
            return 0;
        }
        return c44386HbS.LIZ;
    }

    @Override // X.InterfaceC46813IYv
    public final String getGearName() {
        C44386HbS c44386HbS = this.LIZ.LJFF;
        if (c44386HbS == null) {
            return null;
        }
        return c44386HbS.LIZIZ;
    }

    @Override // X.InterfaceC46813IYv
    public final String getKey() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC46813IYv
    public final int getQualityType() {
        C44386HbS c44386HbS = this.LIZ.LJFF;
        if (c44386HbS == null) {
            return 0;
        }
        return c44386HbS.LIZJ;
    }

    @Override // X.InterfaceC46813IYv
    public final long getSize() {
        return this.LIZ.LJ;
    }

    @Override // X.InterfaceC46813IYv
    public final void getUri() {
        this.LIZ.getClass();
    }

    public C44387HbT(C44388HbU c44388HbU, C44398Hbe c44398Hbe) {
        this.LIZIZ = c44388HbU;
        this.LIZ = c44398Hbe;
    }
}
