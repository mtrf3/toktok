package X;

import Y.IDxS126S0200000_1;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.originalPanel.DesignerEffectInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.HWa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44192HWa implements InterfaceC74336TFk {
    public final ShortVideoContext LIZ;
    public final InterfaceC45540Hu4 LIZIZ;
    public final C29S LIZJ;
    public final C5HC LIZLLL;
    public final I9W LJ;

    @Override // X.InterfaceC74336TFk
    public final void LIZIZ() {
        C29S c29s = this.LIZJ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.tby);
        C78915Uy7.LJJIIZI(c29s, 6001, creativeToastBuilder);
    }

    @Override // X.InterfaceC74336TFk
    public final void LJFF() {
        I9W i9w = this.LJ;
        if (i9w instanceof I0N) {
            ((I0N) i9w).cy(true);
        }
    }

    @Override // X.InterfaceC74336TFk
    public final boolean LJII() {
        if (C00F.LIZ(31744, 0, "studio_creators_names_clickable", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74336TFk
    public final void LJIIIIZZ() {
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LIZIZ;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListenerHead(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC74336TFk
    public final void LJIIIZ() {
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LIZIZ;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LIZLLL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r3 == null) goto L21;
     */
    @Override // X.InterfaceC74336TFk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(boolean r7) {
        /*
            r6 = this;
            java.lang.String r5 = "click_personal_board"
            java.lang.String r3 = "enter_method"
            java.lang.String r2 = "video_shoot_page"
            java.lang.String r1 = "enter_from"
            if (r7 == 0) goto L1d
            X.5oB r0 = new X.5oB
            r0.<init>()
            r0.LJI(r1, r2)
            r0.LJI(r3, r5)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "follow"
            X.FMX.LJIIL(r0, r1)
        L1c:
            return
        L1d:
            X.5oB r4 = new X.5oB
            r4.<init>()
            r4.LJI(r1, r2)
            r4.LJI(r3, r5)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L34
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L37
        L34:
            r1 = r2
            if (r3 == 0) goto L64
        L37:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L3f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.LJI(r1, r0)
            if (r3 == 0) goto L4e
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L51
        L4e:
            r1 = r2
            if (r3 == 0) goto L57
        L51:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L62
        L57:
            r4.LJI(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "follow_cancel"
            X.FMX.LJIIL(r0, r1)
            goto L1c
        L62:
            r2 = r0
            goto L57
        L64:
            r0 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44192HWa.LIZLLL(boolean):void");
    }

    @Override // X.InterfaceC74336TFk
    public final void LIZ(String uid, AqS143S0200000_12 aqS143S0200000_12) {
        o.LJIIIZ(uid, "uid");
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        ((DesignerEffectInfo) networkService.retrofitCreate(LIZ, DesignerEffectInfo.class)).fetch(uid, 0, 10).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS126S0200000_1(aqS143S0200000_12, this, 2));
    }

    @Override // X.InterfaceC74336TFk
    public final int LJ(String uid, String secUid) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(secUid, "secUid");
        return C60903NvH.LJIIJJI().getAccountService().LJII(uid, secUid).LJFF();
    }

    @Override // X.InterfaceC74336TFk
    public final void LIZJ(int i, String uid, String secUid, AqS178S0100000_12 aqS178S0100000_12) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(secUid, "secUid");
        C60903NvH.LJIIJJI().getAccountService().LIZLLL(i, uid, secUid, new AqS173S0100000_7(aqS178S0100000_12, 254));
    }

    @Override // X.InterfaceC74336TFk
    public final void LJI(int i, String effectId, String str, String str2) {
        o.LJIIIZ(effectId, "effectId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJI());
        c145995oB.LJI("enter_method", "click_main_panel");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("prop_id", effectId);
        c145995oB.LJI("shoot_way", this.LIZ.shootWay);
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("tab_name", str);
        c145995oB.LIZ(1, "is_original_prop");
        c145995oB.LJI("prop_author_id", str2);
        c145995oB.LIZ(i, "order");
        FMX.LJIIL("click_prop_username", c145995oB.LIZ);
    }

    public C44192HWa(ShortVideoContext shortVideoContext, InterfaceC45540Hu4 interfaceC45540Hu4, C29S activity, C73094SmQ c73094SmQ, I9W i9w) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = shortVideoContext;
        this.LIZIZ = interfaceC45540Hu4;
        this.LIZJ = activity;
        this.LIZLLL = c73094SmQ;
        this.LJ = i9w;
    }
}
