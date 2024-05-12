package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Application;
import android.os.Handler;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.IDqS438S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WYd */
/* loaded from: classes15.dex */
public final class C82467WYd extends AbstractC82428WWq<InterfaceC82199WNv, WZJ, WZN, WZC> implements InterfaceC82199WNv {
    public static final WZ4 LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJL;
    public WMH LLIIIILZ;
    public final C82622Wbi LLIIIJ;
    public WZJ LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final InterfaceC65784Pro<WZJ> LLIIJI;
    public final InterfaceC65784Pro<WZN> LLIIJLIL;
    public final InterfaceC65784Pro<WZC> LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public AbstractC77373UYf LLIL;
    public AbstractC77373UYf LLILII;
    public String LLILIL;
    public C82497WZh LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C168316j5 LLILZIL;
    public final List<C82492WZc> LLILZLL;
    public C82492WZc LLIZ;
    public final List<AbstractC77373UYf> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final InterfaceC115514g7 LLJILJIL;
    public boolean LLJILJILJ;
    public final Runnable LLJILLL;
    public int LLJJ;
    public final Runnable LLJJI;
    public XU2 LLJJIII;
    public final C81648W2q LLJJIJI;
    public volatile boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public long LLJJJIL;
    public final C5H3 LLJJJJ;
    public final C5H3 LLJJJJJIL;
    public final C5H3 LLJJJJLIIL;
    public boolean LLJJL;

    static {
        TBT tbt = new TBT(C82467WYd.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLJL = new InterfaceC74236TBo[]{tbt, new TBT(C82467WYd.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0)};
        LLJJLIIIJLLLLLLLZ = new WZ4();
    }

    public final void LLLLLJIL() {
        this.LLILZ = false;
        LLJLIL();
        if (C52461KiP.LIZLLL()) {
            this.LLILL.LJ();
            this.LLJIJIL = false;
            LLJI(C82476WYm.LJLIL);
        }
        LLLZLL(C77374UYg.LIZ);
        LLLZLZ("STATE_PREVIEW_EMPTY");
        LLZ(-1);
        LLZZJLIL();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        FMX.LJIIL("cancel_sound_filter", C82468WYe.LJIIIZ(shortVideoContext).LIZ);
    }

    @Override // X.InterfaceC82199WNv
    public void Oo0() {
        this.LLJJL = true;
        onPause();
    }

    @Override // X.InterfaceC82199WNv
    public void zE() {
        this.LLJJL = false;
        onResume();
    }

    private final C29901Fi<WJ0> LLIIIL() {
        return (C29901Fi) this.LLJJJJ.getValue();
    }

    private final boolean LLJJL() {
        return this.LLILZIL.L();
    }

    private final void LLLIIIL() {
        for (C82492WZc c82492WZc : this.LLILZLL) {
            c82492WZc.LIZ();
            if (!c82492WZc.LJLJJLL && c82492WZc.LJLJJL > 0) {
                C82468WYe.LJ(getShortVideoContext(), c82492WZc.LJLLLL, System.currentTimeMillis() - c82492WZc.LJLJJL, false);
            }
        }
        this.LLILZLL.clear();
    }

    private final XU2 LLLJ() {
        XU2 xu2 = this.LLJJIII;
        if (xu2 == null) {
            XU2 xu22 = new XU2("record_page_svc_stream");
            this.LLJJIII = xu22;
            return xu22;
        }
        return xu2;
    }

    private final C29901Fi<Boolean> LLLJIL() {
        return (C29901Fi) this.LLJJJJLIIL.getValue();
    }

    private final void LLLLZI() {
        LLJI(new AqS180S0100000_14(this, 257));
        this.LLJIJIL = false;
        this.LLILL.LIZIZ();
        this.LLILL.LJ();
        C82468WYe.LJII(getShortVideoContext(), KK());
        this.LLILL.LIZLLL();
        C82497WZh c82497WZh = this.LLILL;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 258);
        c82497WZh.getClass();
        c82497WZh.LJZL = aqS180S0100000_14;
    }

