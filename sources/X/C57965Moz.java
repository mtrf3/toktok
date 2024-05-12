package X;

/* renamed from: X.Moz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57965Moz extends AbstractC57990MpO {
    public static final C57965Moz LIZ = new C57965Moz();

    public final String toString() {
        return "Append";
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0021, code lost:
    
        if (r8 != null) goto L9;
     */
    @Override // X.AbstractC57990MpO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C57971Mp5 LIZ(X.C57971Mp5 r8, X.C57971Mp5 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "nextPage"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r8 == 0) goto L1c
            X.Mlu<com.ss.android.ugc.aweme.relation.model.RecUser> r0 = r8.LIZIZ
            if (r0 == 0) goto L1c
            java.util.List r0 = X.C57964Moy.LIZIZ(r0)
            if (r0 == 0) goto L1c
            java.util.List r3 = X.ORZ.LLJILJILJ(r0)
        L15:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L24
        L1b:
            return r9
        L1c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r8 == 0) goto L1b
            goto L15
        L24:
            X.Mlu<com.ss.android.ugc.aweme.relation.model.RecUser> r4 = r9.LIZIZ
            boolean r0 = r4 instanceof X.C57777Mlx
            if (r0 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L34
            r2.add(r0)
            goto L34
        L4a:
            java.util.Set r6 = X.ORZ.LLJJ(r2)
            java.util.List r0 = X.C57964Moy.LIZIZ(r4)
            if (r0 != 0) goto L56
            X.OQg r0 = X.C61878OQg.INSTANCE
        L56:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getUid()
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L5f
            r5.add(r1)
            goto L5f
        L7a:
            java.util.Iterator r2 = r5.iterator()
        L7e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r1 = r0.getMatchedFriendStruct()
            if (r1 != 0) goto L91
            goto L7e
        L91:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setNewMaF(r0)
            goto L7e
        L97:
            r3.addAll(r5)
            boolean r0 = r4 instanceof X.C57983MpH
            r2 = 0
            if (r0 == 0) goto La7
            X.MpH r4 = (X.C57983MpH) r4
            P r1 = r4.LIZJ
            boolean r0 = r1 instanceof X.C57967Mp1
            if (r0 != 0) goto Lb9
        La7:
            X.Mlw r2 = X.C57775Mlv.LIZ(r3)
        Lab:
            X.Mp6 r1 = r9.LIZ
            java.lang.String r0 = "loadContext"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.Mp5 r8 = new X.Mp5
            r8.<init>(r1, r2)
            goto L2a
        Lb9:
            if (r1 == 0) goto La7
            X.MpH r2 = X.C57775Mlv.LIZLLL(r2, r1, r3)
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57965Moz.LIZ(X.Mp5, X.Mp5):X.Mp5");
    }
}
