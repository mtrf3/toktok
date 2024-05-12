package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55762Gu extends C45101pq {
    public C12U LJLJLJ;
    public DataChannel LJLJLLL;
    public boolean LJLL;
    public final Context LJLLI;
    public final TextView LJLLILLLL;
    public final TextView LJLLJ;

    public final void hide() {
        TextView textView = this.LJLLILLLL;
        if (textView != null) {
            C87277YNd.LJJIIZ(textView);
        }
        TextView textView2 = this.LJLLJ;
        if (textView2 != null) {
            C87277YNd.LJJIIZ(textView2);
        }
        this.LJLL = false;
    }

    public final void LLLZ(int i) {
        if (i == 1) {
            this.LJLJJI.setRotationY(0.0f);
            TextView textView = this.LJLLILLLL;
            if (textView != null) {
                textView.setRotationY(0.0f);
            }
            TextView textView2 = this.LJLLJ;
            if (textView2 != null) {
                textView2.setRotationY(0.0f);
            }
        } else {
            this.LJLJJI.setRotationY(180.0f);
            TextView textView3 = this.LJLLILLLL;
            if (textView3 != null) {
                textView3.setRotationY(180.0f);
            }
            TextView textView4 = this.LJLLJ;
            if (textView4 != null) {
                textView4.setRotationY(180.0f);
            }
        }
        this.LJLL = true;
    }

    public C55762Gu(Context context, View view) {
        super(context);
        int LIZ = C15380j0.LIZ(36.0f);
        int LIZ2 = C15380j0.LIZ(15.0f);
        this.LJLLI = context;
        this.LJLLILLLL = (TextView) view.findViewById(R.id.b0q);
        this.LJLLJ = (TextView) view.findViewById(R.id.b0r);
        this.LJLJJI = view;
        LLLLZIL(LIZ, LIZ2);
        LLLLZ(-LIZ, -C87277YNd.LJIIJJI(36));
    }
}
