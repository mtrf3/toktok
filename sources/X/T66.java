package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;

/* loaded from: classes13.dex */
public final class T66 implements OnActivityResultCallback {
    public final /* synthetic */ String LJLIL;

    public T66(String str) {
        this.LJLIL = str;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        T64.LIZIZ("feed_banner", this.LJLIL);
    }
}
