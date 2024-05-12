package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86993bD extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public final /* synthetic */ GiphyViewModel LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<A2G<Integer>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C86993bD(GiphyViewModel giphyViewModel, long j, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        super(1);
        this.LJLIL = giphyViewModel;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC67352kd;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable it = th;
        o.LJIIIZ(it, "it");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJLIL), null, null, new C86983bC(this.LJLILLLLZI, this.LJLIL, it, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }
}
