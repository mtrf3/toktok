package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.BcX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29165BcX implements InterfaceC28921BWr {
    public final List<InterfaceC29176Bci> LJLIL;

    @Override // X.InterfaceC29176Bci
    public final void onStartLive() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC29176Bci) it.next()).onStartLive();
        }
    }

    @Override // X.InterfaceC29168Bca
    public final void uc() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            InterfaceC29176Bci interfaceC29176Bci = (InterfaceC29176Bci) it.next();
            if (interfaceC29176Bci instanceof InterfaceC29168Bca) {
                ((InterfaceC29168Bca) interfaceC29176Bci).uc();
            }
        }
    }

    public C29165BcX() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJLIL = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new BPS());
    }

    @Override // X.InterfaceC29168Bca
    public final void f2(int i) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            InterfaceC29176Bci interfaceC29176Bci = (InterfaceC29176Bci) it.next();
            if (interfaceC29176Bci instanceof InterfaceC29168Bca) {
                ((InterfaceC29168Bca) interfaceC29176Bci).f2(i);
            }
        }
    }

    @Override // X.InterfaceC29168Bca
    public final void fg(int i, DataChannel dataChannel) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            InterfaceC29176Bci interfaceC29176Bci = (InterfaceC29176Bci) it.next();
            if (interfaceC29176Bci instanceof InterfaceC29168Bca) {
                ((InterfaceC29168Bca) interfaceC29176Bci).fg(i, dataChannel);
            }
        }
    }

    @Override // X.InterfaceC29168Bca
    public final void i6(int i, DataChannel dataChannel) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            InterfaceC29176Bci interfaceC29176Bci = (InterfaceC29176Bci) it.next();
            if (interfaceC29176Bci instanceof InterfaceC29168Bca) {
                ((InterfaceC29168Bca) interfaceC29176Bci).i6(i, dataChannel);
            }
        }
    }
}
