package X;

import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ADb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC25863ADb implements View.OnClickListener {
    public final /* synthetic */ CreatorToolsActivity LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;

    public ViewOnClickListenerC25863ADb(CreatorToolsActivity creatorToolsActivity, Boolean bool) {
        this.LJLIL = creatorToolsActivity;
        this.LJLILLLLZI = bool;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C75 c75 = this.LJLIL.LJLJJL;
        if (c75 != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            Boolean useNewEntrance = this.LJLILLLLZI;
            o.LJIIIIZZ(useNewEntrance, "useNewEntrance");
            c75.LIZLLL(context, "creator_tools_page", "creator_tools_page", useNewEntrance.booleanValue(), "", new AqS154S0100000_4(this.LJLIL, 1196));
        }
        C25860ACy c25860ACy = this.LJLIL.LJLZ;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(C25864ADc.LJLIL);
        }
        Keva repo = Keva.getRepo("keva_repo_subs");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_red_dot");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        repo.storeBoolean(X1D.LIZIZ(LIZ), false);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "creator_tools");
        c188727au.LJIIIZ("click_position", "create_tools_page");
        HG3.LJIIL();
        c188727au.LJIIIZ("anchor_id", HG3.LJLJL.LJFF().getCurUserId());
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL.LJLJJLL).entrySet()) {
            c188727au.LJI((String) entry.getKey(), (String) entry.getValue());
        }
        FMX.LJIIL("livesdk_creator_subscription_icon_click", c188727au.LIZ);
    }
}
