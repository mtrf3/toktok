package X;

import com.ss.android.ugc.aweme.feed.assem.friendstab.BackToFYPGuideAssem;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8NY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NY extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C8NY LJLIL = new C8NY();

    public C8NY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C212518Vr c212518Vr;
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt) {
            c212518Vr = C8NZ.LIZ;
        } else {
            c212518Vr = C212518Vr.LIZ;
        }
        reusedUiSlotAssem.LJFF(c212518Vr);
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(BackToFYPGuideAssem.class);
        reusedUiSlotAssem.LIZJ = new BackToFYPGuideAssem();
        reusedUiSlotAssem.LIZLLL = R.id.de7;
        return C76800UCe.LIZ;
    }
}
