package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* renamed from: X.4Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109324Qu extends AbstractC65781Prl implements InterfaceC65784Pro<C4PH> {
    public static final C109324Qu LJLIL = new C109324Qu();

    public C109324Qu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4PH] */
    @Override // X.InterfaceC65784Pro
    public final C4PH invoke() {
        return new InterfaceC98193tH() { // from class: X.4PH
            public long LIZ = -1;

            @Override // X.InterfaceC98193tH
            public final void LIZ() {
                long j;
                if (this.LIZ > 0) {
                    j = SystemClock.uptimeMillis() - this.LIZ;
                } else {
                    j = -1;
                }
                IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZJ().LIZ(C4PG.LJ, new C30C(j));
            }

            @Override // X.InterfaceC98193tH
            public final void LIZIZ() {
                this.LIZ = SystemClock.uptimeMillis();
            }
        };
    }
}
