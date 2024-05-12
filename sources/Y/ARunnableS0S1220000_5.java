package Y;

import X.BZI;
import X.C28787BRn;
import X.C31996Ch6;
import X.C78076Uka;
import X.C78110Ul8;
import X.C78160Ulw;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;

/* loaded from: classes6.dex */
public class ARunnableS0S1220000_5 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S1220000_5 aRunnableS0S1220000_5) {
        int i;
        C78160Ulw c78160Ulw = (C78160Ulw) aRunnableS0S1220000_5.l1;
        boolean z = aRunnableS0S1220000_5.z3;
        Effect effect = (Effect) aRunnableS0S1220000_5.l2;
        boolean z2 = aRunnableS0S1220000_5.z4;
        String str = aRunnableS0S1220000_5.s0;
        if (c78160Ulw == null) {
            BZI LIZ = C28787BRn.LIZ("gift_render_finished");
            LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "use_sdk");
            if (effect == null) {
                i = 0;
            } else {
                i = effect.LIZ().resourceType;
            }
            LIZ.LJIJJ(Integer.valueOf(i), "res_type");
            LIZ.LJIJJ(Boolean.valueOf(z2), "is_success");
            LIZ.LJIJJ(str, "reason");
            C78110Ul8.LIZ.getClass();
            LIZ.LJIJJ(Integer.valueOf(C78076Uka.LIZ()), "is_anchor");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("gift_render_finished");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "use_sdk");
        LIZ2.LJIJJ(Long.valueOf(effect.LIZ().id), "effect_id");
        LIZ2.LJIJJ(Long.valueOf(effect.giftId), "gift_id");
        LIZ2.LJIJJ(Long.valueOf(c78160Ulw.LIZ), "msg_id");
        LIZ2.LJIJJ(c78160Ulw.LIZIZ, "log_id");
        LIZ2.LJIJJ(Integer.valueOf(effect.LIZ().resourceType), "res_type");
        LIZ2.LJIJJ(Integer.valueOf(c78160Ulw.LIZJ ? 1 : 0), "is_local");
        LIZ2.LJIJJ(Boolean.valueOf(z2), "is_success");
        LIZ2.LJIJJ(str, "reason");
        C78110Ul8.LIZ.getClass();
        LIZ2.LJIJJ(Integer.valueOf(C78076Uka.LIZ()), "is_anchor");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static final void run$1(ARunnableS0S1220000_5 aRunnableS0S1220000_5) {
        C31996Ch6 c31996Ch6 = (C31996Ch6) aRunnableS0S1220000_5.l1;
        boolean z = aRunnableS0S1220000_5.z3;
        AssetsModel assetsModel = (AssetsModel) aRunnableS0S1220000_5.l2;
        boolean z2 = aRunnableS0S1220000_5.z4;
        String str = aRunnableS0S1220000_5.s0;
        int i = 0;
        if (c31996Ch6 == null) {
            BZI LIZ = C28787BRn.LIZ("gift_render_finished");
            LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "use_sdk");
            if (assetsModel != null) {
                i = assetsModel.getResourceType();
            }
            LIZ.LJIJJ(Integer.valueOf(i), "res_type");
            LIZ.LJIJJ(Boolean.valueOf(z2), "is_success");
            LIZ.LJIJJ(str, "reason");
            C78110Ul8.LIZ.getClass();
            LIZ.LJIJJ(Integer.valueOf(C78076Uka.LIZ()), "is_anchor");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("gift_render_finished");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "use_sdk");
        LIZ2.LJIJJ(Long.valueOf(c31996Ch6.LIZLLL), "effect_id");
        LIZ2.LJIJJ(Long.valueOf(c31996Ch6.LJIIIIZZ), "gift_id");
        LIZ2.LJIJJ(Long.valueOf(c31996Ch6.LIZJ), "msg_id");
        LIZ2.LJIJJ(c31996Ch6.LJIIJ, "log_id");
        if (assetsModel != null) {
            i = assetsModel.getResourceType();
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "res_type");
        LIZ2.LJIJJ(Integer.valueOf(c31996Ch6.LJIIIZ ? 1 : 0), "is_local");
        LIZ2.LJIJJ(Boolean.valueOf(z2), "is_success");
        LIZ2.LJIJJ(str, "reason");
        C78110Ul8.LIZ.getClass();
        LIZ2.LJIJJ(Integer.valueOf(C78076Uka.LIZ()), "is_anchor");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public ARunnableS0S1220000_5(AssetsModel assetsModel, C31996Ch6 c31996Ch6, String str, int i) {
        this.$t = i;
        this.l1 = c31996Ch6;
        this.z3 = true;
        this.l2 = assetsModel;
        this.z4 = false;
        this.s0 = str;
    }

    public ARunnableS0S1220000_5(Effect effect, C78160Ulw c78160Ulw, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = c78160Ulw;
        this.z3 = true;
        this.l2 = effect;
        this.z4 = z;
        this.s0 = str;
    }
}
