package X;

import Y.ACListenerS25S0100000_5;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class CD7 extends CDI {
    public final C47121t6 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final CVT LJLJJI;
    public final ViewGroup LJLJJL;
    public final ViewGroup LJLJJLL;
    public final ImageView LJLJL;
    public final /* synthetic */ CDG LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CD7(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh2, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLJLJ = cdg;
        this.LJLIL = (C47121t6) this.itemView.findViewById(R.id.hdr);
        this.LJLILLLLZI = (C47121t6) this.itemView.findViewById(R.id.cas);
        this.LJLJI = (C47121t6) this.itemView.findViewById(R.id.dal);
        this.LJLJJI = (CVT) this.itemView.findViewById(R.id.knd);
        this.LJLJJL = (ViewGroup) this.itemView.findViewById(R.id.i45);
        this.LJLJJLL = (ViewGroup) this.itemView.findViewById(R.id.d_w);
        this.LJLJL = (ImageView) this.itemView.findViewById(R.id.d_x);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (this.LJLJLJ.LJLJJLL) {
            C29306Beo.LJJLIIIJJI(this.LJLJJL, false);
            C29306Beo.LJJLIIIJJI(this.LJLJJI, true);
            return;
        }
        C29306Beo.LJJLIIIJJI(this.LJLJJL, true);
        C29306Beo.LJJLIIIJJI(this.LJLJJI, false);
        String originalPrice = C15380j0.LJIILL(R.string.oey, this.LJLJLJ.LJLJJI);
        o.LJIIIIZZ(originalPrice, "originalPrice");
        int LJJLIIIJL = s.LJJLIIIJL(originalPrice, this.LJLJLJ.LJLJJI, 0, false, 6);
        SpannableString spannableString = new SpannableString(originalPrice);
        spannableString.setSpan(new StrikethroughSpan(), LJJLIIIJL, this.LJLJLJ.LJLJJI.length() + LJJLIIIJL, 33);
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            c47121t6.setText(spannableString);
        }
        C47121t6 c47121t62 = this.LJLILLLLZI;
        if (c47121t62 != null) {
            c47121t62.setText(this.LJLJLJ.LJLJJL);
        }
        C47121t6 c47121t63 = this.LJLJI;
        if (c47121t63 != null) {
            c47121t63.setText(C15380j0.LJIILJJIL(R.string.oex));
        }
        C15490jB.LJ(this.LJLJL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_fest_annivesary.png");
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS25S0100000_5(this.LJLJLJ, 354));
        }
        C30956CCy.LIZIZ(EnumC30955CCx.AUDIENCE_PRIVILEGE_PAGE, false, C29232Bdc.LJIL(C29306Beo.LJJIJLIJ(C51029K0z.LJIILIIL(this.LJLJLJ.LJLIL))), this.LJLJLJ.LJLJLJ);
    }
}
