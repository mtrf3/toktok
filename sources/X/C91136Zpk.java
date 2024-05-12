package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.dsp.v2.TTDspViewModelV2;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpk, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91136Zpk {
    public static TTDspViewModelV2 LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (TTDspViewModelV2) new ViewModelProvider(activity, new C91358ZtK(activity)).get(TTDspViewModelV2.class);
    }
}
