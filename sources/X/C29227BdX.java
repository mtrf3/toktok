package X;

import Y.ACListenerS28S0101000_10;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BdX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29227BdX {
    public final C47061t0 LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final Context LIZLLL;
    public FeedBanner LJ;
    public final String LJFF;
    public final int LJI;

    public C29227BdX(int i, Context context, View view, String str) {
        C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.egd);
        this.LIZ = c47061t0;
        this.LIZIZ = (TextView) view.findViewById(R.id.text);
        this.LIZJ = (TextView) view.findViewById(R.id.ff3);
        C16880lQ.LJJI(c47061t0, new ACListenerS28S0101000_10(0, this, 6));
        this.LIZLLL = context;
        this.LJFF = str;
        this.LJI = i;
    }
}
