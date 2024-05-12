package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.C00F;
import X.C38281F0r;
import X.C4LD;
import X.C52220KeW;
import X.C62038OWk;
import X.C62087OYh;
import X.C62214ObK;
import X.C62233Obd;
import X.C62269OcD;
import X.C62272OcG;
import X.C62358Ode;
import X.C62359Odf;
import X.C62394OeE;
import X.C66580QBc;
import X.C73969T1h;
import X.C76800UCe;
import X.C86K;
import X.HG3;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OYF;
import X.RBX;
import X.T16;
import X.X1D;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowInviteSharePackage extends PhotoSharePackage {
    public final C62214ObK imShareHook;
    public final C86K nowInviteShareParams;
    public final C62269OcD sharePanelListener;
    public static final C62272OcG Companion = new C62272OcG();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final String LJIJ() {
        List<String> list;
        int i;
        UrlModel urlModel = this.params.LJII;
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        if (C52220KeW.LIZ()) {
            i = C62038OWk.LIZLLL;
        } else {
            i = 0;
        }
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (i <= list.size()) {
            return (String) ListProtector.get(list, i);
        }
        return (String) ListProtector.get(list, 0);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final void LJIILL(C62394OeE c62394OeE) {
        c62394OeE.LJJIIJZLJL = true;
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJJI = this.imShareHook;
        C62269OcD listener = this.sharePanelListener;
        o.LJIIIZ(listener, "listener");
        c62394OeE.LJJ = listener;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        this.extras.putString("share_form", "url_form");
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        String str = this.url;
        if (C52220KeW.LIZ()) {
            C38281F0r c38281F0r = new C38281F0r(str);
            c38281F0r.LIZ(C62038OWk.LIZLLL, "invitation_display_mode");
            str = c38281F0r.LJ();
            o.LJIIIIZZ(str, "urlBuilder.build()");
        }
        OYF.LIZLLL(channel, str, this.itemType).LJIIJ(new C62087OYh(channel, this, LIZ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 24));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowInviteSharePackage(X.C86K r42, android.app.Activity r43, com.ss.android.ugc.aweme.base.share.ShareInfo r44) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage.<init>(X.86K, android.app.Activity, com.ss.android.ugc.aweme.base.share.ShareInfo):void");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        List LIZLLL;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        if (!(channel instanceof CopyLinkChannel) && (LIZLLL = C62359Odf.LIZLLL()) != null && !LIZLLL.isEmpty()) {
            Iterator it = C62359Odf.LIZLLL().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SharePlatform sharePlatform = (SharePlatform) it.next();
                if (o.LJ(sharePlatform.platformId, channel.key())) {
                    int i = sharePlatform.nowShareMode;
                    if (i == 4 || i == 5) {
                        interfaceC88472Yns.invoke(Boolean.valueOf(PhotoSharePackage.LJIJJ(this, channel, context, null, i, 20)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage
    public final boolean LJIJI(InterfaceC62225ObV channel, Context context, Aweme aweme, int i, boolean z) {
        View view;
        String str;
        Bitmap createBitmap;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (C52220KeW.LIZ()) {
            HashMap<Integer, String> hashMap = C62038OWk.LIZJ;
            if (hashMap.get(Integer.valueOf(C62038OWk.LIZLLL)) != null) {
                str = hashMap.get(Integer.valueOf(C62038OWk.LIZLLL));
            } else {
                WeakReference<View> weakReference = C62038OWk.LJ;
                String str2 = null;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                int i2 = C62038OWk.LIZLLL;
                if (view != null) {
                    if (hashMap.get(Integer.valueOf(i2)) != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(" cardFiles for ");
                        LIZ.append(i2);
                        LIZ.append(" is not null");
                        String msg = X1D.LIZIZ(LIZ);
                        o.LJIIIZ(msg, "msg");
                        str = hashMap.get(Integer.valueOf(i2));
                    } else {
                        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                        String path = C66580QBc.LJIJ(view.getContext());
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("avatar-");
                        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUniqueId());
                        LIZ2.append('-');
                        LIZ2.append(i2);
                        LIZ2.append(".png");
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        o.LJIIIIZZ(path, "path");
                        view.setDrawingCacheEnabled(true);
                        view.buildDrawingCache();
                        if (view.getDrawingCache() != null && (createBitmap = Bitmap.createBitmap(view.getDrawingCache())) != null) {
                            view.setDrawingCacheEnabled(false);
                            if (BitmapUtils.saveBitmapToSD(createBitmap, path, LIZIZ)) {
                                str2 = C00F.LIZIZ(path, '/', LIZIZ);
                            }
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("save file: ");
                        LIZ3.append(str2);
                        String msg2 = X1D.LIZIZ(LIZ3);
                        o.LJIIIZ(msg2, "msg");
                        if (str2 != null && hashMap.get(Integer.valueOf(i2)) == null) {
                            hashMap.put(Integer.valueOf(i2), str2);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("save file: ");
                            LIZ4.append(str2);
                            LIZ4.append(" for position, cost: ");
                            LIZ4.append(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis);
                            String msg3 = X1D.LIZIZ(LIZ4);
                            o.LJIIIZ(msg3, "msg");
                            str = hashMap.get(Integer.valueOf(i2));
                        }
                    }
                }
                return false;
            }
            if (str != null) {
                C62233Obd.LIZLLL(channel, str, context, this, i);
                return true;
            }
            return false;
        }
        return super.LJIJI(channel, context, aweme, i, z);
    }
}
