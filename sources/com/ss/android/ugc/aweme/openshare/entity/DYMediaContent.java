package com.ss.android.ugc.aweme.openshare.entity;

import X.C45279Hpr;
import X.InterfaceC45278Hpq;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DYMediaContent {
    public static final C45279Hpr Companion = new C45279Hpr();
    public InterfaceC45278Hpq mMediaObject;

    public final boolean checkArgs() {
        InterfaceC45278Hpq interfaceC45278Hpq = this.mMediaObject;
        o.LJI(interfaceC45278Hpq);
        return interfaceC45278Hpq.LIZ();
    }

    public final int getType() {
        InterfaceC45278Hpq interfaceC45278Hpq = this.mMediaObject;
        if (interfaceC45278Hpq == null) {
            return 0;
        }
        o.LJI(interfaceC45278Hpq);
        return interfaceC45278Hpq.type();
    }

    public DYMediaContent() {
    }

    public final InterfaceC45278Hpq getMMediaObject() {
        return this.mMediaObject;
    }

    public DYMediaContent(InterfaceC45278Hpq interfaceC45278Hpq) {
        this.mMediaObject = interfaceC45278Hpq;
    }

    public final void setMMediaObject(InterfaceC45278Hpq interfaceC45278Hpq) {
        this.mMediaObject = interfaceC45278Hpq;
    }
}
