package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221988nS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, EnumC221998nT state, float f, String str) {
        o.LJIIIZ(state, "state");
        view.setVisibility(0);
        if (state.getShowIcon()) {
            ((ImageView) view.findViewById(R.id.e_q)).setVisibility(0);
            ((TuxIconView) view.findViewById(R.id.e_q)).setIconRes(state.getIconRes());
        } else {
            ((ImageView) view.findViewById(R.id.e_q)).setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(R.id.text);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "uploadingBar.context");
        textView.setText(state.getText(context, f));
        if (state.getShowRetry()) {
            view.findViewById(R.id.izm).setVisibility(0);
            ((TextView) view.findViewById(R.id.text)).setText(str);
        } else {
            view.findViewById(R.id.izm).setVisibility(8);
        }
        if (state.getShowXIcon()) {
            ((ImageView) view.findViewById(R.id.nke)).setVisibility(0);
        } else {
            ((ImageView) view.findViewById(R.id.nke)).setVisibility(8);
        }
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "uploadingBar.context");
        Integer LJI = C79045V0n.LJI(state.getBackgroundColor(), context2);
        if (LJI != null) {
            view.findViewById(R.id.iag).setBackgroundColor(LJI.intValue());
        }
        if (state.getShowEdit()) {
            view.findViewById(R.id.cnz).setVisibility(0);
        } else {
            view.findViewById(R.id.cnz).setVisibility(8);
        }
        if (state == EnumC221998nT.UPLOAD_SUCCESS) {
            view.postDelayed(new ARunnableS39S0100000_3(view, 168), 3000L);
        }
    }
}
