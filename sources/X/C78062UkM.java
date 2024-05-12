package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.UkM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78062UkM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C78072UkW c78072UkW) {
        Long l;
        Long l2;
        Long l3;
        User user;
        User user2;
        StringBuilder sb = new StringBuilder(90);
        GiftMessage giftMessage = c78072UkW.LIZ;
        Long l4 = null;
        if (giftMessage != null) {
            l = Long.valueOf(giftMessage.giftId);
        } else {
            l = null;
        }
        sb.append(l);
        GiftMessage giftMessage2 = c78072UkW.LIZ;
        if (giftMessage2 != null && (user2 = giftMessage2.fromUser) != null) {
            l2 = Long.valueOf(user2.getId());
        } else {
            l2 = null;
        }
        sb.append(l2);
        GiftMessage giftMessage3 = c78072UkW.LIZ;
        if (giftMessage3 != null && (user = giftMessage3.toUser) != null) {
            l3 = Long.valueOf(user.getId());
        } else {
            l3 = null;
        }
        sb.append(l3);
        GiftMessage giftMessage4 = c78072UkW.LIZ;
        if (giftMessage4 != null) {
            l4 = Long.valueOf(giftMessage4.groupId);
        }
        sb.append(l4);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder(MAX_SIZE_S…)\n            .toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZIZ(com.bytedance.android.livesdk.model.message.common.Text r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L48
            java.lang.String r0 = r5.key
        L5:
            java.lang.String r3 = ""
            if (r0 == 0) goto L40
            X.Y7x r1 = X.C86881Y7x.LIZIZ()
            java.lang.String r0 = r5.key
            java.lang.String r0 = r1.LIZ(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L42
            X.Y7x r1 = X.C86881Y7x.LIZIZ()
            java.lang.String r0 = r5.key
            java.lang.String r2 = r1.LIZ(r0)
            java.lang.String r0 = "{\n            I18nCenter…nst()[text.key]\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3f
            android.text.Spannable r1 = X.CXJ.LJI(r2, r5, r4)
            android.text.Spannable r0 = X.CXJ.LIZ
            if (r1 == r0) goto L3f
            android.text.Spannable r3 = X.CXJ.LJI(r2, r5, r4)
            java.lang.String r0 = "{\n            TextPieceH…(pattern, text)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
        L3f:
            return r3
        L40:
            if (r5 == 0) goto L46
        L42:
            java.lang.String r2 = r5.defaultPattern
            if (r2 != 0) goto L28
        L46:
            r2 = r3
            goto L28
        L48:
            r0 = r4
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78062UkM.LIZIZ(com.bytedance.android.livesdk.model.message.common.Text):java.lang.CharSequence");
    }

    public static boolean LIZJ(C78072UkW c78072UkW) {
        GiftMessage giftMessage;
        Gift gift;
        Integer valueOf;
        if (LIZLLL(c78072UkW)) {
            return true;
        }
        if (c78072UkW != null && (giftMessage = c78072UkW.LIZ) != null && (gift = giftMessage.mGift) != null && (valueOf = Integer.valueOf(gift.type)) != null && valueOf.intValue() == 4) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(C78072UkW c78072UkW) {
        GiftMessage giftMessage;
        Gift gift;
        if (c78072UkW == null) {
            return false;
        }
        EnumC78063UkN enumC78063UkN = c78072UkW.LJII;
        if (enumC78063UkN == EnumC78063UkN.VIDEO_ONLY) {
            return true;
        }
        if (enumC78063UkN == EnumC78063UkN.TRAY_ONLY || (giftMessage = c78072UkW.LIZ) == null || (gift = giftMessage.mGift) == null) {
            return false;
        }
        if (gift.type != 2 && gift.type != 8) {
            return false;
        }
        return true;
    }
}
