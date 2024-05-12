package X;

import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPublishStruct;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class TFI<T> implements InterfaceC64592gB {
    public static final TFI<T> LJLIL = new TFI<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ArrayList<StickerPublishStruct> stickerList;
        StickerPermissionResponse stickerPermissionResponse = (StickerPermissionResponse) obj;
        if (stickerPermissionResponse.status_code != 0 || (stickerList = stickerPermissionResponse.getStickerList()) == null || stickerList.isEmpty()) {
            return;
        }
        Iterator<StickerPublishStruct> it = stickerList.iterator();
        while (it.hasNext()) {
            StickerPublishStruct next = it.next();
            if (next != null && next.getStickerType() == 10) {
                new C158416Jp().LIZ.storeBoolean("is_has_live_cd_permission", true);
                return;
            }
        }
    }
}
