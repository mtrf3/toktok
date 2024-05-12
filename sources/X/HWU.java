package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.sticker.AddYoursAvatarHelper;
import java.util.List;

/* loaded from: classes8.dex */
public final class HWU<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;

    public HWU(long j) {
        this.LJLIL = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        List<AddYoursAvatar> list;
        AddYoursAvatarHelper.Response response = (AddYoursAvatarHelper.Response) obj;
        Integer num = response.statusCode;
        if (num == null || num.intValue() != 0) {
            return;
        }
        List<AddYoursAvatar> userAvatars = response.sticker.getUserAvatars();
        if (userAvatars != null) {
            list = C44729Hgz.LJJIJIIJI(userAvatars);
        } else {
            list = null;
        }
        AddYoursAvatarHelper.LIZLLL = list;
        if (list == null || list.isEmpty()) {
            return;
        }
        AddYoursAvatarHelper.LIZJ.put(Long.valueOf(this.LJLIL), list);
    }
}
