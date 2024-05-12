package X;

import com.bytedance.effectcreatormobile.ckeapi.api.IRecovery;

/* renamed from: X.al0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94686al0 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C94686al0 LJLIL = new C94686al0();

    public C94686al0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C94273aeL templateInfo;
        IRecovery LIZ = C93943aZ1.LIZ();
        if (LIZ != null && (templateInfo = LIZ.getTemplateInfo()) != null && templateInfo.LJLIL.length() > 0 && templateInfo.LJLILLLLZI.length() > 0) {
            C93819aX1.LIZ().previewTemplateEvent().setValue(templateInfo);
        }
        return C76800UCe.LIZ;
    }
}
