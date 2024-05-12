package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData;

/* renamed from: X.8QM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QM extends AbstractC65781Prl implements InterfaceC65784Pro<FeedComponentsData> {
    public static final C8QM LJLIL = new C8QM();

    public C8QM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FeedComponentsData invoke() {
        try {
            return C8QN.LJ((FeedComponentsData) C8QK.LIZ.getValue(), "For You");
        } catch (Throwable unused) {
            return null;
        }
    }
}
