package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLimitGiftListRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Coj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32469Coj implements InterfaceC116954iR<C15070iV<GiftListResult, String>> {
    public final /* synthetic */ UW7 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ AbstractC32474Coo LJLJJLL;
    public final /* synthetic */ WeakReference<AbstractC32474Coo> LJLJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable error) {
        o.LJIIIZ(error, "error");
        GiftManager.inst().onGiftListFail(error, this.LJLILLLLZI, this.LJLJJL, this.LJLJJI, this.LJLJI, this.LJLJL);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(C15070iV<GiftListResult, String> c15070iV) {
        C15070iV<GiftListResult, String> response = c15070iV;
        o.LJIIIZ(response, "response");
        GiftManager.inst().onGiftListSuccess(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, response, this.LJLJJLL, C77283UUt.LIZIZ);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP disposable) {
        ArrayList<InterfaceC92693kP> putIfAbsent;
        o.LJIIIZ(disposable, "disposable");
        if (LiveGiftLimitGiftListRequest.INSTANCE.optimiseCancelBasedOnRoom()) {
            ConcurrentHashMap<Long, ArrayList<InterfaceC92693kP>> concurrentHashMap = this.LJLIL.LIZ;
            Long valueOf = Long.valueOf(this.LJLILLLLZI);
            ArrayList<InterfaceC92693kP> arrayList = concurrentHashMap.get(valueOf);
            if (arrayList == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (arrayList = new ArrayList<>()))) != null) {
                arrayList = putIfAbsent;
            }
            arrayList.add(disposable);
            ArrayList<InterfaceC92693kP> arrayList2 = this.LJLIL.LIZ.get(Long.valueOf(this.LJLILLLLZI));
            if (arrayList2 == null || arrayList2.isEmpty() || arrayList2.size() <= 20) {
                return;
            }
            ORS.LJJLJ(arrayList2);
        }
    }

    public C32469Coj(UW7 uw7, long j, long j2, boolean z, int i, AbstractC32474Coo abstractC32474Coo, WeakReference<AbstractC32474Coo> weakReference) {
        this.LJLIL = uw7;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = abstractC32474Coo;
        this.LJLJL = weakReference;
    }
}
