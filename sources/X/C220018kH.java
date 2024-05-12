package X;

import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursMultiHubAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8kH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220018kH extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C220018kH LJLIL = new C220018kH();

    public C220018kH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = R.id.bua;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(AddYoursMultiHubAssem.class);
        uiSlotAssem.LJIIIZ = new AddYoursMultiHubAssem();
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZJ;
        return C76800UCe.LIZ;
    }
}
