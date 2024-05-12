package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveChargePanelPositionSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Uci, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77588Uci {
    public static final /* synthetic */ int LIZ = 0;

    public static Diamond LIZIZ(DiamondPackageExtra diamondPackageExtra, List list) {
        if (diamondPackageExtra == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Diamond diamond = (Diamond) it.next();
            if (diamondPackageExtra.RecommendedPacketId == diamond.id && diamond.LJLIL == 0) {
                return diamond;
            }
        }
        return null;
    }

    public static Diamond LIZ(List list, long j, C77591Ucl c77591Ucl) {
        Object obj = null;
        if (j <= 0 || C79004UzY.LJJIFFI(list)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Diamond diamond = (Diamond) it.next();
            int i = diamond.count;
            if (c77591Ucl.LIZLLL == 0 && LiveChargePanelPositionSetting.INSTANCE.getValue()) {
                i += diamond.givingCount;
            }
            if (i >= j) {
                return diamond;
            }
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((Diamond) previous).LJLIL != 2) {
                obj = previous;
                break;
            }
        }
        return (Diamond) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r7 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r4 = (java.lang.Integer) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI.mv0(X.C29061Bar.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r3.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r2 = (com.bytedance.android.livesdk.wallet.Diamond) r3.next();
        r1 = r2.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r4.intValue() != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2.LJLIL != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r4.intValue() == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        r4 = java.lang.Integer.valueOf(r7.recentlyPurchasedPacketId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0037, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdk.wallet.Diamond LIZJ(java.util.List r6, com.bytedance.android.livesdk.wallet.DiamondPackageExtra r7, long r8, X.C77591Ucl r10) {
        /*
            java.lang.String r0 = "rechargeList"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "rechargeConfig"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            boolean r0 = r6.isEmpty()
            r5 = 0
            if (r0 == 0) goto L12
            return r5
        L12:
            X.Ue7 r0 = X.C77649Udh.LIZ()
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L2b
            com.bytedance.android.livesdk.wallet.Diamond r0 = LIZ(r6, r8, r10)
            if (r0 == 0) goto L24
        L22:
            r5 = r0
        L23:
            return r5
        L24:
            com.bytedance.android.livesdk.wallet.Diamond r0 = LIZIZ(r7, r6)
            if (r0 == 0) goto L3a
            goto L22
        L2b:
            com.bytedance.android.livesdk.wallet.Diamond r0 = LIZIZ(r7, r6)
            if (r0 == 0) goto L33
            r5 = r0
            goto L23
        L33:
            com.bytedance.android.livesdk.wallet.Diamond r0 = LIZ(r6, r8, r10)
            if (r0 == 0) goto L3a
            goto L22
        L3a:
            if (r7 != 0) goto L3d
            goto L23
        L3d:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Bar> r0 = X.C29061Bar.class
            java.lang.Object r4 = r1.mv0(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L6a
        L49:
            java.util.Iterator r3 = r6.iterator()
        L4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r2 = r3.next()
            com.bytedance.android.livesdk.wallet.Diamond r2 = (com.bytedance.android.livesdk.wallet.Diamond) r2
            int r1 = r2.id
            if (r4 != 0) goto L5e
            goto L4d
        L5e:
            int r0 = r4.intValue()
            if (r0 != r1) goto L4d
            int r0 = r2.LJLIL
            if (r0 != 0) goto L4d
            r5 = r2
            goto L23
        L6a:
            int r0 = r4.intValue()
            if (r0 == 0) goto L71
            goto L49
        L71:
            int r0 = r7.recentlyPurchasedPacketId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77588Uci.LIZJ(java.util.List, com.bytedance.android.livesdk.wallet.DiamondPackageExtra, long, X.Ucl):com.bytedance.android.livesdk.wallet.Diamond");
    }
}
