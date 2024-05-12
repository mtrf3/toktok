package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4R8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4R8 implements InterfaceC108744Oo {
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
        Activity LJIIIIZZ;
        o.LJIIIZ(sharePackage, "sharePackage");
        if ((o.LJ(sharePackage.itemType, "live") || o.LJ(sharePackage.itemType, "multi_live")) && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.h9a);
        }
        this.LIZJ.Vd(new C107694Kn());
        Bundle bundle = sharePackage.extras;
        if (o.LJ(bundle.getString("is_star"), "1")) {
            C81533Hx.LIZ(3, bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), null);
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if (X.C63081OpJ.LLF(r3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r0 = r5.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r0.LIZIZ(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7, "chat_merge") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        LJIIIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl.LIZIZ().LIZ(r5.LIZ, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (X.C63081OpJ.LLF(r3) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        r2 = r3.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        X.C0DC.LIZJ(r3, X.C58704N2e.LIZLLL("draw_ad", "share", r2), "anchor_id", r3, "room_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        r2 = X.C63081OpJ.LJJJJI(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r3.isAd() == true) goto L18;
     */
    @Override // X.C4OT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.os.Bundle r0 = r6.extras
            java.lang.String r4 = "aid"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r4, r2)
            if (r1 != 0) goto L12
            r1 = r2
        L12:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.o6(r1)
            if (r3 != 0) goto L45
            android.os.Bundle r0 = r6.extras
            java.lang.String r1 = r0.getString(r4, r2)
            if (r1 != 0) goto L25
            r1 = r2
        L25:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.i6(r1)
            boolean r0 = X.C63081OpJ.LLF(r0)
            if (r0 == 0) goto L8c
            android.os.Bundle r0 = r6.extras
            java.lang.String r0 = r0.getString(r4, r2)
            if (r0 != 0) goto L8a
        L3b:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.i6(r2)
            if (r3 == 0) goto L8c
        L45:
            boolean r1 = r3.isAd()
            r0 = 1
            if (r1 != r0) goto L8c
        L4c:
            com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi r1 = com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl.LIZIZ()
            android.content.Context r0 = r5.LIZ
            r1.LIZ(r0, r3)
            boolean r0 = X.C63081OpJ.LLF(r3)
            if (r0 != 0) goto L85
            if (r3 == 0) goto L83
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r3.getAwemeRawAd()
        L61:
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "share"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r2)
            java.lang.String r1 = "anchor_id"
            java.lang.String r0 = "room_id"
            X.C0DC.LIZJ(r3, r2, r1, r3, r0)
        L70:
            X.4RB r0 = r5.LIZIZ
            if (r0 == 0) goto L77
            r0.LIZIZ(r6, r7)
        L77:
            java.lang.String r0 = "chat_merge"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 == 0) goto L82
            r5.LJIIIZ()
        L82:
            return
        L83:
            r2 = 0
            goto L61
        L85:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = X.C63081OpJ.LJJJJI(r3)
            goto L61
        L8a:
            r2 = r0
            goto L3b
        L8c:
            boolean r0 = X.C63081OpJ.LLF(r3)
            if (r0 == 0) goto L70
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4R8.LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String):void");
    }

    public C4R8(C25600zU context, C4RB c4rb, C4P8 hostPanelPanelCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
        this.LIZ = context;
        this.LIZIZ = c4rb;
        this.LIZJ = hostPanelPanelCallback;
    }
}
