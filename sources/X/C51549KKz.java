package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.KKz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51549KKz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(IRB.LJLIL);

    public static void LIZJ(ActivityC45651qj fragmentActivity) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        String string = fragmentActivity.getString(R.string.f1);
        o.LJIIIIZZ(string, "fragmentActivity.getStri…adScreen_tipsPanel_body1)");
        int i = 0;
        String string2 = fragmentActivity.getString(R.string.f2);
        o.LJIIIIZZ(string2, "fragmentActivity.getStri…adScreen_tipsPanel_body2)");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(LIZIZ(fragmentActivity, string), LIZIZ(fragmentActivity, string2));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bhx, C16880lQ.LLZIL(fragmentActivity), null);
        ViewGroup viewGroup = (ViewGroup) LLLZIIL.findViewById(R.id.l4e);
        for (Object obj : LJJIJIIJI) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) obj;
                if (i != 0) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = (int) KL2.LIZJ(fragmentActivity, 10.0f);
                    view.setLayoutParams(layoutParams);
                }
                viewGroup.addView(view);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LLLZIIL.findViewById(R.id.dxz).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(LLLZIIL, 55)));
        Forest LIZ2 = C39914FlW.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setChannel("tiktok_tool_aigc_avatar");
        requestParams.setBundle("intro_image.png");
        requestParams.setWaitGeckoUpdate(true);
        LIZ2.fetchResourceAsync("", requestParams, new AqS167S0100000_1(LLLZIIL, 233));
        ASL asl = new ASL();
        asl.LIZ.LJLLI = LLLZIIL;
        asl.LJI(1);
        C1DG.LJII(fragmentActivity, "fragmentActivity.supportFragmentManager", asl.LIZ, "fast_path_sheet_tag");
    }

    public static void LIZ(ActivityC45651qj activity, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(activity, "activity");
        if (!C78605Ut7.LIZLLL()) {
            HVR.LJ(activity, new C46521INp(interfaceC88472Yns), null, null, null, new TokenCert((String) C78605Ut7.LJIIJ("bpea-bpea-storage_for_aigc_album_target33", "bpea-storage_for_aigc_album")), 28);
        } else {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    public static View LIZIZ(Context context, String str) {
        LinearLayout LIZ2 = q.LIZ(context, 0);
        View view = new View(context);
        view.setBackground(context.getDrawable(R.drawable.sa));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) KL2.LIZJ(context, 4.0f), (int) KL2.LIZJ(context, 4.0f));
        layoutParams.setMarginStart((int) KL2.LIZJ(context, 4.0f));
        layoutParams.topMargin = (int) KL2.LIZJ(context, 7.5f);
        layoutParams.bottomMargin = (int) KL2.LIZJ(context, 7.5f);
        view.setLayoutParams(layoutParams);
        LIZ2.addView(view);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) KL2.LIZJ(context, 8.0f));
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setText(str);
        LIZ2.addView(tuxTextView);
        return LIZ2;
    }
}
