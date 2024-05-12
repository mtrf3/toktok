package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XF7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ XF5 LJLIL;
    public final /* synthetic */ NLELokiResourceProtocol LJLILLLLZI;
    public final /* synthetic */ NLEResourceCallback LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XF7(NLELokiResourceProtocol nLELokiResourceProtocol, NLEResourceCallback nLEResourceCallback, XF5 xf5, String str) {
        super(0);
        this.LJLIL = xf5;
        this.LJLILLLLZI = nLELokiResourceProtocol;
        this.LJLJI = nLEResourceCallback;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        if (!this.LJLIL.LIZJ.containsKey(this.LJLILLLLZI.LIZJ())) {
            XF5 xf5 = this.LJLIL;
            String LIZJ = this.LJLILLLLZI.LIZJ();
            o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
            xf5.LIZ(LIZJ);
        }
        NLEResourceCallback nLEResourceCallback = this.LJLJI;
        if (nLEResourceCallback != null) {
            String str2 = this.LJLJJI;
            Effect effect = (Effect) ((LinkedHashMap) this.LJLIL.LIZIZ).get(this.LJLILLLLZI.LIZJ());
            if (effect == null || (str = effect.getUnzipPath()) == null) {
                str = "";
            }
            nLEResourceCallback.onSuccess(str2, str, true);
        }
        return C76800UCe.LIZ;
    }
}
