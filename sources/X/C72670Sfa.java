package X;

import java.util.ArrayList;

/* renamed from: X.Sfa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72670Sfa implements InterfaceC72603SeV {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final ArrayList<InterfaceC72580Se8> LIZJ = new ArrayList<>();

    static {
        C16880lQ.LJLLJ(C72671Sfb.class);
    }

    @Override // X.InterfaceC72603SeV
    public final ArrayList<InterfaceC72580Se8> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC72603SeV
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC72603SeV
    public final String getName() {
        return this.LIZIZ;
    }

    public C72670Sfa(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
