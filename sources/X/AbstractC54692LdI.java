package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LdI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54692LdI extends AbstractC54684LdA {
    public final RelativeLayout LJLJJI;
    public final C72433Sbl LJLJJL;
    public final TuxIconView LJLJJLL;
    public final C62822Ol8 LJLJL;

    public void X(C53882LCs c53882LCs) {
    }

    public AbstractC54692LdI(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.fog);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.leftTopArea)");
        this.LJLJJI = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.foh);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.leftTopBackground)");
        this.LJLJJL = (C72433Sbl) findViewById2;
        View findViewById3 = view.findViewById(R.id.foi);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.leftTopIcon)");
        this.LJLJJLL = (TuxIconView) findViewById3;
        this.LJLJL = C221108m2.LIZIZ(C54698LdO.LJLIL);
    }

    @Override // X.AbstractC54684LdA
    public final void P(TextView liveTag) {
        Integer valueOf;
        int i;
        o.LJIIIZ(liveTag, "liveTag");
        this.LJLJJI.setVisibility(8);
        if (((LiveEventAndSubscribeConfig) this.LJLJL.getValue()).addLiveEventAndSubscribe) {
            C40517FvF c40517FvF = new C40517FvF(1, 2);
            FollowingInterestUser N = N();
            if (N != null && (valueOf = Integer.valueOf(N.getInterestUserType())) != null && c40517FvF.LJIILJJIL(valueOf.intValue())) {
                int i2 = ((LiveEventAndSubscribeConfig) this.LJLJL.getValue()).styleOfLiveEventAndSubscribe;
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.LJLJJI.setVisibility(8);
                    FollowingInterestUser N2 = N();
                    if (N2 != null && N2.getInterestUserType() == 1) {
                        liveTag.setText(R.string.ohv);
                    }
                    FollowingInterestUser N3 = N();
                    if (N3 != null && N3.getInterestUserType() == 2) {
                        liveTag.setText(R.string.mgt);
                    }
                    if (!(liveTag instanceof C54722Ldm)) {
                        return;
                    }
                    liveTag.post(new ARunnableS45S0100000_9((Object) liveTag, 196));
                    return;
                }
                this.LJLJJI.setVisibility(0);
                C72433Sbl c72433Sbl = this.LJLJJL;
                if (((LiveEventAndSubscribeConfig) this.LJLJL.getValue()).styleOfLiveEventAndSubscribe == 1) {
                    i = R.drawable.aui;
                } else {
                    i = R.drawable.auh;
                }
                c72433Sbl.setBackgroundResource(i);
                FollowingInterestUser N4 = N();
                if (N4 != null && N4.getInterestUserType() == 1) {
                    this.LJLJJLL.setIconRes(R.raw.icon_star_ring_fill);
                }
                FollowingInterestUser N5 = N();
                if (N5 != null && N5.getInterestUserType() == 2) {
                    this.LJLJJLL.setIconRes(R.raw.icon_calendar_star_fill);
                }
                this.LJLJJLL.setTintColorRes(R.attr.cl);
            }
        }
    }
}
