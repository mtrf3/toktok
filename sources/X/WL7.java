package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEDisplaySettings;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WL7 extends AbstractC29891Fh<WIL> implements WIL, InterfaceC135635Tz {
    public static final WL8 LJLLILLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final WIL LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final MutableLiveData<EnumC82072WIy> LJLJLJ;
    public final C29901Fi<OSZ<EnumC82072WIy, EnumC82072WIy>> LJLJLLL;
    public String LJLL;
    public boolean LJLLI;

    static {
        TBT tbt = new TBT(WL7.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, new TBT(WL7.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(WL7.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(WL7.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LJLLILLLL = new WL8();
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLJJL.LIZ(this, LJLLJ[1]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJI.LIZ(this, LJLLJ[0]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLLJ[2]);
    }

    public final boolean LJJLIIIJILLIZJL() {
        String str = this.LJLL;
        if (str != null) {
            switch (str.hashCode()) {
                case -1639084575:
                    if (str.equals("RecordShoot15s")) {
                        return true;
                    }
                    break;
                case -1639079925:
                    if (str.equals("RecordShoot60s")) {
                        return true;
                    }
                    break;
                case 446122820:
                    if (str.equals("RecordCombinePhoto")) {
                        return true;
                    }
                    break;
                case 553362094:
                    if (str.equals("DUET_MODE_CAMERA_RECORD")) {
                        return true;
                    }
                    break;
                case 727986648:
                    if (str.equals("RecordShoot180s")) {
                        return true;
                    }
                    break;
                case 728127915:
                    if (str.equals("RecordShoot600s")) {
                        return true;
                    }
                    break;
                case 1866808238:
                    if (str.equals("record_mode_duet")) {
                        return true;
                    }
                    break;
            }
        }
        if (getShortVideoContext().LJJJI() || getShortVideoContext().LJJIJIIJI()) {
            return true;
        }
        return false;
    }

    public final void LJJLIIIJJI() {
        EnumC82072WIy value = this.LJLJLJ.getValue();
        if (value == null) {
            value = EnumC82072WIy.DISMISS;
        }
        o.LJIIIIZZ(value, "_mirrorModeState.value ?….MirrorModeStatus.DISMISS");
        this.LJLJLJ.setValue(LJJLI());
        this.LJLJLLL.LJII(new OSZ<>(value, LJJLI()));
    }

    @Override // X.WIL
    public boolean Yb0() {
        this.LJLLI = !this.LJLLI;
        LJJLIIIJJI();
        return this.LJLLI;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LJLLJ[3]);
    }

    private final boolean LJJLIIIIJ() {
        return getCameraApiComponent().LLFZ();
    }

    public final EnumC82072WIy LJJLI() {
        if (!LJJLIIIJILLIZJL()) {
            return EnumC82072WIy.DISMISS;
        }
        if (!LJJLIIIIJ()) {
            return EnumC82072WIy.DISMISS;
        }
        if (this.LJLLI) {
            return EnumC82072WIy.ON;
        }
        return EnumC82072WIy.OFF;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (C53237Kuv.LIZ() == 3 || C53237Kuv.LIZ() == 4) {
            Object value = C165326eG.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            this.LJLLI = ((Keva) value).getBoolean("switch", false);
            this.LJLJLJ.setValue(LJJLI());
        }
        this.LJLJLJ.observe(this, new AObserverS82S0100000_14(this, 44));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 233));
        getCameraApiComponent().uB().LIZLLL(this, new AObjectS89S0100000_14(this, 234));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS89S0100000_14(this, 235));
        getRecordControlApi().UY().LIZIZ(this, new AObjectS89S0100000_14(this, 236));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 237));
        LJJLIIIJJI();
    }

    @Override // X.WIL
    public LiveEvent<OSZ<EnumC82072WIy, EnumC82072WIy>> Ok() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WIL getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WIL
    public LiveData<EnumC82072WIy> getState() {
        return this.LJLJLJ;
    }

    @Override // X.WIL
    public int BK(boolean z) {
        VEDisplaySettings O7 = getCameraApiComponent().O7();
        if (O7.getFlipY() == z) {
            return 0;
        }
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(O7);
        builder.setFlipY(z);
        VEDisplaySettings settings = builder.build();
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        o.LJIIIIZZ(settings, "settings");
        return cameraApiComponent.s8(settings);
    }

    @Override // X.WIL
    public void yt(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", getShortVideoContext().LJI());
        c188727au.LJIIIZ("shoot_way", getShortVideoContext().shootWay);
        c188727au.LJIIIZ("enter_from", getShortVideoContext().enterFrom);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("click_mirror", c188727au.LIZ);
    }

    public WL7(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new C29901Fi<>();
    }
}
