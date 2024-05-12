package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;

/* renamed from: X.FsG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40332FsG extends AbstractC40333FsH {
    @Override // X.AbstractC40333FsH
    public final void LIZ(Context context) {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        if (!(context instanceof ActivityC45651qj) || (supportFragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager()) == null || (LJJJIL = supportFragmentManager.LJJJIL("LynxContainerWrapperFragment")) == null || !(LJJJIL instanceof DialogFragment)) {
            return;
        }
        ((DialogFragment) LJJJIL).dismissAllowingStateLoss();
    }

    @Override // X.AbstractC40333FsH
    public final void LIZIZ(Context context) {
        if (!(context instanceof ActivityC45651qj)) {
            return;
        }
        String LIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZJ.getValue()).liveLinkPin.LIZ();
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            LIZ = C40180Fpo.LIZ(bundle, LIZ);
        }
        C40337FsL.LIZ(((ActivityC45651qj) context).getSupportFragmentManager(), LIZ);
    }
}