    private final void LLLLZLLIL() {
        if (!this.LLJ) {
            this.LLJ = true;
            this.LLJI = false;
            LLJI(C82473WYj.LJLIL);
            LLLLLLIL(false);
        }
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLIIIZ.LIZ(this, LLJL[0]);
    }

    @Override // X.InterfaceC82199WNv
    public Effect KK() {
        return C86793Y4n.LJIJJ(this.LLIL);
    }

    @Override // X.AbstractC82428WWq
    public boolean LLIZ() {
        if (this.LLJI) {
            LLLLZLLIL();
            return true;
        }
        return super.LLIZ();
    }

    public final void LLJLIL() {
        LLJZIJLIL(this.LLILZLL);
        LLLIIIL();
        Handler handler = C171196nj.LIZ;
        handler.removeCallbacks(this.LLJILLL);
        handler.removeCallbacks(this.LLJJI);
        LLJLLIL();
        if ((this.LLIL instanceof C77372UYe) && C52461KiP.LIZIZ()) {
            LLLZLZ("STATE_PREVIEW_SPEAK");
        }
        if (C52461KiP.LIZJ()) {
            XU2 xu2 = this.LLJJIII;
            if (xu2 != null) {
                xu2.release();
            }
            this.LLJJIII = null;
            if (this.LLJJIJIIJIL) {
                C82468WYe.LJ(getShortVideoContext(), KK(), System.currentTimeMillis() - this.LLJJJIL, false);
            }
            this.LLJJIJIIJIL = false;
            this.LLJJJ = false;
            this.LLJJIJIL = false;
            this.LLJJJIL = -1L;
        }
    }

    public final void LLJLLIL() {
        this.LLILZIL = new C168316j5(null, null, null, null, null, null, 511);
    }

    public final InterfaceC45891Hzj LLLILZLLLI() {
        return (InterfaceC45891Hzj) this.LLJILJIL.LIZ(this, LLJL[1]);
    }

    public final C29901Fi<Boolean> LLLJL() {
        return (C29901Fi) this.LLJJJJJIL.getValue();
    }

    public final void LLLLJ() {
        if (!this.LLILLJJLI) {
            return;
        }
        LLLLZLLIL();
    }

    public final void LLLLJI() {
        LLLFFI(new AqS164S0100000_14(this, 254));
    }

    public final void LLLLLIL() {
        LLLFFI(new AqS164S0100000_14(this, 255));
    }

    public final void LLLZ() {
        if (!this.LLJI) {
            this.LLJI = true;
            this.LLJ = false;
            LLJI(C82474WYk.LJLIL);
            LLLLLLIL(true);
        }
    }

    @Override // X.AbstractC82428WWq
    public void initData() {
        C81648W2q c81648W2q = this.LLJJIJI;
        if (!((ArrayList) c81648W2q.LIZIZ).isEmpty()) {
            c81648W2q.LIZJ.LJ(c81648W2q.LIZIZ);
        } else {
            ((C82589WbB) c81648W2q.LIZ.getValue()).LIZ(new IDqS438S0100000_14(c81648W2q, 3));
        }
        c81648W2q.LIZJ.LIZIZ(this, new AObjectS89S0100000_14(this, 397));
    }

    @Override // X.InterfaceC82199WNv
    public String lF() {
        if (!this.LLILLL) {
            return "";
        }
        AbstractC77373UYf abstractC77373UYf = this.LLIL;
        if (!(abstractC77373UYf instanceof C77372UYe)) {
            return "";
        }
        o.LJIIIZ(abstractC77373UYf, "<this>");
        return C86793Y4n.LJIJJ(abstractC77373UYf).getEffect_id();
    }

