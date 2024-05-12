package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44540Hdw extends F9E {
    public final VideoPublishEditModel LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public C44540Hdw(int i, VideoPublishEditModel model, String region, boolean z, boolean z2) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(region, "region");
        this.LJLIL = model;
        this.LJLILLLLZI = z;
        this.LJLJI = region;
        this.LJLJJI = i;
        this.LJLJJL = z2;
    }
}
