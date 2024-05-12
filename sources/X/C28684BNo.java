package X;

import Y.AfS36S0101000_5;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BNo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28684BNo extends BNR {
    public final C73893SzJ<Boolean> LJLJI;
    public final String LJLJJI;
    public final View LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;

    public final void M(int i) {
        if (i == 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_explore_empty_show");
            C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
            LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJII()), "has_banner");
            LIZ.LJIJJ(c08680Vs.LJII, "tab_type");
            C1FL.LJI(LIZ, c08680Vs.LJIIJJI, "landing_reason");
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_explore_no_more_show");
        C08680Vs c08680Vs2 = C08680Vs.LJIILJJIL;
        LIZ2.LJIJJ(Integer.valueOf(c08680Vs2.LJII()), "has_banner");
        LIZ2.LJIJJ(c08680Vs2.LJII, "tab_type");
        LIZ2.LJIJJ(this.LJLJJI, "no_more_type");
        C78895Uxn.LIZIZ(LIZ2, c08680Vs2.LJIIJJI, "landing_reason", i, "show_num");
        LIZ2.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
        LIZ2.LJIJJ(Integer.valueOf(c08680Vs2.LJFF()), C08680Vs.LJIIZILJ);
        LIZ2.LJIJJ(c08680Vs2.LIZIZ(), "entrance_type");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    @Override // X.BNR
    public final void bind(Object obj, int i) {
        if (i == 0) {
            this.LJLJJL.setVisibility(0);
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJL.setVisibility(8);
            this.LJLJJLL.setVisibility(0);
        }
        if (this.LJLJJI.contains("game_drawer_drops")) {
            this.LJLJL.setText(R.string.lar);
            this.LJLJJLL.setText("");
        } else {
            this.LJLJJLL.setText(R.string.kxy);
            this.LJLJL.setText(R.string.kxv);
        }
        M(i);
        C73893SzJ<Boolean> c73893SzJ = this.LJLJI;
        if (c73893SzJ != null) {
            this.LJLILLLLZI.LIZ(c73893SzJ.LJJJJZI(new AfS36S0101000_5(i, this, 70)));
        }
    }

    public C28684BNo(View view, C73893SzJ<Boolean> c73893SzJ, String str) {
        super(view);
        this.LJLJI = c73893SzJ;
        this.LJLJJI = str;
        this.LJLJJL = view.findViewById(R.id.cvq);
        this.LJLJJLL = (TextView) view.findViewById(R.id.cwu);
        this.LJLJL = (TextView) view.findViewById(R.id.chj);
    }
}
