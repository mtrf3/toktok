package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutFragment;

/* renamed from: X.Gm9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42501Gm9 extends ViewOutlineProvider {
    public final /* synthetic */ EditCapCutFragment LIZ;

    public C42501Gm9(EditCapCutFragment editCapCutFragment) {
        this.LIZ = editCapCutFragment;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), KL2.LIZJ(this.LIZ.requireContext(), 2.0f));
    }
}
