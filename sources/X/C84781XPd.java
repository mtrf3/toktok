package X;

import Y.ACallableS40S1200000_15;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.XPd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84781XPd<K, V> implements InterfaceC84783XPf {
    public final /* synthetic */ C84778XPa LJLIL;

    public C84781XPd(C84778XPa c84778XPa) {
        this.LJLIL = c84778XPa;
    }

    @Override // X.InterfaceC84783XPf
    public final void LIZJ(XQF<String, Aweme> xqf) {
        String key = xqf.getKey();
        Aweme value = xqf.getValue();
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            C10K.LIZJ(new ACallableS40S1200000_15(this.LJLIL, key, value, 0));
            return;
        }
        C84778XPa c84778XPa = this.LJLIL;
        o.LJII(key, "null cannot be cast to non-null type kotlin.String");
        o.LJII(value, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        c84778XPa.LIZJ(value, key);
    }
}
