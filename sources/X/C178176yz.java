package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.6yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178176yz {
    public static void LIZ(Fragment fragment, int i, ArrayList arrayList, java.util.Map map) {
        Intent intent = new Intent(fragment.requireContext(), (Class<?>) PhotoDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("image_uri", arrayList);
        bundle.putInt("request_code", i);
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtras(bundle);
        C16880lQ.LJII(fragment, intent, i);
    }
}
