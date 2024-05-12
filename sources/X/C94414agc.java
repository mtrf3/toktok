package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.agc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94414agc extends C94205adF {
    public final ImageView LJLJJL;

    public C94414agc(C94052aam c94052aam, FrameLayout frameLayout, ViewGroup viewGroup) {
        super(frameLayout, viewGroup);
        int i;
        if (c94052aam.LJLJJL) {
            i = R.id.f3q;
        } else {
            i = R.id.nnb;
        }
        View findViewById = frameLayout.findViewById(i);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(if…_gif else R.id.iv_assets)");
        this.LJLJJL = (ImageView) findViewById;
    }
}
