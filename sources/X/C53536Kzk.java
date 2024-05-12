package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.notification.adapter.AdapterStableIdFixer;

/* renamed from: X.Kzk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53536Kzk extends AbstractC65781Prl implements InterfaceC65784Pro<AdapterStableIdFixer.Meta> {
    public static final C53536Kzk LJLIL = new C53536Kzk();

    public C53536Kzk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.notification.adapter.AdapterStableIdFixer$Meta, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AdapterStableIdFixer.Meta invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AdapterStableIdFixer.Meta meta = AdapterStableIdFixer.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("inbox_adapter_fixer", AdapterStableIdFixer.Meta.class, meta);
        if (LJIIIIZZ == 0) {
            return meta;
        }
        return LJIIIIZZ;
    }
}
