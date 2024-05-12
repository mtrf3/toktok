package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.XPc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84780XPc<K, V> implements InterfaceC84783XPf {
    public final /* synthetic */ C84779XPb LJLIL;

    public C84780XPc(C84779XPb c84779XPb) {
        this.LJLIL = c84779XPb;
    }

    @Override // X.InterfaceC84783XPf
    public final void LIZJ(XQF<?, ?> xqf) {
        Object key = xqf.getKey();
        Object value = xqf.getValue();
        XQ6 xq6 = this.LJLIL.LIZIZ;
        o.LJII(key, "null cannot be cast to non-null type kotlin.String");
        String str = (String) key;
        o.LJII(value, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        Aweme aweme = (Aweme) value;
        xq6.LJLIL.put(str, aweme);
        if (!((Boolean) C34639Did.LJIIIIZZ.getValue()).booleanValue() && !((Boolean) C34639Did.LJIIIZ.getValue()).booleanValue()) {
            this.LJLIL.LIZLLL(aweme, str);
        }
    }
}
