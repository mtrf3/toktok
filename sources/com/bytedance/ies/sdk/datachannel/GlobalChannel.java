package com.bytedance.ies.sdk.datachannel;

import X.InterfaceC32539Cpr;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public class GlobalChannel<O> extends NextLiveData<O> implements InterfaceC32539Cpr<O> {
    public final boolean keepInMemory;

    public final boolean getKeepInMemory$live_datachannel_release() {
        return this.keepInMemory;
    }

    public GlobalChannel(boolean z) {
        this.keepInMemory = z;
    }

    public GlobalChannel(O o, boolean z) {
        super(o);
        this.keepInMemory = z;
    }

    public /* synthetic */ GlobalChannel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ GlobalChannel(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? false : z);
    }
}
