package X;

import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreSetting;

/* renamed from: X.CQe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31300CQe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31300CQe LJLIL = new C31300CQe();

    public C31300CQe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LivePublicScreenSpaceExploreSetting.getValue());
    }
}
