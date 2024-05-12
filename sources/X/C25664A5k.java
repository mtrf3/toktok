package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.A5k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25664A5k extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C25664A5k LJLIL = new C25664A5k();

    public C25664A5k() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(CastLongProtector.parseLong(AccountService.LJIJ().LJFF().getCurUserId()));
    }
}
