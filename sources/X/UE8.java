package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE8 extends F9E {
    public final int[] LJLIL;
    public final int[] LJLILLLLZI;
    public final ImageModel LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public UE8(int[] iArr, int[] iconSize, ImageModel imageModel) {
        o.LJIIIZ(iconSize, "iconSize");
        this.LJLIL = iArr;
        this.LJLILLLLZI = iconSize;
        this.LJLJI = imageModel;
    }
}
