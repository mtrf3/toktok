package X;

import Y.ACallableS84S0200000_7;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gn6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42560Gn6 implements InterfaceC163126ai {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public InterfaceC42561Gn7 LIZJ;
    public final List<InterfaceC42559Gn5> LIZLLL;
    public final MutableLiveData LJ;

    @Override // X.InterfaceC53742L7i
    public final void LIZLLL() {
        List<StickerItemModel> list;
        boolean z;
        int LIZ;
        List<CanvasFilterParam> transformList;
        CanvasFilterParam canvasFilterParam;
        FP1.LJ("EditCanvasEmbeddedStickerController->", "onRenderContextReady");
        InfoStickerModel infoStickerModel = this.LIZIZ.infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                StickerItemModel it = stickerItemModel;
                o.LJIIIIZZ(it, "it");
                if (C1535160t.LIZ(it)) {
                    arrayList.add(stickerItemModel);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    StickerItemModel it3 = (StickerItemModel) it2.next();
                    List<InterfaceC42559Gn5> list2 = this.LIZLLL;
                    Context context = this.LIZ;
                    VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
                    if (videoPublishEditModel.mIsFromDraft && !videoPublishEditModel.isFromRestoreRecover) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o.LJIIIIZZ(it3, "it");
                    CanvasVideoData canvasVideoData = this.LIZIZ.canvasVideoData;
                    if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null && (canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLL(transformList)) != null) {
                        LIZ = canvasFilterParam.getNickNameStyle();
                    } else {
                        LIZ = C2311395h.LIZ();
                    }
                    ((ArrayList) list2).add(new C42557Gn3(context, z, it3, LIZ, new AqS157S0100000_7(this, 766)));
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(((ArrayList) this.LIZLLL).size());
        Iterator it4 = ((ArrayList) this.LIZLLL).iterator();
        while (it4.hasNext()) {
            ((InterfaceC42559Gn5) it4.next()).LJ(new AqS157S0100000_7(countDownLatch, 767));
        }
        C10K.LIZJ(new ACallableS84S0200000_7(countDownLatch, this, 19));
    }

    @Override // X.InterfaceC163126ai
    public final AbstractC73672Svk<List<StickerItemModel>> LJFF() {
        List<InterfaceC42559Gn5> list = this.LIZLLL;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        List<InterfaceC42559Gn5> list2 = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC42559Gn5) it.next()).LIZLLL());
        }
        return AbstractC73672Svk.LJJIIZ(arrayList).LJJIII(E4R.LJLIL, false).LJJLIL().LJJIIJZLJL();
    }

    @Override // X.InterfaceC163126ai
    public final MutableLiveData LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC53742L7i
    public final void LIZ(OSZ<OSZ<Float, Float>, OSZ<Float, Float>> rect) {
        o.LJIIIZ(rect, "rect");
        OSZ<Float, Float> first = rect.getFirst();
        float floatValue = first.getFirst().floatValue();
        float floatValue2 = first.getSecond().floatValue();
        OSZ<Float, Float> second = rect.getSecond();
        float floatValue3 = second.getFirst().floatValue();
        float floatValue4 = second.getSecond().floatValue();
        if (floatValue3 - floatValue > 0.0f && floatValue4 - floatValue2 > 0.0f) {
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                ((InterfaceC42559Gn5) it.next()).LIZ(rect);
            }
        }
    }

    @Override // X.InterfaceC53742L7i
    public final void LIZIZ(float f) {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC42559Gn5) it.next()).LIZIZ(f);
        }
    }

    @Override // X.InterfaceC53742L7i
    public final void LJ(LPI lpi) {
        this.LIZJ = lpi;
    }

    public C42560Gn6(Context context, VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = context;
        this.LIZIZ = editModel;
        this.LIZLLL = new ArrayList();
        this.LJ = new MutableLiveData();
    }

    @Override // X.InterfaceC53742L7i
    public final void LIZJ(float f, float f2) {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC42559Gn5) it.next()).LIZJ(f, f2);
        }
    }
}
