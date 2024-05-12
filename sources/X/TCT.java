package X;

import Y.ACListenerS24S0100000_4;
import Y.ACListenerS32S0100000_12;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCT implements TCX {
    public final Context LIZ;
    public final View LIZIZ;
    public final LinearLayout LIZJ;
    public final LinearLayout LIZLLL;
    public final TuxTextView LJ;
    public final TuxTextView LJFF;
    public final TuxIconView LJI;
    public final TuxIconView LJII;
    public final RelativeLayout LJIIIIZZ;
    public final RelativeLayout LJIIIZ;
    public final TuxIconView LJIIJ;
    public final TuxIconView LJIIJJI;
    public C57273Mdp LJIIL;
    public final List<TCW> LJIILIIL;
    public InterfaceC65784Pro<C76800UCe> LJIILJJIL;
    public final Keva LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;

    public final void LIZJ() {
        int i;
        int i2 = 0;
        if (CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
            try {
                FFL.LJIIIZ().getClass();
                if (FFL.LJ(31744, "tt_commercial_music_enable_alert", true, false)) {
                    long j = this.LJIILL.getLong("is_commercial_dialog_shown", -1L);
                    if (j == -1 || System.currentTimeMillis() - j > 2592000000L) {
                        ICreativeSAAService LIZ = SAAService.LIZ();
                        if (LIZ != null) {
                            Activity LJIJJ = C45804HyK.LJIJJ(this.LIZ);
                            if (LJIJJ != null) {
                                LIZ.invokeMethodsSafely(LJIJJ, new AqS154S0100000_4(this, 1263));
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        this.LJIILL.storeLong("is_commercial_dialog_shown", System.currentTimeMillis());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        TuxIconView tuxIconView = this.LJIIJ;
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        C16880lQ.LJJJ(this.LJIIJ, new ACListenerS24S0100000_4(this, 325));
        TuxIconView tuxIconView2 = this.LJIIJJI;
        if (!CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            i2 = 8;
        }
        tuxIconView2.setVisibility(i2);
        C16880lQ.LJJJ(this.LJIIJJI, new ACListenerS24S0100000_4(this, 326));
    }

    @Override // X.TCX
    public final void LIZ(TCW struct) {
        o.LJIIIZ(struct, "struct");
        if (!struct.LIZ) {
            this.LJ.setText(R.string.cqe);
            this.LJFF.setText(R.string.cqe);
        } else {
            this.LJ.setText(R.string.ig6);
            this.LJFF.setText(R.string.ig6);
        }
        C57273Mdp c57273Mdp = this.LJIIL;
        if (c57273Mdp != null) {
            c57273Mdp.dismiss();
        }
        InterfaceC51059K2d musicContext = CommerceToolsService.LIZ().getMusicContext();
        boolean inCommercialSoundPage = musicContext.getInCommercialSoundPage();
        boolean z = struct.LIZ;
        if (inCommercialSoundPage != z) {
            musicContext.setInCommercialSoundPage(z);
            LIZJ();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIILJJIL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public final void LIZIZ(float f) {
        if (Float.isNaN(f)) {
            if (!this.LIZJ.isClickable()) {
                this.LIZJ.setEnabled(true);
                this.LIZJ.setClickable(true);
            }
            if (!this.LIZLLL.isClickable()) {
                this.LIZLLL.setEnabled(true);
                this.LIZLLL.setClickable(true);
                return;
            }
            return;
        }
        if (this.LIZJ.isClickable()) {
            this.LIZJ.setEnabled(false);
            this.LIZJ.setClickable(false);
        }
        if (!this.LIZLLL.isClickable()) {
            return;
        }
        this.LIZLLL.setEnabled(false);
        this.LIZLLL.setClickable(false);
    }

    public final void LIZLLL(RelativeLayout relativeLayout) {
        boolean z;
        TuxIconView tuxIconView;
        if (C63057Oov.LIZ() && !this.LJIIZILJ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIIIZZ.getVisibility() == 0) {
            tuxIconView = this.LJI;
        } else {
            tuxIconView = this.LJII;
        }
        if (this.LJIIL == null || this.LJIILLIIL != z) {
            this.LJIILLIIL = z;
            ((ArrayList) this.LJIILIIL).clear();
            C57273Mdp c57273Mdp = new C57273Mdp(this.LIZ, this, this.LJIILLIIL);
            c57273Mdp.setWidth(C60996Nwm.LIZIZ(this.LIZ));
            ((ArrayList) this.LJIILIIL).add(new TCW(false, R.string.cqe));
            ((ArrayList) this.LJIILIIL).add(new TCW(true, R.string.ig6));
            List<TCW> list = this.LJIILIIL;
            o.LJIIIZ(list, "list");
            TCU tcu = c57273Mdp.LIZIZ;
            if (tcu != null) {
                tcu.setData(list);
                c57273Mdp.setOnDismissListener(new TCV(tuxIconView));
                this.LJIIL = c57273Mdp;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        C57273Mdp c57273Mdp2 = this.LJIIL;
        if (c57273Mdp2 != null) {
            if (C4XM.LIZ()) {
                C56308M8a.LIZ();
            }
            C46318IFu.LIZ.getClass();
            if (C46318IFu.LIZ()) {
                try {
                    C56308M8a.LIZIZ();
                    Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c57273Mdp2));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    int i = attributes.flags;
                    boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                    C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                    attributes.flags &= -16777217;
                    c57273Mdp2.showAsDropDown(relativeLayout);
                    C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                    attributes.flags = i;
                } catch (Throwable unused) {
                    c57273Mdp2.showAsDropDown(relativeLayout);
                }
            } else {
                c57273Mdp2.showAsDropDown(relativeLayout);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 180.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public TCT(Context context, View rootView) {
        int i;
        User currentUser;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = context;
        this.LIZIZ = rootView;
        View findViewById = rootView.findViewById(R.id.g6n);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.ll_title)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.LIZJ = linearLayout;
        View findViewById2 = rootView.findViewById(R.id.brr);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.const_ll_title)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById2;
        this.LIZLLL = linearLayout2;
        View findViewById3 = rootView.findViewById(R.id.mo6);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.tv_title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJ = tuxTextView;
        View findViewById4 = rootView.findViewById(R.id.brx);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.const_tv_title)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById4;
        this.LJFF = tuxTextView2;
        View findViewById5 = rootView.findViewById(R.id.fbg);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.iv_title)");
        TuxIconView tuxIconView = (TuxIconView) findViewById5;
        this.LJI = tuxIconView;
        View findViewById6 = rootView.findViewById(R.id.brq);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.const_iv_title)");
        TuxIconView tuxIconView2 = (TuxIconView) findViewById6;
        this.LJII = tuxIconView2;
        View findViewById7 = rootView.findViewById(R.id.l_5);
        o.LJIIIIZZ(findViewById7, "rootView.findViewById(R.id.title_bar_bg)");
        this.LJIIIIZZ = (RelativeLayout) findViewById7;
        View findViewById8 = rootView.findViewById(R.id.bru);
        o.LJIIIIZZ(findViewById8, "rootView.findViewById(R.id.const_title_bar_bg)");
        this.LJIIIZ = (RelativeLayout) findViewById8;
        View findViewById9 = rootView.findViewById(R.id.f0x);
        o.LJIIIIZZ(findViewById9, "rootView.findViewById(R.…iv_commercial_music_help)");
        this.LJIIJ = (TuxIconView) findViewById9;
        View findViewById10 = rootView.findViewById(R.id.brp);
        o.LJIIIIZZ(findViewById10, "rootView.findViewById(R.…iv_commercial_music_help)");
        this.LJIIJJI = (TuxIconView) findViewById10;
        this.LJIILIIL = new ArrayList();
        this.LJIILL = Keva.getRepo("commercial_music_dialog_repo");
        if (CommerceMediaServiceImpl.LIZJ().LJIILIIL()) {
            tuxIconView.setVisibility(0);
            boolean LJIIIZ = CommerceMediaServiceImpl.LIZJ().LJIIIZ();
            int i2 = R.string.cqe;
            if (LJIIIZ) {
                i = R.string.ig6;
            } else {
                i = R.string.cqe;
            }
            tuxTextView.setText(i);
            C7FA.LIZIZ(linearLayout);
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS32S0100000_12(this, 198));
            tuxIconView2.setVisibility(0);
            tuxTextView2.setText(CommerceMediaServiceImpl.LIZJ().LJIIIZ() ? R.string.ig6 : i2);
            C7FA.LIZIZ(linearLayout2);
            C16880lQ.LJIIZILJ(linearLayout2, new ACListenerS32S0100000_12(this, 199));
            if (C59406NTe.LJIIIIZZ()) {
                LIZ(new TCW(true, R.string.ig6));
            }
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null && currentUser.getMusicComplianceAccount() <= 0 && C59411NTj.LIZIZ.LIZIZ() == 1) {
                C16880lQ.LJIIZILJ(linearLayout, TCZ.LJLIL);
                tuxIconView.setVisibility(8);
            }
        }
        LIZJ();
    }
}
