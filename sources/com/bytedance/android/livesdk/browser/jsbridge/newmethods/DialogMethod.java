package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.C03880Dg;
import X.C0NE;
import X.C28733BPl;
import X.C38131Exr;
import X.C65300Pk0;
import X.C68322mC;
import X.C76949UHx;
import X.C77437UaH;
import X.DialogC77438UaI;
import X.InterfaceC65349Pkn;
import X.X1D;
import Y.IDCListenerS53S0200000_13;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.q;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DialogMethod extends AbstractC38123Exj<Params, Result> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("action")
        public final String action;

        @InterfaceC65349Pkn("code")
        public final int code;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.code == result.code && o.LJ(this.action, result.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.code * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(code=");
            LIZ.append(this.code);
            LIZ.append(", action=");
            return q.LIZIZ(LIZ, this.action, ')', LIZ);
        }

        public Result(int i, String action) {
            o.LJIIIZ(action, "action");
            this.code = i;
            this.action = action;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.UHx, T] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.jvm.internal.AqS163S0100000_13] */
    public final void LJJI(Params params, Context context) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = C76949UHx.LJLIL;
        C77437UaH c77437UaH = new C77437UaH(context);
        String str = params.title;
        if (str != null) {
            c77437UaH.LIZJ = str;
        }
        String str2 = params.text;
        if (str2 != null) {
            c77437UaH.LJI = str2;
        }
        Float f = params.cornerRadius;
        if (f != null) {
            c77437UaH.LJJIIJ = (int) f.floatValue();
        }
        c77437UaH.LJJII = false;
        String str3 = params.rightButtonText;
        if (str3 != null && str3.length() > 0) {
            SpannableString spannableString = new SpannableString(str3);
            String str4 = params.rightButtonTextColor;
            if (str4 != null) {
                spannableString.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str4)), 0, spannableString.length(), 33);
            }
            c77437UaH.LJFF(new IDCListenerS53S0200000_13(this, c68322mC, 1), spannableString, false);
        }
        String str5 = params.leftButtonText;
        if (str5 != null && str5.length() > 0) {
            SpannableString spannableString2 = new SpannableString(str5);
            String str6 = params.leftButtonTextColor;
            if (str6 != null) {
                spannableString2.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str6)), 0, spannableString2.length(), 33);
            }
            c77437UaH.LIZLLL(new IDCListenerS53S0200000_13(this, c68322mC, 2), spannableString2, false);
        }
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-2666146099984255933")).LIZ) {
            LIZ.show();
        }
        c68322mC.element = new AqS163S0100000_13(LIZ, 198);
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr context) {
        Params params2 = params;
        o.LJIIIZ(params2, "params");
        o.LJIIIZ(context, "context");
        try {
            if (o.LJ(params2.type, "confirm")) {
                Context context2 = context.LIZ;
                o.LJIIIIZZ(context2, "context.context");
                LJJI(params2, context2);
            } else {
                finishWithFailure();
            }
        } catch (Throwable th) {
            finishWithFailure();
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StackTraceElement[] stackTrace = th.getStackTrace();
            LJIILIIL.getClass();
            C0NE.LJIIL(5, stackTrace);
        }
    }

    /* loaded from: classes14.dex */
    public static final class Params {

        @InterfaceC65349Pkn("corner_radius")
        public final Float cornerRadius;

        @InterfaceC65349Pkn("left_button_text")
        public final String leftButtonText;

        @InterfaceC65349Pkn("left_button_text_color")
        public final String leftButtonTextColor;

        @InterfaceC65349Pkn("right_button_text")
        public final String rightButtonText;

        @InterfaceC65349Pkn("right_button_text_color")
        public final String rightButtonTextColor;

        @InterfaceC65349Pkn("text")
        public final String text;

        @InterfaceC65349Pkn("title")
        public final String title;

        @InterfaceC65349Pkn("type")
        public final String type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return o.LJ(this.type, params.type) && o.LJ(this.title, params.title) && o.LJ(this.text, params.text) && o.LJ(this.leftButtonText, params.leftButtonText) && o.LJ(this.leftButtonTextColor, params.leftButtonTextColor) && o.LJ(this.rightButtonText, params.rightButtonText) && o.LJ(this.rightButtonTextColor, params.rightButtonTextColor) && o.LJ(this.cornerRadius, params.cornerRadius);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.leftButtonText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.leftButtonTextColor;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.rightButtonText;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.rightButtonTextColor;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Float f = this.cornerRadius;
            return hashCode7 + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(type=");
            LIZ.append(this.type);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", text=");
            LIZ.append(this.text);
            LIZ.append(", leftButtonText=");
            LIZ.append(this.leftButtonText);
            LIZ.append(", leftButtonTextColor=");
            LIZ.append(this.leftButtonTextColor);
            LIZ.append(", rightButtonText=");
            LIZ.append(this.rightButtonText);
            LIZ.append(", rightButtonTextColor=");
            LIZ.append(this.rightButtonTextColor);
            LIZ.append(", cornerRadius=");
            LIZ.append(this.cornerRadius);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Params(String type, String str, String str2, String str3, String str4, String str5, String str6, Float f) {
            o.LJIIIZ(type, "type");
            this.type = type;
            this.title = str;
            this.text = str2;
            this.leftButtonText = str3;
            this.leftButtonTextColor = str4;
            this.rightButtonText = str5;
            this.rightButtonTextColor = str6;
            this.cornerRadius = f;
        }
    }
}
