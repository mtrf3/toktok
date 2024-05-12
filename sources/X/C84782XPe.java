package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.XPe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84782XPe<K, V> implements InterfaceC84783XPf {
    public final /* synthetic */ C84779XPb LJLIL;

    public C84782XPe(C84779XPb c84779XPb) {
        this.LJLIL = c84779XPb;
    }

    @Override // X.InterfaceC84783XPf
    public final void LIZJ(XQF<String, Aweme> xqf) {
        String key = xqf.getKey();
        Aweme value = xqf.getValue();
        if (value != null && !((Boolean) C34639Did.LJIIIZ.getValue()).booleanValue()) {
            C84779XPb c84779XPb = this.LJLIL;
            o.LJII(key, "null cannot be cast to non-null type kotlin.String");
            c84779XPb.LIZLLL(value, key);
        }
    }
}
