package X;

import android.graphics.Bitmap;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.ocr.ocr.OcrViewModel$fetchOcrInfo$1", f = "OcrViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class Y5M extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OcrViewModel LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5M(OcrViewModel ocrViewModel, android.net.Uri uri, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = ocrViewModel;
        this.LJLILLLLZI = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new Y5M(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0062: IGET (r2 I:com.bytedance.pipo.ocr.ocr.OcrViewModel) = (r4 I:X.Y5M) (LINE:16777314) X.Y5M.LJLIL com.bytedance.pipo.ocr.ocr.OcrViewModel, block:B:15:0x0058 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Y5M] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r4;
        Bitmap finalClipImage;
        C141335gf.LIZJ(obj);
        try {
            finalClipImage = this.LJLIL.gv0(this.LJLILLLLZI);
        } catch (Exception e) {
            ij2.a aVar = ij2.a.LJIJ;
            String valueOf = String.valueOf(108);
            long currentTimeMillis = System.currentTimeMillis();
            OcrViewModel ocrViewModel = r4.LJLIL;
            long j = currentTimeMillis - ocrViewModel.LJLILLLLZI;
            long j2 = ocrViewModel.LJLJI;
            long j3 = ocrViewModel.LJLJJI;
            long j4 = ocrViewModel.LJLJJL;
            aVar.getClass();
            ij2.a.LJII(j, j2, j3, j4, valueOf);
            r4.LJLIL.LJLIL.postValue(new C86815Y5j(0, 108, String.valueOf(e), null));
        }
        if (finalClipImage == null) {
            this.LJLIL.LJLIL.postValue(new C86815Y5j(0, 108, "bitmap null", null));
            return C76800UCe.LIZ;
        }
        if (finalClipImage.getByteCount() > 4194304) {
            finalClipImage = C45283Hpv.LIZJ(4194304, finalClipImage);
        }
        this.LJLIL.LJLJI = System.currentTimeMillis();
        OcrViewModel ocrViewModel2 = this.LJLIL;
        o.LJIIIIZZ(finalClipImage, "finalClipImage");
        AqS162S0200000_15 aqS162S0200000_15 = new AqS162S0200000_15(this, finalClipImage, 2);
        ocrViewModel2.getClass();
        ij2.a aVar2 = ij2.a.LJIJ;
        Y5R y5r = new Y5R(ocrViewModel2, 5, finalClipImage, aqS162S0200000_15);
        aVar2.getClass();
        ij2.a.LJI(finalClipImage, y5r);
        return C76800UCe.LIZ;
    }
}
