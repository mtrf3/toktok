package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.FQk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38950FQk implements InterfaceC60169NjR {
    public final /* synthetic */ BulletService LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C38950FQk(BulletService bulletService, Context context) {
        this.LIZ = bulletService;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC60163NjL
    public final android.net.Uri LIZ(android.net.Uri uri, Bundle bundle) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(bundle, "bundle");
        BulletService bulletService = this.LIZ;
        Context context = this.LIZIZ;
        bulletService.getClass();
        android.net.Uri LJIILJJIL = BulletService.LJIILJJIL(context, uri);
        IBulletService LIZ = BulletService.LIZ();
        String uri2 = LJIILJJIL.toString();
        o.LJIIIIZZ(uri2, "realUri.toString()");
        android.net.Uri parse = UriProtector.parse(LIZ.LJIIJ(uri2));
        Boolean LIZ2 = SharePrefCache.inst().getRnFallback().LIZ();
        o.LJIIIIZZ(LIZ2, "inst().rnFallback.cache");
        if (LIZ2.booleanValue()) {
            android.net.Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
            o.LJIIIIZZ(build, "it.buildUpon()\n         …                 .build()");
            return build;
        }
        o.LJIIIIZZ(parse, "parse(realUrl).let {\n   …                        }");
        return parse;
    }
}
