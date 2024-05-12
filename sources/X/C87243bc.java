package X;

import com.ss.android.ugc.aweme.AccountService;

/* renamed from: X.3bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87243bc extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C87243bc LJLIL = new C87243bc();

    public C87243bc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return AccountService.LJIJ().LJFF().getCurSecUserId();
    }
}
