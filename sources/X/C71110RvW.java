package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.TcLine;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RvW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71110RvW extends ConstraintLayout {
    public final InterfaceC88473Ynt<View, VoucherInfo, Integer, C76800UCe> LJLIL;
    public final InterfaceC88471Ynr<Integer, VoucherInfo, C76800UCe> LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final C71111RvX LJLJJI;
    public boolean LJLJJL;
    public VoucherInfo LJLJJLL;
    public boolean LJLJL;

    public final void LJJLJLI(int i, VoucherInfo voucherInfo) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.LJLJJI.setCouponBottomRightTextVisible(true);
                TcLine LIZIZ = voucherInfo.LIZIZ();
                if (LIZIZ != null) {
                    this.LJLJJI.setCouponBottomRightText(LIZIZ.key);
                    this.LJLJJI.setCouponBottomRightClickListener(new ACListenerS32S0100000_12(this, 164));
                }
                String str = voucherInfo.useLimitText;
                String str2 = voucherInfo.costRoleText;
                if (!C78857UxB.LJJJIL(str) || !C78857UxB.LJJJIL(str2)) {
                    return;
                }
                if (C90193gN.LIZ()) {
                    C71111RvX c71111RvX = this.LJLJJI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" · ");
                    LIZ.append(str2);
                    c71111RvX.setCouponBottomLeftText(X1D.LIZIZ(LIZ));
                    return;
                }
                C71111RvX c71111RvX2 = this.LJLJJI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(" · ");
                LIZ2.append(str);
                c71111RvX2.setCouponBottomLeftText(X1D.LIZIZ(LIZ2));
                return;
            }
            this.LJLJJI.setCouponBottomRightTextVisible(false);
            this.LJLJJI.setCouponBottomRightText("");
            this.LJLJJI.setCouponBottomRightClickListener(null);
            TcLine LIZIZ2 = voucherInfo.LIZIZ();
            if (LIZIZ2 == null) {
                return;
            }
            this.LJLJJI.setCouponBottomLeftText(LIZIZ2.key);
            this.LJLJJI.setCouponBottomLeftClickListener(new ACListenerS32S0100000_12(this, 163));
            return;
        }
        C36746EbW.LIZ(6, "bottom info error");
    }

    public final void LJJLL(VoucherInfo voucherInfo, int i, int i2) {
        String string;
        String str;
        this.LJLJJLL = voucherInfo;
        this.LJLJJL = C78857UxB.LJJJIL(voucherInfo.voucherId);
        String str2 = voucherInfo.usableReminderText;
        String str3 = voucherInfo.scopeTxt;
        if (str3 == null || str3.length() == 0) {
            string = getContext().getResources().getString(R.string.jm3);
            o.LJIIIIZZ(string, "{\n            context.re…er_nolimittime)\n        }");
        } else {
            string = voucherInfo.scopeTxt;
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (C78857UxB.LJJJIL(str2)) {
            if (C90193gN.LIZ()) {
                string = a1.LJ(str2, " · ", string);
            } else {
                string = a1.LJ(string, " · ", str2);
            }
        }
        tuxTextView.setText(string);
        if (this.LJLJJL) {
            str = getContext().getString(R.string.f2q);
        } else {
            str = "Claim & Use";
        }
        o.LJIIIIZZ(str, "if (hasObtained) context…t_now) else \"Claim & Use\"");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setData voucherId = ");
        LIZ.append(voucherInfo.voucherId);
        LIZ.append(" , pinVoucherStyle = ");
        LIZ.append(i);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        String str4 = "";
        if (i != 0) {
            if (i != 1) {
                return;
            }
            C71111RvX c71111RvX = this.LJLJJI;
            String str5 = voucherInfo.title;
            if (str5 == null) {
                str5 = "";
            }
            c71111RvX.setCouponInfoText(str5);
            C71111RvX c71111RvX2 = this.LJLJJI;
            String str6 = voucherInfo.discountText;
            if (str6 != null) {
                str4 = str6;
            }
            c71111RvX2.setCouponSubInfoText(str4);
            LJJLJLI(i2, voucherInfo);
            C71111RvX c71111RvX3 = this.LJLJJI;
            String str7 = voucherInfo.buttonText;
            if (str7 != null) {
                str = str7;
            }
            c71111RvX3.getClass();
            c71111RvX3.LJLIL.setText(str);
            c71111RvX3.LJLIL.setNeedRedBorder(false);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(4);
            c110614Vt.LIZLLL = 1;
            Context context = c71111RvX3.getContext();
            o.LJIIIIZZ(context, "context");
            c110614Vt.LIZ = C79045V0n.LJI(R.attr.eg, context);
            C2WM c2wm = c71111RvX3.LJLIL;
            Context context2 = c71111RvX3.getContext();
            o.LJIIIIZZ(context2, "context");
            c2wm.setBackground(c110614Vt.LIZ(context2));
            return;
        }
        C71111RvX c71111RvX4 = this.LJLJJI;
        String str8 = voucherInfo.discountText;
        if (str8 == null) {
            str8 = "";
        }
        c71111RvX4.setCouponInfoText(str8);
        C71111RvX c71111RvX5 = this.LJLJJI;
        String str9 = voucherInfo.thresholdText;
        if (str9 != null) {
            str4 = str9;
        }
        c71111RvX5.setCouponSubInfoText(str4);
        LJJLJLI(i2, voucherInfo);
        C71111RvX c71111RvX6 = this.LJLJJI;
        String str10 = voucherInfo.buttonText;
        if (str10 != null) {
            str = str10;
        }
        c71111RvX6.getClass();
        c71111RvX6.LJLIL.setText(str);
        c71111RvX6.LJLIL.setNeedRedBorder(true);
        c71111RvX6.LJLIL.setButtonVariant(0);
        C2WM c2wm2 = c71111RvX6.LJLIL;
        float LJIIZILJ = C32151Nz.LJIIZILJ(4);
        o.LJIIIZ(c2wm2, "<this>");
        Drawable background = c2wm2.getBackground();
        if (!(background instanceof GradientDrawable)) {
            return;
        }
        ((GradientDrawable) background).setCornerRadius(LJIIZILJ);
        C78897Uxp.LJJJJJL(c2wm2, LJIIZILJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71110RvW(Context context, IDqS436S0100000_12 iDqS436S0100000_12, AqS178S0100000_12 aqS178S0100000_12, AqS194S0100000_12 aqS194S0100000_12) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = iDqS436S0100000_12;
        this.LJLILLLLZI = aqS194S0100000_12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.a7j);
        setBackground(C04270Et.LIZIZ(contextThemeWrapper, R.drawable.aow));
        setPadding(0, 0, 0, 0);
        TuxIconView tuxIconView = new TuxIconView(contextThemeWrapper, null, 0, 6, null);
        tuxIconView.setIconHeight(contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.ot));
        tuxIconView.setIconWidth(contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.ot));
        tuxIconView.setIconRes(R.raw.icon_x_mark);
        tuxIconView.setTintColorRes(R.attr.gv);
        tuxIconView.setId(R.id.cmg);
        C018905p c018905p = new C018905p((int) getResources().getDimension(R.dimen.p4), (int) getResources().getDimension(R.dimen.p4));
        c018905p.endToEnd = 0;
        c018905p.topToTop = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = getResources().getDimensionPixelOffset(R.dimen.p2);
        c018905p.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.p2));
        addView(tuxIconView, c018905p);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(aqS178S0100000_12, 83, 42, 42), tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(contextThemeWrapper, null, 0);
        tuxTextView.setSingleLine(true);
        tuxTextView.setHorizontallyScrolling(false);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(91);
        tuxTextView.setTextColorRes(R.attr.eb);
        this.LJLJI = tuxTextView;
        tuxTextView.setId(R.id.cmj);
        C018905p c018905p2 = new C018905p(-2, -2);
        c018905p2.topToTop = 0;
        c018905p2.startToStart = 0;
        c018905p2.endToEnd = 0;
        c018905p2.constrainedWidth = true;
        c018905p2.horizontalBias = 0.0f;
        ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = getResources().getDimensionPixelOffset(R.dimen.pg);
        c018905p2.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.p8));
        c018905p2.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.oq));
        addView(tuxTextView, c018905p2);
        C33686DJy c33686DJy = new C33686DJy(contextThemeWrapper);
        c33686DJy.setLineGapWidth(contextThemeWrapper.getResources().getDimension(R.dimen.pb));
        c33686DJy.setLineSolidWidth(contextThemeWrapper.getResources().getDimension(R.dimen.pb));
        c33686DJy.setStrokeWidth(contextThemeWrapper.getResources().getDimension(R.dimen.oj));
        c33686DJy.setLineColorRes(R.attr.dz);
        c33686DJy.setId(R.id.cmk);
        C018905p c018905p3 = new C018905p(-1, (int) getResources().getDimension(R.dimen.oj));
        c018905p3.topToBottom = R.id.cmj;
        ((ViewGroup.MarginLayoutParams) c018905p3).topMargin = (int) getResources().getDimension(R.dimen.pb);
        c018905p3.startToStart = 0;
        c018905p3.endToEnd = 0;
        c018905p3.constrainedWidth = true;
        c018905p3.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.ok));
        c018905p3.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.ok));
        addView(c33686DJy, c018905p3);
        C71111RvX c71111RvX = new C71111RvX(contextThemeWrapper, null, 0);
        this.LJLJJI = c71111RvX;
        c71111RvX.setCouponBtnClickListener(new ACListenerS32S0100000_12(this, 162));
        C018905p c018905p4 = new C018905p(-1, 0);
        c018905p4.topToBottom = R.id.cmk;
        c018905p4.bottomToBottom = 0;
        c018905p4.startToStart = 0;
        c018905p4.endToEnd = 0;
        c018905p4.constrainedWidth = true;
        c018905p4.constrainedHeight = true;
        c018905p4.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.oq));
        c018905p4.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.oq));
        addView(c71111RvX, c018905p4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LJLJL) {
            this.LJLJL = true;
            InterfaceC88471Ynr<Integer, VoucherInfo, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
            if (interfaceC88471Ynr != null) {
                VoucherInfo voucherInfo = this.LJLJJLL;
                if (voucherInfo != null) {
                    interfaceC88471Ynr.invoke(1, voucherInfo);
                } else {
                    o.LJIJI("currentVoucherInfo");
                    throw null;
                }
            }
        }
    }
}
