package X;

import Y.ARunnableS13S0000000_6;
import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;

/* loaded from: classes7.dex */
public final class EYE {
    public static void LIZ(Context context) {
        C38995FSd.LIZJ().execute(new ARunnableS13S0000000_6(40));
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            Reflect.on("com.bumptech.glide.Glide").call("get", new Class[]{Context.class}, context).call("clearMemory");
        }
    }
}
