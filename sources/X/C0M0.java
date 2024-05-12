package X;

import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0M0, reason: invalid class name */
/* loaded from: classes.dex */
public class C0M0 {
    public final List<InterfaceC06150Lz> mObservers = new ArrayList();
    public List<InterfaceC06150Lz> mRemoveObservers = new ArrayList();
    public List<InterfaceC06150Lz> mAddObservers = new ArrayList();
    public volatile boolean haveRemove = false;
    public volatile boolean haveAdd = false;

    public void setup(Object obj) {
    }

    public void addMessageObserver(InterfaceC06150Lz interfaceC06150Lz) {
        synchronized (this.mObservers) {
            if (interfaceC06150Lz != null) {
                if (!this.mAddObservers.contains(interfaceC06150Lz)) {
                    this.mAddObservers.add(interfaceC06150Lz);
                    this.haveAdd = true;
                }
            }
        }
    }

    public void messageDispatchStarting(String str) {
        if (this.haveAdd) {
            synchronized (this.mObservers) {
                for (InterfaceC06150Lz interfaceC06150Lz : this.mAddObservers) {
                    if (!this.mObservers.contains(interfaceC06150Lz)) {
                        this.mObservers.add(interfaceC06150Lz);
                    }
                }
                this.mAddObservers.clear();
                this.haveAdd = false;
            }
        }
        for (InterfaceC06150Lz interfaceC06150Lz2 : this.mObservers) {
            if (interfaceC06150Lz2 != null) {
                interfaceC06150Lz2.LIZIZ(str);
            }
        }
    }

    public void removeMessageObserver(InterfaceC06150Lz interfaceC06150Lz) {
        synchronized (this.mObservers) {
            if (interfaceC06150Lz != null) {
                if (!this.mRemoveObservers.contains(interfaceC06150Lz)) {
                    this.mRemoveObservers.add(interfaceC06150Lz);
                    this.haveRemove = true;
                }
            }
        }
    }

    public void messageDispatched(String str, Message message) {
        for (InterfaceC06150Lz interfaceC06150Lz : this.mObservers) {
            if (interfaceC06150Lz != null) {
                interfaceC06150Lz.LIZ(str, message);
            }
        }
        if (this.haveRemove) {
            synchronized (this.mObservers) {
                for (InterfaceC06150Lz interfaceC06150Lz2 : this.mRemoveObservers) {
                    this.mObservers.remove(interfaceC06150Lz2);
                    this.mAddObservers.remove(interfaceC06150Lz2);
                }
                this.mRemoveObservers.clear();
                this.haveRemove = false;
            }
        }
    }
}
