package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5r8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147825r8 extends AbstractC29891Fh<InterfaceC146675pH> implements InterfaceC146675pH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC146675pH LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public C147835r9 LJLJJL;
    public final C5H3 LJLJJLL;

    static {
        TBT tbt = new TBT(C147825r8.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    private final int LJJLIIIIJ() {
        return ((Number) this.LJLJJLL.getValue()).intValue();
    }

    private final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJL[0]);
    }

    @Override // X.InterfaceC146675pH
    public void AD() {
        C147835r9 c147835r9 = new C147835r9(this, LJJLIIIJILLIZJL());
        this.LJLJJL = c147835r9;
        MutableLiveData<C122144qo> autoEnhanceData = LJJLI().Lo0();
        o.LJIIIZ(autoEnhanceData, "autoEnhanceData");
        c147835r9.LIZJ = autoEnhanceData;
        autoEnhanceData.postValue(C78555UsJ.LJIILL(c147835r9.LIZIZ, false, 3));
        a00(H7R.LJFF(LJJLIIIJILLIZJL()), false);
    }

    public final InterfaceC143655kP LJJLI() {
        return (InterfaceC143655kP) this.LJLJJI.getValue();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC146675pH getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C147825r8(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 355));
    }

    @Override // X.InterfaceC146675pH
    public void a00(boolean z, boolean z2) {
        int i;
        if (z) {
            VideoPublishEditModel LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (C136345Ws.LIZ(LJJLIIIJILLIZJL(), z2)) {
                LJJLIIIJILLIZJL().creativeModel.editVideoEnhanceModel.useHdrV2 = true;
                i = LJJLIIIIJ();
            } else {
                LJJLIIIJILLIZJL().creativeModel.editVideoEnhanceModel.useHdrV2 = false;
                i = 2;
            }
            LJJLIIIJILLIZJL.autoEnhanceType = i;
        }
        C147835r9 c147835r9 = this.LJLJJL;
        if (c147835r9 != null) {
            VideoPublishEditModel videoPublishEditModel = c147835r9.LIZIZ;
            o.LJIIIZ(videoPublishEditModel, "<this>");
            if (H7R.LJJJJL(videoPublishEditModel)) {
                ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData != null) {
                    imageAlbumData.setAutoEnhanceOn(z);
                }
            } else {
                videoPublishEditModel.autoEnhanceOn = z;
            }
            MutableLiveData<C122144qo> mutableLiveData = c147835r9.LIZJ;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(C78555UsJ.LJIILL(c147835r9.LIZIZ, z2, 1));
            }
            C44422Hc2.LIZ("hdr_enabled", Boolean.valueOf(z));
        }
    }
}
