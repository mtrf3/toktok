package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDirtyLensDetectionSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BZE implements Runnable {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    public BZE(float f, int i, Context context) {
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = context;
    }

    public final void LIZ() {
        int i;
        String str;
        if (this.LJLIL >= LiveDirtyLensDetectionSetting.INSTANCE.getTHRESHOLD() && !BZC.LIZ(this.LJLILLLLZI)) {
            int i2 = this.LJLILLLLZI;
            long currentTimeMillis = System.currentTimeMillis();
            BZC.LIZ.add(Integer.valueOf(i2));
            if (i2 == 1) {
                InterfaceC30442Bx8.LLLLLLLLLL.LIZ(Long.valueOf(currentTimeMillis));
            } else {
                InterfaceC30442Bx8.LLLLLLLZIL.LIZ(Long.valueOf(currentTimeMillis));
            }
            if (this.LJLILLLLZI == 1) {
                i = R.string.kuu;
            } else {
                i = R.string.kut;
            }
            C30868C9o.LJ(3000L, this.LJLJI, C15380j0.LJIILJJIL(i));
            BZI LIZ = C28787BRn.LIZ("dirty_lens_detection_toast_show");
            LIZ.LJIIZILJ();
            if (this.LJLILLLLZI == 1) {
                str = "front";
            } else {
                str = "back";
            }
            LIZ.LJIJJ(str, "camera_type");
            LIZ.LJIL("score", Float.valueOf(this.LJLIL));
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
