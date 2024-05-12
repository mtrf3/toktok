package X;

import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.SfV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72665SfV extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ ProfileNaviServiceImpl LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC72668SfY LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72665SfV(long j, ProfileNaviServiceImpl profileNaviServiceImpl, String str, InterfaceC72668SfY interfaceC72668SfY, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = profileNaviServiceImpl;
        this.LJLJI = str;
        this.LJLJJI = interfaceC72668SfY;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String staticAvatarUri = str;
        o.LJIIIZ(staticAvatarUri, "staticAvatarUri");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bitmap uploaded ");
        LIZ.append(staticAvatarUri);
        LIZ.append(", ");
        LIZ.append(System.currentTimeMillis() - this.LJLIL);
        LIZ.append("ms");
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        C72712SgG.LIZIZ(this.LJLILLLLZI.LIZ, this.LJLJI, staticAvatarUri, this.LJLJJI.LJ(), this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
