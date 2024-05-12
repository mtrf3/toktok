package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$3$10", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136085Vs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C43544H7c LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;
    public final /* synthetic */ ArrayList<VideoSegment> LJLJI;
    public final /* synthetic */ List<AVMusic> LJLJJI;
    public final /* synthetic */ List<ImportVideoInfo> LJLJJL;
    public final /* synthetic */ Cut2EditTransferModel LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C34K LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C136085Vs(C43544H7c c43544H7c, Intent intent, ArrayList<VideoSegment> arrayList, List<? extends AVMusic> list, List<ImportVideoInfo> list2, Cut2EditTransferModel cut2EditTransferModel, String str, C34K c34k, long j, InterfaceC67352kd<? super C136085Vs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c43544H7c;
        this.LJLILLLLZI = intent;
        this.LJLJI = arrayList;
        this.LJLJJI = list;
        this.LJLJJL = list2;
        this.LJLJJLL = cut2EditTransferModel;
        this.LJLJL = str;
        this.LJLJLJ = c34k;
        this.LJLJLLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C136085Vs(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<ImportVideoInfo> arrayList;
        C141335gf.LIZJ(obj);
        C43544H7c c43544H7c = this.LJLIL;
        Intent intent = this.LJLILLLLZI;
        ArrayList<VideoSegment> arrayList2 = this.LJLJI;
        List<AVMusic> list = this.LJLJJI;
        if (this.LJLJJL.isEmpty()) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>(this.LJLJJL);
        }
        c43544H7c.LJJI(intent, arrayList2, list, arrayList, this.LJLJJLL, this.LJLJL, this.LJLJLJ.element, (int) this.LJLJLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
