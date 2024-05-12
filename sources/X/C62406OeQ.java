package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AqS7S0600000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.OeQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62406OeQ implements C4RB {
    public final /* synthetic */ C193627io LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZLLL(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
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
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        FMX.LJIIL("share_collection", C113554cx.LJJL(new OSZ("collection_id", this.LIZ.LIZ), new OSZ("collection_name", this.LIZ.LIZJ), new OSZ("platform_flag", "2"), new OSZ("platform", "chat_head"), new OSZ("enter_from", this.LIZ.LJII)));
    }

    public C62406OeQ(C193627io c193627io, AqS7S0600000_3 aqS7S0600000_3) {
        this.LIZ = c193627io;
        this.LIZIZ = aqS7S0600000_3;
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!this.LIZ.LJFF) {
            this.LIZIZ.invoke();
        }
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZ(dialog, baseSharePackage);
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZIZ(dialog, baseSharePackage);
    }
}
