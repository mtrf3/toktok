package X;

import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.6pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172376pd extends AbstractC65781Prl implements InterfaceC88472Yns<C172456pl, C76800UCe> {
    public final /* synthetic */ C172336pZ LJLIL;
    public final /* synthetic */ NLETemplateModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ProcessorConfig LJLJJI;
    public final /* synthetic */ InterfaceC172486po LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172376pd(C172336pZ c172336pZ, NLETemplateModel nLETemplateModel, String str, ProcessorConfig processorConfig, InterfaceC172486po interfaceC172486po) {
        super(1);
        this.LJLIL = c172336pZ;
        this.LJLILLLLZI = nLETemplateModel;
        this.LJLJI = str;
        this.LJLJJI = processorConfig;
        this.LJLJJL = interfaceC172486po;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C172456pl c172456pl) {
        C172456pl it = c172456pl;
        o.LJIIIZ(it, "it");
        C172336pZ c172336pZ = this.LJLIL;
        NLETemplateModel nLETemplateModel = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = it.LIZLLL;
        ProcessorConfig processorConfig = this.LJLJJI;
        c172336pZ.getClass();
        NLERenderProxySegment LIZLLL = C172336pZ.LIZLLL(str, str2, processorConfig);
        NLETrackSlot nLETrackSlot = nLETemplateModel.getMainTrack().LJIILLIIL().get(0);
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        nLETrackSlot2.LJIIL(LIZLLL);
        nLETrackSlot.LJIILJJIL(nLETrackSlot2);
        this.LJLJJL.LIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
