package X;

import android.text.TextPaint;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217268fq {
    public final /* synthetic */ C8WO LIZ;
    public final /* synthetic */ View.OnClickListener LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, Boolean> LIZJ;

    public final void LIZ() {
        final C73305Spp statusView;
        SYL mentionList;
        C8WT c8wt = this.LIZ.LIZIZ;
        if (c8wt != null && (mentionList = c8wt.getMentionList()) != null) {
            mentionList.setVisibility(8);
        }
        C8WT c8wt2 = this.LIZ.LIZIZ;
        if (c8wt2 != null && (statusView = c8wt2.getStatusView()) != null) {
            final View.OnClickListener onClickListener = this.LIZIZ;
            String LIZLLL = C1DD.LIZLLL(R.string.hvd, "AppContextManager.getApp…ng.load_more_error_toast)");
            T5R t5r = new T5R(LIZLLL);
            t5r.LIZ(51);
            t5r.setSpan(new AnonymousClass899() { // from class: X.8fr
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    onClickListener.onClick(statusView);
                }
            }, 0, LIZLLL.length(), 18);
            statusView.setVisibility(0);
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LJI = t5r;
            c73306Spq.LJIIJ = C217288fs.LIZ;
            statusView.setStatus(c73306Spq);
        }
    }

    public final void LIZIZ(boolean z) {
        C73305Spp statusView;
        C73305Spp statusView2;
        if (z) {
            C8WT c8wt = this.LIZ.LIZIZ;
            if (c8wt == null || (statusView2 = c8wt.getStatusView()) == null) {
                return;
            }
            statusView2.setVisibility(8);
            return;
        }
        C8WT c8wt2 = this.LIZ.LIZIZ;
        if (c8wt2 == null || (statusView = c8wt2.getStatusView()) == null) {
            return;
        }
        statusView.setVisibility(0);
        statusView.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C217268fq(C8WO c8wo, View.OnClickListener onClickListener, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns) {
        this.LIZ = c8wo;
        this.LIZIZ = onClickListener;
        this.LIZJ = interfaceC88472Yns;
    }
}
