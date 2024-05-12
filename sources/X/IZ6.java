package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZ6 implements Serializable {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final E8K LJLJI;
    public final List<IYA> LJLJJI;

    public final List<IYA> getCaptionInfos() {
        return this.LJLJJI;
    }

    public final boolean getEnableAutoCaption() {
        return this.LJLIL;
    }

    public final boolean getHasOriginalAudio() {
        return this.LJLILLLLZI;
    }

    public final E8K getOriginalLanguageInfo() {
        return this.LJLJI;
    }

    public IZ6(boolean z, boolean z2, E8K originalLanguageInfo, List<IYA> captionInfos) {
        o.LJIIIZ(originalLanguageInfo, "originalLanguageInfo");
        o.LJIIIZ(captionInfos, "captionInfos");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = originalLanguageInfo;
        this.LJLJJI = captionInfos;
    }
}
