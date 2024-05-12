package X;

import Y.IDDListenerS144S0100000_4;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("aigc_half_intro_page_popup_task")
/* renamed from: X.9uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252109uw extends AbstractC56327M8t<TuxSheet> {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<ProfileAigcIntroFragment, C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", APN.PERSONAL_HOMEPAGE.toString());
        bundle.putString("enter_method", APK.CLICK_TAB.toString());
        bundle.putBoolean("intro_page_nav_bar", false);
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = new ProfileAigcIntroFragmentV2();
        profileAigcIntroFragmentV2.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = profileAigcIntroFragmentV2;
        asl.LJI(1);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = false;
        C234529Ii c234529Ii = new C234529Ii();
        new C2068389v();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_x_mark;
        C44384HbQ.LJJJLL(24);
        C44384HbQ.LJJJLL(24);
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new AqS154S0100000_4(profileAigcIntroFragmentV2, 1001));
        c235119Kp.LIZIZ(c234529Ii);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(this, 8);
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        this.LJLILLLLZI.invoke(profileAigcIntroFragmentV2);
        FragmentManager it = this.LJLIL.getSupportFragmentManager();
        o.LJIIIIZZ(it, "it");
        tuxSheet.show(it, "AIGC_SELF_PROFILE_FIRST_ENTRY");
        C244419iX.LIZIZ().storeBoolean("self_profile_first_entry_per_device", true);
        return tuxSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252109uw(InterfaceC56322M8o scene, ActivityC45651qj activityC45651qj, AqS170S0100000_4 aqS170S0100000_4, AqS154S0100000_4 aqS154S0100000_4) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = aqS170S0100000_4;
        this.LJLJI = aqS154S0100000_4;
    }
}
