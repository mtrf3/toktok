package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C221108m2;
import X.C2WO;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.L77;
import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class FriendsTabTopExperiment {
    public static final FriendsTabTopConfig LIZ = new FriendsTabTopConfig(-1);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L77.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C2WO.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0.booleanValue() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment.FriendsTabTopConfig LIZ() {
        /*
            boolean r0 = X.C40471FuV.LIZ()
            if (r0 != 0) goto L10
        L7:
            X.Ol8 r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment$FriendsTabTopConfig r0 = (com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment.FriendsTabTopConfig) r0
            return r0
        L10:
            java.lang.Boolean r0 = X.C53765L8f.LJ
            if (r0 == 0) goto L1d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7
        L1a:
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment$FriendsTabTopConfig r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment.LIZ
            return r0
        L1d:
            com.ss.android.ugc.aweme.experiment.TabConfig r0 = X.C53765L8f.LJIIIZ()
            r6 = 0
            if (r0 == 0) goto L7c
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.experiment.BottomTab>> r5 = r0.bottomTab
        L26:
            r4 = 0
        L27:
            if (r5 == 0) goto L76
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.Object r0 = r5.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L76
            java.util.Iterator r3 = r0.iterator()
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.experiment.BottomTab r2 = (com.ss.android.ugc.aweme.experiment.BottomTab) r2
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "feedTabPlatformHasFriendsTab:  "
            r1.append(r0)
            if (r2 == 0) goto L74
            java.lang.String r0 = r2.bottomTabKey
        L52:
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            if (r2 == 0) goto L72
            java.lang.String r1 = r2.bottomTabKey
        L61:
            X.L9w r0 = X.EnumC53808L9w.FRIENDS
            java.lang.String r0 = r0.getKey()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C53765L8f.LJ = r0
            goto L1a
        L72:
            r1 = r6
            goto L61
        L74:
            r0 = r6
            goto L52
        L76:
            int r4 = r4 + 1
            r0 = 5
            if (r4 >= r0) goto L7e
            goto L27
        L7c:
            r5 = r6
            goto L26
        L7e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C53765L8f.LJ = r0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment.LIZ():com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment$FriendsTabTopConfig");
    }

    /* loaded from: classes7.dex */
    public static final class FriendsTabTopConfig {

        @InterfaceC65349Pkn("index_on_the_top")
        public final int indexOnTop;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FriendsTabTopConfig) && this.indexOnTop == ((FriendsTabTopConfig) obj).indexOnTop;
        }

        public final int hashCode() {
            return this.indexOnTop;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendsTabTopConfig(indexOnTop=");
            return b0.LIZJ(LIZ, this.indexOnTop, ')', LIZ);
        }

        public FriendsTabTopConfig(int i) {
            this.indexOnTop = i;
        }
    }

    public static boolean LIZIZ() {
        if (((Number) LIZJ.getValue()).intValue() >= 0) {
            return true;
        }
        return false;
    }
}
