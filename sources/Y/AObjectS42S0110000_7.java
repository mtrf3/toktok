package Y;

import X.C44018HPi;
import X.C46026I4o;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import java.util.List;

/* loaded from: classes8.dex */
public class AObjectS42S0110000_7 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS42S0110000_7(VideoRecordPermissionActivity videoRecordPermissionActivity, int i) {
        this.$t = i;
        this.l0 = videoRecordPermissionActivity;
        this.z1 = true;
    }

    public static final Object invoke$0(AObjectS42S0110000_7 aObjectS42S0110000_7, Object obj) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS42S0110000_7.l0;
        boolean z = aObjectS42S0110000_7.z1;
        List list = (List) obj;
        if (videoRecordPermissionActivity.LJLILLLLZI && videoRecordPermissionActivity.isFinishing()) {
            return C76800UCe.LIZ;
        }
        Intent intent = videoRecordPermissionActivity.getIntent();
        if (!z) {
            intent.putExtra("translation_type", 1);
        }
        C44018HPi.LJFF(videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), list);
        videoRecordPermissionActivity.finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS42S0110000_7 aObjectS42S0110000_7, Object obj) {
        C46026I4o c46026I4o = (C46026I4o) aObjectS42S0110000_7.l0;
        boolean z = aObjectS42S0110000_7.z1;
        if (obj == null) {
            c46026I4o.getClass();
            return null;
        }
        if (z || c46026I4o.LJLL) {
            c46026I4o.LJ();
        }
        c46026I4o.LJLL = true;
        c46026I4o.LIZIZ();
        return null;
    }

    public AObjectS42S0110000_7(C46026I4o c46026I4o, boolean z, int i) {
        this.$t = i;
        this.l0 = c46026I4o;
        this.z1 = z;
    }
}
