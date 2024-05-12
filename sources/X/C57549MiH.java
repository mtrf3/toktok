package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MiH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57549MiH {
    public final Context LIZ;

    public C57549MiH(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(GalleryLayoutManager layoutManager, View view, float f) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (f < -1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(0.34f);
            return;
        }
        if (f <= 1.0f) {
            float f2 = 1;
            float abs = ((f2 - Math.abs(f)) * 0.100000024f) + 0.9f;
            float abs2 = ((f2 - Math.abs(f)) * 0.65999997f) + 0.34f;
            float abs3 = ((f2 - Math.abs(f)) * f2) + 7;
            float abs4 = Math.abs(f) * 12;
            view.setScaleX(abs);
            view.setScaleY(abs);
            view.setAlpha(abs2);
            view.setTranslationY(KL2.LIZJ(this.LIZ, abs4));
            TBN tbn = (TBN) view.findViewById(R.id.bvc);
            if (tbn == null) {
                return;
            }
            tbn.setRadius((int) KL2.LIZJ(this.LIZ, abs3));
            return;
        }
        view.setScaleX(0.9f);
        view.setScaleY(0.9f);
        view.setAlpha(0.34f);
    }
}
