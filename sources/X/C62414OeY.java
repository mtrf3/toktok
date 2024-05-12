package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OeY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62414OeY extends C35M {
    public final C29930Bos LJLILLLLZI;

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_broken_heart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62414OeY(C29930Bos params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LJLILLLLZI = params;
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        Object LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        try {
            LIZ = this.LJLILLLLZI.LJJIJLIJ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        C59050NFm.LIZIZ.LJIIIZ(context, (AdLiveEnterRoomConfig) LIZ, new AqS160S0100000_10(this, 565), new AqS160S0100000_10(this, 566));
    }
}
