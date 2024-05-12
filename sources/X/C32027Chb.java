package X;

import com.bytedance.android.livesdk.comp.api.game.data.GameUploadResult;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Chb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32027Chb implements InterfaceC116954iR<C15070iV<String, C28467BFf<GameUploadResult>>> {
    public final /* synthetic */ C32026Cha LJLIL;
    public final /* synthetic */ CompletionBlock<InterfaceC32031Chf> LJLILLLLZI;
    public final /* synthetic */ ArrayList<InterfaceC32032Chg> LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C32026Cha c32026Cha = this.LJLIL;
        ArrayList<InterfaceC32032Chg> arrayList = this.LJLJI;
        c32026Cha.getClass();
        InterfaceC32031Chf interfaceC32031Chf = (InterfaceC32031Chf) ED5.LIZJ(InterfaceC32031Chf.class, null);
        interfaceC32031Chf.setUploadedImageList(arrayList);
        CompletionBlock<InterfaceC32031Chf> completionBlock = c32026Cha.LJLJLJ;
        if (completionBlock != null) {
            completionBlock.onSuccess(interfaceC32031Chf, "");
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        CompletionBlock<InterfaceC32031Chf> completionBlock = this.LJLIL.LJLJLJ;
        if (completionBlock != null) {
            C31626Cb8.LIZ(completionBlock, 0, "request error.", 4);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(C15070iV<String, C28467BFf<GameUploadResult>> c15070iV) {
        C15070iV<String, C28467BFf<GameUploadResult>> pair = c15070iV;
        o.LJIIIZ(pair, "pair");
        C28467BFf<GameUploadResult> c28467BFf = pair.LIZIZ;
        if (c28467BFf != null) {
            C32026Cha c32026Cha = this.LJLIL;
            CompletionBlock<InterfaceC32031Chf> completionBlock = this.LJLILLLLZI;
            ArrayList<InterfaceC32032Chg> arrayList = this.LJLJI;
            if (c28467BFf.statusCode == 0) {
                c32026Cha.getClass();
                InterfaceC32031Chf interfaceC32031Chf = (InterfaceC32031Chf) ED5.LIZJ(InterfaceC32031Chf.class, null);
                interfaceC32031Chf.setUploadedImageList(arrayList);
                completionBlock.onSuccess(interfaceC32031Chf, "");
                return;
            }
            CompletionBlock<InterfaceC32031Chf> completionBlock2 = c32026Cha.LJLJLJ;
            if (completionBlock2 == null) {
                return;
            }
            C31626Cb8.LIZ(completionBlock2, 0, "request error.", 4);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJLJJL = d;
    }

    public C32027Chb(C32026Cha c32026Cha, C37356ElM c37356ElM, ArrayList arrayList) {
        this.LJLIL = c32026Cha;
        this.LJLILLLLZI = c37356ElM;
        this.LJLJI = arrayList;
    }
}
