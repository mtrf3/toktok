package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.C61878OQg;
import X.C62055OXb;
import X.C62313Ocv;
import X.C62374Odu;
import X.C76800UCe;
import X.C78857UxB;
import X.EF7;
import X.InterfaceC62225ObV;
import X.InterfaceC88472Yns;
import X.ORZ;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MultiImageSharePackage extends WebSharePackage {
    public static final C62055OXb Companion = new C62055OXb();
    public List<String> localImagePaths;

    public MultiImageSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        this.localImagePaths = C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        if (o.LJ(channel.key(), "facebook") && (!this.localImagePaths.isEmpty()) && C78857UxB.LJJIZ(EF7.LIZIZ(), "com.facebook.katana")) {
            Uri EMPTY = Uri.EMPTY;
            o.LJIIIIZZ(EMPTY, "EMPTY");
            interfaceC88472Yns.invoke(new C62313Ocv(EMPTY, (String) ORZ.LJLLJ(this.localImagePaths), null, null, null, this.localImagePaths, true, 60));
            return;
        }
        super.LJIILIIL(channel, interfaceC88472Yns);
    }
}
