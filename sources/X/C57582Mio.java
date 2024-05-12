package X;

import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS16S2100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mio, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57582Mio {
    public static final LruCache<String, String> LIZ = new LruCache<>(100);

    public static boolean LIZIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (o.LJ(str, "1-1") || o.LJ(str, "1-2")) {
            return true;
        }
        return false;
    }

    public static String LIZ(int i, int i2, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('-');
        LIZ2.append(str2);
        LIZ2.append('-');
        LIZ2.append(i);
        LIZ2.append('-');
        LIZ2.append(i2);
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.MqI, X.Mij] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.tux.input.TuxTextView r16, com.ss.android.ugc.aweme.profile.model.User r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57582Mio.LIZLLL(com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public static void LJFF(TuxTextView tuxTextView, String str, String str2, String str3) {
        Integer num;
        Object tag = tuxTextView.getTag(R.id.l5s);
        Integer num2 = null;
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num == null) {
            if (tuxTextView.getMaxWidth() != Integer.MAX_VALUE) {
                int maxWidth = tuxTextView.getMaxWidth();
                if (tuxTextView.getMaxLines() != 1) {
                    maxWidth = (tuxTextView.getMaxLines() * maxWidth) - (maxWidth / 2);
                }
                num2 = Integer.valueOf(maxWidth);
            }
            num = num2;
        }
        if (num != null && num.intValue() > 0 && num.intValue() < Integer.MAX_VALUE) {
            String LIZ2 = LIZ(num.intValue(), tuxTextView.getMaxLines(), str, str2);
            String str4 = LIZ.get(LIZ2);
            if (str4 == null || str4.length() == 0) {
                TextPaint paint = tuxTextView.getPaint();
                o.LJIIIIZZ(paint, "paint");
                LIZJ(str, str2, paint, num.intValue(), new AqS16S2100000_9(tuxTextView, str3, LIZ2, 2));
                return;
            }
            tuxTextView.setText(str4);
            return;
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        CharSequence LLLZ = C16880lQ.LLLZ(str2, Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        tuxTextView.setText(LLLZ);
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(tuxTextView, new RunnableC57583Mip(tuxTextView, tuxTextView, str, str2, str3));
    }

    public static void LIZJ(String str, String str2, TextPaint textPaint, int i, InterfaceC88472Yns interfaceC88472Yns) {
        String charSequence = C40689Fy1.LLII(str).toString();
        TextUtils.ellipsize(Q8U.LIZIZ(new Object[]{charSequence}, 1, str2, "format(this, *args)"), textPaint, i, TextUtils.TruncateAt.START, false, new C57584Miq(str2, str, charSequence, interfaceC88472Yns));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:10:0x000c, B:12:0x0016, B:15:0x001f, B:21:0x002d), top: B:9:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.bytedance.tux.input.TuxTextView r8, java.lang.String r9, com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct r10, java.lang.String r11, X.InterfaceC57579Mil r12, X.C26310AUg r13) {
        /*
            r2 = 0
            if (r10 != 0) goto L4
            return r2
        L4:
            boolean r0 = r10.isValid()
            if (r0 != 0) goto Lb
            return r2
        Lb:
            r5 = 0
            java.lang.String r1 = r10.getHashedPhoneNumber()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r10.getExternalUsername()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L1b
            java.lang.String r7 = X.C27484AqW.LIZ(r0)     // Catch: java.lang.Throwable -> L65
            goto L1c
        L1b:
            r7 = r5
        L1c:
            r6 = 1
            if (r1 == 0) goto L28
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r3 = 51
            if (r0 != 0) goto L44
            X.MqI r4 = X.EnumC58046MqI.CONTACT     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r12.LIZ(r1)     // Catch: java.lang.Throwable -> L63
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L63
            if (r0 <= 0) goto L45
            LJFF(r8, r1, r9, r11)     // Catch: java.lang.Throwable -> L63
            X.AUg r0 = X.C26310AUg.LJ(r13, r4, r6, r5, r3)     // Catch: java.lang.Throwable -> L63
            r0.LIZLLL(r5)     // Catch: java.lang.Throwable -> L63
            return r6
        L44:
            r4 = r5
        L45:
            if (r7 == 0) goto L4d
            boolean r0 = ujb.o.LJJJJJL(r7)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L55
        L4d:
            X.AUg r0 = X.C26310AUg.LJ(r13, r4, r2, r5, r3)     // Catch: java.lang.Throwable -> L63
            r0.LIZLLL(r5)     // Catch: java.lang.Throwable -> L63
            goto L62
        L55:
            X.MqI r4 = X.EnumC58046MqI.FACEBOOK     // Catch: java.lang.Throwable -> L63
            LJFF(r8, r7, r9, r11)     // Catch: java.lang.Throwable -> L63
            X.AUg r0 = X.C26310AUg.LJ(r13, r4, r6, r5, r3)     // Catch: java.lang.Throwable -> L63
            r0.LIZLLL(r5)     // Catch: java.lang.Throwable -> L63
            r2 = 1
        L62:
            return r2
        L63:
            r3 = move-exception
            goto L67
        L65:
            r3 = move-exception
            r4 = r5
        L67:
            boolean r0 = r3 instanceof X.C57578Mik
            if (r0 == 0) goto L76
            r0 = r3
            X.Mik r0 = (X.C57578Mik) r0
            if (r0 == 0) goto L76
            X.Mij r1 = r0.getReason()
            if (r1 != 0) goto L78
        L76:
            X.Mij r1 = X.EnumC57577Mij.UNKNOWN
        L78:
            r0 = 35
            X.AUg r0 = X.C26310AUg.LJ(r13, r4, r2, r1, r0)
            r0.LIZLLL(r5)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "set "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " reason by group1 fail"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ExtReason"
            X.C221018lt.LIZJ(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57582Mio.LJ(com.bytedance.tux.input.TuxTextView, java.lang.String, com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct, java.lang.String, X.Mil, X.AUg):boolean");
    }
}
