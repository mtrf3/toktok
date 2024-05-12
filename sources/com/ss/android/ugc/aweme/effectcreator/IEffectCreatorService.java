package com.ss.android.ugc.aweme.effectcreator;

import X.InterfaceC67352kd;
import android.content.Context;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes7.dex */
public interface IEffectCreatorService {
    List<CKEDraftInfoWrapper> LIZ(Context context);

    void LIZIZ(Context context, String str);

    void LIZJ(Context context, CKEDraftInfoWrapper cKEDraftInfoWrapper);

    Object LIZLLL(Context context, String str, InterfaceC67352kd<? super EffectPackageDataWrapper> interfaceC67352kd);

    void LJ(Context context, CKEDraftInfoWrapper cKEDraftInfoWrapper);

    void LJFF(Context context, CKEDraftInfoWrapper cKEDraftInfoWrapper, String str, String str2, String str3);

    void LJI(Context context, Effect effect, String str, String str2, String str3);

    CKEDraftInfoWrapper LJII(Context context, String str);

    void LJIIIIZZ(String str, String str2, String str3, String str4, Context context);

    void LJIIIZ(Context context, String str, String str2);
}
