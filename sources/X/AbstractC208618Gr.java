package X;

import android.graphics.drawable.Animatable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.8Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208618Gr<T> extends RecyclerView.ViewHolder implements MFR {
    public static final /* synthetic */ int LJLJJL = 0;
    public Aweme LJLIL;
    public SmartImageView LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.MFR
    public final void LLLILZ() {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView == null || smartImageView.getController() == null || this.LJLILLLLZI.getController().LIZ() == null) {
            return;
        }
        Animatable LIZ = this.LJLILLLLZI.getController().LIZ();
        if (LIZ instanceof InterfaceC208628Gs) {
            ((InterfaceC208628Gs) LIZ).LIZ();
        }
    }

    @Override // X.MFR
    public final void LLLLIILL() {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.LJ();
        }
    }

    @Override // X.MFR
    public final void d() {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.LJFF();
        }
    }

    public static boolean M() {
        if (C16880lQ.LLLZLL()) {
            return false;
        }
        boolean LIZIZ = C84S.LIZIZ("profile_aweme_post_use_dynamic_cover", false);
        if (((Number) C208648Gu.LIZ.getValue()).intValue() != 1) {
            return true;
        }
        return LIZIZ;
    }

    public boolean L() {
        boolean z;
        if (C16880lQ.LLLZLL()) {
            return false;
        }
        this.itemView.getContext();
        try {
            if (C2NU.LIZ.LIZIZ() && !C48207Ivz.LIZ(this.itemView.getContext())) {
                return false;
            }
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        if (!C84S.LIZIZ("use_dynamic_cover", z)) {
            return false;
        }
        return true;
    }

    @Override // X.MFR
    public final boolean LLZZZZ() {
        return this.LJLJI;
    }

    public AbstractC208618Gr(View view) {
        super(view);
        this.LJLJJI = true;
    }

    @Override // X.MFR
    public void LJJII(boolean z) {
        this.LJLILLLLZI.setAttached(z);
    }

    @Override // X.MFR
    public final void setUserVisibleHint(boolean z) {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.setUserVisibleHint(z);
        }
    }

    public final void bind(T t, int i) {
        this.LJLILLLLZI.setUserVisibleHint(false);
    }
}
