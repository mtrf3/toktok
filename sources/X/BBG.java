package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BBG extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BBG(Object obj) {
        super(1, obj, BasePreviewSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        BasePreviewSettingDialog basePreviewSettingDialog = (BasePreviewSettingDialog) this.receiver;
        FragmentManager childFragmentManager = basePreviewSettingDialog.getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (p0.getGoNextPage()) {
            LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
        } else {
            LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
        }
        Fragment vl = basePreviewSettingDialog.vl(p0);
        if (vl != null) {
            LIZ.LJIIJ(vl, null, R.id.dm7);
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
