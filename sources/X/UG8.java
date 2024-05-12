package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes14.dex */
public final class UG8 implements InterfaceC87211YKp {
    public final /* synthetic */ SpotlightImageEditDialogFragment LIZ;

    @Override // X.InterfaceC87211YKp
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC87211YKp
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC87211YKp
    public final void LIZ() {
        View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.f8z);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.post(new ARunnableS49S0100000_13(this.LIZ, 90));
        }
    }

    @Override // X.InterfaceC87211YKp
    public final void LIZJ() {
        java.util.Map<String, Object> map;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_edit_text");
        C76883UFj c76883UFj = this.LIZ.LJLIL;
        if (c76883UFj != null && (map = c76883UFj.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
    }

    public UG8(SpotlightImageEditDialogFragment spotlightImageEditDialogFragment) {
        this.LIZ = spotlightImageEditDialogFragment;
    }
}
