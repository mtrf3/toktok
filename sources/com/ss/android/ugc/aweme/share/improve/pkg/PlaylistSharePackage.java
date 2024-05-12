package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C62374Odu;
import X.C62564Ogy;
import X.InterfaceC62225ObV;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PlaylistSharePackage extends LinkDefaultSharePackage {
    public static final int $stable = 0;
    public static final C62564Ogy Companion = new C62564Ogy();

    public PlaylistSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        super.LIZIZ(context, channel);
        return false;
    }
}
