package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.news.common.service.manager.IService;
import com.google.gson.Gson;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aUj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93677aUj {
    public static final C93677aUj LJ = new C93677aUj();
    public static final java.util.Map<Integer, C93676aUi> LIZ = new LinkedHashMap();
    public static String LIZIZ = "unkown";
    public static String LIZJ = "unkown";
    public static String LIZLLL = "";

    public static String LIZ(String str) {
        String str2 = C93965aZN.LJFF;
        if (str2 != null) {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            String str3 = C93965aZN.LJFF;
            if (str3 != null) {
                LIZ2.append(str3);
                LIZ2.append(File.separator);
                LIZ2.append(str);
                return X1D.LIZIZ(LIZ2);
            }
            o.LJIJI("DRAFT_FILE_PATH");
            throw null;
        }
        o.LJIJI("DRAFT_FILE_PATH");
        throw null;
    }

    public static Long LIZIZ(int i) {
        C93676aUi c93676aUi = (C93676aUi) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c93676aUi != null) {
            return Long.valueOf(c93676aUi.LIZIZ);
        }
        return null;
    }

    public static Object LIZLLL(String str) {
        try {
            File file = new File(str, "duration_info.json");
            if (file.exists()) {
                EffectPackageData LJFF = LJFF(str);
                C16880lQ.LLLZZIL(file);
                if (LJFF != null) {
                    return LJFF;
                }
            }
            return LJ(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static EffectPackageData LJ(String str) {
        IService iService;
        CKEDraftInfo initOneDraftWithPath;
        String str2;
        String LIZ2;
        C93970aZS LIZ3 = C93971aZT.LIZ();
        if (LIZ3 != null) {
            iService = (IService) LIZ3.LIZ(ICKDraftManager.class);
        } else {
            iService = null;
        }
        ICKDraftManager iCKDraftManager = (ICKDraftManager) iService;
        if (iCKDraftManager != null && (initOneDraftWithPath = iCKDraftManager.initOneDraftWithPath(str)) != null && (str2 = initOneDraftWithPath.draftID) != null && (LIZ2 = LIZ(str2)) != null) {
            try {
                if (LIZ2.length() != 0 && C93733aVd.LIZIZ(str)) {
                    return (EffectPackageData) new Gson().LJI(C38485F8n.LLLFZ(new File(LIZ2)), EffectPackageData.class);
                }
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("readDurationInfo error: ");
                LIZ4.append(e);
                C94034aaU.LIZJ("DurationReporter", X1D.LIZIZ(LIZ4));
            }
        }
        return null;
    }

    public static EffectPackageData LJFF(String str) {
        File file = new File(str, "duration_info.json");
        try {
            if (file.exists() && file.isFile()) {
                return (EffectPackageData) new Gson().LJI(C38485F8n.LLLFZ(file), EffectPackageData.class);
            }
            return null;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("readDurationInfo error: ");
            LIZ2.append(e);
            C94034aaU.LIZJ("DurationReporter", X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static void LJI(int i) {
        java.util.Map<Integer, C93676aUi> map = LIZ;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new C93676aUi();
            linkedHashMap.put(valueOf, obj);
        }
        ((C93676aUi) obj).LIZ = System.currentTimeMillis();
    }

    public static void LJII(int i) {
        C93676aUi c93676aUi = (C93676aUi) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c93676aUi != null && c93676aUi.LIZ > 0) {
            c93676aUi.LIZIZ += System.currentTimeMillis() - c93676aUi.LIZ;
        }
    }

    public static void LJIIIIZZ(String draftId, EffectPackageData durationInfo) {
        o.LJIIIZ(draftId, "draftId");
        o.LJIIIZ(durationInfo, "durationInfo");
        try {
            String str = LIZIZ;
            o.LJIIIZ(str, "<set-?>");
            durationInfo.projectSource = str;
            String durationJson = new Gson().LJIILL(durationInfo);
            File file = new File(LIZ(draftId));
            file.createNewFile();
            o.LJIIIIZZ(durationJson, "durationJson");
            C38485F8n.LLLII(file, durationJson);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("-->");
            LIZ2.append(durationJson);
            C94034aaU.LIZJ("DurationReporter", X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("saveDurationInfo error: ");
            LIZ3.append(e);
            C94034aaU.LIZJ("DurationReporter", X1D.LIZIZ(LIZ3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C94621ajx
            if (r0 == 0) goto Lc1
            r3 = r11
            X.ajx r3 = (X.C94621ajx) r3
            int r2 = r3.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc1
            int r2 = r2 - r1
            r3.LJLILLLLZI = r2
        L12:
            java.lang.Object r6 = r3.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLILLLLZI
            r8 = 1
            if (r0 == 0) goto Lb5
            if (r0 != r8) goto Lc8
            X.C141335gf.LIZJ(r6)
        L20:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r6 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r6
            java.util.Map<java.lang.Integer, X.aUi> r7 = X.C93677aUj.LIZ
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 0
            r1.<init>(r0)
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r3 = r7.get(r1)
            if (r3 != 0) goto L3a
            X.aUi r3 = new X.aUi
            r3.<init>()
            r7.put(r1, r3)
        L3a:
            X.aUi r3 = (X.C93676aUi) r3
            r4 = 0
            if (r6 == 0) goto Lb2
            long r0 = r6.duration
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            long r0 = r2.longValue()
        L4b:
            r3.LIZIZ = r0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            java.lang.Object r3 = r7.get(r0)
            if (r3 != 0) goto L60
            X.aUi r3 = new X.aUi
            r3.<init>()
            r7.put(r0, r3)
        L60:
            X.aUi r3 = (X.C93676aUi) r3
            if (r6 == 0) goto Laf
            long r1 = r6.layerDuration
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            long r0 = r0.longValue()
        L6f:
            r3.LIZIZ = r0
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 2
            r1.<init>(r0)
            java.lang.Object r3 = r7.get(r1)
            if (r3 != 0) goto L85
            X.aUi r3 = new X.aUi
            r3.<init>()
            r7.put(r1, r3)
        L85:
            X.aUi r3 = (X.C93676aUi) r3
            if (r6 == 0) goto L94
            long r1 = r6.interactionDuration
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            long r4 = r0.longValue()
        L94:
            r3.LIZIZ = r4
            if (r6 == 0) goto Lac
            java.lang.String r0 = r6.LJLJJLL
            if (r0 == 0) goto Lac
        L9c:
            X.C93677aUj.LIZLLL = r0
            if (r6 == 0) goto La9
            java.lang.String r0 = r6.projectSource
            if (r0 == 0) goto La9
        La4:
            X.C93677aUj.LIZIZ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La9:
            java.lang.String r0 = "unkown"
            goto La4
        Lac:
            java.lang.String r0 = ""
            goto L9c
        Laf:
            r0 = 0
            goto L6f
        Lb2:
            r0 = 0
            goto L4b
        Lb5:
            X.C141335gf.LIZJ(r6)
            r3.LJLILLLLZI = r8
            java.lang.Object r6 = LIZLLL(r10)
            if (r6 != r1) goto L20
            return r1
        Lc1:
            X.ajx r3 = new X.ajx
            r3.<init>(r9, r11)
            goto L12
        Lc8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93677aUj.LIZJ(java.lang.String, X.2kd):java.lang.Object");
    }
}
