package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Obf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62235Obf extends AbstractC62226ObW {
    public final /* synthetic */ InterfaceC62225ObV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62235Obf(InterfaceC62225ObV interfaceC62225ObV) {
        super(interfaceC62225ObV);
        this.LJLILLLLZI = interfaceC62225ObV;
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        try {
            InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ("facebook_story", null);
            if (LIZIZ != null && (content instanceof C62314Ocw) && LIZIZ.LIZLLL(context)) {
                return LIZIZ.LJIIJ(content, context, null);
            }
            return this.LJLILLLLZI.LJIIJ(content, context, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
