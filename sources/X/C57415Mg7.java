package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57415Mg7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final IBulletService LIZ() {
        IBulletService LIZ2 = BulletService.LIZ();
        o.LJIIIIZZ(LIZ2, "get().getService(IBulletService::class.java)");
        return LIZ2;
    }

    public static final void LIZIZ(Context context, String schema, String str, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        BulletService.LIZ().LIZLLL(context, schema, str, bundle);
    }
}
