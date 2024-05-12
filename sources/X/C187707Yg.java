package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187707Yg extends C201577vd {
    public boolean LLF;
    public Aweme LLFF;
    public C1811278y LLFFF;
    public Integer LLFII;
    public Integer LLFZ;
    public int LLI;
    public InterfaceC65784Pro<C76800UCe> LLIFFJFJJ;

    public final SpannableStringBuilder getEndText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...");
        Aweme aweme = this.LLFF;
        if (aweme != null) {
            spannableStringBuilder.append((CharSequence) LJJJ(aweme));
        }
        return spannableStringBuilder;
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.LLFII;
    }

    public final int getMaxLinesWhenFold() {
        return this.LLI;
    }

    public final boolean getShowingEllipsize() {
        return this.LLF;
    }

    public final InterfaceC65784Pro<C76800UCe> getSpanClickInterceptor() {
        return this.LLIFFJFJJ;
    }

    public final Integer getTextColor() {
        return this.LLFZ;
    }

    private final void setBoldText(List<? extends TextExtraStruct> list) {
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            return;
        }
        int length = spannableString.length();
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                int start = textExtraStruct.getStart();
                if (start < 0) {
                    start = 0;
                }
                int end = textExtraStruct.getEnd();
                if (end > length) {
                    end = length;
                }
                if (end > start && (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1)) {
                    spannableString.setSpan(new T5U(12, true), start, end, 33);
                }
            }
        }
        setText(spannableString);
    }

    public final SpannableStringBuilder LJJJ(Aweme aweme) {
        String str;
        boolean isSecret = ((RBX) HG3.LJIILL()).getCurUser().isSecret();
        if (C78996UzQ.LJJIIZI(aweme)) {
            AwemeStatus status = aweme.getStatus();
            if (aweme.isSubOnlyVideo()) {
                str = getContext().getResources().getString(R.string.rum);
            } else {
                str = "";
                if (status != null) {
                    if (status.getPrivateStatus() != 0) {
                        int privateStatus = status.getPrivateStatus();
                        if (privateStatus != 1) {
                            if (privateStatus != 2) {
                                if (isSecret) {
                                    str = getContext().getResources().getString(R.string.s2r);
                                }
                            } else {
                                str = getContext().getResources().getString(R.string.s2s);
                            }
                        } else {
                            str = getContext().getResources().getString(R.string.pb1);
                        }
                        o.LJIIIIZZ(str, "when (status.privateStat…      }\n                }");
                    } else if (isSecret) {
                        str = getContext().getResources().getString(R.string.s2r);
                    }
                }
            }
            o.LJIIIIZZ(str, "if (data.isSubOnlyVideo)…          }\n            }");
            if (str.length() == 0) {
                return new SpannableStringBuilder();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(ujb.o.LJJJJZ(str, " ", " ", false));
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            append.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.dj, context)), 2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new T5U(52, false), 2, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder();
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.LLFII = num;
    }

    public final void setMaxLinesWhenFold(int i) {
        this.LLI = i;
    }

    public final void setShowingEllipsize(boolean z) {
        this.LLF = z;
    }

    public final void setSpanClickInterceptor(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLIFFJFJJ = interfaceC65784Pro;
    }

    public final void setTextColor(Integer num) {
        this.LLFZ = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187707Yg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "ctx");
        this.LLI = 2;
    }

    public final void LJJJI(CharSequence charSequence, boolean z, int i) {
        String str;
        try {
            Aweme aweme = this.LLFF;
            if (aweme != null) {
                str = aweme.getDescLanguage();
            } else {
                str = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setDescSafely desc: ");
            LIZ.append((Object) charSequence);
            C71Y.LIZ("xjccccc", X1D.LIZIZ(LIZ));
            LJJIJLIJ(charSequence, str);
            LJJJIL(this.LLFF, Boolean.valueOf(z), i);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r24, final java.lang.Boolean r25, final int r26) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187707Yg.LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Boolean, int):void");
    }
}
