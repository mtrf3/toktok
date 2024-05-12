package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.FQl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38951FQl implements InterfaceC60164NjM {
    public final /* synthetic */ BulletService LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ InterfaceC38952FQm LIZJ = null;

    public C38951FQl(BulletService bulletService, Context context) {
        this.LIZ = bulletService;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC60163NjL
    public final android.net.Uri LIZ(android.net.Uri uri, Bundle bundle) {
        android.net.Uri LIZ;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(bundle, "bundle");
        BulletService bulletService = this.LIZ;
        Context context = this.LIZIZ;
        bulletService.getClass();
        android.net.Uri LJIILJJIL = BulletService.LJIILJJIL(context, uri);
        IBulletService LIZ2 = BulletService.LIZ();
        String uri2 = LJIILJJIL.toString();
        o.LJIIIIZZ(uri2, "realUri.toString()");
        String LJIIJ = LIZ2.LJIIJ(uri2);
        InterfaceC38952FQm interfaceC38952FQm = this.LIZJ;
        if (interfaceC38952FQm == null || (LIZ = interfaceC38952FQm.LIZ(bundle, LJIIJ)) == null) {
            android.net.Uri parse = UriProtector.parse(LJIIJ);
            o.LJIIIIZZ(parse, "parse(\n                 …                        )");
            return parse;
        }
        return LIZ;
    }
}
