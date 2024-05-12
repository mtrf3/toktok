package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OfJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62461OfJ extends C35M {
    public final C29930Bos LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return String.valueOf(this.LJLJJL);
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final int LJFF() {
        return this.LJLJI;
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.SECONDDISLIKEREASON;
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final int LJJII() {
        return this.LJLJJI;
    }

    @Override // X.C35M, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        InterfaceC31607Cap interfaceC31607Cap = this.LJLILLLLZI.LJJJJI;
        if (interfaceC31607Cap != null) {
            interfaceC31607Cap.LIZ(this.LJLJJL);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.LIZLLL(context, sharePackage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62461OfJ(C29930Bos params, int i, int i2, int i3) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LJLILLLLZI = params;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }
}
