package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: X.CiG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32068CiG {
    public static long LIZ;
    public static IMessageManager LIZIZ;
    public static C32075CiN LIZJ;
    public static boolean LIZLLL;
    public static C77904Uho LJ;
    public static boolean LJFF;

    public static void LIZIZ() {
        IMessageManager iMessageManager = LIZIZ;
        if (iMessageManager != null) {
            iMessageManager.destroyMessage();
        }
        LIZIZ = null;
        LIZJ = null;
        LJ = null;
        C65814PsI LIZ2 = C65814PsI.LIZ();
        C65047Pfv c65047Pfv = C65045Pft.LIZ().LIZLLL;
        LIZ2.getClass();
        ((INetworkService) CN1.LIZ(INetworkService.class)).SP(c65047Pfv);
    }

    public static boolean LIZJ(IMessageManager iMessageManager) {
        EnumC32070CiI enumC32070CiI;
        C32075CiN messageConfiguration;
        C87379YRb c87379YRb;
        if (iMessageManager != null && (messageConfiguration = iMessageManager.getMessageConfiguration()) != null && (c87379YRb = messageConfiguration.LIZ) != null) {
            enumC32070CiI = c87379YRb.LJIJI;
        } else {
            enumC32070CiI = null;
        }
        if (enumC32070CiI == EnumC32070CiI.PREVIEW) {
            return true;
        }
        return false;
    }

    public static void LIZ(long j, IMessageManager iMessageManager) {
        InterfaceC32073CiL giftInterceptor = ((IGiftService) CN1.LIZ(IGiftService.class)).getGiftInterceptor(j, LIZLLL);
        if (giftInterceptor != null) {
            giftInterceptor.LIZ(LIZIZ);
        }
        IInterceptor cu3 = new CU3(j);
        if (iMessageManager != null) {
            iMessageManager.addInterceptor(giftInterceptor);
            iMessageManager.addInterceptor(cu3);
            iMessageManager.addFrequencyInterceptor(new C31047CGl(LIZLLL));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ugc.live.sdk.message.interfaces.IMessageManager LIZLLL(android.content.Context r32, long r33, boolean r35, long r36, boolean r38, boolean r39, X.EnumC32070CiI r40) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32068CiG.LIZLLL(android.content.Context, long, boolean, long, boolean, boolean, X.CiI):com.ss.ugc.live.sdk.message.interfaces.IMessageManager");
    }
}
