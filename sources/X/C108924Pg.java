package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108924Pg implements InterfaceC108974Pl {
    public final Context LIZ;
    public SharePanelViewModel LIZIZ;
    public final C107724Kq LIZJ;
    public SY4 LIZLLL;
    public IMContact LJ;
    public int LJFF;
    public C108914Pf LJI;

    @Override // X.InterfaceC108974Pl
    public final void LIZ() {
        SY4 sy4 = this.LIZLLL;
        if (sy4 != null) {
            sy4.setButtonVariant(5);
            sy4.setText(R.string.tdh);
        }
    }

    @Override // X.InterfaceC108974Pl
    public final void LIZIZ() {
        IMContact iMContact = this.LJ;
        if (iMContact != null) {
            iMContact.setShareSuccess(true);
        }
        SY4 sy4 = this.LIZLLL;
        if (sy4 != null) {
            sy4.setButtonVariant(5);
            sy4.setText(R.string.cp9);
        }
    }

    @Override // X.InterfaceC108974Pl
    public final void LIZJ() {
        SY4 sy4 = this.LIZLLL;
        if (sy4 != null) {
            sy4.setButtonVariant(0);
            sy4.setText(R.string.qic);
        }
        Fragment fragment = this.LIZIZ.LLII;
        if (fragment == null) {
            return;
        }
        C31811Ce7.LIZJ(fragment, R.string.a2c);
    }

    public final void LIZLLL(ViewGroup viewGroup) {
        SY4 sy4 = (SY4) viewGroup.findViewById(R.id.az1);
        sy4.getClass();
        sy4.setButtonVariant(0);
        sy4.setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(78)));
        sy4.setMinTextSize(9.0f);
        this.LIZLLL = sy4;
        ACListenerS21S0100000_1 aCListenerS21S0100000_1 = new ACListenerS21S0100000_1(this, 247);
        C16880lQ.LJJIZ(sy4, aCListenerS21S0100000_1);
        C16880lQ.LJIIL(viewGroup, aCListenerS21S0100000_1);
    }

    public C108924Pg(Context context, SharePanelViewModel sharePanelViewModel, C107724Kq c107724Kq) {
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        this.LIZ = context;
        this.LIZIZ = sharePanelViewModel;
        this.LIZJ = c107724Kq;
        this.LJFF = -1;
        this.LJI = new C108914Pf(context, sharePanelViewModel, this);
    }
}
