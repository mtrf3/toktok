package X;

import X.C0I6;
import android.graphics.PointF;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC156246Bg<T, API_COMPONENT extends C0I6> extends AbstractC29891Fh<API_COMPONENT> implements C6BV, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;
    public MutableLiveData<Boolean> LJLJLJ;
    public C156356Br LJLJLLL;

    static {
        TBT tbt = new TBT(AbstractC156246Bg.class, "componentGestureService", "getComponentGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AbstractC156246Bg.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(AbstractC156246Bg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    public abstract C6BU<T> LJJLI(C82622Wbi c82622Wbi);

    public abstract void show();

    private final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJLL[2]);
    }

    private final VideoPublishEditModel LJJLIIIJJIZ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLL[1]);
    }

    @Override // X.C6BV
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLJLJ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final C6BU<T> LJJLIIIIJ() {
        return (C6BU) this.LJLJJI.getValue();
    }

    public final InterfaceC152085y0 LJJLIIIJILLIZJL() {
        return (InterfaceC152085y0) this.LJLJI.LIZ(this, LJLL[0]);
    }

    public final MutableLiveData<Float> LJJLIIIJLLLLLLLZ() {
        return (MutableLiveData) this.LJLJL.getValue();
    }

    @Override // X.C6BV
    public InterfaceC147435qV LIZ() {
        return LJJLIIIIJ().LJLJJLL;
    }

    @Override // X.C6BV
    public void LIZLLL() {
        LJJLIIIIJ().LJLJJLL.LJIIZILJ();
    }

    @Override // X.C6BV
    public boolean LJIILL() {
        return LJJLIIIIJ().LJLJJLL.LJIL();
    }

    @Override // X.C6BV
    public boolean LJIJJLI() {
        return LJJLIIIIJ().LJLJJLL.LJIILLIIL();
    }

    @Override // X.C6BV
    public void LJJ() {
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.LJLJJLL.LJJIJIIJI(LJJLIIIIJ.getEditPreviewApi().Kh().getValue(), LJJLIIIIJ.getEditPreviewApi());
        List<InteractStickerStruct> socialStickerStructs = C164826dS.LJI(LJJLIIIIJ.LLJJIJI().getMainBusinessContext(), LJJLIIIIJ.LLJJIII(), EnumC164816dR.TRACK_PAGE_EDIT);
        if (socialStickerStructs == null || socialStickerStructs.isEmpty()) {
            return;
        }
        o.LJIIIIZZ(socialStickerStructs, "socialStickerStructs");
        C40675Fxn.LJJLIIIJ(socialStickerStructs, new Comparator() { // from class: X.6Bi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((InteractStickerStruct) obj).getIndex() - ((InteractStickerStruct) obj2).getIndex();
            }
        });
        LJJLIIIIJ.LLJILJIL();
        Iterator<InteractStickerStruct> it = socialStickerStructs.iterator();
        while (it.hasNext()) {
            LJJLIIIIJ.LJLJJLL.LJJIZ(it.next());
        }
    }

    @Override // X.C6BV
    public void LJJIII() {
        AbstractC156286Bk<T> abstractC156286Bk = LJJLIIIIJ().LJLJJLL;
        Iterator it = ((ArrayList) abstractC156286Bk.LJLLI).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getParent() != null && view.getParent() != abstractC156286Bk.LJLIL) {
                return;
            }
            C16880lQ.LJLLLL(view, abstractC156286Bk.LJLIL);
            abstractC156286Bk.LJLL = null;
            C6BO c6bo = abstractC156286Bk.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LIZIZ();
            }
            it.remove();
        }
    }

    @Override // X.C6BV
    public boolean LLIILII() {
        AbstractC156316Bn<T> abstractC156316Bn = LJJLIIIIJ().LJLJJLL.LLIIII;
        if (abstractC156316Bn != null && abstractC156316Bn.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C6BV
    public int LLJL() {
        return ((ArrayList) LJJLIIIIJ().LJLJJLL.LJLLI).size();
    }

    @Override // X.C6BV
    public List<String> LLLIIL() {
        List<StickerItemModel> list;
        List<String> LJJIL;
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        InfoStickerModel infoStickerModel = LJJLIIIIJ.LLJJIJI().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && (!list.isEmpty()) && (LJJIL = LJJLIIIIJ.LJLJJLL.LJJIL()) != null) {
            return LJJIL;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.C6BV
    public void LLZLLLL() {
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getEditPreviewApi().U2(false, true, false);
        LJJLIIIIJ.LLJILJIL();
        AbstractC156286Bk<T> abstractC156286Bk = LJJLIIIIJ.LJLJJLL;
        abstractC156286Bk.LLIIIJ = abstractC156286Bk.LJLL;
        abstractC156286Bk.LJLL = null;
        AbstractC156316Bn<T> abstractC156316Bn = abstractC156286Bk.LLIIII;
        if (abstractC156316Bn != null) {
            float height = abstractC156286Bk.LJLIL.getHeight();
            float top = abstractC156286Bk.LJLIL.getTop();
            PointF pointF = abstractC156316Bn.LJLJLLL;
            pointF.x = height;
            pointF.y = top;
        }
        AbstractC156316Bn<T> abstractC156316Bn2 = abstractC156286Bk.LLIIII;
        if (abstractC156316Bn2 != null) {
            abstractC156316Bn2.LJIIIIZZ(null, new C156306Bm(0));
        }
    }

    @Override // X.C6BV
    public List<InteractStickerStruct> d() {
        List<StickerItemModel> list;
        List<InteractStickerStruct> LJJIJLIJ;
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        InfoStickerModel infoStickerModel = LJJLIIIIJ.LLJJIJI().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && (!list.isEmpty()) && (LJJIJLIJ = LJJLIIIIJ.LJLJJLL.LJJIJLIJ(list)) != null) {
            return LJJIJLIJ;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.C6BV
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLJLJ = liveData;
    }

    @Override // X.C6BV
    public void LJIILIIL(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLJLJ;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C6BV
    public void LJIILLIIL(String stickerId) {
        o.LJIIIZ(stickerId, "stickerId");
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        LJJLIIIIJ.LJLJJLL.LLII = stickerId;
    }

    @Override // X.C6BV
    public void LJIJJ(boolean z) {
        LJJLIIIIJ().LJLJJLL.LLFF = z;
    }

    @Override // X.C6BV
    public void LJIL(float f) {
        LJJLIIIIJ().LJLJJLL.LJJIIJ(f);
    }

    @Override // X.C6BV
    public void LJJI(boolean z) {
        LJJLIIIIJ().LJLJJLL.LJLILLLLZI = z;
    }

    @Override // X.C6BV
    public void LJJII(VESize size) {
        o.LJIIIZ(size, "size");
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        LJJLIIIIJ.LJLJJLL.LJLLLLLL = size;
    }

    @Override // X.C6BV
    public void LJJJI(String path) {
        o.LJIIIZ(path, "path");
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        LJJLIIIIJ.LJLJJLL.LJJIJ(path);
    }

    public final void LJJLIIJ(C156356Br c156356Br) {
        o.LJIIIZ(c156356Br, "<set-?>");
        this.LJLJLLL = c156356Br;
    }

    @Override // X.C6BV
    public void LJLJL(AnonymousClass655 deleteComponent) {
        o.LJIIIZ(deleteComponent, "deleteComponent");
        C6BU<T> LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        LJJLIIIIJ.LJLJJLL.LJLJJI = deleteComponent;
    }

    public AbstractC156246Bg(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2((AbstractC156246Bg) this, 459));
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJL = C221108m2.LIZIZ(C156256Bh.LJLIL);
        this.LJLJLLL = new C156356Br(LJJLIIIJJIZ(), diContainer);
    }

    @Override // X.C6BV, X.InterfaceC1547265k
    public C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        return LJJLIIIIJ().LJJIJIL(editor, compileCallback, interfaceC88471Ynr);
    }
}
