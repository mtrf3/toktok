package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46000I3o implements InterfaceC83566Wqw {
    public final C82622Wbi LIZ;
    public final C62822Ol8 LIZIZ;

    public final C188727au LIZIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-eventBuilder>(...)");
        return (C188727au) value;
    }

    public C46000I3o(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = diContainer;
        this.LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 538));
    }

    @Override // X.InterfaceC83566Wqw
    public final void LIZ(boolean z) {
        Effect LIZJ;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) this.LIZ.LJIIIIZZ(null, InterfaceC45999I3n.class);
        if (interfaceC45999I3n != null) {
            interfaceC45999I3n.vW(z);
            if (interfaceC45999I3n.U6()) {
                return;
            } else {
                interfaceC45999I3n.kY(!z, false);
            }
        }
        InterfaceC82400WVo interfaceC82400WVo = (InterfaceC82400WVo) this.LIZ.LJIIIIZZ(null, I0N.class);
        if (interfaceC82400WVo != null && (LIZJ = C82398WVm.LIZJ(interfaceC82400WVo)) != null) {
            if (V0N.LJJIIJ(LIZJ) || DiyPropParser.LJII(LIZJ)) {
                LIZIZ().LJI("template_name", LIZJ.getName());
                LIZIZ().LJI("template_id", LIZJ.getId());
                LIZIZ().LJI("is_reuse_create_effect", DiyPropParser.LJIIJJI(LIZJ));
                LIZIZ().LJI("reuse_effect_id", DiyPropParser.LJIILL(LIZJ));
                if (z) {
                    java.util.Map<String, String> map = LIZIZ().LIZ;
                    o.LJIIIIZZ(map, "eventBuilder.builder()");
                    C78880UxY.LJJLIIIJL("mobile_effect_text_prompt_click", map);
                } else {
                    java.util.Map<String, String> map2 = LIZIZ().LIZ;
                    o.LJIIIIZZ(map2, "eventBuilder.builder()");
                    C78880UxY.LJJLIIIJL("mobile_effect_customized_text_prompt", map2);
                }
            }
        }
    }
}
