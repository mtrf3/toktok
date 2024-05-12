package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAITextData;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wop, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83435Wop extends AbstractC83417WoX {
    public final Context LJI;
    public final C82622Wbi LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.AbstractC83417WoX
    public final String LIZ() {
        return "add_text";
    }

    @Override // X.AbstractC83417WoX
    public final C83467WpL<String, String> LIZJ() {
        return new C83467WpL(new C83438Wos(this.LJII)).LIZLLL(LIZLLL()).LIZJ((C45284Hpw) this.LJIIIIZZ.getValue());
    }

    @Override // X.AbstractC83417WoX
    public final C83427Woh<ActionAITextData> LIZLLL() {
        InterfaceC83402WoI interfaceC83402WoI;
        AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm = this.LIZIZ;
        if (abstractC82626Wbm != null) {
            interfaceC83402WoI = abstractC82626Wbm.LIZIZ();
        } else {
            interfaceC83402WoI = null;
        }
        return new C83427Woh<>(interfaceC83402WoI, new C83434Woo(this));
    }

    @Override // X.AbstractC83417WoX
    public final EnumC83408WoO LIZIZ() {
        return EnumC83408WoO.TEXT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83435Wop(LifecycleOwner lifecycleOwner, Context context, C82622Wbi diContainer) {
        super(lifecycleOwner, context, diContainer);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJI = context;
        this.LJII = diContainer;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 378));
    }
}
