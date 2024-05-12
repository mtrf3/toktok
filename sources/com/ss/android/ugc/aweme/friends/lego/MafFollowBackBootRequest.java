package com.ss.android.ugc.aweme.friends.lego;

import X.AnonymousClass030;
import X.C221018lt;
import X.C53136KtI;
import X.C57124MbQ;
import X.EF7;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.MS5;
import X.RBX;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS47S1000000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MafFollowBackBootRequest implements EFM {
    public String LJLIL = "";

    @Override // X.EEY
    public final String key() {
        return "MafFollowBackBootRequest";
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

    @Override // X.EFM
    public final EFN type() {
        if (o.LJ("local_test", EF7.LJIILIIL)) {
            return EFN.P0;
        }
        return EFN.NORMAL;
    }

    public final void LIZLLL() {
        if (!C53136KtI.LIZ()) {
            C221018lt.LJFF("MafFollowBackBootRequest", "report filter. Not hit experiment");
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null) {
            C221018lt.LJFF("MafFollowBackBootRequest", "report filter. User is null");
            return;
        }
        if (curUser.historyMaxFollowerCount > 1000) {
            C221018lt.LJFF("MafFollowBackBootRequest", "report filter. History max follower count is not meet expectations");
            return;
        }
        String uid = curUser.getUid();
        if (TextUtils.isEmpty(uid) || o.LJ(CardStruct.IStatusCode.DEFAULT, uid)) {
            C221018lt.LJFF("MafFollowBackBootRequest", "report filter. User info is empty");
        } else {
            this.LJLIL = uid;
            MS5.LIZ(new AqS47S1000000_9(uid, 1));
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        ((RBX) HG3.LJIILL()).addUserChangeListener(new C57124MbQ(this));
        LIZLLL();
    }
}
