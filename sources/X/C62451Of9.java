package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Of9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62451Of9 extends C35I {
    public final C29930Bos LJLJI;

    @Override // X.C35I, X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_flag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62451Of9(Activity activity, C29930Bos params) {
        super(activity, params);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        this.LJLJI = params;
    }

    @Override // X.C35I, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        String str = this.LJLJI.LJJIJIIJIL;
        if (str != null) {
            C2U8.LIZ(new C62532OgS(str));
        }
        InterfaceC29938Bp0 interfaceC29938Bp0 = this.LJLJI.LJJJIL;
        if (interfaceC29938Bp0 != null) {
            interfaceC29938Bp0.LIZ();
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.LIZLLL(context, sharePackage);
    }
}
