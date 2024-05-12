package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AnonymousClass030;
import X.C00F;
import X.C113254cT;
import X.C113264cU;
import X.C39579Fg7;
import X.C40899G3j;
import X.C4LD;
import X.C62233Obd;
import X.C62265Oc9;
import X.C62359Odf;
import X.C62394OeE;
import X.C66580QBc;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC62225ObV;
import X.InterfaceC62266OcA;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OXY;
import X.RBX;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowPostIncentiveSharePackage extends PhotoSharePackage {
    public final C113254cT imShareHook;
    public final OXY incentiveShareParams;
    public final C113264cU sharePanelListener;
    public static final C62265Oc9 Companion = new C62265Oc9();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final void LJIILL(C62394OeE c62394OeE) {
        c62394OeE.LJJIIJZLJL = true;
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJJI = this.imShareHook;
        C113264cU listener = this.sharePanelListener;
        o.LJIIIZ(listener, "listener");
        c62394OeE.LJJ = listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x013e, code lost:
    
        if (r1 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
    
        if (r1 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0163, code lost:
    
        if (r1 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006b, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.4cT] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.4cU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowPostIncentiveSharePackage(final android.app.Activity r43, X.OXY r44) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowPostIncentiveSharePackage.<init>(android.app.Activity, X.OXY):void");
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        List LIZLLL;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        if ((channel instanceof CopyLinkChannel) || (LIZLLL = C62359Odf.LIZLLL()) == null || LIZLLL.isEmpty()) {
            return false;
        }
        for (SharePlatform sharePlatform : C62359Odf.LIZLLL()) {
            if (o.LJ(sharePlatform.platformId, channel.key())) {
                int i = sharePlatform.nowShareMode;
                if (i != 4 && i != 5) {
                    return false;
                }
                interfaceC88472Yns.invoke(Boolean.valueOf(PhotoSharePackage.LJIJJ(this, channel, context, null, i, 20)));
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final boolean LJIJI(InterfaceC62225ObV channel, Context context, Aweme aweme, int i, boolean z) {
        View view;
        Context context2;
        InterfaceC62266OcA interfaceC62266OcA;
        String LIZIZ;
        View view2;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        WeakReference<View> weakReference = C40899G3j.LIZ;
        KeyEvent.Callback callback = null;
        if (weakReference == null || (view = weakReference.get()) == null || (context2 = view.getContext()) == null) {
            return true;
        }
        WeakReference<View> weakReference2 = C40899G3j.LIZ;
        if (weakReference2 != null) {
            callback = (View) weakReference2.get();
        }
        if (!(callback instanceof InterfaceC62266OcA) || (interfaceC62266OcA = (InterfaceC62266OcA) callback) == null) {
            return true;
        }
        if (!interfaceC62266OcA.LIZ()) {
            WeakReference<View> weakReference3 = C40899G3j.LIZ;
            if (weakReference3 == null || (view2 = weakReference3.get()) == null) {
                return true;
            }
            AnonymousClass030.LJ(view2, R.string.rjz);
            return true;
        }
        String LJIJ = C66580QBc.LJIJ(context2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("incentive_share_");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUser().getUniqueId());
        LIZ.append(".png");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        Bitmap drawingCacheBitmap = interfaceC62266OcA.getDrawingCacheBitmap();
        if (drawingCacheBitmap == null) {
            return true;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIJ);
            LIZ2.append('/');
            LIZ2.append(LIZIZ2);
            C39579Fg7.LJIL(X1D.LIZIZ(LIZ2));
        } catch (Throwable unused) {
        }
        if (!BitmapUtils.saveBitmapToSD(drawingCacheBitmap, LJIJ, LIZIZ2) || (LIZIZ = C00F.LIZIZ(LJIJ, '/', LIZIZ2)) == null) {
            return true;
        }
        C62233Obd.LIZLLL(channel, LIZIZ, context, this, i);
        return true;
    }
}
