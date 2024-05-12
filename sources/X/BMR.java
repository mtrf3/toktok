package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* loaded from: classes6.dex */
public interface BMR {
    void onFail();

    void onSuccess(List<EnterRoomConfig> list);
}
