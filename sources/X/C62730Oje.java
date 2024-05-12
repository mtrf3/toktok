package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Oje, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62730Oje extends AbstractC62728Ojc {
    public C62730Oje(View view) {
        super(view);
    }

    @Override // X.AbstractC62728Ojc
    public final void L(InterfaceC62733Ojh interfaceC62733Ojh) {
        String str;
        String str2;
        int i;
        SmartImageView ivBackground = (SmartImageView) this.itemView.findViewById(R.id.ezt);
        SmartImageView ivVideoCoverMiddle = (SmartImageView) this.itemView.findViewById(R.id.fcj);
        C5D4 LIZLLL = interfaceC62733Ojh.LIZLLL();
        int i2 = 0;
        if (LIZLLL != null && (str2 = LIZLLL.LJLILLLLZI) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            LJIIIIZZ.LJJIIJ = ivBackground;
            o.LJIIIIZZ(ivBackground, "ivBackground");
            Context context = ivBackground.getContext();
            o.LJIIIIZZ(context, "ivBackground.context");
            Integer LJI = C79045V0n.LJI(R.attr.ew, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            LJIIIIZZ.LJIIJJI = i;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        C5D4 LIZLLL2 = interfaceC62733Ojh.LIZLLL();
        if (LIZLLL2 != null && (str = (String) LIZLLL2.LJLJI) != null) {
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str);
            LJIIIIZZ2.LJJIIJ = ivVideoCoverMiddle;
            o.LJIIIIZZ(ivVideoCoverMiddle, "ivVideoCoverMiddle");
            Context context2 = ivVideoCoverMiddle.getContext();
            o.LJIIIIZZ(context2, "ivVideoCoverMiddle.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.ew, context2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            LJIIIIZZ2.LJIIJJI = i2;
            C16880lQ.LLJJJ(LJIIIIZZ2);
        }
    }
}
