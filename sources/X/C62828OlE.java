package X;

import Y.ACListenerS30S0100000_10;
import Y.IDCSpanS34S0100000_10;
import Y.IDHandlerS6S0000000_1;
import android.content.Context;
import android.os.Handler;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.OlE */
/* loaded from: classes11.dex */
public class C62828OlE extends RelativeLayout {
    public static final ArrayList<C2NO> LJLLILLLL = new ArrayList<>();
    public static final IDHandlerS6S0000000_1 LJLLJ = new IDHandlerS6S0000000_1(C16880lQ.LLJJJJ(), 1);
    public static int LJLLL;
    public RelativeLayout LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public C2NO LJLJLLL;
    public boolean LJLL;
    public int LJLLI;

    public final void LJFF() {
        C43286Gyo.LIZ.getClass();
        if (o.LJ("ar", C87093YGb.LIZ())) {
            getDownloadProgressView().setText("%0");
        } else {
            getDownloadProgressView().setText("0%");
        }
    }

    public final void LJII() {
        C44938HkM.LJIIZILJ = true;
        LJI();
        LJFF();
        this.LJLL = false;
        this.LJLLI = 0;
        LJLLL = 0;
        getDownloadSuccessImageView().setVisibility(8);
        getDownloadSuccessTextView().setVisibility(8);
        getDownloadFailedTextView().setVisibility(8);
        getDownloadVideoRetryView().setVisibility(8);
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        LJIIIZ(this, 0, C79045V0n.LJI(R.attr.d7, context), null, 4);
        getDownloadProgressView().setVisibility(0);
        getDownloadVideoCancelView().setVisibility(0);
        getDownloadingStatusTextView().setVisibility(0);
        getDownloadProgressViewRoot().requestLayout();
    }

    public static void LJI() {
        IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = LJLLJ;
        if (iDHandlerS6S0000000_1.hasMessages(1)) {
            iDHandlerS6S0000000_1.removeMessages(1);
        }
        if (iDHandlerS6S0000000_1.hasMessages(2)) {
            iDHandlerS6S0000000_1.removeMessages(2);
        }
    }

    public final TuxTextView getDownloadFailedTextView() {
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadFailedTextView");
        throw null;
    }

    public final TuxTextView getDownloadProgressView() {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadProgressView");
        throw null;
    }

