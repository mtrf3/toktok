package com.bytedance.effectcreatormobile.draft;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C36980EfI;
import X.C780334l;
import X.C78613UtF;
import X.C93495aRn;
import X.C93731aVb;
import X.C93732aVc;
import X.C93733aVd;
import X.C93797aWf;
import X.C93825aX7;
import X.C93829aXB;
import X.C93900aYK;
import X.C93901aYL;
import X.C93907aYR;
import X.C93908aYS;
import X.C93965aZN;
import X.C93970aZS;
import X.C93971aZT;
import X.C94034aaU;
import X.C94082abG;
import X.C94083abH;
import X.C94084abI;
import X.C94085abJ;
import X.C94756am8;
import X.EnumC93808aWq;
import X.EnumC93823aX5;
import X.OR7;
import X.X1D;
import X.XKX;
import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes34.dex */
public final class DraftImpl implements ICKDraftManager {
    public static final C93495aRn Companion = new C93495aRn();
    public Context context;
    public final IStore kvStore;
    public final Map<String, CKEDraftInfo> draftCahe = new LinkedHashMap();
    public String currentAuthorId = "";

    private final void cleanCache() {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C94756am8(null), 2);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public int deleteAllDreft() {
        Set<Map.Entry<String, CKEDraftInfo>> entrySet;
        Map<String, CKEDraftInfo> map = this.draftCahe;
        if (map != null && (entrySet = map.entrySet()) != null) {
            Iterator<Map.Entry<String, CKEDraftInfo>> it = entrySet.iterator();
            while (it.hasNext()) {
                deleteDraft(it.next().getKey());
            }
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public List<CKEDraftInfo> getDraftList() {
        Map<String, CKEDraftInfo> map = this.draftCahe;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, CKEDraftInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public DraftImpl() {
        IService iService;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(IStore.class);
        } else {
            iService = null;
        }
        this.kvStore = (IStore) iService;
    }

    private final void saveCacheJson() {
        List<CKEDraftInfo> draftList = getDraftList();
        if (draftList != null) {
            C93907aYR.LIZ();
            String LIZIZ = C93908aYS.LIZIZ(draftList);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initPath saveCacheJson ");
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            C94034aaU.LIZ("DraftImpl", X1D.LIZIZ(LIZ));
            String draftListCacheName = getDraftListCacheName(this.currentAuthorId);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("saveCacheJson save ");
            LIZ2.append(LIZIZ);
            LIZ2.append(' ');
            C94034aaU.LIZ("DraftImpl", X1D.LIZIZ(LIZ2));
            IStore iStore = this.kvStore;
            if (iStore != null) {
                iStore.saveDraftCache(draftListCacheName, LIZIZ);
            }
        }
    }

    public final IStore getKvStore() {
        return this.kvStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r6 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void autoGeneNameAndIcon(com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r11) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.draft.DraftImpl.autoGeneNameAndIcon(com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo):void");
    }

    private final void checkFileFolder(CKEDraftInfo cKEDraftInfo) {
        boolean z;
        String str = cKEDraftInfo.defaultIconPath;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            File file = new File(cKEDraftInfo.defaultIconPath);
            if (file.exists()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("customAssets");
                String str2 = File.separator;
                LIZ.append(str2);
                LIZ.append(file.getName());
                String LIZIZ = X1D.LIZIZ(LIZ);
                String absolutePath = file.getAbsolutePath();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(cKEDraftInfo.draftPath);
                LIZ2.append(str2);
                LIZ2.append("customAssets");
                if (C36980EfI.LIZIZ(absolutePath, X1D.LIZIZ(LIZ2), file.getName())) {
                    o.LJIIIZ(LIZIZ, "<set-?>");
                    cKEDraftInfo.defaultIconPath = LIZIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("draftInfo.defaultIconPath ");
                    LIZ3.append(cKEDraftInfo.defaultIconPath);
                    C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ3));
                }
            }
        }
        String str3 = cKEDraftInfo.iconPath;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        File file2 = new File(cKEDraftInfo.iconPath);
        if (!file2.exists()) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("customAssets");
        String str4 = File.separator;
        LIZ4.append(str4);
        LIZ4.append(file2.getName());
        String LIZIZ2 = X1D.LIZIZ(LIZ4);
        String absolutePath2 = file2.getAbsolutePath();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(cKEDraftInfo.draftPath);
        LIZ5.append(str4);
        LIZ5.append("customAssets");
        if (!C36980EfI.LIZIZ(absolutePath2, X1D.LIZIZ(LIZ5), file2.getName())) {
            return;
        }
        o.LJIIIZ(LIZIZ2, "<set-?>");
        cKEDraftInfo.iconPath = LIZIZ2;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("draftInfo.iconPath ");
        LIZ6.append(cKEDraftInfo.iconPath);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ6));
    }

    private final void copyRealDraft(CKEDraftInfo cKEDraftInfo) {
        CKEDraftInfo L = CKEDraftInfo.L(cKEDraftInfo, null, 65535);
        String str = L.draftPath;
        String str2 = C93965aZN.LIZIZ;
        if (str2 != null) {
            String LIZIZ = C93965aZN.LIZIZ(str2, L.draftID);
            File file = new File(LIZIZ);
            if (file.exists()) {
                OR7.LLLIIL(file);
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            o.LJIIIZ(LIZIZ, "<set-?>");
            cKEDraftInfo.draftPath = LIZIZ;
            C93732aVc.LIZ(str, LIZIZ);
            return;
        }
        o.LJIJI("DRAFT_EXPORT_PATH");
        throw null;
    }

    private final void copyTempDraft(CKEDraftInfo cKEDraftInfo) {
        CKEDraftInfo L = CKEDraftInfo.L(cKEDraftInfo, null, 65535);
        String str = L.draftPath;
        String LIZIZ = C93965aZN.LIZIZ(C93965aZN.LIZ(), L.draftID);
        File file = new File(LIZIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        o.LJIIIZ(LIZIZ, "<set-?>");
        cKEDraftInfo.draftPath = LIZIZ;
        C93732aVc.LIZ(str, LIZIZ);
        File file2 = new File(LIZIZ, "assets");
        if (file2.exists()) {
            OR7.LLLIIL(file2);
        }
        File file3 = new File(LIZIZ, "effect");
        if (file3.exists()) {
            OR7.LLLIIL(file3);
        }
    }

    private final void copyTempDraftInfoToDraft(CKEDraftInfo cKEDraftInfo) {
        CKEDraftInfo draftInfoByPath;
        String str;
        String LIZIZ = C93965aZN.LIZIZ(C93965aZN.LIZ(), cKEDraftInfo.draftID);
        if (LIZIZ == null || LIZIZ.length() == 0 || !C93733aVd.LIZIZ(LIZIZ) || (draftInfoByPath = getDraftInfoByPath(LIZIZ)) == null) {
            return;
        }
        String str2 = draftInfoByPath.name;
        if (str2 != null && str2.length() != 0 && (!o.LJ(draftInfoByPath.name, cKEDraftInfo.name))) {
            String str3 = draftInfoByPath.name;
            o.LJIIIZ(str3, "<set-?>");
            cKEDraftInfo.name = str3;
        }
        if (ujb.o.LJJJLIIL(draftInfoByPath.iconPath, "customAssets", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(draftInfoByPath.draftPath);
            LIZ.append(File.separator);
            LIZ.append(draftInfoByPath.iconPath);
            str = X1D.LIZIZ(LIZ);
        } else {
            str = draftInfoByPath.iconPath;
        }
        if (str == null || str.length() == 0 || !C93733aVd.LIZIZ(str) || !(!o.LJ(cKEDraftInfo.iconPath, str))) {
            return;
        }
        cKEDraftInfo.iconPath = str;
    }

    private final void deleteDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            OR7.LLLIIL(file);
        }
    }

    private final String getDraftListCacheName(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_cke_draft_cache_.json");
        return X1D.LIZIZ(LIZ);
    }

    private final EnumC93808aWq getIconProcessorStrategy(Feature feature) {
        UIAnnotationAssetTexture LIZLLL;
        AssetImageTexture assetTexture;
        EnumC93823aX5 LIZLLL2;
        if (feature != null && CKEffectEditorContext.LJI() != null && (LIZLLL = C93829aXB.LIZLLL(feature)) != null && (assetTexture = LIZLLL.getAssetTexture()) != null && (LIZLLL2 = C93825aX7.LIZLLL(assetTexture)) != null) {
            int i = C93900aYK.LIZ[LIZLLL2.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    return EnumC93808aWq.RandomColorBG;
                }
            } else {
                return EnumC93808aWq.BySampleAlpha;
            }
        }
        return EnumC93808aWq.CenterCrop;
    }

    private final void innerUpdataDraft(CKEDraftInfo cKEDraftInfo) {
        cKEDraftInfo.getClass();
        cKEDraftInfo.effectPath = "effect";
        String str = cKEDraftInfo.createTime;
        if (str == null || str.length() == 0) {
            cKEDraftInfo.createTime = C93731aVb.LIZ();
            cKEDraftInfo.updateTime = C93731aVb.LIZ();
        } else {
            cKEDraftInfo.updateTime = C93731aVb.LIZ();
        }
    }

    private final boolean isTemDraft(CKEDraftInfo cKEDraftInfo) {
        String str = cKEDraftInfo.draftPath;
        if (str == null || str.length() == 0) {
            return false;
        }
        return s.LJJJLZIJ(cKEDraftInfo.draftPath, C93965aZN.LIZ(), false);
    }

    private final void readDraftsByCache(String str) {
        if (str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        Type type = new C94085abJ().getType();
        C93907aYR.LIZ();
        o.LJIIIIZZ(type, "type");
        List<CKEDraftInfo> list = (List) C93908aYS.LIZ(str, type);
        if (list != null) {
            for (CKEDraftInfo cKEDraftInfo : list) {
                if (C93733aVd.LIZIZ(cKEDraftInfo.draftPath)) {
                    this.draftCahe.put(cKEDraftInfo.draftID, cKEDraftInfo);
                }
            }
        }
    }

    private final void saveDraftInfo(CKEDraftInfo cKEDraftInfo) {
        Map<String, CKEDraftInfo> map;
        innerUpdataDraft(cKEDraftInfo);
        checkFileFolder(cKEDraftInfo);
        if (!isTemDraft(cKEDraftInfo) && (map = this.draftCahe) != null) {
            map.put(cKEDraftInfo.draftID, CKEDraftInfo.L(cKEDraftInfo, null, 65535));
        }
        C93907aYR.LIZ();
        String LIZIZ = C93908aYS.LIZIZ(cKEDraftInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cKEDraftInfo.draftPath);
        LIZ.append(File.separator);
        LIZ.append("customInfo.json");
        String path = X1D.LIZIZ(LIZ);
        o.LJIIIZ(path, "path");
        try {
            File absoluteFile = new File(path).getAbsoluteFile();
            if (!absoluteFile.exists()) {
                absoluteFile.createNewFile();
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(absoluteFile, false));
                try {
                    outputStreamWriter.write(LIZIZ);
                    outputStreamWriter.flush();
                    AnonymousClass636.LJFF(outputStreamWriter, null);
                } finally {
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } catch (Exception unused) {
        }
        saveCacheJson();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public int deleteDraft(String draftID) {
        CKEDraftInfo cKEDraftInfo;
        o.LJIIIZ(draftID, "draftID");
        Map<String, CKEDraftInfo> map = this.draftCahe;
        if (map != null && (cKEDraftInfo = map.get(draftID)) != null) {
            Map<String, CKEDraftInfo> map2 = this.draftCahe;
            if (map2 != null) {
                map2.remove(draftID);
            }
            File file = new File(cKEDraftInfo.draftPath);
            if (file.exists()) {
                OR7.LLLIIL(file);
            }
            saveCacheJson();
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public CKEDraftInfo getDraftByDraftId(String draftID) {
        o.LJIIIZ(draftID, "draftID");
        List<CKEDraftInfo> draftList = getDraftList();
        if (draftList != null) {
            for (CKEDraftInfo cKEDraftInfo : draftList) {
                if (o.LJ(cKEDraftInfo.draftID, draftID)) {
                    return cKEDraftInfo;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public CKEDraftInfo getDraftInfoByPath(String draftPath) {
        o.LJIIIZ(draftPath, "draftPath");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(draftPath);
            LIZ.append(File.separator);
            LIZ.append("customInfo.json");
            String LIZLLL = C93733aVd.LIZLLL(X1D.LIZIZ(LIZ));
            if (LIZLLL != null && LIZLLL.length() != 0) {
                Type type = new C94082abG().getType();
                C93907aYR.LIZ();
                o.LJIIIIZZ(type, "type");
                return (CKEDraftInfo) C93908aYS.LIZ(LIZLLL, type);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public String[] getDraftRequiredModelNames(String draftPath) {
        DraftConfigEffect draftConfigEffect;
        DraftConfigModels draftConfigModels;
        List<String> list;
        o.LJIIIZ(draftPath, "draftPath");
        String LIZLLL = C93733aVd.LIZLLL(C93965aZN.LIZIZ(draftPath, "config.json"));
        if (LIZLLL != null) {
            try {
                C93907aYR.LIZ();
                Type type = new C94083abH().getType();
                o.LJIIIIZZ(type, "genericType<DraftConfig>()");
                DraftConfig draftConfig = (DraftConfig) C93908aYS.LIZ(LIZLLL, type);
                if (draftConfig != null && (draftConfigEffect = draftConfig.effect) != null && (draftConfigModels = draftConfigEffect.modelNames) != null && (list = draftConfigModels.models) != null) {
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        return (String[]) array;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return new String[0];
            } catch (Exception unused) {
                return new String[0];
            }
        }
        return new String[0];
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public CKEDraftInfo initOneDraftWithPath(String draftDir) {
        o.LJIIIZ(draftDir, "draftDir");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(draftDir);
        LIZ.append(File.separator);
        LIZ.append("customInfo.json");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C93733aVd.LIZIZ(LIZIZ)) {
            Type type = new C94084abI().getType();
            String LIZLLL = C93733aVd.LIZLLL(LIZIZ);
            if (LIZLLL != null && (!ujb.o.LJJJJJL(LIZLLL))) {
                C93907aYR.LIZ();
                o.LJIIIIZZ(type, "type");
                return (CKEDraftInfo) C93908aYS.LIZ(LIZLLL, type);
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public void updateDraftInfo(CKEDraftInfo draftInfo) {
        o.LJIIIZ(draftInfo, "draftInfo");
        try {
            boolean isTemDraft = isTemDraft(draftInfo);
            CKEDraftInfo draftByDraftId = getDraftByDraftId(draftInfo.draftID);
            CKEDraftInfo cKEDraftInfo = null;
            if (draftByDraftId != null) {
                cKEDraftInfo = CKEDraftInfo.L(draftByDraftId, null, 65535);
            }
            File preHandleDraft = preHandleDraft(draftInfo, false, false);
            if (isTemDraft && cKEDraftInfo != null) {
                copyCustomInfo(cKEDraftInfo, draftInfo);
                String str = cKEDraftInfo.draftPath;
                if (str != null && str.length() != 0 && C93733aVd.LIZIZ(cKEDraftInfo.draftPath)) {
                    saveDraftInfo(cKEDraftInfo);
                }
            }
            saveDraftInfo(draftInfo);
            if (preHandleDraft != null) {
                OR7.LLLIIL(preHandleDraft);
            }
        } catch (Exception e) {
            C94034aaU.LIZ("CKE-editor", String.valueOf(e.getMessage()));
        }
    }

    private final File copyCustomIcon(CKEDraftInfo cKEDraftInfo, String str) {
        File file = new File(cKEDraftInfo.draftPath);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" saveDraft draftInfo.defaultName ");
        LIZ.append(cKEDraftInfo.defaultName);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getParent());
        LIZ2.append(File.separator);
        LIZ2.append("temp_");
        LIZ2.append(cKEDraftInfo.draftID);
        File file2 = new File(X1D.LIZIZ(LIZ2));
        file2.mkdirs();
        String backupDraft = backupDraft(str, file2);
        if (C93733aVd.LIZIZ(backupDraft)) {
            cKEDraftInfo.iconPath = backupDraft;
        }
        return file2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r6 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void copyCustomInfo(com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r6, com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r7) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L6f
            java.lang.String r1 = r6.name
        L5:
            java.lang.String r0 = r7.name
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            java.lang.String r1 = "<set-?>"
            if (r0 == 0) goto L6c
            if (r6 == 0) goto L1c
            java.lang.String r0 = r7.name
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r6.name = r0
        L1a:
            java.lang.String r2 = r6.iconPath
        L1c:
            java.lang.String r0 = r7.iconPath
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L69
            if (r6 == 0) goto L68
            java.lang.String r0 = r7.iconPath
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r6.iconPath = r0
        L2f:
            java.lang.String r1 = r6.draftPath
            java.lang.String r0 = r7.draftPath
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r6.draftPath
            r1.append(r0)
            java.lang.String r4 = java.io.File.separator
            r1.append(r4)
            java.lang.String r3 = "customAssets"
            r1.append(r3)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.draftPath
            r1.append(r0)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C93732aVc.LIZ(r0, r2)
        L68:
            return
        L69:
            if (r6 == 0) goto L68
            goto L2f
        L6c:
            if (r6 == 0) goto L1c
            goto L1a
        L6f:
            r1 = r2
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.draft.DraftImpl.copyCustomInfo(com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo, com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo):void");
    }

    public final String backupDraft(String sourceIconPath, File file) {
        String str;
        o.LJIIIZ(sourceIconPath, "sourceIconPath");
        if (C93733aVd.LIZIZ(sourceIconPath)) {
            String name = new File(sourceIconPath).getName();
            String str2 = null;
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            C36980EfI.LIZIZ(sourceIconPath, str, name);
            StringBuilder LIZ = X1D.LIZ();
            if (file != null) {
                str2 = file.getAbsolutePath();
            }
            LIZ.append(str2);
            LIZ.append(File.separator);
            LIZ.append(name);
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public void initDraft(Context ctx, String authorId) {
        String str;
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(authorId, "authorId");
        Context LLLLL = C16880lQ.LLLLL(ctx);
        this.context = LLLLL;
        if (LLLLL != null) {
            C93901aYL.LIZ(LLLLL);
        }
        if (!o.LJ(authorId, this.currentAuthorId)) {
            this.draftCahe.clear();
            String draftListCacheName = getDraftListCacheName(authorId);
            IStore iStore = this.kvStore;
            if (iStore != null) {
                str = iStore.getDraftCache(draftListCacheName);
            } else {
                str = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init draftCache ");
            LIZ.append(str);
            LIZ.append(' ');
            C94034aaU.LIZ("DraftImpl", X1D.LIZIZ(LIZ));
            readDraftsByCache(str);
        }
        this.currentAuthorId = authorId;
        cleanCache();
    }

    private final File preHandleDraft(CKEDraftInfo cKEDraftInfo, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        CKEDraftInfo draftByDraftId;
        CKEDraftInfo L;
        File file = new File(cKEDraftInfo.draftPath);
        boolean isTemDraft = isTemDraft(cKEDraftInfo);
        File file2 = null;
        if (file.exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" saveDraft draftInfo.defaultName ");
            LIZ.append(cKEDraftInfo.defaultName);
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(file.getParent());
            String str4 = File.separator;
            LIZ2.append(str4);
            LIZ2.append("temp_");
            LIZ2.append(cKEDraftInfo.draftID);
            File file3 = new File(X1D.LIZIZ(LIZ2));
            file3.mkdirs();
            if (ujb.o.LJJJLIIL(cKEDraftInfo.iconPath, "customAssets", false)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(cKEDraftInfo.draftPath);
                LIZ3.append(str4);
                LIZ3.append(cKEDraftInfo.iconPath);
                str3 = X1D.LIZIZ(LIZ3);
            } else {
                str3 = cKEDraftInfo.iconPath;
            }
            String backupDraft = backupDraft(str3, file3);
            if (C93733aVd.LIZIZ(backupDraft)) {
                cKEDraftInfo.iconPath = backupDraft;
            }
            if (isTemDraft && (draftByDraftId = getDraftByDraftId(cKEDraftInfo.draftID)) != null && (L = CKEDraftInfo.L(draftByDraftId, null, 65535)) != null && C93733aVd.LIZIZ(L.draftPath)) {
                o.LJIIIZ(backupDraft(str3, new File(L.draftPath, "customAssets")), "<set-?>");
            }
            if (z2) {
                OR7.LLLIIL(file);
            }
            file2 = file3;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        String selectedModel = C93797aWf.LIZ().getSelectedModel();
        if (selectedModel == null) {
            selectedModel = "";
        }
        if (selectedModel.length() != 0) {
            cKEDraftInfo.modelId = selectedModel;
        }
        autoGeneNameAndIcon(cKEDraftInfo);
        if (z) {
            String str5 = cKEDraftInfo.defaultIconPath;
            if (str5 != null && str5.length() != 0 && ((str2 = cKEDraftInfo.iconPath) == null || ujb.o.LJJJJJL(str2))) {
                String str6 = cKEDraftInfo.defaultIconPath;
                o.LJIIIZ(str6, "<set-?>");
                cKEDraftInfo.iconPath = str6;
            }
            String str7 = cKEDraftInfo.defaultName;
            if (str7 != null && str7.length() != 0 && ((str = cKEDraftInfo.name) == null || ujb.o.LJJJJJL(str))) {
                String str8 = cKEDraftInfo.defaultName;
                o.LJIIIZ(str8, "<set-?>");
                cKEDraftInfo.name = str8;
            }
        }
        return file2;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager
    public int saveOneDraft(CKEDraftInfo draftInfo, boolean z, boolean z2) {
        String LIZIZ;
        CKEDraftInfo draftByDraftId;
        CKEDraftInfo L;
        o.LJIIIZ(draftInfo, "draftInfo");
        if (!isTemDraft(draftInfo) && z && C93733aVd.LIZIZ(draftInfo.draftPath)) {
            copyTempDraft(draftInfo);
            C93829aXB c93829aXB = CKEffectEditorContext.LJIILL;
            if (c93829aXB != null) {
                c93829aXB.LJIIJJI(draftInfo.draftPath);
            }
            saveDraftInfo(draftInfo);
            return 0;
        }
        if (isTemDraft(draftInfo) && !z && C93733aVd.LIZIZ(draftInfo.draftPath)) {
            copyRealDraft(draftInfo);
            saveDraftInfo(draftInfo);
            deleteDir(C93965aZN.LIZIZ(C93965aZN.LIZ(), draftInfo.draftID));
            return 0;
        }
        if (z) {
            LIZIZ = C93965aZN.LIZIZ(C93965aZN.LIZ(), draftInfo.draftID);
        } else {
            String str = C93965aZN.LIZIZ;
            if (str != null) {
                LIZIZ = C93965aZN.LIZIZ(str, draftInfo.draftID);
            } else {
                o.LJIJI("DRAFT_EXPORT_PATH");
                throw null;
            }
        }
        File file = new File(LIZIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        o.LJIIIZ(LIZIZ, "<set-?>");
        draftInfo.draftPath = LIZIZ;
        File preHandleDraft$default = preHandleDraft$default(this, draftInfo, z2, false, 4, null);
        if (z && (draftByDraftId = getDraftByDraftId(draftInfo.draftID)) != null && (L = CKEDraftInfo.L(draftByDraftId, null, 65535)) != null) {
            copyCustomInfo(L, draftInfo);
            String str2 = L.draftPath;
            if (str2 != null && str2.length() != 0 && C93733aVd.LIZIZ(L.draftPath)) {
                saveDraftInfo(L);
            }
        }
        C93829aXB c93829aXB2 = CKEffectEditorContext.LJIILL;
        if (c93829aXB2 != null) {
            c93829aXB2.LJIIJJI(draftInfo.draftPath);
        }
        if (!z) {
            saveDraftInfo(draftInfo);
        } else {
            saveDraftInfo(draftInfo);
        }
        if (preHandleDraft$default != null) {
            OR7.LLLIIL(preHandleDraft$default);
        }
        if (!z) {
            deleteDir(C93965aZN.LIZIZ(C93965aZN.LIZ(), draftInfo.draftID));
        }
        return 0;
    }

    public static /* synthetic */ File preHandleDraft$default(DraftImpl draftImpl, CKEDraftInfo cKEDraftInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return draftImpl.preHandleDraft(cKEDraftInfo, z, z2);
    }
}
