package X;

import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.1mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C43281mu extends C1V4 {
    @Override // X.C16820lK
    public final void LIZ(boolean z) {
        if (z) {
            this.LIZ.clearFlags(67108864);
            this.LIZ.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            View decorView = this.LIZ.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | FileUtils.BUFFER_SIZE);
            return;
        }
        View decorView2 = this.LIZ.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }

    public C43281mu(Window window, View view) {
        super(window, view);
    }
}
