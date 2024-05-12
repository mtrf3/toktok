package com.bytedance.poplayer;

import X.C221108m2;
import X.C5H3;
import X.InterfaceC55643Lsd;
import X.M74;
import android.view.View;
import com.bytedance.poplayer.IPopupTask;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public abstract class BasePopupTask<Popup> extends M74 implements IPopupTask<Popup> {
    public final C5H3 generic$delegate;

    public /* synthetic */ BasePopupTask(InterfaceC55643Lsd interfaceC55643Lsd, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC55643Lsd);
    }

    private final Class<?> getGeneric() {
        return (Class) this.generic$delegate.getValue();
    }

    public BasePopupTask(InterfaceC55643Lsd interfaceC55643Lsd) {
        super(interfaceC55643Lsd);
        this.generic$delegate = C221108m2.LIZIZ(new AqS159S0100000_9(this, 34));
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public View getRootView(Popup popup) {
        return IPopupTask.DefaultImpls.getRootView(this, popup);
    }
}
