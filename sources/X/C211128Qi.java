package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ITextModeService;
import com.ss.android.ugc.aweme.service.TextModeServiceImpl;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211128Qi implements ITextModeService {
    public static final C211128Qi LIZIZ = new C211128Qi();
    public final /* synthetic */ ITextModeService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final View LIZIZ(View view) {
        return this.LIZ.LIZIZ(view);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final Object LIZLLL(Object params) {
        o.LJIIIZ(params, "params");
        return this.LIZ.LIZLLL(params);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final void LJ(Aweme aweme, View view, View view2, AqS169S0100000_3 aqS169S0100000_3) {
        this.LIZ.LJ(aweme, view, view2, aqS169S0100000_3);
    }

    public C211128Qi() {
        ITextModeService iTextModeService;
        Object LIZ = C58096Mr6.LIZ(ITextModeService.class, false);
        if (LIZ != null) {
            iTextModeService = (ITextModeService) LIZ;
        } else {
            if (C58096Mr6.o5 == null) {
                synchronized (ITextModeService.class) {
                    if (C58096Mr6.o5 == null) {
                        C58096Mr6.o5 = new TextModeServiceImpl();
                    }
                }
            }
            iTextModeService = C58096Mr6.o5;
        }
        this.LIZ = iTextModeService;
    }
}
