package X;

import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;

/* renamed from: X.OcY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62290OcY extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C62290OcY LJLIL = new C62290OcY();

    public C62290OcY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ != null) {
            return LIZ.operationIconResourceName;
        }
        return null;
    }
}
