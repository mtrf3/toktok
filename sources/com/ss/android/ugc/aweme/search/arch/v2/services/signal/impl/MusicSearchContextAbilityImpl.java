package com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl;

import X.AbstractC50059Jkl;
import X.C221108m2;
import X.C51515KJr;
import X.C62822Ol8;
import X.KID;
import X.KJU;
import X.KK7;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class MusicSearchContextAbilityImpl implements IMusicSearchContextAbility {
    public final Object LJLIL;
    public final View LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final C62822Ol8 LJLJJI;

    public MusicSearchContextAbilityImpl() {
        this(7, null);
    }

    static {
        new MusicSearchContextAbilityImpl(7, null).FD().getClass();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility
    public final AbstractC50059Jkl<KID> FD() {
        return (AbstractC50059Jkl) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility
    public final void j4(KK7 kk7) {
        C51515KJr.LIZ(kk7, new KJU(this.LJLILLLLZI, this.LJLJI, this.LJLIL));
    }

    public MusicSearchContextAbilityImpl(int i, LifecycleOwner lifecycleOwner) {
        lifecycleOwner = (i & 4) != 0 ? null : lifecycleOwner;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 419));
    }
}
