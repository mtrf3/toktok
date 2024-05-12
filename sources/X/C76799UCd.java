package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.q;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.UCd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76799UCd {
    public static final SpannableStringBuilder LIZIZ(BattlePrompt battlePrompt) {
        if (battlePrompt == null || TextUtils.isEmpty(battlePrompt.promptKey)) {
            return new SpannableStringBuilder("");
        }
        String str = battlePrompt.promptKey;
        List<BattlePromptElem> list = battlePrompt.promptElements;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        String LIZ = C86881Y7x.LIZIZ().LIZ(str);
        if (LIZ == null) {
            LIZ = "";
        }
        if (s.LJJJLZIJ(LIZ, "<", false) && s.LJJJLZIJ(LIZ, ">", false)) {
            for (BattlePromptElem battlePromptElem : list) {
                if (!TextUtils.isEmpty(battlePromptElem.promptFieldKey)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('<');
                    LIZ2.append(battlePromptElem.promptFieldKey);
                    LIZ2.append('>');
                    if (!s.LJJJLZIJ(LIZ, X1D.LIZIZ(LIZ2), false)) {
                        continue;
                    } else if (battlePromptElem.promptFieldKey != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append('<');
                        String LIZIZ = q.LIZIZ(LIZ3, battlePromptElem.promptFieldKey, '>', LIZ3);
                        String str2 = battlePromptElem.promptFieldValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        LIZ = o.LJJJJZ(LIZ, LIZIZ, str2, false);
                    } else {
                        C76800UCe.LIZ.getClass();
                        throw new IllegalArgumentException("kotlin.Unit");
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(LIZ)) {
            int LJJLIIIJL = s.LJJLIIIJL(LIZ, "{", 0, false, 6);
            int LJJLIIIJL2 = s.LJJLIIIJL(LIZ, "}", 0, false, 6);
            if (s.LJJJLZIJ(LIZ, "{", false) && s.LJJJLZIJ(LIZ, "}", false)) {
                LIZ = o.LJJJJZ(o.LJJJJZ(LIZ, "{", "", false), "}", "", false);
            }
            spannableStringBuilder.append((CharSequence) LIZ);
            if (LJJLIIIJL >= 0 && LJJLIIIJL < LJJLIIIJL2) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ColorProtector.parseColor("#FACE15")), LJJLIIIJL, LJJLIIIJL2 - 1, 34);
            }
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder LIZ(CMV textView, SpannableStringBuilder span, boolean z) {
        int i;
        kotlin.jvm.internal.o.LJIIIZ(textView, "textView");
        kotlin.jvm.internal.o.LJIIIZ(span, "span");
        if (TextUtils.isEmpty(span)) {
            return new SpannableStringBuilder("");
        }
        if (z) {
            span.setSpan(new AbsoluteSizeSpan(11, true), 0, span.length(), 34);
            if (CCJ.LIZ(textView.getContext())) {
                i = 21;
            } else {
                i = 19;
            }
            textView.setGravity(i);
            textView.LJJIJLIJ();
        } else {
            span.setSpan(new AbsoluteSizeSpan(13, true), 0, span.length(), 34);
            textView.setGravity(17);
            textView.LJJIL();
        }
        return span;
    }
}
