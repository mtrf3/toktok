package X;

import Y.AObserverS75S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.Loading;
import com.ss.android.ugc.aweme.shortvideo.model.State;
import com.ss.android.ugc.aweme.shortvideo.model.Success;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GhS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42210GhS extends AbstractC29891Fh<InterfaceC163116ah> implements InterfaceC163116ah, InterfaceC145625na, E0U, InterfaceC135635Tz {
    public static final C42213GhV LLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C5H3 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C5H3 LJLJJLL;
    public final MutableLiveData<C163166am> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final CopyOnWriteArrayList<InterfaceC42216GhY> LJLJLLL;
    public final C73849Syb<State<?>> LJLL;
    public final InterfaceC115514g7 LJLLI;
    public volatile boolean LJLLILLLL;
    public long LJLLJ;
    public EnumC42214GhW LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public InterfaceC153045zY LJLZ;
    public boolean LJZ;
    public float LJZI;
    public volatile State<?> LJZL;
    public String LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final InterfaceC163116ah LLFF;
    public final LiveData<C163166am> LLFFF;
    public final AbstractC73672Svk<State<?>> LLFII;
    public final MutableLiveData<Boolean> LLFZ;

    static {
        TBT tbt = new TBT(C42210GhS.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, new TBT(C42210GhS.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0)};
        LLI = new C42213GhV();
    }

    @Override // X.InterfaceC145625na
    public boolean LIZJ() {
        return false;
    }

    @Override // X.E0U
    public void LJIIJ(String str, boolean z) {
    }

    @Override // X.InterfaceC145625na
    public boolean LJJIJ() {
        return false;
    }

    private final GZ2 LJJLIIIJJI() {
        return (GZ2) this.LLF.getValue();
    }

    private final int LJJLIIIJJIZ() {
        int i;
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.LLL();
            if (i < 0) {
                return 0;
            }
        } else {
            i = 0;
        }
        return i;
    }

    private final VideoPublishEditModel LJJLIIIJLLLLLLLZ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LLIFFJFJJ[0]);
    }

    private final InterfaceC143655kP LJJLIIJ() {
        return (InterfaceC143655kP) this.LJLJJI.getValue();
    }

    private final GK9 LJJLJ() {
        return (GK9) this.LJLJJLL.getValue();
    }

    private final C5LK LJJLL() {
        return (C5LK) this.LJLLI.LIZ(this, LLIFFJFJJ[1]);
    }

    @Override // X.InterfaceC145625na
    public boolean LJJJIL() {
        if (this.LJZL instanceof Success) {
            return false;
        }
        EnumC42214GhW enumC42214GhW = this.LJLLL;
        if (enumC42214GhW != EnumC42214GhW.UNKNOWN && enumC42214GhW != EnumC42214GhW.PAUSED) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIJILLIZJL() {
        this.LJLL.onNext(this.LJZL);
    }

    public final C44428Hc8 LJJLJLI() {
        return (C44428Hc8) this.LLD.getValue();
    }

    public final boolean LJLIIL() {
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        if (interfaceC153045zY == null) {
            return false;
        }
        EnumC42214GhW enumC42214GhW = this.LJLLL;
        EnumC42214GhW enumC42214GhW2 = EnumC42214GhW.PAUSED;
        if (enumC42214GhW == enumC42214GhW2) {
            return false;
        }
        this.LJLLL = enumC42214GhW2;
        interfaceC153045zY.pause();
        return true;
    }

    public final boolean LJLJJLL() {
        C223338pd c223338pd;
        CopyOnWriteArrayList<InterfaceC42216GhY> copyOnWriteArrayList = this.LJLJLLL;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<InterfaceC42216GhY> it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().LIZ();
                return false;
            }
        }
        GK9 LJJLJ = LJJLJ();
        if ((!LJJLJ.LLJILJIL()) && (c223338pd = LJJLJ.LJLIL) != null) {
            c223338pd.setVisibility(0);
            C223338pd c223338pd2 = LJJLJ.LJLIL;
            if (c223338pd2 != null) {
                c223338pd2.LIZIZ();
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        return true;
    }

    public final boolean LJLJLJ() {
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        if (interfaceC153045zY == null || C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.STARTED) < 0 || !this.LJLLILLLL) {
            return false;
        }
        EnumC42214GhW enumC42214GhW = this.LJLLL;
        EnumC42214GhW enumC42214GhW2 = EnumC42214GhW.PLAYING;
        if (enumC42214GhW == enumC42214GhW2) {
            return false;
        }
        interfaceC153045zY.play();
        this.LJLLL = enumC42214GhW2;
        return true;
    }

    private final boolean LJLJJL() {
        List<String> sourceInfo;
        String str;
        List<CanvasFilterParam> transformList;
        CanvasFilterParam canvasFilterParam;
        CanvasVideoData canvasVideoData = LJJLIIIJLLLLLLLZ().canvasVideoData;
        if (canvasVideoData != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && (str = (String) ORZ.LJLLLL(sourceInfo)) != null) {
            this.LL = str;
            CanvasVideoData canvasVideoData2 = LJJLIIIJLLLLLLLZ().canvasVideoData;
            if (canvasVideoData2 != null && (transformList = canvasVideoData2.getTransformList()) != null && (canvasFilterParam = (CanvasFilterParam) ListProtector.get(transformList, 0)) != null) {
                String str2 = this.LL;
                if (str2 != null) {
                    java.util.Map<String, E0S> map = C41848Gbc.LIZLLL;
                    synchronized (map) {
                        E0S e0s = (E0S) ((LinkedHashMap) map).get(str2);
                        if (e0s != null) {
                            e0s.LIZ(this);
                        }
                    }
                    String animPath = canvasFilterParam.getAnimPath();
                    if (animPath == null || animPath.length() == 0) {
                        C43314GzG.LIZ(new IDqS432S0100000_7(this, 2));
                    } else {
                        this.LJLLILLLL = true;
                    }
                    if (!this.LJLLILLLL || !LJJZZIII(this, 0, 0, 3, null)) {
                        LJLJJLL();
                    }
                    return true;
                }
                o.LJIJI("downloadUrl");
                throw null;
            }
        }
        return false;
    }

    public final boolean LJJLI() {
        GK9 LJJLJ = LJJLJ();
        if (LJJLJ.LLJILJIL()) {
            C223338pd c223338pd = LJJLJ.LJLIL;
            if (c223338pd == null) {
                return true;
            }
            c223338pd.setVisibility(8);
            C223338pd c223338pd2 = LJJLJ.LJLIL;
            if (c223338pd2 != null) {
                c223338pd2.LIZJ();
                return true;
            }
            o.LJIJI("loadingView");
            throw null;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, LJJLJ(), "StreamEditScene");
        if (!LJLJJL()) {
            return;
        }
        C5LK LJJLL = LJJLL();
        if (LJJLL != null) {
            LJJLL.IJ(this);
        }
        LJJLIIJ().Kh().observe(this, new AObserverS75S0100000_7(this, 41));
        LJJLIIJ().wf0().observe(this, new AObserverS75S0100000_7(this, 42));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        String str = this.LL;
        if (str != null) {
            java.util.Map<String, E0S> map = C41848Gbc.LIZLLL;
            synchronized (map) {
                E0S e0s = (E0S) ((LinkedHashMap) map).get(str);
                if (e0s != null) {
                    e0s.LIZJ(this);
                }
            }
            String str2 = this.LL;
            if (str2 != null) {
                C41848Gbc.LIZ(str2);
                C5LK LJJLL = LJJLL();
                if (LJJLL != null) {
                    LJJLL.ne(this);
                    return;
                }
                return;
            }
            o.LJIJI("downloadUrl");
            throw null;
        }
        o.LJIJI("downloadUrl");
        throw null;
    }

    @Override // X.InterfaceC163116ah
    public boolean zO() {
        return LJJLJ().LLJILJIL();
    }

    @Override // X.InterfaceC163116ah
    public AbstractC73672Svk<State<?>> A30() {
        return this.LLFII;
    }

    @Override // X.InterfaceC163116ah
    public /* bridge */ /* synthetic */ LiveData LLIIII() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC163116ah
    public LiveData<C163166am> YN() {
        return this.LLFFF;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC163116ah getApiComponent() {
        return this.LLFF;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.E0U
    public void LJJJJI(String str) {
        LJJLIIIJILLIZJL();
    }

    @Override // X.E0U
    public void LJJJLIIL(String str) {
        C6QQ.LIZ(new AqS157S0100000_7(this, 342));
    }

    public final void LJJLIIIIJ(boolean z) {
        Iterator<InterfaceC42216GhY> it = this.LJLJLLL.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            boolean LIZIZ = it.next().LIZIZ(z);
            if (!z2 && LIZIZ) {
                z2 = true;
            }
        }
        if (z2) {
            this.LJLLLL++;
        }
    }

    @Override // X.InterfaceC163116ah
    public void NH(InterfaceC42216GhY observer) {
        o.LJIIIZ(observer, "observer");
        if (!this.LJLJLLL.contains(observer)) {
            this.LJLJLLL.add(observer);
        }
    }

    @Override // X.InterfaceC163116ah
    public void Wo(InterfaceC42216GhY observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLJLLL.remove(observer);
    }

    private final boolean LJJZZI(int i, int i2) {
        int i3;
        if (this.LJZL instanceof Success) {
            return true;
        }
        if (i < 0) {
            i = LJJLIIIJJIZ();
        }
        if (i2 < 0) {
            String str = this.LL;
            if (str != null) {
                i2 = C41848Gbc.LIZIZ(i, str);
            } else {
                o.LJIJI("downloadUrl");
                throw null;
            }
        }
        InterfaceC153045zY interfaceC153045zY = this.LJLZ;
        boolean z = false;
        if (interfaceC153045zY != null) {
            i3 = interfaceC153045zY.getDuration();
        } else {
            i3 = 0;
        }
        int i4 = (int) (i3 * this.LJZI);
        GZ2 LJJLIIIJJI = LJJLIIIJJI();
        int i5 = this.LJLLLLLL;
        int i6 = this.LJLLLL;
        int min = Math.min((int) (Math.pow(1.5d, i6 - 1) * LJJLIIIJJI.LIZ), LJJLIIIJJI.LIZIZ);
        if (i >= i5 && (i2 > 0 ? i2 < min : i4 - i < min)) {
            z = true;
        }
        return !z;
    }

    @Override // X.E0U
    public void LJJJJJ(String str, float f) {
        this.LJZL = new Loading(f);
        this.LJZI = f;
        if (this.LJLZ == null) {
            return;
        }
        int LJJLIIIJJIZ = LJJLIIIJJIZ();
        String str2 = this.LL;
        if (str2 != null) {
            int LIZIZ = C41848Gbc.LIZIZ(LJJLIIIJJIZ, str2);
            C6QQ.LIZ(new C42212GhU(LJJZZI(LJJLIIIJJIZ, LIZIZ), this, LJJLIIIJJIZ, LIZIZ));
        } else {
            o.LJIJI("downloadUrl");
            throw null;
        }
    }

    public C42210GhS(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(GZ1.LJLIL);
        MutableLiveData<C163166am> mutableLiveData = new MutableLiveData<>();
        this.LJLJL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData2;
        this.LJLJLLL = new CopyOnWriteArrayList<>();
        C73849Syb<State<?>> c73849Syb = new C73849Syb<>();
        this.LJLL = c73849Syb;
        this.LJLLI = UCI.LJII(getDiContainer(), C5LK.class, null);
        this.LJLLL = EnumC42214GhW.UNKNOWN;
        this.LJLLLL = 1;
        this.LJLLLLLL = -1;
        this.LJZ = true;
        this.LJZL = new Loading(0.0f);
        this.LLD = C221108m2.LIZIZ(C42215GhX.LJLIL);
        this.LLF = C221108m2.LIZIZ(GZ0.LJLIL);
        this.LLFF = this;
        this.LLFFF = mutableLiveData;
        this.LLFII = new C73426Srm(c73849Syb);
        this.LLFZ = mutableLiveData2;
    }

    @Override // X.E0U
    public void LJJJ(String str, int i, int i2, String str2) {
        C6QQ.LIZ(new C42211GhT(this, str, i, i2, str2));
    }

    public static /* synthetic */ boolean LJJZZIII(C42210GhS c42210GhS, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return c42210GhS.LJJZZI(i, i2);
    }
}
