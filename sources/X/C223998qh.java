package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.8qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223998qh {
    public static final StickerAttrStruct LIZ(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            return (StickerAttrStruct) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (s unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> LIZIZ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L8
            java.util.List r0 = r5.getTrackTimeStampCache()     // Catch: com.google.gson.s -> L32
            goto L9
        L8:
            r0 = r4
        L9:
            if (r0 != 0) goto L2b
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: com.google.gson.s -> L32
            com.google.gson.Gson r2 = r0.LIZ()     // Catch: com.google.gson.s -> L32
            if (r5 == 0) goto L29
            java.lang.String r1 = r5.getTrackList()     // Catch: com.google.gson.s -> L32
        L19:
            X.8qg r0 = new X.8qg     // Catch: com.google.gson.s -> L32
            r0.<init>()     // Catch: com.google.gson.s -> L32
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L32
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)     // Catch: com.google.gson.s -> L32
            java.util.List r3 = (java.util.List) r3     // Catch: com.google.gson.s -> L32
            goto L37
        L29:
            r1 = r4
            goto L19
        L2b:
            if (r5 == 0) goto L35
            java.util.List r3 = r5.getTrackTimeStampCache()     // Catch: com.google.gson.s -> L32
            goto L39
        L32:
            r2 = move-exception
            r3 = r4
            goto L45
        L35:
            r3 = r4
            goto L39
        L37:
            if (r5 != 0) goto L40
        L39:
            boolean r0 = X.C79004UzY.LJJIFFI(r3)
            if (r0 == 0) goto L59
            return r4
        L40:
            r5.setTrackTimeStampCache(r3)     // Catch: com.google.gson.s -> L44
            goto L39
        L44:
            r2 = move-exception
        L45:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "InteractStickerUtils.kt : e "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36922EeM.LJ(r0)
            goto L39
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223998qh.LIZIZ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }

    public static final String LIZLLL(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, "webview")) {
            return "web_url";
        }
        return "open_url";
    }

    public static final boolean LJ(Context context) {
        o.LJIIIZ(context, "context");
        return F9J.LIZIZ(context, 0, "test_data").getBoolean("sp_interact_stickers_test", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r2.getEndTime() >= r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> LIZJ(long r6, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r8) {
        /*
            java.lang.String r0 = "interactStickerStruct"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r5 = 0
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Exception -> L22
            com.google.gson.Gson r2 = r0.LIZ()     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = r8.getTrackList()     // Catch: java.lang.Exception -> L22
            X.8qd r0 = new X.8qd     // Catch: java.lang.Exception -> L22
            r0.<init>()     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L22
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Exception -> L22
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L22
            goto L37
        L22:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "InteractStickerUtils.kt : e "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36922EeM.LJ(r0)
            r0 = r5
        L37:
            if (r0 == 0) goto L78
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L42:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp r2 = (com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp) r2
            if (r2 != 0) goto L58
        L51:
            r0 = 0
        L52:
            if (r0 == 0) goto L42
            r5.add(r3)
            goto L42
        L58:
            boolean r0 = r2.isWholeDuration()
            if (r0 == 0) goto L60
        L5e:
            r0 = 1
            goto L52
        L60:
            boolean r0 = r2.timeIsValid()
            if (r0 == 0) goto L51
            float r1 = (float) r6
            float r0 = r2.getStartTime()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L51
            float r0 = r2.getEndTime()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L51
            goto L5e
        L78:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223998qh.LIZJ(long, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }
}
