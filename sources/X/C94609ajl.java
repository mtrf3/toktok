package X;

import com.bytedance.ies.effectcreator.swig.Feature;
import kotlin.jvm.internal.o;

/* renamed from: X.ajl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94609ajl extends AbstractC65781Prl implements InterfaceC88472Yns<Feature, Boolean> {
    public static final C94609ajl LJLIL = new C94609ajl();

    public C94609ajl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Feature feature) {
        boolean z;
        Feature it = feature;
        o.LJIIIIZZ(it, "it");
        if (o.LJ(it.getSecondPanelType(), "texture_select_panel") || o.LJ(it.getSecondPanelType(), "face_stretch_edit_panel") || o.LJ(it.getSecondPanelType(), "prefab_select_panel") || o.LJ(it.getSecondPanelType(), "face_liquify_edit_panel")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
