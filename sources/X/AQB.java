package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("profile_views_guide")
/* loaded from: classes5.dex */
public final class AQB extends M71 {
    public final FragmentManager LJLIL;
    public final InterfaceC82683Wch LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return LiveChatShowDelayForHotLiveSetting.DEFAULT;
    }

    public static void LJIIIZ(int i, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("enter_method", "auto_scene");
        c188727au.LJIIIZ("pop_up_type", "one_button");
        c188727au.LIZLLL(i, "to_status");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("profile_visitor_pop_up_click", c188727au.LIZ);
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        InterfaceC82683Wch interfaceC82683Wch;
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        if (C26149AOb.LIZ()) {
            Context context2 = context.LIZ;
            String string = context2.getString(R.string.p6q);
            o.LJIIIIZZ(string, "ctx.getString(R.string.p…heet_desc_turn_off_where)");
            String string2 = context2.getString(R.string.p6p, string);
            o.LJIIIIZZ(string2, "ctx.getString(\n         …        portal,\n        )");
            C91883j6 c91883j6 = new C91883j6(context2);
            C26224AQy c26224AQy = new C26224AQy();
            if (AnonymousClass636.LJIILJJIL(context2)) {
                i = R.drawable.bzi;
            } else {
                i = R.drawable.bzh;
            }
            c26224AQy.LIZ = C04270Et.LIZIZ(context2, i);
            c26224AQy.LIZLLL = 0;
            String string3 = context2.getString(R.string.pgg);
            o.LJIIIIZZ(string3, "ctx.getString(R.string.p…ssion_action_sheet_title)");
            c26224AQy.LJ = string3;
            String string4 = context2.getString(R.string.pge);
            o.LJIIIIZZ(string4, "ctx.getString(R.string.p…_action_sheet_desc_allow)");
            String string5 = context2.getString(R.string.pgf);
            o.LJIIIIZZ(string5, "ctx.getString(R.string.p…on_action_sheet_desc_see)");
            c26224AQy.LJ(new C26220AQu(string4, true), new C26220AQu(string5, true), new C26220AQu(string2, true));
            c26224AQy.LJIIL = c91883j6;
            c26224AQy.LJIILIIL = true;
            String string6 = context2.getString(R.string.q8h);
            AQD aqd = AQD.LJLIL;
            c26224AQy.LJII = string6;
            c26224AQy.LJIIIZ = aqd;
            ASL LIZ = c26224AQy.LIZ();
            AQK aqk = new AQK(wrapper, this, context, c91883j6);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLILLLLZI = aqk;
            if (this.LJLIL != null) {
                C26343AVn.LIZJ = true;
                if (!AQF.LIZ()) {
                    Keva.getRepo("profile_viewer_dialog_keva_repo_name").storeBoolean(C226788vC.LIZ("profile_viewer_dialog_has_show"), true);
                } else {
                    C25170yn.LIZ(C09160Xo.LIZ("social", "profile"), "profile_viewer_dialog_keva_repo_name").LJI("profile_viewer_dialog_has_show", true);
                }
                tuxSheet.show(this.LJLIL, "ProfileViewerDialog");
                return;
            }
            return;
        }
        if (C26149AOb.LIZ() || (interfaceC82683Wch = this.LJLILLLLZI) == null) {
            return;
        }
        interfaceC82683Wch.LIZIZ(new AQC(wrapper));
        C26343AVn.LIZJ = true;
        if (!AQF.LIZ()) {
            Keva.getRepo("keva_repo_profile_viewer").storeBoolean(C226788vC.LIZ("profile_entrance_tips_has_show"), true);
        } else {
            C25170yn.LIZ(C09160Xo.LIZ("social", "profile"), "keva_repo_profile_viewer").LJI("profile_entrance_tips_has_show", true);
        }
        this.LJLILLLLZI.show();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQB(InterfaceC56322M8o pagePopupScene, FragmentManager fragmentManager, InterfaceC82683Wch interfaceC82683Wch) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        this.LJLIL = fragmentManager;
        this.LJLILLLLZI = interfaceC82683Wch;
    }

    public static void LJIIIIZZ(int i, int i2, int i3) {
        C188727au c188727au = new C188727au();
        c188727au.LJI("pop_up_type", "one_button");
        c188727au.LIZLLL(i, "to_status");
        c188727au.LIZLLL(i2, "auth_result");
        if (i2 == 1) {
            c188727au.LIZLLL(i3, "status_code");
        }
        FMX.LJIIL("profile_visitor_pop_up_auth_result", c188727au.LIZ);
    }
}
