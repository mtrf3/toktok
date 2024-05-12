package X;

import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Blo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29740Blo implements InterfaceC29734Bli {
    public boolean LIZ;
    public boolean LIZIZ;
    public EnumC29732Blg LIZJ;
    public C29750Bly LIZLLL;
    public final Handler LJ = new Handler(C16880lQ.LLJJJJ());
    public boolean LJFF;
    public LiveDialogFragment LJI;
    public boolean LJII;
    public final long LJIIIIZZ;

    public void LIZ() {
        throw null;
    }

    @Override // X.InterfaceC29734Bli
    public boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC29734Bli
    public final void LJ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        LIZ();
    }

    public C29740Blo() {
        long j;
        FansClubDynamicConfig fansClubDynamicConfig;
        FansClubConfig fansClubConfig = FansClubSettings.INSTANCE.getFansClubConfig();
        if (fansClubConfig != null && (fansClubDynamicConfig = fansClubConfig.fansClubDynamicConfig) != null) {
            j = fansClubDynamicConfig.playGuideAnimDelayTime;
        } else {
            j = 4000;
        }
        this.LJIIIIZZ = j;
    }

    public final void LIZIZ(DataChannel dataChannel) {
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment;
        LiveDialogFragment liveDialogFragment2;
        LiveDialogFragment liveDialogFragment3;
        this.LJI = ((IFansClubService) CN1.LIZ(IFansClubService.class)).b70("entrance");
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (liveDialogFragment = this.LJI) != null && !liveDialogFragment.isShowing() && (liveDialogFragment2 = this.LJI) != null && !liveDialogFragment2.isAdded() && (liveDialogFragment3 = this.LJI) != null) {
            liveDialogFragment3.showNow(fragmentManager, "fans dialog");
        }
    }

    public final void LIZJ(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        long j;
        int i;
        long j2;
        String str3;
        if (z2) {
            str2 = "click";
        } else {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            str2 = "show";
        }
        C29750Bly c29750Bly = this.LIZLLL;
        if (c29750Bly != null) {
            j = c29750Bly.LIZ;
            i = c29750Bly.LJ;
            j2 = c29750Bly.LJII;
        } else {
            j = 0;
            i = 0;
            j2 = 0;
        }
        if (j <= 0) {
            str3 = "before";
        } else if (i == 2) {
            str3 = "sleep";
        } else {
            str3 = "after";
        }
        if (this.LIZ) {
            if (j2 > 0) {
                str3 = "have_fans";
            } else {
                str3 = "zero_fans";
            }
        }
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService != null) {
            iFansClubService.SI(this.LIZ, str3, str, z, str2, z3);
        }
    }
}
