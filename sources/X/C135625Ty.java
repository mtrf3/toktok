package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135625Ty implements InterfaceC169856lZ {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJFF;
    public final InterfaceC135635Tz LIZ;
    public final C82632Wbs LIZIZ;
    public final C82631Wbr LIZJ;
    public final C82632Wbs LIZLLL;
    public final MutableLiveData<Boolean> LJ;

    static {
        TBT tbt = new TBT(C135625Ty.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C135625Ty.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C135625Ty.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC169856lZ
    public final AbstractC42651GoZ LIZLLL() {
        return (AbstractC42651GoZ) this.LIZLLL.LIZ(this, LJFF[2]);
    }

    public final InterfaceC142545ic LJIIJ() {
        return (InterfaceC142545ic) this.LIZIZ.LIZ(this, LJFF[0]);
    }

    @Override // X.InterfaceC169856lZ
    public final MutableLiveData<Bitmap> C0() {
        return LJIIJ().C0();
    }

    @Override // X.InterfaceC169856lZ
    public final ArrayList<EffectPointModel> J7() {
        return LJIIJ().J7();
    }

    @Override // X.InterfaceC169856lZ
    public final LiveData<Boolean> LIZ() {
        return LJIIJ().jb();
    }

    @Override // X.InterfaceC169856lZ
    public final LiveData<InterfaceC153045zY> LIZIZ() {
        return LJIIJ().Kh();
    }

    @Override // X.InterfaceC169856lZ
    public final MutableLiveData<C140335f3> LIZJ() {
        return LJIIJ().PM();
    }

    @Override // X.InterfaceC169856lZ
    public final void LJ() {
        if (LJIIJ().LLLLIL().veAudioEffectParam != null) {
            LJIIJ().MK(C135285Sq.LIZ(true, LJIIJ().LLLLIL().veAudioEffectParam));
        }
    }

    @Override // X.InterfaceC169856lZ
    public final StoredLiveData<C5RV> LJFF() {
        return LJIIJ().Sj0();
    }

    @Override // X.InterfaceC169856lZ
    public final ReplayLiveData<C5RT> LJI() {
        return LJIIJ().pJ();
    }

    @Override // X.InterfaceC169856lZ
    public final MutableLiveData<C5MM> LJIIIIZZ() {
        return LJIIJ().DM();
    }

    @Override // X.InterfaceC169856lZ
    public final VideoPublishEditModel LLLLIL() {
        return LJIIJ().LLLLIL();
    }

    @Override // X.InterfaceC169856lZ
    public final LiveData<C5RV> i3() {
        return LJIIJ().i3();
    }

    @Override // X.InterfaceC169856lZ
    public final MutableLiveData<Boolean> x7() {
        return LJIIJ().x7();
    }

    @Override // X.InterfaceC169856lZ
    public final MutableLiveData<Boolean> LJIIIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC169856lZ
    public final void LJII(VEVolumeChangeOp veVolumeChangeOp) {
        o.LJIIIZ(veVolumeChangeOp, "veVolumeChangeOp");
        C5XM c5xm = (C5XM) this.LIZJ.LIZ(this, LJFF[1]);
        if (c5xm != null) {
            if (veVolumeChangeOp.mType == 0) {
                c5xm.vt0(veVolumeChangeOp.mVolume);
                return;
            } else {
                c5xm.Dz(veVolumeChangeOp.mVolume);
                return;
            }
        }
        LJIIJ().Dl0(veVolumeChangeOp);
    }

    public C135625Ty(ActivityC45651qj activity, InterfaceC135635Tz injectAware) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(injectAware, "injectAware");
        this.LIZ = injectAware;
        this.LIZIZ = UCI.LJI(injectAware.getDiContainer(), InterfaceC142545ic.class, null);
        this.LIZJ = UCI.LJII(injectAware.getDiContainer(), C5XM.class, null);
        this.LIZLLL = UCI.LJI(injectAware.getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJ = new MutableLiveData<>();
    }
}
