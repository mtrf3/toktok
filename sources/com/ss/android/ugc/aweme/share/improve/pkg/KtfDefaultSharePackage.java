package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C188727au;
import X.C2068389v;
import X.C244659iv;
import X.C26227ARb;
import X.C62374Odu;
import X.C76800UCe;
import X.C77123UOp;
import X.C7MY;
import X.FMX;
import X.InterfaceC62225ObV;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class KtfDefaultSharePackage extends SharePackage {
    public static final int $stable = 0;

    public abstract Aweme LJIILL();

    public KtfDefaultSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        Aweme LJIILL = LJIILL();
        if (LJIILL == null) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (interfaceC62225ObV != null) {
            str = interfaceC62225ObV.key();
        } else {
            str = null;
        }
        if (TextUtils.equals("download", str)) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        KtfInfo ktfInfo = LJIILL.getUploadMiscInfoStruct().ktfInfo;
        if (ktfInfo != null && ktfInfo.getShowMessageOnShare() && !ktfInfo.getHasShowOnce()) {
            ktfInfo.setHasShowOnce(true);
            C26227ARb c26227ARb = new C26227ARb(context);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = C7MY.LIZIZ(48);
            c2068389v.LIZJ = C7MY.LIZIZ(48);
            c26227ARb.LJIIIZ = new C244659iv(0, context, c2068389v.LIZ(context));
            c26227ARb.LJII = false;
            c26227ARb.LJ(R.string.hov);
            c26227ARb.LIZIZ(ktfInfo.getMessageTextOnShare());
            C77123UOp.LJIILL(c26227ARb, new AqS134S0200000_3(LJIILL, (Aweme) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 142));
            c26227ARb.LJI().LIZLLL();
            if (interfaceC62225ObV == null || TextUtils.equals(interfaceC62225ObV.key(), "chat_merge")) {
                str2 = "send_to";
            } else {
                str2 = "share_to";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("object_id", LJIILL.getAid());
            c188727au.LJIIIZ("type", str2);
            FMX.LJIIL("tns_share_warning_popout_ktf", c188727au.LIZ);
            return;
        }
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
