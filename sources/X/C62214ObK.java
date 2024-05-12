package X;

import Y.ACallableS31S1100000_3;
import Y.ACallableS81S0200000_3;
import android.app.Dialog;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.ObK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62214ObK implements C4RB {
    public final /* synthetic */ NowInviteSharePackage LIZ;

    public C62214ObK(NowInviteSharePackage nowInviteSharePackage) {
        this.LIZ = nowInviteSharePackage;
    }

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
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        NowInviteSharePackage nowInviteSharePackage = this.LIZ;
        nowInviteSharePackage.getClass();
        C10K.LIZJ(new ACallableS81S0200000_3((SharePackage) sharePackage, nowInviteSharePackage, 10));
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
        if (o.LJ(str, "chat_mergeIM")) {
            NowInviteSharePackage nowInviteSharePackage = this.LIZ;
            nowInviteSharePackage.getClass();
            C10K.LIZJ(new ACallableS31S1100000_3(nowInviteSharePackage, "chat_head", 4));
        } else {
            if (!o.LJ(str, "chat_merge")) {
                return;
            }
            NowInviteSharePackage nowInviteSharePackage2 = this.LIZ;
            nowInviteSharePackage2.getClass();
            C10K.LIZJ(new ACallableS31S1100000_3(nowInviteSharePackage2, str, 4));
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
