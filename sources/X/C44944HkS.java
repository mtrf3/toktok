package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HkS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44944HkS implements InterfaceC45001HlN {
    @Override // X.InterfaceC45001HlN
    public final List<IB3> LIZ(Intent data) {
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(parcelableArrayListExtra, 10));
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                String str = mediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str, "it.fileLocalUriPath");
                arrayList.add(new IB3(str, 0, mediaModel.duration, 60));
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC45001HlN
    public final Bundle LIZIZ(C44946HkU c44946HkU) {
        Bundle LIZLLL = C1DG.LIZLLL("key_choose_scene", 3, "key_photo_select_min_count", 1);
        LIZLLL.putInt("key_photo_select_max_count", 1);
        LIZLLL.putInt("upload_photo_min_height", 480);
        LIZLLL.putInt("upload_photo_min_width", 360);
        LIZLLL.putInt("key_support_flag", 1);
        return LIZLLL;
    }
}
