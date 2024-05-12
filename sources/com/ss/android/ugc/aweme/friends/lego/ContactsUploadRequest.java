package com.ss.android.ugc.aweme.friends.lego;

import X.AnonymousClass030;
import X.C239709aw;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC58085Mqv;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;

/* loaded from: classes7.dex */
public final class ContactsUploadRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "ContactsUploadRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.IDLE;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (Keva.getRepo("friendslist_permission_keva_name").getLong("contact_upload_next_time_key", 0L) < System.currentTimeMillis()) {
            C239709aw.LIZIZ(EnumC58085Mqv.COLD_START);
        }
    }
}
