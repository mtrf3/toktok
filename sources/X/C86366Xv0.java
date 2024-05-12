package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xv0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86366Xv0 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C86366Xv0 LJLIL = new C86366Xv0();

    public C86366Xv0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        try {
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            o.LJIIIIZZ(currentUserID, "get()\n                .g…class.java).currentUserID");
            j = CastLongProtector.parseLong(currentUserID);
        } catch (Exception unused) {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
