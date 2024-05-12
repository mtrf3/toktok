package X;

import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IfS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47182IfS implements V1L {
    public final /* synthetic */ Aweme LIZ;

    @Override // X.V1L
    public final String getAlbumName() {
        return "";
    }

    @Override // X.V1L
    public final long getDuration() {
        return -1L;
    }

    @Override // X.V1L
    public final String getLocalPath() {
        return "";
    }

    @Override // X.V1L
    public final String getPlayUrl() {
        return "";
    }

    @Override // X.V1L
    public final String getArtistName() {
        User author = this.LIZ.getAuthor();
        if (author != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            LIZ.append(author.getUniqueId());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        }
        return "";
    }

    @Override // X.V1L
    public final String getCoverUrl() {
        UrlModel avatarMedium;
        List<String> urlList;
        String str;
        User author = this.LIZ.getAuthor();
        if (author == null || (avatarMedium = author.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null || (str = (String) ORZ.LJLLJ(urlList)) == null) {
            return "";
        }
        return str;
    }

    @Override // X.V1L
    public final String getId() {
        String aid = this.LIZ.getAid();
        o.LJIIIIZZ(aid, "aid");
        return aid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.V1L
    public final PlayModel getPlayModel() {
        return new PlayModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.V1L
    public final String getSongName() {
        String desc = this.LIZ.getDesc();
        if (desc == null) {
            return "";
        }
        return desc;
    }

    public C47182IfS(Aweme aweme) {
        this.LIZ = aweme;
    }
}
