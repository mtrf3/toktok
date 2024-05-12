package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* renamed from: X.Op3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63065Op3 extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ C63067Op5 LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63065Op3(C63067Op5 c63067Op5, Activity activity, String str, String str2, boolean z, String str3) {
        super(1);
        this.LJLIL = c63067Op5;
        this.LJLILLLLZI = activity;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = z;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        C86393XvR LJJIJIL;
        C86393XvR LJJIJIL2;
        o.LJIIIZ(it, "it");
        C63067Op5 c63067Op5 = this.LJLIL;
        Activity activity = this.LJLILLLLZI;
        c63067Op5.getClass();
        if (C63067Op5.LIZ(activity)) {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL2 = LJJJLL.LJJIJIL()) != null) {
                LJJIJIL2.LJFF(this.LJLJI);
            }
            OQL.LIZ(this.LJLJJI, "go_live", "live_take_popup_in_room", this.LJLJJL);
        } else {
            ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
            if (LJJJLL2 != null && (LJJIJIL = LJJJLL2.LJJIJIL()) != null) {
                LJJIJIL.handleSchema(this.LJLILLLLZI, this.LJLJJLL, new Bundle());
            }
            OQL.LIZ(this.LJLJJI, "go_live", "live_take_popup_out_room", this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
