package com.ss.android.ugc.aweme.model;

import X.AbstractC62625Ohx;
import X.C4LD;
import X.C62358Ode;
import X.C62374Odu;
import X.C73969T1h;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OYB;
import X.OYF;
import X.T16;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class LinkDefaultSharePackageV2 extends SharePackage {
    public LinkDefaultSharePackageV2(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        this.extras.putString("share_form", "url_form");
        OYF.LIZLLL(channel, this.url, this.itemType).LJIIJ(new OYB(this, channel, LIZ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 18));
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        return false;
    }
}
