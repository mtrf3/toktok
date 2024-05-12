package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C62374Odu;
import X.C62397OeH;
import X.C62558Ogs;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveEventSharePackage extends LinkDefaultSharePackage {
    public static final int $stable = 0;
    public static final C62558Ogs Companion = new C62558Ogs();

    public LiveEventSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C62397OeH.LIZJ().LIZ(0, channel.key());
        return false;
    }
}