    private final void LLLZZ() {
        StreamVoiceConversionModel streamVoiceConversionModel = getShortVideoContext().creativeModel.streamVoiceConversionModel;
        String lF = lF();
        streamVoiceConversionModel.getClass();
        o.LJIIIZ(lF, "<set-?>");
        streamVoiceConversionModel.vcShootingEffectId = lF;
        StreamVoiceConversionModel streamVoiceConversionModel2 = getShortVideoContext().creativeModel.streamVoiceConversionModel;
        String LJIJI = OUP.LJIJI(KK());
        streamVoiceConversionModel2.getClass();
        streamVoiceConversionModel2.vcShootingEffectIdFrom = LJIJI;
    }

    private final void LLZZJLIL() {
        LLIIIL().LJII(new WJ0(1));
        getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        LLLZZ();
    }

    @Override // X.AbstractC82428WWq
    public void LLILL() {
        C29901Fi<T4S> c29901Fi;
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS89S0100000_14(this, 398));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 399));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC82358WTy.class, new AqS180S0100000_14(this, 252));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC82358WTy.class);
            if (c0i6 != null) {
                ((InterfaceC82358WTy) c0i6).g2().LIZLLL(this, new AObjectS89S0100000_14(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
            }
        }
        C46193IAz c46193IAz = this.LLF;
        if (c46193IAz != null && (c29901Fi = c46193IAz.LLIFFJFJJ) != null) {
            c29901Fi.LIZLLL(this, new AObjectS89S0100000_14(this, 401));
        }
        String musicPath = getShortVideoContext().getMusicPath();
        if (musicPath != null && musicPath.length() > 0) {
            b00();
            this.LLILLL = false;
        }
        LJZI().getMusicAdded().LIZLLL(this, new AObjectS89S0100000_14(this, 402));
        LJZI().getMusicCleared().LIZLLL(this, new AObjectS89S0100000_14(this, 403));
        getRecordControlApi().s10().LIZLLL(this, new AObjectS89S0100000_14(this, 404));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 405));
        getRecordControlApi().t5().LIZIZ(this, new AObjectS119S0200000_14(this, new C34K(), 4));
    }

    public final void LLLLLZIL() {
        LLLLZLLIL();
        C82468WYe.LIZLLL(getShortVideoContext(), "fold", "click_blank");
    }

    public final void LLZZLLIL() {
        LLLZZ();
        if (!this.LLILLL || !getShortVideoContext().LJII().isEmpty() || getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return;
        }
        int i = getShortVideoContext().shootMode;
        if (i != 2 && i != 16) {
            if (this.LLIL instanceof C77372UYe) {
                LLIIIL().LJII(new WJ0(2));
                getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = true;
                return;
            } else {
                LLIIIL().LJII(new WJ0(1));
                getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
                return;
            }
        }
        this.LLILLL = false;
    }

    @Override // X.InterfaceC82199WNv
    public LiveEvent<Boolean> U3() {
        return LLLJIL();
    }

    @Override // X.InterfaceC82199WNv
    public void b00() {
        LLIIIL().LJII(new WJ0(4));
        getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        LLLZZ();
    }

    @Override // X.InterfaceC82199WNv
    public LiveEvent<WJ0> lD() {
        return LLIIIL();
    }

    @Override // X.AbstractC82428WWq, X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().ba0(this);
        CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C171196nj.LIZ(creativeInfo);
        ts0().LIZLLL(this, new AObjectS89S0100000_14(this, 406));
    }

    @Override // X.AbstractC82428WWq, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().ba0(null);
        this.LLILL.LJ();
        this.LLJIJIL = false;
        this.LLILL.LIZ();
        LLJLIL();
        C82609WbV.LIZJ.getValue().getClass();
        if (C82609WbV.LIZLLL == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            C82609WbV.LIZLLL = LIZ;
        }
        InterfaceC84498XEg interfaceC84498XEg = C82609WbV.LIZLLL;
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.destroy();
        }
        C82609WbV.LIZLLL = null;
    }

    @Override // X.AbstractC82428WWq, X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        this.LLILL.LJ();
        this.LLJIJIL = false;
        this.LLILL.LIZ();
        LLJLIL();
    }

    @Override // X.AbstractC82428WWq, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (!this.LLJJL && Po0() && C52461KiP.LIZLLL() && (this.LLIL instanceof C77372UYe)) {
            LLLLZI();
        }
        Boolean LIZ = getRecordControlApi().t5().LIZ();
        o.LJIIIIZZ(LIZ, "recordControlApi.hasRecordSegment.value");
        if (LIZ.booleanValue() || getShortVideoContext().cameraComponentModel.isRetakeMode) {
            LLZLLIL(this, false, 1, null);
        }
    }

    @Override // X.InterfaceC82199WNv
    public LiveEvent<Boolean> ts0() {
        return LLLJL();
    }

    @Override // X.InterfaceC82199WNv
    public void xt0() {
        if (!V16.LJJLIIIJJI(getShortVideoContext())) {
            return;
        }
        C26048AKe c26048AKe = new C26048AKe(C78688UuS.LJIJJ(this));
        c26048AKe.LJI(C78688UuS.LJIJJ(this).getResources().getString(R.string.a2j));
        c26048AKe.LIZIZ(3000L);
        c26048AKe.LJII();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WZN> LJJLIIIJJI() {
        return this.LLIIJLIL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WZC> LJJLIIIJJIZ() {
        return this.LLIIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<WZJ> LJLJJLL() {
        return this.LLIIJI;
    }

    @Override // X.InterfaceC82199WNv
    public boolean XP() {
        return this.LLILLL;
    }

    @Override // X.AbstractC82428WWq, X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLIIIJ;
    }

    private final void LLLFFI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            interfaceC65784Pro.invoke();
            C171196nj.LIZ.postDelayed(new ARunnableS50S0100000_14(this, 122), 500L);
        }
    }

    private final AbstractC77373UYf LLLFZ(String str) {
        C77374UYg c77374UYg = C77374UYg.LIZ;
        if (str != null) {
            List<AbstractC77373UYf> list = this.LLIZLLLIL;
            ArrayList arrayList = new ArrayList();
            for (AbstractC77373UYf abstractC77373UYf : list) {
                if (o.LJ(C86793Y4n.LJJIL(abstractC77373UYf), str)) {
                    arrayList.add(abstractC77373UYf);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                return (AbstractC77373UYf) it.next();
            }
        }
        return c77374UYg;
    }

    private final AbstractC77373UYf LLLI(String str) {
        int i = 0;
        for (AbstractC77373UYf abstractC77373UYf : this.LLIZLLLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC77373UYf abstractC77373UYf2 = abstractC77373UYf;
                o.LJIIIZ(abstractC77373UYf2, "<this>");
                if (o.LJ(C86793Y4n.LJIJJ(abstractC77373UYf2).getEffect_id(), str)) {
                    return abstractC77373UYf2;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }

    private final void LLLLLLIL(boolean z) {
        getCameraApiComponent().PY(new V8S(!z, false, false));
    }

    private final void LLLLZIL(boolean z) {
        if ((!Po0() && !z) || !this.LLILLL) {
            return;
        }
        List<String> list = ((C82589WbB) this.LLJJIJI.LIZ.getValue()).LIZ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        Effect LJIJJ = C86793Y4n.LJIJJ(this.LLIL);
        String str = "";
        o.LJIIIZ(LJIJJ, "<this>");
        try {
            String extra = LJIJJ.getExtra();
            if (extra != null) {
                String optString = new JSONObject(extra).optString("vc_anchor_audioprew", "");
                o.LJIIIIZZ(optString, "JSONObject(it).optString…vc_anchor_audioprew\", \"\")");
                str = optString;
            }
        } catch (JSONException unused) {
        }
        if ((!list.isEmpty()) && C78685UuP.LJJJZ(C86793Y4n.LJJIL(this.LLIL)) && C78685UuP.LJJJZ(str)) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (String str2 : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(str);
                arrayList.add(X1D.LIZIZ(LIZ));
            }
            C47325Ihl c47325Ihl = new C47325Ihl();
            c47325Ihl.LJFF = C86793Y4n.LJJIL(this.LLIL);
            c47325Ihl.LIZIZ = arrayList;
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setUrlKey(c47325Ihl.LJFF);
            videoUrlModel.setUrlList(c47325Ihl.LIZIZ);
            videoUrlModel.setSourceId(c47325Ihl.LJFF);
            simVideoUrlModel.origin = videoUrlModel;
            simVideoUrlModel.setSourceId(c47325Ihl.LJFF);
            simVideoUrlModel.setUrlKey(c47325Ihl.LJFF);
            simVideoUrlModel.setUrlList(c47325Ihl.LIZIZ);
            this.LLJJJ = C13870gZ.LIZ().isCache(simVideoUrlModel);
            XU2 LLLJ = LLLJ();
            if (!this.LLJJJ) {
                LLZ(0);
                LLZ(40);
            }
            this.LLJJJIL = System.currentTimeMillis();
            C82468WYe.LJI(getShortVideoContext(), KK());
            this.LLJJIJIIJIL = false;
            this.LLJJIJIL = true;
            LLLJ.LIZLLL(c47325Ihl);
            LLLJ.LIZIZ(new C82483WYt(this));
            LLLJ.LJFF(new C82469WYf(this));
            LLLJ.LIZJ(new C82470WYg(this));
        }
    }

    public final C82492WZc LLJZIJLIL(List<C82492WZc> list) {
        C82492WZc c82492WZc = new C82492WZc(getDiContainer());
        this.LLIZ = c82492WZc;
        list.add(c82492WZc);
        c82492WZc.LJLLLLLL.LJLLL = true;
        return c82492WZc;
    }

    public final void LLLZLL(AbstractC77373UYf abstractC77373UYf) {
        this.LLIL = abstractC77373UYf;
        LLJI(new AqS180S0100000_14(this, 253));
        LLZZLLIL();
    }

    public final void LLLZLZ(String str) {
        if (C52461KiP.LIZJ()) {
            return;
        }
        if (C52461KiP.LIZLLL()) {
            this.LLILL.LJ();
            this.LLJIJIL = false;
            C82495WZf c82495WZf = this.LLILL.LJLJI;
            C82488WYy block = C82488WYy.LJLIL;
            c82495WZf.getClass();
            o.LJIIIZ(block, "block");
            c82495WZf.LIZJ = block;
            if (o.LJ(str, "STATE_PREVIEW_SPEAK")) {
                this.LLILIL = "STATE_PREVIEW_NONE";
                if (Po0() && !this.LLFFF && !this.LLFII) {
                    this.LLILL.LIZIZ();
                    C82468WYe.LJII(getShortVideoContext(), KK());
                    this.LLILL.LIZLLL();
                    LLJI(new AqS180S0100000_14(this, 254));
                }
            } else if (o.LJ(str, "STATE_PREVIEW_PREVIEW")) {
                this.LLILIL = "STATE_PREVIEW_NONE";
                LLJI(new AqS180S0100000_14(this, 255));
            } else {
                o.LJ(str, "STATE_PREVIEW_PLAYING");
                LLJI(C82475WYl.LJLIL);
            }
        } else {
            this.LLILIL = str;
        }
        LLJI(new AqS180S0100000_14(this, 256));
        if (o.LJ(str, "STATE_PREVIEW_SPEAK")) {
            if (C52461KiP.LIZIZ() && this.LLIILII && this.LLJ) {
                this.LLIILII = false;
                LLJI(C82477WYn.LJLIL);
                return;
            }
            return;
        }
        if (!o.LJ(str, "STATE_PREVIEW_PREVIEW") || !C52461KiP.LIZIZ() || !this.LLIILZL || !this.LLJ) {
            return;
        }
        this.LLIILZL = false;
        LLJI(C82480WYq.LJLIL);
    }

    public final void LLZ(int i) {
        if (i == 0) {
            this.LLJJ = 0;
        }
        if (i > 0 && this.LLJJ == -1) {
            return;
        }
        this.LLJJ = i;
        if (i == -1) {
            LLJI(new AqS38S0001000_14(i, 11));
        } else {
            C171196nj.LIZ.postDelayed(new ARunnableS18S0101000_14(i, this, 10), 20L);
        }
    }

    public final void LLZLL(boolean z) {
        LLIIIL().LJII(new WJ0(5));
        if (!z) {
            getShortVideoContext().creativeModel.streamVoiceConversionModel.isSVCSelected = false;
        }
    }

    @Override // X.AbstractC82428WWq, X.InterfaceC82201WNx
    public void m5(String enterMethod) {
        String str;
        o.LJIIIZ(enterMethod, "enterMethod");
        super.m5(enterMethod);
        this.LLJ = false;
        this.LLJI = false;
        if (!o.LJ(enterMethod, "from_observer")) {
            this.LLIIZ = false;
        }
        LLJLIL();
        if (this.LLIL instanceof C77372UYe) {
            str = "STATE_PREVIEW_SPEAK";
        } else {
            str = "STATE_PREVIEW_EMPTY";
        }
        LLLZLZ(str);
        if (C52461KiP.LIZLLL()) {
            this.LLILL.LJ();
            this.LLJIJIL = false;
        }
    }

    @Override // X.InterfaceC82199WNv
    public void sf(String str) {
        AbstractC77373UYf LLLFZ = LLLFZ(str);
        String LJJIL = C86793Y4n.LJJIL(LLLFZ);
        LLLJL().LJI(Boolean.FALSE);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSelection,truly speakerId = ");
        LIZ.append(LJJIL);
        C221018lt.LIZ("SVCStickerHandler", X1D.LIZIZ(LIZ));
        LLLLLL(-1, LLLFZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82467WYd(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene, diContainer);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLIIIILZ = parentScene;
        this.LLIIIJ = diContainer;
        this.LLIIIZ = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLIIJI = new AqS164S0100000_14(this, 253);
        this.LLIIJLIL = C82484WYu.LJLIL;
        this.LLIIL = new AqS164S0100000_14(this, 252);
        this.LLIILII = true;
        this.LLIILZL = true;
        C77375UYh c77375UYh = C77375UYh.LIZ;
        this.LLIL = c77375UYh;
        this.LLILII = c77375UYh;
        this.LLILIL = "STATE_PREVIEW_EMPTY";
        this.LLILL = new C82497WZh(getDiContainer());
        this.LLILLL = true;
        this.LLILZIL = new C168316j5(null, null, null, null, null, null, 511);
        ArrayList arrayList = new ArrayList();
        this.LLILZLL = arrayList;
        this.LLIZ = LLJZIJLIL(arrayList);
        this.LLIZLLLIL = new ArrayList();
        this.LLJILJIL = UCI.LJII(getDiContainer(), InterfaceC45891Hzj.class, null);
        this.LLJILJILJ = true;
        this.LLJILLL = new ARunnableS50S0100000_14(this, 123);
        this.LLJJ = -1;
        this.LLJJI = new ARunnableS50S0100000_14(this, 121);
        this.LLJJIJI = new C81648W2q();
        this.LLJJJIL = -1L;
        this.LLJJJJ = C221108m2.LIZIZ(C82359WTz.LJLIL);
        this.LLJJJJJIL = C221108m2.LIZIZ(C82472WYi.LJLIL);
        this.LLJJJJLIIL = C221108m2.LIZIZ(C82471WYh.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLLL(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r6.length()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            X.UYf r0 = r5.LLLI(r6)
            if (r0 != 0) goto L10
            goto L8
        L10:
            int r0 = r6.length()
            if (r0 <= 0) goto L52
            X.UYf r2 = r5.LLLI(r6)
            if (r2 != 0) goto L26
            java.util.List<X.UYf> r0 = r5.LLIZLLLIL
            java.lang.Object r2 = X.ORZ.LJLLLLLL(r3, r0)
            X.UYf r2 = (X.AbstractC77373UYf) r2
        L24:
            if (r2 == 0) goto L8
        L26:
            r5.LLLZLL(r2)
            java.lang.String r0 = "STATE_PREVIEW_SPEAK"
            r5.LLLZLZ(r0)
            boolean r1 = X.C52461KiP.LIZJ()
            r0 = 0
            if (r1 == 0) goto L38
            LLLLZLL(r5, r3, r4, r0)
        L38:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r5.getShortVideoContext()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = X.C86793Y4n.LJIJJ(r2)
            X.IAz r1 = r5.LLF
            if (r1 == 0) goto L4c
            X.1Fi<X.T4S> r1 = r1.LLIFFJFJJ
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r1.LIZJ()
        L4c:
            boolean r0 = r0 instanceof X.T4Q
            X.C82468WYe.LJIIIIZZ(r3, r2, r4, r0)
            goto L8
        L52:
            java.util.List<X.UYf> r0 = r5.LLIZLLLIL
            java.lang.Object r2 = X.ORZ.LJLLLLLL(r3, r0)
            X.UYf r2 = (X.AbstractC77373UYf) r2
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82467WYd.LLLL(java.lang.String, java.lang.String):void");
    }

    public final void LLLLLJLJLL(int i, AbstractC77373UYf abstractC77373UYf) {
        this.LLILII = abstractC77373UYf;
        if (C52461KiP.LIZJ()) {
            AbstractC77373UYf abstractC77373UYf2 = this.LLIL;
            if ((abstractC77373UYf2 instanceof C77372UYe) && C86793Y4n.LJJIIZI(this.LLILII, abstractC77373UYf2) && !this.LLJJIJIIJIL) {
                LLLLZLL(this, false, 1, null);
            }
        }
        if (C52461KiP.LIZLLL() || C86793Y4n.LJJIIZ(this.LLILII, this.LLIL)) {
            return;
        }
        if (o.LJ(this.LLILIL, "STATE_PREVIEW_SPEAK")) {
            this.LLILZ = true;
            LLLZLZ("STATE_PREVIEW_PREVIEW");
            LLJLLIL();
            C82492WZc LLJZIJLIL = LLJZIJLIL(this.LLILZLL);
            C82468WYe.LJII(getShortVideoContext(), KK());
            Effect KK = KK();
            getShortVideoContext();
            LLJZIJLIL.LJII(KK, true);
            C171196nj.LIZ.postDelayed(this.LLJILLL, 5000L);
            LLJZIJLIL.LJLZ = new AqS145S0200000_14(this, LLJZIJLIL, 19);
            return;
        }
        if (!o.LJ(this.LLILIL, "STATE_PREVIEW_PREVIEW")) {
            return;
        }
        LLLZLZ("STATE_PREVIEW_PLAYING");
        C171196nj.LIZ.removeCallbacks(this.LLJILLL);
        this.LLIZ.LJ(getShortVideoContext());
        this.LLILZIL = this.LLIZ.LIZIZ();
    }

    public final void LLLLLL(int i, AbstractC77373UYf abstractC77373UYf) {
        boolean z;
        T4S t4s;
        C29901Fi<T4S> c29901Fi;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = z;
        Effect effect = KK();
        if (C78685UuP.LJJJZ(C86793Y4n.LJJIL(abstractC77373UYf))) {
            Effect LJIJJ = C86793Y4n.LJIJJ(abstractC77373UYf);
            if (this.LLILZ) {
                OUP.LJJJJLL(LJIJJ, "video_shoot_page");
            } else {
                OUP.LJJJJLL(LJIJJ, "vc_prop");
            }
        }
        LLLZLL(abstractC77373UYf);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        Effect LJIJJ2 = C86793Y4n.LJIJJ(abstractC77373UYf);
        C46193IAz c46193IAz = this.LLF;
        if (c46193IAz != null && (c29901Fi = c46193IAz.LLIFFJFJJ) != null) {
            t4s = c29901Fi.LIZJ();
        } else {
            t4s = null;
        }
        C82468WYe.LJIIIIZZ(shortVideoContext, LJIJJ2, false, t4s instanceof T4Q);
        C82492WZc c82492WZc = this.LLIZ;
        if (c82492WZc.LJLILLLLZI && !c82492WZc.LJLLI && !c82492WZc.LJLL) {
            ShortVideoContext shortVideoContext2 = getShortVideoContext();
            long currentTimeMillis = System.currentTimeMillis() - this.LLIZ.LJLJJI;
            o.LJIIIZ(shortVideoContext2, "shortVideoContext");
            o.LJIIIZ(effect, "effect");
            C145995oB LJIIIZ = C82468WYe.LJIIIZ(shortVideoContext2);
            LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
            LJIIIZ.LIZLLL("effect_name", effect.getName());
            LJIIIZ.LIZLLL("shoot_entrance", shortVideoContext2.LIZLLL().getStoryShootEntrance());
            LJIIIZ.LIZIZ(currentTimeMillis, "duration");
            FMX.LJIIL("voice_effect_preview_record_interrupt", LJIIIZ.LIZ);
        } else if (c82492WZc.LJLLLLLL.LJLLLLLL && !c82492WZc.LJLLI && (c82492WZc.LJLL || c82492WZc.LJLJL)) {
            C82468WYe.LJFF(getShortVideoContext(), effect, !this.LLIZ.LJLJL);
        } else if (C52461KiP.LIZJ()) {
            if (this.LLJJIJIL) {
                C82468WYe.LJFF(getShortVideoContext(), effect, false);
            } else if (this.LLJJIJIIJIL) {
                C82468WYe.LJFF(getShortVideoContext(), effect, true);
            }
        }
        if (C52461KiP.LIZJ()) {
            LLLLZIL(!this.LLILZ);
        }
        LLLIIIL();
        Handler handler = C171196nj.LIZ;
        handler.removeCallbacks(this.LLJILLL);
        handler.removeCallbacks(this.LLJJI);
        if (LLJJL()) {
            this.LLILLIZIL = true;
            handler.postDelayed(this.LLJJI, 200L);
            LLLZLZ("STATE_PREVIEW_PLAYING");
        } else {
            LLLZLZ("STATE_PREVIEW_SPEAK");
        }
        LLLZZ();
    }

    @Override // X.AbstractC82428WWq, X.InterfaceC82201WNx
    public void P3(String effectId, String enterMethod) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            LLLZIIL(this, effectId, enterMethod);
        } else {
            HRE.LIZ((ActivityC45651qj) C78688UuS.LJIJJ(this), new C82485WYv(), new C82489WYz(this, effectId, enterMethod), C171196nj.LIZJ);
        }
    }

    public static final void LLLZIIL(C82467WYd c82467WYd, String str, String str2) {
        super.P3(str, str2);
        if (!c82467WYd.LLILLJJLI) {
            c82467WYd.LLLL(str, str2);
        }
        c82467WYd.LLILLL = true;
        c82467WYd.LLILLJJLI = true;
        c82467WYd.LLLLZLLIL();
        c82467WYd.LLLJIL().LJII(Boolean.TRUE);
        if (!c82467WYd.LLFFF && C52461KiP.LIZLLL() && (c82467WYd.LLIL instanceof C77372UYe)) {
            c82467WYd.LLLLZI();
        }
    }

    public static /* synthetic */ void LLLLZLL(C82467WYd c82467WYd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c82467WYd.LLLLZIL(z);
    }

    public static /* synthetic */ void LLZLLIL(C82467WYd c82467WYd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c82467WYd.LLZLL(z);
    }
}
