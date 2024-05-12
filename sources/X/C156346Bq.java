package X;

import Y.ARunnableS13S0300000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156346Bq extends AbstractC156286Bk<C42802Gr0> {
    public final C82622Wbi LLIIIL;
    public String LLIIIZ;
    public final C62822Ol8 LLIIJI;

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 9;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63H) this.LLIIJI.getValue()).LJIIIIZZ();
    }

    @Override // X.AbstractC156286Bk
    public final List<String> LJJIL() {
        String str;
        C156376Bt c156376Bt;
        HashtagStruct hashTagStruct;
        ArrayList arrayList = new ArrayList(((ArrayList) this.LJLLI).size());
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (!(c156426By instanceof C156376Bt) || (c156376Bt = (C156376Bt) c156426By) == null || (hashTagStruct = c156376Bt.getHashTagStruct()) == null || (str = hashTagStruct.getHashtagName()) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final Mission LJJJJ() {
        String str;
        List<String> challengeNames;
        Mission mission = this.LLI.creativeModel.commerceModel.getMission();
        if (mission != null && (challengeNames = mission.getChallengeNames()) != null) {
            str = (String) ListProtector.get(challengeNames, 0);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mission;
    }

    public static final String LJJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ht_start");
        LIZ.append(UUID.randomUUID());
        LIZ.append("ht_end");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6BL
    public final String LJIILL() {
        String stickerPath = super.LJIILL();
        o.LJIIIIZZ(stickerPath, "stickerPath");
        int LJJLIIIJL = s.LJJLIIIJL(stickerPath, "/effect/hashtag_stickers", 0, false, 6);
        if (LJJLIIIJL <= 0) {
            return stickerPath;
        }
        String substring = stickerPath.substring(0, LJJLIIIJL);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        C82622Wbi diContainer = this.LLIIIL;
        o.LJIIIZ(diContainer, "diContainer");
        C156376Bt c156376Bt = new C156376Bt(context);
        c156376Bt.LLIIL = diContainer;
        c156376Bt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c156376Bt;
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        C156376Bt c156376Bt;
        String str;
        List<String> challengeNames;
        HashtagStruct hashTagStruct;
        String str2 = null;
        if (c156426By instanceof C156376Bt) {
            c156376Bt = (C156376Bt) c156426By;
        } else {
            c156376Bt = null;
        }
        if (LJJJJ() == null) {
            return super.LJJIII(c156426By);
        }
        Mission LJJJJ = LJJJJ();
        if (c156376Bt != null && (hashTagStruct = c156376Bt.getHashTagStruct()) != null) {
            str = hashTagStruct.getHashtagName();
        } else {
            str = null;
        }
        if (LJJJJ != null && (challengeNames = LJJJJ.getChallengeNames()) != null) {
            str2 = (String) ListProtector.get(challengeNames, 0);
        }
        if (TextUtils.equals(str, str2)) {
            new H9C().LJIIL(LJJJJ, 2, 0);
            if (LJJJJ != null) {
                LJJJJ.setEnableHashtagSticker(false);
            }
            this.LLI.creativeModel.commerceModel.setMission(LJJJJ);
        }
        return super.LJJIII(c156426By);
    }

    @Override // X.C6BL
    public final void LJJIIJ(float f) {
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(f);
        }
    }

    @Override // X.C6BL
    public final void LJJIJ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (s.LJJJLZIJ(str, "ht_start", false) && s.LJJJLZIJ(str, "ht_end", false)) {
            this.LJLLLL = new OJD("ht_start(.*?)ht_end").replace(str, LJJJIL());
            return;
        }
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(str, separator, false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(LJJJIL());
            this.LJLLLL = X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(LJJJIL());
        this.LJLLLL = X1D.LIZIZ(LIZ2);
    }

    @Override // X.AbstractC156286Bk
    public final List<InteractStickerStruct> LJJIJLIJ(List<? extends StickerItemModel> list) {
        C156376Bt c156376Bt;
        ArrayList arrayList = new ArrayList(((ArrayList) this.LJLLI).size());
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(9);
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            normalTrackTimeStamp.setRotation(C6BL.LJIILJJIL(c156426By.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(c156426By.getScale()));
            PointF LIZIZ = LIZIZ(c156426By.getCenterViewPoint());
            normalTrackTimeStamp.setX(LIZIZ.x);
            normalTrackTimeStamp.setY(LIZIZ.y);
            normalTrackTimeStamp.setStartTime(c156426By.getStartTime());
            normalTrackTimeStamp.setEndTime(c156426By.getEndTime());
            PointF LIZIZ2 = LIZIZ(new PointF(c156426By.getContentViewWidth(), c156426By.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(LIZIZ2.x);
            normalTrackTimeStamp.setHeight(LIZIZ2.y);
            linkedList.add(normalTrackTimeStamp);
            C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
            if ((c156426By instanceof C156376Bt) && (c156376Bt = (C156376Bt) c156426By) != null) {
                interactStickerStruct.setHashtagInfo(c156376Bt.getHashTagStruct());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("hashtag_sticker_id", this.LLII);
            hashMap.put("mission_hashtag_name", this.LLIIIZ);
            interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel.viewHash == c156426By.hashCode()) {
                    interactStickerStruct.setIndex(stickerItemModel.layerWeight);
                }
            }
            arrayList.add(interactStickerStruct);
        }
        return arrayList;
    }

    @Override // X.AbstractC156286Bk
    public final void LJJIZ(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.LLII = (String) ((HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6C6
            }.getType())).get("hashtag_sticker_id");
            C156426By LJJJJI = LJJJJI(interactStickerStruct.getHashtagInfo());
            LJJJJI.postDelayed(new ARunnableS13S0300000_2(LJJJJI, this, interactStickerStruct, 3), 300L);
            LJJJI(interactStickerStruct);
        }
    }

    @Override // X.AbstractC156286Bk
    public final void LJJJI(InteractStickerStruct interactStickerStruct) {
        C156396Bv c156396Bv;
        Number number;
        Number number2;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
        C156426By c156426By = this.LJLL;
        if ((c156426By instanceof C156376Bt) && (c156396Bv = (C156396Bv) c156426By) != null) {
            if (LIZIZ != null) {
                number = Float.valueOf(LIZIZ.getStartTime());
            } else {
                number = 0;
            }
            int intValue = number.intValue();
            if (LIZIZ != null) {
                number2 = Float.valueOf(LIZIZ.getEndTime());
            } else {
                number2 = 0;
            }
            c156396Bv.setSocialStickerTimeEditData(new C1558669u(interactStickerStruct, intValue, number2.intValue()));
            c156396Bv.setController(this);
        }
    }

    public final C156426By LJJJJI(HashtagStruct hashtagStruct) {
        LIZLLL(true);
        C156426By c156426By = this.LJLL;
        o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
        C156396Bv c156396Bv = (C156396Bv) c156426By;
        AbstractC156316Bn<T> abstractC156316Bn = this.LLIIII;
        if (c156396Bv.getMBaseView() == null && abstractC156316Bn != 0) {
            c156396Bv.setMBaseView(abstractC156316Bn.LIZIZ());
            AbstractC156406Bw mBaseView = c156396Bv.getMBaseView();
            o.LJII(mBaseView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerInputView");
            AVChallenge aVChallenge = new AVChallenge();
            if (hashtagStruct != null) {
                aVChallenge.challengeName = hashtagStruct.getHashtagName();
            }
            AVSearchChallenge aVSearchChallenge = new AVSearchChallenge();
            aVSearchChallenge.challenge = aVChallenge;
            mBaseView.setCurModel(C42802Gr0.LIZ(aVSearchChallenge));
            mBaseView.LJIIJ();
            C6C5 mEditTextView = mBaseView.getMEditTextView();
            mEditTextView.setMode(true);
            C1DH.LJJIJL(mEditTextView, false);
        }
        View view = c156396Bv.LJLJL;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).removeAllViews();
        View view2 = c156396Bv.LJLJL;
        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(c156396Bv.getMBaseView());
        this.LJLL.setVisibility(4);
        C156426By mStickerView = this.LJLL;
        o.LJIIIIZZ(mStickerView, "mStickerView");
        return mStickerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156346Bq(VideoPublishEditModel model, C82622Wbi diContainer) {
        super(model, diContainer);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLIIIL = diContainer;
        this.LLIIIZ = "";
        this.LLIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 51));
    }

    @Override // X.InterfaceC156326Bo
    public final void LIZ(AbstractC156406Bw<C42802Gr0> view, boolean z) {
        boolean z2;
        String str;
        C6BO c6bo;
        AVChallenge aVChallenge;
        o.LJIIIZ(view, "view");
        String content = view.getContent();
        if (content == null || content.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C6BO c6bo2 = this.LJLLILLLL;
            if (c6bo2 != null) {
                c6bo2.LJII();
            }
            LJJII();
            this.LJLL = this.LLIIIJ;
            this.LLIIIJ = null;
            return;
        }
        view.setInEditMode(false);
        C42802Gr0 curModel = view.getCurModel();
        C145995oB c145995oB = new C145995oB();
        if (curModel == null || (aVChallenge = curModel.LIZ) == null || (str = aVChallenge.challengeName) == null) {
            str = "";
        }
        c145995oB.LJI("tag_name", str);
        c145995oB.LIZ(z ? 1 : 0, "auto_tag");
        c145995oB.LJI("creation_id", this.LLI.getCreationId());
        FMX.LJIIL("add_tag_prop", c145995oB.LIZ);
        if (this.LJLL == null) {
            if (z && (c6bo = this.LJLLILLLL) != null) {
                c6bo.LJI();
            }
            LIZLLL(false);
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
            FrameLayout mStickerParentLayout = this.LJLIL;
            o.LJIIIIZZ(mStickerParentLayout, "mStickerParentLayout");
            ((C156396Bv) c156426By).LJJI(mStickerParentLayout, view);
        } else {
            C6BO c6bo3 = this.LJLLILLLL;
            if (c6bo3 != null) {
                c6bo3.LJII();
            }
        }
        C156426By c156426By2 = this.LJLL;
        if (c156426By2 instanceof C156376Bt) {
            o.LJII(c156426By2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerView");
            ((C156396Bv) c156426By2).LJJ(view, z);
            this.LJLL.post(new ARunnableS38S0100000_2(this, 19));
        }
        this.LLIIIJ = null;
        LJJJI(getInteractStickerStruct());
    }
}
