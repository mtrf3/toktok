package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ijk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47448Ijk implements InterfaceC47447Ijj {
    public final /* synthetic */ VideoCachePreloader LIZ;

    public C47448Ijk(VideoCachePreloader videoCachePreloader) {
        this.LIZ = videoCachePreloader;
    }

    public final void LIZLLL(C47450Ijm c47450Ijm) {
        int i;
        String str = c47450Ijm.LIZ;
        if (str == null || c47450Ijm.LIZJ < 0 || (i = c47450Ijm.LIZIZ) <= 0) {
            return;
        }
        if (c47450Ijm.LIZLLL == 0) {
            c47450Ijm.LIZLLL = 1L;
        }
        VideoCachePreloader videoCachePreloader = this.LIZ;
        videoCachePreloader.mTotalDownloadBytes += i;
        videoCachePreloader.mRealtimeNetworkSpeedInBps = i / (c47450Ijm.LIZLLL / 1000000.0d);
        C47462Ijy c47462Ijy = videoCachePreloader.mCurrentDownloadInfo;
        if (c47462Ijy == null || !TextUtils.equals(c47462Ijy.LIZ, str)) {
            VideoCachePreloader videoCachePreloader2 = this.LIZ;
            videoCachePreloader2.mCurrentDownloadInfo = videoCachePreloader2.getLastSingleTimeInfo(c47450Ijm.LIZ);
        }
        VideoCachePreloader videoCachePreloader3 = this.LIZ;
        C47462Ijy c47462Ijy2 = videoCachePreloader3.mCurrentDownloadInfo;
        if (c47462Ijy2 == null) {
            return;
        }
        C47472Ik8 info = videoCachePreloader3.convertReadTimeInfo(c47450Ijm);
        o.LJIIIZ(info, "info");
        if (c47462Ijy2.LIZIZ == null) {
            c47462Ijy2.LIZIZ = new ArrayList<>();
        }
        ArrayList<C47472Ik8> arrayList = c47462Ijy2.LIZIZ;
        if (arrayList != null) {
            arrayList.add(info);
        }
        List<C47450Ijm> list = this.LIZ.readTimeInfoMap.get(c47450Ijm.LIZ);
        if (list == null) {
            list = new ArrayList<>();
            this.LIZ.readTimeInfoMap.put(c47450Ijm.LIZ, list);
        }
        list.add(c47450Ijm);
    }

    public final void LIZ(String str, String str2) {
        InterfaceC47452Ijo interfaceC47452Ijo;
        WeakReference<InterfaceC47452Ijo> weakReference = this.LIZ.completeListener;
        if (weakReference != null && (interfaceC47452Ijo = weakReference.get()) != null) {
            interfaceC47452Ijo.onComplete();
        }
    }

    public final void LIZIZ(int i, int i2, String str) {
        C46982IcE.LIZIZ().isDebug();
        Iterator<WeakReference<InterfaceC47101Ie9>> it = this.LIZ.downloadProgressListeners.iterator();
        while (it.hasNext()) {
            InterfaceC47101Ie9 interfaceC47101Ie9 = it.next().get();
            if (interfaceC47101Ie9 != null) {
                interfaceC47101Ie9.p3(i, i2, str);
            }
        }
    }

    public final void LIZJ(int i, long j, long j2) {
        long j3 = j;
        if (i > 0) {
            Object value = IZ8.d0.getValue();
            o.LJIIIIZZ(value, "<get-openInternetSpeedFilterSwitch>(...)");
            if (((Boolean) value).booleanValue()) {
                long j4 = i;
                Object value2 = IZ8.e0.getValue();
                o.LJIIIIZZ(value2, "<get-internetSpeedFilterMinValue>(...)");
                if (j4 < ((Number) value2).longValue() || i > 20971520) {
                    return;
                }
            }
            if (j3 > 0 && this.LIZ.config.getExperiment().VideoNetworkSpeedAlgorithmExperiment() == 2) {
                this.LIZ.config.getSpeedManager().LIZ();
                return;
            }
            if (this.LIZ.config.getExperiment().VideoDownloadSpeedCostTimeExperiment() != 1) {
                j3 = j2;
            }
            if (j3 <= 0) {
                return;
            }
            double d = i;
            this.LIZ.config.getSpeedManager().monitorVideoSpeed((8.0d * d) / (j3 / 1000.0d), d, j3);
            Integer LIZ = this.LIZ.config.getMLServiceSpeedModel().LIZ();
            if (LIZ != null) {
                VideoCachePreloader videoCachePreloader = this.LIZ;
                if (videoCachePreloader.mSpeedHandler == null) {
                    videoCachePreloader.mSpeedHandler = new C47449Ijl(this.LIZ.config.getSpeedManager(), LIZ.intValue());
                }
                this.LIZ.mSpeedHandler.LIZ();
            }
            C46982IcE.LIZIZ().isDebug();
        }
    }
}
