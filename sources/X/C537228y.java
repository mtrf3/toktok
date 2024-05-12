package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.28y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C537228y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AnonymousClass167 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537228y(AnonymousClass167 anonymousClass167) {
        super(0);
        this.LJLIL = anonymousClass167;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AnonymousClass164 LIZ = this.LJLIL.LIZ();
        Iterator it = ((LinkedHashMap) LIZ.LJ).entrySet().iterator();
        while (it.hasNext()) {
            ((AnonymousClass161) ((Map.Entry) it.next()).getValue()).LIZLLL = true;
        }
        C29321Dc c29321Dc = LIZ.LIZ;
        if (!c29321Dc.LLIFFJFJJ.LIZJ) {
            c29321Dc.LJJJJJ(false);
        }
        return C76800UCe.LIZ;
    }
}
