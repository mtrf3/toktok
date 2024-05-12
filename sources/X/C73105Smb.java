package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;

/* renamed from: X.Smb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73105Smb extends ViewOutlineProvider {
    public final /* synthetic */ ECStoreLiveAssem LIZ;

    public C73105Smb(ECStoreLiveAssem eCStoreLiveAssem) {
        this.LIZ = eCStoreLiveAssem;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), KL2.LIZJ(this.LIZ.getContext(), 8.0f));
    }
}
