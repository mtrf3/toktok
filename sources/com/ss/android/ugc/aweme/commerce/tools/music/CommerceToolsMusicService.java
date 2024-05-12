package com.ss.android.ugc.aweme.commerce.tools.music;

import X.C41453GOr;
import X.C58096Mr6;
import X.C76800UCe;
import X.GF0;
import X.H93;
import X.InterfaceC42491Glz;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsMusicService implements ICommerceToolsMusicService {
    public static final H93 LJLILLLLZI = new H93();
    public AVMusic LJLIL;

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public boolean U40() {
        return C41453GOr.LIZJ();
    }

    public static ICommerceToolsMusicService LIZIZ(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsMusicService.class, z);
        if (LIZ != null) {
            return (ICommerceToolsMusicService) LIZ;
        }
        if (C58096Mr6.LLLII == null) {
            synchronized (ICommerceToolsMusicService.class) {
                if (C58096Mr6.LLLII == null) {
                    C58096Mr6.LLLII = new CommerceToolsMusicService();
                }
            }
        }
        return C58096Mr6.LLLII;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public GF0 KH(InterfaceC42491Glz depend) {
        o.LJIIIZ(depend, "depend");
        return new CommerceMusicPublishModule(depend);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0.invoke().booleanValue() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.AVMusic r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r0 = r9.isOriginalSound()
            if (r0 != 0) goto Lf
            boolean r0 = r9.isCommerceMusic()
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            X.H92 r1 = X.H92.LJLIL
            r1.getClass()
            X.Pro<java.lang.Boolean> r0 = X.H92.LJLLLLLL
            if (r0 == 0) goto L95
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L95
        L26:
            boolean r0 = r1.getInCommercialSoundPage()
            java.lang.String r3 = "action_originated_from"
            java.lang.String r4 = "music_from_section"
            java.lang.String r5 = "category_id"
            java.lang.String r6 = "music_id"
            if (r0 == 0) goto L65
            X.7au r7 = new X.7au
            r7.<init>()
            long r0 = r9.id
            r7.LJ(r0, r6)
            java.lang.String r0 = r9.getCategoryID()
            r7.LJIIIZ(r5, r0)
            java.lang.String r0 = "is_ba"
            r7.LIZLLL(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = r9.getFromSection()
            java.lang.String r0 = r0.value
            r7.LJIIIZ(r4, r0)
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.H92.LIZ()
            java.lang.String r0 = r0.toString()
            r7.LJIIIZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.LIZ
            java.lang.String r0 = "ttba_csp_use_non_commercial_music_exception"
            X.FMX.LJIIL(r0, r1)
        L65:
            if (r2 == 0) goto Lf
            X.7au r2 = new X.7au
            r2.<init>()
            long r0 = r9.id
            r2.LJ(r0, r6)
            java.lang.String r0 = r9.getCategoryID()
            r2.LJIIIZ(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = r9.getFromSection()
            java.lang.String r0 = r0.value
            r2.LJIIIZ(r4, r0)
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.H92.LIZ()
            java.lang.String r0 = r0.toString()
            r2.LJIIIZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ttba_ba_use_non_commercial_music_exception"
            X.FMX.LJIIL(r0, r1)
            goto Lf
        L95:
            r2 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.LIZJ(com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }

    private final void LJ(AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AVMusic aVMusic2;
        if (aVMusic != null && (aVMusic2 = this.LJLIL) != null && aVMusic.id == aVMusic2.id) {
            return;
        }
        interfaceC65784Pro.invoke();
        this.LJLIL = aVMusic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        if (r6 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.shortvideo.AVMusic r8, java.lang.Integer r9) {
        /*
            r7 = this;
            X.H92 r3 = X.H92.LJLIL
            boolean r0 = X.C59406NTe.LJIIIIZZ()
            if (r0 == 0) goto L18
            r3.getClass()
            X.HCm r2 = X.H92.LJLLL
            X.TBo<java.lang.Object>[] r1 = X.H92.LJLILLLLZI
            r0 = 10
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.LIZIZ(r1, r0)
        L18:
            boolean r6 = r3.getInCommercialSoundPage()
            r3 = 1
            if (r6 == 0) goto Lb4
            if (r8 == 0) goto Lb4
            r5 = 1
        L22:
            if (r9 == 0) goto L27
            X.H92.LJI(r9)
        L27:
            X.C42478Glm.LJFF = r5
            r0 = 0
            if (r5 == 0) goto Lb2
            X.HCm r4 = X.H92.LJLJJLL
            X.TBo<java.lang.Object>[] r2 = X.H92.LJLILLLLZI
            r1 = 3
            r1 = r2[r1]
            java.lang.Object r1 = r4.LIZ(r1)
            java.lang.String r1 = (java.lang.String) r1
        L39:
            X.C42478Glm.LIZ = r1
            if (r5 == 0) goto Lb0
            X.HCm r4 = X.H92.LJLJLLL
            X.TBo<java.lang.Object>[] r2 = X.H92.LJLILLLLZI
            r1 = 6
            r1 = r2[r1]
            java.lang.Object r1 = r4.LIZ(r1)
            java.lang.String r1 = (java.lang.String) r1
        L4a:
            X.C42478Glm.LIZLLL = r1
            if (r5 == 0) goto Lae
            X.HCm r4 = X.H92.LJLJLJ
            X.TBo<java.lang.Object>[] r2 = X.H92.LJLILLLLZI
            r1 = 5
            r1 = r2[r1]
            java.lang.Object r1 = r4.LIZ(r1)
            java.lang.String r1 = (java.lang.String) r1
        L5b:
            X.C42478Glm.LIZJ = r1
            if (r5 == 0) goto Lac
            java.lang.String r1 = X.H92.LIZIZ()
        L63:
            X.C42478Glm.LIZIZ = r1
            if (r5 == 0) goto L74
            X.HCm r2 = X.H92.LJLL
            X.TBo<java.lang.Object>[] r1 = X.H92.LJLILLLLZI
            r0 = 7
            r0 = r1[r0]
            java.lang.Object r0 = r2.LIZ(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L74:
            X.C42478Glm.LJ = r0
            if (r6 == 0) goto La9
            if (r8 == 0) goto L9c
            boolean r0 = r8.isCommerceMusic()
            if (r0 != 0) goto L85
            java.lang.String r0 = "non-commercial music appears in Commercial Sound Page"
            X.C78983UzD.LJIILL(r0)
        L85:
            X.H97 r0 = X.H92.LIZJ()
            if (r0 != 0) goto L9c
            com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin r0 = X.H92.LIZ()
            int[] r1 = X.H9B.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto La3
            r0 = 2
            if (r1 == r0) goto L9d
        L9c:
            return
        L9d:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.FromSection.CHALLENGE
            r8.setFromSection(r0)
            goto L9c
        La3:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$FromSection r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.FromSection.EFFECT
            r8.setFromSection(r0)
            goto L9c
        La9:
            if (r8 == 0) goto L9c
            goto L85
        Lac:
            r1 = r0
            goto L63
        Lae:
            r1 = r0
            goto L5b
        Lb0:
            r1 = r0
            goto L4a
        Lb2:
            r1 = r0
            goto L39
        Lb4:
            r5 = 0
            if (r6 == 0) goto L27
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.LJFF(com.ss.android.ugc.aweme.shortvideo.AVMusic, java.lang.Integer):void");
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    public void iq(AVMusic aVMusic, Integer num) {
        LJ(aVMusic, new AqS96S0300000_7(this, aVMusic, num, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.isCommerceMusic() != true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0128, code lost:
    
        r5 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0126, code lost:
    
        if (r7 == false) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    @Override // com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> wh0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, java.lang.String... r10) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService.wh0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String[]):java.util.Map");
    }
}
