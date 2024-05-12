package X;

import android.content.Intent;
import com.bytedance.router.AbsOpenResultCallback;

/* renamed from: X.O0h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61203O0h extends AbsOpenResultCallback {
    public final /* synthetic */ boolean[] LIZ;
    public final /* synthetic */ C61200O0e LIZIZ;

    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        this.LIZ[0] = true;
    }

    public C61203O0h(C61200O0e c61200O0e, boolean[] zArr) {
        this.LIZIZ = c61200O0e;
        this.LIZ = zArr;
    }

    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        this.LIZ[0] = false;
        this.LIZIZ.getClass();
        C61200O0e.LJ(str, true);
    }
}
