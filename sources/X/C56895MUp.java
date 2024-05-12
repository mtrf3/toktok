package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;

/* renamed from: X.MUp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56895MUp<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ InterfaceC73573Su9<TutorialVideoResp> LIZ;
    public final /* synthetic */ TutorialVideoViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Keva LIZLLL;
    public final /* synthetic */ String LJ;

    public C56895MUp(C73433Srt c73433Srt, TutorialVideoViewModel tutorialVideoViewModel, String str, Keva keva, String str2) {
        this.LIZ = c73433Srt;
        this.LIZIZ = tutorialVideoViewModel;
        this.LIZJ = str;
        this.LIZLLL = keva;
        this.LJ = str2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        String gv0;
        String gv02;
        String gv03;
        String str;
        String str2;
        String str3;
        TutorialVideoResp tutorialVideoResp;
        TutorialVideoInfo info;
        if (c10k.LJIILIIL()) {
            TutorialVideoResp tutorialVideoResp2 = (TutorialVideoResp) c10k.LJIIJJI();
            if (tutorialVideoResp2 != null && (info = tutorialVideoResp2.getInfo()) != null) {
                String str4 = this.LIZJ;
                Keva keva = this.LIZLLL;
                String str5 = this.LJ;
                InterfaceC56896MUq interfaceC56896MUq = (InterfaceC56896MUq) C54366LVi.LIZ(InterfaceC56896MUq.class);
                if (!TextUtils.isEmpty(info.getMsgId())) {
                    if (interfaceC56896MUq != null) {
                        interfaceC56896MUq.LJII(info.getMsgId());
                    }
                    if (!TextUtils.equals(str4, info.getMsgId())) {
                        keva.storeString(i0.LJFF("msg_id_", str5), info.getMsgId());
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("first_show_time_");
                        LIZ.append(str5);
                        keva.storeLong(X1D.LIZIZ(LIZ), System.currentTimeMillis());
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("clicked_");
                        LIZ2.append(str5);
                        keva.storeInt(X1D.LIZIZ(LIZ2), 0);
                    }
                    keva.storeLong(i0.LJFF("current_show_time_", str5), System.currentTimeMillis());
                }
                if (interfaceC56896MUq != null) {
                    interfaceC56896MUq.LIZJ(info.getIcon());
                    interfaceC56896MUq.LJFF(info.getTitle());
                    interfaceC56896MUq.LJIIJ(info.getDesc());
                    interfaceC56896MUq.LJIIIIZZ(info.getButton());
                    interfaceC56896MUq.LJI(info.getDeepLink());
                }
            }
            InterfaceC73573Su9<TutorialVideoResp> interfaceC73573Su9 = this.LIZ;
            if (interfaceC73573Su9 != null) {
                TutorialVideoViewModel tutorialVideoViewModel = this.LIZIZ;
                tutorialVideoViewModel.getClass();
                try {
                    InterfaceC56896MUq interfaceC56896MUq2 = (InterfaceC56896MUq) C54366LVi.LIZ(InterfaceC56896MUq.class);
                    str = interfaceC56896MUq2.LIZLLL();
                    str2 = interfaceC56896MUq2.LJ();
                    gv0 = interfaceC56896MUq2.LIZ(tutorialVideoViewModel.gv0(R.string.inc));
                    if (TextUtils.isEmpty(gv0)) {
                        gv0 = tutorialVideoViewModel.gv0(R.string.inc);
                    }
                    gv02 = interfaceC56896MUq2.LJIIIZ(tutorialVideoViewModel.gv0(R.string.ind));
                    if (TextUtils.isEmpty(gv02)) {
                        gv02 = tutorialVideoViewModel.gv0(R.string.ind);
                    }
                    gv03 = interfaceC56896MUq2.LIZIZ(tutorialVideoViewModel.gv0(R.string.ine));
                    if (TextUtils.isEmpty(gv03)) {
                        gv03 = tutorialVideoViewModel.gv0(R.string.ine);
                    }
                    str3 = interfaceC56896MUq2.LJIIJJI();
                } catch (Exception unused) {
                    gv0 = tutorialVideoViewModel.gv0(R.string.inc);
                    gv02 = tutorialVideoViewModel.gv0(R.string.inc);
                    gv03 = tutorialVideoViewModel.gv0(R.string.inc);
                    str = "";
                    str2 = "";
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                    tutorialVideoResp = new TutorialVideoResp(new TutorialVideoInfo(str, str2, gv0, gv02, gv03, str3));
                } else {
                    tutorialVideoResp = new TutorialVideoResp(null);
                }
                C38891fp.LJJIJ(interfaceC73573Su9, tutorialVideoResp);
            }
        } else {
            InterfaceC73573Su9<TutorialVideoResp> interfaceC73573Su92 = this.LIZ;
            if (interfaceC73573Su92 != null) {
                Exception LJIIJ = c10k.LJIIJ();
                if (LJIIJ == null) {
                    LJIIJ = new IllegalStateException("Unknown exception");
                }
                C38891fp.LJJIIZI(interfaceC73573Su92, LJIIJ);
            }
        }
        return null;
    }
}
