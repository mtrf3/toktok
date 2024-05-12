package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OKV extends AbstractC62607Ohf {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ Room LIZJ;
    public final /* synthetic */ OKT LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.AbstractC62607Ohf
    public final int LIZLLL() {
        return R.raw.icon_2pt_fire;
    }

    @Override // X.AbstractC62607Ohf
    public final String LJ() {
        return "promote_button";
    }

    @Override // X.AbstractC62607Ohf
    public final int LJFF() {
        return R.string.phc;
    }

    @Override // X.AbstractC62607Ohf
    public final int LJI() {
        return 21;
    }

    @Override // X.AbstractC62607Ohf
    public final boolean LIZIZ() {
        if (this.LIZ && !this.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // X.AbstractC62607Ohf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r8, X.C29930Bos r9) {
        /*
            r7 = this;
            boolean r0 = r7.LIZIZ
            java.lang.String r2 = "myself"
            if (r0 == 0) goto L83
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LIZJ
            if (r0 == 0) goto L75
            int r1 = r0.cppVersion
            r0 = 2
            if (r1 != r0) goto L75
            com.ss.android.ugc.aweme.live.ILiveOuterService r6 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            r1 = 2131842894(0x7f11574e, float:1.9319137E38)
            r5 = 0
            if (r8 == 0) goto L6f
            android.content.res.Resources r0 = r8.getResources()
            if (r0 == 0) goto L6f
            java.lang.String r4 = r0.getString(r1)
        L23:
            android.content.res.Resources r0 = r8.getResources()
            if (r0 == 0) goto L73
            java.lang.String r3 = r0.getString(r1)
        L2d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.OKT r0 = r7.LIZLLL
            X.1qj r0 = r0.LJII(r8)
            if (r0 == 0) goto L3b
            androidx.fragment.app.FragmentManager r5 = r0.getSupportFragmentManager()
        L3b:
            r6.showCppUnlockGuideDialogV2(r4, r3, r1, r5)
        L3e:
            X.OKT r0 = r7.LIZLLL
            java.lang.String r4 = r7.LJFF
            r0.getClass()
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = X.OKW.LIZJ()
            java.lang.String r0 = "user_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r0 = "room_id"
            r3.LJIIIZ(r0, r4)
            java.lang.String r1 = "feature"
            java.lang.String r0 = "promote"
            r3.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "livesdk_anchor_feature_locked_toast_show"
            X.FMX.LJIIL(r0, r1)
            X.OKT r0 = r7.LIZLLL
            r0.getClass()
            X.OKT.LJIIIIZZ(r2)
            return
        L6f:
            r4 = r5
            if (r8 == 0) goto L73
            goto L23
        L73:
            r3 = r5
            goto L2d
        L75:
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            X.XvR r1 = r0.LJJIJIL()
            java.lang.String r0 = r7.LJ
            r1.LJIILLIIL(r0)
            goto L3e
        L83:
            X.OKT r0 = r7.LIZLLL
            r0.LJIIJ(r8, r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OKV.LIZJ(android.content.Context, X.Bos):void");
    }

    public OKV(boolean z, boolean z2, Room room, OKT okt, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = room;
        this.LIZLLL = okt;
        this.LJ = str;
        this.LJFF = str2;
    }
}
