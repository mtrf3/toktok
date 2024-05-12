package X;

import android.content.DialogInterface;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S1100100_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC27071Ajr implements DialogInterface.OnDismissListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ HashMap<String, Object> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public DialogInterfaceOnDismissListenerC27071Ajr(String str, long j, HashMap hashMap) {
        this.LJLIL = str;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        String str;
        String str2;
        o.LJIIIIZZ(it, "it");
        if (o.LJ(ASQ.LJIIIIZZ(it), ASY.LIZ) && (str2 = this.LJLIL) != null) {
            C78946Uyc.LJJIII(str2, new C70917RsP(), new AqS170S0100000_4((HashMap) this.LJLILLLLZI, (HashMap<String, Object>) 1067));
        }
        String str3 = this.LJLIL;
        if (str3 != null) {
            long j = this.LJLJI;
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            C78946Uyc.LJJIII(str3, new C70921RsT(), new AqS9S1100100_4(str, (String) (SystemClock.elapsedRealtime() - j), (long) hashMap, (HashMap<String, Object>) 2));
        }
        C84654XKg c84654XKg = C27072Ajs.LIZ;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        C27072Ajs.LIZ = null;
    }
}
