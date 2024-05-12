package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29992Bps extends AbstractC29995Bpv {
    public Bitmap LIZ;
    public final /* synthetic */ OthersLikeWidget LIZIZ;

    public C29992Bps(OthersLikeWidget othersLikeWidget) {
        this.LIZIZ = othersLikeWidget;
        this.LIZ = OptimizedLikeHelper.LJJIJIIJIL(BitmapFactory.decodeResource(othersLikeWidget.context.getResources(), R.drawable.cuk), OptimizedLikeHelper.LLILZ);
    }
}
