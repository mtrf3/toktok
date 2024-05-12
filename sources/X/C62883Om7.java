package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;

/* renamed from: X.Om7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62883Om7 extends AbstractC65781Prl implements InterfaceC65784Pro<NewDislikeReason[]> {
    public static final C62883Om7 LJLIL = new C62883Om7();

    public C62883Om7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.share.dislike.NewDislikeReason[]] */
    @Override // X.InterfaceC65784Pro
    public final NewDislikeReason[] invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("new_dislike_reasons", NewDislikeReason[].class, null);
    }
}
