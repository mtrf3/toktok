package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;

/* loaded from: classes9.dex */
public final class JID implements JIB {
    public final /* synthetic */ UserPhotoHolder LIZ;
    public final /* synthetic */ JIB LIZIZ;

    @Override // X.JIB
    public final Fragment LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.JIB
    public final InterfaceC47667InH LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.JIB
    public final Context getContext() {
        return this.LIZIZ.getContext();
    }

    @Override // X.JIB
    public final boolean isActive() {
        return this.LIZIZ.isActive();
    }

    @Override // X.JIB
    public final String getIdentifier() {
        Integer num;
        Activity LJIJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AladdinAweme_");
        Context context = this.LIZ.itemView.getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            num = Integer.valueOf(LJIJJ.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        return X1D.LIZIZ(LIZ);
    }

    public JID(UserPhotoHolder userPhotoHolder, JIB jib) {
        this.LIZ = userPhotoHolder;
        this.LIZIZ = jib;
    }
}
