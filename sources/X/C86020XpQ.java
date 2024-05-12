package X;

import com.orbu.core.TTKOrbu;
import com.orbu.core.api.TTKOrbuState;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.XpQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86020XpQ implements Observer {
    public static final C86020XpQ LIZ = new C86020XpQ();

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof C64707PaR) {
            o.LJII(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("region_source");
            String str2 = (String) hashMap.get("store_region");
            if (C86019XpP.LIZIZ) {
                C86019XpP.LIZIZ = false;
                if (!ujb.o.LJJJJIZL(C86019XpP.LIZLLL, str2, true)) {
                    C86019XpP.LIZ(C86019XpP.LIZJ);
                    return;
                }
                return;
            }
            if (TTKOrbu.INSTANCE.getCurOrbuState() == TTKOrbuState.PRE_ACTIVE) {
                if (!ujb.o.LJJJJIZL(C86019XpP.LIZLLL, str2, true) || !ujb.o.LJJJJIZL(C86019XpP.LJ, str, true)) {
                    C86019XpP.LIZ(C86019XpP.LIZJ);
                }
            }
        }
    }
}
