package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9NX, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9NX extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MyProfileGuideWidgetV2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9NX(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
        super(0);
        this.LJLIL = myProfileGuideWidgetV2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        final ViewOnClickListenerC226978vV LIZLLL = this.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            final MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.LJLIL;
            myProfileGuideWidgetV2.getClass();
            LIZLLL.setIconImage(R.drawable.bxz);
            LIZLLL.setTitleText(R.string.qxp);
            String string = C77125UOr.LIZJ(myProfileGuideWidgetV2).getString(R.string.qxk);
            o.LJIIIIZZ(string, "activity.getString(R.str…ting_storage_mgmt_manage)");
            SpannableString spannableString = new SpannableString(QZP.LIZIZ("(.)", string, "\u2060"));
            Integer LJI = C79045V0n.LJI(R.attr.bx, C77125UOr.LIZJ(myProfileGuideWidgetV2));
            if (LJI != null) {
                spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), 0, spannableString.length(), 18);
            }
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            LIZLLL.setTitleText(new SpannableStringBuilder(C77125UOr.LIZJ(myProfileGuideWidgetV2).getString(R.string.qxp)).append((CharSequence) spannableString));
            LIZLLL.setOnInternalClickListener(new InterfaceC226988vW() { // from class: X.9NY
                @Override // X.InterfaceC226988vW
                public final void LIZ() {
                    C87030YDq.LIZIZ.logShowProfileDiskManagerGuideView();
                    LIZLLL.setVisibility(8);
                }

                @Override // X.InterfaceC226988vW
                public final void LIZIZ() {
                    C87030YDq c87030YDq = C87030YDq.LIZIZ;
                    c87030YDq.logShowProfileDiskManagerGuideView();
                    BaseMyProfileGuideWidget baseMyProfileGuideWidget = myProfileGuideWidgetV2;
                    baseMyProfileGuideWidget.getClass();
                    c87030YDq.startDiskManagerActivity(C77125UOr.LIZJ(baseMyProfileGuideWidget));
                    LIZLLL.setVisibility(8);
                }
            });
            if (C99W.LIZ) {
                View findViewById = LIZLLL.findViewById(R.id.h41);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                Context context = LIZLLL.getContext();
                o.LJIIIIZZ(context, "noticeBar.context");
                findViewById.setBackground(c110614Vt.LIZ(context));
            }
            LIZLLL.setVisibility(0);
        }
        return C76800UCe.LIZ;
    }
}
