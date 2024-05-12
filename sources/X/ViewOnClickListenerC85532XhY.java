package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XhY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC85532XhY implements View.OnClickListener {
    public final /* synthetic */ BaseLoginMethod LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C85531XhX LJLJI;
    public final /* synthetic */ C85533XhZ LJLJJI;

    public ViewOnClickListenerC85532XhY(BaseLoginMethod baseLoginMethod, long j, C85531XhX c85531XhX, C85533XhZ c85533XhZ) {
        this.LJLIL = baseLoginMethod;
        this.LJLILLLLZI = j;
        this.LJLJI = c85531XhX;
        this.LJLJJI = c85533XhZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", this.LJLIL.getUid());
        c188727au.LJIIIZ("last_active", R3P.LIZ(this.LJLILLLLZI));
        c188727au.LJIIIZ("platform", R5D.LIZIZ(this.LJLIL));
        c188727au.LIZLLL(this.LJLJI.LJLIL.size(), "user_cnt");
        FMX.LJIIL("login_notify_click_edit", c188727au.LIZ);
        C41424GNo c41424GNo = new C41424GNo(this.LJLJJI.LJLIL.getContext());
        c41424GNo.LIZ(new String[]{C88913eJ.LIZ(this.LJLJJI.LJLIL, R.string.u4, "view.context.getString(R.string.Save_panel_remove)")}, new DialogInterfaceOnClickListenerC85534Xha(this.LJLIL, this.LJLJJI, this.LJLJI));
        c41424GNo.LIZIZ();
    }
}
