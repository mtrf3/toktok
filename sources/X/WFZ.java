package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFZ extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C81970WFa LJLJJLL;
    public final /* synthetic */ WFU LJLJL;
    public final /* synthetic */ View LJLJLJ;

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        int i;
        o.LJIIIZ(v, "v");
        int adapterPosition = this.LJLJJLL.getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        C81975WFf c81975WFf = (C81975WFf) ListProtector.get(this.LJLJL.LJLILLLLZI, adapterPosition);
        InterfaceC81972WFc interfaceC81972WFc = c81975WFf.LJLLI;
        if (!c81975WFf.LJLJJLL) {
            if (interfaceC81972WFc != null) {
                interfaceC81972WFc.LIZ(c81975WFf);
                return;
            }
            return;
        }
        InterfaceC81974WFe interfaceC81974WFe = c81975WFf.LJLZ;
        if (interfaceC81974WFe != null) {
            interfaceC81974WFe.LIZIZ(this.LJLJJLL.LJLIL);
        }
        if (c81975WFf.LJLIL == 18) {
            this.LJLJL.LJLIL.invoke();
        }
        if (interfaceC81972WFc != null) {
            I3Q.LIZ(I3P.TOOL_BAR);
            interfaceC81972WFc.LIZLLL(this.LJLJLJ, c81975WFf);
            AnonymousClass632.LIZIZ(this.LJLJLJ.getContext());
            if (c81975WFf.LJLLLL) {
                if (c81975WFf.LJLJI != -1) {
                    try {
                        ViewGroup.LayoutParams layoutParams = this.LJLJJLL.LJLIL.getLayoutParams();
                        int i2 = c81975WFf.LJLJJI;
                        if (i2 == 0) {
                            i2 = R.attr.dj;
                        }
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZJ = layoutParams.height;
                        c2068389v.LIZIZ = layoutParams.width;
                        c2068389v.LIZ = c81975WFf.LJLJI;
                        c2068389v.LJ = Integer.valueOf(i2);
                        Context context = this.LJLJJLL.LJLIL.getContext();
                        o.LJIIIIZZ(context, "mIvIcon.context");
                        this.LJLJJLL.LJLIL.setImageDrawable(c2068389v.LIZ(context));
                    } catch (Throwable unused) {
                    }
                } else {
                    this.LJLJJLL.LJLIL.setImageResource(c81975WFf.LJLILLLLZI);
                }
                TuxIconView tuxIconView = this.LJLJJLL.LJLJJI;
                if (c81975WFf.LJLJLLL) {
                    i = 0;
                } else {
                    i = 8;
                }
                tuxIconView.setVisibility(i);
                c81975WFf.LJLLLL = false;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WFZ(C81970WFa c81970WFa, WFU wfu, View view) {
        super(0, 3);
        this.LJLJJLL = c81970WFa;
        this.LJLJL = wfu;
        this.LJLJLJ = view;
    }
}
