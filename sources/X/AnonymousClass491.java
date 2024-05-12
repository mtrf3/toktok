package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerProductInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.491, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass491 extends FrameLayout implements C3WY {
    public final /* synthetic */ C3WQ LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public ECBannerContent LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass491(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    private final TuxIconView getCloseBtn() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-closeBtn>(...)");
        return (TuxIconView) value;
    }

    private final ConstraintLayout getContainer() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-container>(...)");
        return (ConstraintLayout) value;
    }

    private final TuxTextView getCostTv() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-costTv>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getCountTv() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-countTv>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getCtaTv() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-ctaTv>(...)");
        return (TuxTextView) value;
    }

    private final TuxTextView getNameTv() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-nameTv>(...)");
        return (TuxTextView) value;
    }

    private final SmartImageView getThumbNailIv() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-thumbNailIv>(...)");
        return (SmartImageView) value;
    }

    private final TuxTextView getTitleTv() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-titleTv>(...)");
        return (TuxTextView) value;
    }

    public final void LIZIZ() {
        final ECBannerContent eCBannerContent;
        Long l;
        String str;
        String str2;
        String str3;
        if (getVisibility() == 8) {
            setVisibility(0);
            if (this.LJLLI || (eCBannerContent = this.LJLL) == null || (l = eCBannerContent.orderId) == null) {
                return;
            }
            final long longValue = l.longValue();
            Keva kevaRepo = (Keva) AnonymousClass492.LIZ.getValue();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("inactivity_count");
            LIZ.append(longValue);
            kevaRepo.storeInt(C61845OOz.LIZ("inactivity_count", longValue), kevaRepo.getInt(X1D.LIZIZ(LIZ), 0) + 1);
            String str4 = this.LJLLJ;
            String str5 = this.LJLLL;
            C85323Wm LIZ2 = C772831o.LIZ();
            C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", "chat", "conversation_id", str4);
            LIZ3.put("to_user_id", str5);
            LIZ2.LIZIZ("show_ec_redirect_card", LIZ3);
            View.inflate(getContext(), R.layout.b1j, this);
            View findViewById = findViewById(R.id.ckl);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cr);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            findViewById.setBackground(c110614Vt.LIZ(context));
            this.LJLLI = true;
            getTitleTv().setText(eCBannerContent.header);
            TuxTextView nameTv = getNameTv();
            ECBannerProductInfo eCBannerProductInfo = eCBannerContent.productInfo;
            String str6 = null;
            if (eCBannerProductInfo != null) {
                str = eCBannerProductInfo.name;
            } else {
                str = null;
            }
            nameTv.setText(str);
            TuxTextView countTv = getCountTv();
            ECBannerProductInfo eCBannerProductInfo2 = eCBannerContent.productInfo;
            if (eCBannerProductInfo2 != null) {
                str2 = eCBannerProductInfo2.amount;
            } else {
                str2 = null;
            }
            countTv.setText(str2);
            TuxTextView costTv = getCostTv();
            ECBannerProductInfo eCBannerProductInfo3 = eCBannerContent.productInfo;
            if (eCBannerProductInfo3 != null) {
                str6 = eCBannerProductInfo3.price;
            }
            costTv.setText(str6);
            getCtaTv().setText(eCBannerContent.btnText);
            ECBannerProductInfo eCBannerProductInfo4 = eCBannerContent.productInfo;
            if (eCBannerProductInfo4 != null && (str3 = eCBannerProductInfo4.thumbnail) != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str3);
                LJIIIIZZ.LJJIIJ = getThumbNailIv();
                int LIZIZ = C7MY.LIZIZ(64);
                int LIZIZ2 = C7MY.LIZIZ(64);
                LJIIIIZZ.LJII = LIZIZ;
                LJIIIIZZ.LJIIIIZZ = LIZIZ2;
                S3I s3i = new S3I();
                s3i.LIZLLL = C32151Nz.LJIIZILJ(6);
                LJIIIIZZ.LJIJJLI = new S3L(s3i);
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
            C16880lQ.LJJJ(getCloseBtn(), new ACListenerS21S0100000_1(this, 204));
            C16880lQ.LJIL(getContainer(), new View.OnClickListener() { // from class: X.490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnonymousClass491 anonymousClass491 = AnonymousClass491.this;
                    if (!anonymousClass491.LJLLILLLL) {
                        anonymousClass491.LJLLILLLL = true;
                        long j = longValue;
                        Keva kevaRepo2 = (Keva) AnonymousClass492.LIZ.getValue();
                        o.LJIIIIZZ(kevaRepo2, "kevaRepo");
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("inactivity_count");
                        LIZ4.append(j);
                        int i = kevaRepo2.getInt(X1D.LIZIZ(LIZ4), 0);
                        if (i > 0) {
                            kevaRepo2.storeInt(C61845OOz.LIZ("inactivity_count", j), i - 1);
                        }
                    }
                    SmartRouter.buildRoute(AnonymousClass491.this.getContext(), eCBannerContent.jumpLink).open();
                    AnonymousClass491 anonymousClass4912 = AnonymousClass491.this;
                    String str7 = anonymousClass4912.LJLLJ;
                    String str8 = anonymousClass4912.LJLLL;
                    C85323Wm LIZ5 = C772831o.LIZ();
                    C1HQ LIZ6 = C111074Xn.LIZ(LIZ5, "onEventV3", "enter_from", "chat", "conversation_id", str7);
                    LIZ6.put("to_user_id", str8);
                    LIZ5.LIZIZ("click_ec_redirect_card", LIZ6);
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass491(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.3WQ r0 = new X.3WQ
            r0.<init>()
            r2.LJLIL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 75
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 81
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 74
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 80
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 79
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJLL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 77
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 76
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJLJ = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 78
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass491.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
