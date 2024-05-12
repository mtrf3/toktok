package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4OI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OI {
    public static final int LIZ = C17N.LJIILL(56.0d);

    public static void LIZ(SharePackage sharePackage, View view) {
        float LIZJ;
        o.LJIIIZ(sharePackage, "sharePackage");
        VA9 va9 = (VA9) view.findViewById(R.id.gpj);
        ImageView imageView = (ImageView) view.findViewById(R.id.fa0);
        V8L v8l = new V8L();
        if (C99W.LIZ) {
            LIZJ = C32151Nz.LJIIZILJ(4);
        } else {
            LIZJ = KL2.LIZJ(EF7.LIZIZ(), 2.0f);
        }
        v8l.LJFF(LIZJ);
        String str = sharePackage.itemType;
        if (o.LJ(str, "good_window")) {
            ViewGroup.LayoutParams layoutParams = va9.getLayoutParams();
            int i = LIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            va9.setLayoutParams(layoutParams);
            v8l.LIZIZ = true;
            imageView.setVisibility(0);
        } else if (o.LJ(str, "good")) {
            imageView.setImageResource(R.drawable.bik);
            imageView.setVisibility(0);
        }
        ((V92) va9.getHierarchy()).LJIL(v8l);
    }
}
