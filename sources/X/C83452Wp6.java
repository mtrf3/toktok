package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.actionai.action.data.ActionAITemplateData;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wp6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83452Wp6 extends AbstractC83417WoX {
    public final Context LJI;
    public final C82622Wbi LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    @Override // X.AbstractC83417WoX
    public final String LIZ() {
        return "apply_template";
    }

    @Override // X.AbstractC83417WoX
    public final C83467WpL<String, String> LIZJ() {
        return new C83467WpL(new C83437Wor(this.LJI, this.LJII)).LIZLLL(LIZLLL()).LIZJ((C45233Hp7) this.LJIIIIZZ.getValue());
    }

    @Override // X.AbstractC83417WoX
    public final C83427Woh<ActionAITemplateData> LIZLLL() {
        return (C83427Woh) this.LJIIIZ.getValue();
    }

    @Override // X.AbstractC83417WoX
    public final EnumC83408WoO LIZIZ() {
        return EnumC83408WoO.TEMPLATE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83452Wp6(LifecycleOwner lifecycleOwner, Context context, C82622Wbi diContainer) {
        super(lifecycleOwner, context, diContainer);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJI = context;
        this.LJII = diContainer;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 47));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 48));
    }
}
