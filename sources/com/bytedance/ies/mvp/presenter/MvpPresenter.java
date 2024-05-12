package com.bytedance.ies.mvp.presenter;

import X.C32022ChW;
import X.CallableC32024ChY;
import X.InterfaceC32025ChZ;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes6.dex */
public abstract class MvpPresenter<T, V extends InterfaceC32025ChZ<T>> implements WeakHandler.IHandler {
    public boolean isLoading;
    public Handler mHandler = new WeakHandler(this);
    public V mMvpView;

    public void attachView(V v) {
    }

    public void detachView() {
    }

    public abstract T doWork(Object... objArr);

    public boolean execute(Object... objArr) {
        return executeWithForceTag(false, objArr);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1001) {
            this.isLoading = false;
        }
    }

    public boolean executeWithForceTag(boolean z, Object... objArr) {
        if (this.isLoading && !z) {
            return false;
        }
        this.isLoading = true;
        C32022ChW.LIZIZ().LIZ(this.mHandler, new CallableC32024ChY(this, objArr), 1001);
        return true;
    }
}
