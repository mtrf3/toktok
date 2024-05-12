package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.A5r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25671A5r extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C25671A5r LJLIL = new C25671A5r();

    public C25671A5r() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(CastLongProtector.parseLong(AccountService.LJIJ().LJFF().getCurUserId()));
    }
}
