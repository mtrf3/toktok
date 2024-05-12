package X;

import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;

/* renamed from: X.OcX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62289OcX extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C62289OcX LJLIL = new C62289OcX();

    public C62289OcX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String str;
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ == null || (str = LIZ.operationName) == null) {
            return "";
        }
        return str;
    }
}
