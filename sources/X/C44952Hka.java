package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hka, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44952Hka extends AbstractC44957Hkf {
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;

    @Override // X.AbstractC44957Hkf
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.AbstractC44957Hkf
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.AbstractC45395Hrj
    public final String LIZ() {
        return this.LJIILL;
    }

    @Override // X.AbstractC45395Hrj
    public final String LIZIZ() {
        return this.LJIILLIIL;
    }

    public final ACLCommonShare LJ(Aweme aweme) {
        String str;
        String str2 = this.LJIIIZ;
        if (o.LJ(str2, "download_action")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null) {
                return awemeACLShare.getDownloadGeneral();
            }
        } else if (o.LJ(str2, "share_download") && (str = this.LJIIJJI) != null && str.length() != 0) {
            return C62340OdM.LJII(aweme, this.LJIIJJI);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44952Hka(Context context, InterfaceC87766YcU interfaceC87766YcU, Aweme aweme, String enterFrom, String enterMethod, Bundle mobDownloadBundle, String str, int i, String shareChannel, String downloadActionType, int i2, boolean z) {
        super(context, EnumC44954Hkc.DOWNLOAD_IMAGE.getSuffix(), EnumC44955Hkd.AWEME_STORY_PHOTO.getType(), interfaceC87766YcU, aweme, enterFrom, enterMethod, mobDownloadBundle);
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mobDownloadBundle, "mobDownloadBundle");
        o.LJIIIZ(shareChannel, "shareChannel");
        o.LJIIIZ(downloadActionType, "downloadActionType");
        this.LJIIIZ = str;
        this.LJIIJ = i;
        this.LJIIJJI = shareChannel;
        this.LJIIL = downloadActionType;
        this.LJIILIIL = i2;
        this.LJIILJJIL = z;
        String LJIILL = C66580QBc.LJIILL(context);
        o.LJIIIIZZ(LJIILL, "getShareOutDir(context)");
        this.LJIILL = LJIILL;
        String LJIJ = C66580QBc.LJIJ(context);
        o.LJIIIIZZ(LJIJ, "getShareTempDir(context)");
        this.LJIILLIIL = LJIJ;
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS154S0200000_7(this, aweme, 113));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 577));
        this.LJIJ = LIZIZ;
        this.LIZ = C38352F3k.LIZJ((String) LIZIZ.getValue());
        String aid = aweme.getAid();
        Aweme aweme2 = C44938HkM.LJFF;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(aid, str2)) {
            C44938HkM.LJIIIZ = 0;
        }
        C44938HkM.LJI = enterFrom;
        C44938HkM.LJII = enterMethod;
        C44938HkM.LIZLLL = false;
        C44938HkM.LJFF = aweme;
        C44938HkM.LJIIIIZZ = shareChannel;
        C44938HkM.LJIILLIIL = mobDownloadBundle;
    }
}
