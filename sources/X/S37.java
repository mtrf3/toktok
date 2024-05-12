package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S37 implements S35 {
    @Override // X.S35
    public final void LIZIZ(Context context, TuxTextView tuxTextView, boolean z) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.S35
    public final void LJFF(ViewGroup innerContainerView) {
        o.LJIIIZ(innerContainerView, "innerContainerView");
    }

    @Override // X.S35
    public final W5F LJ(Context context, String imageUrl) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imageUrl, "imageUrl");
        return C70759Rpr.LIZLLL(imageUrl);
    }

    @Override // X.S35
    public final void LJII(SmartImageView smartImageView, PromotionItem promotionItem) {
        S2P.LIZIZ(smartImageView, promotionItem, null);
    }

    @Override // X.S35
    public final void LJIIJJI(Context context, TuxTextView tuxTextView, int i) {
        String LLLZI = C16880lQ.LLLZI(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        tuxTextView.setText(LLLZI);
        tuxTextView.setPadding(tuxTextView.getResources().getDimensionPixelSize(R.dimen.p2), tuxTextView.getResources().getDimensionPixelSize(R.dimen.oj), tuxTextView.getResources().getDimensionPixelSize(R.dimen.p2), tuxTextView.getResources().getDimensionPixelSize(R.dimen.oj));
    }
}
