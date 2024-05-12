package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198257qH {
    public final C200847uS LIZ;
    public final ViewGroup LIZIZ;
    public final C161266Uo LIZJ;

    public C198257qH(C200847uS c200847uS) {
        Aweme aweme;
        List<InteractStickerStruct> interactStickerStructs;
        this.LIZ = c200847uS;
        if (C188907bC.LIZ() && (aweme = c200847uS.LIZJ) != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null && (!interactStickerStructs.isEmpty())) {
            ViewGroup viewGroup = c200847uS.LJ;
            o.LJII(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
            this.LIZIZ = viewGroup;
            this.LIZJ = (C161266Uo) viewGroup.findViewById(R.id.hzg);
        }
    }
}
