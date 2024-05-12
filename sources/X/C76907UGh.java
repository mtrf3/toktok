package X;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCUtilsKt$destroyHandling$1;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftCpcFaqUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS26S0310000_13;
import kotlin.jvm.internal.AqS62S0110000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.UGh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76907UGh {
    public static final void LIZLLL(Context context, String str, boolean z) {
        BZI LIZ = C28787BRn.LIZ("livesdk_cpc_faq_click");
        LIZ.LJI();
        LIZ.LJIJJ(str, "click_from");
        LIZ.LJJIIJZLJL();
        android.net.Uri parse = UriProtector.parse(LiveGiftCpcFaqUrlSetting.INSTANCE.getValue());
        parse.buildUpon().appendQueryParameter("show_from", str);
        parse.buildUpon().appendQueryParameter("enter_from_merge", BJM.LJFF());
        parse.buildUpon().appendQueryParameter("enter_method", BJM.LJIIIIZZ());
        if (z) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IActionHandlerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IActionHandlerService::class.java)");
            IActionHandlerService iActionHandlerService = (IActionHandlerService) LIZ2;
            o.LJIIIZ(context, "context");
            String queryParameter = UriProtector.getQueryParameter(parse, "url");
            if (queryParameter == null) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(queryParameter);
            LIZ3.append("?landscape=1&trait_mode=dark");
            android.net.Uri LJJIJL = C29306Beo.LJJIJL(C29306Beo.LJJIJL(parse, "url", X1D.LIZIZ(LIZ3)), "height", String.valueOf((int) C15380j0.LJIJ(-1)));
            String valueOf = String.valueOf((int) C15380j0.LJIJ(C15380j0.LJFF(R.dimen.ad9)));
            Uri.Builder appendQueryParameter = LJJIJL.buildUpon().appendQueryParameter("width", valueOf).appendQueryParameter("landscape_width", valueOf);
            if (TextUtils.isEmpty(UriProtector.getQueryParameter(LJJIJL, "land_scape_custom_gravity"))) {
                appendQueryParameter.appendQueryParameter("land_scape_custom_gravity", "1");
            }
            iActionHandlerService.handle(context, appendQueryParameter.build());
            return;
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
    }

    public static final void LIZJ(boolean z, String str, TextView textView, TextView textView2, String str2) {
        String str3;
        String LIZIZ;
        if (!z) {
            str3 = "%s %s";
        } else {
            str3 = "%s\n\n%s";
        }
        Object[] objArr = new Object[2];
        objArr[0] = textView.getText().toString();
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        String LLLZ = C16880lQ.LLLZ(str3, Arrays.copyOf(objArr, 2));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        OSZ<String, String> LIZ = C15670jT.LIZ(LLLZ, "[", "]");
        String first = LIZ.getFirst();
        String second = LIZ.getSecond();
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "promptTextView.context");
        textView.setText(C15670jT.LIZJ(context, second, null, 0, first, null, 92));
        if (str2 != null && C29306Beo.LJIJJLI(str2)) {
            C29306Beo.LJJLJLI(textView2);
            if (C15380j0.LJIIZILJ()) {
                LIZIZ = Q8U.LIZIZ(new Object[]{"<", str2}, 2, "%s %s", "format(format, *args)");
            } else {
                LIZIZ = Q8U.LIZIZ(new Object[]{str2, ">"}, 2, "%s %s", "format(format, *args)");
            }
            textView2.setText(LIZIZ);
            C16880lQ.LJIJI(textView2, ViewOnClickListenerC76910UGk.LJLIL);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C29306Beo.LJI(textView2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.CountDownTimer, T] */
    public static final void LJ(InterfaceC151715xP jediView, LiveCPCViewModel cpcViewModel, T4Y t4y, boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(jediView, "jediView");
        o.LJIIIZ(cpcViewModel, "cpcViewModel");
        if (!C46104I7o.LJJJJI()) {
            if (C46104I7o.LJJIJIIJI()) {
                interfaceC88472Yns.invoke(Boolean.valueOf(C46104I7o.LJJ().giftFaq));
            }
            if (t4y != null) {
                C29306Beo.LJI(t4y);
                return;
            }
            return;
        }
        C68322mC c68322mC = new C68322mC();
        if (C46104I7o.LJJJJ()) {
            cpcViewModel.withState(new AqS178S0100000_12(cpcViewModel, 73));
            C73156SnQ.LJIIL(jediView, cpcViewModel, new AqS26S0310000_13(c68322mC, (C68322mC<CountDownTimer>) t4y, (T4Y) z, (boolean) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 0));
        } else {
            CpcPromptResponse LJJ = C46104I7o.LJJ();
            c68322mC.element = LIZ(t4y, EnumC76908UGi.SCENE_1_GIFT_PANEL, LJJ.prompt, LJJ.redirectLinkText, LJJ.giftFaq, z, interfaceC88472Yns, null);
        }
        Lifecycle lifecycle = jediView.getLifecycle();
        o.LJIIIIZZ(lifecycle, "this.lifecycle");
        lifecycle.addObserver(new CPCUtilsKt$destroyHandling$1(new AqS155S0100000_5(c68322mC, (C68322mC<CountDownTimer>) 30)));
    }

    public static final CountDownTimer LIZ(T4Y t4y, EnumC76908UGi enumC76908UGi, String str, String str2, boolean z, boolean z2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        long j;
        CountDownTimer countDownTimer = null;
        if (t4y != null) {
            if (str == null || str.length() == 0) {
                C29306Beo.LJI(t4y);
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.valueOf(z));
                }
                return null;
            }
            C29306Beo.LJIIIZ(t4y);
            String str3 = "";
            if (str == null) {
                str = "";
            }
            if (str2 != null) {
                str3 = str2;
            }
            t4y.LJLILLLLZI = str;
            t4y.LJLJI = str3;
            t4y.requestLayout();
            Long valueOf = Long.valueOf(C46104I7o.LJJ().timeIntervalForDisplay * 1000);
            if (valueOf.longValue() > 0) {
                j = valueOf.longValue();
            } else {
                j = 10000;
            }
            countDownTimer = new CountDownTimerC32307Cm7(j, t4y, interfaceC88472Yns, z, interfaceC65784Pro).start();
            t4y.setOnText2Clicked(new AqS62S0110000_5(t4y, z2, 1));
            C29306Beo.LJJLJLI(t4y);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            int i = C76909UGj.LIZ[enumC76908UGi.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_goal_cpc_popup");
                    LIZ.LJI();
                    LIZ.LJJIIJZLJL();
                }
            } else {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_panel_cpc_popup");
                LIZ2.LJI();
                LIZ2.LJJIIJZLJL();
            }
        }
        return countDownTimer;
    }
}
