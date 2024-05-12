package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C61984OUi;
import X.C76800UCe;
import X.EnumC211478Rr;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import Y.ARunnableS46S0100000_10;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.s1;

/* loaded from: classes11.dex */
public class AqS53S0110000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS53S0110000_10 aqS53S0110000_10, Object obj) {
        int i;
        AwemeRawAd awemeRawAd;
        FollowButtonData followButtonData;
        Integer showSeconds;
        C61984OUi state = (C61984OUi) obj;
        o.LJIIIZ(state, "state");
        if (o.LJ(((VideoRelationBtnAssem) aqS53S0110000_10.l0).u4().LJLJLLL, EnumC211478Rr.AD.getValue()) && state.LJLIL.LIZ.booleanValue()) {
            if (aqS53S0110000_10.z1) {
                Aweme aweme = ((VideoRelationBtnAssem) aqS53S0110000_10.l0).LLIFFJFJJ;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (followButtonData = awemeRawAd.getFollowButtonData()) != null && (showSeconds = followButtonData.getShowSeconds()) != null) {
                    i = showSeconds.intValue();
                } else {
                    i = 2;
                }
                int i2 = i * 1000;
                VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) aqS53S0110000_10.l0;
                ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(videoRelationBtnAssem, 51);
                videoRelationBtnAssem.LLIILII = aRunnableS46S0100000_10;
                View view = videoRelationBtnAssem.LLFII;
                if (view != null) {
                    view.postDelayed(aRunnableS46S0100000_10, i2);
                }
            } else {
                VideoRelationBtnAssem videoRelationBtnAssem2 = (VideoRelationBtnAssem) aqS53S0110000_10.l0;
                ARunnableS46S0100000_10 aRunnableS46S0100000_102 = new ARunnableS46S0100000_10(videoRelationBtnAssem2, 52);
                ARunnableS46S0100000_10 aRunnableS46S0100000_103 = videoRelationBtnAssem2.LLIILII;
                if (aRunnableS46S0100000_103 != null) {
                    View view2 = videoRelationBtnAssem2.LLFII;
                    if (view2 != null) {
                        view2.removeCallbacks(aRunnableS46S0100000_103);
                    }
                    videoRelationBtnAssem2.LLIILII = null;
                }
                View view3 = ((VideoRelationBtnAssem) aqS53S0110000_10.l0).LLFII;
                if (view3 != null) {
                    view3.post(aRunnableS46S0100000_102);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS53S0110000_10 aqS53S0110000_10, Object obj) {
        C252709vu it = (C252709vu) obj;
        o.LJIIIZ(it, "it");
        C235119Kp c235119Kp = new C235119Kp();
        if (aqS53S0110000_10.z1) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS160S0100000_10((InterfaceC65784Pro) aqS53S0110000_10.l0, (InterfaceC65784Pro<C76800UCe>) 403));
            c235119Kp.LIZIZ(LIZJ);
        } else {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS160S0100000_10((InterfaceC65784Pro) aqS53S0110000_10.l0, (InterfaceC65784Pro<C76800UCe>) 404));
            c235119Kp.LIZLLL(LIZJ2);
        }
        it.setNavActions(c235119Kp);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS53S0110000_10 aqS53S0110000_10, Object obj) {
        C252709vu it = (C252709vu) obj;
        o.LJIIIZ(it, "it");
        C235119Kp c235119Kp = new C235119Kp();
        if (aqS53S0110000_10.z1) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS160S0100000_10((InterfaceC65784Pro) aqS53S0110000_10.l0, (InterfaceC65784Pro<C76800UCe>) 417));
            c235119Kp.LIZIZ(LIZJ);
        } else {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS160S0100000_10((InterfaceC65784Pro) aqS53S0110000_10.l0, (InterfaceC65784Pro<C76800UCe>) 418));
            c235119Kp.LIZLLL(LIZJ2);
        }
        it.setNavActions(c235119Kp);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0110000_10(InterfaceC65784Pro interfaceC65784Pro, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0110000_10(VideoRelationBtnAssem videoRelationBtnAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoRelationBtnAssem;
        this.z1 = z;
    }
}
