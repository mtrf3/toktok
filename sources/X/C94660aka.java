package X;

import com.bytedance.ies.effectcreator.swig.ElementId;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.aka, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94660aka extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ XJL LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94660aka(XKS xks, String str, String str2, String str3, int i, String str4, String str5) {
        super(0);
        this.LJLIL = xks;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = i;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Feature feature;
        long j;
        ElementId id;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            feature = LJI.LIZJ(Integer.valueOf(this.LJLJJL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            if (feature != null) {
                feature.loadCapabilityFromString(this.LJLJJLL);
                String value = this.LJLJL;
                o.LJIIIZ(value, "value");
                feature.setExtraInfo("cke_effect_identity", value);
            }
        } else {
            feature = null;
        }
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 != null) {
            LJI2.LIZIZ();
        }
        XJL xjl = this.LJLIL;
        if (feature != null && (id = feature.id()) != null) {
            j = id.objectId();
        } else {
            j = -1;
        }
        Long valueOf = Long.valueOf(j);
        C3C5.m7constructorimpl(valueOf);
        xjl.resumeWith(valueOf);
        return C76800UCe.LIZ;
    }
}
