package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sgb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72733Sgb extends RecyclerView.ViewHolder {
    public final String LJLIL;
    public final C72434Sbm LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final TuxTextView LJLJJI;

    public C72733Sgb(View view) {
        super(view);
        this.LJLIL = "EditProfileBadgeAdapter";
        this.LJLILLLLZI = (C72434Sbm) view.findViewById(R.id.cno);
        this.LJLJI = (SmartImageView) view.findViewById(R.id.cnr);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.cnq);
        view.findViewById(R.id.cnp);
    }

    public final void L(EditProfileBadgeModel editProfileBadgeModel, User user) {
        o.LJIIIZ(user, "user");
        if (this.LJLILLLLZI != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJI(user)));
            LJII.LJJIIJ = this.LJLILLLLZI;
            LJII.LIZIZ(this.LJLIL);
            C16880lQ.LLJJJ(LJII);
        }
        if (this.LJLJI != null && C78857UxB.LJJJIL(editProfileBadgeModel.getUrl()) && editProfileBadgeModel.getShouldShow() != null && o.LJ(editProfileBadgeModel.getShouldShow(), Boolean.TRUE)) {
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
            }
            String url = editProfileBadgeModel.getUrl();
            o.LJI(url);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
            LJIIIIZZ.LJJIIJ = this.LJLJI;
            LJIIIIZZ.LIZIZ(this.LJLIL);
            C16880lQ.LLJJJ(LJIIIIZZ);
        } else {
            SmartImageView smartImageView2 = this.LJLJI;
            if (smartImageView2 != null) {
                smartImageView2.setVisibility(8);
            }
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(editProfileBadgeModel.getDescription());
        }
    }
}
