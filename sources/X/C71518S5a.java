package X;

import Y.ACListenerS46S0200000_12;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionDebugAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S5a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71518S5a extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionDebugAssem, RVE, C76800UCe> {
    public static final C71518S5a INSTANCE = new C71518S5a();

    public C71518S5a() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoCLACaptionDebugAssem selectSubscribe, RVE debugData) {
        SY4 sy4;
        View view;
        View view2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(debugData, "debugData");
        if (C8LG.LIZ()) {
            if (selectSubscribe.LLFZ == null) {
                View findViewById = selectSubscribe.Y3().findViewById(R.id.c4b);
                o.LJIIIIZZ(findViewById, "contentView.debug_view_stub");
                if (findViewById.getVisibility() != 0) {
                    selectSubscribe.LLFZ = ((ViewStub) selectSubscribe.Y3().findViewById(R.id.c4b)).inflate();
                }
            }
            View view3 = selectSubscribe.LLFZ;
            TextView textView = null;
            if (view3 != null) {
                sy4 = (SY4) view3.findViewById(R.id.c48);
            } else {
                sy4 = null;
            }
            View view4 = selectSubscribe.LLFZ;
            if (view4 != null) {
                view = view4.findViewById(R.id.c40);
            } else {
                view = null;
            }
            View view5 = selectSubscribe.LLFZ;
            if (view5 != null) {
                view2 = view5.findViewById(R.id.c3v);
            } else {
                view2 = null;
            }
            View view6 = selectSubscribe.LLFZ;
            if (view6 != null) {
                textView = (TextView) view6.findViewById(R.id.c46);
            }
            View view7 = selectSubscribe.LLFZ;
            if (view7 != null) {
                view7.setVisibility(0);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (debugData.LJLIL) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (sy4 != null) {
                    sy4.LJJJJJ(Integer.valueOf(R.raw.icon_effect_fill));
                    sy4.setText("Caption Debug On");
                }
                if (selectSubscribe.q4().LLFF == null) {
                    if (view != null) {
                        view.setBackgroundColor(Color.argb(160, 52, 235, 64));
                    }
                } else if (o.LJ(selectSubscribe.q4().LLFF, Boolean.TRUE)) {
                    if (view != null) {
                        view.setBackgroundColor(Color.argb(160, 241, 184, 20));
                    }
                } else if (view != null) {
                    view.setBackgroundColor(Color.argb(160, 235, 52, 64));
                }
            } else {
                if (view != null) {
                    view.setVisibility(8);
                }
                if (sy4 != null) {
                    sy4.LJJJJJ(Integer.valueOf(R.raw.icon_effect));
                    sy4.setText("Caption Debug Off");
                }
            }
            if (textView != null) {
                SpannableString spannableString = new SpannableString(debugData.LJLILLLLZI);
                spannableString.setSpan(new BackgroundColorSpan(22289), 0, debugData.LJLILLLLZI.length(), 33);
                textView.setText(spannableString);
            }
            if (sy4 != null) {
                C16880lQ.LJJIZ(sy4, new ACListenerS46S0200000_12(selectSubscribe, debugData, 8));
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(VideoCLACaptionDebugAssem videoCLACaptionDebugAssem, RVE rve) {
        invoke2(videoCLACaptionDebugAssem, rve);
        return C76800UCe.LIZ;
    }
}
