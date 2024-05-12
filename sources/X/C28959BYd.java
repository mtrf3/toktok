package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.bytedance.android.livesdk.livesetting.broadcast.SubOnlyLiveGuideSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BYd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28959BYd {
    public static final C28959BYd LIZ = new C28959BYd();
    public static int LIZIZ;

    public static final void LIZ(boolean z) {
        if (z) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.f3;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        } else {
            InterfaceC30442Bx8.f3.LIZ(0);
        }
    }

    public static void LIZIZ(C47121t6 c47121t6) {
        int i;
        if (!InterfaceC30442Bx8.e3.LIZJ().booleanValue() && SubOnlyLiveGuideSetting.INSTANCE.getValue() > 0) {
            C29306Beo.LJJLIIIJJI(c47121t6, true);
            int i2 = LIZIZ;
            if (i2 > 0) {
                i = (int) Math.ceil(i2 * 0.3d);
            } else {
                i = 1;
            }
            String guideText = C15380j0.LJIIIIZZ(R.plurals.pg, i, Integer.valueOf(i), 160);
            if (c47121t6 == null) {
                return;
            }
            o.LJIIIIZZ(guideText, "guideText");
            String substituteText = String.valueOf(i);
            int LIZIZ2 = C15380j0.LIZIZ(R.color.c6);
            o.LJIIIZ(substituteText, "substituteText");
            int LJJLIIIJL = s.LJJLIIIJL(guideText, substituteText, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (LJJLIIIJL >= 0) {
                String substring = guideText.substring(0, LJJLIIIJL);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = guideText.substring(substituteText.length() + LJJLIIIJL);
                o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                spannableStringBuilder.append((CharSequence) substring);
                spannableStringBuilder.append((CharSequence) substituteText);
                spannableStringBuilder.append((CharSequence) substring2);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(LIZIZ2), substring.length(), substituteText.length() + substring.length(), 34);
                spannableStringBuilder.setSpan(new RelativeSizeSpan(1.0769231f), substring.length(), substituteText.length() + substring.length(), 34);
                C23010vJ.LJFF(spannableStringBuilder, substring.length(), substituteText.length() + substring.length(), 34, 600);
            } else {
                spannableStringBuilder.append((CharSequence) guideText);
            }
            c47121t6.setText(spannableStringBuilder);
            return;
        }
        if (c47121t6 == null) {
            return;
        }
        C87277YNd.LJJIIZ(c47121t6);
    }

    public static final boolean LIZJ(int i) {
        if (i != 6 && i != 5) {
            return false;
        }
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.g3;
        Long silentDate = c48459J0d.LIZJ();
        if (silentDate == null || silentDate.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            o.LJIIIIZZ(silentDate, "silentDate");
            if ((currentTimeMillis - silentDate.longValue()) / 1000 >= 2592000) {
                c48459J0d.LIZ(0L);
                InterfaceC30442Bx8.f3.LIZ(0);
            }
        }
        Integer LIZJ = InterfaceC30442Bx8.f3.LIZJ();
        o.LJIIIIZZ(LIZJ, "HOST_IGNORE_SUB_ONLY_LIVE_GUIDE_TIMES.value");
        if (LIZJ.intValue() < SubOnlyLiveGuideSetting.INSTANCE.getGuideIgnoreMaxTime()) {
            return true;
        }
        Long LIZJ2 = c48459J0d.LIZJ();
        if (LIZJ2 != null && LIZJ2.longValue() == 0) {
            AnonymousClass030.LJFF(c48459J0d);
        }
        return false;
    }

    public static final void LIZLLL(C47071t1 c47071t1, int i, int i2, DataChannel dataChannel) {
        LIZIZ = i;
        c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.o9r);
        C15N c15n = new C15N();
        c15n.LIZJ = R.attr.bny;
        c15n.LIZ = C15380j0.LJIILJJIL(R.string.o9q);
        c15n.LIZLLL = new C28960BYe(i2, dataChannel);
        c47071t1.LJIJI = new C38951fv(c15n);
    }
}
