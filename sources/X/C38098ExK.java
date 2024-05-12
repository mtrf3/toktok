package X;

import Y.AObjectS84S0300000_14;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.ExK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38098ExK implements InterfaceC37980EvQ {
    public final /* synthetic */ C37940Eum LIZ;

    @Override // X.InterfaceC37980EvQ
    public final void LIZJ(String eventName) {
        o.LJIIJ(eventName, "eventName");
    }

    public C38098ExK(C37940Eum c37940Eum) {
        this.LIZ = c37940Eum;
    }

    @Override // X.InterfaceC37980EvQ
    public final void LIZ(C37977EvN c37977EvN) {
        EnumC39924Flg enumC39924Flg;
        EnumC39924Flg enumC39924Flg2;
        InterfaceC60761Nsz interfaceC60761Nsz;
        Object obj;
        boolean z;
        InterfaceC60761Nsz interfaceC60761Nsz2;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        InterfaceC60761Nsz interfaceC60761Nsz3;
        Object obj2;
        InterfaceC60761Nsz interfaceC60761Nsz4;
        C60737Nsb hybridContext2;
        InterfaceC60710NsA interfaceC60710NsA2;
        long currentTimeMillis = System.currentTimeMillis();
        WeakReference<InterfaceC60761Nsz> weakReference = this.LIZ.LJLJJI;
        if (weakReference == null || weakReference.get() == null || TextUtils.isEmpty(c37977EvN.LIZ)) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC37980EvQ) it.next()).LIZ(c37977EvN);
        }
        WeakReference<InterfaceC60761Nsz> weakReference2 = this.LIZ.LJLJJI;
        C76800UCe c76800UCe = null;
        if (weakReference2 != null && (interfaceC60761Nsz4 = weakReference2.get()) != null && (hybridContext2 = interfaceC60761Nsz4.getHybridContext()) != null && (interfaceC60710NsA2 = hybridContext2.hybridParams) != null) {
            enumC39924Flg = interfaceC60710NsA2.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg == EnumC39924Flg.LYNX) {
            WeakReference<InterfaceC60761Nsz> weakReference3 = this.LIZ.LJLJJI;
            if (weakReference3 != null) {
                interfaceC60761Nsz3 = weakReference3.get();
            } else {
                interfaceC60761Nsz3 = null;
            }
            if (interfaceC60761Nsz3 instanceof VNS) {
                C38164EyO c38164EyO = new C38164EyO();
                c38164EyO.LJLJJI = c37977EvN.LIZ;
                C37940Eum c37940Eum = this.LIZ;
                Integer num = c37977EvN.LIZIZ;
                c37940Eum.getClass();
                c38164EyO.LJLILLLLZI = C37940Eum.LJIIZILJ(num);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("initState: ");
                LIZ.append(this.LIZ.LJLLI);
                LIZ.append(" ,releasedState: ");
                LIZ.append(this.LIZ.LJLLILLLL);
                LIZ.append(" ,code: ");
                LIZ.append(c37977EvN.LIZIZ);
                LIZ.append(", ");
                LIZ.append("msg: ");
                C1DI.LIZIZ(LIZ, c37977EvN.LIZJ, ", ", "isRunInMainThread: ");
                LIZ.append(c37977EvN.LJII);
                c38164EyO.LJLJI = X1D.LIZIZ(LIZ);
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                WeakReference<InterfaceC60761Nsz> weakReference4 = this.LIZ.LJLJJI;
                if (weakReference4 != null && (obj2 = (InterfaceC60761Nsz) weakReference4.get()) != null) {
                    lynxViewMonitor.reportJsbError((VNS) obj2, c38164EyO);
                    LIZLLL(c37977EvN, currentTimeMillis);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type com.lynx.tasm.LynxView");
            }
        }
        WeakReference<InterfaceC60761Nsz> weakReference5 = this.LIZ.LJLJJI;
        if (weakReference5 != null && (interfaceC60761Nsz2 = weakReference5.get()) != null && (hybridContext = interfaceC60761Nsz2.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null) {
            enumC39924Flg2 = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg2 = null;
        }
        if (enumC39924Flg2 != EnumC39924Flg.WEB) {
            return;
        }
        WeakReference<InterfaceC60761Nsz> weakReference6 = this.LIZ.LJLJJI;
        if (weakReference6 != null) {
            interfaceC60761Nsz = weakReference6.get();
        } else {
            interfaceC60761Nsz = null;
        }
        if (!(interfaceC60761Nsz instanceof WebView)) {
            return;
        }
        C38101ExN c38101ExN = new C38101ExN();
        c38101ExN.LIZLLL = c37977EvN.LIZLLL;
        c38101ExN.LIZJ = c37977EvN.LIZ;
        C37940Eum c37940Eum2 = this.LIZ;
        Integer num2 = c37977EvN.LIZIZ;
        c37940Eum2.getClass();
        c38101ExN.LIZ = C37940Eum.LJIIZILJ(num2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initState: ");
        LIZ2.append(this.LIZ.LJLLI);
        LIZ2.append(", releasedState: ");
        LIZ2.append(this.LIZ.LJLLILLLL);
        LIZ2.append(", code: ");
        LIZ2.append(c37977EvN.LIZIZ);
        LIZ2.append(", ");
        LIZ2.append("msg: ");
        C1DI.LIZIZ(LIZ2, c37977EvN.LIZJ, ", ", "isRunInMainThread: ");
        LIZ2.append(c37977EvN.LJII);
        c38101ExN.LIZIZ = X1D.LIZIZ(LIZ2);
        try {
            String str = c37977EvN.LIZLLL;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str2 = c38101ExN.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str2);
                LIZ3.append(", error_host = ");
                LIZ3.append(c37977EvN.LIZLLL);
                c38101ExN.LIZIZ = X1D.LIZIZ(LIZ3);
            } else {
                android.net.Uri parse = UriProtector.parse(c37977EvN.LIZLLL);
                if (parse != null) {
                    String str3 = c38101ExN.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str3);
                    LIZ4.append(", error_host = ");
                    LIZ4.append(parse.getAuthority());
                    LIZ4.append(", error_path = ");
                    LIZ4.append(parse.getPath());
                    c38101ExN.LIZIZ = X1D.LIZIZ(LIZ4);
                    c76800UCe = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(c76800UCe);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        VMI vmi = VMI.LJ;
        WeakReference<InterfaceC60761Nsz> weakReference7 = this.LIZ.LJLJJI;
        if (weakReference7 != null && (obj = (InterfaceC60761Nsz) weakReference7.get()) != null) {
            vmi.getClass();
            C38045EwT.LIZ(new AObjectS84S0300000_14(vmi, (WebView) obj, c38101ExN, 0));
            LJ(c37977EvN, currentTimeMillis);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.webkit.WebView");
    }

    @Override // X.InterfaceC37980EvQ
    public final void LIZIZ(C37977EvN c37977EvN) {
        EnumC39924Flg enumC39924Flg;
        EnumC39924Flg enumC39924Flg2;
        InterfaceC60761Nsz interfaceC60761Nsz;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        InterfaceC60761Nsz interfaceC60761Nsz2;
        InterfaceC60761Nsz interfaceC60761Nsz3;
        C60737Nsb hybridContext2;
        InterfaceC60710NsA interfaceC60710NsA2;
        long currentTimeMillis = System.currentTimeMillis();
        WeakReference<InterfaceC60761Nsz> weakReference = this.LIZ.LJLJJI;
        if (weakReference == null || weakReference.get() == null || TextUtils.isEmpty(c37977EvN.LIZ)) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC37980EvQ) it.next()).LIZIZ(c37977EvN);
        }
        WeakReference<InterfaceC60761Nsz> weakReference2 = this.LIZ.LJLJJI;
        InterfaceC60761Nsz interfaceC60761Nsz4 = null;
        if (weakReference2 != null && (interfaceC60761Nsz3 = weakReference2.get()) != null && (hybridContext2 = interfaceC60761Nsz3.getHybridContext()) != null && (interfaceC60710NsA2 = hybridContext2.hybridParams) != null) {
            enumC39924Flg = interfaceC60710NsA2.getType();
        } else {
            enumC39924Flg = null;
        }
        if (enumC39924Flg == EnumC39924Flg.LYNX) {
            WeakReference<InterfaceC60761Nsz> weakReference3 = this.LIZ.LJLJJI;
            if (weakReference3 != null) {
                interfaceC60761Nsz2 = weakReference3.get();
            } else {
                interfaceC60761Nsz2 = null;
            }
            if (interfaceC60761Nsz2 instanceof VNS) {
                LIZLLL(c37977EvN, currentTimeMillis);
                return;
            }
        }
        WeakReference<InterfaceC60761Nsz> weakReference4 = this.LIZ.LJLJJI;
        if (weakReference4 != null && (interfaceC60761Nsz = weakReference4.get()) != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null) {
            enumC39924Flg2 = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg2 = null;
        }
        if (enumC39924Flg2 != EnumC39924Flg.WEB) {
            return;
        }
        WeakReference<InterfaceC60761Nsz> weakReference5 = this.LIZ.LJLJJI;
        if (weakReference5 != null) {
            interfaceC60761Nsz4 = weakReference5.get();
        }
        if (!(interfaceC60761Nsz4 instanceof WebView)) {
            return;
        }
        LJ(c37977EvN, currentTimeMillis);
    }

    public final void LIZLLL(C37977EvN c37977EvN, long j) {
        long j2;
        Object obj;
        C38162EyM c38162EyM = new C38162EyM();
        c38162EyM.LJLILLLLZI = c37977EvN.LIZ;
        C37940Eum c37940Eum = this.LIZ;
        Integer num = c37977EvN.LIZIZ;
        c37940Eum.getClass();
        c38162EyM.LJLJI = C37940Eum.LJIIZILJ(num);
        String str = c37977EvN.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(", isRunInMainThread: ");
        LIZ.append(c37977EvN.LJII);
        c38162EyM.LJLJJI = o.LJIILLIIL(X1D.LIZIZ(LIZ), str);
        Long l = c37977EvN.LJ;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        c38162EyM.LJLJJLL = j2;
        if (j2 != 0) {
            c38162EyM.LJLJL = j;
            c38162EyM.LJLJJL = j - j2;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        WeakReference<InterfaceC60761Nsz> weakReference = this.LIZ.LJLJJI;
        if (weakReference != null && (obj = (InterfaceC60761Nsz) weakReference.get()) != null) {
            lynxViewMonitor.reportJsbInfo((VNS) obj, c38162EyM);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.lynx.tasm.LynxView");
    }

    public final void LJ(C37977EvN c37977EvN, long j) {
        long j2;
        Object obj;
        C38099ExL c38099ExL = new C38099ExL();
        c38099ExL.LIZ = c37977EvN.LIZ;
        C37940Eum c37940Eum = this.LIZ;
        Integer num = c37977EvN.LIZIZ;
        c37940Eum.getClass();
        c38099ExL.LIZIZ = C37940Eum.LJIIZILJ(num);
        String str = c37977EvN.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(", isRunInMainThread: ");
        LIZ.append(c37977EvN.LJII);
        c38099ExL.LIZJ = o.LJIILLIIL(X1D.LIZIZ(LIZ), str);
        Long l = c37977EvN.LJ;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        c38099ExL.LJ = j2;
        if (j2 != 0) {
            c38099ExL.LJFF = j;
            c38099ExL.LIZLLL = j - j2;
        }
        VMI vmi = VMI.LJ;
        WeakReference<InterfaceC60761Nsz> weakReference = this.LIZ.LJLJJI;
        if (weakReference != null && (obj = (InterfaceC60761Nsz) weakReference.get()) != null) {
            vmi.getClass();
            C38045EwT.LIZ(new AObjectS84S0300000_14(vmi, (WebView) obj, c38099ExL, 1));
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.webkit.WebView");
    }
}
