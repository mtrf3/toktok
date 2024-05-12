package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AOk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26158AOk extends AbstractC65781Prl implements InterfaceC88471Ynr<Object, UrlModel, Boolean> {
    public static final C26158AOk LJLIL = new C26158AOk();

    public C26158AOk() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Object data, UrlModel urlModel) {
        User user;
        List<String> urlList;
        AvatarMetaInfo avatarMeta;
        UrlModel urlModel2 = urlModel;
        o.LJIIIZ(data, "data");
        if (data instanceof User) {
            user = (User) data;
        } else {
            user = null;
        }
        boolean z = false;
        if ((user != null && urlModel2 != null && (urlList = urlModel2.getUrlList()) != null && !urlList.isEmpty() && C26356AWa.LIZ() && (avatarMeta = user.getAvatarMeta()) != null && avatarMeta.getAvatarSource() == EnumC26153AOf.AIGC_PROFILE.getValue()) || LFH.LIZIZ.LIZLLL().LJIIJ().LJIIIIZZ()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
