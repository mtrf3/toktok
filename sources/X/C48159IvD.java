package X;

import com.ss.android.videoshop.controller.RefactorVideoController;

/* renamed from: X.IvD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48159IvD implements InterfaceC46854IaA {
    public final /* synthetic */ C48157IvB LJLIL;

    public C48159IvD(C48157IvB c48157IvB) {
        this.LJLIL = c48157IvB;
    }

    @Override // X.InterfaceC46854IaA
    public final boolean onFetchedVideoInfo(C47164IfA c47164IfA) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null && refactorVideoController.responseFetchedVideoModel(c47164IfA)) {
            return true;
        }
        return false;
    }
}
