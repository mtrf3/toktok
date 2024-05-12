package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HkT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44945HkT implements InterfaceC45001HlN {
    public final /* synthetic */ C46193IAz LIZ;

    public C44945HkT(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC45001HlN
    public final List<IB3> LIZ(Intent data) {
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            C46193IAz c46193IAz = this.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(parcelableArrayListExtra, 10));
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                String str = mediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str, "it.fileLocalUriPath");
                long j = mediaModel.duration;
                int LLLFZ = c46193IAz.LLLFZ(mediaModel.type);
                String str2 = mediaModel.id;
                o.LJIIIIZZ(str2, "it.id");
                String str3 = mediaModel.userName;
                if (str3 == null) {
                    str3 = "GIPHY";
                }
                arrayList.add(new IB3(LLLFZ, str, str2, j, str3, "media_gallery"));
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC45001HlN
    public final Bundle LIZIZ(C44946HkU c44946HkU) {
        Bundle bundle = new Bundle();
        C46193IAz c46193IAz = this.LIZ;
        boolean z = false;
        if (c44946HkU != null && c44946HkU.LJLJI) {
            z = true;
        }
        if (z) {
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_support_flag", 2);
            List<String> list = c44946HkU.LJLIL;
            if (list != null && (!list.isEmpty())) {
                bundle.putStringArrayList("key_selected_video_path", (ArrayList) list);
            }
            bundle.putBoolean("sticker_support_multi_photos", true);
            bundle.putInt("key_photo_select_min_count", c44946HkU.LJLJJI);
            bundle.putInt("key_photo_select_max_count", c44946HkU.LJLJJL);
            bundle.putString("key_mv_hint_text", c46193IAz.LJLIL.getString(R.string.i_q));
        } else {
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_support_flag", 1);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
        }
        bundle.putParcelable("key_short_video_context", c46193IAz.LLIIJLIL);
        bundle.putInt("upload_photo_min_height", 480);
        bundle.putInt("upload_photo_min_width", 360);
        return bundle;
    }
}
