package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentComboTraySetting;

/* renamed from: X.BoX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29909BoX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29909BoX LJLIL = new C29909BoX();

    public C29909BoX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveCommentComboTraySetting.INSTANCE.enableCommentComboTray());
    }
}
