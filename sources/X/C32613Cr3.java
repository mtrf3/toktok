package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cr3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32613Cr3 extends C19870qF {
    public C32613Cr3(C32643CrX c32643CrX) {
        super(c32643CrX);
        if (this.LIZ != null && !TextUtils.isEmpty(c32643CrX.LJIILLIIL)) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dat, C16880lQ.LLZIL(this.LIZ), null);
            ImageView icon = (ImageView) LLLZIIL.findViewById(R.id.l8q);
            TextView textView = (TextView) LLLZIIL.findViewById(R.id.l8t);
            ImageModel imageModel = c32643CrX.LJIJJLI;
            if (imageModel != null) {
                o.LJIIIIZZ(icon, "icon");
                C78609UtB.LJJJJLI(icon, imageModel, R.drawable.d4o, icon.getLayoutParams().width, icon.getLayoutParams().height);
            }
            textView.setText(c32643CrX.LJIILLIIL);
            this.LJIIJJI = c32643CrX.LJIILLIIL;
            this.LIZJ = LLLZIIL;
        }
    }
}
