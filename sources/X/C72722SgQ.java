package X;

import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SgQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72722SgQ implements InterfaceC72741Sgj {
    public final /* synthetic */ DialogC72721SgP LIZ;
    public final /* synthetic */ C34K LIZIZ;
    public final /* synthetic */ Switch LIZJ;

    @Override // X.InterfaceC72741Sgj
    public final void onFail() {
        Boolean bool;
        C5S1 c5s1 = new C5S1(this.LIZ.getContext());
        c5s1.LIZJ(R.string.rjy);
        c5s1.LJ();
        this.LIZIZ.element = false;
        Switch r1 = this.LIZJ;
        ProfileBadgeStruct profileBadge = this.LIZ.LJLLJ.getProfileBadge();
        if (profileBadge != null) {
            bool = Boolean.valueOf(profileBadge.getShouldShow());
        } else {
            bool = null;
        }
        o.LJI(bool);
        r1.setChecked(bool.booleanValue());
        if (this.LIZJ.isChecked()) {
            SmartImageView smartImageView = this.LIZ.LLFII;
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
            }
            TextView textView = this.LIZ.LLFZ;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        SmartImageView smartImageView2 = this.LIZ.LLFII;
        if (smartImageView2 != null) {
            smartImageView2.setVisibility(8);
        }
        TextView textView2 = this.LIZ.LLFZ;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // X.InterfaceC72741Sgj
    public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
        this.LIZIZ.element = false;
        if (profileBadgeStruct == null) {
            C5S1 c5s1 = new C5S1(this.LIZ.getContext());
            c5s1.LIZJ(R.string.rjy);
            c5s1.LJ();
        }
    }

    public C72722SgQ(Switch r1, DialogC72721SgP dialogC72721SgP, C34K c34k) {
        this.LIZ = dialogC72721SgP;
        this.LIZIZ = c34k;
        this.LIZJ = r1;
    }
}
