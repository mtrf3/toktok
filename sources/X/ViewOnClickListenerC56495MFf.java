package X;

import android.view.View;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;

/* renamed from: X.MFf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56495MFf implements View.OnClickListener {
    public static final ViewOnClickListenerC56495MFf LJLIL = new ViewOnClickListenerC56495MFf();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (LIZ != null) {
            if (!LIZ.publishService().checkIsAlreadyPublished(view.getContext())) {
                return;
            }
            String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
            LIZ.asyncService("PostGuide", new C56494MFe(view, LIZ2));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("shoot_way", "optimize_profile");
            c188727au.LJIIIZ("creation_id", LIZ2);
            FMX.LJIIL("shoot", c188727au.LIZ);
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "personal_homepage");
        c188727au2.LJIIIZ("action_type", "click");
        c188727au2.LJIIIZ("optimize_type", "shoot");
        FMX.LJIIL("optimize_profile", c188727au2.LIZ);
    }
}
