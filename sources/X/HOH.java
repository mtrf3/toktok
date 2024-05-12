package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.gamora.editor.music.stream.MusicStreamServiceImpl;
import com.ss.android.vesdk.VEUtils;
import java.util.HashMap;
import ujb.o;

/* loaded from: classes8.dex */
public final class HOH {
    public static final HashMap<String, Integer> LIZ = new HashMap<>();

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|8|(3:21|22|(5:24|11|15|16|17))|10|11|15|16|17) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.String r5) {
        /*
            boolean r0 = LJFF(r5)
            r3 = -1
            if (r0 == 0) goto Le
            boolean r0 = X.C53235Kut.LIZ()
            if (r0 == 0) goto Le
            return r3
        Le:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r4 = 0
            if (r5 == 0) goto L46
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            java.lang.String r0 = "EXTERNAL_CONTENT_URI.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            boolean r1 = ujb.o.LJJJLIIL(r5, r1, r4)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            r0 = 1
            if (r1 != r0) goto L46
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r4)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            X.5UD r0 = r0.getApplicationService()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            X.Hlz r0 = (X.C45039Hlz) r0     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            r0.getClass()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            com.ss.android.ugc.aweme.app.host.AwemeHostApplication r1 = X.FKM.LIZ()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            java.lang.String r0 = "get().getService(IAVServ…cationService.application"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            r2.setDataSource(r1, r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            goto L49
        L46:
            r2.setDataSource(r5)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
        L49:
            r0 = 9
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            float r0 = r0.floatValue()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            int r3 = (int) r0     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L66
            goto L5d
        L59:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L66
        L5d:
            r2.release()     // Catch: java.lang.Exception -> L61
            goto L65
        L61:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L65:
            return r3
        L66:
            r1 = move-exception
            r2.release()     // Catch: java.lang.Exception -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HOH.LIZJ(java.lang.String):int");
    }

    public static String LIZLLL(AVMusic aVMusic) {
        if (aVMusic == null || TextUtils.isEmpty(aVMusic.getPath())) {
            return null;
        }
        if (aVMusic.isLocalMusic()) {
            return aVMusic.path;
        }
        return C60903NvH.LJIIJJI().LJJIJ().LJJ(aVMusic);
    }

    public static boolean LJFF(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (o.LJJJLIIL(str, "http://", false) || o.LJJJLIIL(str, "https://", false)) {
            return true;
        }
        return false;
    }

    public static final String LJI(String str) {
        XUM LIZ2;
        String LIZIZ;
        if (!LJFF(str) || !C53235Kut.LIZ() || (LIZ2 = MusicStreamServiceImpl.LIZIZ().LIZ()) == null || (LIZIZ = LIZ2.LIZIZ(str)) == null) {
            return str;
        }
        return LIZIZ;
    }

    public static final int LIZ(int i, String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        HashMap<String, Integer> hashMap = LIZ;
        Integer num = hashMap.get(str);
        if (num != null && num.intValue() > 0) {
            return num.intValue();
        }
        if (C53235Kut.LIZ() && i > 0) {
            return i;
        }
        String LJI = LJI(str);
        if (LJI == null || LJI.length() == 0) {
            return 0;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(LJI, iArr);
        if (audioFileInfo == 0) {
            valueOf = Integer.valueOf(iArr[3]);
        } else {
            if (C53235Kut.LIZ()) {
                return 0;
            }
            C170666ms.LIZIZ(KMP.LJ("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ", audioFileInfo));
            valueOf = Integer.valueOf(C78934UyQ.LJLIL.getMusicService().getMusicDuration(str));
        }
        hashMap.put(str, valueOf);
        return valueOf.intValue();
    }

    public static /* synthetic */ int LIZIZ(int i, String str) {
        int i2;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        return LIZ(i2, str);
    }

    public static int LJ(AVMusic musicModel, String path) {
        int i;
        Integer valueOf;
        kotlin.jvm.internal.o.LJIIIZ(musicModel, "musicModel");
        kotlin.jvm.internal.o.LJIIIZ(path, "path");
        HashMap<String, Integer> hashMap = LIZ;
        Integer num = hashMap.get(path);
        if (num != null && num.intValue() > 0) {
            i = num.intValue();
        } else if (C53235Kut.LIZ() && musicModel.getDuration() > 0) {
            i = musicModel.getDuration();
        } else {
            String LJI = LJI(path);
            if (LJI == null || LJI.length() == 0) {
                i = 0;
            } else {
                int[] iArr = new int[10];
                if (VEUtils.getAudioFileInfo(LJI, iArr) == 0) {
                    valueOf = Integer.valueOf(iArr[3]);
                } else {
                    valueOf = Integer.valueOf(musicModel.getDuration());
                }
                hashMap.put(path, valueOf);
                i = valueOf.intValue();
            }
        }
        int shootDuration = musicModel.getShootDuration();
        if (shootDuration > 0 && Math.abs(i - shootDuration) >= 1000) {
            return shootDuration;
        }
        return i;
    }
}
