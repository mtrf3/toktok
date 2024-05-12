package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.DetailFeedService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JG5 {
    public static final MutableLiveData<String> LIZ = new MutableLiveData<>("");
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(JG6.LJLIL);

    public static DetailFeedService LIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-service>(...)");
        return (DetailFeedService) value;
    }
}
