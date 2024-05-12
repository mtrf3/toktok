package com.ss.android.ugc.aweme.internal;

import X.C58096Mr6;
import X.H92;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AVCommerceServiceImpl implements IInternalCommerceService {
    public static IInternalCommerceService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IInternalCommerceService.class, false);
        if (LIZ != null) {
            return (IInternalCommerceService) LIZ;
        }
        if (C58096Mr6.z1 == null) {
            synchronized (IInternalCommerceService.class) {
                if (C58096Mr6.z1 == null) {
                    C58096Mr6.z1 = new AVCommerceServiceImpl();
                }
            }
        }
        return C58096Mr6.z1;
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LIZ() {
        return CommerceMediaServiceImpl.LIZJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LIZIZ() {
        return CommerceMediaServiceImpl.LIZJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LJ() {
        CommerceChallengeServiceImpl.LIZIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final LinkedHashMap<String, Bitmap> LJFF() {
        return CommerceChallengeServiceImpl.LIZIZ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJII() {
        if (!LIZ() || H92.LJ() || CommerceMediaServiceImpl.LIZJ().LJ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LIZLLL(Music music) {
        return CommerceMediaServiceImpl.LIZJ().LIZLLL(music);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LJI(int i) {
        CommerceChallengeServiceImpl.LIZIZ().LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final UrlModel LJIIIIZZ(String str) {
        return CommerceChallengeServiceImpl.LIZIZ().LJIJ(str, true, true);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LIZJ(String str, String str2) {
        CommerceChallengeServiceImpl.LIZIZ().LIZJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJIIIZ(Context context, String str, TextView textView, Boolean bool, String str2) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textView, "textView");
        return CommerceChallengeServiceImpl.LIZIZ().LJIJI(context, str, true, textView, booleanValue, str2);
    }
}
