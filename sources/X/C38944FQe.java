package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.FQe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38944FQe implements InterfaceC60168NjQ {
    public final /* synthetic */ BulletService LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C38944FQe(BulletService bulletService, Context context) {
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
        return BulletService.LJIILJJIL(context, uri);
    }
}
