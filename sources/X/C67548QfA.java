package X;

import X.C0M9;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QfA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67548QfA extends Exception {
    public final C1HQ<C67719Qhv<?>, ConnectionResult> LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0M9.c) this.LJLIL.keySet()).iterator();
        boolean z = true;
        while (true) {
            C0M7 c0m7 = (C0M7) it;
            if (!c0m7.hasNext()) {
                break;
            }
            C67719Qhv c67719Qhv = (C67719Qhv) c0m7.next();
            ConnectionResult orDefault = this.LJLIL.getOrDefault(c67719Qhv, null);
            QH7.LJIIIIZZ(orDefault);
            z &= !orDefault.LJJJJZ();
            String str = c67719Qhv.LIZIZ.LIZJ;
            String valueOf = String.valueOf(orDefault);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + valueOf.length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public C67548QfA(C1HQ<C67719Qhv<?>, ConnectionResult> c1hq) {
        this.LJLIL = c1hq;
    }

    public ConnectionResult getConnectionResult(InterfaceC67549QfB<? extends InterfaceC67808QjM> interfaceC67549QfB) {
        boolean z;
        C67719Qhv<? extends InterfaceC67808QjM> LIZ = interfaceC67549QfB.LIZ();
        if (this.LJLIL.getOrDefault(LIZ, null) != null) {
            z = true;
        } else {
            z = false;
        }
        String str = LIZ.LIZIZ.LIZJ;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("The given API (");
        sb.append(str);
        sb.append(") was not part of the availability request.");
        QH7.LIZ(sb.toString(), z);
        ConnectionResult orDefault = this.LJLIL.getOrDefault(LIZ, null);
        QH7.LJIIIIZZ(orDefault);
        return orDefault;
    }

    public ConnectionResult getConnectionResult(AbstractC67791Qj5<? extends InterfaceC67808QjM> abstractC67791Qj5) {
        boolean z;
        C67719Qhv<? extends InterfaceC67808QjM> c67719Qhv = abstractC67791Qj5.LJ;
        if (this.LJLIL.getOrDefault(c67719Qhv, null) != null) {
            z = true;
        } else {
            z = false;
        }
        String str = c67719Qhv.LIZIZ.LIZJ;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("The given API (");
        sb.append(str);
        sb.append(") was not part of the availability request.");
        QH7.LIZ(sb.toString(), z);
        ConnectionResult orDefault = this.LJLIL.getOrDefault(c67719Qhv, null);
        QH7.LJIIIIZZ(orDefault);
        return orDefault;
    }
}
