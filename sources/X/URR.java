package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class URR extends AbstractC238349Xa {
    public final C77211URz LIZIZ;
    public final Integer LIZJ;
    public final C62822Ol8 LIZLLL;

    public java.util.Map<String, String> LJ() {
        String str = null;
        if (this.LIZIZ.LJLIL.LIZLLL.LIZ != EnumC77147UPn.FACEBOOK) {
            return null;
        }
        C188727au c188727au = new C188727au();
        Boolean LJIIL = C77266UUc.LIZIZ.LJIIJ().LJIIL(((RBX) HG3.LJIILL()).getCurUserId());
        if (LJIIL != null) {
            str = AbstractC238349Xa.LIZJ(LJIIL.booleanValue());
        }
        c188727au.LJIIIZ("fb_token_expired", str);
        c188727au.LJFF(this.LIZJ, "server_fb_token");
        return c188727au.LIZ;
    }

    public final String LJFF() {
        C77211URz c77211URz = this.LIZIZ;
        C77217USf c77217USf = c77211URz.LJLILLLLZI.LJLIL;
        if (!c77217USf.LJLIL) {
            if (!c77217USf.LJLILLLLZI) {
                return "both";
            }
            int i = C77188URc.LIZ[c77211URz.LJLIL.LIZLLL.LIZ.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return "did";
                }
                "wrong relationAuthPlatform".toString();
                throw new IllegalStateException("wrong relationAuthPlatform");
            }
            return "token";
        }
        if (!c77217USf.LJLILLLLZI) {
            return "uid";
        }
        "wrong initStatus for auth pipeline".toString();
        throw new IllegalStateException("wrong initStatus for auth pipeline");
    }

    public final java.util.Map<String, String> LJI() {
        boolean z;
        int currentTimeMillis;
        boolean z2;
        java.util.Map map;
        java.util.Map LJJJLIIL;
        RelationFreqControlData relationFreqControlData;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Bundle bundle = this.LIZIZ.LJLIL.LJFF;
        boolean z6 = true;
        if (bundle != null && bundle.getBoolean("is_passive_pop_up") && bundle.getBoolean("is_normal_freq_control")) {
            z = true;
        } else {
            z = false;
        }
        RelationFreqControlData relationFreqControlData2 = null;
        if (!z) {
            return null;
        }
        C188727au c188727au = new C188727au();
        Bundle bundle2 = this.LIZIZ.LJLIL.LJFF;
        if (bundle2 != null) {
            relationFreqControlData2 = (RelationFreqControlData) bundle2.getParcelable("freq_data_before_pipeline");
        }
        if (relationFreqControlData2 == null) {
            map = C113554cx.LJJJLIIL();
        } else {
            if (relationFreqControlData2.lastShowTime == 0) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = (int) ((System.currentTimeMillis() - relationFreqControlData2.lastShowTime) / 86400000);
            }
            Bundle bundle3 = this.LIZIZ.LJLIL.LJFF;
            if (bundle3 != null) {
                z2 = bundle3.getBoolean("is_followed_pop_up");
            } else {
                z2 = false;
            }
            C188727au c188727au2 = new C188727au();
            c188727au2.LIZLLL(relationFreqControlData2.showIndex, "show_index");
            c188727au2.LIZLLL(currentTimeMillis, "time_int");
            c188727au2.LJIIIZ("followed_another", AbstractC238349Xa.LIZJ(z2));
            map = c188727au2.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …))\n            .builder()");
        }
        c188727au.LJIIIIZZ(map);
        Bundle bundle4 = this.LIZIZ.LJLIL.LJFF;
        if (bundle4 == null || (relationFreqControlData = (RelationFreqControlData) bundle4.getParcelable("freq_data_before_pipeline")) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        } else {
            if (!((Keva) this.LIZLLL.getValue()).getBoolean("has_go_through_process", false) && relationFreqControlData.firstPhaseCount < 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (((Keva) this.LIZLLL.getValue()).getLong("sync_off_contact_time", 0L) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (((Keva) this.LIZLLL.getValue()).getLong("sync_off_facebook_time", 0L) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            EnumC77147UPn enumC77147UPn = this.LIZIZ.LJLIL.LIZLLL.LIZ;
            if ((!z4 || enumC77147UPn != EnumC77147UPn.CONTACT) && (!z5 || enumC77147UPn != EnumC77147UPn.FACEBOOK)) {
                z6 = false;
            }
            C188727au c188727au3 = new C188727au();
            if (z3) {
                str = "normal";
            } else if (z6) {
                str = "turn_off";
            } else {
                str = "reject_all";
            }
            c188727au3.LJIIIZ("reason", str);
            LJJJLIIL = c188727au3.LIZ;
            o.LJIIIIZZ(LJJJLIIL, "newBuilder()\n           …L)\n            .builder()");
        }
        c188727au.LJIIIIZZ(LJJJLIIL);
        return c188727au.LIZ;
    }

    public final java.util.Map<String, String> LJII() {
        RelationFreqControlData relationFreqControlData;
        Bundle bundle = this.LIZIZ.LJLIL.LJFF;
        if (bundle == null || (relationFreqControlData = (RelationFreqControlData) bundle.getParcelable("freq_data_before_pipeline")) == null) {
            return C113554cx.LJJJLIIL();
        }
        Bundle bundle2 = this.LIZIZ.LJLIL.LJFF;
        if (bundle2 == null || !bundle2.getBoolean("is_passive_pop_up")) {
            return null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(relationFreqControlData.totalPopupCount, "total_pop_up_count");
        return c188727au.LIZ;
    }

    public URR(C77211URz authContext, Integer num) {
        o.LJIIIZ(authContext, "authContext");
        this.LIZIZ = authContext;
        this.LIZJ = num;
        this.LIZLLL = C221108m2.LIZIZ(C77189URd.LJLIL);
    }
}
