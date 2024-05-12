package X;

import Y.IDhS106S0100000_13;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;
import kotlin.jvm.internal.o;

/* renamed from: X.UUx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77287UUx implements InterfaceC48038ItG<AbstractC73672Svk<Throwable>, InterfaceC115714gR<?>> {
    public static final int LJLJJI = SendGiftRetrySetting.INSTANCE.getRetryCount() - 1;
    public final AbstractC73672Svk<Boolean> LJLIL;
    public String LJLILLLLZI;
    public int LJLJI;

    public C77287UUx(C73849Syb isNetworkAvailable) {
        o.LJIIIZ(isNetworkAvailable, "isNetworkAvailable");
        this.LJLIL = isNetworkAvailable;
        this.LJLILLLLZI = "";
    }

    @Override // X.InterfaceC48038ItG
    public final InterfaceC115714gR<?> apply(AbstractC73672Svk<Throwable> abstractC73672Svk) {
        AbstractC73672Svk<Throwable> attempts = abstractC73672Svk;
        o.LJIIIZ(attempts, "attempts");
        InterfaceC115714gR LJJIII = attempts.LJJIII(new IDhS106S0100000_13(this, 4), false);
        o.LJIIIIZZ(LJJIII, "override fun apply(attem…       },\n        )\n    }");
        return LJJIII;
    }
}
