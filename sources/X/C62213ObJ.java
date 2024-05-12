package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.ObJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62213ObJ implements C4RB {
    public final /* synthetic */ User LIZ;

    public C62213ObJ(User user) {
        this.LIZ = user;
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
        if (str.equals("chat_mergeIM")) {
            UserSharePackage.Companion.getClass();
            C62390OeA.LIZ("chat_head", this.LIZ, (SharePackage) sharePackage);
        } else {
            if (!str.equals("chat_merge")) {
                return;
            }
            UserSharePackage.Companion.getClass();
            C62390OeA.LIZ("chat_merge", this.LIZ, (SharePackage) sharePackage);
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
