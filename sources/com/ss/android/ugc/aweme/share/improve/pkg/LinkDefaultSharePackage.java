package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.C4LD;
import X.C62358Ode;
import X.C62374Odu;
import X.C73969T1h;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OY6;
import X.OY8;
import X.OYF;
import X.T16;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class LinkDefaultSharePackage extends SharePackage {
    public static final OY8 Companion = new OY8();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDefaultSharePackage(C62374Odu builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        this.extras.putString("share_form", "url_form");
        OYF.LIZLLL(channel, this.url, this.itemType).LJIIJ(new OY6(this, channel, LIZ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 23));
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        return false;
    }
}
