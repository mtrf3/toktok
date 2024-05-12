package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.U2i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76544U2i extends AbstractC76220Tvk<C76545U2j> {
    public C47121t6 LJLIL;
    public C47121t6 LJLILLLLZI;
    public View LJLJI;

    public C76544U2i(View view) {
        super(view);
    }

    @Override // X.AbstractC76220Tvk
    public final void L(int i, Object obj) {
        C76545U2j data = (C76545U2j) obj;
        o.LJIIIZ(data, "data");
        View view = this.itemView;
        this.LJLIL = (C47121t6) view.findViewById(R.id.c8h);
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.c8f);
        this.LJLJI = view.findViewById(R.id.c8g);
        C29306Beo.LJJLIIIJILLIZJL(data.LJLJI, view);
        C29306Beo.LJJJJJL(data.LJLJJI, view);
        int i2 = data.LJLIL;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            C47121t6 c47121t6 = this.LJLIL;
            if (c47121t6 != null) {
                C87277YNd.LJJIIZ(c47121t6);
            }
            C47121t6 c47121t62 = this.LJLILLLLZI;
            if (c47121t62 != null) {
                C87277YNd.LJJIJ(c47121t62);
            }
            View view2 = this.LJLJI;
            if (view2 != null) {
                C87277YNd.LJJIJ(view2);
            }
            C47121t6 c47121t63 = this.LJLILLLLZI;
            if (c47121t63 == null) {
                return;
            }
            c47121t63.setText(C15380j0.LJIILJJIL(data.LJLILLLLZI));
            return;
        }
        C47121t6 c47121t64 = this.LJLIL;
        if (c47121t64 != null) {
            C87277YNd.LJJIJ(c47121t64);
        }
        C47121t6 c47121t65 = this.LJLILLLLZI;
        if (c47121t65 != null) {
            C87277YNd.LJJIIZ(c47121t65);
        }
        View view3 = this.LJLJI;
        if (view3 != null) {
            C87277YNd.LJJIIZ(view3);
        }
        C47121t6 c47121t66 = this.LJLIL;
        if (c47121t66 == null) {
            return;
        }
        c47121t66.setText(C15380j0.LJIILJJIL(data.LJLILLLLZI));
    }
}
