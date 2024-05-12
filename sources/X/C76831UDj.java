package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UDj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76831UDj extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final ImageModel LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C76831UDj(String str, String str2, String buttonText, ImageModel imageModel) {
        o.LJIIIZ(buttonText, "buttonText");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = buttonText;
        this.LJLJJI = imageModel;
    }
}
