package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C29930Bos;
import X.C30175Bsp;
import X.C38354F3m;
import X.C4L0;
import X.C4LD;
import X.C62368Odo;
import X.C62369Odp;
import X.C62370Odq;
import X.C62371Odr;
import X.InterfaceC29340BfM;
import X.InterfaceC29341BfN;
import X.InterfaceC62096OYq;
import X.InterfaceC62225ObV;
import X.InterfaceC64592gB;
import X.OYR;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import java.util.ArrayList;
import yq4.a;

/* loaded from: classes11.dex */
public class LiveHostShare implements IHostShare {
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final String getBundleKey(int i) {
        if (i == 0) {
            return "shared_users_id_list";
        }
        if (i == 1) {
            return "friends_shared_cnt";
        }
        if (i == 2) {
            return "is_create_group_chat";
        }
        if (i == 3) {
            return "batch_share_type";
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C62371Odr.LIZ(this);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Boolean sharePanelRefactor() {
        return Boolean.valueOf(C4LD.LIZIZ.LJJIJL());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getUrlModelAndShowAnim(InterfaceC29340BfM interfaceC29340BfM) {
        IMService.createIIMServicebyMonsterPlugin(false).getRelationService().LJII(3, new C30175Bsp(interfaceC29340BfM), null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isImChannel(String str) {
        String LJI = ShareExtServiceImpl.LJJLIIJ().LJI();
        if (C38354F3m.LIZJ("chat_merge", str) || (C38354F3m.LJ(str) && C38354F3m.LIZJ("im_channel", LJI))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void showScreenTimeDialog(Bundle bundle) {
        a.LJIILL().LJ(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getShortUrl(String str, InterfaceC29341BfN interfaceC29341BfN) {
        C4LD.LIZIZ.LJJLIIIJLLLLLLLZ("", "", str).LIZLLL();
        if (interfaceC29341BfN == null) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            android.app.Activity r2 = X.C45804HyK.LJIJJ(r5)
            if (r2 == 0) goto L44
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.LJJLIIJ()
            android.graphics.drawable.Drawable r1 = r0.LJIILJJIL(r2, r6)
            if (r1 != 0) goto L41
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.LJJLIIJ()
            android.graphics.drawable.Drawable r1 = r0.LJJIIJZLJL(r2)
            java.lang.String r6 = X.C44384HbQ.LJJLIIIIJ()
            X.ObV r0 = X.OYR.LIZ(r2, r6)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "other"
            boolean r0 = X.C38354F3m.LIZJ(r6, r0)
            if (r0 != 0) goto L3e
        L2e:
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.LJJLIIJ()
            android.graphics.drawable.Drawable r1 = r0.LJIILJJIL(r2, r7)
            if (r1 != 0) goto L42
        L38:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            return r0
        L3e:
            if (r1 != 0) goto L41
            goto L2e
        L41:
            r7 = r6
        L42:
            r3 = r7
            goto L38
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostShare.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getLongPressShareDialog(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        return C4LD.LIZ.LJ(activity, c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getShareDialog(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        return C4LD.LIZ.LJI(activity, c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final TuxSheet getShareTuxSheet(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        return C4LD.LIZ.LJIIJ(activity, c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void share(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        InterfaceC62225ObV LIZ = OYR.LIZ(activity, c29930Bos.LIZ);
        if (LIZ != null && LIZ.LIZLLL(activity)) {
            LiveSharePackage LJIIIIZZ = C4LD.LIZ.LJIIIIZZ(activity, c29930Bos, interfaceC62096OYq);
            if (LIZ.LJIIJ(LJIIIIZZ.LJIIJJI(LIZ), activity, null)) {
                interfaceC62096OYq.LJFF(c29930Bos.LIZ, "link", LJIIIIZZ.extras);
            } else {
                interfaceC62096OYq.LIZ(new Throwable());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubInvitation(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        C4LD.LIZ.LJJJJI(activity, c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSubscribeLink(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        C4LD.LIZ.shareSubscribeLink(activity, c29930Bos, interfaceC62096OYq);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareSingleMessage(Activity activity, String str, C29930Bos c29930Bos, final InterfaceC64592gB<Boolean> interfaceC64592gB) {
        IMUser iMUser = new IMUser();
        LiveSharePackage LJIIIIZZ = C4LD.LIZ.LJIIIIZZ(activity, c29930Bos, new C62368Odo());
        iMUser.setUid(str);
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LIZIZ(iMUser, LJIIIIZZ, new C4L0() { // from class: X.Ods
            @Override // X.C4L0
            public final void run(Object obj) {
                try {
                    InterfaceC64592gB.this.accept(obj);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void shareStreamGoal(Activity activity, String str, C29930Bos c29930Bos, InterfaceC64592gB<Boolean> interfaceC64592gB) {
        IMUser iMUser = new IMUser();
        LiveSharePackage LJIIIIZZ = C4LD.LIZ.LJIIIIZZ(activity, c29930Bos, new C62369Odp());
        iMUser.setUid(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iMUser);
        C4LD.LIZ.LJJIII(new C62370Odq(), LJIIIIZZ, c29930Bos.LJIIL, arrayList);
    }
}
