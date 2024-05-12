package X;

import android.text.TextUtils;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class OF5 extends AbstractC61537ODd {
    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        String str;
        OF4.LIZIZ = false;
        if (th == null || (str = th.toString()) == null) {
            str = "";
        }
        C0JT.LIZJ(C28787BRn.LIZ("livesdk_gecko_resource_download_failed"), str, "extra_info", 0, "error_code");
    }

    @Override // X.AbstractC61537ODd
    public final void LJ(java.util.Map map, C61550ODq c61550ODq) {
        String str;
        if (((HashMap) map).isEmpty()) {
            List<String> list = OF4.LJ;
            if (list == null || (str = list.toString()) == null) {
                str = "";
            }
            OF4.LIZ(str, "onCheckServerVersionSuccess", true, true);
            OF4.LIZJ = true;
            List<String> list2 = OF4.LJ;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        OF4.LIZLLL = c61550ODq;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        boolean z;
        if (updatePackage != null) {
            if (!TextUtils.isEmpty(updatePackage.getChannel())) {
                List<String> list = OF4.LJ;
                if (list != null) {
                    list.remove(updatePackage.getChannel());
                }
                String channel = updatePackage.getChannel();
                if (channel == null) {
                    channel = "";
                }
                List<String> list2 = OF4.LJ;
                if (list2 == null || list2.size() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                OF4.LIZ(channel, "onUpdateSuccess", false, z);
            }
            List<String> list3 = OF4.LJ;
            if (list3 == null || list3.isEmpty()) {
                OF4.LIZLLL = null;
                OF4.LIZJ = true;
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        if (i == 601) {
            OF4.LIZIZ = false;
        }
        String th2 = th.toString();
        if (th2 == null) {
            th2 = "";
        }
        C0JT.LIZJ(C28787BRn.LIZ("livesdk_gecko_resource_download_failed"), th2, "extra_info", i, "error_code");
    }
}
