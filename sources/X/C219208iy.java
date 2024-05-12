package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService;
import com.ss.android.ugc.tiktok.addyours.service.InviteFriendsServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219208iy implements IInviteFriendsService {
    public static final C219208iy LIZIZ = new C219208iy();
    public final /* synthetic */ IInviteFriendsService LIZ;

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC218828iM> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC218828iM> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final void LIZJ(Context context, Class<? extends InterfaceC218828iM> behaviorClass, InterfaceC88472Yns<? super C169576l7, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(behaviorClass, "behaviorClass");
        this.LIZ.LIZJ(context, behaviorClass, interfaceC88472Yns);
    }

    public C219208iy() {
        IInviteFriendsService iInviteFriendsService;
        Object LIZ = C58096Mr6.LIZ(IInviteFriendsService.class, false);
        if (LIZ != null) {
            iInviteFriendsService = (IInviteFriendsService) LIZ;
        } else {
            if (C58096Mr6.N8 == null) {
                synchronized (IInviteFriendsService.class) {
                    if (C58096Mr6.N8 == null) {
                        C58096Mr6.N8 = new InviteFriendsServiceImpl();
                    }
                }
            }
            iInviteFriendsService = C58096Mr6.N8;
        }
        this.LIZ = iInviteFriendsService;
    }
}
