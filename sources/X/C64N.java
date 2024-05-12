package X;

import android.view.View;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.64N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C64N {
    public AqS152S0100000_2 LIZIZ;
    public boolean LIZJ;
    public final List<C6DO> LIZ = new ArrayList();
    public final boolean LIZLLL = true;

    public abstract PollStickerModel LIZIZ();

    public abstract C64P LIZJ();

    public final View LIZ() {
        return LIZJ().LIZ;
    }
}
