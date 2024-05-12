package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.VEAudioFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HyU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45814HyU {
    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, "title_key"}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "4752497484437973656"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, null, null, "title_key");
    }

    public static MusicModel LIZ(File file) {
        int i;
        Integer duration;
        String extractMusicThumbDir = AVExternalServiceImpl.LIZ().infoService().getExtractMusicThumbDir();
        MusicModel musicModel = new MusicModel();
        int i2 = -C94J.LIZ(file.length(), file.getPath(), "", "");
        musicModel.setLocalMusicId(i2);
        musicModel.setId(i2);
        musicModel.setMusicId(String.valueOf(i2));
        musicModel.setName(OR7.LLLIL(file));
        musicModel.setLocalPath(file.getPath());
        IAVVESDKService vesdkService = AVExternalServiceImpl.LIZ().vesdkService();
        String path = file.getPath();
        o.LJIIIIZZ(path, "audioFile.path");
        VEAudioFileInfo audioFileInfo = vesdkService.getAudioFileInfo(path);
        if (audioFileInfo != null && (duration = audioFileInfo.getDuration()) != null) {
            i = duration.intValue();
        } else {
            i = 0;
        }
        musicModel.setDuration(i);
        musicModel.setLocalMusicDuration(musicModel.getDuration());
        musicModel.setMusicStatus(1);
        musicModel.setMusicType(MusicModel.MusicType.VIDEO_EXTRACT);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(extractMusicThumbDir);
        LIZ.append('/');
        LIZ.append(OR7.LLLIL(file));
        LIZ.append(".jpg");
        musicModel.setLocalThumbPath(X1D.LIZIZ(LIZ));
        musicModel.setDataType(1);
        musicModel.setDateLastModified(Long.valueOf(file.lastModified()));
        return musicModel;
    }

    public static List LIZJ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "musicModelList");
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            LJ.add(new C84934XVa(0, (MusicModel) ListProtector.get(list, i), 12));
        }
        return LJ;
    }

    public static boolean LIZLLL(Context context, android.net.Uri uri) {
        o.LJIIIZ(context, "context");
        boolean z = false;
        if (!C268613q.LJIIJJI(context, uri)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Cursor LIZIZ = LIZIZ(context.getContentResolver(), uri, new String[]{"is_trashed"});
            if (LIZIZ != null) {
                try {
                    if (LIZIZ.moveToFirst()) {
                        if (LIZIZ.getInt(LIZIZ.getColumnIndex("is_trashed")) != 1) {
                            z = true;
                        }
                        AnonymousClass636.LJFF(LIZIZ, null);
                        return z;
                    }
                    AnonymousClass636.LJFF(LIZIZ, null);
                } finally {
                }
            }
        }
        return true;
    }

    public static XKQ LJ(Context context, InterfaceC43955HMx interfaceC43955HMx, boolean z, int i, int i2) {
        o.LJIIIZ(context, "context");
        return XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C45812HyS(z, context, i, i2, interfaceC43955HMx, null), 2);
    }
}
