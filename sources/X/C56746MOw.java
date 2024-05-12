package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.ss.android.ugc.aweme.experiment.CleanUpPushPermissionConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.MOw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56746MOw extends C56766MPq {
    public C56747MOx LJLILLLLZI;

    @Override // X.C56766MPq
    public final void LIZLLL() {
        C55879LwR.LIZJ(0, null);
    }

    @Override // X.C56766MPq
    public final void LJI() {
        C56747MOx c56747MOx = this.LJLILLLLZI;
        if (c56747MOx != null) {
            c56747MOx.LIZ();
        }
    }

    @Override // X.C56766MPq
    public final void LJIIIIZZ() {
        C56747MOx c56747MOx;
        C62822Ol8 c62822Ol8 = C97843si.LIZIZ;
        if (((CleanUpPushPermissionConfig) c62822Ol8.getValue()).group != 4 && ((CleanUpPushPermissionConfig) c62822Ol8.getValue()).group != 5 && C97843si.LIZ() && !C84763XOl.LJIIJJI && (c56747MOx = this.LJLILLLLZI) != null) {
            c56747MOx.LIZIZ();
        }
    }

    @Override // X.C56766MPq
    public final void LJIIIZ(View view, Bundle bundle) {
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        o.LJIIIZ(view, "view");
        ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = (ViewOnClickListenerC226978vV) LJIIJJI(R.id.dxc);
        viewOnClickListenerC226978vV.setIconImage(MN5.LIZ(R.raw.icon_bell));
        viewOnClickListenerC226978vV.setCloseImage(MN5.LIZ(R.raw.icon_x_mark_small));
        SpannableString spannableString = new SpannableString(C86V.LJFF(R.string.hdw));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C42398GkU.LIZIZ(C86V.LJFF(R.string.hdx), ' '));
        if (LIZ().getContext() != null) {
            Context context = LIZ().getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.eb, context)) != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            } else {
                foregroundColorSpan = null;
            }
            spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 34);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        viewOnClickListenerC226978vV.setTitleText(spannableStringBuilder);
        C55879LwR.LIZLLL = new WeakReference<>(viewOnClickListenerC226978vV);
        C56747MOx c56747MOx = new C56747MOx(viewOnClickListenerC226978vV, new MQF());
        this.LJLILLLLZI = c56747MOx;
        c56747MOx.LIZLLL = MPS.Message;
        c56747MOx.LIZ();
    }
}
