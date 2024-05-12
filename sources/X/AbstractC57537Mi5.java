package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Mi5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57537Mi5<T> implements InterfaceC62173Oaf, WeakHandler.IHandler {
    public T mData;
    public boolean mIsLoading;
    public List<C8BT> mNotifyListeners;
    public int mQueryType = 1;
    public WeakHandler mHandler = new WeakHandler(C16880lQ.LLJJJJ(), this);

    public void clearAllNotifyListener() {
        List<C8BT> list = this.mNotifyListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // X.InterfaceC62173Oaf
    public void onDestroy() {
        clearAllNotifyListener();
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
        this.mIsLoading = false;
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
}
