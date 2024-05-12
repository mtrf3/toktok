package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BEd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28439BEd extends RecyclerView.ViewHolder implements InterfaceC28459BEx, InterfaceC28458BEw, InterfaceC28558BIs {
    public static final SimpleDateFormat LJLLLL = new SimpleDateFormat("MM/dd/yyyy");
    public C31597Caf LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public C47061t0 LJLJL;
    public final Context LJLJLJ;
    public List<User> LJLJLLL;
    public final String LJLL;
    public User LJLLI;
    public final long LJLLILLLL;
    public final long LJLLJ;
    public final BEW LJLLL;

    @Override // X.InterfaceC28458BEw
    public final void Hh() {
    }

    @Override // X.InterfaceC28459BEx
    public final void K() {
    }

    @Override // X.InterfaceC28459BEx
    public final void LJLIIL(C28465BFd c28465BFd, Exception exc) {
    }

    @Override // X.InterfaceC28458BEw
    public final void k1(C28465BFd c28465BFd, Exception exc) {
    }

    @Override // X.InterfaceC28558BIs
    public final void U3(Exception exc) {
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJJI.setVisibility(8);
    }

    @Override // X.InterfaceC28558BIs
    public final void ck(boolean z) {
        if (!z) {
            User user = this.LJLLI;
            if (user != null) {
                BEV bev = new BEV(user.getId());
                C73943T0h.LIZ().LIZIZ(bev);
                BEW bew = this.LJLLL;
                if (bew != null) {
                    bew.LIZIZ(bev);
                }
            }
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
        }
    }

    @Override // X.InterfaceC28459BEx
    public final void l(boolean z) {
        if (!z) {
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
            BEU beu = new BEU(false, this.LJLLI.getId());
            BEW bew = this.LJLLL;
            if (bew != null) {
                bew.LIZ(beu);
            }
            C73943T0h.LIZ().LIZIZ(beu);
        }
    }

    @Override // X.InterfaceC28459BEx
    public final void b(Exception exc, boolean z) {
        if (!z) {
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
            BPP.LIZJ(this.LJLJLJ, exc);
        }
    }

    public C28439BEd(Context context, View view, String str, long j, long j2, BER ber) {
        super(view);
        this.LJLJLLL = new ArrayList();
        this.LJLIL = (C31597Caf) view.findViewById(R.id.e44);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.b3r);
        this.LJLJJI = view.findViewById(R.id.b40);
        this.LJLJJL = (TextView) view.findViewById(R.id.h1_);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mzt);
        this.LJLJL = (C47061t0) view.findViewById(R.id.myp);
        this.LJLJI = view.findViewById(R.id.b3y);
        this.LJLJLJ = context;
        this.LJLL = str;
        this.LJLLILLLL = j;
        this.LJLLJ = j2;
        this.LJLLL = ber;
    }
}
