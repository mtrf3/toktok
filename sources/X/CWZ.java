package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;

/* loaded from: classes6.dex */
public final class CWZ extends C1C9 {
    public final /* synthetic */ SmoothLinearLayoutManager LJIILL;

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return this.LJIILL.LLIIIJ / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CWZ(SmoothLinearLayoutManager smoothLinearLayoutManager, Context context) {
        super(context);
        this.LJIILL = smoothLinearLayoutManager;
    }
}
