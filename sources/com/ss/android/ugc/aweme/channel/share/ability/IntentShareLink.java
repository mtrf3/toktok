package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC62625Ohx;
import X.C62508Og4;
import X.OYP;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* loaded from: classes11.dex */
public final class IntentShareLink extends AbsIntentShare {
    public final ShareContentType LJLIL = ShareContentType.LINK;

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final ShareContentType LIZJ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final AbstractC62625Ohx LIZ(Context context, C62508Og4 c62508Og4) {
        return new OYP(c62508Og4.LJLIL, AbsIntentShare.LJ(c62508Og4), AbsIntentShare.LIZLLL(c62508Og4));
    }
}
