package X;

import Y.ARunnableS13S0300000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
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

/* renamed from: X.6Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156356Br extends AbstractC156286Bk<User> {
    public final C82622Wbi LLIIIL;
    public final C62822Ol8 LLIIIZ;

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 8;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63I) this.LLIIIZ.getValue()).LJIIIIZZ();
    }

    @Override // X.AbstractC156286Bk
    public final List<String> LJJIL() {
        String str;
        C156366Bs c156366Bs;
        MentionStruct mentionStruct;
        ArrayList arrayList = new ArrayList(((ArrayList) this.LJLLI).size());
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (!(c156426By instanceof C156366Bs) || (c156366Bs = (C156366Bs) c156426By) == null || (mentionStruct = c156366Bs.getMentionStruct()) == null || (str = mentionStruct.getUsername()) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static final String LJJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mtn_start");
        LIZ.append(UUID.randomUUID());
        LIZ.append("mtn_end");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6BL
    public final String LJIILL() {
        String stickerPath = super.LJIILL();
        o.LJIIIIZZ(stickerPath, "stickerPath");
        int LJJLIIIJL = s.LJJLIIIJL(stickerPath, "/effect/mention_stickers", 0, false, 6);
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
        C156366Bs c156366Bs = new C156366Bs(context);
        c156366Bs.LLIIL = diContainer;
        c156366Bs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c156366Bs;
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
        if (s.LJJJLZIJ(str, "mtn_start", false) && s.LJJJLZIJ(str, "mtn_end", false)) {
            this.LJLLLL = new OJD("mtn_start(.*?)mtn_end").replace(str, LJJJIL());
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
        C156366Bs c156366Bs;
        ArrayList arrayList = new ArrayList(((ArrayList) this.LJLLI).size());
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(8);
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
            if ((c156426By instanceof C156366Bs) && (c156366Bs = (C156366Bs) c156426By) != null) {
                interactStickerStruct.setMentionInfo(c156366Bs.getMentionStruct());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mention_sticker_id", this.LLII);
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
            this.LLII = (String) ((HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6C7
            }.getType())).get("mention_sticker_id");
            MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
            LIZLLL(true);
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            C156396Bv c156396Bv = (C156396Bv) c156426By;
            AbstractC156316Bn<T> abstractC156316Bn = this.LLIIII;
            if (c156396Bv.getMBaseView() == null && abstractC156316Bn != 0) {
                c156396Bv.setMBaseView(abstractC156316Bn.LIZIZ());
                AbstractC156406Bw mBaseView = c156396Bv.getMBaseView();
                o.LJII(mBaseView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerInputView");
                User user = new User();
                if (mentionInfo != null) {
                    String userId = mentionInfo.getUserId();
                    if (userId == null || userId.length() == 0) {
                        user.setNickname(C6CI.LJIIJJI(mentionInfo));
                    } else {
                        user.setUid(mentionInfo.getUserId());
                        user.setSecUid(mentionInfo.getSecUid());
                        user.setNickname(C6CI.LJIIJJI(mentionInfo));
                        user.setAvatarThumb(mentionInfo.getAvatarUrl());
                    }
                }
                mBaseView.setCurModel(user);
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
            mStickerView.postDelayed(new ARunnableS13S0300000_2(mStickerView, this, interactStickerStruct, 14), 300L);
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
        if ((c156426By instanceof C156366Bs) && (c156396Bv = (C156396Bv) c156426By) != null) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156356Br(VideoPublishEditModel model, C82622Wbi diContainer) {
        super(model, diContainer);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLIIIL = diContainer;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 671));
    }

    @Override // X.InterfaceC156326Bo
    public final void LIZ(AbstractC156406Bw<User> view, boolean z) {
        boolean z2;
        String str;
        o.LJIIIZ(view, "view");
        String content = view.getContent();
        if (content == null || content.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C6BO c6bo = this.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LJII();
            }
            LJJII();
            this.LJLL = this.LLIIIJ;
            this.LLIIIJ = null;
            return;
        }
        view.setInEditMode(false);
        User curModel = view.getCurModel();
        C145995oB c145995oB = new C145995oB();
        if (curModel == null || (str = curModel.getUid()) == null) {
            str = "";
        }
        c145995oB.LJI("to_user_id", str);
        c145995oB.LIZ(z ? 1 : 0, "auto_at");
        c145995oB.LJI("creation_id", this.LLI.getCreationId());
        FMX.LJIIL("add_at_prop", c145995oB.LIZ);
        if (this.LJLL == null) {
            LIZLLL(false);
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            FrameLayout mStickerParentLayout = this.LJLIL;
            o.LJIIIIZZ(mStickerParentLayout, "mStickerParentLayout");
            ((C156396Bv) c156426By).LJJI(mStickerParentLayout, view);
        } else {
            C6BO c6bo2 = this.LJLLILLLL;
            if (c6bo2 != null) {
                c6bo2.LJII();
            }
        }
        C156426By c156426By2 = this.LJLL;
        if (c156426By2 instanceof C156366Bs) {
            o.LJII(c156426By2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            ((C156396Bv) c156426By2).LJJ(view, z);
            view.post(new ARunnableS38S0100000_2(this, 131));
        }
        this.LLIIIJ = null;
        LJJJI(getInteractStickerStruct());
    }
}
