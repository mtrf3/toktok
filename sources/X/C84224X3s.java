package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.X3s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84224X3s extends C84223X3r {
    public final X3Y LJLJL;
    public final SparseArray<java.util.Map<Long, C84234X4c>> LJLJJI = new SparseArray<>();
    public final HashMap<Integer, Integer> LJLJJL = new HashMap<>();
    public final List<DownloadInfo> LJLJJLL = new ArrayList();
    public final C84226X3u LJLJLJ = new C84226X3u(this);

    @Override // X.C84223X3r
    public final List<String> LIZJ() {
        synchronized (C84212X3g.class) {
        }
        return null;
    }

    public final void LJII() {
        synchronized (this.LJLJJI) {
            this.LJLJJI.clear();
        }
    }

    public final void LJIIIIZZ() {
        synchronized (this.LJLJJL) {
            this.LJLJJL.clear();
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final void clearData() {
        LJ();
        synchronized (this.LJLJLJ) {
            this.LJLJLJ.clear();
        }
        LJIIIIZZ();
        LJII();
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<DownloadInfo> getAllDownloadInfo() {
        LJ();
        return this.LJLJL.getAllDownloadInfo();
    }

    @Override // X.C84223X3r
    public final List<DownloadInfo> LIZIZ() {
        return this.LJLJJLL;
    }

    @Override // X.C84223X3r
    public final HashMap<Integer, Integer> LIZLLL() {
        return this.LJLJJL;
    }

    public C84224X3s(X3Y x3y) {
        this.LJLJL = x3y;
    }

    @Override // X.C84223X3r
    public final void LIZ(DownloadInfo downloadInfo) {
        LJFF(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        LJIIJ(Integer.valueOf(downloadInfo.getId()));
    }

    public final boolean LJIIIZ(Integer num) {
        boolean containsKey;
        if (num.intValue() == 0) {
            return false;
        }
        synchronized (this.LJLJJL) {
            containsKey = this.LJLJJL.containsKey(num);
        }
        return containsKey;
    }

    public final void LJIIJ(Integer num) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Key: ");
            LIZ.append(num);
            C65210PiY.LIZIZ("LruDownloadCache", "removeFromUnreadMap", X1D.LIZIZ(LIZ));
        }
        if (num.intValue() == 0) {
            return;
        }
        synchronized (this.LJLJJL) {
            this.LJLJJL.remove(num);
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final boolean LJIIL(int i) {
        LJIILJJIL(i);
        LJLJI(i);
        LJIIJ(Integer.valueOf(i));
        return true;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final boolean LJIILJJIL(int i) {
        LJ();
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.LJLJLJ) {
            this.LJLJLJ.remove(valueOf);
        }
        LJIIJ(Integer.valueOf(i));
        return true;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final void LJIJ(DownloadInfo downloadInfo) {
        updateDownloadInfo(downloadInfo);
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJI(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(-7);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIIJI(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(1);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJIL(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(2);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJLIIIJJIZ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(5);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final void LJLJI(int i) {
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.LJLJJI) {
            this.LJLJJI.remove(valueOf.intValue());
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final java.util.Map<Long, C84234X4c> LLJI(int i) {
        java.util.Map<Long, C84234X4c> map;
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.LJLJJI) {
            map = this.LJLJJI.get(valueOf.intValue());
        }
        if (map == null) {
            map = this.LJLJL.LLJI(i);
            if (map == null) {
                return null;
            }
            LJI(i, map);
        }
        return map;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<C84234X4c> LLJJIII(int i) {
        java.util.Map<Long, C84234X4c> LLJI = LLJI(i);
        if (LLJI == null) {
            return null;
        }
        return new ArrayList(LLJI.values());
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final void clearMemoryCacheData(double d) {
        LJ();
        if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d > 1.0d) {
            return;
        }
        synchronized (this.LJLJLJ) {
            int size = (int) (this.LJLJLJ.size() * d);
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Before LruDownloadInfoMap Size:");
                LIZ.append(this.LJLJLJ.size());
                LIZ.append(" ClearSize:");
                LIZ.append(size);
                C65210PiY.LIZIZ("LruDownloadCache", "clearMemoryCacheData", X1D.LIZIZ(LIZ));
            }
            Iterator<Map.Entry<Integer, DownloadInfo>> it = this.LJLJLJ.entrySet().iterator();
            for (int i = 0; it.hasNext() && i < size; i++) {
                if (!C84212X3g.LJIIL().LJIILJJIL(it.next().getKey().intValue())) {
                    it.remove();
                }
            }
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("End LruDownloadInfoMap Size:");
                LIZ2.append(this.LJLJLJ.size());
                C65210PiY.LIZIZ("LruDownloadCache", "clearMemoryCacheData", X1D.LIZIZ(LIZ2));
            }
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo getDownloadInfo(int i) {
        DownloadInfo downloadInfo;
        LJ();
        try {
            Integer valueOf = Integer.valueOf(i);
            synchronized (this.LJLJLJ) {
                downloadInfo = this.LJLJLJ.get(valueOf);
            }
            if (downloadInfo == null) {
                try {
                    if (LJIIIZ(Integer.valueOf(i))) {
                        DownloadInfo downloadInfo2 = this.LJLJL.getDownloadInfo(i);
                        if (downloadInfo2 != null) {
                            LJFF(Integer.valueOf(i), downloadInfo2);
                        }
                        LJIIJ(Integer.valueOf(i));
                        return downloadInfo2;
                    }
                    return downloadInfo;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    return downloadInfo;
                }
            }
            return downloadInfo;
        } catch (Exception e2) {
            e = e2;
            downloadInfo = null;
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        LJ();
        try {
            return this.LJLJL.getDownloadInfoList(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LJLJL.getDownloadInfosByFileExtension(str);
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LJLJL.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LJLJL.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        LJ();
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        if (getDownloadInfo(downloadInfo.getId()) == null) {
            z = false;
        }
        LJFF(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        LJIIJ(Integer.valueOf(downloadInfo.getId()));
        return z;
    }

    public final void LJFF(Integer num, DownloadInfo downloadInfo) {
        if (num.intValue() == 0) {
            return;
        }
        synchronized (this.LJLJLJ) {
            this.LJLJLJ.put(num, downloadInfo);
        }
    }

    public final void LJI(int i, java.util.Map<Long, C84234X4c> map) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Key: ");
            LIZ.append(i);
            C65210PiY.LIZIZ("LruDownloadCache", "addToLruSegmentListMap", X1D.LIZIZ(LIZ));
        }
        if (i == 0) {
            return;
        }
        synchronized (this.LJLJJI) {
            this.LJLJJI.put(i, map);
        }
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJIJIL(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-2);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJJJLI(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-3);
            downloadInfo.setFirstDownload(false);
            downloadInfo.setFirstSuccess(false);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJJLZIJ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-1);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJJLI(int i, long j) {
        int status;
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            if (downloadInfo.getStatus() != -3 && downloadInfo.getStatus() != -2 && (status = downloadInfo.getStatus()) != -1 && status != -7 && downloadInfo.getStatus() != -4) {
                downloadInfo.setStatus(4);
            }
        }
        return downloadInfo;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final boolean t(int i, java.util.Map<Long, C84234X4c> map) {
        LJI(i, map);
        return true;
    }

    @Override // X.C84223X3r, X.InterfaceC84211X3f
    public final DownloadInfo LJIL(int i, String str, String str2, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setTotalBytes(j);
            downloadInfo.seteTag(str);
            if (TextUtils.isEmpty(downloadInfo.getName()) && !TextUtils.isEmpty(str2)) {
                downloadInfo.setName(str2);
            }
            downloadInfo.setStatus(3);
        }
        return downloadInfo;
    }
}
