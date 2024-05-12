package X;

import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationDialog;
import com.bytedance.android.livesdkapi.depend.live.OrganizationModelExt;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import kotlin.jvm.internal.o;

/* renamed from: X.BXt */
/* loaded from: classes6.dex */
public final class C28949BXt {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostSetting.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        return ((IHostSetting) LIZ2).enableDonationPercentService();
    }

    public static String LIZIZ() {
        if (LIZ()) {
            return "percent";
        }
        return "tiltify";
    }

    public static void LJ(boolean z, long j, String str, Throwable th) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" info-> isAnchor:");
        LIZ2.append(z);
        LIZ2.append(" roomId: ");
        LIZ2.append(j);
        LIZ2.append(" percent: ");
        LIZ2.append(LIZ());
        LIZ2.append(" + region: ");
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHostUser.class);
        o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
        LIZ2.append(((IHostUser) LIZ3).getCurrentRegionCode());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (th == null) {
            th = new Throwable(LIZIZ);
        }
        C0K2.LIZ(LIZIZ, th);
    }

    public static final void LIZJ(ActivityC45651qj fragmentActivity, String url, OrganizationModelExt organizationModelExt, C78855Ux9 c78855Ux9, boolean z, boolean z2) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(url, "url");
        LiveStickerDonationDialog liveStickerDonationDialog = new LiveStickerDonationDialog();
        liveStickerDonationDialog.LJLIL = url;
        liveStickerDonationDialog.LJLILLLLZI = organizationModelExt;
        liveStickerDonationDialog.LJLJI = c78855Ux9;
        liveStickerDonationDialog.LJLJJI = z;
        liveStickerDonationDialog.LJLJJL = z2;
        BaseDialogFragment.wl(fragmentActivity, liveStickerDonationDialog);
    }

    public static /* synthetic */ void LIZLLL(ActivityC45651qj activityC45651qj, String str, OrganizationModelExt organizationModelExt, C78855Ux9 c78855Ux9, boolean z, int i) {
        boolean z2;
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ(activityC45651qj, str, organizationModelExt, c78855Ux9, z, z2);
    }
}
