package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.N6a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58804N6a implements NBG {
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

    public C58804N6a(N6Z n6z) {
        this.LIZ = n6z.LJLJJI;
        this.LIZIZ = n6z.LJLILLLLZI;
        this.LIZJ = n6z.LJLIL.LIZ;
        this.LIZLLL = new AqS160S0100000_10(n6z, 620);
    }
}
