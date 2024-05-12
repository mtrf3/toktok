package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.service.InviteFriendsService;
import com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Mbb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57135Mbb implements IInviteFriendsService {
    public static final C57135Mbb LIZIZ = new C57135Mbb();
    public final /* synthetic */ IInviteFriendsService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC62585OhJ LIZ(Context context, Bundle bundle, String str, String str2, AqS157S0200000_10 aqS157S0200000_10, AqS157S0200000_10 aqS157S0200000_102) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZ(context, bundle, str, str2, aqS157S0200000_10, aqS157S0200000_102);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57138Mbe LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57133MbZ LIZJ(ActivityC45651qj context, boolean z) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZJ(context, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC57137Mbd LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC55759LuV LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC55760LuW LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC108804Ou LJII(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJII(context, bundle);
    }

    public C57135Mbb() {
        IInviteFriendsService iInviteFriendsService;
        Object LIZ = C58096Mr6.LIZ(IInviteFriendsService.class, false);
        if (LIZ != null) {
            iInviteFriendsService = (IInviteFriendsService) LIZ;
        } else {
            if (C58096Mr6.x4 == null) {
                synchronized (IInviteFriendsService.class) {
                    if (C58096Mr6.x4 == null) {
                        C58096Mr6.x4 = new InviteFriendsService();
                    }
                }
            }
            iInviteFriendsService = C58096Mr6.x4;
        }
        this.LIZ = iInviteFriendsService;
    }
}
