package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62097OYr implements C4RB {
    public final /* synthetic */ InterfaceC62096OYq LIZ;

    public C62097OYr(InterfaceC62096OYq interfaceC62096OYq) {
        this.LIZ = interfaceC62096OYq;
    }

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LIZ.LIZ(new Exception("im share cancel"));
    }

    @Override // X.C4RB
    public final void LIZJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LIZ.LIZ(new Exception("im share fail"));
    }

    @Override // X.C4RB
    public final void LIZLLL(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LIZ.LJFF("chat_merge", "link", sharePackage.extras);
    }

    @Override // X.C4RB
    public final void LJII(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C113284cW.LIZ(dialog, sharePackage);
        this.LIZ.LJIIIZ(dialog);
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C113284cW.LIZIZ(dialog, sharePackage);
        this.LIZ.LJI(dialog);
    }
}
