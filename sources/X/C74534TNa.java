package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74534TNa implements TO7<ProviderEffect, String, C76800UCe> {
    public final /* synthetic */ TO7 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C74534TNa(TOZ toz, String str) {
        this.LJLIL = toz;
        this.LJLILLLLZI = str;
    }

    @Override // X.TO7
    public final void LJII(int i, Object key) {
        o.LJIIIZ(key, "key");
        this.LJLIL.LJII(i, key);
    }

    @Override // X.TO7
    public final void LJIIJJI(ProviderEffect key, String str) {
        o.LJIIIZ(key, "key");
        TO7 to7 = this.LJLIL;
        if (str == null) {
            str = this.LJLILLLLZI;
        }
        to7.LJIIJJI(key, str);
    }

    @Override // X.TO7
    public final void LIZ(ProviderEffect key, String str, C76800UCe info, long j) {
        String str2 = str;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        TO7 to7 = this.LJLIL;
        if (str2 == null) {
            str2 = this.LJLILLLLZI;
        }
        to7.LIZ(key, str2, info, j);
    }

    @Override // X.TO7
    public final void LIZIZ(ProviderEffect key, Exception exc, C76800UCe info, long j) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        this.LJLIL.LIZIZ(key, exc, info, j);
    }
}
