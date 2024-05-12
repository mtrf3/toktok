package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.keva.Keva;

/* renamed from: X.17l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C278517l implements RTU, C0K7 {
    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static Boolean LIZ(String str, String str2, boolean z) {
        return Boolean.valueOf(Keva.getRepo(str).getBoolean(str2, z));
    }

    public static void LIZIZ(int i, int i2, View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }
}
