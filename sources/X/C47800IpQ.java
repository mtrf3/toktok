package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import java.util.HashMap;

/* renamed from: X.IpQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47800IpQ implements InterfaceC47812Ipc {
    public static final java.util.Map<Integer, Object> LJ;
    public final boolean LIZIZ;
    public final java.util.Map<Integer, C47871IqZ> LIZJ;
    public final C78847Ux1 LIZLLL = new C78847Ux1();

    static {
        HashMap hashMap = new HashMap();
        LJ = hashMap;
        hashMap.put(963, 1);
        hashMap.put(5, 3);
        hashMap.put(11, 30);
        hashMap.put(12, 5000000);
        hashMap.put(612, 1);
        hashMap.put(85, -1);
        hashMap.put(28, 30);
        hashMap.put(100, 1);
        hashMap.put(160, 0);
        hashMap.put(110, -1);
        hashMap.put(310, -1);
        hashMap.put(675, -1);
        hashMap.put(956, -1);
        hashMap.put(1406, -1);
        hashMap.put(183, 1);
        hashMap.put(184, 1);
        hashMap.put(201, Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        hashMap.put(202, 5000);
        hashMap.put(851, 10);
        hashMap.put(852, 300);
        hashMap.put(853, 3);
        hashMap.put(862, 10);
        hashMap.put(863, 300);
        hashMap.put(864, 3);
        hashMap.put(950, Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        hashMap.put(207, 2);
        hashMap.put(208, 1);
        hashMap.put(215, 1);
        hashMap.put(414, 3);
        hashMap.put(37, 1);
        hashMap.put(417, 1);
        hashMap.put(498, 1);
        hashMap.put(422, 1048576);
        hashMap.put(423, 409600);
        hashMap.put(474, 5000);
        hashMap.put(475, 10000);
        hashMap.put(424, 2);
        hashMap.put(427, 1);
        hashMap.put(430, -1);
        hashMap.put(476, 2);
        hashMap.put(Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT), Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        hashMap.put(504, 1);
        hashMap.put(574, 4);
        hashMap.put(506, 2);
        EnumC47176IfM enumC47176IfM = EnumC47176IfM.Undefine;
        hashMap.put(502, Integer.valueOf(enumC47176IfM.getIndex()));
        hashMap.put(544, Integer.valueOf(enumC47176IfM.getIndex()));
        EnumC47176IfM enumC47176IfM2 = EnumC47176IfM.SuperHigh;
        hashMap.put(536, Integer.valueOf(enumC47176IfM2.getIndex()));
        hashMap.put(537, Integer.valueOf(enumC47176IfM2.getIndex()));
        hashMap.put(334, -1);
        hashMap.put(335, -1);
        hashMap.put(341, -1);
        hashMap.put(342, -1);
        hashMap.put(487, -1);
        hashMap.put(489, 2);
        hashMap.put(491, 1000);
        hashMap.put(492, 1);
        hashMap.put(495, 1);
        hashMap.put(496, 1);
        hashMap.put(568, -1);
        hashMap.put(517, -3);
        hashMap.put(607, 5000000);
        hashMap.put(610, 1);
        hashMap.put(657, 300);
        hashMap.put(558, 1);
        hashMap.put(670, 1);
        hashMap.put(255, 3);
        hashMap.put(700, -1);
        hashMap.put(572, 1);
        hashMap.put(721, 1);
        hashMap.put(578, 1);
        hashMap.put(742, 1);
        hashMap.put(801, -1);
        hashMap.put(744, -1);
        hashMap.put(1219, 60);
        hashMap.put(325, Float.valueOf(0.25f));
        hashMap.put(326, Float.valueOf(-18.0f));
        hashMap.put(327, Float.valueOf(8.0f));
        hashMap.put(328, Float.valueOf(0.007f));
        hashMap.put(348, Float.valueOf(200.0f));
        hashMap.put(349, Float.valueOf(3.0f));
        hashMap.put(359, Float.valueOf(50.0f));
        hashMap.put(526, Float.valueOf(0.9f));
        hashMap.put(527, Float.valueOf(9.0f));
        hashMap.put(528, Float.valueOf(2.0f));
        hashMap.put(529, Float.valueOf(1.0f));
        hashMap.put(531, "");
        hashMap.put(355, "");
        hashMap.put(532, "");
        hashMap.put(546, "");
        hashMap.put(547, "");
        hashMap.put(1000, "h264");
        hashMap.put(4024, 4);
        hashMap.put(571, 1);
    }

    @Override // X.InterfaceC47812Ipc
    public final void reset() {
        this.LIZJ.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00d6, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0deb A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    @Override // X.InterfaceC47812Ipc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47871IqZ LJ(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 4832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47800IpQ.LJ(int, int):X.IqZ");
    }

    @Override // X.InterfaceC47812Ipc
    public final java.util.Map<Integer, C47871IqZ> LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC47812Ipc
    public final long LIZ(int i) {
        Object LJIIJ = LJIIJ(i);
        long j = 0;
        if (LJIIJ == null) {
            return 0L;
        }
        try {
            j = ((Long) LJIIJ).longValue();
            return j;
        } catch (Exception e) {
            StringBuilder LJ2 = C7MY.LJ("key: ", i, ", ");
            LJ2.append(e.getMessage());
            C78253UnR.LIZLLL("EngineConfig", X1D.LIZIZ(LJ2));
            return j;
        }
    }

    @Override // X.InterfaceC47812Ipc
    public final String LIZIZ(int i) {
        Object LJIIJ = LJIIJ(i);
        String str = null;
        if (LJIIJ == null) {
            return null;
        }
        try {
            str = (String) LJIIJ;
            return str;
        } catch (Exception e) {
            StringBuilder LJ2 = C7MY.LJ("key: ", i, ", ");
            LJ2.append(e.getMessage());
            C78253UnR.LIZLLL("EngineConfig", X1D.LIZIZ(LJ2));
            return str;
        }
    }

    @Override // X.InterfaceC47812Ipc
    public final boolean LJII(int i) {
        return this.LIZJ.containsKey(Integer.valueOf(i));
    }

    @Override // X.InterfaceC47812Ipc
    public final int LJIIIIZZ(int i) {
        Object LJIIJ = LJIIJ(i);
        int i2 = 0;
        if (LJIIJ == null) {
            return 0;
        }
        try {
            i2 = ((Integer) LJIIJ).intValue();
            return i2;
        } catch (Exception e) {
            StringBuilder LJ2 = C7MY.LJ("key: ", i, ", ");
            LJ2.append(e.getMessage());
            C78253UnR.LIZLLL("EngineConfig", X1D.LIZIZ(LJ2));
            return i2;
        }
    }

    @Override // X.InterfaceC47812Ipc
    public final float LJIIIZ(int i) {
        Object LJIIJ = LJIIJ(i);
        float f = 0.0f;
        if (LJIIJ == null) {
            return 0.0f;
        }
        try {
            f = ((Float) LJIIJ).floatValue();
            return f;
        } catch (Exception e) {
            StringBuilder LJ2 = C7MY.LJ("key: ", i, ", ");
            LJ2.append(e.getMessage());
            C78253UnR.LIZLLL("EngineConfig", X1D.LIZIZ(LJ2));
            return f;
        }
    }

    public final Object LJIIJ(int i) {
        try {
            if (this.LIZJ.containsKey(Integer.valueOf(i))) {
                return this.LIZJ.get(Integer.valueOf(i)).LIZIZ;
            }
            return ((HashMap) LJ).get(Integer.valueOf(i));
        } catch (Exception e) {
            C78253UnR.LIZLLL("EngineConfig", e.getMessage());
            return null;
        }
    }

    @Override // X.InterfaceC47812Ipc
    public final void remove(int i) {
        this.LIZJ.remove(Integer.valueOf(i));
    }

    public C47800IpQ(boolean z, java.util.Map<Integer, C47871IqZ> map) {
        this.LIZIZ = z;
        this.LIZJ = map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r4 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // X.InterfaceC47812Ipc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47871IqZ LIZJ(float r6, int r7) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47800IpQ.LIZJ(float, int):X.IqZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[FALL_THROUGH] */
    @Override // X.InterfaceC47812Ipc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47871IqZ LIZLLL(int r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r5.LIZIZ
            r2 = 0
            if (r0 == 0) goto L17
            java.lang.String r0 = r5.LIZIZ(r6)
            boolean r0 = java.util.Objects.equals(r7, r0)
            if (r0 == 0) goto L17
            java.lang.String r1 = "EngineConfig"
            java.lang.String r0 = "option value not changed"
            X.C78253UnR.LJI(r1, r0)
            return r2
        L17:
            X.Ux1 r0 = r5.LIZLLL
            r0.getClass()
            boolean r0 = X.C78847Ux1.LJJIZ(r6)
            r4 = 4
            if (r0 == 0) goto L32
            X.Iqa r2 = new X.Iqa
            r2.<init>(r6, r4, r7)
        L28:
            java.util.Map<java.lang.Integer, X.IqZ> r1 = r5.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.put(r0, r2)
        L31:
            return r2
        L32:
            r0 = 355(0x163, float:4.97E-43)
            r3 = -1
            if (r6 == r0) goto L90
            r0 = 531(0x213, float:7.44E-43)
            if (r6 == r0) goto L8a
            r0 = 662(0x296, float:9.28E-43)
            if (r6 == r0) goto L82
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r6 == r0) goto L8a
            r0 = 360(0x168, float:5.04E-43)
            r1 = 1161(0x489, float:1.627E-42)
            if (r6 == r0) goto L7c
            r0 = 361(0x169, float:5.06E-43)
            if (r6 == r0) goto L76
            switch(r6) {
                case 538: goto L8a;
                case 539: goto L8a;
                case 540: goto L8a;
                default: goto L50;
            }
        L50:
            switch(r6) {
                case 545: goto L8a;
                case 546: goto L8a;
                case 547: goto L8a;
                default: goto L53;
            }
        L53:
            switch(r6) {
                case 1410: goto L8a;
                case 1411: goto L8a;
                case 1412: goto L8a;
                default: goto L56;
            }
        L56:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "unknown option key: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", value: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ConfigItemFactory"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.w(r0, r1)
        L73:
            if (r2 == 0) goto L31
            goto L28
        L76:
            X.Iqa r2 = new X.Iqa
            r2.<init>(r1, r4, r3, r7)
            goto L73
        L7c:
            X.Iqa r2 = new X.Iqa
            r2.<init>(r1, r4, r3, r7)
            goto L73
        L82:
            X.Iqa r2 = new X.Iqa
            r0 = 202(0xca, float:2.83E-43)
            r2.<init>(r0, r4, r3, r7)
            goto L73
        L8a:
            X.Iqf r2 = new X.Iqf
            r2.<init>(r6, r4, r7)
            goto L73
        L90:
            X.Iqa r2 = new X.Iqa
            r0 = 1158(0x486, float:1.623E-42)
            r2.<init>(r0, r4, r3, r7)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47800IpQ.LIZLLL(int, java.lang.String):X.IqZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r3 != null) goto L11;
     */
    @Override // X.InterfaceC47812Ipc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47871IqZ LJFF(int r5, long r6) {
        /*
            r4 = this;
            boolean r0 = r4.LIZIZ
            r3 = 0
            if (r0 == 0) goto L15
            long r1 = r4.LIZ(r5)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            java.lang.String r1 = "EngineConfig"
            java.lang.String r0 = "option value not changed"
            X.C78253UnR.LJI(r1, r0)
            return r3
        L15:
            X.Ux1 r0 = r4.LIZLLL
            r0.getClass()
            boolean r0 = X.C78847Ux1.LJJIZ(r5)
            r2 = 2
            if (r0 == 0) goto L34
            X.Iqa r3 = new X.Iqa
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.<init>(r5, r2, r0)
        L2a:
            java.util.Map<java.lang.Integer, X.IqZ> r1 = r4.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r0, r3)
        L33:
            return r3
        L34:
            r0 = 709(0x2c5, float:9.94E-43)
            if (r5 == r0) goto L48
            java.lang.String r1 = "unknown option key: "
            java.lang.String r0 = ", value: "
            java.lang.String r1 = X.C00F.LIZJ(r1, r5, r0, r6)
            java.lang.String r0 = "ConfigItemFactory"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.w(r0, r1)
        L45:
            if (r3 == 0) goto L33
            goto L2a
        L48:
            X.Iqa r3 = new X.Iqa
            r1 = 668(0x29c, float:9.36E-43)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.<init>(r1, r2, r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47800IpQ.LJFF(int, long):X.IqZ");
    }
}
