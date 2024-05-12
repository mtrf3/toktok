package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel;

import X.AbstractC62625Ohx;
import X.C62358Ode;
import X.C62374Odu;
import X.EF7;
import X.InterfaceC62225ObV;
import X.OYF;
import X.OYP;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GroupSharePackage extends SharePackage {
    public GroupSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC62625Ohx LJIIJJI(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        String LIZJ = OYF.LIZJ(channel, this.url, this.itemType);
        if (o.LJ(channel.key(), "twitter")) {
            LIZJ = EF7.LIZIZ().getString(R.string.gyu, LIZJ);
            o.LJIIIIZZ(LIZJ, "AppContextManager.getApp…ink_with_url, shortenUrl)");
        }
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        if (o.LJ(channel.key(), "email")) {
            return new OYP(LIZJ, this.title, LIZ);
        }
        return new OYP(LIZJ, LIZ, 4);
    }
}
