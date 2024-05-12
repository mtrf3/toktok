package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SCj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71709SCj extends AbstractC38911fr {
    public final int LJLILLLLZI = 32767;

    @Override // X.AbstractC38911fr
    public final InterfaceC71722SCw LJIIL(Object obj) {
        CharSequence source = (CharSequence) obj;
        o.LJIIIZ(source, "source");
        int length = source.length();
        int i = this.LJLILLLLZI;
        if (length > i) {
            source = source.subSequence(0, i).toString();
        }
        return new C71664SAq(source);
    }
}
