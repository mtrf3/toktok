package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.WHg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82028WHg extends F9E {
    public final EnumC79548VJw LJLIL;
    public final C6MP LJLILLLLZI;
    public final View LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C82028WHg(EnumC79548VJw scene, C6MP toolbarType, SmartImageView view) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(toolbarType, "toolbarType");
        o.LJIIIZ(view, "view");
        this.LJLIL = scene;
        this.LJLILLLLZI = toolbarType;
        this.LJLJI = view;
    }
}
