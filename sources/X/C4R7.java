package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4R7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4R7 implements InterfaceC108744Oo {
    public final Context LIZ;
    public final C4RB LIZIZ;
    public final C4P8 LIZJ;

    @Override // X.InterfaceC108744Oo
    public final void LJFF(IMContact contact) {
        o.LJIIIZ(contact, "contact");
    }

    @Override // X.C4OT
    public final void LJIIIZ() {
        this.LIZJ.Vd(new C107694Kn());
    }

    @Override // X.C4OT
    public final void LIZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LIZLLL(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LIZIZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LIZJ(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LIZJ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LJII(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJII(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LIZ(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJIIIIZZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = sharePackage.extras;
        if (o.LJ(bundle.getString("is_star"), "1")) {
            C81533Hx.LIZ(3, bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), null);
        }
        this.LIZJ.Vd(new C107694Kn());
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LJ(sharePackage);
        }
    }

    @Override // X.C4OT
    public final boolean LJIIJ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        String str = "";
        String string = sharePackage.extras.getString("aid", "");
        if (string != null) {
            str = string;
        }
        Aweme o6 = AwemeService.LIZ().o6(str);
        if (o6 != null && C63081OpJ.LJJLIIIJLJLI(o6)) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                AnonymousClass114.LIZ(LJIIIIZZ, R.string.b96);
            }
            return false;
        }
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LJIIIIZZ(sharePackage);
        }
        return true;
    }

    @Override // X.C4OT
    public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LJFF(dialog, sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJ(Dialog dialog, SharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LJI(dialog, sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJI(SharePackage sharePackage, String str) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(sharePackage, "sharePackage");
        String str2 = "";
        String string = sharePackage.extras.getString("aid", "");
        if (string != null) {
            str2 = string;
        }
        Aweme o6 = AwemeService.LIZ().o6(str2);
        if (o6 != null && o6.isAd()) {
            FeedRawAdLogUtilsImpl.LIZIZ().LIZ(this.LIZ, o6);
            if (o6 != null) {
                awemeRawAd = o6.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C0DC.LIZJ(o6, C58704N2e.LIZLLL("draw_ad", "share", awemeRawAd), "anchor_id", o6, "room_id");
        }
        C4RB c4rb = this.LIZIZ;
        if (c4rb != null) {
            c4rb.LIZIZ(sharePackage, str);
        }
        if (o.LJ(str, "chat_merge")) {
            LJIIIZ();
        }
    }

    public C4R7(C25600zU context, C4RB c4rb, C4P8 hostPanelPanelCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
        this.LIZ = context;
        this.LIZIZ = c4rb;
        this.LIZJ = hostPanelPanelCallback;
    }
}
