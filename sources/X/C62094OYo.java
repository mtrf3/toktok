package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OYo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62094OYo implements InterfaceC62474OfW {
    public final /* synthetic */ InterfaceC62096OYq LIZ;

    public C62094OYo(InterfaceC62096OYq interfaceC62096OYq) {
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
        OQD.LIZJ(sharePackage, context);
        this.LIZ.onDismiss();
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        if (action instanceof C46181IAn) {
            this.LIZ.LJFF(action.key(), "link", sharePackage.extras);
        }
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
            LiveSharePackage.Companion.getClass();
            if (baseSharePackage != null) {
                bundle = baseSharePackage.extras;
            } else {
                bundle = null;
            }
            interfaceC62096OYq.LJFF(key, "qr_code", bundle);
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