    public final RelativeLayout getDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.LJLIL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("downloadProgressViewRoot");
        throw null;
    }

    public final TuxIconView getDownloadSuccessImageView() {
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("downloadSuccessImageView");
        throw null;
    }

    public final TuxTextView getDownloadSuccessTextView() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadSuccessTextView");
        throw null;
    }

    public final TuxTextView getDownloadVideoCancelView() {
        TuxTextView tuxTextView = this.LJLJLJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadVideoCancelView");
        throw null;
    }

    public final TuxTextView getDownloadVideoRetryView() {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadVideoRetryView");
        throw null;
    }

    public final TuxTextView getDownloadingStatusTextView() {
        TuxTextView tuxTextView = this.LJLJJLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("downloadingStatusTextView");
        throw null;
    }

    public final boolean getIsDownloadingPhoto() {
        return this.LJLL;
    }

    public final int getSuccessDownloadMediaNumber() {
        return this.LJLLI;
    }

    public final C2NO getVideoDownloadClickListener() {
        return this.LJLJLLL;
    }

    public static boolean LJ(int i) {
        return LJLLJ.hasMessages(i);
    }

    private final void setPhotoDownloadFailTextSpan(C45382HrW c45382HrW) {
        Aweme aweme;
        String string;
        String LIZIZ;
        Z89 z89 = Z89.LIZIZ;
        Aweme aweme2 = null;
        if (c45382HrW != null) {
            aweme = C45382HrW.LIZLLL;
        } else {
            aweme = null;
        }
        if (z89.LIZIZ(aweme)) {
            string = getContext().getString(R.string.j6i);
        } else {
            string = getContext().getString(R.string.tr5);
        }
        o.LJIIIIZZ(string, "if (NowsTabService.isNow…ve_photo_fail1)\n        }");
        if (c45382HrW != null) {
            aweme2 = C45382HrW.LIZLLL;
        }
        if (z89.LIZIZ(aweme2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContext().getString(R.string.j6h));
            LIZ.append(' ');
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getContext().getString(R.string.trb));
            LIZ2.append(' ');
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        SpannableString spannableString = new SpannableString(C00F.LIZIZ(string, ' ', LIZIZ));
        spannableString.setSpan(new IDCSpanS34S0100000_10(this, 0), s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6), (LIZIZ.length() + s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6)) - 1, 17);
        getDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getDownloadFailedTextView().setText(spannableString);
    }

    private final void setVideoDownloadFailTextSpan(C45382HrW c45382HrW) {
        Aweme aweme;
        String string;
        String LIZIZ;
        Z89 z89 = Z89.LIZIZ;
        Aweme aweme2 = null;
        if (c45382HrW != null) {
            aweme = C45382HrW.LIZLLL;
        } else {
            aweme = null;
        }
        if (z89.LIZIZ(aweme)) {
            string = getContext().getString(R.string.j6i);
        } else {
            string = getContext().getString(R.string.gdy);
        }
        o.LJIIIIZZ(string, "if (NowsTabService.isNow…load_savefail3)\n        }");
        if (c45382HrW != null) {
            aweme2 = C45382HrW.LIZLLL;
        }
        if (z89.LIZIZ(aweme2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContext().getString(R.string.j6h));
            LIZ.append(' ');
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getContext().getString(R.string.gdw));
            LIZ2.append(' ');
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        SpannableString spannableString = new SpannableString(i0.LJFF(string, LIZIZ));
        spannableString.setSpan(new IDCSpanS34S0100000_10(this, 1), s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6), (LIZIZ.length() + s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6)) - 1, 17);
        getDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getDownloadFailedTextView().setText(spannableString);
    }

    public final void LJIIJ(int i) {
        if (C44938HkM.LIZLLL) {
            return;
        }
        getDownloadSuccessImageView().setVisibility(8);
        getDownloadSuccessTextView().setVisibility(8);
        getDownloadFailedTextView().setVisibility(8);
        getDownloadingStatusTextView().setVisibility(0);
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        LJIIIZ(this, 0, C79045V0n.LJI(R.attr.d7, context), null, 4);
        getDownloadProgressView().setVisibility(0);
        getDownloadVideoCancelView().setVisibility(0);
        C43286Gyo.LIZ.getClass();
        if (o.LJ("ar", C87093YGb.LIZ())) {
            TuxTextView downloadProgressView = getDownloadProgressView();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('%');
            LIZ.append(i);
            downloadProgressView.setText(X1D.LIZIZ(LIZ));
        } else {
            TuxTextView downloadProgressView2 = getDownloadProgressView();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i);
            LIZ2.append('%');
            downloadProgressView2.setText(X1D.LIZIZ(LIZ2));
        }
        LJLLL = i;
    }

    public final void setDownloadFailedTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJL = tuxTextView;
    }

    public final void setDownloadProgressView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJJL = tuxTextView;
    }

    public final void setDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        o.LJIIIZ(relativeLayout, "<set-?>");
        this.LJLIL = relativeLayout;
    }

    public final void setDownloadSuccessImageView(TuxIconView tuxIconView) {
        o.LJIIIZ(tuxIconView, "<set-?>");
        this.LJLILLLLZI = tuxIconView;
    }

    public final void setDownloadSuccessTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJI = tuxTextView;
    }

    public final void setDownloadVideoCancelView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJLJ = tuxTextView;
    }

    public final void setDownloadVideoRetryView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJJI = tuxTextView;
    }

    public final void setDownloadingStatusTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJJLL = tuxTextView;
    }

    public final void setVideoDownloadClickListener(C2NO c2no) {
        this.LJLJLLL = c2no;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62828OlE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        a1.LJFF(context, "context");
        C16950lX.LIZ(getContext(), R.layout.ace, this, true, -1);
        View findViewById = findViewById(R.id.j7c);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.root_download_progress_bar)");
        setDownloadProgressViewRoot((RelativeLayout) findViewById);
        C16880lQ.LJIJ(getDownloadProgressViewRoot(), ViewOnClickListenerC62831OlH.LJLIL);
        View findViewById2 = findViewById(R.id.cg8);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.download_success_img)");
        setDownloadSuccessImageView((TuxIconView) findViewById2);
        View findViewById3 = findViewById(R.id.cg9);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.download_success_txt)");
        setDownloadSuccessTextView((TuxTextView) findViewById3);
        View findViewById4 = findViewById(R.id.cg1);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.download_retry)");
        setDownloadVideoRetryView((TuxTextView) findViewById4);
        View findViewById5 = findViewById(R.id.cfz);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.download_progress)");
        setDownloadProgressView((TuxTextView) findViewById5);
        View findViewById6 = findViewById(R.id.cgc);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.downloading_status_txt)");
        setDownloadingStatusTextView((TuxTextView) findViewById6);
        View findViewById7 = findViewById(R.id.cfr);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.download_failed_status_txt)");
        setDownloadFailedTextView((TuxTextView) findViewById7);
        View findViewById8 = findViewById(R.id.cfq);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.download_cancel)");
        setDownloadVideoCancelView((TuxTextView) findViewById8);
        setVideoDownloadFailTextSpan(null);
        C16880lQ.LJJJJI(getDownloadVideoCancelView(), new ACListenerS30S0100000_10(this, 221));
        LJFF();
        if (C34051DXz.LIZ()) {
            for (View view : C47261Igj.LJJIJIIJI(getDownloadSuccessImageView(), getDownloadSuccessTextView(), getDownloadProgressView(), getDownloadingStatusTextView(), getDownloadFailedTextView(), getDownloadVideoCancelView())) {
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                o.LJIIIZ(view, "<this>");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, LJJIIZ, marginLayoutParams.rightMargin, LJJIIZ);
                }
            }
        }
    }

    public void LJIIIIZZ(int i, Integer num, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        if (this.LJLIL != null) {
            getDownloadProgressViewRoot().setVisibility(i);
            if (type != EnumC62412cf.TYPE_PROFILE_PAGE && num != null) {
                num.intValue();
                getDownloadProgressViewRoot().setBackgroundColor(num.intValue());
            }
        }
    }

    public static /* synthetic */ void LIZIZ(C62828OlE c62828OlE, boolean z, C45382HrW c45382HrW, int i) {
        EnumC62412cf enumC62412cf;
        if ((i & 2) != 0) {
            c45382HrW = null;
        }
        if ((i & 8) != 0) {
            enumC62412cf = EnumC62412cf.DEFAULT;
        } else {
            enumC62412cf = null;
        }
        c62828OlE.LIZ(z, c45382HrW, null, enumC62412cf);
    }

    public void LIZ(boolean z, C45382HrW c45382HrW, Handler handler, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        getDownloadProgressView().setVisibility(8);
        getDownloadingStatusTextView().setVisibility(8);
        getDownloadSuccessImageView().setVisibility(8);
        getDownloadSuccessTextView().setVisibility(8);
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        LJIIIZ(this, 0, C79045V0n.LJI(R.attr.d7, context), null, 4);
        getDownloadFailedTextView().setWidth(KL2.LJIIJJI(getContext()) - ((int) KL2.LIZJ(getContext(), 77.0f)));
        getDownloadFailedTextView().setVisibility(0);
        getDownloadVideoCancelView().setVisibility(0);
        getDownloadFailedTextView().requestLayout();
        getDownloadProgressViewRoot().requestLayout();
        if (z) {
            setPhotoDownloadFailTextSpan(c45382HrW);
        } else {
            setVideoDownloadFailTextSpan(c45382HrW);
        }
        LJFF();
        IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = LJLLJ;
        if (!iDHandlerS6S0000000_1.hasMessages(2)) {
            iDHandlerS6S0000000_1.sendEmptyMessageDelayed(2, 20000L);
        }
        this.LJLL = z;
        this.LJLLI = 0;
    }

    public void LIZJ(boolean z, int i, C45382HrW c45382HrW, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        getDownloadProgressView().setVisibility(8);
        getDownloadingStatusTextView().setVisibility(8);
        getDownloadVideoCancelView().setVisibility(8);
        getDownloadFailedTextView().setVisibility(8);
        Aweme aweme = null;
        if (type != EnumC62412cf.TYPE_PROFILE_PAGE) {
            Context context = getContext();
            o.LJIIIIZZ(context, "this.context");
            LJIIIZ(this, 0, Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eh, context)), null, 4);
            RelativeLayout downloadProgressViewRoot = getDownloadProgressViewRoot();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "this.context");
            downloadProgressViewRoot.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2));
        }
        getDownloadSuccessImageView().setVisibility(0);
        getDownloadSuccessTextView().setVisibility(0);
        if (z) {
            getDownloadSuccessTextView().setText(getContext().getResources().getQuantityText(R.plurals.v1, i));
        } else {
            getDownloadSuccessTextView().setText(getContext().getResources().getString(R.string.ge3));
        }
        Z89 z89 = Z89.LIZIZ;
        if (c45382HrW != null) {
            aweme = C45382HrW.LIZLLL;
        }
        if (z89.LIZIZ(aweme)) {
            getDownloadSuccessTextView().setText(getContext().getString(R.string.j6j));
        }
        getDownloadProgressViewRoot().requestLayout();
        LJFF();
        IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = LJLLJ;
        if (!iDHandlerS6S0000000_1.hasMessages(1)) {
            iDHandlerS6S0000000_1.sendEmptyMessageDelayed(1, 3000L);
        }
        this.LJLL = z;
        this.LJLLI = i;
    }

    public static /* synthetic */ void LIZLLL(C62828OlE c62828OlE, boolean z, int i, C45382HrW c45382HrW, int i2) {
        EnumC62412cf enumC62412cf = null;
        if ((i2 & 4) != 0) {
            c45382HrW = null;
        }
        if ((i2 & 8) != 0) {
            enumC62412cf = EnumC62412cf.DEFAULT;
        }
        c62828OlE.LIZJ(z, i, c45382HrW, enumC62412cf);
    }

    public static /* synthetic */ void LJIIIZ(C62828OlE c62828OlE, int i, Integer num, EnumC62412cf enumC62412cf, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            enumC62412cf = EnumC62412cf.TYPE_FEED;
        }
        c62828OlE.LJIIIIZZ(i, num, enumC62412cf);
    }
}
