package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.69p */
/* loaded from: classes3.dex */
public final class C1558169p extends C6BL {
    public NatureSpeciesModel LLI;
    public EditNatureStickerViewModel LLIFFJFJJ;
    public String LLII;
    public VideoPublishEditModel LLIIII;

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e3o;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 23;
    }

    @Override // X.C6BL
    public final void LJJII() {
        this.LLI = null;
        super.LJJII();
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLI != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        Context mActivity = this.LJZL;
        o.LJIIIIZZ(mActivity, "mActivity");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(mActivity);
        if (LJJIFFI != null) {
            EditNatureStickerViewModel editNatureStickerViewModel = this.LLIFFJFJJ;
            if (editNatureStickerViewModel != null) {
                return editNatureStickerViewModel.Hv0(LJJIFFI).getInTimeEditView();
            }
            o.LJIJI("natureStickerViewModel");
            throw null;
        }
        return false;
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        float f;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!LJIILLIIL() || this.LJLL == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(23);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(C6BL.LJIILJJIL(this.LJLL.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.LJLL.getScale()));
        PointF LIZIZ = LIZIZ(this.LJLL.getCenterViewPoint());
        normalTrackTimeStamp.setX(LIZIZ.x);
        normalTrackTimeStamp.setY(LIZIZ.y);
        C156426By c156426By = this.LJLL;
        if (!(c156426By instanceof C1558369r)) {
            c156426By = null;
        }
        float f2 = 0.0f;
        if (c156426By != null) {
            f = c156426By.getStartTime();
        } else {
            f = 0.0f;
        }
        normalTrackTimeStamp.setStartTime(f);
        C156426By c156426By2 = this.LJLL;
        if ((c156426By2 instanceof C1558369r) && c156426By2 != null) {
            f2 = c156426By2.getEndTime();
        }
        normalTrackTimeStamp.setEndTime(f2);
        PointF LIZIZ2 = LIZIZ(new PointF(this.LJLL.getContentViewWidth(), this.LJLL.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(LIZIZ2.x);
        normalTrackTimeStamp.setHeight(LIZIZ2.y);
        linkedList.add(normalTrackTimeStamp);
        C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
        NatureSpeciesModel natureSpeciesModel = this.LLI;
        if (natureSpeciesModel != null) {
            str = natureSpeciesModel.speciesId;
            str2 = natureSpeciesModel.speciesName;
            str3 = natureSpeciesModel.genusId;
            str4 = natureSpeciesModel.genusName;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        interactStickerStruct.setNatureClassificationStickerStruct(new NatureClassificationStickerStruct(new NatureClassificationStruct(str, str2, str3, str4, "redirectionSchema")));
        return interactStickerStruct;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C1558369r c1558369r = new C1558369r(context);
        c1558369r.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c1558369r.setController(this);
        c1558369r.setLockMode(true);
        return c1558369r;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 72), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        if (c156426By instanceof C1558369r) {
            VideoPublishEditModel videoPublishEditModel = this.LLIIII;
            if (videoPublishEditModel != null && (infoStickerModel = videoPublishEditModel.infoStickerModel) != null && (list = infoStickerModel.stickers) != null) {
                Iterator<StickerItemModel> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().type == 26) {
                        it.remove();
                    }
                }
            }
            this.LLI = null;
            return super.LJJIII(c156426By);
        }
        return false;
    }

    public static final /* synthetic */ void LJJIJLIJ(C1558169p c1558169p, InteractStickerStruct interactStickerStruct) {
        super.LJJIFFI(interactStickerStruct);
    }

    @Override // X.C6BL
    public final void LJIJ(Context context, FrameLayout frameLayout) {
        super.LJIJ(context, frameLayout);
        if (frameLayout != null) {
            JediViewModel LIZ = C163726bg.LIZJ(frameLayout).LIZ(EditNatureStickerViewModel.class);
            o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
            this.LLIFFJFJJ = (EditNatureStickerViewModel) LIZ;
        }
        this.LLFF = false;
    }

    public final void LJJIL(NatureSpeciesModel speciesModel, C1558669u c1558669u, boolean z, boolean z2) {
        C1558369r c1558369r;
        o.LJIIIZ(speciesModel, "speciesModel");
        this.LLI = speciesModel;
        LIZLLL(z2);
        C156426By c156426By = this.LJLL;
        if ((c156426By instanceof C1558369r) && (c1558369r = (C1558369r) c156426By) != null) {
            c1558369r.setVisibility(4);
            c1558369r.LLIIIZ.LIZIZ(c1558669u, speciesModel.speciesName);
            if (z) {
                c1558369r.post(new ARunnableS38S0100000_2(c1558369r, 206));
            }
        }
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJII();
        }
    }
}
