package X;

import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: X.3Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84953Vb extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84953Vb(boolean z, String str, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
        this.LJLJJI = interfaceC65784Pro;
    }

    public final Boolean invoke(boolean z) {
        if (z) {
            if (!this.LJLIL) {
                return Boolean.TRUE;
            }
            if (TextUtils.equals("share_to_tt", this.LJLILLLLZI)) {
                if (!C1DG.LJIIIIZZ()) {
                    C60903NvH.LJIIJJI().getRegionService();
                    if (TextUtils.equals("US", C44296Ha0.LIZ())) {
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS37S0100000_1(this.LJLJI, 91));
                    } else {
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS37S0100000_1(this.LJLJI, 92));
                    }
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "share_to_tt");
                    FMX.LJIIL("show_u13_video_import_error", c145995oB.LIZ);
                } else {
                    return Boolean.FALSE;
                }
            } else if (!C1DG.LJIIIIZZ()) {
                C145995oB c145995oB2 = new C145995oB();
                c145995oB2.LJI("enter_from", this.LJLILLLLZI);
                FMX.LJIIL("show_u13_video_import_error", c145995oB2.LIZ);
                C60903NvH.LJIIJJI().getRegionService();
                if (TextUtils.equals("US", C44296Ha0.LIZ())) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS20S0200000_1(this.LJLJI, this.LJLJJI, 39));
                } else {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS20S0200000_1(this.LJLJI, this.LJLJJI, 40));
                }
            } else {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
