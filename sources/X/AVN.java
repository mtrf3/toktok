package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVN extends RecyclerView.ViewHolder {
    public String LJLIL;
    public final View LJLILLLLZI;
    public final C71799SFv LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final TuxIconView LJLJJLL;
    public final AVS LJLJL;

    public AVN(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.evj);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.item_view)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.avatar)");
        this.LJLJI = (C71799SFv) findViewById2;
        View findViewById3 = view.findViewById(R.id.fru);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.line0)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.frv);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.line1)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c0u);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.current_flag)");
        this.LJLJJLL = (TuxIconView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ghm);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.message_count)");
        this.LJLJL = (AVS) findViewById6;
    }

    public final void L(String str) {
        long j;
        HashMap<String, Long> hashMap;
        Long l;
        String str2 = this.LJLIL;
        if (str2 == null || str2.length() == 0 || o.LJ(this.LJLIL, "-1") || o.LJ(this.LJLIL, ((RBX) HG3.LJIILL()).getCurUserId())) {
            return;
        }
        if (!C54305LSz.LIZJ()) {
            String str3 = this.LJLIL;
            if (str3 == null || str3.length() == 0 || (hashMap = AVO.LIZIZ) == null || (l = hashMap.get(str3)) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(this.LJLJL.getCount(), "notification_cnt");
            c188727au.LJIIIZ("account_user_id", this.LJLIL);
            c188727au.LIZLLL(getAdapterPosition(), "order");
            c188727au.LJ(j, "dm_notification_cnt");
            FMX.LJIIL(str, c188727au.LIZ);
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LIZLLL(this.LJLJL.getCount(), "notification_cnt");
        c188727au2.LJIIIZ("account_user_id", this.LJLIL);
        c188727au2.LIZLLL(getAdapterPosition(), "order");
        FMX.LJIIL(str, c188727au2.LIZ);
    }
}
