package kotlin.jvm.internal;

import X.AMP;
import X.AbstractC56327M8t;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C04270Et;
import X.C04330Ez;
import X.C235759Nb;
import X.C235769Nc;
import X.C255179zt;
import X.C255199zv;
import X.C255209zw;
import X.C27561Arl;
import X.C36636EZk;
import X.C72912tb;
import X.C76800UCe;
import X.C77125UOr;
import X.C79045V0n;
import X.C8W0;
import X.C96E;
import X.C99W;
import X.EnumC255169zs;
import X.InterfaceC88473Ynt;
import X.SY4;
import X.ViewOnClickListenerC252769w0;
import X.XKX;
import Y.ARunnableS15S0300000_4;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDqS36S0300000_4 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS36S0300000_4(ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0, MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState, int i) {
        super(3);
        this.$t = i;
        this.l0 = viewOnClickListenerC252769w0;
        this.l1 = myProfileGuideWidgetV2;
        this.l2 = myProfileGuideState;
    }

    public static final Object invoke$0(IDqS36S0300000_4 iDqS36S0300000_4, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((PdpBottomNavBarWidget) iDqS36S0300000_4.l0), C36636EZk.LIZ, null, new C27561Arl(booleanValue, (View) iDqS36S0300000_4.l1, toastMsg, (PdpBottomNavBarWidget) iDqS36S0300000_4.l0, (View) iDqS36S0300000_4.l2, obj3, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS36S0300000_4 iDqS36S0300000_4, Object obj, Object refreshState, Object obj2) {
        C8W0 selectSubscribe = (C8W0) obj;
        Integer num = (Integer) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(refreshState, "refreshState");
        if ((refreshState instanceof C72912tb) && num != null && num.intValue() == 2 && !C96E.LIZ()) {
            new SafeHandler(selectSubscribe).postDelayed(new ARunnableS15S0300000_4((BottomBarAssem) iDqS36S0300000_4.l0, (View) iDqS36S0300000_4.l1, (TuxTextView) iDqS36S0300000_4.l2, 5), TimeUnit.SECONDS.toMillis(1L));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS36S0300000_4 iDqS36S0300000_4, Object selectSubscribe, Object obj, Object obj2) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Boolean bool = Boolean.FALSE;
        if (!o.LJ(obj, bool)) {
            Boolean bool2 = Boolean.TRUE;
            if (!o.LJ(obj2, bool2)) {
                if (o.LJ(obj, bool2)) {
                    if (((ViewOnClickListenerC252769w0) iDqS36S0300000_4.l0).getVisibility() == 0) {
                        ((ViewOnClickListenerC252769w0) iDqS36S0300000_4.l0).setVisibility(8);
                    }
                    ((BaseMyProfileGuideWidget) iDqS36S0300000_4.l1).LJI().Hv0(AMP.LJLIL);
                }
                return C76800UCe.LIZ;
            }
        }
        if (((ViewOnClickListenerC252769w0) iDqS36S0300000_4.l0).getVisibility() != 0) {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) iDqS36S0300000_4.l1;
            MyProfileGuideState myProfileGuideState = (MyProfileGuideState) iDqS36S0300000_4.l2;
            baseMyProfileGuideWidget.getClass();
            o.LJIIIZ(myProfileGuideState, "myProfileGuideState");
            int i = 0;
            if (myProfileGuideState.getNeedShowBindPhoneNumberNotice() && C255199zv.LJIIL()) {
                SY4 sy4 = (SY4) ((ViewOnClickListenerC252769w0) iDqS36S0300000_4.l0).findViewById(R.id.ezm);
                if (o.LJ(obj2, bool)) {
                    if (C99W.LIZ) {
                        if (sy4 != null) {
                            sy4.setButtonVariant(0);
                        }
                    } else if (sy4 != null) {
                        sy4.setBackground(C04270Et.LIZIZ(sy4.getContext(), R.drawable.byk));
                        Context context = sy4.getContext();
                        o.LJIIIIZZ(context, "button.context");
                        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                        if (LJI != null) {
                            i = LJI.intValue();
                        }
                        sy4.setTextColor(i);
                    }
                } else if (sy4 != null) {
                    sy4.setBackground(C04270Et.LIZIZ(sy4.getContext(), R.drawable.byl));
                    sy4.setTextColor(C04330Ez.LIZIZ(sy4.getContext(), R.color.ck));
                }
                BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = (BaseMyProfileGuideWidget) iDqS36S0300000_4.l1;
                baseMyProfileGuideWidget2.getClass();
                ActivityC45651qj LIZJ = C77125UOr.LIZJ(baseMyProfileGuideWidget2);
                o.LJII(LIZJ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                final C235769Nc LIZ = C235759Nb.LIZ(LIZJ);
                final AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4((ViewOnClickListenerC252769w0) iDqS36S0300000_4.l0, (BaseMyProfileGuideWidget) iDqS36S0300000_4.l1, 36);
                PopupManager.LJIIL(new AbstractC56327M8t<View>(LIZ, aqS151S0200000_4) { // from class: X.97M
                    public final InterfaceC65784Pro<View> LJLIL;
                    public final int LJLILLLLZI = 448;

                    @Override // X.InterfaceC56321M8n
                    public final int getPriority() {
                        return this.LJLILLLLZI;
                    }

                    @Override // com.bytedance.poplayer.IPopupTask
                    public final Object showPopup(C54082LKk context2) {
                        o.LJIIIZ(context2, "context");
                        return this.LJLIL.invoke();
                    }

                    {
                        this.LJLIL = aqS151S0200000_4;
                    }
                });
                C255179zt LIZ2 = new C255179zt().LIZ();
                LIZ2.LIZJ.storeLong("last_show_time", System.currentTimeMillis());
                C255209zw.LIZ(EnumC255169zs.SHOW.getType());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS36S0300000_4(PdpBottomNavBarWidget pdpBottomNavBarWidget, View view, View view2, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBottomNavBarWidget;
        this.l1 = view;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS36S0300000_4(BottomBarAssem bottomBarAssem, View view, TuxTextView tuxTextView, int i) {
        super(3);
        this.$t = i;
        this.l0 = bottomBarAssem;
        this.l1 = view;
        this.l2 = tuxTextView;
    }
}
