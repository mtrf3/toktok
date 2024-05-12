package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93293lN {
    public final /* synthetic */ ViewOnTouchListenerC93253lJ LIZ;

    public C93293lN(ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ) {
        this.LIZ = viewOnTouchListenerC93253lJ;
    }

    public final void LIZ(int i, View view) {
        int i2;
        boolean z;
        C100023wE LJ;
        if (!C73340SqO.LJJIJ(view.getContext())) {
            return;
        }
        final IMContact iMContact = (IMContact) view.getTag(83886080);
        Integer num = (Integer) view.getTag(50331648);
        if (num == null || iMContact == null) {
            return;
        }
        if (num.intValue() == 50331648 || num.intValue() == 50331649) {
            ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = this.LIZ;
            AbstractC93453ld abstractC93453ld = viewOnTouchListenerC93253lJ.LJLLJ;
            boolean z2 = true;
            boolean z3 = false;
            if (abstractC93453ld != null && abstractC93453ld.LJLJJI) {
                int size = abstractC93453ld.LJLJJLL.size();
                if (C85773Yf.LJLJI != null && (LJ = C77876UhM.LJ()) != null) {
                    i2 = LJ.LIZ;
                } else {
                    i2 = 10;
                }
                AbstractC93453ld abstractC93453ld2 = this.LIZ.LJLLJ;
                if (abstractC93453ld2 != null && !abstractC93453ld2.LJLJJLL.contains(iMContact)) {
                    z = true;
                } else {
                    z = false;
                }
                if (size >= i2 && z) {
                    String quantityString = this.LIZ.LJLIL.getResources().getQuantityString(R.plurals.dh, i2, Integer.valueOf(i2));
                    o.LJIIIIZZ(quantityString, "activity.resources.getQu…                        )");
                    C26045AKb c26045AKb = new C26045AKb(this.LIZ.LJLIL);
                    c26045AKb.LJIIIZ(quantityString);
                    c26045AKb.LJIIJ();
                    return;
                }
                if (!this.LIZ.LIZ(iMContact)) {
                    return;
                }
                AbstractC93453ld abstractC93453ld3 = this.LIZ.LJLLJ;
                if (abstractC93453ld3 != null) {
                    if (abstractC93453ld3.LJLJJLL.contains(iMContact)) {
                        abstractC93453ld3.LJLJJLL.remove(iMContact);
                        z2 = false;
                    } else {
                        abstractC93453ld3.LJLJJLL.add(iMContact);
                    }
                    z3 = z2;
                }
                AbstractC93453ld abstractC93453ld4 = this.LIZ.LJLLJ;
                if (abstractC93453ld4 != null) {
                    abstractC93453ld4.LJZ(i);
                }
                if (z3) {
                    this.LIZ.LJ(iMContact);
                }
                this.LIZ.LJIIL();
                return;
            }
            if (viewOnTouchListenerC93253lJ.LJLJI == null) {
                IIMUnder16Proxy LJJIJ = C78966Uyw.LJJIJ();
                o.LJIIIIZZ(LJJIJ, "getUnder16Proxy()");
                if (LJJIJ.LIZIZ()) {
                    return;
                }
                ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ2 = this.LIZ;
                C3K0.LJ(viewOnTouchListenerC93253lJ2.LJLIL, iMContact, new AqS148S0200000_1(iMContact, viewOnTouchListenerC93253lJ2, 50));
                return;
            }
            if (!viewOnTouchListenerC93253lJ.LIZ(iMContact)) {
                return;
            }
            this.LIZ.LJ(iMContact);
            final ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ3 = this.LIZ;
            C107274Ix.LJIIIIZZ(viewOnTouchListenerC93253lJ3.LJLIL, viewOnTouchListenerC93253lJ3.LJLJI, new IMContact[]{iMContact}, viewOnTouchListenerC93253lJ3.LJLLLLLL, new C4JZ() { // from class: X.3lO
                @Override // X.C4JZ
                public final void LIZ(String str) {
                    String str2;
                    String str3;
                    Bundle bundle;
                    Bundle bundle2;
                    List LJJIJ2 = C47261Igj.LJJIJ(IMContact.this);
                    viewOnTouchListenerC93253lJ3.LJIIJ(str, LJJIJ2);
                    ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ4 = viewOnTouchListenerC93253lJ3;
                    IMContact contact = IMContact.this;
                    SharePackage sharePackage = viewOnTouchListenerC93253lJ4.LJLJI;
                    String str4 = null;
                    if (sharePackage != null) {
                        str2 = sharePackage.itemType;
                    } else {
                        str2 = null;
                    }
                    if (o.LJ("aweme", str2)) {
                        SharePackage sharePackage2 = viewOnTouchListenerC93253lJ4.LJLJI;
                        String aid = viewOnTouchListenerC93253lJ4.LJLZ;
                        long currentTimeMillis = System.currentTimeMillis();
                        C85323Wm onEventV3 = C772831o.LIZ();
                        o.LJIIIZ(aid, "aid");
                        o.LJIIIZ(contact, "contact");
                        o.LJIIIZ(onEventV3, "onEventV3");
                        if (sharePackage2 != null && (bundle2 = sharePackage2.extras) != null) {
                            str3 = bundle2.getString("author_id");
                        } else {
                            str3 = null;
                        }
                        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                            str4 = bundle.getString("enter_from");
                        }
                        C1HQ LIZJ = HXX.LIZJ("platform", "chat", "group_id", aid);
                        if (str3 == null) {
                            str3 = "";
                        }
                        LIZJ.put("author_id", str3);
                        if (str4 == null) {
                            str4 = "";
                        }
                        LIZJ.put("enter_from", str4);
                        String LIZIZ = C4KZ.LIZIZ(currentTimeMillis, "share_video_success");
                        LIZJ.put("bind_id", LIZIZ);
                        onEventV3.LIZIZ("share_video_success", LIZJ);
                        C1HQ c1hq = new C1HQ();
                        if (contact instanceof IMUser) {
                            c1hq.put("to_user_id", ((IMUser) contact).getUid());
                        }
                        c1hq.put("bind_id", LIZIZ);
                        onEventV3.LIZIZ("share_video_success_info", c1hq);
                    }
                    C57428MgK.LJFF(viewOnTouchListenerC93253lJ3.LJLJI, "", LJJIJ2, 0, 56);
                    SharePackage sharePackage3 = viewOnTouchListenerC93253lJ3.LJLJI;
                    if (sharePackage3 != null) {
                        C3VT.LIZIZ(sharePackage3, C3Y4.LIZJ, LJJIJ2);
                    }
                }
            }, UC0.LIZ);
            return;
        }
        if (num.intValue() != 100663296) {
            return;
        }
        IIMUnder16Proxy LJJIJ2 = C78966Uyw.LJJIJ();
        o.LJIIIIZZ(LJJIJ2, "getUnder16Proxy()");
        if (LJJIJ2.LIZIZ()) {
            return;
        }
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ4 = this.LIZ;
        C3K0.LJ(viewOnTouchListenerC93253lJ4.LJLIL, iMContact, new AqS148S0200000_1(iMContact, viewOnTouchListenerC93253lJ4, 51));
    }
}
