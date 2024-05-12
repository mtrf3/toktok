package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C16880lQ;
import X.C4LD;
import X.C62374Odu;
import X.C62386Oe6;
import X.C73969T1h;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OYF;
import X.T16;
import Y.AfS22S0400000_10;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveSharePackage extends LinkDefaultSharePackage {
    public static final int $stable = 0;
    public static final C62386Oe6 Companion = new C62386Oe6();

    public LiveSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        if (!o.LJ(channel.key(), "snapchat")) {
            return false;
        }
        try {
            OYF.LIZLLL(channel, this.url, this.itemType).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS22S0400000_10(this, channel, context, interfaceC88472Yns, 0));
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }
}
