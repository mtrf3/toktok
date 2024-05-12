package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8BS, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8BS<T> implements WeakHandler.IHandler {
    public T mData;
    public WeakHandler mHandler = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public boolean mIsLoading;
    public List<C8BT> mNotifyListeners;

    public abstract boolean checkParams(Object... objArr);

    public T getData() {
        return this.mData;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public void addNotifyListener(C8BT c8bt) {
        if (c8bt != null) {
            if (this.mNotifyListeners == null) {
                this.mNotifyListeners = new LinkedList();
            }
            this.mNotifyListeners.add(c8bt);
            return;
        }
        throw new NullPointerException("INotifyListener could not be null");
    }

    public void clearNotifyListener(C8BT c8bt) {
        List<C8BT> list;
        if (c8bt != null && (list = this.mNotifyListeners) != null) {
            list.remove(c8bt);
        }
    }

    public void handleData(T t) {
        this.mData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        resetLoadingStatus(message);
        Object obj = message.obj;
        if (obj instanceof Exception) {
            C16880lQ.LLLLIIL((Exception) obj);
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<C8BT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onFailed((Exception) message.obj);
                }
                return;
            }
            return;
        }
        handleData(obj);
        List<C8BT> list2 = this.mNotifyListeners;
        if (list2 != null) {
            Iterator<C8BT> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
    }

    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public boolean sendRequest(Object... objArr) {
        if (checkParams(objArr)) {
            this.mIsLoading = true;
            return true;
        }
        return false;
    }
}
