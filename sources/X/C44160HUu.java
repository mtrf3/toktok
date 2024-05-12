package X;

import Y.ACallableS105S0100000_2;
import android.content.Context;
import com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import kotlin.jvm.internal.o;

/* renamed from: X.HUu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44160HUu extends AbstractC65781Prl implements InterfaceC65784Pro<C162706a2> {
    public static final C44160HUu LJLIL = new C44160HUu();

    public C44160HUu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6a2] */
    @Override // X.InterfaceC65784Pro
    public final C162706a2 invoke() {
        return new IAVScreenAdaptService() { // from class: X.6a2
            @Override // com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService
            public final void calculateAdaptPlan(Context context) {
                o.LJIIIZ(context, "context");
                C10K.LIZJ(new ACallableS105S0100000_2(context, 39));
            }
        };
    }
}
