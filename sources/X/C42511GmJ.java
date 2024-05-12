package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger;
import kotlin.jvm.internal.o;

/* renamed from: X.GmJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42511GmJ implements InterfaceC42512GmK {
    public final Context LIZ;

    public C42511GmJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC42512GmK
    public final void LIZ(NearbyEncouragePublishCardLayoutManger layoutManager, View page, float f, InterfaceC88471Ynr<? super View, ? super Float, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(page, "page");
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.8f);
        if (f < -1.0f) {
            page.setScaleX(0.9f);
            page.setScaleY(0.9f);
            interfaceC88471Ynr.invoke(page, valueOf2);
            interfaceC88472Yns.invoke(valueOf);
            return;
        }
        if (f <= 1.0f) {
            float f2 = 1;
            float abs = ((f2 - Math.abs(f)) * 0.100000024f) + 0.9f;
            float abs2 = ((f2 - Math.abs(f)) * 0.19999999f) + 0.8f;
            Math.abs(f);
            float abs3 = Math.abs(f) * 12;
            page.setScaleX(abs);
            page.setScaleY(abs);
            interfaceC88471Ynr.invoke(page, Float.valueOf(abs2));
            page.setTranslationY(KL2.LIZJ(this.LIZ, abs3));
            interfaceC88472Yns.invoke(Float.valueOf(f2 - Math.abs(f)));
            return;
        }
        page.setScaleX(0.9f);
        page.setScaleY(0.9f);
        interfaceC88471Ynr.invoke(page, valueOf2);
        interfaceC88472Yns.invoke(valueOf);
    }
}
