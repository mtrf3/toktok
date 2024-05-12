package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.4c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112974c1 extends F9E {
    public final ImageComponent LJLIL;
    public final TextComponent LJLILLLLZI;
    public final ActionLinkComponent LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C112974c1(ActionLinkComponent linkInfo, ImageComponent image, TextComponent text) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.LJLIL = image;
        this.LJLILLLLZI = text;
        this.LJLJI = linkInfo;
    }
}
