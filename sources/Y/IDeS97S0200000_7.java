package Y;

import X.R47;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class IDeS97S0200000_7 implements R47 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS97S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(IDeS97S0200000_7 iDeS97S0200000_7, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((ShareOpenPlatformMethod) iDeS97S0200000_7.l0).LIZLLL((JSONObject) iDeS97S0200000_7.l1);
        }
    }

    public static final void onResult$1(IDeS97S0200000_7 iDeS97S0200000_7, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod) iDeS97S0200000_7.l0).LIZJ((JSONObject) iDeS97S0200000_7.l1);
        }
    }
}
