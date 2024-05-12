package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.Og3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62507Og3 implements InterfaceC62526OgM {
    public final /* synthetic */ LongPressShareButtonHandler LIZ;

    public C62507Og3(LongPressShareButtonHandler longPressShareButtonHandler) {
        this.LIZ = longPressShareButtonHandler;
    }

    @Override // X.InterfaceC62526OgM
    public final void LIZ(Context context, BaseSharePackage sharePackage, InterfaceC62225ObV channel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        C62468OfQ.LJFF(sharePackage, channel, false);
    }

    @Override // X.InterfaceC62526OgM
    public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ.LJLILLLLZI.LJIIJ(interfaceC62225ObV, true, baseSharePackage, context);
        C62468OfQ.LJ(false, baseSharePackage);
    }

    @Override // X.InterfaceC62526OgM
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62225ObV channel, C35905E7h c35905E7h) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        C62468OfQ.LJ(false, sharePackage);
    }
}
