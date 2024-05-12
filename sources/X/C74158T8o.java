package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.T8o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74158T8o implements OnActivityResultCallback {
    public final /* synthetic */ String LJLIL;

    public C74158T8o(String str) {
        this.LJLIL = str;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        String userId = this.LJLIL;
        o.LJIIIIZZ(userId, "userId");
        T64.LIZIZ("voice_anchor", userId);
    }
}
