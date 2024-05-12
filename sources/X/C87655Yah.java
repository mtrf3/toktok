package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.InboxRefresh;

/* renamed from: X.Yah, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87655Yah extends AbstractC65781Prl implements InterfaceC65784Pro<InboxRefresh> {
    public static final C87655Yah LJLIL = new C87655Yah();

    public C87655Yah() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.inbox.InboxRefresh, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final InboxRefresh invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        InboxRefresh inboxRefresh = C87652Yae.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("inbox_redesign_refresh_config", InboxRefresh.class, inboxRefresh);
        if (LJIIIIZZ == 0) {
            return inboxRefresh;
        }
        return LJIIIIZZ;
    }
}
