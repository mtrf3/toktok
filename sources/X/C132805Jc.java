package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;

/* renamed from: X.5Jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C132805Jc {
    public static VideoPublishEditModel LIZIZ(C126784yI c126784yI) {
        c126784yI.getClass();
        return C126784yI.LIZ().getEditModel();
    }

    public static int LIZ(TuxTextView tuxTextView, int i, int i2, int i3) {
        tuxTextView.setPadding(i, i2, i3, tuxTextView.getPaddingBottom());
        return tuxTextView.getPaddingLeft();
    }

    public static String LIZJ(int i, int i2, String str, int i3) {
        return str.subSequence(i3, i + i2).toString();
    }

    public static String LIZLLL(StringBuilder sb, String str, long j, StringBuilder sb2) {
        sb.append(str);
        sb.append(j);
        return X1D.LIZIZ(sb2);
    }

    public static void LJ(StringBuilder sb, String str, Throwable th, String str2, String str3) {
        sb.append(str);
        sb.append(th.getMessage());
        sb.append(str2);
        sb.append(str3);
    }

    public static void LJFF(LinkedHashMap linkedHashMap, String str, String str2, int i, String str3) {
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, String.valueOf(i));
    }
}
