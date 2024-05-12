package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TP3 extends TP4 {
    public final String LJII;

    @Override // X.TP4
    public final C73579SuF LJIIJ(int i, TPH cursorData) {
        o.LJIIIZ(cursorData, "cursorData");
        return AbstractC73638SvC.LJI(new TP7(this, cursorData, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TP3(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, String providerName, String providerSource, String query, TPH tph) {
        super(effectPlatform, providerName, providerSource, tph);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerName, "providerName");
        o.LJIIIZ(providerSource, "providerSource");
        o.LJIIIZ(query, "query");
        this.LJII = query;
    }
}
