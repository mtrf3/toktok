package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Apa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27426Apa extends F9E {
    public final Image LJLIL;
    public final boolean LJLILLLLZI;
    public final EnumC70209Rgz LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, Integer.valueOf(this.LJLJJI)};
    }

    public C27426Apa(Image image, boolean z, EnumC70209Rgz stockStatus, int i) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(stockStatus, "stockStatus");
        this.LJLIL = image;
        this.LJLILLLLZI = z;
        this.LJLJI = stockStatus;
        this.LJLJJI = i;
    }
}
