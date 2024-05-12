package X;

import Y.ARunnableS15S0101000_11;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Q4t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66415Q4t {
    public static void LIZ(ActivityC45651qj activityC45651qj) {
        long longValue = ((Number) C35138Dqg.LJFF.getValue()).longValue();
        if (longValue != -1) {
            C37179EiV.LJFF.postDelayed(new ARunnableS15S0101000_11(6, activityC45651qj, 1), longValue);
            return;
        }
        if (!C16970lZ.LIZIZ(activityC45651qj, "profile_fragment_user_mt")) {
            C16970lZ.LJFF(activityC45651qj, "profile_fragment_user_mt");
        }
        if (C16970lZ.LIZIZ(activityC45651qj, "profile_fragment_aweme_list_mus")) {
            return;
        }
        C16970lZ.LJFF(activityC45651qj, "profile_fragment_aweme_list_mus");
    }

    public static void LIZIZ(TuxTextView tuxTextView, String str) {
        if (TextUtils.isEmpty(str)) {
            tuxTextView.setText(R.string.rd2);
            return;
        }
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        try {
            str = Pattern.compile("\\s*$", 8).matcher(str).replaceAll("");
        } catch (Exception unused) {
        } catch (Throwable th) {
            tuxTextView.setText(str);
            throw th;
        }
        tuxTextView.setText(str);
    }

    public static void LIZJ(User user, List<Integer> list) {
        int privateTabStyle;
        if (AV1.LJIJ(user)) {
            boolean contains = list.contains(10);
            if (contains && user != null && user.getTabSetting() != null && user.getTabSetting().getPrivateTab() != null && (privateTabStyle = user.getTabSetting().getPrivateTab().getPrivateTabStyle()) >= 1 && privateTabStyle <= 3 && privateTabStyle == 3) {
                int lastIndexOf = list.lastIndexOf(2);
                int lastIndexOf2 = list.lastIndexOf(10);
                if (lastIndexOf != -1 && lastIndexOf2 != -1) {
                    ListProtector.set(list, lastIndexOf, 10);
                    ListProtector.set(list, lastIndexOf2, 2);
                }
            }
            AOP.LIZ = contains;
        }
    }
}
