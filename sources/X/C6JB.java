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
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6JB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JB extends AbstractC29891Fh<C63R> implements C63R, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public C6JD LJLJJL;
    public MutableLiveData<Boolean> LJLJJLL;
    public C6JI LJLJL;
    public final InterfaceC115514g7 LJLJLJ;

    static {
        TBT tbt = new TBT(C6JB.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    public C63R LJJLI() {
        return this;
    }

    private final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.C63R
    public InterfaceC147435qV LIZ() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI();
        }
        return null;
    }

    @Override // X.C63R
    public void LIZLLL() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LJIIZILJ();
        }
    }

    @Override // X.C63R
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLJJLL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C63R
    public boolean LJIILL() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI().LJIL();
        }
        return false;
    }

    @Override // X.C63R
    public boolean LJIJJLI() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI().LJIILLIIL();
        }
        return false;
    }

    @Override // X.C63R
    public void LJJIII() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LJJII();
        }
    }

    @Override // X.C63R
    public String LJJLIIIJLJLI() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI().LLIIIL;
        }
        return null;
    }

    @Override // X.C63R
    public boolean LLLLLLL() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI().LLIIJLIL;
        }
        return false;
    }

    @Override // X.C63R
    public void WO() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            C6JF LLJJI = c6jd.LLJJI();
            if (LLJJI.LLIIIJ != null) {
                LLJJI.LJJIL();
                return;
            }
            LLJJI.LLIIJLIL = true;
            LLJJI.LLI.U2(false, false, false);
            C6JI c6ji = LLJJI.LLIIJI;
            if (c6ji != null) {
                float height = LLJJI.LJLIL.getHeight();
                float top = LLJJI.LJLIL.getTop();
                PointF pointF = c6ji.LJLLILLLL;
                pointF.x = height;
                pointF.y = top;
            }
            C6JI c6ji2 = LLJJI.LLIIJI;
            if (c6ji2 == null) {
                return;
            }
            c6ji2.post(new ARunnableS38S0100000_2(LLJJI, 210));
        }
    }

    @Override // X.C63R
    public InteractStickerStruct getInteractStickerStruct() {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            return c6jd.LLJJI().getInteractStickerStruct();
        }
        return null;
    }

    @Override // X.C63R
    public void show() {
        if (this.LJLJJL != null) {
            return;
        }
        if (this.LJLJL == null) {
            View inflate = ((ViewStub) this.LJLILLLLZI.requireViewById(this.LJLJJI)).inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout");
            this.LJLJL = (C6JI) inflate;
        }
        C6JI c6ji = this.LJLJL;
        if (c6ji != null) {
            C6JD c6jd = new C6JD(c6ji, getDiContainer());
            c6jd.LLJJI().LJLJJI = (AnonymousClass655) c6jd.LJLILLLLZI.LJ(AnonymousClass655.class, null);
            c6jd.LLJJI().LJLJI = H7R.LJJJJI(LJJLIIIIJ());
            this.LJLJJL = c6jd;
            if (!this.LJLILLLLZI.isAdded(c6jd)) {
                this.LJLILLLLZI.add(this.LJLJI, c6jd, "EditPollStickerScene");
                return;
            }
            return;
        }
        o.LJIJI("editPollStickerLayout");
        throw null;
    }

    @Override // X.C63R
    public void LJJ() {
        List<InteractStickerStruct> LJI = C164826dS.LJI(LJJLIIIIJ().getMainBusinessContext(), 1, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI == null || LJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(LJI, 0)).getPollStruct() == null) {
            return;
        }
        show();
        C6JD c6jd = this.LJLJJL;
        if (c6jd == null) {
            return;
        }
        c6jd.LLJJI().LJJIJIIJI(c6jd.getEditPreviewApi().Kh().getValue(), c6jd.getEditPreviewApi());
        if (LJI == null || LJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(LJI, 0)).getPollStruct() == null) {
            return;
        }
        c6jd.LLJJI().LJJIFFI((InteractStickerStruct) ListProtector.get(LJI, 0));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C63R getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C63R
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLJJLL = liveData;
    }

    @Override // X.C63R
    public void LJIILIIL(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLJJLL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C63R
    public void LJIILLIIL(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LLIIIL = effectId;
        }
    }

    @Override // X.C63R
    public void LJIJJ(boolean z) {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LLFF = z;
        }
    }

    @Override // X.C63R
    public void LJIL(float f) {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LJJIIJ(f);
        }
    }

    @Override // X.C63R
    public void LJJI(boolean z) {
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LJLILLLLZI = z;
        }
    }

    @Override // X.C63R
    public void LJJII(VESize size) {
        o.LJIIIZ(size, "size");
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LJLLLLLL = size;
        }
    }

    @Override // X.C63R
    public void LLLLLZL(String tabId) {
        o.LJIIIZ(tabId, "tabId");
        C6JD c6jd = this.LJLJJL;
        if (c6jd != null) {
            c6jd.LLJJI().LLIIIZ = tabId;
        }
    }

    public C6JB(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJLJ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
