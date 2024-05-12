package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ojg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62732Ojg extends AbstractC62728Ojc {
    public C62732Ojg(View view) {
        super(view);
    }

    @Override // X.AbstractC62728Ojc
    public final void L(InterfaceC62733Ojh interfaceC62733Ojh) {
        String str;
        int i;
        SmartImageView ivCover = (SmartImageView) this.itemView.findViewById(R.id.f_z);
        C5D4 LIZLLL = interfaceC62733Ojh.LIZLLL();
        if (LIZLLL != null && (str = (String) LIZLLL.LJLJI) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = ivCover;
            o.LJIIIIZZ(ivCover, "ivCover");
            Context context = ivCover.getContext();
            o.LJIIIIZZ(context, "ivCover.context");
            Integer LJI = C79045V0n.LJI(R.attr.ew, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            LJIIIIZZ.LJIIJJI = i;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
    }
}
