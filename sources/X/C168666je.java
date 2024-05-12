package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;

/* renamed from: X.6je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168666je implements InterfaceC168706ji {
    public final C169096kL LIZ;
    public final int LIZIZ = 4;
    public final int LIZJ = 1000;

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return this.LIZJ;
    }

    public C168666je(C169096kL c169096kL) {
        this.LIZ = c169096kL;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZIZ(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C168736jl(this, null), interfaceC67352kd);
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC168706ji
    public final DraftFileRestoreResult LIZJ(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C168716jj.LIZ(this, num, z, draftFileRestoreException);
    }
}
