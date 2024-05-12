package X;

import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62087OYh<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ InterfaceC62225ObV LJLIL;
    public final /* synthetic */ NowInviteSharePackage LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public C62087OYh(InterfaceC62225ObV interfaceC62225ObV, NowInviteSharePackage nowInviteSharePackage, String str) {
        this.LJLIL = interfaceC62225ObV;
        this.LJLILLLLZI = nowInviteSharePackage;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        if (o.LJ(this.LJLIL.key(), "email")) {
            return AbstractC73635Sv9.LJ(new C62088OYi(res, this.LJLILLLLZI, this.LJLJI));
        }
        return AbstractC73635Sv9.LJ(new OYZ(res, this.LJLJI));
    }
}
