package X;

import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.DubbingServiceImpl;
import com.ss.android.ugc.aweme.IDubbingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86718Y1q implements IDubbingService {
    public static final C86718Y1q LIZIZ = new C86718Y1q();
    public final /* synthetic */ IDubbingService LIZ;

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZLLL(InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, InterfaceC55235Lm3 vScope, Aweme aweme, Context context) {
        o.LJIIIZ(vScope, "vScope");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZLLL(interfaceC65784Pro, interfaceC65784Pro2, vScope, aweme, context);
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y2S>> LJ(T assem, AbstractC241239dP scope) {
        o.LJIIIZ(assem, "assem");
        o.LJIIIZ(scope, "scope");
        return this.LIZ.LJ(assem, scope);
    }

    public C86718Y1q() {
        IDubbingService iDubbingService;
        Object LIZ = C58096Mr6.LIZ(IDubbingService.class, false);
        if (LIZ != null) {
            iDubbingService = (IDubbingService) LIZ;
        } else {
            if (C58096Mr6.LJJLIIIJ == null) {
                synchronized (IDubbingService.class) {
                    if (C58096Mr6.LJJLIIIJ == null) {
                        C58096Mr6.LJJLIIIJ = new DubbingServiceImpl();
                    }
                }
            }
            iDubbingService = C58096Mr6.LJJLIIIJ;
        }
        this.LIZ = iDubbingService;
    }
}
