package X;

import com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aYt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93935aYt {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static int LIZJ = -1;
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "EMPTY";

    public static int LIZIZ() {
        int i = LIZJ;
        if (i != -1) {
            return i;
        }
        int size = ((ArrayList) LIZLLL()).size();
        LIZJ = size;
        return size;
    }

    public static List LIZLLL() {
        VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel tiktokVoiceSearchMultiLanguageSettingsModel = (VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel) VoiceSearchMultiLanguageSettings.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<VoiceSearchMultiLanguageSettings.Language> list = tiktokVoiceSearchMultiLanguageSettingsModel.languages;
        if (list != null) {
            for (VoiceSearchMultiLanguageSettings.Language language : list) {
                List<VoiceSearchMultiLanguageSettings.Cluster> list2 = language.clusters;
                if (list2 != null) {
                    for (VoiceSearchMultiLanguageSettings.Cluster cluster : list2) {
                        if (C78685UuP.LJJJZ(cluster.saucLanguage) && C78685UuP.LJJJZ(cluster.displayShort) && !linkedHashSet.contains(cluster.saucLanguage)) {
                            linkedHashSet.add(cluster.saucLanguage);
                            String str = cluster.displayShort;
                            String str2 = cluster.displayFull;
                            String str3 = language.lang;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList.add(new C113624d4(str, str2, str3, cluster.saucLanguage));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static C113624d4 LIZJ(String saucLanguage) {
        o.LJIIIZ(saucLanguage, "saucLanguage");
        if (o.LJ(saucLanguage, LJI)) {
            return new C113624d4(LIZLLL, LJ, LJFF, LJI);
        }
        List<VoiceSearchMultiLanguageSettings.Language> list = ((VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel) VoiceSearchMultiLanguageSettings.LIZIZ.getValue()).languages;
        if (list != null) {
            for (VoiceSearchMultiLanguageSettings.Language language : list) {
                List<VoiceSearchMultiLanguageSettings.Cluster> list2 = language.clusters;
                if (list2 != null) {
                    for (VoiceSearchMultiLanguageSettings.Cluster cluster : list2) {
                        if (o.LJ(saucLanguage, cluster.saucLanguage)) {
                            String str = cluster.displayShort;
                            String str2 = cluster.displayFull;
                            String str3 = language.lang;
                            if (str3 == null) {
                                str3 = "";
                            }
                            C113624d4 c113624d4 = new C113624d4(str, str2, str3, cluster.saucLanguage);
                            LJ = c113624d4.LIZIZ;
                            LIZLLL = c113624d4.LIZ;
                            LJFF = LJ(c113624d4.LIZJ);
                            LJI = c113624d4.LIZLLL;
                            return c113624d4;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String LJ(String str) {
        if (ujb.o.LJJJJIZL(str, "in", true)) {
            return "id";
        }
        if (ujb.o.LJJJJIZL(str, "iw", true)) {
            return "he";
        }
        if (ujb.o.LJJJJIZL(str, "ji", true)) {
            return "yi";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LIZ(java.lang.String r8, java.lang.String r9, com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel r10) {
        /*
            java.util.List<com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$Language> r0 = r10.languages
            java.lang.String r2 = ""
            if (r0 == 0) goto L7c
            java.util.Iterator r7 = r0.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r4 = r7.next()
            com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$Language r4 = (com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings.Language) r4
            java.lang.String r0 = r4.lang
            r6 = 1
            boolean r0 = ujb.o.LJJJJIZL(r8, r0, r6)
            if (r0 == 0) goto La
            java.util.List<com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$Cluster> r0 = r4.clusters
            if (r0 == 0) goto L66
            java.util.Iterator r5 = r0.iterator()
        L27:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r5.next()
            com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$Cluster r3 = (com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings.Cluster) r3
            java.util.List<java.lang.String> r1 = r3.region
            if (r1 == 0) goto L27
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3e
            goto L27
        L3e:
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = ujb.o.LJJJJIZL(r0, r9, r6)
            if (r0 == 0) goto L42
            java.lang.String r0 = r3.saucLanguage
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L27
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r1 = r3.saucLanguage
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            return r0
        L66:
            java.lang.String r0 = r4.saucLanguageDefault
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r0 = r4.saucLanguageDefault
            if (r0 != 0) goto L7a
        L74:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r2)
            return r0
        L7a:
            r2 = r0
            goto L74
        L7c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93935aYt.LIZ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings$TiktokVoiceSearchMultiLanguageSettingsModel):X.OSZ");
    }
}
