package X;

import Y.ACListenerS28S0400000_4;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.BaGrowthMessageInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.api.BAProfileGrowthShowApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("ba_growth_view")
/* renamed from: X.9uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252129uy extends M71 {
    public final ViewOnClickListenerC252769w0 LJLIL;
    public final Context LJLILLLLZI;
    public final C73318Sq2 LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 440;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        int LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        final AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(wrapper, 1);
        final ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0 = this.LJLIL;
        if (viewOnClickListenerC252769w0 == null) {
            return;
        }
        if (C53765L8f.LJIIJJI()) {
            LIZIZ = 0;
        } else {
            LIZIZ = C7MY.LIZIZ(56);
        }
        C45804HyK.LJJL(LIZIZ, viewOnClickListenerC252769w0);
        final User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        try {
            final BaGrowthMessageInfo baGrowthMessageInfo = (BaGrowthMessageInfo) SettingsManager.LIZLLL().LJIIIIZZ("ba_growth_banner_info", BaGrowthMessageInfo.class, null);
            if (baGrowthMessageInfo == null) {
                return;
            }
            String title = baGrowthMessageInfo.getTitle();
            if (title != null) {
                viewOnClickListenerC252769w0.setTitleText(title);
            }
            String bodyText = baGrowthMessageInfo.getBodyText();
            if (bodyText != null) {
                viewOnClickListenerC252769w0.setContextText(bodyText);
            }
            String buttonText = baGrowthMessageInfo.getButtonText();
            if (buttonText != null) {
                viewOnClickListenerC252769w0.setItemText(buttonText);
            }
            viewOnClickListenerC252769w0.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0400000_4(viewOnClickListenerC252769w0, aqS154S0100000_4, this, baGrowthMessageInfo, 0)));
            viewOnClickListenerC252769w0.setOnInternalClickListener(new InterfaceC252779w1() { // from class: X.9uz
                @Override // X.InterfaceC252779w1
                public final void LIZ() {
                    ViewOnClickListenerC252769w0.this.setVisibility(8);
                    aqS154S0100000_4.invoke();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("message_id", baGrowthMessageInfo.getMessageId());
                    c188727au.LJIIIZ("user_id", curUser.getUid());
                    FMX.LJIIL("ttelite_BA_acq_profile_msg_x_click", c188727au.LIZ);
                }

                @Override // X.InterfaceC252779w1
                public final void LIZIZ() {
                    ViewOnClickListenerC252769w0.this.setVisibility(8);
                    aqS154S0100000_4.invoke();
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("message_id", baGrowthMessageInfo.getMessageId());
                    c188727au.LJIIIZ("user_id", curUser.getUid());
                    c188727au.LJIIIZ("cta_url", baGrowthMessageInfo.getLandingPageSchema());
                    FMX.LJIIL("ttelite_BA_acq_profile_msg_cta_click", c188727au.LIZ);
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI, baGrowthMessageInfo.getLandingPageSchema());
                    buildRoute.addFlags(268435456);
                    buildRoute.open();
                }

                @Override // X.InterfaceC252779w1
                public final void LIZJ() {
                    ViewOnClickListenerC252769w0.this.setVisibility(8);
                    aqS154S0100000_4.invoke();
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI, baGrowthMessageInfo.getLandingPageSchema());
                    buildRoute.addFlags(268435456);
                    buildRoute.open();
                }
            });
            viewOnClickListenerC252769w0.post(new ARunnableS37S0100000_1(viewOnClickListenerC252769w0, 2));
            if (C99W.LIZ) {
                View LIZ = viewOnClickListenerC252769w0.LIZ(R.id.h3w);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ct);
                Context context2 = viewOnClickListenerC252769w0.getContext();
                o.LJIIIIZZ(context2, "it.context");
                LIZ.setBackground(c110614Vt.LIZ(context2));
                viewOnClickListenerC252769w0.LIZ(R.id.ezm).getClass();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("message_id", baGrowthMessageInfo.getMessageId());
            c188727au.LJIIIZ("user_id", curUser.getUid());
            c188727au.LIZLLL(curUser.getAccountType(), "user_status");
            FMX.LJIIL("ttelite_BA_acq_profile_msg_show", c188727au.LIZ);
            String messageId = baGrowthMessageInfo.getMessageId();
            if (messageId == null) {
                return;
            }
            C73318Sq2 c73318Sq2 = this.LJLJI;
            BAProfileGrowthShowApi.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            c73318Sq2.LIZ(((BAProfileGrowthShowApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(BAProfileGrowthShowApi.class)).sendMessageIsShown(messageId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9FF
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9FG
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252129uy(ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0, ActivityC45651qj activity, InterfaceC55643Lsd scene) {
        super(scene);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = viewOnClickListenerC252769w0;
        this.LJLILLLLZI = activity;
        this.LJLJI = new C73318Sq2();
    }
}
