package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OKn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61729OKn extends C35I {
    public final C29930Bos LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61729OKn(Activity activity, C29930Bos params) {
        super(activity, params);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        this.LJLJI = params;
    }

    @Override // X.C35I, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        Object LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        try {
            LIZ = this.LJLJI.LJJIJLIJ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        C59050NFm.LIZIZ.LJFF(context, (AdLiveEnterRoomConfig) LIZ, String.valueOf(this.LJLJI.LIZIZ));
    }
}
