package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAITemplateData;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wp8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83454Wp8 extends AbstractC83417WoX {
    public final Context LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.AbstractC83417WoX
    public final String LIZ() {
        return "change_template";
    }

    @Override // X.AbstractC83417WoX
    public final C83467WpL<String, String> LIZJ() {
        return (C83467WpL) this.LJIIIIZZ.getValue();
    }

    @Override // X.AbstractC83417WoX
    public final C83427Woh<ActionAITemplateData> LIZLLL() {
        InterfaceC83402WoI interfaceC83402WoI;
        AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm = this.LIZIZ;
        if (abstractC82626Wbm != null) {
            interfaceC83402WoI = abstractC82626Wbm.LIZIZ();
        } else {
            interfaceC83402WoI = null;
        }
        return new C83427Woh<>(interfaceC83402WoI, new C83455Wp9(this));
    }

    @Override // X.AbstractC83417WoX
    public final EnumC83408WoO LIZIZ() {
        return EnumC83408WoO.TEMPLATE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83454Wp8(LifecycleOwner lifecycleOwner, Context context, C82622Wbi diContainer) {
        super(lifecycleOwner, context, diContainer);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJI = context;
        this.LJII = C221108m2.LIZIZ(new AqS161S0200000_14(this, diContainer, 7));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS161S0200000_14(this, diContainer, 8));
    }
}