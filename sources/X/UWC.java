package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWC extends AbstractC65781Prl implements InterfaceC88472Yns<UWI, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ AbstractC32474Coo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UWC(int i, long j, long j2, AbstractC32474Coo abstractC32474Coo, boolean z) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = j2;
        this.LJLJJL = abstractC32474Coo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UWI uwi) {
        String str;
        if (uwi != null) {
            str = uwi.getMessage();
        } else {
            str = null;
        }
        if (o.LJ(str, "Network unavailable")) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS49S0100000_13(this.LJLJJL, 141), 250L);
        } else {
            GiftManager.inst().onGiftListFail(uwi, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new WeakReference<>(this.LJLJJL));
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(UWI uwi) {
        invoke2(uwi);
        return C76800UCe.LIZ;
    }
}
