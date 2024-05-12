package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AAR extends ClickableSpan {
    public final /* synthetic */ String LJLIL = "privacy-policy";

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        TuxSheet tuxSheet = StaticAdExplainDialog.LJLJJL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.AD_EXPLANATION.getValue(), this.LJLIL, true, false, 20), new AAS());
                return;
            }
            return;
        }
        o.LJIJI("tuxSheet");
        throw null;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }
}
