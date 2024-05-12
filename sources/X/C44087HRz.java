package X;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HRz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44087HRz extends HSS {
    public LibraryMaterialInfo LJLJLJ;

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    public final LibraryMaterialInfo LJJJJJ() {
        LJJJJIZL(new AqS173S0100000_7(this, 249));
        LibraryMaterialInfo libraryMaterialInfo = this.LJLJLJ;
        if (libraryMaterialInfo == null) {
            return new LibraryMaterialInfo(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
        return libraryMaterialInfo;
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C44087HRz();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final String LIZ() {
        if (TextUtils.equals(super.LIZ(), LJJI().getString(R.string.hro))) {
            String string = LJJI().getString(R.string.hrp);
            o.LJIIIIZZ(string, "{\n            activity()…p_from_library)\n        }");
            return string;
        }
        return super.LIZ();
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIZ(this, eventMapBuilder, 6);
        LJJJJIZL(new AqS173S0100000_7(this, LiveCoverMinSizeSetting.DEFAULT));
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(this, viewGroup, c188727au, 21));
    }
}
