package X;

import java.util.HashMap;

/* renamed from: X.BTk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28836BTk implements BU3<C28837BTl> {
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        C28837BTl c28837BTl = (C28837BTl) obj;
        if (c28837BTl == null) {
            return;
        }
        C39685Fhp c39685Fhp = new C39685Fhp();
        c39685Fhp.LIZJ("is_ad", c28837BTl.LIZ);
        c39685Fhp.LIZJ("creative_id", c28837BTl.LIZIZ);
        c39685Fhp.LIZJ("log_extra", c28837BTl.LIZJ);
        c39685Fhp.LIZJ("ad_id", c28837BTl.LJIIIIZZ);
        c39685Fhp.LIZJ("adv_id", c28837BTl.LJIIIZ);
        c39685Fhp.LIZJ("feed_id", c28837BTl.LIZLLL);
        c39685Fhp.LIZJ("tag", "live_ad");
        c39685Fhp.LIZJ("label", c28837BTl.LJIIJ);
        map.putAll((HashMap) c39685Fhp.LJLILLLLZI);
    }
}
