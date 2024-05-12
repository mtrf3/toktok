package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211138Qj {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public static void LIZ(final TuxTag tuxTag, Aweme aweme, AwemeHybridLabelModel awemeHybridLabelModel) {
        int i;
        int LJIIIIZZ;
        Integer num;
        AwemeLabelModel awemeLabelModel;
        ?? backgroundColor = awemeHybridLabelModel.getBackgroundColor();
        String textColor = awemeHybridLabelModel.getTextColor();
        Context context = tuxTag.getContext();
        try {
            backgroundColor = Color.parseColor(backgroundColor);
            i = backgroundColor;
        } catch (Exception unused) {
            String LLLZ = C16880lQ.LLLZ("parse background color failed & color: %s", Arrays.copyOf((Object[]) new Object[]{backgroundColor}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            C36922EeM.LIZLLL(5, "privacy_tag", LLLZ);
            o.LJIIIIZZ(context, "context");
            i = AnonymousClass636.LJIIIIZZ(R.attr.cl, context);
        }
        tuxTag.setTagBackgroundColor(i);
        if (o.LJ(textColor, "transparent")) {
            tuxTag.setTextColor(i);
        }
        String textColor2 = awemeHybridLabelModel.getTextColor();
        if (o.LJ(textColor2, "transparent")) {
            tuxTag.setHollow(true);
        } else {
            Context context2 = tuxTag.getContext();
            try {
                LJIIIIZZ = Color.parseColor(textColor2);
            } catch (Exception unused2) {
                String LLLZ2 = C16880lQ.LLLZ("parse text color failed & color: %s", Arrays.copyOf(new Object[]{textColor2}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                C36922EeM.LIZLLL(5, "privacy_tag", LLLZ2);
                o.LJIIIIZZ(context2, "context");
                LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context2);
            }
            tuxTag.setHollow(false);
            tuxTag.setTagTextColor(LJIIIIZZ);
        }
        tuxTag.setText(awemeHybridLabelModel.getText());
        if (awemeHybridLabelModel.getImageUrl() == null) {
            tuxTag.setTagIcon(null);
        } else {
            W5U.LJII(C78939UyV.LJ(awemeHybridLabelModel.getImageUrl())).LJIIJJI(new InterfaceC78660Uu0() { // from class: X.8Qk
                @Override // X.InterfaceC78660Uu0
                public final void LIZ() {
                }

                @Override // X.InterfaceC78660Uu0
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC78660Uu0
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC78660Uu0
                public final void LIZIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        TuxTag.this.setTagIconBitmap(bitmap);
                    }
                }
            });
        }
        List<AwemeLabelModel> list = aweme.videoLabels;
        if (list != null && (awemeLabelModel = (AwemeLabelModel) ORZ.LJLLLL(list)) != null) {
            num = Integer.valueOf(awemeLabelModel.getLabelType());
        } else {
            num = null;
        }
        tuxTag.setTag(num);
        C2055284u.LJ(tuxTag, null, true, 2);
    }
}
