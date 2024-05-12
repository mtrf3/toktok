package X;

import android.view.View;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSO extends C56906MVa {
    public final C73305Spp LJLIL;
    public MSP LJLILLLLZI;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    public MSO(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cvo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.empty_status_view)");
        this.LJLIL = (C73305Spp) findViewById;
    }

    public final void M(int i, int i2, Integer num) {
        C73306Spq c73306Spq = new C73306Spq();
        String string = this.mFragment.getString(i);
        o.LJIIIIZZ(string, "fragment.getString(titleId)");
        c73306Spq.LJFF = string;
        String string2 = this.mFragment.getString(i2);
        o.LJIIIIZZ(string2, "fragment.getString(descId)");
        c73306Spq.LJI = string2;
        if (num != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = num.intValue();
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
        }
        if (i == R.string.r_ && QnaService.LIZ().enablePublicQna()) {
            c73306Spq.LJII = new AqS175S0100000_9(this, 166);
        }
        if (C1DH.LJIJJLI()) {
            String string3 = this.mFragment.getString(R.string.hn6);
            o.LJIIIIZZ(string3, "fragment.getString(R.str…notification_description)");
            c73306Spq.LJFF = string3;
        }
        this.LJLIL.setStatus(c73306Spq);
    }
}
