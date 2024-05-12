package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$2$1", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136095Vt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43544H7c LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;
    public final /* synthetic */ ArrayList<VideoSegment> LJLJI;
    public final /* synthetic */ List<ImportVideoInfo> LJLJJI;
    public final /* synthetic */ Cut2EditTransferModel LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C34K LJLJL;
    public final /* synthetic */ long LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136095Vt(C43544H7c c43544H7c, Intent intent, ArrayList<VideoSegment> arrayList, List<ImportVideoInfo> list, Cut2EditTransferModel cut2EditTransferModel, String str, C34K c34k, long j, InterfaceC67352kd<? super C136095Vt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43544H7c;
        this.LJLILLLLZI = intent;
        this.LJLJI = arrayList;
        this.LJLJJI = list;
        this.LJLJJL = cut2EditTransferModel;
        this.LJLJJLL = str;
        this.LJLJL = c34k;
        this.LJLJLJ = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C136095Vt(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<ImportVideoInfo> arrayList;
        C141335gf.LIZJ(obj);
        C43544H7c c43544H7c = this.LJLIL;
        Intent intent = this.LJLILLLLZI;
        ArrayList<VideoSegment> arrayList2 = this.LJLJI;
        if (this.LJLJJI.isEmpty()) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>(this.LJLJJI);
        }
        c43544H7c.LJJI(intent, arrayList2, null, arrayList, this.LJLJJL, this.LJLJJLL, this.LJLJL.element, (int) this.LJLJLJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
