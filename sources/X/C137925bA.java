package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5bA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137925bA extends AbstractC65781Prl implements InterfaceC88472Yns<EffectCategoryModel, Boolean> {
    public static final C137925bA LJLIL = new C137925bA();

    public C137925bA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(EffectCategoryModel effectCategoryModel) {
        C76800UCe c76800UCe;
        EffectCategoryModel category = effectCategoryModel;
        o.LJIIIZ(category, "category");
        try {
            String extra = category.getExtra();
            if (extra != null) {
                if (new JSONObject(extra).optBoolean("voice_clone_tab_experiment")) {
                    return Boolean.valueOf(E8I.LIZIZ());
                }
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return Boolean.TRUE;
    }
}
