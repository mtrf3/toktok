package X;

import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.bytedance.ies.nle.editor_jni.EpResourceDelegate;
import kotlin.jvm.internal.o;

/* renamed from: X.HpO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45250HpO extends EpResourceDelegate {
    public final C5WP LIZ;
    public final C62822Ol8 LIZIZ;

    public C45250HpO(C5WP epModelCache) {
        o.LJIIIZ(epModelCache, "epModelCache");
        this.LIZ = epModelCache;
        this.LIZIZ = C221108m2.LIZIZ(C172736qD.LJLIL);
    }

    @Override // com.bytedance.ies.nle.editor_jni.EpResourceDelegate
    public final boolean request(String str, EpResourceCallback epResourceCallback) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ((InterfaceC84498XEg) this.LIZIZ.getValue()).LIZLLL(str, null, new C45253HpR(epResourceCallback));
        return true;
    }

    @Override // com.bytedance.ies.nle.editor_jni.EpResourceDelegate
    public final boolean request(String str, String str2, EpResourceCallback epResourceCallback) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        ((InterfaceC84498XEg) this.LIZIZ.getValue()).LJJJIL(C47261Igj.LJII(str), C0JU.LIZ("panel", str2), new C45251HpP(epResourceCallback, this, str2, str));
        return true;
    }
}
