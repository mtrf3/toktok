package X;

import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152945zO extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, ImageSynthesisResult, C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<ImageSynthesisResult, Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ List<SingleImageData> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<List<ImageSynthesisResult>, C76800UCe> LJLJJI;
    public final /* synthetic */ C152935zN LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C152945zO(C76732zl c76732zl, InterfaceC88471Ynr<? super ImageSynthesisResult, ? super Integer, C76800UCe> interfaceC88471Ynr, List<SingleImageData> list, InterfaceC88472Yns<? super List<ImageSynthesisResult>, C76800UCe> interfaceC88472Yns, C152935zN c152935zN) {
        super(2);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = list;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = c152935zN;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, ImageSynthesisResult synthesisData) {
        int intValue = num.intValue();
        o.LJIIIZ(synthesisData, "synthesisData");
        this.LJLIL.element++;
        InterfaceC88471Ynr<ImageSynthesisResult, Integer, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(synthesisData, Integer.valueOf(intValue));
        }
        if (this.LJLIL.element == this.LJLJI.size()) {
            InterfaceC88472Yns<List<ImageSynthesisResult>, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            if (interfaceC88472Yns != null) {
                List<SingleImageData> list = this.LJLJI;
                ArrayList arrayList = new ArrayList();
                Iterator<SingleImageData> it = list.iterator();
                while (it.hasNext()) {
                    ImageSynthesisResult synthesisData2 = it.next().getSynthesisData();
                    if (synthesisData2 != null) {
                        arrayList.add(synthesisData2);
                    }
                }
                interfaceC88472Yns.invoke(arrayList);
            }
            ((ArrayList) this.LJLJJL.LIZLLL).clear();
            ((ArrayList) this.LJLJJL.LIZLLL).clear();
        }
        return C76800UCe.LIZ;
    }
}
