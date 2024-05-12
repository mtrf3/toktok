package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C62374Odu;
import X.C62388Oe8;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class VideoCollectionSharePackage extends LinkDefaultSharePackage {
    public InterfaceC65784Pro<C76800UCe> channelHook;
    public static final C62388Oe8 Companion = new C62388Oe8();
    public static final int $stable = 8;

    public VideoCollectionSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.channelHook;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        } else {
            super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
        }
    }
}
