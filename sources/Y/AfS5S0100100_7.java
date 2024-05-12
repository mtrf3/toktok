package Y;

import X.C173166qu;
import X.C173306r8;
import X.C43882HKc;
import X.HEU;
import X.InterfaceC64592gB;
import android.util.Pair;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.shortvideo.model.Error;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AfS5S0100100_7 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS5S0100100_7 afS5S0100100_7, Object obj) {
        PhotoModule photoModule = (PhotoModule) afS5S0100100_7.l0;
        long j = afS5S0100100_7.j1;
        Pair pair = (Pair) obj;
        photoModule.getClass();
        long currentTimeMillis = (int) (System.currentTimeMillis() - j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis);
        C43882HKc.LIZJ("aweme_recorder_take_photo_duration", jSONObject, null);
        photoModule.LJLILLLLZI.LIZIZ((String) pair.first, (List) pair.second);
        photoModule.LJLJJI = false;
    }

    public static final void accept$1(AfS5S0100100_7 afS5S0100100_7, Object obj) {
        Throwable th = (Throwable) obj;
        C173306r8.LIZIZ(false, -1, th.getMessage(), afS5S0100100_7.j1, (C173166qu) afS5S0100100_7.l0);
        HEU.LIZIZ.onNext(new Error(th));
    }

    public AfS5S0100100_7(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
