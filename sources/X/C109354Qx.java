package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109354Qx extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLJLJ = 0;
    public SharePanelViewModel LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        new C109064Pu();
    }

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    public final C77869UhF N() {
        return (C77869UhF) this.LJLJJI.getValue();
    }

    public final TuxIconView P() {
        return (TuxIconView) this.LJLJJLL.getValue();
    }

    public final InterfaceC109364Qy Q() {
        return (InterfaceC109364Qy) this.LJLJL.getValue();
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        if (!this.LJLJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("repost button show from ");
            if (this.LJLILLLLZI) {
                str = "long press panel";
            } else {
                str = "share panel";
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            SharePanelViewModel viewModel = this.LJLIL;
            o.LJIIIZ(viewModel, "viewModel");
            SharePackage sharePackage = viewModel.LJLIL;
            String str5 = "";
            if (sharePackage == null || (bundle4 = sharePackage.extras) == null || (str2 = bundle4.getString("aid")) == null) {
                str2 = "";
            }
            int LJIIIZ = ((InterfaceC109364Qy) viewModel.LLI.getValue()).LJIIIZ(str2);
            SharePackage sharePackage2 = viewModel.LJLIL;
            if (sharePackage2 == null || (bundle3 = sharePackage2.extras) == null || (str3 = bundle3.getString("aid")) == null) {
                str3 = "";
            }
            SharePackage sharePackage3 = viewModel.LJLIL;
            if (sharePackage3 == null || (bundle2 = sharePackage3.extras) == null || (str4 = bundle2.getString("event_type")) == null) {
                str4 = "";
            }
            SharePackage sharePackage4 = viewModel.LJLIL;
            if (sharePackage4 != null && (bundle = sharePackage4.extras) != null && (string = bundle.getString("enter_method")) != null) {
                str5 = string;
            }
            if (LJIIIZ == 0 || LJIIIZ == 2) {
                OSZ[] oszArr = new OSZ[4];
                oszArr[0] = new OSZ(str4, "enter_from");
                if (LJIIIZ == 0) {
                    i = -1;
                } else {
                    i = 1;
                }
                oszArr[1] = new OSZ(Integer.valueOf(i), "reposted");
                oszArr[2] = new OSZ(str3, "group_id");
                oszArr[3] = new OSZ(str5, "panel_source");
                FMX.LJIILL("repost_button_show", oszArr);
            }
            this.LJLJI = true;
        }
    }

    public final boolean T(int i) {
        boolean LJJIJIIJIL = ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{1, 3});
        java.util.Set<IMContact> LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if ((LJIIIIZZ != null && !LJIIIIZZ.isEmpty()) || LJJIJIIJIL) {
            return true;
        }
        return false;
    }

    public final void L(IMContact contact, SharePanelViewModel newViewModel) {
        String str;
        C77869UhF N;
        Bundle bundle;
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(newViewModel, "newViewModel");
        this.LJLIL = newViewModel;
        if (!(contact instanceof C4QO) || contact == null) {
            return;
        }
        SharePackage sharePackage = newViewModel.LJLIL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (str = bundle.getString("aid")) == null) {
            str = "";
        }
        int LJIIIZ = ((InterfaceC109364Qy) newViewModel.LLI.getValue()).LJIIIZ(str);
        if (ORY.LJJIJIIJIL(Integer.valueOf(LJIIIZ), new Integer[]{0, 1})) {
            String LJIIIIZZ = Q().LJIIIIZZ();
            int LIZLLL = Q().LIZLLL();
            C77869UhF N2 = N();
            if (N2 != null) {
                N2.setAnimation(LJIIIIZZ);
            }
            ((TextView) this.LJLJJL.getValue()).setText(C86V.LJFF(LIZLLL));
            TuxIconView P = P();
            if (P != null) {
                P.setIconRes(R.raw.icon_repost_fill);
            }
        } else {
            int LIZIZ = Q().LIZIZ();
            int LJI = Q().LJI();
            C77869UhF N3 = N();
            if (N3 != null) {
                N3.setImageResource(LIZIZ);
            }
            ((TextView) this.LJLJJL.getValue()).setText(C86V.LJFF(LJI));
            TuxIconView P2 = P();
            if (P2 != null) {
                P2.setIconRes(R.raw.icon_repost_tick);
            }
        }
        if (T(LJIIIZ)) {
            C77869UhF N4 = N();
            if (N4 != null) {
                N4.setAlpha(0.34f);
            }
            ((View) this.LJLJJL.getValue()).setAlpha(0.34f);
            TuxIconView P3 = P();
            if (P3 != null) {
                P3.setAlpha(0.34f);
            }
        } else {
            C77869UhF N5 = N();
            if (N5 != null) {
                N5.setAlpha(1.0f);
            }
            ((View) this.LJLJJL.getValue()).setAlpha(1.0f);
            TuxIconView P4 = P();
            if (P4 != null) {
                P4.setAlpha(1.0f);
            }
        }
        if (!C7HV.LIZIZ.LIZLLL().LJIILIIL() && LJIIIZ == 0) {
            Q().LJFF();
            C77869UhF N6 = N();
            if (N6 != null) {
                N6.setRepeatCount(Q().LJ());
            }
            if (!C204147zm.LIZIZ && (N = N()) != null) {
                N.playAnimation();
            }
        }
        if (T(LJIIIZ)) {
            C77869UhF N7 = N();
            if (N7 != null) {
                N7.setOnClickListener(new ViewOnClickListenerC13880ga(null));
            }
            TuxIconView P5 = P();
            if (P5 != null) {
                C16880lQ.LJJJ(P5, null);
                return;
            }
            return;
        }
        C77869UhF N8 = N();
        if (N8 != null) {
            N8.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS36S0200000_1(contact, this, 93)));
        }
        TuxIconView P6 = P();
        if (P6 != null) {
            C16880lQ.LJJJ(P6, new ACListenerS36S0200000_1(contact, this, 94));
        }
        if (!this.LJLILLLLZI) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(contact, this, 95), this.itemView.findViewById(R.id.eut));
    }

    public final void M(Context context, IMContact iMContact) {
        SharePanelViewModel sharePanelViewModel = this.LJLIL;
        SharePackage sharePackage = sharePanelViewModel.LJLIL;
        if (sharePackage != null) {
            BaseSharePackage.LJII(sharePackage, context, null, new AqS148S0200000_1(this, iMContact, 58), 6);
        } else {
            sharePanelViewModel.LJIILL(iMContact, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109354Qx(View view, SharePanelViewModel viewModel, boolean z) {
        super(view);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = z;
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(view, 1044));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(view, 1045));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS148S0200000_1(this, view, 57));
        this.LJLJL = C221108m2.LIZIZ(C109294Qr.LJLIL);
    }
}
