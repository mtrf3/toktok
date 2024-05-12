package X;

import Y.ARunnableS38S0100000_2;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6JS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JS extends AbstractC29891Fh<C63Q> implements InterfaceC135635Tz, C63Q {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public C6JU LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public MutableLiveData<Boolean> LJLJL;
    public ViewOnClickListenerC158316Jf LJLJLJ;

    static {
        TBT tbt = new TBT(C6JS.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    public C63Q LJJLI() {
        return this;
    }

    private final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.C63Q
    public InterfaceC147435qV LIZ() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ();
        }
        return null;
    }

    @Override // X.C63Q
    public void LIZLLL() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LJIIZILJ();
        }
    }

    @Override // X.C63Q
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C63Q
    public boolean LJIILL() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ().LJIL();
        }
        return false;
    }

    @Override // X.C63Q
    public boolean LJIJJLI() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ().LJIILLIIL();
        }
        return false;
    }

    @Override // X.C63Q
    public void LJJIII() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LJJII();
        }
    }

    @Override // X.C63Q
    public String LJJLIIIJLJLI() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ().LLII;
        }
        return null;
    }

    @Override // X.C63Q
    public boolean LLLLLLL() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ().LLIIIJ;
        }
        return false;
    }

    @Override // X.C63Q
    public InteractStickerStruct getInteractStickerStruct() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            return c6ju.LLJJ().getInteractStickerStruct();
        }
        return null;
    }

    @Override // X.C63Q
    public void show() {
        if (this.LJLJJL != null) {
            return;
        }
        if (this.LJLJLJ == null) {
            View inflate = ((ViewStub) this.LJLILLLLZI.requireViewById(this.LJLJJI)).inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout");
            this.LJLJLJ = (ViewOnClickListenerC158316Jf) inflate;
        }
        InterfaceC152085y0 interfaceC152085y0 = (InterfaceC152085y0) getDiContainer().LJ(InterfaceC152085y0.class, null);
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = this.LJLJLJ;
        if (viewOnClickListenerC158316Jf != null) {
            C6JU c6ju = new C6JU(interfaceC152085y0, viewOnClickListenerC158316Jf, getDiContainer());
            c6ju.LLJJ().LJLJJI = (AnonymousClass655) c6ju.LJLJI.LJ(AnonymousClass655.class, null);
            c6ju.LLJJ().LJLJI = H7R.LJJJJI(LJJLIIIIJ());
            this.LJLJJL = c6ju;
            if (!this.LJLILLLLZI.isAdded(c6ju)) {
                this.LJLILLLLZI.add(this.LJLJI, c6ju, "EditLiveCountDownStickerScene");
                return;
            }
            return;
        }
        o.LJIJI("editLiveCDLayout");
        throw null;
    }

    @Override // X.C63Q
    public void td0() {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            C6JV LLJJ = c6ju.LLJJ();
            if (LLJJ.LLIIIL != null) {
                ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = LLJJ.LLIIIILZ;
                o.LJI(viewOnClickListenerC158316Jf);
                C5S1 c5s1 = new C5S1(viewOnClickListenerC158316Jf.getContext());
                c5s1.LIZJ(R.string.dx6);
                c5s1.LJ();
                return;
            }
            LLJJ.LLIIIJ = true;
            LLJJ.LLI.U2(false, false, false);
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = LLJJ.LLIIIILZ;
            if (viewOnClickListenerC158316Jf2 != null) {
                float height = LLJJ.LJLIL.getHeight();
                float top = LLJJ.LJLIL.getTop();
                PointF pointF = viewOnClickListenerC158316Jf2.LJLLLLLL;
                pointF.x = height;
                pointF.y = top;
            }
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf3 = LLJJ.LLIIIILZ;
            if (viewOnClickListenerC158316Jf3 == null) {
                return;
            }
            viewOnClickListenerC158316Jf3.post(new ARunnableS38S0100000_2(LLJJ, 189));
        }
    }

    @Override // X.C63Q
    public void LJJ() {
        List<InteractStickerStruct> LJI = C164826dS.LJI(LJJLIIIIJ().getMainBusinessContext(), 10, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI == null || LJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct() == null) {
            return;
        }
        show();
        C6JU c6ju = this.LJLJJL;
        if (c6ju == null) {
            return;
        }
        c6ju.LLJJ().LJJIJIIJI(c6ju.getEditPreviewApi().Kh().getValue(), c6ju.getEditPreviewApi());
        if (LJI == null || LJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct() == null) {
            return;
        }
        c6ju.LLJJ().LJJIFFI((InteractStickerStruct) ListProtector.get(LJI, 0));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C63Q getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C63Q
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLJL = liveData;
    }

    @Override // X.C63Q
    public void LJIILIIL(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C63Q
    public void LJIILLIIL(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LLII = effectId;
        }
    }

    @Override // X.C63Q
    public void LJIJJ(boolean z) {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LLFF = z;
        }
    }

    @Override // X.C63Q
    public void LJIL(float f) {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LJJIIJ(f);
        }
    }

    @Override // X.C63Q
    public void LJJI(boolean z) {
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LJLILLLLZI = z;
        }
    }

    @Override // X.C63Q
    public void LJJII(VESize size) {
        o.LJIIIZ(size, "size");
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LJLLLLLL = size;
        }
    }

    @Override // X.C63Q
    public void LLLLLZL(String tabId) {
        o.LJIIIZ(tabId, "tabId");
        C6JU c6ju = this.LJLJJL;
        if (c6ju != null) {
            c6ju.LLJJ().LLIIII = tabId;
        }
    }

    public C6JS(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
