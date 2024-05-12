package X;

import Y.AObjectS86S0100000_7;
import android.text.TextUtils;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3A extends AbstractC29891Fh<InterfaceC160396Rf> implements InterfaceC160396Rf, InterfaceC135635Tz {
    public static final I3D LJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public float LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final HashSet<String> LJLLI;
    public final C5H3 LJLLILLLL;
    public final I0N LJLLJ;

    static {
        TBT tbt = new TBT(I3A.class, "gestureLogicComponent", "getGestureLogicComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, new TBT(I3A.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0), new TBT(I3A.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(I3A.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};
        LJLLL = new I3D();
    }

    public InterfaceC160396Rf LJJLIIIIJ() {
        return this;
    }

    private final InterfaceC82353WTt LJJLIIIJJI() {
        return (InterfaceC82353WTt) this.LJLJJI.LIZ(this, LJLLLL[0]);
    }

    private final InterfaceC45979I2t LJJLIIIJLLLLLLLZ() {
        return (InterfaceC45979I2t) this.LJLL.LIZ(this, LJLLLL[3]);
    }

    public final HXE LJJLIIIJILLIZJL() {
        return (HXE) this.LJLJJL.LIZ(this, LJLLLL[1]);
    }

    public final float LJJLIIIJJIZ() {
        return ((Number) this.LJLLILLLL.getValue()).floatValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLLLL[2]);
    }

    public final boolean LJJLI() {
        I0N i0n;
        LiveEvent<T4S> CY;
        Iterator<TimeSpeedModelExtension> it = getShortVideoContext().LIZIZ().iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = !TextUtils.isEmpty(it.next().getStickerId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        o.LJIIIIZZ(valueOf, "shortVideoContext.containsSticker()");
        if (!valueOf.booleanValue() && ((i0n = this.LJLLJ) == null || (CY = i0n.CY()) == null || CY.LIZJ() == null || !(this.LJLLJ.CY().LIZJ() instanceof T4Q))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        Iterator it = C47261Igj.LJJIJIIJI(I38.PHOTO_SHORT.getTag(), I38.RECORD_COMBINE.getTag(), I38.RECORD_COMBINE_15.getTag(), I38.RECORD_COMBINE_60.getTag(), I38.RECORD_COMBINE_180.getTag(), I38.RECORD_SPLIT_3MIN.getTag(), I38.RECORD_SPLIT_LIGHTENING.getTag(), I38.RECORD_LIGHTENING_QUICK.getTag(), I38.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag(), I38.NEW_BOTTOM_STORY.getTag(), I38.RECORD_NOW.getTag()).iterator();
        while (it.hasNext()) {
            this.LJLLI.add(it.next());
        }
        this.LJLIL.requireViewById(this.LJLJI);
        LJJLIIIJJI().ID(new I3B(this), 18, 300);
        LJJLIIIJLLLLLLLZ().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS86S0100000_7(this, 99));
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        boolean z;
        super.onResume();
        if (!getShortVideoContext().LJJIJIIJI() && !getShortVideoContext().mIsFromDraft && !V16.LJJIIZI(getShortVideoContext()) && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
            z = true;
        } else {
            z = false;
        }
        YC(z);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC160396Rf getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC160396Rf
    public void YC(boolean z) {
        if (getShortVideoContext().qaStruct == null) {
            this.LJLJLLL = z;
        } else {
            this.LJLJLLL = false;
        }
    }

    public I3A(WMH parentScene, C82622Wbi diContainer, int i) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), HXE.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLLL = true;
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLLI = new HashSet<>();
        this.LJLLILLLL = C221108m2.LIZIZ(I3C.LJLIL);
        this.LJLLJ = (I0N) getDiContainer().LJIIIIZZ(null, I0N.class);
    }
}
