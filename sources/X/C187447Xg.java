package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.7Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187447Xg extends F9E implements C33Q {
    public final AbstractC72932td<MusicDetail> LJLIL;
    public final boolean LJLILLLLZI;

    public C187447Xg() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C187447Xg(int i) {
        this(C33X.LIZ, true);
    }

    public C187447Xg(AbstractC72932td<MusicDetail> musicDetail, boolean z) {
        o.LJIIIZ(musicDetail, "musicDetail");
        this.LJLIL = musicDetail;
        this.LJLILLLLZI = z;
    }

    public static C187447Xg L(C187447Xg c187447Xg, AbstractC72932td abstractC72932td) {
        boolean z = c187447Xg.LJLILLLLZI;
        c187447Xg.getClass();
        return new C187447Xg(abstractC72932td, z);
    }
}
