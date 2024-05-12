package X;

import java.util.List;

/* renamed from: X.Kqk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52978Kqk extends AbstractC65781Prl implements InterfaceC65784Pro<List<String>> {
    public static final C52978Kqk LJLIL = new C52978Kqk();

    public C52978Kqk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<String> invoke() {
        List<String> LJJIJIL = C47261Igj.LJJIJIL("tt_face", "tt_face_attribute_age", "tt_face_extra", "tt_face_attribute_exp");
        if (((Boolean) C52977Kqj.LIZIZ.getValue()).booleanValue()) {
            LJJIJIL.add("skin_quant");
        }
        return LJJIJIL;
    }
}
