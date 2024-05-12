package X;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PTo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64512PTo implements InterfaceC64510PTm<String>, InterfaceC64509PTl<String> {
    public final InterfaceC64510PTm<String> LIZ;
    public InterfaceC64509PTl<String> LIZIZ;
    public C64515PTr LIZJ;

    public C64512PTo(C64511PTn c64511PTn) {
        this.LIZ = c64511PTn;
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZ(C32420Cnw c32420Cnw, int i) {
        InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
        if (interfaceC64509PTl == null) {
            return;
        }
        interfaceC64509PTl.LIZ(c32420Cnw, i);
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZIZ(C32420Cnw c32420Cnw, C32425Co1 c32425Co1) {
        InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
        if (interfaceC64509PTl == null) {
            return;
        }
        interfaceC64509PTl.LIZIZ(c32420Cnw, c32425Co1);
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZJ(C32420Cnw request, String str) {
        String str2 = str;
        if (this.LIZJ != null) {
            o.LJIIIZ(request, "request");
        }
        String str3 = null;
        try {
            str3 = str2.substring(0, str2.lastIndexOf("/"));
            C31816CeC.LIZ(str2, str3);
            InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
            if (interfaceC64509PTl != null) {
                interfaceC64509PTl.LIZJ(request, str3);
            }
            C16880lQ.LLLZZIL(new File(str2));
        } catch (Exception e) {
            LIZIZ(request, new C32427Co3("unzip exception", e, request));
            if (str3 != null) {
                C78934UyQ.LJJI(new File(str3));
            }
        }
        if (this.LIZJ != null) {
            o.LJIIIZ(request, "request");
            long nanoTime = System.nanoTime();
            Iterator it = ((CopyOnWriteArrayList) PU0.LJI().LIZJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC64518PTu) it.next()).LJFF(nanoTime, request);
            }
        }
    }

    @Override // X.InterfaceC64510PTm
    public final void LIZLLL(C32420Cnw c32420Cnw, InterfaceC64509PTl<String> interfaceC64509PTl) {
        this.LIZIZ = interfaceC64509PTl;
        this.LIZ.LIZLLL(c32420Cnw, this);
    }
}
