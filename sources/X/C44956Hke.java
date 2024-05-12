package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.o;

/* renamed from: X.Hke, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44956Hke extends AbstractC44957Hkf {
    public final int LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final ACLCommonShare LJIILIIL;
    public final boolean LJIILJJIL;
    public final C45339Hqp LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;

    @Override // X.AbstractC45395Hrj
    public final String LIZ() {
        return this.LJIJI;
    }

    @Override // X.AbstractC45395Hrj
    public final String LIZIZ() {
        return this.LJIJ;
    }

    @Override // X.AbstractC44957Hkf
    public final boolean LIZJ() {
        return this.LJIIZILJ;
    }

    @Override // X.AbstractC44957Hkf
    public final boolean LIZLLL() {
        return this.LJIILLIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44956Hke(Context context, InterfaceC87766YcU interfaceC87766YcU, Aweme aweme, String enterFrom, String enterMethod, Bundle mobDownloadBundle, boolean z, String str, int i, String shareChannel, String downloadActionType, int i2, boolean z2) {
        super(context, EnumC44954Hkc.DOWNLOAD_VIDEO.getSuffix(), EnumC44955Hkd.AWEME_VIDEO.getType(), interfaceC87766YcU, aweme, enterFrom, enterMethod, mobDownloadBundle);
        ACLCommonShare LJII;
        boolean z3;
        boolean z4;
        boolean z5;
        String LJFF;
        int transcode;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mobDownloadBundle, "mobDownloadBundle");
        o.LJIIIZ(shareChannel, "shareChannel");
        o.LJIIIZ(downloadActionType, "downloadActionType");
        this.LJIIIZ = i;
        this.LJIIJ = shareChannel;
        this.LJIIJJI = downloadActionType;
        this.LJIIL = i2;
        if (o.LJ(str, "download_action")) {
            if (o.LJ(C62443Of1.LIZ, "long_press_download")) {
                AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
                if (awemeACLShare != null) {
                    LJII = awemeACLShare.getDownloadMaskPanel();
                }
                LJII = null;
            } else {
                AwemeACLShare awemeACLShare2 = aweme.awemeACLShareInfo;
                if (awemeACLShare2 != null) {
                    LJII = awemeACLShare2.getDownloadGeneral();
                }
                LJII = null;
            }
        } else {
            if (o.LJ(str, "share_download")) {
                LJII = C62340OdM.LJII(aweme, shareChannel);
            }
            LJII = null;
        }
        this.LJIILIIL = LJII;
        if ((LJII != null && LJII.getTranscode() == 1) || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIILJJIL = z3;
        C45339Hqp c45339Hqp = new C45339Hqp();
        this.LJIILL = c45339Hqp;
        if (!z || LJII == null || ((transcode = LJII.getTranscode()) != 2 && transcode != 3)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.LJIILLIIL = z4;
        if ((LJII != null && LJII.getTranscode() == 2) || C78688UuS.LJJIJIIJIL()) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LJIIZILJ = z5;
        String LJIJ = C66580QBc.LJIJ(context);
        o.LJIIIIZZ(LJIJ, "getShareTempDir(context)");
        this.LJIJ = LJIJ;
        String LJIILL = C66580QBc.LJIILL(context);
        o.LJIIIIZZ(LJIILL, "getShareOutDir(context)");
        this.LJIJI = LJIILL;
        c45339Hqp.LIZ(aweme, z5, z4, true, LJII, z3);
        c45339Hqp.LJ = shareChannel;
        if (!z) {
            LJFF = c45339Hqp.LIZIZ;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LJFF = JBR.LJFF(LIZ, c45339Hqp.LIZIZ, "_ins", LIZ);
        }
        this.LIZ = LJFF;
        String aid = aweme.getAid();
        Aweme aweme2 = C44938HkM.LJFF;
        if (!o.LJ(aid, aweme2 != null ? aweme2.getAid() : null)) {
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
