package X;

import Y.ARunnableS12S0400000_8;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.model.EcPromotionIcon;
import java.util.List;

/* loaded from: classes9.dex */
public final class K94 {
    public static K95 LIZ(Context context, EcPromotionIcon ecPromotionIcon) {
        List<String> urlList = ecPromotionIcon.getUrlList();
        Integer width = ecPromotionIcon.getWidth();
        Integer height = ecPromotionIcon.getHeight();
        if (urlList != null && width != null && height != null) {
            int intValue = height.intValue();
            int intValue2 = width.intValue();
            if ((!urlList.isEmpty()) && intValue2 > 0 && intValue > 0) {
                int LIZIZ = C7MY.LIZIZ(16);
                int i = (int) ((intValue2 / intValue) * LIZIZ);
                SmartImageView smartImageView = new SmartImageView(context);
                smartImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                smartImageView.setLayoutParams(new LinearLayout.LayoutParams(i, LIZIZ));
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(urlList));
                LJIIIZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIZ);
                return new K95(i, smartImageView, "icon");
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.K95 LIZIZ(X.C51163K6d r13, android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K94.LIZIZ(X.K6d, android.content.Context):X.K95");
    }

    public static void LIZLLL(C51163K6d c51163K6d, ViewGroup viewGroup, TextView textView) {
        if (c51163K6d.LIZJ) {
            textView.setPaddingRelative(c51163K6d.LIZLLL, 0, c51163K6d.LJ, 0);
        }
        viewGroup.setVisibility(0);
    }

    public static void LIZJ(C51163K6d c51163K6d, Context context, ViewGroup viewGroup, TextView textView, boolean z, boolean z2) {
        int i;
        if (z2) {
            if (viewGroup.getChildCount() > 0) {
                LIZLLL(c51163K6d, viewGroup, textView);
                return;
            }
            K95 LIZIZ = LIZIZ(c51163K6d, context);
            if (LIZIZ == null || LIZIZ.LIZIZ <= 0) {
                return;
            }
            viewGroup.addView(LIZIZ.LIZ);
            textView.post(new ARunnableS12S0400000_8(viewGroup, textView, LIZIZ, c51163K6d, 3));
            return;
        }
        if (viewGroup.getChildCount() > 0) {
            LIZLLL(c51163K6d, viewGroup, textView);
            return;
        }
        K95 LIZIZ2 = LIZIZ(c51163K6d, context);
        if (LIZIZ2 == null || LIZIZ2.LIZIZ <= 0) {
            return;
        }
        textView.setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(32.5d))), 0, 0, 0);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        if (z) {
            i = K95.LIZLLL;
        } else {
            i = 0;
        }
        viewGroup.setPaddingRelative(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), LJJIIZ + i, 0);
        viewGroup.addView(LIZIZ2.LIZ);
        textView.post(new ARunnableS12S0400000_8(viewGroup, textView, LIZIZ2, c51163K6d, 4));
    }
}
