package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.9at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239679at extends F9E implements C33Q {
    public final C43I<OSZ<Music, MusicGroup>> LJLIL;

    public C239679at() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C239679at(C43I<? extends OSZ<? extends Music, MusicGroup>> highlightedMusic) {
        o.LJIIIZ(highlightedMusic, "highlightedMusic");
        this.LJLIL = highlightedMusic;
    }

    public /* synthetic */ C239679at(int i) {
        this((C43I<? extends OSZ<? extends Music, MusicGroup>>) new C43I(null));
    }
}
