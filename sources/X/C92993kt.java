package X;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replyforward.ReplyForwardViewModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.3kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92993kt {
    public static final java.util.Map<Long, C92983ks> LIZ = new LinkedHashMap();
    public static long LIZIZ = Long.MIN_VALUE;

    public static void LIZ(Context context) {
        ComponentActivity componentActivity;
        if (context == null || !(context instanceof C29S) || (componentActivity = (ComponentActivity) context) == null) {
            return;
        }
        ReplyForwardViewModel replyForwardViewModel = (ReplyForwardViewModel) new ViewModelProvider(componentActivity).get(ReplyForwardViewModel.class);
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        LIZIZ = serverTimeMills;
        replyForwardViewModel.LJLIL = serverTimeMills;
        LIZ.put(Long.valueOf(serverTimeMills), new C92983ks(new LinkedHashSet(), new LinkedHashSet()));
    }

    public static void LIZIZ(Context context) {
        ComponentActivity componentActivity;
        Long valueOf;
        if (context == null || !(context instanceof C29S) || (componentActivity = (ComponentActivity) context) == null) {
            return;
        }
        long j = ((ReplyForwardViewModel) new ViewModelProvider(componentActivity).get(ReplyForwardViewModel.class)).LJLIL;
        if (j == Long.MIN_VALUE || (valueOf = Long.valueOf(j)) == null) {
            return;
        }
        LIZ.remove(Long.valueOf(valueOf.longValue()));
    }
}
