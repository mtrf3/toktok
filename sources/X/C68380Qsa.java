package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.Qsa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68380Qsa implements Comparator {
    public final /* synthetic */ AbstractC68364QsK LJLIL;
    public final /* synthetic */ C68377QsX LJLILLLLZI;

    public C68380Qsa(AbstractC68364QsK abstractC68364QsK, C68377QsX c68377QsX) {
        this.LJLIL = abstractC68364QsK;
        this.LJLILLLLZI = c68377QsX;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC68379QsZ interfaceC68379QsZ = (InterfaceC68379QsZ) obj;
        InterfaceC68379QsZ interfaceC68379QsZ2 = (InterfaceC68379QsZ) obj2;
        AbstractC68364QsK abstractC68364QsK = this.LJLIL;
        C68377QsX c68377QsX = this.LJLILLLLZI;
        if (interfaceC68379QsZ instanceof C68371QsR) {
            if (!(interfaceC68379QsZ2 instanceof C68371QsR)) {
                return 1;
            }
            return 0;
        }
        if (interfaceC68379QsZ2 instanceof C68371QsR) {
            return -1;
        }
        if (abstractC68364QsK == null) {
            return interfaceC68379QsZ.LJII().compareTo(interfaceC68379QsZ2.LJII());
        }
        return (int) C68368QsO.LIZ(abstractC68364QsK.LIZ(c68377QsX, Arrays.asList(interfaceC68379QsZ, interfaceC68379QsZ2)).LJI().doubleValue());
    }
}
