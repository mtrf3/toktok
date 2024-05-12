package X;

import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87083bM {
    public static final java.util.Map<Integer, C87113bP> LIZ = new LinkedHashMap();
    public static final java.util.Set<Long> LIZIZ = new LinkedHashSet();

    public static void LIZIZ(VideoSticker videoSticker) {
        Long videoStickerId;
        if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
            long longValue = videoStickerId.longValue();
            Integer haveFavorite = videoSticker.getHaveFavorite();
            if (haveFavorite != null) {
                int intValue = haveFavorite.intValue();
                if (intValue == EnumC87173bV.FAVORITE.getStatus()) {
                    LIZIZ.add(Long.valueOf(longValue));
                } else {
                    if (intValue != EnumC87173bV.NOT_FAVORITE.getStatus()) {
                        return;
                    }
                    LIZIZ.remove(Long.valueOf(longValue));
                }
            }
        }
    }

    public static void LIZ(int i, long j, List data, boolean z) {
        o.LJIIIZ(data, "data");
        java.util.Map<Integer, C87113bP> map = LIZ;
        C87113bP c87113bP = (C87113bP) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (c87113bP == null) {
            c87113bP = new C87113bP(0);
        }
        c87113bP.LJLJJI.addAll(data);
        Integer valueOf = Integer.valueOf(i);
        long j2 = c87113bP.LJLIL;
        if (j2 == -1) {
            j2 = NetworkUtils.getServerTimeMills();
        }
        List<C87123bQ> data2 = c87113bP.LJLJJI;
        o.LJIIIZ(data2, "data");
        map.put(valueOf, new C87113bP(j2, z, j, data2));
    }
}
