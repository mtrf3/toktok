package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ahI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94456ahI extends C94205adF {
    public final ImageView LJLJJL;

    public C94456ahI(FrameLayout frameLayout, ViewGroup viewGroup) {
        super(frameLayout, viewGroup);
        View findViewById = frameLayout.findViewById(R.id.nnb);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_assets)");
        this.LJLJJL = (ImageView) findViewById;
    }
}
