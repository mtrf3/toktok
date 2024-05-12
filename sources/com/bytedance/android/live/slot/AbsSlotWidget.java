package com.bytedance.android.live.slot;

import X.A72;
import X.C71188Rwm;
import X.EnumC29188Bcu;
import X.InterfaceC31710CcU;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AbsSlotWidget<W, VM extends ViewModel, T extends Enum<T>> implements InterfaceC31710CcU<W, VM, T> {
    public ViewModel LJLIL;
    public A72 LJLILLLLZI;

    @Override // X.InterfaceC31710CcU
    public List<EnumC29188Bcu> LLJJJ() {
        return null;
    }

    @Override // X.InterfaceC31710CcU
    public boolean LLJJJJJIL() {
        return this instanceof C71188Rwm;
    }

    @Override // X.InterfaceC31710CcU
    public void LLJJL(String str) {
    }

    @Override // X.InterfaceC31710CcU
    public List<Integer> getMessageType() {
        return null;
    }

    public void onAggregateClick() {
    }

    public void onAggregateExposure(String str) {
    }

    @Override // X.InterfaceC31710CcU
    public void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC31710CcU
    public void onDestroy() {
    }

    @Override // X.InterfaceC31710CcU
    public void onDispose() {
    }

    @Override // X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
    }

    @Override // X.InterfaceC31710CcU
    public void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC31710CcU
    public void onPause() {
    }

    @Override // X.InterfaceC31710CcU
    public void onResume() {
    }

    @Override // X.InterfaceC31710CcU
    public void onStart() {
    }

    @Override // X.InterfaceC31710CcU
    public void onStop() {
    }

    @Override // X.InterfaceC31710CcU
    public void LLJJJJ(VM vm, A72 a72) {
        this.LJLIL = vm;
        this.LJLILLLLZI = a72;
    }
}
