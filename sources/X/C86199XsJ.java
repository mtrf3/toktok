package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.DubbingIntroFragment;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.ss.android.ugc.aweme.ui.DubbingStatusViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XsJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86199XsJ extends AbstractC65781Prl implements InterfaceC88471Ynr<DubbingStatusAssem, Boolean, C76800UCe> {
    public static final C86199XsJ LJLIL = new C86199XsJ();

    public C86199XsJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, Boolean bool) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue && (context = selectSubscribe.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = new DubbingIntroFragment();
            asl.LJI(0);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.show(supportFragmentManager, "DubbingIntroFragment");
            DubbingStatusViewModel q4 = selectSubscribe.q4();
            q4.getClass();
            C53277KvZ.LIZ.storeBoolean("dubbing_intro_shown", true);
            VideoItemParams gv0 = q4.gv0();
            if (gv0 != null) {
                C188727au c188727au = new C188727au();
                Aweme aweme = gv0.getAweme();
                String str = gv0.mEventType;
                o.LJIIIIZZ(str, "it.eventType");
                C65532hh.LIZ(c188727au, aweme, str);
                FMX.LJIIL("dubbing_intro_show", c188727au.LIZ);
            }
            q4.setState(Y3Q.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
