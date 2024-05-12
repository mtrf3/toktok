package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.FQo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38954FQo implements InterfaceC60164NjM {
    public final /* synthetic */ InterfaceC38952FQm LIZ;

    public C38954FQo(InterfaceC38952FQm interfaceC38952FQm) {
        this.LIZ = interfaceC38952FQm;
    }

    @Override // X.InterfaceC60163NjL
    public final android.net.Uri LIZ(android.net.Uri uri, Bundle bundle) {
        android.net.Uri LIZ;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(bundle, "bundle");
        IBulletService LIZ2 = BulletService.LIZ();
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        String LJIIJ = LIZ2.LJIIJ(uri2);
        InterfaceC38952FQm interfaceC38952FQm = this.LIZ;
        if (interfaceC38952FQm == null || (LIZ = interfaceC38952FQm.LIZ(bundle, LJIIJ)) == null) {
            android.net.Uri parse = UriProtector.parse(LJIIJ);
            o.LJIIIIZZ(parse, "parse(url)");
            return parse;
        }
        return LIZ;
    }
}
