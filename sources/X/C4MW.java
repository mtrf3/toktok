package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4MW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MW implements InterfaceC88923eK {
    public final C4MX LIZ;

    public final void LJI() {
        C4MX c4mx = this.LIZ;
        c4mx.getClass();
        C108094Mb.LIZ(c4mx);
    }

    public C4MW() {
        C4MX.LJIILL++;
        this.LIZ = new C4MX(C4MX.LJIILL);
    }

    @Override // X.InterfaceC88923eK
    public final C4MW LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        C4MX c4mx = this.LIZ;
        c4mx.getClass();
        c4mx.LJI = scene;
        return this;
    }

    @Override // X.InterfaceC88923eK
    public final C4MW LIZIZ(String str) {
        this.LIZ.LIZIZ = str;
        return this;
    }

    public final void LIZJ(C75612xx c75612xx) {
        C4MX c4mx = this.LIZ;
        c4mx.getClass();
        c4mx.LJIIL = true;
        c4mx.LJIIJ = c75612xx;
        C108094Mb.LIZ(c4mx);
    }

    public final C4MW LIZLLL(BaseContent baseContent) {
        if (baseContent == null) {
            return this;
        }
        ((ArrayList) this.LIZ.LIZJ).add(baseContent);
        return this;
    }

    public final C4MW LJ(List list) {
        if (list == null) {
            return this;
        }
        ((ArrayList) this.LIZ.LIZJ).addAll(list);
        return this;
    }

    public final C4MW LJFF(BaseTemplate content) {
        o.LJIIIZ(content, "content");
        ((ArrayList) this.LIZ.LIZLLL).add(content);
        return this;
    }

    public final void LJII(InterfaceC92803ka interfaceC92803ka) {
        C4MX c4mx = this.LIZ;
        c4mx.getClass();
        c4mx.LJIIJ = interfaceC92803ka;
        C108094Mb.LIZ(c4mx);
    }

    public final C4MW LJIIIIZZ(String str) {
        this.LIZ.LIZIZ = C81273Gx.LIZJ(str);
        return this;
    }
}
