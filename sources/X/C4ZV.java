package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.emoji.sysemoji.Emoji;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiStruct;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZV {
    public static final C4ZV LIZ = new C4ZV();
    public static final java.util.Map<Integer, Boolean> LIZIZ = new LinkedHashMap();
    public static final List<ImSysEmojiModel> LIZJ = new ArrayList();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C4ZW.LJLIL);
    public static final java.util.Map<Integer, List<ImSysEmojiModel>> LJ = new LinkedHashMap();

    public final synchronized void LIZ() {
        C62822Ol8 c62822Ol8 = LIZLLL;
        if (((List) c62822Ol8.getValue()).isEmpty()) {
            ((List) c62822Ol8.getValue()).addAll(LIZJ());
        }
    }

    public static List LIZJ() {
        boolean z;
        InputStream open = EF7.LIZIZ().getAssets().open("I18N_sys_emoji.json");
        o.LJIIIIZZ(open, "AppContextManager.getApp…en(\"I18N_sys_emoji.json\")");
        C37247Ejb.LIZIZ.getClass();
        ImSysEmojiStruct imSysEmojiStruct = (ImSysEmojiStruct) C75792yF.LIZ(C36871EdX.LIZJ(open), ImSysEmojiStruct.class);
        ArrayList arrayList = new ArrayList();
        List<Emoji> d = imSysEmojiStruct.getD();
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(d, 10));
            for (Emoji emoji : d) {
                if (Build.VERSION.SDK_INT >= CastIntegerProtector.parseInt(emoji.getAnd())) {
                    z = true;
                } else {
                    z = false;
                }
                Emoji emoji2 = null;
                String str = null;
                if (z) {
                    ImSysEmojiModel imSysEmojiModel = new ImSysEmojiModel();
                    imSysEmojiModel.setBusinessType(emoji.getBusiness());
                    List<String> emoji3 = emoji.getEmoji();
                    if (emoji3 != null) {
                        str = (String) ListProtector.get(emoji3, 0);
                    }
                    imSysEmojiModel.setPreviewEmoji(str);
                    imSysEmojiModel.setSupportSkinBusinessType(1);
                    imSysEmojiModel.setEmojiList(emoji.getEmoji());
                    imSysEmojiModel.setMiniSupportSysVersion(emoji.getAnd());
                    arrayList.add(imSysEmojiModel);
                    emoji2 = emoji;
                }
                arrayList2.add(emoji2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0021, B:11:0x002e, B:16:0x003f, B:18:0x0048, B:23:0x0057, B:28:0x0069, B:29:0x0082, B:30:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b6, B:38:0x00c0, B:40:0x00c3, B:44:0x00c7, B:48:0x006d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0021, B:11:0x002e, B:16:0x003f, B:18:0x0048, B:23:0x0057, B:28:0x0069, B:29:0x0082, B:30:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b6, B:38:0x00c0, B:40:0x00c3, B:44:0x00c7, B:48:0x006d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel> LIZIZ(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel>> r2 = X.C4ZV.LJ     // Catch: java.lang.Throwable -> Ld2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            r0 = r2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Ld2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            r0 = r2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Ld2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L2b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld2
            r0 = r0 ^ 1
            if (r0 != r5) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> Ld2
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Ld2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r6)
            return r0
        L3f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld2
            r2.<init>()     // Catch: java.lang.Throwable -> Ld2
            java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel> r3 = X.C4ZV.LIZJ     // Catch: java.lang.Throwable -> Ld2
            if (r3 == 0) goto L54
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Ld2
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L52
            goto L54
        L52:
            r0 = 0
            goto L55
        L54:
            r0 = 1
        L55:
            if (r0 != 0) goto L6d
            X.5H3 r0 = X.C4VA.LIZIZ     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Ld2
            com.ss.android.ugc.aweme.emoji.sysemoji.SystemEmojiVersionId r0 = (com.ss.android.ugc.aweme.emoji.sysemoji.SystemEmojiVersionId) r0     // Catch: java.lang.Throwable -> Ld2
            int r1 = r0.bussinessCode     // Catch: java.lang.Throwable -> Ld2
            r0 = -1
            if (r1 != r0) goto L65
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L69
            goto L6d
        L69:
            r2.addAll(r3)     // Catch: java.lang.Throwable -> Ld2
            goto L82
        L6d:
            java.lang.String r1 = "ImSysEmojiManager"
            java.lang.String r0 = "use base resource"
            X.C34B.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> Ld2
            r6.LIZ()     // Catch: java.lang.Throwable -> Ld2
            X.Ol8 r0 = X.C4ZV.LIZLLL     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Ld2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld2
            r2.addAll(r0)     // Catch: java.lang.Throwable -> Ld2
        L82:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld2
            r3.<init>()     // Catch: java.lang.Throwable -> Ld2
            X.KOz r0 = X.ORZ.LJLIIIL(r2)     // Catch: java.lang.Throwable -> Ld2
            X.4g9 r2 = X.OJ4.LJJJJIZL(r0)     // Catch: java.lang.Throwable -> Ld2
            kotlin.jvm.internal.AqS26S0001000_1 r1 = new kotlin.jvm.internal.AqS26S0001000_1     // Catch: java.lang.Throwable -> Ld2
            r0 = 5
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> Ld2
            X.4g9 r0 = X.OJ4.LJJJJ(r2, r1)     // Catch: java.lang.Throwable -> Ld2
            X.4g8 r2 = new X.4g8     // Catch: java.lang.Throwable -> Ld2
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld2
        L9e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lc7
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Ld2
            com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel r1 = (com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel) r1     // Catch: java.lang.Throwable -> Ld2
            int r0 = r1.getSupportSkinBusinessType()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == r7) goto Lc3
            java.util.List r0 = r1.getEmojiList()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto Lc0
        Lbe:
            java.lang.String r0 = ""
        Lc0:
            r1.setPreviewEmoji(r0)     // Catch: java.lang.Throwable -> Ld2
        Lc3:
            r3.add(r1)     // Catch: java.lang.Throwable -> Ld2
            goto L9e
        Lc7:
            java.util.Map<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel>> r1 = X.C4ZV.LJ     // Catch: java.lang.Throwable -> Ld2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r6)
            return r3
        Ld2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4ZV.LIZIZ(int):java.util.List");
    }
}
