package X;

import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import kotlin.jvm.internal.o;

/* renamed from: X.UPk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77144UPk implements QBC {
    public final /* synthetic */ XJL<Boolean> LJLIL;
    public final /* synthetic */ C77211URz LJLILLLLZI;
    public final /* synthetic */ RelationAuthDialogControl LJLJI;

    public C77144UPk(XKS xks, C77211URz c77211URz, RelationAuthDialogControl relationAuthDialogControl) {
        this.LJLIL = xks;
        this.LJLILLLLZI = c77211URz;
        this.LJLJI = relationAuthDialogControl;
    }

    @Override // X.QBC
    public final void onAuthResult(AuthResult it) {
        o.LJIIIZ(it, "it");
        if (it.mIsSuccessful && !it.mIsCancelled && C78685UuP.LJJJZ(it.mToken) && URH.LIZLLL(it, "user_friends")) {
            if (URH.LIZLLL(it, "email") && C35384Due.LIZ()) {
                String str = it.mToken;
                o.LJIIIIZZ(str, "it.token");
                C77332UWq.LIZ(str);
            }
            UQ5 LJIIJ = C77266UUc.LIZIZ.LJIIJ();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            String str2 = it.mToken;
            o.LJIIIIZZ(str2, "it.token");
            LJIIJ.LJII(it.mExpiryDateInMillis, curUserId, str2);
            XJL<Boolean> xjl = this.LJLIL;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
            return;
        }
        new URS(this.LJLILLLLZI, (Integer) this.LJLJI.LJLJLLL.getValue(), false, Boolean.valueOf(!it.mIsCancelled)).LIZLLL(null);
        XJL<Boolean> xjl2 = this.LJLIL;
        Boolean bool2 = Boolean.FALSE;
        C3C5.m7constructorimpl(bool2);
        xjl2.resumeWith(bool2);
    }
}
