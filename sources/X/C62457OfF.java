package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.HashMap;
import kotlin.jvm.internal.AqS15S1400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OfF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62457OfF extends C62415OeZ {
    public final /* synthetic */ PdpViewModel LIZ;

    public C62457OfF(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LIZLLL(context, sharePackage);
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LJ(context, sharePackage);
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        android.net.Uri uri;
        Bundle bundle;
        String string;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        super.LIZ(channel, z, baseSharePackage, context);
        PdpViewModel vm = this.LIZ;
        C70414RkI c70414RkI = vm.LLFII;
        if (c70414RkI != null) {
            o.LJIIIZ(vm, "vm");
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("product_query_params")) != null) {
                uri = UriProtector.parse(string);
                o.LJIIIIZZ(uri, "Uri.parse(this)");
            } else {
                uri = null;
            }
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(uri, "trackParams");
            if (LIZJ == null) {
                LIZJ = new HashMap<>();
            }
            C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70924RsW(1), new AqS15S1400000_10((HashMap) LIZJ, (HashMap<String, Object>) BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), (String) channel, (InterfaceC62225ObV) c70414RkI, (C70414RkI) vm, (PdpViewModel) 2));
        }
    }
}
