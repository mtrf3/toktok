package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS17S1100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aWo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93806aWo extends FrameLayout {
    public C94262aeA LJLIL;
    public final C94193ad3 LJLILLLLZI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJI;

    public C93806aWo(Context context) {
        super(context, null, 0);
        this.LJLIL = new C94262aeA(this, 4);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dv3, this, false);
        addView(LLLLIILL);
        int i = R.id.nn7;
        C94528aiS c94528aiS = (C94528aiS) LLLLIILL.findViewById(R.id.nn7);
        if (c94528aiS != null) {
            i = R.id.nps;
            TextView textView = (TextView) LLLLIILL.findViewById(R.id.nps);
            if (textView != null) {
                i = R.id.mbc;
                TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.mbc);
                if (textView2 != null) {
                    this.LJLILLLLZI = new C94193ad3((LinearLayout) LLLLIILL, c94528aiS, textView, textView2);
                    c94528aiS.setLayoutManager(new GridLayoutManager(4));
                    c94528aiS.setAdapter(this.LJLIL);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    public static void LIZ(C93806aWo c93806aWo, C94384ag8 data, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(data, "data");
        if (c93806aWo.LJLIL.LJLJI != 4) {
            c93806aWo.LJLIL = new C94262aeA(c93806aWo, 4);
            C94528aiS c94528aiS = c93806aWo.LJLILLLLZI.LJLILLLLZI;
            o.LJIIIIZZ(c94528aiS, "binding.gvLabel");
            c94528aiS.setAdapter(c93806aWo.LJLIL);
            C94528aiS c94528aiS2 = c93806aWo.LJLILLLLZI.LJLILLLLZI;
            o.LJIIIIZZ(c94528aiS2, "binding.gvLabel");
            c93806aWo.getContext();
            c94528aiS2.setLayoutManager(new GridLayoutManager(4));
        }
        c93806aWo.LJLJI = interfaceC88472Yns;
        TextView textView = c93806aWo.LJLILLLLZI.LJLJI;
        o.LJIIIIZZ(textView, "binding.tvLabelCategory");
        textView.setText(data.LJLIL);
        C94262aeA c94262aeA = c93806aWo.LJLIL;
        List<C94383ag7> labels = data.LJLJI;
        c94262aeA.getClass();
        o.LJIIIZ(labels, "labels");
        c94262aeA.LJLILLLLZI = labels;
        c94262aeA.LJLIL = labels.subList(0, Math.min(c94262aeA.LJLJI, labels.size()));
        c94262aeA.notifyDataSetChanged();
        String string = c93806aWo.getContext().getString(R.string.fx3);
        o.LJIIIIZZ(string, "context.getString(\n     …t_tool_more\n            )");
        while (true) {
            C94528aiS c94528aiS3 = c93806aWo.LJLILLLLZI.LJLILLLLZI;
            o.LJIIIIZZ(c94528aiS3, "binding.gvLabel");
            if (c94528aiS3.getItemDecorationCount() <= 0) {
                break;
            } else {
                c93806aWo.LJLILLLLZI.LJLILLLLZI.LJJLJ(0);
            }
        }
        if (data.LJLJI.size() > 4) {
            TextView textView2 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView2, "binding.tvMore");
            textView2.setVisibility(0);
            TextView textView3 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView3, "binding.tvMore");
            textView3.setText(string);
            TextView textView4 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView4, "binding.tvMore");
            textView4.setScaleY(1.0f);
            TextView textView5 = c93806aWo.LJLILLLLZI.LJLJJI;
            o.LJIIIIZZ(textView5, "binding.tvMore");
            C93750aVu.LIZ(textView5, 800L, new IDqS17S1100000_42(c93806aWo, string, 1));
            c93806aWo.LJLILLLLZI.LJLILLLLZI.LJII(new C94260ae8(C93742aVm.LIZIZ(15)), -1);
            return;
        }
        c93806aWo.LJLILLLLZI.LJLILLLLZI.LJII(new C94260ae8(C93742aVm.LIZIZ(0)), -1);
        TextView textView6 = c93806aWo.LJLILLLLZI.LJLJJI;
        o.LJIIIIZZ(textView6, "binding.tvMore");
        textView6.setVisibility(8);
    }
}
