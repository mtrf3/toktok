package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OgG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62520OgG implements InterfaceC62548Ogi {
    public final Context LJLIL;
    public final BaseSharePackage LJLILLLLZI;

    public abstract void LIZ(InterfaceC62486Ofi interfaceC62486Ofi);

    @Override // X.InterfaceC62548Ogi
    public void LJIIIZ() {
    }

    @Override // X.InterfaceC62548Ogi
    public final void LIZIZ(InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        BaseSharePackage baseSharePackage = this.LJLILLLLZI;
        if (baseSharePackage != null) {
            baseSharePackage.LJIIIZ(this.LJLIL, action, new AqS157S0200000_10(this, action, 28));
        } else {
            LIZ(action);
        }
    }

    public AbstractC62520OgG(Context context, BaseSharePackage baseSharePackage) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = baseSharePackage;
    }
}
