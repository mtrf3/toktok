package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyCategoryListAssem;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.LcU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54642LcU extends AbstractC54643LcV {
    public String LJLIL;
    public String LJLILLLLZI;
    public final /* synthetic */ SYL LJLJI;
    public final /* synthetic */ NearbyCategoryListAssem LJLJJI;

    @Override // X.SYX
    public final void LJIIL(SZZ data) {
        ActivityC45651qj LJJIFFI;
        String str;
        o.LJIIIZ(data, "data");
        Context context = this.LJLJI.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJJIFFI);
            String str2 = null;
            if (LIZIZ != null) {
                str = LIZIZ.getManualRegion();
            } else {
                str = null;
            }
            this.LJLILLLLZI = str;
            RoamingLocationInfo LIZIZ2 = LJ5.LIZIZ(LJJIFFI);
            if (LIZIZ2 != null) {
                str2 = LIZIZ2.getManualRegionName();
            }
            this.LJLIL = str2;
        }
        this.LJLJJI.mc0(this.LJLILLLLZI, this.LJLIL);
    }

    public C54642LcU(SYL syl, NearbyCategoryListAssem nearbyCategoryListAssem) {
        this.LJLJI = syl;
        this.LJLJJI = nearbyCategoryListAssem;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        Context context;
        ActivityC45651qj LJJIFFI;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (context = this.LJLJI.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJJIFFI);
            String str2 = null;
            if (LIZIZ != null) {
                str = LIZIZ.getManualRegion();
            } else {
                str = null;
            }
            this.LJLILLLLZI = str;
            RoamingLocationInfo LIZIZ2 = LJ5.LIZIZ(LJJIFFI);
            if (LIZIZ2 != null) {
                str2 = LIZIZ2.getManualRegionName();
            }
            this.LJLIL = str2;
        }
        this.LJLJJI.mc0(this.LJLILLLLZI, this.LJLIL);
    }
}
