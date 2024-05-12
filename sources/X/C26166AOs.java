package X;

import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.AOs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26166AOs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26166AOs LJLIL = new C26166AOs();

    public C26166AOs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(AccountService.LJIJ().LJFF().isChildrenMode());
    }
}
