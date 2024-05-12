package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.util.Collections;

/* renamed from: X.Qjs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67840Qjs implements InterfaceC67836Qjo, ServiceConnection {
    @Override // X.InterfaceC67836Qjo
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC67836Qjo
    public final String LJI() {
        QH7.LJIIIIZZ(null);
        throw null;
    }

    @Override // X.InterfaceC67836Qjo
    public final String LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC67836Qjo
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC67836Qjo
    public final void LJIILIIL(InterfaceC67936QlQ interfaceC67936QlQ, java.util.Set<Scope> set) {
    }

    @Override // X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 0;
    }

    @Override // X.InterfaceC67836Qjo
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC67836Qjo
    public final void LJIIZILJ(String str, PrintWriter printWriter) {
    }

    @Override // X.InterfaceC67836Qjo
    public final void LJIJ(C67972Qm0 c67972Qm0) {
    }

    @Override // X.InterfaceC67836Qjo
    public final Feature[] LJIJI() {
        return new Feature[0];
    }

    static {
        C16880lQ.LJLLJ(ServiceConnectionC67840Qjs.class);
    }

    @Override // X.InterfaceC67836Qjo
    public final Intent LJFF() {
        return new Intent();
    }

    @Override // X.InterfaceC67836Qjo
    public final java.util.Set<Scope> LIZJ() {
        return Collections.emptySet();
    }

    @Override // X.InterfaceC67836Qjo
    public final void LIZLLL() {
        C16880lQ.LLLLIIIILLL();
        throw null;
    }

    @Override // X.InterfaceC67836Qjo
    public final boolean LJIIJJI() {
        C16880lQ.LLLLIIIILLL();
        throw null;
    }

    @Override // X.InterfaceC67836Qjo
    public final boolean isConnected() {
        C16880lQ.LLLLIIIILLL();
        throw null;
    }

    @Override // X.InterfaceC67836Qjo
    public final void LJIIJ(String str) {
        C16880lQ.LLLLIIIILLL();
        throw null;
    }

    @Override // X.InterfaceC67836Qjo
    public final void LJIIL(InterfaceC67783Qix interfaceC67783Qix) {
        C16880lQ.LLLLIIIILLL();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }
}
