package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62099OYt implements InterfaceC62474OfW {
    public final /* synthetic */ InterfaceC62096OYq LIZ;

    public C62099OYt(InterfaceC62096OYq interfaceC62096OYq) {
        this.LIZ = interfaceC62096OYq;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        String string = sharePackage.extras.getString("share_platform", "");
        if (string == null || ujb.o.LJJJJJL(string)) {
            this.LIZ.LJFF("", "subscribe_invite", sharePackage.extras);
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        OQD.LIZ(interfaceC62486Ofi, baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 c62387Oe7, C5JV c5jv) {
        OQD.LIZLLL(view, c62387Oe7, c5jv);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        Bundle bundle;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (z) {
            InterfaceC62096OYq interfaceC62096OYq = this.LIZ;
            String key = channel.key();
            if (baseSharePackage != null) {
                bundle = baseSharePackage.extras;
            } else {
                bundle = null;
            }
            interfaceC62096OYq.LJFF(key, "subscribe_invite", bundle);
            return;
        }
        this.LIZ.LIZ(new Throwable());
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }
}
