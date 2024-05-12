package Y;

import X.C26045AKb;
import X.C69995RdX;
import X.C71773SEv;
import X.C72599SeR;
import X.C79902VXm;
import X.InterfaceC72616Sei;
import X.OUP;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.view.autocreation.ProfileNaviAutoCreationCameraContainerFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS13S1100000_12 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        InterfaceC72616Sei naviManager;
        Bitmap LJJJJZ;
        try {
            Object LJI = new Gson().LJI(this.s0, ProfileNaviDataModel.class);
            o.LJIIIIZZ(LJI, "Gson().fromJson(arg3, Pr…aviDataModel::class.java)");
            ProfileNaviDataModel profileNaviDataModel = (ProfileNaviDataModel) LJI;
            C79902VXm c79902VXm = (C79902VXm) ((ProfileNaviAutoCreationCameraContainerFragment) this.l1)._$_findCachedViewById(R.id.i7o);
            if (c79902VXm != null && (naviManager = c79902VXm.getNaviManager()) != null && (LJJJJZ = naviManager.LJJJJZ(false)) != null) {
                ProfileNaviAutoCreationViewModel profileNaviAutoCreationViewModel = (ProfileNaviAutoCreationViewModel) ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).LJLIL.getValue();
                profileNaviAutoCreationViewModel.getClass();
                ((ProfileNaviAutoCreationState) profileNaviAutoCreationViewModel.lv0()).setSelfieBitmap(LJJJJZ);
                ProfileNaviAutoCreationViewModel profileNaviAutoCreationViewModel2 = (ProfileNaviAutoCreationViewModel) ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).LJLIL.getValue();
                profileNaviAutoCreationViewModel2.getClass();
                profileNaviAutoCreationViewModel2.setStateImmediate(new AqS178S0100000_12(profileNaviDataModel, LiveChatShowDelayForHotLiveSetting.DEFAULT));
                profileNaviAutoCreationViewModel2.setStateImmediate(C72599SeR.LJLIL);
            }
        } catch (Exception e) {
            if (e.getMessage() != null) {
                ((ProfileNaviAutoCreationCameraContainerFragment) this.l1).getTag();
            }
        }
    }

    public final void LIZ$1() {
        TextPaint paint = ((TextView) ((C71773SEv) this.l1).LIZ(R.id.lwg)).getPaint();
        paint.setTextSize(((TextView) ((C71773SEv) this.l1).LIZ(R.id.lwg)).getTextSize());
        if (paint.measureText(this.s0) > ((C71773SEv) this.l1).LIZ(R.id.lwg).getWidth()) {
            View tvExtraInfoRight = ((C71773SEv) this.l1).LIZ(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            OUP.LJIJJLI(tvExtraInfoRight);
            View tvExtraInfoBelow = ((C71773SEv) this.l1).LIZ(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
            OUP.LJJLIIIJ(tvExtraInfoBelow);
            ((TextView) ((C71773SEv) this.l1).LIZ(R.id.lwf)).setText(this.s0);
            ((TextView) ((C71773SEv) this.l1).LIZ(R.id.lwf)).setMaxLines(1);
            return;
        }
        View tvExtraInfoRight2 = ((C71773SEv) this.l1).LIZ(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
        OUP.LJJLIIIJ(tvExtraInfoRight2);
        View tvExtraInfoBelow2 = ((C71773SEv) this.l1).LIZ(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow2, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow2);
    }

    public final void LIZ$2() {
        TextPaint paint = ((TextView) ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwg)).getPaint();
        paint.setTextSize(((TextView) ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwg)).getTextSize());
        if (paint.measureText(this.s0) > ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwg).getWidth()) {
            View tvExtraInfoRight = ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            OUP.LJIJJLI(tvExtraInfoRight);
            View tvExtraInfoBelow = ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
            OUP.LJJLIIIJ(tvExtraInfoBelow);
            ((TextView) ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwf)).setText(this.s0);
            return;
        }
        View tvExtraInfoRight2 = ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
        OUP.LJJLIIIJ(tvExtraInfoRight2);
        View tvExtraInfoBelow2 = ((SubPaymentViewHolder) this.l1)._$_findCachedViewById(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow2, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow2);
    }

    public static final void run$0(ARunnableS13S1100000_12 aRunnableS13S1100000_12) {
        boolean LIZ;
        try {
            aRunnableS13S1100000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S1100000_12 aRunnableS13S1100000_12) {
        boolean LIZ;
        try {
            aRunnableS13S1100000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S1100000_12 aRunnableS13S1100000_12) {
        boolean LIZ;
        try {
            C26045AKb c26045AKb = new C26045AKb(((USAddonOrderVH) aRunnableS13S1100000_12.l1).LJLIL);
            c26045AKb.LJIIIZ(aRunnableS13S1100000_12.s0);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S1100000_12 aRunnableS13S1100000_12) {
        boolean LIZ;
        try {
            C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) aRunnableS13S1100000_12.l1;
            String str = aRunnableS13S1100000_12.s0;
            c69995RdX.getClass();
            C69995RdX.LLLZLL(pdpEnterParam, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S1100000_12 aRunnableS13S1100000_12) {
        boolean LIZ;
        try {
            aRunnableS13S1100000_12.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
