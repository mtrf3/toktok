package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ujb.o;

/* renamed from: X.Hn6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45108Hn6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Effect effect) {
        String str = (String) ORZ.LJLLLL(effect.getHintIcon().getUrlList());
        if (str == null || o.LJJJJJL(str)) {
            return true;
        }
        return C78764Uvg.LJIIL(UriProtector.parse(str));
    }
}
