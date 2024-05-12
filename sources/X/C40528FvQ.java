package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FvQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40528FvQ extends AbstractC40529FvR {
    public final NUT LIZ;

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LIZ(C60292NlQ instance, Context context, C60300NlY c60300NlY) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC60298NlW
    public final void LIZIZ(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LIZLLL(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJII(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJIIIIZZ(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJ(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZIZ();
        }
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJIIIZ(C60292NlQ instance) {
        o.LJIIIZ(instance, "instance");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZJ();
        }
    }

    public C40528FvQ(F3T providerFactory, NUT bulletBusiness) {
        o.LJIIIZ(providerFactory, "providerFactory");
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZ = bulletBusiness;
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LIZJ(C60292NlQ instance, JSONObject jSONObject) {
        o.LJIIIZ(instance, "instance");
        if (this.LIZ.LIZ(AdLynxStatBusiness.class) != null && jSONObject != null) {
            jSONObject.optLong("first_page_layout", -1L);
        }
    }

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJI(C60292NlQ instance, String str) {
        NOY LIZ;
        C59297NOz c59297NOz;
        o.LJIIIZ(instance, "instance");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness == null || (LIZ = adLynxStatBusiness.LIZ()) == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            return;
        }
        adLynxStatBusiness.LIZIZ = true;
        adLynxStatBusiness.LJ = true;
        if (str == null) {
            return;
        }
        ((ArrayList) adLynxStatBusiness.LJI).add(str);
    }
}
