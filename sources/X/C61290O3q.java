package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.O3q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61290O3q extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61290O3q(String str, String str2, JSONObject jSONObject) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = jSONObject;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object LIZ;
        Iterator it = ((ArrayList) C61288O3o.LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((AbstractC61294O3u) it.next()).LIZ("forest_event", this.LJLIL, this.LJLILLLLZI, this.LJLJI, new JSONObject(), new JSONObject(), 0);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C39930Flm.LIZJ("ResourceReporter", "failed to customReport", m10exceptionOrNullimpl, true);
            }
        }
        return C76800UCe.LIZ;
    }
}
