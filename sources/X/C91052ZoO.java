package X;

import Y.IDRunnableS66S0000000_28;
import Y.IDRunnableS87S0100000_28;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.utils.background.BackgroundProvider;
import com.bytedance.bdlocation.utils.network.NetworkManager;

/* renamed from: X.ZoO, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91052ZoO implements BackgroundProvider.Callback {
    public final /* synthetic */ C91043ZoF LIZ;

    public C91052ZoO(C91043ZoF c91043ZoF) {
        this.LIZ = c91043ZoF;
    }

    @Override // com.bytedance.bdlocation.utils.background.BackgroundProvider.Callback
    public final void onAppBackgroundSwitch(boolean z) {
        BroadcastReceiver broadcastReceiver;
        Logger.i("onAppBackgroundSwitch isEnterBackground:" + z);
        if (!z) {
            C91043ZoF c91043ZoF = this.LIZ;
            if (c91043ZoF.LJFF) {
                c91043ZoF.LJFF = false;
                Context context = c91043ZoF.LIZIZ;
                if (context == null) {
                    return;
                }
                Logger.d("ColdBootManager startUploadTask");
                if (!C36841Ed3.LIZIZ(context) || !BDLocationConfig.isReportAtStart()) {
                    return;
                }
                c91043ZoF.LIZ.postDelayed(new IDRunnableS66S0000000_28(1), 3000L);
                return;
            }
            C91043ZoF c91043ZoF2 = this.LIZ;
            c91043ZoF2.getClass();
            Logger.i("enter foreground");
            BDLocationConfig.setRequestLocation(false);
            c91043ZoF2.LIZ.postDelayed(new IDRunnableS66S0000000_28(0), BDLocationConfig.getBootLegitimateTime());
            c91043ZoF2.LIZIZ();
            NetworkManager.getInstance().registerObserver(c91043ZoF2.LIZIZ);
            c91043ZoF2.LIZ.post(new IDRunnableS87S0100000_28(c91043ZoF2, 0));
            return;
        }
        C91043ZoF c91043ZoF3 = this.LIZ;
        c91043ZoF3.getClass();
        Logger.i("enter background");
        C91049ZoL LIZ = C91049ZoL.LIZ();
        synchronized (LIZ) {
            if (LIZ.LIZIZ != null && LIZ.LIZ) {
                LIZ.LIZLLL = BDLocationConfig.getUploadInterval();
                RunnableC91034Zo6 runnableC91034Zo6 = LIZ.LIZIZ;
                runnableC91034Zo6.getClass();
                Logger.d("BDLocation_LocationScheduler_pollupload:onCancel");
                runnableC91034Zo6.LJLILLLLZI = true;
                runnableC91034Zo6.LJLJJI.LIZJ.removeCallbacksAndMessages(null);
                LIZ.LIZ = false;
            }
        }
        BDLocationConfig.setRequestLocation(false);
        Logger.d("ColdBootManager unRegisterLocationServiceObserver");
        if (c91043ZoF3.LIZJ) {
            Context context2 = c91043ZoF3.LIZIZ;
            if (context2 != null && (broadcastReceiver = c91043ZoF3.LJI) != null) {
                try {
                    C16880lQ.LJJLIIIJL(context2, broadcastReceiver);
                } catch (Exception unused) {
                }
            }
            c91043ZoF3.LIZJ = false;
        }
        NetworkManager.getInstance().unRegisterObserver(c91043ZoF3.LIZIZ);
        ILocate iLocate = C91041ZoD.LJFF().LJFF;
        if (iLocate != null) {
            iLocate.stopLocation();
        }
        C91048ZoK.LIZIZ().LJ();
    }
}
