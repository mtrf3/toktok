package X;

import com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig;

/* renamed from: X.McS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57188McS {
    public static final MusicCapsuleConfig LIZ;

    static {
        MusicCapsuleConfig musicCapsuleConfig = new MusicCapsuleConfig(0, 0, 0L, 0, 0L, 0.0f, 0.0f, 127, null);
        FFL.LJIIIZ().getClass();
        MusicCapsuleConfig musicCapsuleConfig2 = (MusicCapsuleConfig) FFL.LJIJ(true, "music_capsule_config", 31744, MusicCapsuleConfig.class, musicCapsuleConfig);
        if (musicCapsuleConfig2 != null) {
            musicCapsuleConfig = musicCapsuleConfig2;
        }
        LIZ = musicCapsuleConfig;
    }

    public static boolean LIZ() {
        if (LIZ.leftStrategy == 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        int i = LIZ.rightStrategy;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig r0 = X.C57188McS.LIZ
            int r1 = r0.rightStrategy
            r0 = 2
            if (r1 != r0) goto L63
            r2 = 0
            if (r3 != 0) goto L41
        La:
            r1 = 0
        Lb:
            com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig r0 = X.C57188McS.LIZ
            float r0 = r0.musicCoverThreshold
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1d
            if (r3 != 0) goto L1f
        L15:
            com.ss.android.ugc.aweme.feed.assem.music.MusicCapsuleConfig r0 = X.C57188McS.LIZ
            float r0 = r0.musicShootThreshold
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L63
        L1d:
            r0 = 1
            return r0
        L1f:
            com.ss.android.ugc.aweme.feed.model.Preload r0 = r3.getPreload()     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L15
            java.lang.String r1 = r0.predictConfig     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            com.google.gson.o r0 = new com.google.gson.o     // Catch: java.lang.Exception -> L15
            r0.<init>()     // Catch: java.lang.Exception -> L15
            com.google.gson.j r0 = com.google.gson.o.LIZ(r1)     // Catch: java.lang.Exception -> L15
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = "single_song_publish"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L15
            float r2 = r0.LJIIJ()     // Catch: java.lang.Exception -> L15
            goto L15
        L41:
            com.ss.android.ugc.aweme.feed.model.Preload r0 = r3.getPreload()     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            java.lang.String r1 = r0.predictConfig     // Catch: java.lang.Exception -> La
            if (r1 == 0) goto La
            com.google.gson.o r0 = new com.google.gson.o     // Catch: java.lang.Exception -> La
            r0.<init>()     // Catch: java.lang.Exception -> La
            com.google.gson.j r0 = com.google.gson.o.LIZ(r1)     // Catch: java.lang.Exception -> La
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> La
            java.lang.String r0 = "cover"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> La
            float r1 = r0.LJIIJ()     // Catch: java.lang.Exception -> La
            goto Lb
        L63:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57188McS.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if (android.text.TextUtils.equals(r1.getOwnerId(), r3.getUid()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        if (r3.LJJIJ(r1, r8, false, r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r7, android.content.Context r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57188McS.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, java.lang.Integer):boolean");
    }
}
