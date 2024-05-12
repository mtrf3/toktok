package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class NIQ implements NBG {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final View LIZJ;
    public final AqS160S0100000_10 LIZLLL;

    @Override // X.NBG
    public final InterfaceC65784Pro<C76800UCe> LIZ() {
        return this.LIZLLL;
    }

    @Override // X.NBG
    public final View LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // X.NBG
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.NBG
    public final Context getContext() {
        return this.LIZ;
    }

    public NIQ(NIN nin) {
        FixedRatioFrameLayout fixedRatioFrameLayout;
        this.LIZ = nin.LJI;
        this.LIZIZ = nin.LIZLLL;
        C49065JNl c49065JNl = nin.LIZ;
        if (c49065JNl != null) {
            fixedRatioFrameLayout = c49065JNl.LJI;
        } else {
            fixedRatioFrameLayout = null;
        }
        this.LIZJ = fixedRatioFrameLayout;
        this.LIZLLL = new AqS160S0100000_10(nin, 541);
    }
}
