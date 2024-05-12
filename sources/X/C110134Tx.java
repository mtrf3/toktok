package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import kotlin.jvm.internal.o;

/* renamed from: X.4Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110134Tx {
    public static boolean LIZ(Integer num) {
        if (num != null && num.intValue() >= 3) {
            return false;
        }
        return true;
    }

    public static BaseContent LIZJ(C109544Rq chatMessage) {
        o.LJIIIZ(chatMessage, "chatMessage");
        return LIZLLL(chatMessage, null);
    }

    public static EnumC110124Tw LJ(int i) {
        EnumC110124Tw enumC110124Tw = EnumC110124Tw.lookupMap.get(Integer.valueOf(i));
        if (enumC110124Tw == null) {
            return EnumC110124Tw.UNSUPPORTED_RECEIVE;
        }
        return enumC110124Tw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x03e8, code lost:
    
        if (r5 != r6) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x03ee, code lost:
    
        if (r8.isSelf() == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:?, code lost:
    
        return X.EnumC110124Tw.TEXT_BIG_EMOJI_SEND;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:?, code lost:
    
        return X.EnumC110124Tw.TEXT_BIG_EMOJI_RECEIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x03f4, code lost:
    
        r2 = X.C118824lS.LIZ.matcher(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x03fe, code lost:
    
        if (r2.find() == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0400, code lost:
    
        r1 = r2.group();
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0408, code lost:
    
        if (r7.LIZJ(r1) == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x040a, code lost:
    
        r4 = r4 + 1;
        r5 = r5 + r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0411, code lost:
    
        if (r5 > r6) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0413, code lost:
    
        if (r4 <= 3) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0416, code lost:
    
        if (r5 != r6) goto L274;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC110124Tw LJFF(X.C109544Rq r8) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110134Tx.LJFF(X.4Rq):X.4Tw");
    }

    public static BaseContent LIZLLL(C109544Rq chatMessage, EnumC110124Tw enumC110124Tw) {
        BaseContent baseContent;
        o.LJIIIZ(chatMessage, "chatMessage");
        if (enumC110124Tw == null) {
            enumC110124Tw = LJFF(chatMessage);
        }
        if (enumC110124Tw == EnumC110124Tw.UNSUPPORTED_SEND || enumC110124Tw == EnumC110124Tw.UNSUPPORTED_RECEIVE) {
            BaseContent LIZJ = enumC110124Tw.LIZJ(chatMessage);
            if (!(LIZJ instanceof BaseContent)) {
                return null;
            }
            return LIZJ;
        }
        if (C93793mB.LJIILL(chatMessage) || C93793mB.LJIIZILJ(chatMessage)) {
            return null;
        }
        Object LJIIL = C1DJ.LJIIL(chatMessage);
        if ((LJIIL instanceof BaseContent) && (baseContent = (BaseContent) LJIIL) != null) {
            return baseContent;
        }
        BaseContent LIZJ2 = enumC110124Tw.LIZJ(chatMessage);
        chatMessage.putLocalCache(501, LIZJ2);
        if (!(LIZJ2 instanceof BaseContent)) {
            return null;
        }
        return LIZJ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseContent LIZIZ(int i, String str, String str2, boolean z, long j) {
        if (str2 == null || str2.length() == 0) {
            return new TextContent(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
        }
        C109544Rq c109544Rq = new C109544Rq();
        java.util.Map<String, String> ext = c109544Rq.getExt();
        o.LJIIIIZZ(ext, "message.ext");
        ext.put("s:is_recalled", String.valueOf(z));
        if (str != null) {
            java.util.Map<String, String> ext2 = c109544Rq.getExt();
            o.LJIIIIZZ(ext2, "message.ext");
            ext2.put("a:src", str);
        }
        c109544Rq.setContent(str2);
        c109544Rq.setMsgType(i);
        c109544Rq.setSender(j);
        return LIZJ(c109544Rq);
    }
}
