package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.jvm.internal.o;

/* renamed from: X.6VK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VK {
    public final String LIZ;
    public final String LIZIZ;
    public final FrameLayout LIZJ;
    public final FrameLayout LIZLLL;
    public final FrameLayout LJ;
    public EffectTextModel LJFF;
    public AVETParameter LJI;
    public boolean LJII;

    public C6VK(FrameLayout panelContainer, FrameLayout inputContainer, FrameLayout previewContainer) {
        o.LJIIIZ(panelContainer, "panelContainer");
        o.LJIIIZ(inputContainer, "inputContainer");
        o.LJIIIZ(previewContainer, "previewContainer");
        this.LIZ = "coverpic";
        this.LIZIZ = "covertext";
        this.LIZJ = panelContainer;
        this.LIZLLL = inputContainer;
        this.LJ = previewContainer;
        this.LJII = true;
    }
}
