package com.ss.android.ugc.aweme.notification.lego;

import X.AnonymousClass030;
import X.C10K;
import X.C56894MUo;
import X.C78580Usi;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.RBX;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FetchTutorialVideoRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchTutorialVideoRequest";
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
        return EFN.NORMAL;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Keva repo = Keva.getRepo("top_message_keva_repo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("msg_id_");
        LIZ.append(curUserId);
        String msgId = repo.getString(X1D.LIZIZ(LIZ), "");
        long LIZIZ = C78580Usi.LIZIZ("first_show_time_", curUserId, repo, 0L);
        long LIZIZ2 = C78580Usi.LIZIZ("current_show_time_", curUserId, repo, 0L);
        int LIZJ = i0.LIZJ("clicked_", curUserId, repo, 0);
        o.LJIIIIZZ(msgId, "msgId");
        TutorialVideoApiManager.LIZ.getTutorialVideoAndPoint(msgId, LIZIZ, LIZIZ2, LIZJ).LJIILLIIL(new C56894MUo(this, msgId), C10K.LJIIIIZZ);
    }
}
