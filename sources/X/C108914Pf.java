package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108914Pf {
    public final Context LIZ;
    public final SharePanelViewModel LIZIZ;
    public final InterfaceC108974Pl LIZJ;
    public int LIZLLL;
    public IMContact LJ;
    public C108964Pk LJFF;
    public final Handler LJI;

    public final void LIZJ() {
        RunnableC108944Pi runnableC108944Pi;
        C108964Pk c108964Pk = this.LJFF;
        if (c108964Pk != null && (runnableC108944Pi = c108964Pk.LIZLLL) != null) {
            c108964Pk.LIZJ.removeCallbacks(runnableC108944Pi);
        }
        this.LIZJ.LIZJ();
        this.LIZLLL = -1;
        C107274Ix.LIZJ(this.LIZIZ.LJLIL, this.LJ, "");
    }

    public final void LIZ(IMContact iMContact) {
        String str;
        Bundle bundle;
        SharePackage sharePackage = this.LIZIZ.LJLIL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str = bundle.getString("enter_method");
        } else {
            str = null;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(sharePackage);
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        C98593tv c98593tv = new C98593tv(this.LIZ, iMContact);
        c98593tv.setEnterFromForMob(this.LIZIZ.LJFF());
        c98593tv.setEnterMethodForMob(str);
        c98593tv.setEnterFrom(6);
        String LIZJ = C227768wm.LIZJ(LJJJLL);
        o.LJIIIIZZ(LIZJ, "getAuthorId(aweme)");
        c98593tv.setAuthorId(LIZJ);
        c98593tv.setGroupId(C227768wm.LIZIZ(LJJJLL));
        c98593tv.setQuickChat(true);
        java.util.Map<String, String> extraMobParams = c98593tv.getExtraMobParams();
        if (str == null) {
            str = "share_panel";
        }
        extraMobParams.put("panel_source", str);
        createIIMServicebyMonsterPlugin.getImChatService().LJFF(c98593tv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4Pj] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4Pi, java.lang.Runnable] */
    public final void LIZIZ(final IMContact iMContact) {
        SharePackage sharePackage;
        this.LJ = iMContact;
        if (iMContact == null || (sharePackage = this.LIZIZ.LJLIL) == null) {
            return;
        }
        final C108964Pk c108964Pk = new C108964Pk(sharePackage, iMContact, this.LJI);
        final ?? r2 = new C4OT() { // from class: X.4Pj
            @Override // X.C4OT
            public final void LIZ(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final void LJIIIIZZ(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final void LJIIIZ() {
            }

            @Override // X.C4OT
            public final void LIZIZ(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final void LIZJ(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
                C108914Pf c108914Pf = C108914Pf.this;
                c108914Pf.LIZLLL = 1;
                c108914Pf.LIZJ.LIZIZ();
                C57428MgK.LJFF(sharePackage2, "", C47261Igj.LJJIJ(iMContact), 0, 56);
            }

            @Override // X.C4OT
            public final void LJII(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final boolean LJIIJ(SharePackage sharePackage2) {
                o.LJIIIZ(sharePackage2, "sharePackage");
                return true;
            }

            @Override // X.C4OT
            public final void LIZLLL(Dialog dialog, SharePackage sharePackage2) {
                o.LJIIIZ(dialog, "dialog");
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final void LJ(Dialog dialog, SharePackage sharePackage2) {
                o.LJIIIZ(dialog, "dialog");
                o.LJIIIZ(sharePackage2, "sharePackage");
            }

            @Override // X.C4OT
            public final void LJI(SharePackage sharePackage2, String str) {
                o.LJIIIZ(sharePackage2, "sharePackage");
            }
        };
        RunnableC108944Pi runnableC108944Pi = c108964Pk.LIZLLL;
        if (runnableC108944Pi != null) {
            c108964Pk.LIZJ.removeCallbacks(runnableC108944Pi);
        }
        c108964Pk.LIZLLL = null;
        ?? r3 = new Runnable(r2) { // from class: X.4Pi
            public final C4OT LJLIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C108964Pk c108964Pk2 = C108964Pk.this;
                    C101243yC.LIZJ(c108964Pk2.LIZ, "", C47261Igj.LJJIJ(c108964Pk2.LIZIZ), this.LJLIL, null, null, null, 112);
                    C108964Pk.this.getClass();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            {
                this.LJLIL = r2;
            }
        };
        c108964Pk.LIZJ.postDelayed(r3, 3000L);
        c108964Pk.LIZLLL = r3;
        this.LJFF = c108964Pk;
        this.LIZLLL = 0;
        this.LIZJ.LIZ();
        C4KZ.LIZLLL(sharePackage, iMContact, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    public C108914Pf(Context context, SharePanelViewModel sharePanelViewModel, InterfaceC108974Pl sharePanelView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        o.LJIIIZ(sharePanelView, "sharePanelView");
        this.LIZ = context;
        this.LIZIZ = sharePanelViewModel;
        this.LIZJ = sharePanelView;
        this.LIZLLL = -1;
        this.LJI = new Handler(C16880lQ.LLJJJJ());
    }
}
