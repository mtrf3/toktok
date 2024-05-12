package X;

import com.ss.android.ugc.aweme.inbox.InboxRefresh;

/* renamed from: X.Yad, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87651Yad extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87651Yad LJLIL = new C87651Yad();

    public C87651Yad() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((InboxRefresh) C87652Yae.LIZIZ.getValue()).getRefreshByTabChange());
    }
}
