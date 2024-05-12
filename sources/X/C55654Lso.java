package X;

import com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent;

/* renamed from: X.Lso, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55654Lso extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ MixVideoDetailPageComponent LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55654Lso(MixVideoDetailPageComponent mixVideoDetailPageComponent) {
        super(1);
        this.LJLIL = mixVideoDetailPageComponent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, r2) == false) goto L23;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = X.C228118xL.LIZJ()
            if (r0 != 0) goto Lc
            boolean r0 = X.C228118xL.LIZ()
            if (r0 == 0) goto Lb8
        Lc:
            X.Lsr r7 = X.C55657Lsr.LIZ
            com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent r0 = r8.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLFZ
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.PlayListInfo r0 = r0.playlist_info
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getMixId()
            if (r0 != 0) goto L20
        L1e:
            java.lang.String r0 = ""
        L20:
            java.lang.String r2 = X.C55657Lsr.LIZ(r0)
            int r0 = r2.length()
            r6 = 1
            r1 = 0
            if (r0 != 0) goto L6c
            r0 = 1
        L2d:
            r5 = 0
            if (r0 != 0) goto L40
            com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent r0 = r8.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLFZ
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getAid()
        L3a:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L50
        L40:
            com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent r0 = r8.LJLIL
            X.Ol8 r0 = r0.LLIILII
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment r0 = (com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment) r0
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r0 = r0.dm()
            r0.LJLJLJ = r1
        L50:
            com.ss.android.ugc.aweme.mix.platform.MixVideoDetailPageComponent r0 = r8.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LLFZ
            if (r1 == 0) goto Lb8
            com.ss.android.ugc.aweme.feed.model.PlayListInfo r0 = r1.playlist_info
            if (r0 == 0) goto L68
            java.lang.String r4 = r0.getMixId()
        L5e:
            java.lang.String r3 = r1.getAid()
            if (r4 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            monitor-enter(r7)
            goto L6e
        L68:
            r4 = r5
            goto L5e
        L6a:
            r0 = r5
            goto L3a
        L6c:
            r0 = 0
            goto L2d
        L6e:
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r2 = X.C55657Lsr.LIZJ     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto L7c
            X.Lss r2 = X.C55658Lss.LJFF     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "failed"
            java.lang.String r0 = "watch history doesn't exist"
            r2.LJIILLIIL(r4, r1, r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        L7c:
            java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L87
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r7)
            goto Lb8
        L87:
            int r1 = r2.size()     // Catch: java.lang.Throwable -> Lb4
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto La7
            if (r2 == 0) goto Lb7
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto La7
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != r6) goto La7
            r1.next()     // Catch: java.lang.Throwable -> Lb4
            r1.remove()     // Catch: java.lang.Throwable -> Lb4
        La7:
            if (r2 == 0) goto Lb7
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lb4
            X.Lss r1 = X.C55658Lss.LJFF     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "success"
            r1.LJIILLIIL(r4, r0, r5)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lb7:
            monitor-exit(r7)
        Lb8:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55654Lso.invoke(java.lang.Object):java.lang.Object");
    }
}
