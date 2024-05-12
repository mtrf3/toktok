package X;

import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4RD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RD implements InterfaceC108744Oo {
    public final C4RE LIZ;
    public C4RF LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final boolean LJFF;

    @Override // X.C4OT
    public final void LJIIIZ() {
        this.LIZ.LIZIZ.dismiss();
    }

    public C4RD(C4RE c4re) {
        View findViewById;
        this.LIZ = c4re;
        boolean z = c4re.LJFF.extras.getBoolean("comment_direct_share");
        this.LJFF = z;
        View findViewById2 = c4re.LIZIZ.findViewById(R.id.liz);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 218), findViewById2);
        }
        c4re.LIZJ.post(new ARunnableS37S0100000_1(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        Dialog dialog = c4re.LIZIZ;
        if (dialog != null && (dialog instanceof OOS) && (findViewById = ((C18Z) dialog).findViewById(R.id.c8m)) != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
            o.LJIIIIZZ(from, "from(layout)");
            from.setPeekHeight(findViewById.getHeight());
            from.setSkipCollapsed(true);
        }
        if (z) {
            c4re.LJ.setVisibility(8);
        }
    }

    @Override // X.C4OT
    public final void LIZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LIZLLL(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LIZIZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LIZJ(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LIZJ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LJII(sharePackage);
        }
    }

    @Override // X.InterfaceC108744Oo
    public final void LJFF(IMContact contact) {
        boolean z;
        o.LJIIIZ(contact, "contact");
        C4RF c4rf = this.LIZIZ;
        if (c4rf != null) {
            List<IMContact> LJFF = c4rf.LJFF();
            if (LJFF == null || LJFF.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            LJIIL(z);
            return;
        }
        o.LJIJI("realImChannel");
        throw null;
    }

    @Override // X.C4OT
    public final void LJII(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LIZ(sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJIIIIZZ(SharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        if (o.LJ(sharePackage.itemType, "live") || o.LJ(sharePackage.itemType, "multi_live")) {
            LJIIJJI(R.string.h9a);
        }
        this.LIZ.LIZIZ.dismiss();
        Bundle bundle = sharePackage.extras;
        if (o.LJ(bundle.getString("is_star"), "1")) {
            C81533Hx.LIZ(3, bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), null);
        }
        C4RB c4rb = this.LIZ.LJI;
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
            LJIIJJI(R.string.b96);
            return false;
        }
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LJIIIIZZ(sharePackage);
        }
        return true;
    }

    public final void LJIIJJI(int i) {
        C26045AKb c26045AKb;
        C4RE c4re = this.LIZ;
        Context context = c4re.LIZ;
        if (context instanceof Activity) {
            c26045AKb = new C26045AKb((Activity) context);
        } else {
            c26045AKb = new C26045AKb(c4re.LIZJ);
        }
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r0.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        kotlin.jvm.internal.o.LJIJI("realImChannel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r8 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r0 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r0.LJIIIZ();
        r2 = android.animation.ValueAnimator.ofFloat(0.0f, r7.LIZJ);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "{\n            realImChan…ight.toFloat())\n        }");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r1 = r7.LIZ.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r8 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r1.setVisibility(r0);
        r0 = r7.LIZ.LIZIZ.getWindow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = r0.getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0.getWidth() != android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r7.LIZ.LIZIZ.setCancelable(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r2.addListener(new Y.ALAdapterS0S0110000_1(r8, r7, 2));
        r2.addUpdateListener(new Y.AUListenerS90S0100000_1(r7, 74));
        r2.setDuration(150L);
        r2.start();
        r0 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r0.LJIIIIZZ();
        r0 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r0.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        kotlin.jvm.internal.o.LJIJI("realImChannel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        kotlin.jvm.internal.o.LJIJI("realImChannel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        kotlin.jvm.internal.o.LJIJI("realImChannel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r2 = android.animation.ValueAnimator.ofFloat(r7.LIZJ, 0.0f);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "{\n            ValueAnima….toFloat(), 0F)\n        }");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        if (r1.getVisibility() != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0024, code lost:
    
        if (r8 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1.getVisibility() != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r0 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(boolean r8) {
        /*
            r7 = this;
            X.4RF r0 = r7.LIZIZ
            java.lang.String r6 = "realImChannel"
            r5 = 0
            if (r0 == 0) goto Lca
            android.view.View r1 = r0.LJII()
            kotlin.jvm.internal.o.LJI(r1)
            boolean r0 = r7.LJFF
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L24
            if (r8 == 0) goto L26
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L2c
        L1c:
            X.4RF r0 = r7.LIZIZ
            if (r0 == 0) goto Lba
            r0.LJ()
        L23:
            return
        L24:
            if (r8 != 0) goto L1c
        L26:
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L1c
        L2c:
            r2 = 0
            r1 = 2
            if (r8 == 0) goto La7
            X.4RF r0 = r7.LIZIZ
            if (r0 == 0) goto Lc6
            r0.LJIIIZ()
            float[] r1 = new float[r1]
            r1[r3] = r2
            int r0 = r7.LIZJ
            float r0 = (float) r0
            r1[r4] = r0
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.String r0 = "{\n            realImChan…ight.toFloat())\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L49:
            X.4RE r0 = r7.LIZ
            android.view.View r1 = r0.LJ
            if (r8 == 0) goto La4
            r0 = 0
        L50:
            r1.setVisibility(r0)
            X.4RE r0 = r7.LIZ
            android.app.Dialog r0 = r0.LIZIZ
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L7a
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L7a
            int r1 = r0.getWidth()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            if (r1 != r0) goto L7a
            X.4RE r0 = r7.LIZ
            android.app.Dialog r0 = r0.LIZIZ
            r0.setCancelable(r8)
        L7a:
            Y.ALAdapterS0S0110000_1 r1 = new Y.ALAdapterS0S0110000_1
            r0 = 2
            r1.<init>(r8, r7, r0)
            r2.addListener(r1)
            Y.AUListenerS90S0100000_1 r1 = new Y.AUListenerS90S0100000_1
            r0 = 74
            r1.<init>(r7, r0)
            r2.addUpdateListener(r1)
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            r2.start()
            X.4RF r0 = r7.LIZIZ
            if (r0 == 0) goto Lc2
            r0.LJIIIIZZ()
            X.4RF r0 = r7.LIZIZ
            if (r0 == 0) goto Lbe
            r0.LJ()
            goto L23
        La4:
            r0 = 8
            goto L50
        La7:
            float[] r1 = new float[r1]
            int r0 = r7.LIZJ
            float r0 = (float) r0
            r1[r3] = r0
            r1[r4] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.String r0 = "{\n            ValueAnima….toFloat(), 0F)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L49
        Lba:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lbe:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lc2:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lc6:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        Lca:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4RD.LJIIL(boolean):void");
    }

    @Override // X.C4OT
    public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LJFF(dialog, sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJ(Dialog dialog, SharePackage sharePackage) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LJI(dialog, sharePackage);
        }
    }

    @Override // X.C4OT
    public final void LJI(SharePackage sharePackage, String str) {
        C86393XvR LJJIJIL;
        o.LJIIIZ(sharePackage, "sharePackage");
        String str2 = "";
        String string = sharePackage.extras.getString("aid", "");
        if (string != null) {
            str2 = string;
        }
        Aweme o6 = AwemeService.LIZ().o6(str2);
        if ((o6 != null && o6.isAd()) || C63081OpJ.LLF(o6)) {
            AwemeRawAd awemeRawAd = null;
            if (sharePackage.extras.getBoolean("is_share_live", false)) {
                ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && LJJIJIL.LIZIZ() != null) {
                    C28835BTj.LIZ("live_ad", "live_share", null, null);
                }
            } else {
                FeedRawAdLogUtilsImpl.LIZIZ().LIZ(this.LIZ.LIZ, o6);
                if (o6 != null) {
                    awemeRawAd = o6.getAwemeRawAd();
                }
                C0DC.LIZJ(o6, C58704N2e.LIZLLL("draw_ad", "share", awemeRawAd), "anchor_id", o6, "room_id");
            }
        }
        C4RB c4rb = this.LIZ.LJI;
        if (c4rb != null) {
            c4rb.LIZIZ(sharePackage, str);
        }
        if (o.LJ(str, "chat_merge")) {
            this.LIZ.LIZIZ.dismiss();
        }
    }
}
