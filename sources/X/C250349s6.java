package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.i0;
import defpackage.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.9s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250349s6 {
    public static int LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final ArrayList<InterfaceC249899rN> LIZ = C47261Igj.LJII(new InterfaceC249899rN() { // from class: X.9s9
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.ClaimRewardsTimerLongBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(10);
            this.LIZ = bubble;
            if (bubble != null) {
                str = bubble.longContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                int LIZJ2 = i0.LIZJ("_bubble_show_num_", bubble2.bubbleId, this.LIZJ, 0);
                boolean LIZLLL2 = m0.LIZLLL("_pendant_is_click_", bubble2.bubbleId, this.LIZJ, false);
                if (LIZJ2 == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (LIZLLL2 || LIZJ2 >= bubble2.totalTimes) {
                    return;
                }
                int LIZIZ2 = C245559kN.LIZIZ();
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_bubble_last_show_time_");
                LIZ2.append(str2);
                if ((LIZIZ2 - keva.getInt(X1D.LIZIZ(LIZ2), 0)) * 1000 <= TimeUnit.DAYS.toMillis(bubble2.showAgainTime)) {
                    return;
                }
                this.LIZIZ = true;
            }
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            Bubble bubble = this.LIZ;
            if (bubble == null || !this.LIZIZ) {
                return false;
            }
            String str = bubble.longContent;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC249909rO.LJJIL(str, bubble, true, null);
            String str3 = bubble.bubbleId;
            this.LIZJ.storeInt(i0.LJFF("_bubble_show_num_", str3), i0.LIZJ("_bubble_show_num_", str3, this.LIZJ, 0) + 1);
            this.LIZJ.storeInt(i0.LJFF("_bubble_last_show_time_", str3), C245559kN.LIZIZ());
            this.LIZIZ = false;
            String str4 = bubble.LIZIZ;
            if (str4 != null && str4.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = bubble.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String valueOf = String.valueOf(bubble.bubbleType);
                if (valueOf != null) {
                    str2 = valueOf;
                }
                linkedHashMap.put("sub_type", str2);
                linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
            }
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
            Bubble bubble;
            if (o.LJ(str, "CLICK_DYNAMIC_PENDANT") && interfaceC249909rO.LJIJ() && !interfaceC249909rO.LJJIJIL() && !interfaceC249909rO.LJIIJJI() && (bubble = this.LIZ) != null) {
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_pendant_is_click_");
                LIZ2.append(bubble.bubbleId);
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    }, new InterfaceC249899rN() { // from class: X.9sE
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.VideoTaskPromptLongBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(5);
            this.LIZ = bubble;
            if (bubble != null) {
                str = bubble.longContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                if (i0.LIZJ("_bubble_show_num_", bubble2.bubbleId, this.LIZJ, 0) >= bubble2.totalTimes) {
                    this.LIZIZ = false;
                    return;
                }
                int LIZIZ2 = C245559kN.LIZIZ();
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_bubble_last_show_time_");
                LIZ2.append(str2);
                if (LIZIZ2 - keva.getInt(X1D.LIZIZ(LIZ2), 0) > TimeUnit.DAYS.toSeconds(bubble2.showInterval)) {
                    this.LIZIZ = true;
                }
            }
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            boolean z = true;
            if (interfaceC249909rO.LJJIJIL()) {
                this.LIZIZ = false;
                return false;
            }
            Bubble bubble = this.LIZ;
            if (bubble == null) {
                return false;
            }
            if (this.LIZIZ) {
                String str = bubble.longContent;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                interfaceC249909rO.LJJIL(str, bubble, true, null);
                String str3 = bubble.bubbleId;
                this.LIZJ.storeInt(i0.LJFF("_bubble_show_num_", str3), i0.LIZJ("_bubble_show_num_", str3, this.LIZJ, 0) + 1);
                this.LIZJ.storeInt(i0.LJFF("_bubble_last_show_time_", str3), C245559kN.LIZIZ());
                this.LIZIZ = false;
                String str4 = bubble.LIZIZ;
                if (str4 != null && str4.length() != 0) {
                    C247519nX c247519nX = C247519nX.LIZ;
                    int i2 = bubble.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String valueOf = String.valueOf(bubble.bubbleType);
                    if (valueOf != null) {
                        str2 = valueOf;
                    }
                    linkedHashMap.put("sub_type", str2);
                    linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                    C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
                }
            } else {
                z = false;
            }
            return z;
        }
    }, new InterfaceC249899rN() { // from class: X.9sC
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.PendantDynamicTipBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(3);
            this.LIZ = bubble;
            if (bubble != null) {
                str = bubble.shortContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                int LJFF2 = LJFF(bubble2.bubbleId);
                boolean LIZLLL2 = m0.LIZLLL("_pendant_is_click_", bubble2.bubbleId, this.LIZJ, false);
                if (LJFF2 == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (LIZLLL2) {
                    return;
                }
                if (LJFF2 == 1) {
                    if (System.currentTimeMillis() - LJ(bubble2.bubbleId) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTimeX)) {
                        return;
                    }
                    this.LIZIZ = true;
                } else {
                    if (LJFF2 != 2 || System.currentTimeMillis() - LJ(bubble2.bubbleId) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTimeY)) {
                        return;
                    }
                    this.LIZIZ = true;
                }
            }
        }

        public final long LJ(String str) {
            return C78580Usi.LIZIZ("_bubble_first_show_time_", str, this.LIZJ, 0L);
        }

        public final int LJFF(String str) {
            return i0.LIZJ("_bubble_show_num_", str, this.LIZJ, 0);
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            Bubble bubble = this.LIZ;
            if (bubble == null || !this.LIZIZ) {
                return false;
            }
            if (LJFF(bubble.bubbleId) != 0 && m0.LIZLLL("_pendant_is_click_", bubble.bubbleId, this.LIZJ, false)) {
                this.LIZIZ = false;
                return false;
            }
            if (i < bubble.showTimeVV) {
                return false;
            }
            String str = bubble.shortContent;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC249909rO.LJJIIZ(str);
            String str3 = bubble.bubbleId;
            this.LIZJ.storeInt(i0.LJFF("_bubble_show_num_", str3), LJFF(str3) + 1);
            if (LJ(str3) == 0) {
                this.LIZJ.storeLong(i0.LJFF("_bubble_first_show_time_", str3), System.currentTimeMillis());
            }
            this.LIZIZ = false;
            String str4 = bubble.LIZIZ;
            if (str4 != null && str4.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = bubble.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String valueOf = String.valueOf(bubble.bubbleType);
                if (valueOf != null) {
                    str2 = valueOf;
                }
                linkedHashMap.put("sub_type", str2);
                linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
            }
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
            Bubble bubble;
            if (o.LJ(str, "CLICK_DYNAMIC_PENDANT") && (bubble = this.LIZ) != null) {
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_pendant_is_click_");
                LIZ2.append(bubble.bubbleId);
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    }, new InterfaceC249899rN() { // from class: X.9sB
        public final Keva LIZ = Keva.getRepo("specact.pendant.bubble.BubbleManager");
        public Bubble LIZIZ;
        public boolean LIZJ;

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            Bubble bubble;
            String str;
            Bubble bubble2;
            String str2;
            Bubble bubble3 = hashMap.get(1);
            this.LIZIZ = bubble3;
            String str3 = null;
            if (bubble3 != null) {
                str3 = bubble3.bubbleId;
            }
            if (str3 == null || str3.length() == 0 || (bubble = this.LIZIZ) == null || (str = bubble.longContent) == null || str.length() == 0 || (bubble2 = this.LIZIZ) == null || (str2 = bubble2.shortContent) == null || str2.length() == 0) {
                this.LIZJ = false;
                return;
            }
            Bubble bubble4 = this.LIZIZ;
            if (bubble4 != null) {
                Keva keva = this.LIZ;
                o.LJIIIIZZ(keva, "keva");
                if (keva.getAll().size() > 1000) {
                    Keva keva2 = this.LIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    long j = keva2.getLong(JBR.LJFF(LIZ2, bubble4.bubbleId, "_bubble_last_show_time", LIZ2), 0L);
                    int LJ2 = LJ(bubble4);
                    boolean LJFF2 = LJFF(bubble4);
                    this.LIZ.clear();
                    Keva keva3 = this.LIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(bubble4.bubbleId);
                    LIZ3.append("_bubble_last_show_time");
                    keva3.storeInt(X1D.LIZIZ(LIZ3), LJ2);
                    Keva keva4 = this.LIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    keva4.storeLong(JBR.LJFF(LIZ4, bubble4.bubbleId, "_pendant_click_time", LIZ4), j);
                    Keva keva5 = this.LIZ;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(bubble4.bubbleId);
                    LIZ5.append("_pendant_click_time");
                    keva5.storeBoolean(X1D.LIZIZ(LIZ5), LJFF2);
                }
                int LJ3 = LJ(bubble4);
                if (LJ3 == 0) {
                    this.LIZJ = true;
                    return;
                }
                if (LJ3 != 1 || LJFF(bubble4)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Keva keva6 = this.LIZ;
                StringBuilder LIZ6 = X1D.LIZ();
                if (currentTimeMillis - keva6.getLong(JBR.LJFF(LIZ6, bubble4.bubbleId, "_bubble_last_show_time", LIZ6), 0L) <= TimeUnit.DAYS.toMillis(bubble4.showAgainTime)) {
                    return;
                }
                this.LIZJ = true;
            }
        }

        public final int LJ(Bubble bubble) {
            Keva keva = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(bubble.bubbleId);
            LIZ2.append("_bubble_show_num");
            return keva.getInt(X1D.LIZIZ(LIZ2), 0);
        }

        public final boolean LJFF(Bubble bubble) {
            Keva keva = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(bubble.bubbleId);
            LIZ2.append("_pendant_click_time");
            return keva.getBoolean(X1D.LIZIZ(LIZ2), false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        
            r13.LJJIJIIJIL(r1, r0, r5);
            r8 = LJ(r5);
            r6 = r12.LIZ;
            r3 = X.X1D.LIZ();
            r6.storeInt(X.JBR.LJFF(r3, r5.bubbleId, "_bubble_show_num", r3), r8 + 1);
            r6 = r12.LIZ;
            r3 = X.X1D.LIZ();
            r6.storeLong(X.JBR.LJFF(r3, r5.bubbleId, "_bubble_last_show_time", r3), java.lang.System.currentTimeMillis());
            r12.LIZJ = false;
            r0 = r5.LIZIZ;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        
            if (r0 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            if (r0.length() != 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        
            r6 = X.C247519nX.LIZ;
            r7 = r5.LIZ;
            r8 = new java.util.LinkedHashMap();
            r0 = java.lang.String.valueOf(r5.bubbleType);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r0 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            r4 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        
            r8.put("sub_type", r4);
            r8.put("vv_cnt", java.lang.String.valueOf(X.C247669nm.LIZ().LJLJJL));
            X.C247519nX.LJIIL(r6, r7, r8, null, null, 60);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
        
            r0 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        
            if (r0 != null) goto L24;
         */
        @Override // X.InterfaceC249899rN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LIZ(X.InterfaceC249909rO r13, int r14) {
            /*
                r12 = this;
                boolean r0 = r13.LJJIJIL()
                r2 = 1
                r7 = 0
                if (r0 != r2) goto Lb
                r12.LIZJ = r7
                return r7
            Lb:
                com.bytedance.touchpoint.core.model.Bubble r5 = r12.LIZIZ
                if (r5 == 0) goto L73
                boolean r0 = r12.LIZJ
                if (r0 == 0) goto L27
                int r0 = r12.LJ(r5)
                if (r0 == 0) goto L22
                boolean r0 = r12.LJFF(r5)
                if (r0 == 0) goto L22
                r12.LIZJ = r7
                return r7
            L22:
                int r0 = r5.showTimeVV
                if (r14 >= r0) goto L29
                return r7
            L27:
                r2 = 0
                goto L72
            L29:
                com.bytedance.touchpoint.core.model.Bubble r0 = r12.LIZIZ
                java.lang.String r4 = ""
                if (r0 == 0) goto La3
                java.lang.String r1 = r0.longContent
                if (r1 == 0) goto La3
            L33:
                java.lang.String r0 = r0.shortContent
                if (r0 == 0) goto La7
            L37:
                r13.LJJIJIIJIL(r1, r0, r5)
                int r8 = r12.LJ(r5)
                com.bytedance.keva.Keva r6 = r12.LIZ
                java.lang.StringBuilder r3 = X.X1D.LIZ()
                java.lang.String r1 = r5.bubbleId
                java.lang.String r0 = "_bubble_show_num"
                java.lang.String r1 = X.JBR.LJFF(r3, r1, r0, r3)
                int r0 = r8 + 1
                r6.storeInt(r1, r0)
                com.bytedance.keva.Keva r6 = r12.LIZ
                java.lang.StringBuilder r3 = X.X1D.LIZ()
                java.lang.String r1 = r5.bubbleId
                java.lang.String r0 = "_bubble_last_show_time"
                java.lang.String r3 = X.JBR.LJFF(r3, r1, r0, r3)
                long r0 = java.lang.System.currentTimeMillis()
                r6.storeLong(r3, r0)
                r12.LIZJ = r7
                java.lang.String r0 = r5.LIZIZ
                if (r0 == 0) goto L72
                int r0 = r0.length()
                if (r0 != 0) goto L74
            L72:
                r7 = r2
            L73:
                return r7
            L74:
                X.9nX r6 = X.C247519nX.LIZ
                int r7 = r5.LIZ
                java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                r8.<init>()
                int r0 = r5.bubbleType
                java.lang.String r0 = java.lang.String.valueOf(r0)
                if (r0 == 0) goto L86
                r4 = r0
            L86:
                java.lang.String r0 = "sub_type"
                r8.put(r0, r4)
                com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager r0 = X.C247669nm.LIZ()
                int r0 = r0.LJLJJL
                java.lang.String r1 = java.lang.String.valueOf(r0)
                java.lang.String r0 = "vv_cnt"
                r8.put(r0, r1)
                r9 = 0
                r11 = 60
                r10 = r9
                X.C247519nX.LJIIL(r6, r7, r8, r9, r10, r11)
                goto L72
            La3:
                r1 = r4
                if (r0 == 0) goto La7
                goto L33
            La7:
                r0 = r4
                goto L37
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C250399sB.LIZ(X.9rO, int):boolean");
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
            Bubble bubble;
            if (o.LJ(str, "CLICK_DYNAMIC_PENDANT") && (bubble = this.LIZIZ) != null) {
                Keva keva = this.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(bubble.bubbleId);
                LIZ2.append("_pendant_click_time");
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    }, new InterfaceC249899rN() { // from class: X.9sF
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.NewUserStaticLongBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(6);
            this.LIZ = bubble;
            if (bubble != null) {
                str = bubble.longContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                if (i0.LIZJ("_bubble_show_num_", bubble2.bubbleId, this.LIZJ, 0) >= bubble2.totalTimes) {
                    this.LIZIZ = false;
                    return;
                }
                int LIZIZ2 = C245559kN.LIZIZ();
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_bubble_last_show_time_");
                LIZ2.append(str2);
                if (LIZIZ2 - keva.getInt(X1D.LIZIZ(LIZ2), 0) > TimeUnit.DAYS.toSeconds(bubble2.showInterval)) {
                    this.LIZIZ = true;
                }
            }
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            Bubble bubble = this.LIZ;
            if (bubble == null || !this.LIZIZ || i < bubble.showTimeVV || interfaceC249909rO.LJJII()) {
                return false;
            }
            String str = bubble.longContent;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC249909rO.LJIILJJIL(str, "new_user_rewards", bubble);
            String str3 = bubble.bubbleId;
            this.LIZJ.storeInt(i0.LJFF("_bubble_show_num_", str3), i0.LIZJ("_bubble_show_num_", str3, this.LIZJ, 0) + 1);
            this.LIZJ.storeInt(i0.LJFF("_bubble_last_show_time_", str3), C245559kN.LIZIZ());
            this.LIZIZ = false;
            String str4 = bubble.LIZIZ;
            if (str4 != null && str4.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = bubble.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String valueOf = String.valueOf(bubble.bubbleType);
                if (valueOf != null) {
                    str2 = valueOf;
                }
                linkedHashMap.put("sub_type", str2);
                linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
            }
            return true;
        }
    }, new InterfaceC249899rN() { // from class: X.9sD
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.PendantClickTipBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return false;
        }

        public final long LJ() {
            String str;
            Keva keva = this.LIZJ;
            Bubble bubble = this.LIZ;
            if (bubble != null) {
                str = bubble.bubbleId;
            } else {
                str = null;
            }
            return keva.getLong(o.LJIILLIIL("_bubble_first_show_time", str), 0L);
        }

        public final int LJFF() {
            String str;
            Keva keva = this.LIZJ;
            Bubble bubble = this.LIZ;
            if (bubble != null) {
                str = bubble.bubbleId;
            } else {
                str = null;
            }
            return keva.getInt(o.LJIILLIIL("_bubble_show_num", str), 0);
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(4);
            this.LIZ = bubble;
            String str2 = null;
            if (bubble != null) {
                str = bubble.shortContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            if (this.LIZ != null) {
                int LJFF2 = LJFF();
                Keva keva = this.LIZJ;
                Bubble bubble2 = this.LIZ;
                if (bubble2 != null) {
                    str2 = bubble2.bubbleId;
                }
                boolean z = keva.getBoolean(o.LJIILLIIL("_pendant_is_click", str2), false);
                if (LJFF2 == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (z) {
                    return;
                }
                if (LJFF2 == 1) {
                    if (System.currentTimeMillis() - LJ() <= TimeUnit.DAYS.toMillis(r6.showAgainTimeX)) {
                        return;
                    }
                    this.LIZIZ = true;
                } else {
                    if (LJFF2 != 2 || System.currentTimeMillis() - LJ() <= TimeUnit.DAYS.toMillis(r6.showAgainTimeY)) {
                        return;
                    }
                    this.LIZIZ = true;
                }
            }
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            String str;
            String str2;
            Bubble bubble = this.LIZ;
            if (bubble == null || !this.LIZIZ) {
                return false;
            }
            String str3 = null;
            if (LJFF() != 0) {
                Keva keva = this.LIZJ;
                Bubble bubble2 = this.LIZ;
                if (bubble2 != null) {
                    str2 = bubble2.bubbleId;
                } else {
                    str2 = null;
                }
                if (keva.getBoolean(o.LJIILLIIL("_pendant_is_click", str2), false)) {
                    this.LIZIZ = false;
                    return false;
                }
            }
            if (i < bubble.showTimeVV || interfaceC249909rO.LJJII()) {
                return false;
            }
            String str4 = bubble.shortContent;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            interfaceC249909rO.LJJ(str4);
            int LJFF2 = LJFF();
            Keva keva2 = this.LIZJ;
            Bubble bubble3 = this.LIZ;
            if (bubble3 != null) {
                str = bubble3.bubbleId;
            } else {
                str = null;
            }
            keva2.storeInt(o.LJIILLIIL("_bubble_show_num", str), LJFF2 + 1);
            if (LJ() == 0) {
                Keva keva3 = this.LIZJ;
                Bubble bubble4 = this.LIZ;
                if (bubble4 != null) {
                    str3 = bubble4.bubbleId;
                }
                keva3.storeLong(o.LJIILLIIL("_bubble_first_show_time", str3), System.currentTimeMillis());
            }
            this.LIZIZ = false;
            String str6 = bubble.LIZIZ;
            if (str6 != null && str6.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = bubble.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String valueOf = String.valueOf(bubble.bubbleType);
                if (valueOf != null) {
                    str5 = valueOf;
                }
                linkedHashMap.put("sub_type", str5);
                linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
            }
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
            Bubble bubble;
            if (o.LJ(str, "CLICK_STATIC_PENDANT") && (bubble = this.LIZ) != null) {
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(bubble.bubbleId);
                LIZ2.append("_pendant_is_click");
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    }, new InterfaceC249899rN() { // from class: X.9sA
        public Bubble LIZ;
        public boolean LIZIZ;
        public final Keva LIZJ = Keva.getRepo("specact.pendant.bubble.StaticPendantLongBubble");

        @Override // X.InterfaceC249899rN
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZIZ(HashMap<Integer, Bubble> hashMap) {
            String str;
            Bubble bubble = hashMap.get(2);
            this.LIZ = bubble;
            if (bubble != null) {
                str = bubble.longContent;
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                this.LIZIZ = false;
                return;
            }
            Bubble bubble2 = this.LIZ;
            if (bubble2 != null) {
                int LJ2 = LJ(bubble2.bubbleId);
                boolean LIZLLL2 = m0.LIZLLL("_pendant_is_click_", bubble2.bubbleId, this.LIZJ, false);
                if (LJ2 == 0) {
                    this.LIZIZ = true;
                    return;
                }
                if (LIZLLL2 || LJ2 != 1) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = bubble2.bubbleId;
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_bubble_first_show_time_");
                LIZ2.append(str2);
                if (currentTimeMillis - keva.getLong(X1D.LIZIZ(LIZ2), 0L) <= TimeUnit.DAYS.toMillis(bubble2.showAgainTime)) {
                    return;
                }
                this.LIZIZ = true;
            }
        }

        public final int LJ(String str) {
            return i0.LIZJ("_bubble_show_num_", str, this.LIZJ, 0);
        }

        @Override // X.InterfaceC249899rN
        public final boolean LIZ(InterfaceC249909rO interfaceC249909rO, int i) {
            Bubble bubble = this.LIZ;
            if (bubble == null) {
                return false;
            }
            if (interfaceC249909rO.LJJIJIL()) {
                this.LIZIZ = false;
                return false;
            }
            if (LJ(bubble.bubbleId) != 0 && m0.LIZLLL("_pendant_is_click_", bubble.bubbleId, this.LIZJ, false)) {
                this.LIZIZ = false;
                return false;
            }
            if (interfaceC249909rO.LJIJ()) {
                this.LIZIZ = false;
                return false;
            }
            if (!this.LIZIZ || i < bubble.showTimeVV || interfaceC249909rO.LJJII()) {
                return false;
            }
            String str = bubble.longContent;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC249909rO.LJIILJJIL(str, "warmup_long_inform", bubble);
            String str3 = bubble.bubbleId;
            this.LIZJ.storeInt(i0.LJFF("_bubble_show_num_", str3), LJ(str3) + 1);
            if (C78580Usi.LIZIZ("_bubble_first_show_time_", str3, this.LIZJ, 0L) == 0) {
                this.LIZJ.storeLong(i0.LJFF("_bubble_first_show_time_", str3), System.currentTimeMillis());
            }
            this.LIZIZ = false;
            String str4 = bubble.LIZIZ;
            if (str4 != null && str4.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = bubble.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String valueOf = String.valueOf(bubble.bubbleType);
                if (valueOf != null) {
                    str2 = valueOf;
                }
                linkedHashMap.put("sub_type", str2);
                linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
                C247519nX.LJIIL(c247519nX, i2, linkedHashMap, null, null, 60);
            }
            return true;
        }

        @Override // X.InterfaceC249899rN
        public final void LIZLLL(String str, InterfaceC249909rO interfaceC249909rO) {
            Bubble bubble;
            if (o.LJ(str, "CLICK_STATIC_PENDANT") && (bubble = this.LIZ) != null) {
                Keva keva = this.LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_pendant_is_click_");
                LIZ2.append(bubble.bubbleId);
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    });
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C250359s7.LJLIL);
    public static List<Bubble> LJFF = new ArrayList();

    public static Bubble LIZ(int i, String taskId) {
        o.LJIIIZ(taskId, "taskId");
        switch (i) {
            case 7:
            case 9:
            case 10:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
                for (Bubble bubble : LJFF) {
                    if (bubble.bubbleType == i) {
                        return bubble;
                    }
                }
                return null;
            case 8:
            case 12:
                for (Bubble bubble2 : LJFF) {
                    if (bubble2.bubbleType == i && o.LJ(bubble2.taskKey, taskId)) {
                        return bubble2;
                    }
                }
                return null;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            default:
                return null;
        }
    }

    public static void LIZIZ(Bubble bubble, String str) {
        String str2;
        if (bubble == null || (str2 = bubble.LIZIZ) == null || str2.length() == 0) {
            return;
        }
        C247519nX c247519nX = C247519nX.LIZ;
        int i = bubble.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String valueOf = String.valueOf(bubble.bubbleType);
        String str3 = "";
        if (valueOf == null) {
            valueOf = "";
        }
        linkedHashMap.put("sub_type", valueOf);
        linkedHashMap.put("click_position", str);
        linkedHashMap.put("vv_cnt", String.valueOf(C247669nm.LIZ().LJLJJL));
        String str4 = bubble.taskKey;
        if (str4 != null) {
            str3 = str4;
        }
        linkedHashMap.put("task_key", str3);
        C247519nX.LJIIIZ(c247519nX, i, linkedHashMap, null, null, 28);
    }
}
