package X;

import Y.ACallableS6S1000000_7;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GcL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41893GcL implements InterfaceC41894GcM {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;

    @Override // X.InterfaceC41894GcM
    public final void LIZ(List<C41897GcP> photos) {
        String string;
        o.LJIIIZ(photos, "photos");
        if (!photos.isEmpty()) {
            if (photos.size() == 1) {
                string = ((C41897GcP) ListProtector.get(photos, 0)).LIZJ;
            } else {
                string = this.LIZ.getString(R.string.fsj);
                o.LJIIIIZZ(string, "{\n                contex…xtra_photo)\n            }");
            }
            C10K.LIZIZ(new ACallableS6S1000000_7(string, 5), C10K.LJIIIIZZ, null);
            LIZIZ(true);
            return;
        }
        C10K.LIZIZ(CallableC41892GcK.LJLIL, C10K.LJIIIIZZ, null);
        LIZIZ(false);
    }

    public final void LIZIZ(boolean z) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("enter_from", this.LIZIZ.enterFrom);
        c145995oB.LIZLLL("shoot_way", this.LIZIZ.mShootWay);
        c145995oB.LIZLLL("prop_list", this.LIZIZ.mStickerID);
        c145995oB.LIZLLL("prop_selected_from", this.LIZIZ.getPropSource());
        c145995oB.LIZLLL("content_type", H7R.LJIIIZ(this.LIZIZ));
        if (z) {
            str = "succeed";
        } else {
            str = "failed";
        }
        c145995oB.LIZLLL("status", str);
        C60903NvH.LJIIJJI().LJJIIZI().LIZIZ("prop_pic_toast_show", c145995oB.LIZ);
    }

    public C41893GcL(Context context, VideoPublishEditModel model) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(model, "model");
        this.LIZ = context;
        this.LIZIZ = model;
    }
}
