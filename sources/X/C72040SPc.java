package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.tiktok.tpsc.data.restriction.PrivacyRestrictionResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.o;

/* renamed from: X.SPc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72040SPc<T> implements InterfaceC64592gB {
    public static final C72040SPc<T> LJLIL = new C72040SPc<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem;
        PrivacyRestrictionResponse resp = (PrivacyRestrictionResponse) obj;
        o.LJIIIIZZ(resp, "resp");
        C72039SPb.LJII(resp);
        PrivacySettingsRestriction privacySettingsRestriction = resp.getPrivacySettingsRestriction();
        if (privacySettingsRestriction != null) {
            privacySettingsRestrictionItem = C78939UyV.LJJI(privacySettingsRestriction, 0, "group_chat");
        } else {
            privacySettingsRestrictionItem = null;
        }
        String LIZ = C72052SPo.LIZ();
        if (LIZ == null || LIZ.length() == 0 || privacySettingsRestrictionItem == null) {
            return;
        }
        C72051SPn.LIZIZ.storeString(LIZ, GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), privacySettingsRestrictionItem));
    }
}
