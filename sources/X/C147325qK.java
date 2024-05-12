package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5qK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147325qK implements C6NA {
    public final /* synthetic */ C147295qH LIZ;

    @Override // X.C6NA
    public final void LJIJJLI() {
        this.LIZ.LLJILLL = true;
    }

    @Override // X.C6NA
    public final boolean LLZZ() {
        if (!this.LIZ.LLJLL() || !this.LIZ.LLJJIII().LLZZ()) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LJLLJ;
            if (videoPublishEditModel != null) {
                if (!videoPublishEditModel.hasUserAddStickers()) {
                    return false;
                }
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
        return true;
    }

    @Override // X.C6NA
    public final boolean w8() {
        C6FS c6fs = this.LIZ.LLIL;
        if (c6fs != null) {
            return c6fs.w8();
        }
        o.LJIJI("editNavApi");
        throw null;
    }

    @Override // X.C6NA
    public final void y8() {
        C6FS c6fs = this.LIZ.LLIL;
        if (c6fs != null) {
            c6fs.uR(false);
        } else {
            o.LJIJI("editNavApi");
            throw null;
        }
    }

    public C147325qK(C147295qH c147295qH) {
        this.LIZ = c147295qH;
    }

    @Override // X.C6NA
    public final void x8(Runnable runnable) {
        C147295qH c147295qH = this.LIZ;
        c147295qH.LLJJIII = true;
        c147295qH.LLJJIJIL(new Runnable() { // from class: X.5qQ
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, runnable, c147295qH.LJLLL, c147295qH.LJLLLL, true);
    }
}
