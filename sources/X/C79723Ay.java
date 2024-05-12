package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.3Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79723Ay implements IEvent {
    public final PrivacyUserSettingsV2 LJLIL;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public C79723Ay(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        this.LJLIL = privacyUserSettingsV2;
    }
}
