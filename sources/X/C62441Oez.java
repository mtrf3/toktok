package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Oez, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62441Oez extends ASB {
    public final C62435Oet LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        Fragment fragment;
        InterfaceC55235Lm3 LJFF;
        IPanelUIAbility iPanelUIAbility;
        String aid;
        o.LJIIIZ(v, "v");
        boolean LIZ = C2MX.LIZ().LIZ(this.LJLJI);
        String str2 = this.LJLJJI.LJLJI;
        if (str2 == null) {
            str2 = "long_press";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        c188727au.LJIIIZ("panel_source", str2);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        FMX.LJIIL("click_clear_mode", c188727au.LIZ);
        C2U8.LIZ(new C245249js(C9XV.LONG_PRESS.getType(), str2, !LIZ));
        boolean z = false;
        if (C52480Kii.LIZ() && C34076DYy.LIZ && !C3ZH.LIZ.getBoolean("already_shown_pinch_clear_guide", false)) {
            z = true;
        }
        if (!LIZ && z && (fragment = this.LJLJJI.LJLJJLL) != null && (LJFF = KR8.LJFF(fragment)) != null && (iPanelUIAbility = (IPanelUIAbility) C55096Ljo.LIZ(LJFF, IPanelUIAbility.class, null)) != null) {
            String str4 = this.LJLJI;
            Aweme aweme2 = this.LJLILLLLZI;
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                str3 = aid;
            }
            iPanelUIAbility.openPinchToClearGuide(str4, str3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62441Oez(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
    }
}
