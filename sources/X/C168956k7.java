package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168956k7 extends AbstractC168856jx {
    public final C169096kL LIZ;
    public final String LIZIZ = "DraftAlgorithmModelRestoreHandler";
    public final int LIZJ = 3;
    public final int LIZLLL = 200;
    public final List<String> LJ = new ArrayList();
    public final List<String> LJFF = new ArrayList();
    public final OSZ<List<String>, java.util.Map<String, List<String>>> LJI = new OSZ<>(new ArrayList(), new HashMap());

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return this.LIZLLL;
    }

    public C168956k7(C169096kL c169096kL) {
        this.LIZ = c169096kL;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C168906k2(this, null), interfaceC67352kd);
    }

    @Override // X.AbstractC168856jx
    public final Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C168926k4(this, null), interfaceC67352kd);
    }
}
