package X;

import Y.ACListenerS44S1100000_5;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BNn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28683BNn extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28683BNn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinkedHashMap LJFF = C62850Ola.LJFF(context, "context");
        this.LJLIL = LJFF;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d1t, this, true);
        LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
        LiveRechargeAgreementConfig value = liveRoomRechargeAgreementConfigSetting.getValue();
        value = value == null ? liveRoomRechargeAgreementConfigSetting.getDEFAULT() : value;
        boolean z = value.isShowRechargeLawInGlobal;
        TextView textView = (TextView) getRootView().findViewById(R.id.lzg);
        C29306Beo.LJJLIIIJJI(textView, z);
        if (z) {
            String globalAgreementUrl = value.agreementForGlobal;
            String hintAgreement = C15380j0.LJIILJJIL(R.string.ml7);
            String lawName = C15380j0.LJIILJJIL(R.string.me0);
            o.LJIIIIZZ(hintAgreement, "hintAgreement");
            String LIZIZ = Q8U.LIZIZ(new Object[]{lawName}, 1, hintAgreement, "format(format, *args)");
            SpannableString spannableString = new SpannableString(LIZIZ);
            Context context2 = getRootView().getContext();
            if (context2 != null) {
                o.LJIIIIZZ(globalAgreementUrl, "globalAgreementUrl");
                BK7 bk7 = new BK7(globalAgreementUrl, context2);
                o.LJIIIIZZ(lawName, "lawName");
                spannableString.setSpan(bk7, s.LJJLIIIJL(LIZIZ, lawName, 0, false, 6), lawName.length() + s.LJJLIIIJL(LIZIZ, lawName, 0, false, 6), 17);
            }
            textView.setText(spannableString);
            textView.setHighlightColor(C15380j0.LIZIZ(R.color.cz));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        LiveRechargeAgreementConfig value2 = liveRoomRechargeAgreementConfigSetting.getValue();
        value2 = value2 == null ? liveRoomRechargeAgreementConfigSetting.getDEFAULT() : value2;
        boolean z2 = value2.isShowRechargeLawInRegion;
        View view = (View) LJFF.get(Integer.valueOf(R.id.g1m));
        if (view == null) {
            view = findViewById(R.id.g1m);
            if (view != null) {
                LJFF.put(Integer.valueOf(R.id.g1m), view);
            } else {
                view = null;
            }
        }
        C29306Beo.LJJLIIIJJI(view, z2);
        if (!z2) {
            return;
        }
        C47121t6 c47121t6 = (C47121t6) getRootView().findViewById(R.id.m6t);
        C47121t6 c47121t62 = (C47121t6) getRootView().findViewById(R.id.mj_);
        String str = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawUrl;
        c47121t6.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawName);
        C16880lQ.LJJIIZ(c47121t6, new ACListenerS44S1100000_5(this, str, 2));
        String str2 = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawUrl;
        c47121t62.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawName);
        C16880lQ.LJJIIZ(c47121t62, new ACListenerS44S1100000_5(this, str2, 3));
    }
}
