package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OCm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61520OCm {
    public final C61276O3c LIZ;
    public final C61466OAk LIZIZ;

    public C61520OCm(C61276O3c c61276O3c) {
        this.LIZ = c61276O3c;
        C61466OAk c61466OAk = new C61466OAk();
        this.LIZIZ = c61466OAk;
        c61466OAk.LIZ = c61276O3c;
    }

    public static C61520OCm LIZLLL(C61276O3c c61276O3c) {
        List<String> list = c61276O3c.LJ;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = c61276O3c.LJ.iterator();
            while (it.hasNext()) {
                EBC.LIZ.LIZ.add(it.next());
            }
            Context context = c61276O3c.LIZ;
            if (context != null) {
                V3N.LJLIL = context;
            }
            C61520OCm c61520OCm = new C61520OCm(c61276O3c);
            Object accessKey = ListProtector.get(c61276O3c.LJ, 0);
            o.LJIIJ(accessKey, "accessKey");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) O3E.LIZ;
            if (concurrentHashMap.get(accessKey) == null) {
                concurrentHashMap.put(accessKey, c61520OCm);
            }
            C61555ODv c61555ODv = C61573OEn.LIZ;
            if (c61555ODv.LIZJ.compareAndSet(false, true)) {
                c61555ODv.LIZ = c61276O3c;
                c61555ODv.LIZIZ = System.currentTimeMillis();
            }
            C61525OCr c61525OCr = C61529OCv.LIZ;
            if (c61525OCr.LIZ == null) {
                c61525OCr.LIZ = c61276O3c;
            }
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            if (geckoGlobalConfig != null) {
                c61525OCr.LIZ.LJII = Long.valueOf(geckoGlobalConfig.getAppId());
                c61525OCr.LIZ.LIZLLL = geckoGlobalConfig.getNetWork();
            }
            Context context2 = c61276O3c.LIZ;
            o.LJIIJ(context2, "context");
            if (C61510OCc.LIZ == null) {
                C61510OCc.LIZ = context2;
            }
            ODP.LIZ();
            return c61520OCm;
        }
        throw new IllegalArgumentException("access key empty");
    }

    public final void LJFF(String str) {
        if (this.LIZ == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.LIZ.LJIIIZ = str;
        C61532OCy c61532OCy = EBC.LIZ;
        if (c61532OCy.LIZLLL() != null) {
            c61532OCy.LIZLLL().deviceId = str;
        }
    }

    public final void LIZJ(java.util.Map<String, List<CheckRequestBodyModel.TargetChannel>> map, AbstractC61537ODd abstractC61537ODd) {
        LIZIZ("default", null, map, abstractC61537ODd);
    }

    public final void LJ(OptionCheckUpdateParams optionCheckUpdateParams, java.util.Map map) {
        if (optionCheckUpdateParams.getListener() != null) {
            optionCheckUpdateParams.getListener().LJIIL();
        }
        C59125NIj c59125NIj = this.LIZ.LJI;
        if (optionCheckUpdateParams.getCacheConfig() != null) {
            c59125NIj = optionCheckUpdateParams.getCacheConfig();
        }
        if (c59125NIj != null) {
            EnumC59152NJk enumC59152NJk = c59125NIj.LIZIZ;
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            enumC59152NJk.postUpdate(map, null, c59125NIj, c61532OCy.LJ.getRootDirectory());
        }
        OC6.LIZ("gecko-debug-tag", "all channel update finished");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
    
        if (r8 != null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r21, java.util.Map<java.lang.String, java.util.List<com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel>> r22, com.bytedance.geckox.OptionCheckUpdateParams r23) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61520OCm.LIZ(java.lang.String, java.util.Map, com.bytedance.geckox.OptionCheckUpdateParams):void");
    }

    public final void LIZIZ(String str, java.util.Map<String, java.util.Map<String, Object>> map, java.util.Map<String, List<CheckRequestBodyModel.TargetChannel>> map2, AbstractC61537ODd abstractC61537ODd) {
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setListener(abstractC61537ODd);
        if (map != null) {
            optionCheckUpdateParams.setCustomParam(map);
        }
        LIZ(str, map2, optionCheckUpdateParams);
    }
}
