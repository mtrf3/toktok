package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.FQn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38953FQn implements InterfaceC60169NjR {
    @Override // X.InterfaceC60163NjL
    public final android.net.Uri LIZ(android.net.Uri uri, Bundle bundle) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(bundle, "bundle");
        IBulletService LIZ = BulletService.LIZ();
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        android.net.Uri parse = UriProtector.parse(LIZ.LJIIJ(uri2));
        Boolean LIZ2 = SharePrefCache.inst().getRnFallback().LIZ();
        o.LJIIIIZZ(LIZ2, "inst().rnFallback.cache");
        if (LIZ2.booleanValue()) {
            android.net.Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
            o.LJIIIIZZ(build, "it.buildUpon()\n         …er.FORCE_H5, \"1\").build()");
            return build;
        }
        o.LJIIIIZZ(parse, "parse(url).let {\n       …                        }");
        return parse;
    }
}
