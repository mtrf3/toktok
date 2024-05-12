package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.A7q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25722A7q extends AbstractC188397aN {
    public final /* synthetic */ PaidContentCollectionDetailDescriptionAssem LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        IPrivacyDisclaimerUtil LJI = PrivacyDisclaimerUtilService.LJI();
        Context context = this.LJLJJI.getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        LJI.LIZLLL(context);
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
        ds.setUnderlineText(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25722A7q(int i, int i2, PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem) {
        super(i, i2);
        this.LJLJJI = paidContentCollectionDetailDescriptionAssem;
    }
}
