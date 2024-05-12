package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208318Fn {
    public static void LIZ(Context context, String str, String str2, JSONObject param) {
        o.LJIIIZ(param, "param");
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C208308Fm(param, NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType(), J1R.LIZ(str2), str, context, null), 2);
    }
}
