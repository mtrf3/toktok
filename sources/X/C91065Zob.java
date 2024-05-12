package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.Zob, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91065Zob {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(C91084Zou lyricsConfig, String str) {
        o.LJIIIZ(lyricsConfig, "lyricsConfig");
        if (str == null) {
            return 0;
        }
        TuxTextView tuxTextView = new TuxTextView(EF7.LIZIZ(), null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(lyricsConfig.LIZJ);
        tuxTextView.setMaxWidth(lyricsConfig.LIZIZ());
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(lyricsConfig.LIZIZ(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
        return tuxTextView.getMeasuredHeight() + (((Number) lyricsConfig.LJIIIIZZ.getValue()).intValue() * 2);
    }
}
