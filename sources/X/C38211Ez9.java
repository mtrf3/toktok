package X;

import android.os.SystemClock;
import android.webkit.WebView;
import java.lang.ref.SoftReference;

/* renamed from: X.Ez9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38211Ez9 implements InterfaceC38140Ey0 {
    public final SoftReference<WebView> LIZ;

    @Override // X.InterfaceC38140Ey0
    public final /* synthetic */ void LIZJ(C38117Exd c38117Exd, int i) {
    }

    public C38211Ez9(WebView webView) {
        this.LIZ = new SoftReference<>(webView);
    }

    @Override // X.InterfaceC38140Ey0
    public void LIZ(String str, String str2, C17230lz c17230lz) {
        C38160EyK.LIZIZ(new RunnableC38210Ez8(this, str2, c17230lz, SystemClock.elapsedRealtime()));
    }

    @Override // X.InterfaceC38140Ey0
    public void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
        C38160EyK.LIZIZ(new RunnableC38209Ez7(this, str2, c17230lz, i, str3, SystemClock.elapsedRealtime()));
    }
}
