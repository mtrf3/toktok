package X;

import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OCj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61517OCj extends VJO {
    public final /* synthetic */ OptionCheckUpdateParams LJLJL;
    public final /* synthetic */ java.util.Map LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ C61466OAk LJLL;

    public final void LIZ() {
        String str;
        java.util.Set<String> keySet;
        long j;
        MetaDataItemNew metaDataItemNew;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractC61537ODd listener = this.LJLJL.getListener();
        java.util.Map map = this.LJLJLJ;
        if (map != null) {
            str = null;
            for (Map.Entry entry : map.entrySet()) {
                str = (String) entry.getKey();
                for (CheckRequestBodyModel.TargetChannel targetChannel : (List) entry.getValue()) {
                    StringBuilder LIZJ = b1.LIZJ(str, "-");
                    LIZJ.append(targetChannel.channelName);
                    String LIZIZ = X1D.LIZIZ(LIZJ);
                    java.util.Map<String, UpdatePackage> map2 = C61466OAk.LIZIZ;
                    long j2 = 0;
                    if (map2 != null && ((ConcurrentHashMap) map2).containsKey(LIZIZ)) {
                        Long LJIILLIIL = C70657RoD.LJIILLIIL(str, targetChannel.channelName);
                        if (LJIILLIIL != null) {
                            j2 = LJIILLIIL.longValue();
                        }
                        UpdatePackage updatePackage = (UpdatePackage) ((ConcurrentHashMap) C61466OAk.LIZIZ).get(LIZIZ);
                        if (updatePackage != null && j2 == updatePackage.getVersion()) {
                            arrayList2.add(updatePackage);
                        } else {
                            arrayList.add(((ConcurrentHashMap) C61466OAk.LIZIZ).get(LIZIZ));
                        }
                    } else {
                        Long LJIILLIIL2 = C70657RoD.LJIILLIIL(str, targetChannel.channelName);
                        if (LJIILLIIL2 != null) {
                            j2 = LJIILLIIL2.longValue();
                        }
                        UpdatePackage updatePackage2 = new UpdatePackage();
                        updatePackage2.setAccessKey(str);
                        updatePackage2.setChannel(targetChannel.channelName);
                        updatePackage2.setLocalVersion(j2);
                        updatePackage2.setVersion(j2);
                        if (LJIILLIIL2 == null) {
                            arrayList3.add(updatePackage2.getChannel());
                        } else {
                            arrayList2.add(updatePackage2);
                        }
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.LJLJLLL)) {
            java.util.Map<String, UpdatePackage> map3 = C61466OAk.LIZJ;
            if (map3 == null) {
                return;
            }
            str = null;
            for (Map.Entry entry2 : ((ConcurrentHashMap) map3).entrySet()) {
                Object key = entry2.getKey();
                str = (String) ListProtector.get(this.LJLL.LIZ.LJ, 0);
                StringBuilder LIZJ2 = b1.LIZJ(str, "-");
                LIZJ2.append(this.LJLJLLL);
                if (X1D.LIZIZ(LIZJ2).equals(key)) {
                    arrayList.add(entry2.getValue());
                }
            }
        } else {
            str = null;
        }
        if (listener != null) {
            if (!arrayList.isEmpty()) {
                listener.LJFF(null, new C61518OCk(str, arrayList));
            } else if (!arrayList2.isEmpty()) {
                listener.LJFF(null, null);
            }
        }
        if (!arrayList3.isEmpty() && listener != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request channels");
            LIZ.append(GsonProtectorUtils.toJson(OXZ.LIZIZ.LIZ, arrayList3, new C61519OCl().getType()));
            LIZ.append("is not lazy update");
            listener.LIZLLL(new Exception(X1D.LIZIZ(LIZ)), null);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UpdatePackage updatePackage3 = (UpdatePackage) it.next();
            String accessKey = updatePackage3.getAccessKey();
            java.util.Map<String, List<String>> map4 = C61571OEl.LIZ.LJ;
            if (map4 != null && (keySet = map4.keySet()) != null && keySet.contains(accessKey)) {
                o.LJFF(accessKey, "accessKey");
                ConcurrentHashMap LJI = C61511OCd.LJI(accessKey);
                if (LJI != null) {
                    String channel = updatePackage3.getChannel();
                    if (LJI.get(channel) == null) {
                        j = currentTimeMillis;
                        MetaDataItemNew metaDataItemNew2 = new MetaDataItemNew(currentTimeMillis, false, 2, null);
                        o.LJFF(channel, "channel");
                        LJI.put(channel, metaDataItemNew2);
                        ((ConcurrentHashMap) C61511OCd.LIZJ).put(accessKey, Boolean.TRUE);
                    } else {
                        j = currentTimeMillis;
                        MetaDataItemNew metaDataItemNew3 = (MetaDataItemNew) LJI.get(channel);
                        if (metaDataItemNew3 != null && !metaDataItemNew3.getAllowUpdate() && (metaDataItemNew = (MetaDataItemNew) LJI.get(channel)) != null) {
                            metaDataItemNew.getAllowUpdate();
                        }
                    }
                    currentTimeMillis = j;
                }
            }
        }
        OC6.LIZ("gecko-debug-tag", "lazy update start...");
        try {
            try {
                C61548ODo LJIIIIZZ = ODN.LJIIIIZZ(this.LJLL.LIZ, this.LJLJL);
                LJIIIIZZ.LIZLLL(5, "req_type");
                LJIIIIZZ.LJ(arrayList);
                if (listener != null) {
                    listener.LJIIL();
                }
                OC6.LIZ("gecko-debug-tag", "lazy update finished");
            } catch (Exception e) {
                OC6.LJ("gecko-debug-tag", "lazy update failed:", e);
                if (listener != null) {
                    listener.LJIIL();
                }
                OC6.LIZ("gecko-debug-tag", "lazy update finished");
            }
        } catch (Throwable th) {
            if (listener != null) {
                listener.LJIIL();
            }
            OC6.LIZ("gecko-debug-tag", "lazy update finished");
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61517OCj(C61466OAk c61466OAk, int i, OptionCheckUpdateParams optionCheckUpdateParams, java.util.Map map, String str) {
        super(i);
        this.LJLL = c61466OAk;
        this.LJLJL = optionCheckUpdateParams;
        this.LJLJLJ = map;
        this.LJLJLLL = str;
    }
}
