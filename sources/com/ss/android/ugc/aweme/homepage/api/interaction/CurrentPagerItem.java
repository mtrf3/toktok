package com.ss.android.ugc.aweme.homepage.api.interaction;

import X.C54166LNq;
import X.InterfaceC54167LNr;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CurrentPagerItem extends MutableLiveData<Integer> {
    public InterfaceC54167LNr bridge = new C54166LNq();
    public boolean isRealBridgeSet;

    @Override // androidx.lifecycle.LiveData
    public Integer getValue() {
        return Integer.valueOf(this.bridge.getValue());
    }

    public final InterfaceC54167LNr getBridge() {
        return this.bridge;
    }

    public final boolean isRealBridgeSet() {
        return this.isRealBridgeSet;
    }

    public final void setBridge(InterfaceC54167LNr value) {
        o.LJIIIZ(value, "value");
        this.isRealBridgeSet = true;
        this.bridge = value;
    }

    public final void setRealBridgeSet(boolean z) {
        this.isRealBridgeSet = z;
    }

    public void setValue(int i) {
        this.bridge.LIZ(i);
        super.setValue((CurrentPagerItem) Integer.valueOf(i));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    public final void setValue(int i, boolean z) {
        setValue(i, z, true);
    }

    public final void setValue(int i, boolean z, boolean z2) {
        this.bridge.LIZIZ(i, z);
        if (z2) {
            super.setValue((CurrentPagerItem) Integer.valueOf(i));
        }
    }
}
