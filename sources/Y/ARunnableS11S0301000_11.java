package Y;

import X.AbstractC67354Qc2;
import X.C139825eE;
import X.C16880lQ;
import X.C26045AKb;
import X.C32420Cnw;
import X.C32425Co1;
import X.C65817PsL;
import X.C66504Q8e;
import X.C67380QcS;
import X.C7WD;
import X.C80674VlO;
import X.EnumC84152X0y;
import X.F9J;
import X.FT7;
import X.InterfaceC54346LUo;
import X.InterfaceC64518PTu;
import X.InterfaceC67397Qcj;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.LDC;
import X.PSE;
import X.PU0;
import X.PU2;
import X.R41;
import X.WHL;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilterImpl;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS11S0301000_11 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS11S0301000_11 aRunnableS11S0301000_11) {
        switch (aRunnableS11S0301000_11.i3) {
            case 0:
                String applicationId = (String) aRunnableS11S0301000_11.l1;
                Context context = (Context) aRunnableS11S0301000_11.l0;
                String gateKeepersKey = (String) aRunnableS11S0301000_11.l2;
                o.LJIIIZ(applicationId, "$applicationId");
                o.LJIIIZ(context, "$context");
                o.LJIIIZ(gateKeepersKey, "$gateKeepersKey");
                C65817PsL.LIZ.getClass();
                JSONObject LIZ = C65817PsL.LIZ();
                if (LIZ.length() != 0) {
                    C65817PsL.LIZJ(applicationId, LIZ);
                    F9J.LIZIZ(context, 0, "com.facebook.internal.preferences.APP_GATEKEEPERS").edit().putString(gateKeepersKey, LIZ.toString()).apply();
                    C65817PsL.LJ = Long.valueOf(System.currentTimeMillis());
                }
                C65817PsL.LIZLLL();
                C65817PsL.LIZIZ.set(false);
                return;
            default:
                BmfVQScoreFilterImpl.LIZJ((BmfVQScoreFilterImpl) aRunnableS11S0301000_11.l1, (JSONObject) aRunnableS11S0301000_11.l2, (Context) aRunnableS11S0301000_11.l0);
                return;
        }
    }

    public static final void run$1(ARunnableS11S0301000_11 aRunnableS11S0301000_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS11S0301000_11.l2).switchCamera((TECameraCapture) aRunnableS11S0301000_11.l0, aRunnableS11S0301000_11.i3, (Cert) aRunnableS11S0301000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0301000_11 aRunnableS11S0301000_11) {
        switch (aRunnableS11S0301000_11.i3) {
            case 0:
                final BaseNewMusicTabFragment baseNewMusicTabFragment = (BaseNewMusicTabFragment) aRunnableS11S0301000_11.l0;
                C80674VlO c80674VlO = (C80674VlO) aRunnableS11S0301000_11.l1;
                final MusicModel musicModel = (MusicModel) ((Serializable) aRunnableS11S0301000_11.l2);
                if (baseNewMusicTabFragment.mo49getActivity() != null && !baseNewMusicTabFragment.mo49getActivity().isFinishing()) {
                    InterfaceC82683Wch interfaceC82683Wch = baseNewMusicTabFragment.LJLIL;
                    if (interfaceC82683Wch == null || !interfaceC82683Wch.isShowing()) {
                        C139825eE c139825eE = new C139825eE(baseNewMusicTabFragment.mo49getActivity());
                        c139825eE.LIZIZ(c80674VlO.LJIIIIZZ);
                        c139825eE.LJI(WHL.TOP);
                        c139825eE.LIZLLL = new InterfaceC88472Yns() { // from class: X.9oX
                            @Override // X.InterfaceC88472Yns
                            public final Object invoke(Object obj) {
                                String str;
                                BaseNewMusicTabFragment baseNewMusicTabFragment2 = BaseNewMusicTabFragment.this;
                                MusicModel musicModel2 = musicModel;
                                ImageView imageView = (ImageView) obj;
                                baseNewMusicTabFragment2.getClass();
                                if (!TextUtils.isEmpty(musicModel2.getPicPremium())) {
                                    str = musicModel2.getPicPremium();
                                } else if (!TextUtils.isEmpty(musicModel2.getPicBig())) {
                                    str = musicModel2.getPicBig();
                                } else {
                                    str = "";
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    ColorDrawable colorDrawable = new ColorDrawable(C79045V0n.LJI(R.attr.cj, baseNewMusicTabFragment2.getContext()).intValue());
                                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                                    LJIIIIZZ.LJJIIJZLJL = imageView;
                                    LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
                                    LJIIIIZZ.LJIILLIIL = colorDrawable;
                                    LJIIIIZZ.LJIILIIL = colorDrawable;
                                    C16880lQ.LLJJJ(LJIIIIZZ);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                                    marginLayoutParams.rightMargin = C17N.LJIILL(8.0d);
                                    imageView.setLayoutParams(marginLayoutParams);
                                    return null;
                                }
                                return null;
                            }
                        };
                        c139825eE.LJIIJJI(R.string.bgf);
                        c139825eE.LIZ.LJII = 2000L;
                        InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
                        baseNewMusicTabFragment.LJLIL = LIZJ;
                        LIZJ.show();
                        return;
                    }
                    return;
                }
                return;
            default:
                PU0 pu0 = (PU0) aRunnableS11S0301000_11.l0;
                C32420Cnw c32420Cnw = (C32420Cnw) aRunnableS11S0301000_11.l1;
                C32425Co1 c32425Co1 = (C32425Co1) ((Serializable) aRunnableS11S0301000_11.l2);
                C7WD c7wd = (C7WD) ((HashMap) pu0.LIZ).get(c32420Cnw.LIZ);
                if (c7wd != null) {
                    if (c32420Cnw.LJII < Math.max(c32420Cnw.LIZJ.length, pu0.LIZIZ.LIZJ) - 1) {
                        pu0.LJFF.postDelayed(new ARunnableS16S0201000_13(4, pu0, c32420Cnw, 1), pu0.LIZIZ.LIZLLL * 1000);
                        return;
                    }
                }
                ((ConcurrentHashMap) pu0.LJ).put(c32420Cnw.LIZ, new Pair(Boolean.FALSE, Long.valueOf(System.currentTimeMillis())));
                if (c7wd != null) {
                    Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
                    while (it.hasNext()) {
                        ((PU2) it.next()).LIZIZ(c32425Co1);
                    }
                }
                ((HashMap) pu0.LIZ).remove(c32420Cnw.LIZ);
                Iterator it2 = ((CopyOnWriteArrayList) pu0.LIZJ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC64518PTu) it2.next()).LIZIZ(c32425Co1);
                }
                pu0.LJI--;
                pu0.LJII++;
                pu0.LJIIIIZZ();
                return;
        }
    }

    public static final void run$3(ARunnableS11S0301000_11 aRunnableS11S0301000_11) {
        boolean z;
        boolean z2;
        C66504Q8e c66504Q8e;
        C66504Q8e c66504Q8e2;
        switch (aRunnableS11S0301000_11.i3) {
            case 0:
                AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS11S0301000_11.l0;
                AuthResult authResult = (AuthResult) aRunnableS11S0301000_11.l1;
                Intent intent = (Intent) aRunnableS11S0301000_11.l2;
                if (authorizeActivity.LJLJL) {
                    if ("kakaotalk".equals(authorizeActivity.LJLJJLL) && (c66504Q8e2 = authResult.mErrorCause) != null && c66504Q8e2.getErrorCode() == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Boolean.valueOf(z).booleanValue()) {
                        C26045AKb c26045AKb = new C26045AKb(authorizeActivity);
                        c26045AKb.LIZ(true);
                        c26045AKb.LJIIIIZZ(R.string.hky);
                        c26045AKb.LJIIJ();
                    } else {
                        if (TextUtils.equals("google_onetap", authResult.mProviderId) && (c66504Q8e = authResult.mErrorCause) != null && (c66504Q8e.getErrorCode() == 10 || authResult.mErrorCause.getErrorCode() == 4)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!Boolean.valueOf(z2).booleanValue()) {
                            C26045AKb c26045AKb2 = new C26045AKb(authorizeActivity);
                            c26045AKb2.LIZ(true);
                            c26045AKb2.LJIIIIZZ(R.string.hx6);
                            c26045AKb2.LJIIJ();
                        }
                    }
                    R41.LJIIIZ();
                }
                authorizeActivity.LLIIIJ(0, intent);
                return;
            default:
                SimDtReportService.m175reportVideoPlayFirstFinish$lambda7((SimDtReportService) aRunnableS11S0301000_11.l0, (String) aRunnableS11S0301000_11.l1, (Callable) aRunnableS11S0301000_11.l2);
                return;
        }
    }

    public static final void run$4(ARunnableS11S0301000_11 aRunnableS11S0301000_11) {
        final C67380QcS c67380QcS = (C67380QcS) aRunnableS11S0301000_11.l0;
        final AbstractC67354Qc2 abstractC67354Qc2 = (AbstractC67354Qc2) aRunnableS11S0301000_11.l1;
        final int i = aRunnableS11S0301000_11.i3;
        Runnable runnable = (Runnable) aRunnableS11S0301000_11.l2;
        c67380QcS.getClass();
        try {
            try {
                PSE pse = c67380QcS.LJFF;
                InterfaceC67397Qcj interfaceC67397Qcj = c67380QcS.LIZJ;
                Objects.requireNonNull(interfaceC67397Qcj);
                pse.LIZLLL(new LDC(interfaceC67397Qcj));
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(c67380QcS.LIZ, "connectivity"));
                if (LJJLI != null && LJJLI.isConnected()) {
                    c67380QcS.LIZ(abstractC67354Qc2, i);
                } else {
                    c67380QcS.LJFF.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qcs
                        @Override // X.InterfaceC54346LUo
                        public final Object execute() {
                            C67380QcS c67380QcS2 = C67380QcS.this;
                            c67380QcS2.LIZLLL.LIZ(abstractC67354Qc2, i + 1);
                            return null;
                        }
                    });
                }
            } catch (FT7 unused) {
                c67380QcS.LIZLLL.LIZ(abstractC67354Qc2, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public ARunnableS11S0301000_11(Context context, String str, String str2, int i) {
        this.$t = i;
        this.i3 = 0;
        this.l1 = str;
        this.l0 = context;
        this.l2 = str2;
    }

    public ARunnableS11S0301000_11(BmfVQScoreFilterImpl bmfVQScoreFilterImpl, JSONObject jSONObject, Context context, int i) {
        this.$t = i;
        this.i3 = 1;
        this.l1 = bmfVQScoreFilterImpl;
        this.l2 = jSONObject;
        this.l0 = context;
    }

    public ARunnableS11S0301000_11(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
