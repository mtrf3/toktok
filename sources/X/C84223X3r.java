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
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.X3r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84223X3r implements InterfaceC84211X3f {
    public final java.util.Map<Integer, DownloadInfo> LJLIL = new ConcurrentHashMap();
    public final java.util.Map<Integer, java.util.Map<Long, C84234X4c>> LJLILLLLZI = new ConcurrentHashMap();
    public final boolean LJLJI;

    public List<DownloadInfo> LIZIZ() {
        DownloadInfo downloadInfo;
        synchronized (C84212X3g.class) {
        }
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLIL).entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 0 && entry.getValue() != null) {
                sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
            }
        }
        if (sparseArray.size() == 0) {
            return null;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (keyAt != 0 && (downloadInfo = (DownloadInfo) sparseArray.get(keyAt)) != null) {
                downloadInfo.getRealStatus();
                int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                if (statusAtDbInit >= 1 && statusAtDbInit <= 11) {
                    X4R.LJII(C84212X3g.LJJ, downloadInfo, null, -5);
                }
            }
        }
        return null;
    }

    public List<String> LIZJ() {
        return null;
    }

    public HashMap<Integer, Integer> LIZLLL() {
        return null;
    }

    public final void LJ() {
        if (this.LJLJI && !X4Q.LJIJJLI()) {
            C84212X3g.LJIIJ().LJJLIIIIJ();
        }
    }

    @Override // X.InterfaceC84211X3f
    public final void LJIILIIL(int i) {
    }

    @Override // X.InterfaceC84211X3f
    public boolean LJJLIIIIJ() {
        return false;
    }

    @Override // X.InterfaceC84211X3f
    public final void LLZZJLIL() {
    }

    @Override // X.InterfaceC84211X3f
    public boolean isDownloadCacheSyncSuccess() {
        return false;
    }

    public C84223X3r() {
        this.LJLJI = false;
        this.LJLJI = X4H.LIZIZ().optInt("active_load_download_cache") > 0;
    }

    @Override // X.InterfaceC84211X3f
    public void clearData() {
        LJ();
        ((ConcurrentHashMap) this.LJLIL).clear();
    }

    @Override // X.InterfaceC84211X3f
    public List<DownloadInfo> getAllDownloadInfo() {
        LJ();
        if (((ConcurrentHashMap) this.LJLIL).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ConcurrentHashMap) this.LJLIL).values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public void LIZ(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJLIL).put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
    }

    @Override // X.InterfaceC84211X3f
    public boolean LJIIL(int i) {
        LJIILJJIL(i);
        LJLJI(i);
        return true;
    }

    @Override // X.InterfaceC84211X3f
    public boolean LJIILJJIL(int i) {
        LJ();
        ((ConcurrentHashMap) this.LJLIL).remove(Integer.valueOf(i));
        return true;
    }

    @Override // X.InterfaceC84211X3f
    public void LJIJ(DownloadInfo downloadInfo) {
        updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJI(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(-7);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJIJIIJI(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(1);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJIL(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(2);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJLIIIJJIZ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(5);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public void LJLJI(int i) {
        ((ConcurrentHashMap) this.LJLILLLLZI).remove(Integer.valueOf(i));
    }

    @Override // X.InterfaceC84211X3f
    public java.util.Map<Long, C84234X4c> LLJI(int i) {
        return (java.util.Map) ((ConcurrentHashMap) this.LJLILLLLZI).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC84211X3f
    public List<C84234X4c> LLJJIII(int i) {
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LJLILLLLZI).get(Integer.valueOf(i));
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new ArrayList(map.values());
    }

    @Override // X.InterfaceC84211X3f
    public void clearMemoryCacheData(double d) {
        LJ();
        if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d > 1.0d) {
            return;
        }
        int size = (int) (((ConcurrentHashMap) this.LJLIL).size() * d);
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Before DownloadInfoMap Size:");
            LIZ.append(((ConcurrentHashMap) this.LJLIL).size());
            LIZ.append(" ClearSize:");
            LIZ.append(size);
            C65210PiY.LIZIZ("DownloadCache", "clearMemoryCacheData", X1D.LIZIZ(LIZ));
        }
        Iterator it = ((ConcurrentHashMap) this.LJLIL).entrySet().iterator();
        int i = 0;
        while (it.hasNext() && i < size) {
            if (!C84212X3g.LJIIL().LJIILJJIL(((Integer) ((Map.Entry) it.next()).getKey()).intValue())) {
                it.remove();
                i++;
            }
        }
        if (!C65210PiY.LIZ()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("End DownloadInfoMap Size:");
        LIZ2.append(((ConcurrentHashMap) this.LJLIL).size());
        C65210PiY.LIZIZ("DownloadCache", "clearMemoryCacheData", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo getDownloadInfo(int i) {
        LJ();
        return (DownloadInfo) ((ConcurrentHashMap) this.LJLIL).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC84211X3f
    public List<DownloadInfo> getDownloadInfoList(String str) {
        LJ();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LJLIL).values()) {
            if (str.equals(downloadInfo.getUrl())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC84211X3f
    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        LJ();
        if (TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LJLIL).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LJLIL).values()) {
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getName()) && downloadInfo.getName().endsWith(str)) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC84211X3f
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        LJ();
        if (TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LJLIL).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LJLIL).values()) {
            if (!TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC84211X3f
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        int status;
        LJ();
        if (TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LJLIL).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LJLIL).values()) {
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && ((status = downloadInfo.getStatus()) == -1 || status == -2 || status == -7 || status == -4 || status == -5)) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC84211X3f
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        LJ();
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        if (((ConcurrentHashMap) this.LJLIL).get(Integer.valueOf(downloadInfo.getId())) == null) {
            z = false;
        }
        ((ConcurrentHashMap) this.LJLIL).put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        return z;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJIJIL(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-2);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJJJLI(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-3);
            downloadInfo.setFirstDownload(false);
            downloadInfo.setFirstSuccess(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJJLZIJ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-1);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJJLI(int i, long j) {
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

    @Override // X.InterfaceC84211X3f
    public boolean t(int i, java.util.Map<Long, C84234X4c> map) {
        if (map != null) {
            ((ConcurrentHashMap) this.LJLILLLLZI).put(Integer.valueOf(i), map);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC84211X3f
    public DownloadInfo LJIL(int i, String str, String str2, long j) {
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
