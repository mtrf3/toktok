package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OfG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62458OfG extends C35M {
    public final C29930Bos LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_heart_broken;
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        int intValue = ((Number) this.LJLJI.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return EnumC26273ASv.NORMAL;
                }
                return EnumC26273ASv.DISLIKEMORE3;
            }
            return EnumC26273ASv.DISLIKEMORE2;
        }
        return EnumC26273ASv.DISLIKEMORE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62458OfG(C29930Bos params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LJLILLLLZI = params;
        this.LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 567));
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        boolean z = sharePackage.extras.getBoolean("ignore_version", false);
        InterfaceC62555Ogp interfaceC62555Ogp = this.LJLILLLLZI.LJJJJ;
        if (interfaceC62555Ogp != null) {
            interfaceC62555Ogp.LIZ(true, z);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.LIZLLL(context, sharePackage);
    }
}
