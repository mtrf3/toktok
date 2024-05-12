package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.A4v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25649A4v extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C25649A4v LJLIL = new C25649A4v();

    public C25649A4v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(CastLongProtector.parseLong(AccountService.LJIJ().LJFF().getCurUserId()));
    }
}
