package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.8C8 */
/* loaded from: classes4.dex */
public final class C8C8 {
    public static EditPlayListNameFragment LIZ(int i, String str, String str2, Aweme aweme, Long l, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        EditPlayListNameFragment editPlayListNameFragment = new EditPlayListNameFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("open_edit_fragment_type", i);
        bundle.putString("user_last_name", str);
        bundle.putString("mix_id", str2);
        if (aweme != null) {
            bundle.putSerializable("key_mix_add_aweme_info", aweme);
        }
        if (l != null) {
            l.longValue();
            bundle.putLong("moderated_rename_timestamp", l.longValue());
        }
        bundle.putString("enter_from", enterFrom);
        editPlayListNameFragment.setArguments(bundle);
        return editPlayListNameFragment;
    }

    public static /* synthetic */ EditPlayListNameFragment LIZIZ(C8C8 c8c8, int i, String str, String str2, Aweme aweme, Long l, String str3, int i2) {
        String str4 = str3;
        Long l2 = l;
        Aweme aweme2 = aweme;
        String str5 = str;
        String str6 = str2;
        if ((i2 & 2) != 0) {
            str5 = "";
        }
        if ((i2 & 4) != 0) {
            str6 = "";
        }
        if ((i2 & 8) != 0) {
            aweme2 = null;
        }
        if ((i2 & 16) != 0) {
            l2 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        c8c8.getClass();
        return LIZ(i, str5, str6, aweme2, l2, str4);
    }
}
