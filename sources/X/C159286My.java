package X;

import Y.AObjectS116S0200000_2;
import Y.AObjectS84S0100000_2;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159286My extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final C159126Mi LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public ObjectAnimator LJLJJLL;
    public View LJLJL;
    public TuxTextView LJLJLJ;
    public TuxIconView LJLJLLL;
    public View LJLL;
    public TuxTextView LJLLI;
    public View LJLLILLLL;
    public C72434Sbm LJLLJ;
    public C1303559r LJLLL;
    public View LJLLLL;
    public TuxIconView LJLLLLLL;
    public LinearLayout LJLZ;
    public TextView LJZ;
    public LinearLayout LJZI;
    public TuxTextView LJZL;
    public final C5H3 LL;
    public final C82631Wbr LLD;
    public final C82631Wbr LLF;
    public final C82631Wbr LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final C82632Wbs LLFZ;
    public final C82631Wbr LLI;
    public final C82631Wbr LLIFFJFJJ;
    public final Keva LLII;
    public boolean LLIIII;
    public final boolean LLIIIILZ;

    static {
        TBT tbt = new TBT(C159286My.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C159286My.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0, c65351Pkp), C61845OOz.LIZJ(C159286My.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0, c65351Pkp), C61845OOz.LIZJ(C159286My.class, "editSaveLocalApi", "getEditSaveLocalApi()Lcom/ss/android/ugc/gamora/editor/savelocal/EditSaveLocalApi;", 0, c65351Pkp), C61845OOz.LIZJ(C159286My.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C159286My.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0, c65351Pkp), C61845OOz.LIZJ(C159286My.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0, c65351Pkp)};
    }

    public final void LLJILJIL() {
        String str;
        if (this.LLFFF) {
            LLJILJILJ();
            if (o.LJ(getEditModel().mShootWay, "chat_shoot")) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LJI;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                    return;
                } else {
                    o.LJIJI("dmPublish");
                    throw null;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("account");
            C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
            if (currentUser != null) {
                str = currentUser.getSecUid();
            } else {
                str = null;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            boolean z = this.LLII.getBoolean(LIZIZ, true);
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = getEditModel().creativeModel.initialModel.duetAndStitchRouterConfig;
            if (duetAndStitchRouterConfig != null && duetAndStitchRouterConfig.isEcommerce && z) {
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                C26227ARb c26227ARb = new C26227ARb(requireActivity);
                c26227ARb.LIZ(R.string.hsf);
                UC0.LIZJ(c26227ARb, new AqS168S0100000_2(this, 244));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
                this.LLII.storeBoolean(LIZIZ, false);
                return;
            }
            InterfaceC143385jy interfaceC143385jy = (InterfaceC143385jy) this.LLIFFJFJJ.LIZ(this, LLIIIJ[6]);
            if (interfaceC143385jy != null && C143475k7.LIZ(interfaceC143385jy, "click_edit_page_next", !getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), new AqS152S0100000_2(this, 407), 8)) {
                return;
            }
            AnonymousClass632.LIZIZ(getSceneContext());
            H78.LIZ("VEVideoPublishEditActivity nextStep OnClick");
            getEditPreviewApi().lN();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLIL.LJII;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            } else {
                o.LJIJI("next");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bf, code lost:
    
        r0 = r27.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c3, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c5, code lost:
    
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c8, code lost:
    
        if (r1 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d2, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d4, code lost:
    
        r0 = r27.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r3 = com.zhiliaoapp.musically.R.drawable.qu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d6, code lost:
    
        if (r0 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d8, code lost:
    
        r0.setTintColorRes(com.zhiliaoapp.musically.R.attr.do);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0342, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStepIcon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0346, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0347, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStepIcon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x034b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x035d, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStepText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0361, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0362, code lost:
    
        kotlin.jvm.internal.o.LJIJI("tvQuickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0366, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (r1 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0367, code lost:
    
        kotlin.jvm.internal.o.LJIJI("editorProBtn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x036c, code lost:
    
        kotlin.jvm.internal.o.LJIJI("quickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0370, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e8, code lost:
    
        r0 = X.C7MY.LIZIZ(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0371, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStepText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0375, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f0, code lost:
    
        r4 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r4 = r27.LJZL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x037b, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStep");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0381, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f3, code lost:
    
        r0 = com.zhiliaoapp.musically.R.string.rsz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0382, code lost:
    
        kotlin.jvm.internal.o.LJIJI("tvQuickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0386, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f8, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0387, code lost:
    
        kotlin.jvm.internal.o.LJIJI("quickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x038b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x038c, code lost:
    
        kotlin.jvm.internal.o.LJIJI("quickPublishAvatar");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0392, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r4 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02fb, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0393, code lost:
    
        kotlin.jvm.internal.o.LJIJI("bottomLayout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0398, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0399, code lost:
    
        kotlin.jvm.internal.o.LJIJI("quickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x039c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x039d, code lost:
    
        kotlin.jvm.internal.o.LJIJI("editorProBtn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fe, code lost:
    
        r0 = r27.LJZL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0300, code lost:
    
        if (r0 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0302, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        r4.setVisibility(0);
        r0 = r27.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03a1, code lost:
    
        kotlin.jvm.internal.o.LJIJI("editorProBtn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032b, code lost:
    
        X.C44384HbQ.LJJIJIL(getEditModel());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0333, code lost:
    
        r3 = com.zhiliaoapp.musically.R.drawable.qw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0307, code lost:
    
        r6 = com.zhiliaoapp.musically.R.drawable.qr;
        r9 = com.zhiliaoapp.musically.R.drawable.qp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0315, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0317, code lost:
    
        r3 = com.zhiliaoapp.musically.R.drawable.qv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0324, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0326, code lost:
    
        r3 = com.zhiliaoapp.musically.R.drawable.qx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0040, code lost:
    
        if (r0.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r4.setBackground(X.C04270Et.LIZIZ(r0.getContext(), r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        r7 = r27.LJZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r7 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r1 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r0 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        r4 = new android.widget.FrameLayout.LayoutParams(r0, -2);
        r4.gravity = 8388613;
        r4.bottomMargin = X.C7MY.LIZIZ(11);
        r7.setLayoutParams(r4);
        r7 = r27.LJLLILLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r7 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        r4.gravity = 16;
        r4.setMarginEnd(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(3)));
        r7.setLayoutParams(r4);
        r4 = r27.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r4 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r1 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r7 = r4.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        r4.setBackground(X.C04270Et.LIZIZ(r7, r6));
        r7 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        r6 = new android.widget.LinearLayout.LayoutParams(r7, X.C7MY.LIZIZ(44));
        r6.setMarginEnd(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if (r1 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        r6.weight = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        r4.setLayoutParams(r6);
        r4.setMinimumWidth(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(88)));
        X.C26338AVi.LJIIIZ(r4, java.lang.Integer.valueOf(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(8))), X.C1FJ.LIZIZ(8), X.AnonymousClass391.LIZJ(12), java.lang.Integer.valueOf(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(8))), 16);
        r6 = r27.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
    
        if (r6 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0142, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
    
        r0 = com.zhiliaoapp.musically.R.string.pik;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        r6.setText(getString(r0));
        r4 = r6.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0155, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0157, code lost:
    
        r0 = X.C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.dj, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        r6.setTextColor(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0164, code lost:
    
        r6.setMinTextSizePx(-1);
        r6 = r27.LJLJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        if (r6 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016b, code lost:
    
        if (r1 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016d, code lost:
    
        r0 = r27.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016f, code lost:
    
        if (r0 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0171, code lost:
    
        r6.setBackground(X.C04270Et.LIZIZ(r0.getContext(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0376, code lost:
    
        kotlin.jvm.internal.o.LJIJI("quickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x037a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017c, code lost:
    
        X.C26338AVi.LJIIIZ(r6, X.AnonymousClass391.LIZJ(12), 0, java.lang.Integer.valueOf(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(12))), 0, 16);
        r6.setMinimumWidth(X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(88)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01aa, code lost:
    
        if (r1 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ac, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ad, code lost:
    
        r3 = new android.widget.LinearLayout.LayoutParams(r4, X.C7MY.LIZIZ(44));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b6, code lost:
    
        if (r1 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b8, code lost:
    
        r3.weight = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ba, code lost:
    
        r6.setLayoutParams(r3);
        r4 = r27.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bf, code lost:
    
        if (r4 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:
    
        r3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        r3.gravity = 17;
        r4.setLayoutParams(r3);
        r4 = X.C32151Nz.LJIIZILJ(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e0, code lost:
    
        if (r4 <= X.C32151Nz.LJIIZILJ(12)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e2, code lost:
    
        r3 = getString(com.zhiliaoapp.musically.R.string.rsz);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.story_tab)");
        r5 = LLJJ(r4, r3, X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(27)));
        r3 = getString(com.zhiliaoapp.musically.R.string.mt);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.Edit)");
        r6 = LLJJ(r4, r3, 0) + r5;
        r3 = getString(com.zhiliaoapp.musically.R.string.ipo);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.next)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021e, code lost:
    
        if (r11 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0220, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0221, code lost:
    
        r5 = LLJJ(r4, r3, r0) + r6;
        r0 = r27.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0228, code lost:
    
        if (r0 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0.getVisibility() == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022a, code lost:
    
        r3 = r0.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "quickPublish.context");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023e, code lost:
    
        if ((X.C63081OpJ.LJJJJL(r3) - r5) < X.C7MY.LIZIZ(78)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02dc, code lost:
    
        r4 = r4 - X.C32151Nz.LJIIZILJ(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0240, code lost:
    
        r0 = r27.LJZL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0242, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0244, code lost:
    
        r0.setTextSize(0, r4);
        r0 = r27.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024a, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024c, code lost:
    
        r0.setTextSize(0, r4);
        r0 = r27.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0251, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        r27.LLIIII = true;
        r1 = X.C145885o0.LIZIZ(getEditModel());
        r11 = X.C145885o0.LIZJ(getEditModel(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0253, code lost:
    
        r0.setTextSize(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0263, code lost:
    
        if (X.C44384HbQ.LJJIJIL(getEditModel()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0271, code lost:
    
        if (getEditModel().creativeModel.searchCreateModel.isFromSearch() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0273, code lost:
    
        r3 = r27.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0275, code lost:
    
        if (r3 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0277, code lost:
    
        r3.setTextColorRes(com.zhiliaoapp.musically.R.attr.dj);
        r0 = r27.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027f, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (r11 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0281, code lost:
    
        r0.setTextColorRes(com.zhiliaoapp.musically.R.attr.do);
        r3 = r27.LJLLLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0286, code lost:
    
        if (r3 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0288, code lost:
    
        r3.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x034c, code lost:
    
        kotlin.jvm.internal.o.LJIJI("postArrowImageView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0352, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0353, code lost:
    
        kotlin.jvm.internal.o.LJIJI("nextStepText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0357, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0358, code lost:
    
        kotlin.jvm.internal.o.LJIJI("tvQuickPublish");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x035c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028d, code lost:
    
        if (r11 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r6 = com.zhiliaoapp.musically.R.drawable.qq;
        r9 = com.zhiliaoapp.musically.R.drawable.qo;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI() {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159286My.LLJJIJI():void");
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLFZ.LIZ(this, LLIIIJ[4]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LL.getValue();
    }

    public final void LLJILJILJ() {
        C6F2 c6f2;
        if (!H7R.LJJJJZ(getEditModel()) && !C78866UxK.LJJJLZIJ(getEditModel()) && (c6f2 = (C6F2) this.LLF.LIZ(this, LLIIIJ[2])) != null) {
            c6f2.LLJJ().G();
        }
    }

    public final String LLJJI() {
        if (C79004UzY.LJJIZ(getEditModel().canvasVideoData) && getEditModel().creativeModel.forwardEditPublishData != null) {
            String string = getString(R.string.ps5);
            o.LJIIIIZZ(string, "{\n                getStr…dit_button)\n            }");
            return string;
        }
        if (C79004UzY.LJJIII(getEditModel().canvasVideoData)) {
            String string2 = getString(R.string.r5w);
            o.LJIIIIZZ(string2, "{\n                getStr…tory_entry)\n            }");
            return string2;
        }
        CreativeModel creativeModel = getEditModel().creativeModel;
        o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
        if (creativeModel.changeAvatarModel.isFromChangeAvatar && this.LLIIIILZ) {
            CreativeModel creativeModel2 = getEditModel().creativeModel;
            o.LJIIIIZZ(creativeModel2, "editModel.creativeModel");
            if (!creativeModel2.changeAvatarModel.isFromAiVatar) {
                String string3 = getString(R.string.rs6);
                o.LJIIIIZZ(string3, "{\n                getStr…_selfstory)\n            }");
                return string3;
            }
        }
        if (getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar && (!getEditModel().mIsFromDraft || getEditModel().creativeModel.changeAvatarModel.isSingletonRecover)) {
            String string4 = getString(R.string.p7p);
            o.LJIIIIZZ(string4, "{\n                getStr…y_cta_save)\n            }");
            return string4;
        }
        if (C44384HbQ.LJJIJIL(getEditModel())) {
            String string5 = getString(R.string.pik);
            o.LJIIIIZZ(string5, "{\n                getStr…ng.publish)\n            }");
            return string5;
        }
        String string6 = getString(R.string.rs6);
        o.LJIIIIZZ(string6, "getString(R.string.story_leftlist_selfstory)");
        return string6;
    }

    public final boolean LLJJIII() {
        if (!C79004UzY.LJJIII(getEditModel().canvasVideoData) && !C79004UzY.LJJIJL(getEditModel().canvasVideoData)) {
            View view = this.LJLL;
            if (view != null) {
                if (view.getVisibility() != 0) {
                    if (getEditModel().mShootMode == 16 && !e1.LIZ(31744, "enable_non_story_tab_publish_story", true, true) && !H7R.LJJJJL(getEditModel())) {
                        return true;
                    }
                    return false;
                }
            } else {
                o.LJIJI("quickPost");
                throw null;
            }
        }
        return true;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (C44384HbQ.LJJIJIL(getEditModel())) {
            TCMPostPageSubmitTextModel submitText = getEditModel().creativeModel.commerceModel.getTcmModel().getSubmitText();
            if (getEditModel().creativeModel.commerceModel.getTcmModel().isTcmOrder() && submitText != null && submitText.getSubmitButtonText() != null) {
                TuxIconView tuxIconView = this.LJLLLLLL;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_tick_fill);
                    tuxIconView.setTintColorRes(R.attr.dj);
                    TuxTextView tuxTextView = this.LJLLI;
                    if (tuxTextView != null) {
                        tuxTextView.setText(submitText.getSubmitButtonText());
                        return;
                    } else {
                        o.LJIJI("tvQuickPublish");
                        throw null;
                    }
                }
                o.LJIJI("postArrowImageView");
                throw null;
            }
            TuxIconView tuxIconView2 = this.LJLLLLLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(requireSceneContext().getDrawable(R.drawable.az0));
                TuxTextView tuxTextView2 = this.LJLLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(LLJJI());
                    return;
                } else {
                    o.LJIJI("tvQuickPublish");
                    throw null;
                }
            }
            o.LJIJI("postArrowImageView");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public C159286My(C159126Mi c159126Mi, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = c159126Mi;
        this.LJLILLLLZI = diContainer;
        this.LL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LLD = UCI.LJII(diContainer, InterfaceC145815nt.class, null);
        UCI.LJII(diContainer, C6E7.class, null);
        this.LLF = UCI.LJII(diContainer, C6F2.class, null);
        this.LLFF = UCI.LJII(diContainer, InterfaceC147455qX.class, null);
        this.LLFFF = true;
        this.LLFII = true;
        this.LLFZ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LLI = UCI.LJII(diContainer, C6NA.class, null);
        this.LLIFFJFJJ = UCI.LJII(diContainer, InterfaceC143385jy.class, null);
        this.LLII = Keva.getRepo("add_link_dialog");
        this.LLIIIILZ = AnonymousClass600.LIZ();
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel avatarThumb;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = true;
        if (C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) != 1) {
            z = false;
        }
        if (z && C1533860g.LIZ(getEditModel())) {
            View requireViewById = requireViewById(R.id.ar4);
            o.LJIIIIZZ(requireViewById, "requireViewById(R.id.bottom_save_btn)");
            LinearLayout linearLayout = (LinearLayout) requireViewById;
            this.LJLZ = linearLayout;
            linearLayout.setVisibility(0);
            View requireViewById2 = requireViewById(R.id.jaw);
            o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.save_tv)");
            this.LJZ = (TextView) requireViewById2;
            View requireViewById3 = requireViewById(R.id.jaq);
            o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.save_loading_icon)");
            this.LJLJJI = requireViewById3;
            boolean LJJIFFI = C60903NvH.LJIIJJI().getPublishService().LJJIFFI();
            View requireViewById4 = requireViewById(R.id.jak);
            o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.save_arrow_icon)");
            this.LJLJJL = requireViewById4;
            if (LJJIFFI) {
                LinearLayout linearLayout2 = this.LJLZ;
                if (linearLayout2 != null) {
                    linearLayout2.setAlpha(0.5f);
                } else {
                    o.LJIJI("saveBtn");
                    throw null;
                }
            } else {
                C60903NvH.LJIIJJI().getPublishService().LJJIJIL(this, new AqS184S0100000_2(this, 34));
            }
            IDlS62S0100000_2 iDlS62S0100000_2 = new IDlS62S0100000_2(this, 24, 42);
            LinearLayout linearLayout3 = this.LJLZ;
            if (linearLayout3 != null) {
                C16880lQ.LJIIZILJ(linearLayout3, iDlS62S0100000_2);
            } else {
                o.LJIJI("saveBtn");
                throw null;
            }
        }
        AbstractViewOnClickListenerC55470Lpq abstractViewOnClickListenerC55470Lpq = new AbstractViewOnClickListenerC55470Lpq() { // from class: X.6Mz
            public boolean LJLJJI;

            {
                super(600L);
            }

            @Override // X.AbstractViewOnClickListenerC55470Lpq
            public final void LIZ(View view2) {
                if (C6KD.LIZIZ(C159286My.this.getEditModel()) != null) {
                    return;
                }
                C159286My c159286My = C159286My.this;
                if (!c159286My.LLFII) {
                    Activity requireActivity = c159286My.requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.p69);
                    C78915Uy7.LJJIIZI(requireActivity, 2037, creativeToastBuilder);
                    return;
                }
                if (C44384HbQ.LJJIJIL(c159286My.getEditModel())) {
                    C159286My c159286My2 = C159286My.this;
                    InterfaceC143385jy interfaceC143385jy = (InterfaceC143385jy) c159286My2.LLIFFJFJJ.LIZ(c159286My2, C159286My.LLIIIJ[6]);
                    if (interfaceC143385jy != null && C143475k7.LIZ(interfaceC143385jy, "click_edit_page_next", !C159286My.this.getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), new AqS152S0100000_2(C159286My.this, 408), 8)) {
                        return;
                    }
                }
                C159286My.this.LLJILJILJ();
                if (!this.LJLJJI) {
                    C159286My.this.getEditPreviewApi().lN();
                    this.LJLJJI = true;
                }
                C159286My c159286My3 = C159286My.this;
                C82631Wbr c82631Wbr = c159286My3.LLD;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C159286My.LLIIIJ;
                InterfaceC145815nt interfaceC145815nt = (InterfaceC145815nt) c82631Wbr.LIZ(c159286My3, interfaceC74236TBoArr[0]);
                if (interfaceC145815nt != null) {
                    interfaceC145815nt.ap("enter Story publish!");
                }
                C159286My c159286My4 = C159286My.this;
                InterfaceC147455qX interfaceC147455qX = (InterfaceC147455qX) c159286My4.LLFF.LIZ(c159286My4, interfaceC74236TBoArr[3]);
                if (interfaceC147455qX != null) {
                    interfaceC147455qX.hu0();
                }
                C159286My.this.getEditModel().creativeModel.quickPostOnEditPageModel.LIZ = true;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C159286My.this.LJLIL.LJFF;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                } else {
                    o.LJIJI("publish");
                    throw null;
                }
            }
        };
        View requireViewById5 = requireViewById(R.id.il1);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.quick_publish)");
        this.LJLJI = requireViewById5;
        if (getEditModel().creativeModel.searchCreateModel.isFromSearch()) {
            View view2 = this.LJLJI;
            if (view2 != null) {
                view2.setVisibility(8);
            } else {
                o.LJIJI("quickPublish");
                throw null;
            }
        }
        View view3 = this.LJLJI;
        if (view3 != null) {
            C16880lQ.LJIIJ(abstractViewOnClickListenerC55470Lpq, view3);
            View requireViewById6 = requireViewById(R.id.h12);
            o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.next_step)");
            this.LJLJL = requireViewById6;
            View requireViewById7 = requireViewById(R.id.h14);
            o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.next_step_text)");
            this.LJLJLJ = (TuxTextView) requireViewById7;
            View view4 = this.LJLJL;
            if (view4 != null) {
                C16880lQ.LJIIJ(new IDlS62S0100000_2(this, 21, 42), view4);
                View requireViewById8 = requireViewById(R.id.il0);
                o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.quick_post)");
                this.LJLL = requireViewById8;
                if (C6N3.LIZ() && H7R.LJJLIIIJJIZ(getEditModel())) {
                    View view5 = this.LJLL;
                    if (view5 != null) {
                        view5.setVisibility(0);
                        View view6 = this.LJLL;
                        if (view6 != null) {
                            C16880lQ.LJIIJ(new IDlS62S0100000_2(this, 22, 42), view6);
                        } else {
                            o.LJIJI("quickPost");
                            throw null;
                        }
                    } else {
                        o.LJIJI("quickPost");
                        throw null;
                    }
                }
                View requireViewById9 = requireViewById(R.id.mfr);
                o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.tv_quick_publish)");
                this.LJLLI = (TuxTextView) requireViewById9;
                View requireViewById10 = requireViewById(R.id.il2);
                o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.quick_publish_avatar)");
                this.LJLLILLLL = requireViewById10;
                View requireViewById11 = requireViewById(R.id.abp);
                o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.avatar_border)");
                this.LJLLL = (C1303559r) requireViewById11;
                View requireViewById12 = requireViewById(R.id.eye);
                o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.iv_avatar)");
                this.LJLLJ = (C72434Sbm) requireViewById12;
                View requireViewById13 = requireViewById(R.id.egq);
                o.LJIIIIZZ(requireViewById13, "requireViewById(R.id.image_arrow_up)");
                this.LJLLLL = requireViewById13;
                View requireViewById14 = requireViewById(R.id.hyh);
                o.LJIIIIZZ(requireViewById14, "requireViewById(R.id.post_arrow_up)");
                this.LJLLLLLL = (TuxIconView) requireViewById14;
                View view7 = this.LJLLILLLL;
                if (view7 != null) {
                    view7.setVisibility(0);
                    View view8 = this.LJLLLL;
                    if (view8 != null) {
                        view8.setVisibility(8);
                        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
                        if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
                            C72434Sbm c72434Sbm = this.LJLLJ;
                            if (c72434Sbm != null) {
                                C78764Uvg.LJI(c72434Sbm, avatarThumb, -1, -1);
                            } else {
                                o.LJIJI("avatarImageView");
                                throw null;
                            }
                        }
                        TuxTextView tuxTextView = this.LJLLI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(LLJJI());
                            if (C44384HbQ.LJJIJIL(getEditModel()) && !getEditModel().creativeModel.searchCreateModel.isFromSearch()) {
                                View view9 = this.LJLLILLLL;
                                if (view9 != null) {
                                    view9.setVisibility(8);
                                    View view10 = this.LJLLLL;
                                    if (view10 != null) {
                                        view10.setVisibility(8);
                                        TuxIconView tuxIconView = this.LJLLLLLL;
                                        if (tuxIconView != null) {
                                            tuxIconView.setVisibility(0);
                                            TuxTextView tuxTextView2 = this.LJLLI;
                                            if (tuxTextView2 != null) {
                                                tuxTextView2.setTextColorRes(R.attr.dj);
                                                TuxTextView tuxTextView3 = this.LJLJLJ;
                                                if (tuxTextView3 != null) {
                                                    tuxTextView3.setTextColorRes(R.attr.go);
                                                } else {
                                                    o.LJIJI("nextStepText");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("tvQuickPublish");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("postArrowImageView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("arrowUpImageView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("quickPublishAvatar");
                                    throw null;
                                }
                            }
                            if (C58B.LIZ()) {
                                if (C44384HbQ.LJJIJIL(getEditModel()) && !getEditModel().creativeModel.searchCreateModel.isFromSearch()) {
                                    View view11 = this.LJLJI;
                                    if (view11 != null) {
                                        view11.setBackgroundResource(R.drawable.s2);
                                        View view12 = this.LJLJL;
                                        if (view12 != null) {
                                            view12.setBackgroundResource(R.drawable.s7);
                                        } else {
                                            o.LJIJI("nextStep");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("quickPublish");
                                        throw null;
                                    }
                                } else {
                                    View view13 = this.LJLJI;
                                    if (view13 != null) {
                                        view13.setBackgroundResource(R.drawable.s7);
                                        View view14 = this.LJLJL;
                                        if (view14 != null) {
                                            view14.setBackgroundResource(R.drawable.s2);
                                        } else {
                                            o.LJIJI("nextStep");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("quickPublish");
                                        throw null;
                                    }
                                }
                            }
                            View requireViewById15 = requireViewById(R.id.fh6);
                            o.LJIIIIZZ(requireViewById15, "requireViewById(R.id.layout_bottom_tool)");
                            this.LJZI = (LinearLayout) requireViewById15;
                            View requireViewById16 = requireViewById(R.id.h13);
                            o.LJIIIIZZ(requireViewById16, "requireViewById(R.id.next_step_icon)");
                            this.LJLJLLL = (TuxIconView) requireViewById16;
                            View requireViewById17 = requireViewById(R.id.cqf);
                            o.LJIIIIZZ(requireViewById17, "requireViewById(R.id.editor_pro)");
                            TuxTextView tuxTextView4 = (TuxTextView) requireViewById17;
                            this.LJZL = tuxTextView4;
                            C16880lQ.LJJJJI(tuxTextView4, new IDlS62S0100000_2(this, 23, 42));
                            if (LLJJIII()) {
                                View view15 = this.LJLJL;
                                if (view15 != null) {
                                    view15.setVisibility(8);
                                } else {
                                    o.LJIJI("nextStep");
                                    throw null;
                                }
                            }
                            C0IB<Boolean> c0ib = this.LJLIL.LIZJ;
                            if (c0ib != null) {
                                c0ib.LIZIZ(this, new AObjectS84S0100000_2(this, 112));
                                C0IB<Boolean> c0ib2 = this.LJLIL.LIZ;
                                if (c0ib2 != null) {
                                    c0ib2.LIZIZ(this, new AObjectS84S0100000_2(this, 113));
                                    C0IB<Boolean> c0ib3 = this.LJLIL.LIZIZ;
                                    if (c0ib3 != null) {
                                        c0ib3.LIZIZ(this, new AObjectS84S0100000_2(this, 114));
                                        C0IB<Boolean> c0ib4 = this.LJLIL.LJIIIIZZ;
                                        if (c0ib4 != null) {
                                            c0ib4.LIZIZ(this, new AObjectS84S0100000_2(this, 115));
                                            C0IB<C60M> c0ib5 = this.LJLIL.LIZLLL;
                                            if (c0ib5 != null) {
                                                c0ib5.LIZIZ(this, new AObjectS116S0200000_2(this, view, 0));
                                                C0IB<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> c0ib6 = this.LJLIL.LJ;
                                                if (c0ib6 != null) {
                                                    c0ib6.LIZIZ(this, new AObjectS116S0200000_2(this, view, 1));
                                                    LLJJIJI();
                                                    return;
                                                } else {
                                                    o.LJIJI("showOrHideWithAnim");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("showEditorProTips");
                                            throw null;
                                        }
                                        o.LJIJI("nextEnable");
                                        throw null;
                                    }
                                    o.LJIJI("quickPublishEnable");
                                    throw null;
                                }
                                o.LJIJI("quickPublishVisible");
                                throw null;
                            }
                            o.LJIJI("nextVisible");
                            throw null;
                        }
                        o.LJIJI("tvQuickPublish");
                        throw null;
                    }
                    o.LJIJI("arrowUpImageView");
                    throw null;
                }
                o.LJIJI("quickPublishAvatar");
                throw null;
            }
            o.LJIJI("nextStep");
            throw null;
        }
        o.LJIJI("quickPublish");
        throw null;
    }

    public static int LLJJ(float f, String str, int i) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        return Math.max(C7MY.LIZIZ(88), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)) + ((int) paint.measureText(str, 0, str.length())) + i);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (C165126dw.LIZ() && this.mActivity != null) {
            setTheme(0);
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("editor");
            LIZ.append(R.layout.ccp);
            View LIZJ = V0Z.LIZJ(requireSceneContext, R.layout.ccp, container, X1D.LIZIZ(LIZ), inflater);
            if (LIZJ != null) {
                return LIZJ;
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ccp, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ttom_1, container, false)");
        return LLLLIILL;
    }
}
