package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting;

/* renamed from: X.Kxf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53407Kxf extends AbstractC65781Prl implements InterfaceC65784Pro<ReverseInboxNotifyMetaSetting.Meta> {
    public static final C53407Kxf LJLIL = new C53407Kxf();

    public C53407Kxf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting$Meta] */
    @Override // X.InterfaceC65784Pro
    public final ReverseInboxNotifyMetaSetting.Meta invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ReverseInboxNotifyMetaSetting.Meta meta = ReverseInboxNotifyMetaSetting.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("inbox_reverse_notification_meta", ReverseInboxNotifyMetaSetting.Meta.class, meta);
        if (LJIIIIZZ == 0) {
            ReverseInboxNotifyMetaSetting.LIZ.getClass();
            return meta;
        }
        return LJIIIIZZ;
    }
}
