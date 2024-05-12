package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.experiment.TTLingoGeckoLowStorageConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86673Xzx implements Y1S {
    public final /* synthetic */ VideoCLACaptionAssem LIZ;

    @Override // X.Y1S
    public final boolean LIZ() {
        String lv0 = this.LIZ.r4().lv0();
        if (lv0 != null && this.LIZ.r4().xv0() && (!C41032G8m.LIZ()) && AK4.LIZ().LJJIIJ(lv0)) {
            return true;
        }
        return false;
    }

    @Override // X.Y1S
    public final int LIZIZ() {
        return this.LIZ.q4();
    }

    @Override // X.Y1S
    public final void LIZJ() {
        this.LIZ.B4();
    }

    @Override // X.Y1S
    public final void LIZLLL() {
        this.LIZ.F4();
    }

    @Override // X.Y1S
    public final void LJ() {
        if (this.LIZ.r4().yv0()) {
            this.LIZ.z4().LJJIIZ(EnumC86688Y0m.NONE);
        } else {
            this.LIZ.D4(false);
        }
        this.LIZ.r4().qv0(EnumC86777Y3x.CLICK_ICON, this.LIZ.getContext(), false);
    }

    public C86673Xzx(VideoCLACaptionAssem videoCLACaptionAssem) {
        this.LIZ = videoCLACaptionAssem;
    }

    @Override // X.Y1S
    public final void LJFF(AqS165S0100000_15 aqS165S0100000_15) {
        String str;
        String str2;
        String str3;
        String str4;
        Aweme aweme;
        Aweme aweme2;
        boolean z = C25840ACe.LIZ;
        boolean LIZJ = ACW.LIZJ();
        VideoItemParams gv0 = this.LIZ.r4().gv0();
        Activity activity = null;
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null) {
            str = aweme2.getAuthorUid();
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId());
        boolean LJJIJIIJI = C79004UzY.LJJIJIIJI(this.LIZ.getContext());
        boolean isEnable = TTLingoGeckoLowStorageConfig.isEnable();
        C25845ACj.LIZ(this.LIZ.r4().nv0().LIZLLL, this.LIZ.r4().nv0().LIZ, LJJIJIIJI, LJ, LIZJ, false, z, isEnable);
        if (z && isEnable && LIZJ && !LJ && !LJJIJIIJI) {
            C25845ACj.LIZ(this.LIZ.r4().nv0().LIZLLL, this.LIZ.r4().nv0().LIZ, false, false, LIZJ, true, z, isEnable);
            VideoCLACaptionAssem videoCLACaptionAssem = this.LIZ;
            videoCLACaptionAssem.getClass();
            VideoItemParams gv02 = videoCLACaptionAssem.r4().gv0();
            if (gv02 != null && (aweme = gv02.getAweme()) != null) {
                str3 = aweme.getAid();
            } else {
                str3 = null;
            }
            VideoItemParams gv03 = videoCLACaptionAssem.r4().gv0();
            if (gv03 != null) {
                str4 = gv03.mEventType;
            } else {
                str4 = null;
            }
            EnumC86777Y3x enumC86777Y3x = EnumC86777Y3x.CLICK_SUBTITLE;
            Context context = videoCLACaptionAssem.getContext();
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            }
            C2U8.LIZ(new Y1A(str3, str4, enumC86777Y3x, System.identityHashCode(activity), new AqS181S0100000_15(videoCLACaptionAssem, 227)));
            VideoCLACaptionViewModel r4 = this.LIZ.r4();
            r4.nv0().LJIILL(this.LIZ.getContext(), r4.LJLLILLLL);
            return;
        }
        if (C41032G8m.LIZ()) {
            VideoCLACaptionAssem videoCLACaptionAssem2 = this.LIZ;
            videoCLACaptionAssem2.getClass();
            String lv0 = videoCLACaptionAssem2.r4().lv0();
            VideoItemParams gv04 = videoCLACaptionAssem2.r4().gv0();
            if (gv04 != null) {
                str2 = gv04.mEventType;
            } else {
                str2 = null;
            }
            EnumC86777Y3x enumC86777Y3x2 = EnumC86777Y3x.CLICK_SUBTITLE;
            Context context2 = videoCLACaptionAssem2.getContext();
            if (context2 != null) {
                activity = C45804HyK.LJIJJ(context2);
            }
            C2U8.LIZ(new Y1A(lv0, str2, enumC86777Y3x2, System.identityHashCode(activity), null));
            VideoCLACaptionViewModel r42 = this.LIZ.r4();
            r42.nv0().LJIILL(this.LIZ.getContext(), r42.LJLLILLLL);
            return;
        }
        if (!this.LIZ.r4().tv0(this.LIZ.getContext())) {
            this.LIZ.C4();
        }
        if (C53379KxD.LIZ()) {
            if (AK4.LIZ().LJIIIIZZ() || AK4.LIZ().LJFF() != 0) {
                aqS165S0100000_15.invoke();
            }
        }
    }
}
