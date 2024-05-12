package com.ss.android.ugc.aweme.commercialize.sticker.service;

import X.C188727au;
import X.C26227ARb;
import X.C58096Mr6;
import X.C59854NeM;
import X.C74077T5l;
import X.FMX;
import X.InterfaceC74078T5m;
import X.UC0;
import android.content.Context;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.CommerceStickerUnlockInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommerceLockStickerServiceImpl implements ICommerceLockStickerService {
    public static final /* synthetic */ int LIZ = 0;

    public static ICommerceLockStickerService LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(ICommerceLockStickerService.class, false);
        if (LIZ2 != null) {
            return (ICommerceLockStickerService) LIZ2;
        }
        if (C58096Mr6.LLLLZIL == null) {
            synchronized (ICommerceLockStickerService.class) {
                if (C58096Mr6.LLLLZIL == null) {
                    C58096Mr6.LLLLZIL = new CommerceLockStickerServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLZIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService
    public final boolean LIZ(NewFaceStickerBean newFaceStickerBean) {
        return C74077T5l.LIZ(newFaceStickerBean);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService
    public final boolean LIZIZ(Context context, NewFaceStickerBean newFaceStickerBean, String str) {
        String str2;
        String str3;
        o.LJIIIZ(context, "context");
        CommerceStickerUnlockInfo commerceStickerUnlockInfo = null;
        if (newFaceStickerBean != null) {
            str2 = newFaceStickerBean.id;
        } else {
            str2 = null;
        }
        if (str2 == null || !C74077T5l.LIZ(newFaceStickerBean)) {
            return false;
        }
        InterfaceC74078T5m LIZ2 = C59854NeM.LIZ();
        if (LIZ2 != null) {
            String str4 = newFaceStickerBean.id;
            o.LJIIIIZZ(str4, "newFaceStickerBean.id");
            if (LIZ2.LIZLLL(str4)) {
                return false;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("prop_id", newFaceStickerBean.id);
        c188727au.LJIIIZ("scene_id", "1001");
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_toast", c188727au.LIZ);
        CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
        if (commerceSticker != null) {
            commerceStickerUnlockInfo = commerceSticker.getCommerceStickerUnlockInfo();
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        if (commerceStickerUnlockInfo == null || (str3 = commerceStickerUnlockInfo.desc) == null) {
            str3 = "";
        }
        c26227ARb.LIZIZ(str3);
        c26227ARb.LJ(R.string.scf);
        UC0.LIZJ(c26227ARb, new AqS53S1200000_12(context, newFaceStickerBean, str, 1));
        c26227ARb.LJI().LIZLLL();
        return true;
    }
}
