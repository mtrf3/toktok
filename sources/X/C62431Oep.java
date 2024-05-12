package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oep, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62431Oep extends C62415OeZ {
    public final /* synthetic */ CompletionBlock<InterfaceC71811SGh> LIZ;

    public C62431Oep(C37356ElM c37356ElM) {
        this.LIZ = c37356ElM;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LIZLLL(context, sharePackage);
        this.LIZ.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71811SGh.class, null), "");
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LJ(context, sharePackage);
        this.LIZ.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71811SGh.class, null), "");
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LIZIZ(context, sharePackage, action);
        this.LIZ.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71811SGh.class, null), "");
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        super.LIZ(channel, z, baseSharePackage, context);
        this.LIZ.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71811SGh.class, null), "");
    }
}
