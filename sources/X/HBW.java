package X;

import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.library.LibraryMaterialProvider;
import com.ss.android.ugc.aweme.library.LibraryMaterialType;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBW {
    /* JADX WARN: Multi-variable type inference failed */
    public static LibraryMaterialInfoSv LIZIZ(LibraryMaterialInfo data) {
        Integer num;
        o.LJIIIZ(data, "data");
        String id = data.getId();
        String materialName = data.getMaterialName();
        LibraryMaterialProvider materialProvider = data.getMaterialProvider();
        Integer num2 = null;
        if (materialProvider != null) {
            num = Integer.valueOf(materialProvider.getProvider());
        } else {
            num = null;
        }
        LibraryMaterialType materialType = data.getMaterialType();
        if (materialType != null) {
            num2 = Integer.valueOf(materialType.getType());
        }
        boolean z = false;
        return new LibraryMaterialInfoSv(id, materialName, num, num2, data.getCover(), data.getPreview(), data.getUsedCount(), data.getStartTime(), data.getEndTime(), data.getAuthor(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 130048, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LibraryMaterialInfoSv LIZ(MediaModel videoInfo, boolean z) {
        int i;
        o.LJIIIZ(videoInfo, "videoInfo");
        String str = videoInfo.id;
        if (o.LJ(videoInfo.mediaSource, "toptiktok")) {
            i = 2;
        } else {
            i = 1;
        }
        int i2 = videoInfo.type;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    i2 = 1;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        String str2 = videoInfo.thumbnail;
        String str3 = videoInfo.fileName;
        long j = videoInfo.startTime;
        long j2 = videoInfo.endTime;
        return new LibraryMaterialInfoSv(str, str3, Integer.valueOf(i), Integer.valueOf(i2), null, str2, 1L, Long.valueOf(j), Long.valueOf(j2), videoInfo.userName, videoInfo.fileLocalUriPath, null == true ? 1 : 0, null == true ? 1 : 0, false, z, Integer.valueOf(videoInfo.width), Integer.valueOf(videoInfo.height), 14352, null == true ? 1 : 0);
    }
}
