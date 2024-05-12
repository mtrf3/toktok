package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;

/* renamed from: X.Gel, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42043Gel extends ViewOutlineProvider {
    public final /* synthetic */ PublishDialogFragment LIZ;

    public C42043Gel(PublishDialogFragment publishDialogFragment) {
        this.LIZ = publishDialogFragment;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), KL2.LIZJ(this.LIZ.getContext(), 2.0f));
        }
    }
}
