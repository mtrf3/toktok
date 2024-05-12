package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Fvn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40551Fvn extends AbstractC40557Fvt<AbstractC40550Fvm> {
    public static C40551Fvn LJIIIZ;
    public final Handler LJI;
    public final InterfaceC39662FhS LJII;
    public final java.util.Set<InterfaceC37103EhH> LJIIIIZZ;

    public C40551Fvn(Context context, EnumC39661FhR enumC39661FhR) {
        super(new C13T("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.LJI = new Handler(C16880lQ.LLJJJJ());
        this.LJIIIIZZ = new LinkedHashSet();
        this.LJII = enumC39661FhR;
    }

    public final synchronized void LJI(C40549Fvl c40549Fvl) {
        Iterator it = new LinkedHashSet(this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC37103EhH) it.next()).LIZ(c40549Fvl);
        }
        LJFF(c40549Fvl);
    }

    @Override // X.AbstractC40557Fvt
    public final void LIZ(Context context, Intent intent) {
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "session_state");
        if (LJJLIIIIJ == null) {
            return;
        }
        C40549Fvl LJFF = AbstractC40550Fvm.LJFF(LJJLIIIIJ);
        this.LIZ.LIZJ("ListenerRegistryBroadcastReceiver.onReceive: %s", 3, new Object[]{LJFF});
        InterfaceC39665FhV a = ((EnumC39661FhR) this.LJII).a();
        if (LJFF.LIZIZ == 3 && a != null) {
            a.LIZ(LJFF.LJIIIIZZ, new C40552Fvo(this, LJFF, intent, context));
        } else {
            LJI(LJFF);
        }
    }
}
