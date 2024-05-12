package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class U21 extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final View LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C41061jK LJLJJLL;
    public final C47061t0 LJLJL;
    public final C56414MCc LJLJLJ;
    public final LinearLayout LJLJLLL;
    public final C47061t0 LJLL;
    public GiftMode LJLLI;
    public final C76280Twi LJLLILLLL;
    public final /* synthetic */ U20 LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U21(U20 u20, View view) {
        super(view);
        C76280Twi c76280Twi;
        this.LJLLJ = u20;
        this.LJLIL = (C47061t0) view.findViewById(R.id.dt6);
        this.LJLILLLLZI = view.findViewById(R.id.i44);
        this.LJLJI = (C47121t6) view.findViewById(R.id.dul);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.dtq);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.dsm);
        this.LJLJJLL = (C41061jK) view.findViewById(R.id.jm7);
        this.LJLJL = (C47061t0) view.findViewById(R.id.aeq);
        this.LJLJLJ = (C56414MCc) view.findViewById(R.id.f7q);
        this.LJLJLLL = (LinearLayout) view.findViewById(R.id.dtr);
        this.LJLL = (C47061t0) view.findViewById(R.id.d0c);
        if (u20.LJLIL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        this.LJLLILLLL = c76280Twi;
    }
}
