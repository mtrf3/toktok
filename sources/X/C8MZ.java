package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8MZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Aweme aweme, TuxIconView tuxIconView) {
        String str;
        String str2 = null;
        if (context instanceof InterfaceC229748zy) {
            MixFlowParam mixFlowParam = aweme.mixFlowParam;
            if (mixFlowParam != null) {
                str = mixFlowParam.getFrom();
            } else {
                str = null;
            }
            if (!o.LJ(str, "from_search_mix")) {
                if (C90193gN.LIZ()) {
                    if (tuxIconView != null) {
                        tuxIconView.setRotation(90.0f);
                    }
                } else if (tuxIconView != null) {
                    tuxIconView.setRotation(270.0f);
                }
            }
            MixFlowParam mixFlowParam2 = aweme.mixFlowParam;
            if (mixFlowParam2 != null) {
                str2 = mixFlowParam2.getFrom();
            }
            if (o.LJ(str2, "from_search_mix") && ((Number) JP2.LIZ.getValue()).intValue() == 2) {
                if (C90193gN.LIZ()) {
                    if (tuxIconView == null) {
                        return;
                    }
                    tuxIconView.setRotation(180.0f);
                } else {
                    if (tuxIconView == null) {
                        return;
                    }
                    tuxIconView.setRotation(0.0f);
                }
            }
        }
    }

    public static final void LIZIZ(Aweme aweme, ConstraintLayout constraintLayout, String str) {
        SmartImageView smartImageView;
        if (constraintLayout == null) {
            return;
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.mia);
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.a7n);
        C116724i4 c116724i4 = new C116724i4();
        String content = aweme.getAwemeRiskModel().getContent();
        o.LJIIIIZZ(content, "mAweme.awemeRiskModel.content");
        c116724i4.LIZIZ(content);
        C2059186h.LIZ(textView, c116724i4.LIZ);
        View findViewById = constraintLayout.findViewById(R.id.e_q);
        if ((findViewById instanceof SmartImageView) && (smartImageView = (SmartImageView) findViewById) != null) {
            W5F LJ = W5U.LJ(R.drawable.aii);
            LJ.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJ);
        }
        int i = 0;
        if (!TextUtils.isEmpty(aweme.getAwemeRiskModel().getUrl())) {
            imageView.setVisibility(0);
            C16880lQ.LJIIL(constraintLayout, new ACListenerS38S0200000_3(aweme, constraintLayout, 67));
            i = 1;
        } else {
            imageView.setVisibility(8);
            C16880lQ.LJIIL(constraintLayout, new View.OnClickListener() { // from class: X.8Ma
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("content", aweme.getAwemeRiskModel().getContent());
        c188727au.LIZLLL(i, "is_clickable");
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("info_bar_show", c188727au.LIZ);
    }
}
