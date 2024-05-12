package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui;

import X.C102303zu;
import X.C3SQ;
import X.C4LD;
import X.C62374Odu;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InvitationCardSharePackage extends LinkDefaultSharePackage {
    public static final C3SQ Companion = new Object() { // from class: X.3SQ
    };
    public InterfaceC65784Pro<C76800UCe> showToast;

    public InvitationCardSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(2, channel.key());
        C102303zu.LIZ("share", channel.key());
        return false;
    }
}
