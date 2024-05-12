package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONR implements InterfaceC50599JtT {
    public final /* synthetic */ ONQ LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;
    public final /* synthetic */ ONS LJLJI;

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        ONQ onq = this.LJLIL;
        if (onq.LJZL == i) {
            return;
        }
        TuxTextView tuxTextView = onq.LJZ;
        if (tuxTextView != null) {
            tuxTextView.setEnabled(true);
        }
        TuxTextView tuxTextView2 = this.LJLIL.LJZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setClickable(true);
        }
        TuxTextView tuxTextView3 = this.LJLIL.LJZ;
        if (tuxTextView3 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "context");
            tuxTextView3.setBackground(c110614Vt.LIZ(context));
        }
        ONQ onq2 = this.LJLIL;
        TuxTextView tuxTextView4 = onq2.LJZ;
        if (tuxTextView4 != null) {
            Context context2 = onq2.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
        }
        this.LJLIL.LJZI = (Option) ListProtector.get(this.LJLILLLLZI, i);
        this.LJLIL.LJZL = i;
        ONS ons = this.LJLJI;
        ons.LJLJI = i;
        ons.notifyDataSetChanged();
    }

    public ONR(ONQ onq, ArrayList<Option> arrayList, ONS ons) {
        this.LJLIL = onq;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = ons;
    }
}
