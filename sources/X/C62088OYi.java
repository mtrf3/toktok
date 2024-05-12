package X;

import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62088OYi<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ NowInviteSharePackage LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C62088OYi(String str, NowInviteSharePackage nowInviteSharePackage, String str2) {
        this.LIZ = str;
        this.LIZIZ = nowInviteSharePackage;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String res = this.LIZ;
        o.LJIIIIZZ(res, "res");
        c73516StE.onSuccess(new OYP(res, this.LIZIZ.title, this.LIZJ));
    }
}
