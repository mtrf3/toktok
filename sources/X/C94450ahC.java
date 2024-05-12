package X;

import Y.IDCListenerS139S0100000_42;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ahC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94450ahC extends C94205adF {
    public final ImageView LJLJJL;
    public final ImageView LJLJJLL;
    public final TextView LJLJL;
    public final View LJLJLJ;
    public C94178aco LJLJLLL;
    public final InterfaceC88471Ynr<C94178aco, Integer, C76800UCe> LJLL;

    public final void P(C94178aco prefab) {
        int i;
        o.LJIIIZ(prefab, "prefab");
        this.LJLJLLL = prefab;
        this.LJLJL.setText(prefab.LJLJI);
        View view = this.LJLJLJ;
        if (prefab.LJLJJI) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.LJLJL.setTypeface(null, prefab.LJLJJI ? 1 : 0);
        this.LJLJJLL.setVisibility(8);
        if (prefab.LJLJJI) {
            int i2 = prefab.LJLJJL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        N();
                        L(false);
                        return;
                    } else {
                        N();
                        L(true);
                        return;
                    }
                }
                N();
                L(false);
                if (!prefab.LJLJJLL) {
                    return;
                }
                this.LJLJJLL.setVisibility(0);
                return;
            }
            L(false);
            M();
            return;
        }
        N();
        L(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C94450ahC(FrameLayout frameLayout, ViewGroup viewGroup, InterfaceC88471Ynr<? super C94178aco, ? super Integer, C76800UCe> onClick) {
        super(frameLayout, viewGroup);
        o.LJIIIZ(onClick, "onClick");
        this.LJLL = onClick;
        View findViewById = frameLayout.findViewById(R.id.nnp);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_prefab_item_icon)");
        this.LJLJJL = (ImageView) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.nnn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…iv_prefab_item_edit_icon)");
        this.LJLJJLL = (ImageView) findViewById2;
        View findViewById3 = frameLayout.findViewById(R.id.nq3);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_prefab_item_name)");
        this.LJLJL = (TextView) findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.nno);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_prefab_item_frame)");
        this.LJLJLJ = findViewById4;
        C16880lQ.LJIILJJIL(frameLayout, new IDCListenerS139S0100000_42(this, 7));
    }
}
