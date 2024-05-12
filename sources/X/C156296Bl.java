package X;

import Y.ARunnableS13S0300000_2;
import Y.AgS72S0300000_2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156296Bl extends AbstractC156246Bg<C42802Gr0, C63H> implements C63H {
    public static final C156336Bp LJLLILLLL = new Object() { // from class: X.6Bp
    };
    public final WMH LJLLI;

    public C63H LJJLJ() {
        return this;
    }

    @Override // X.AbstractC156246Bg, X.C6BV, X.C63I
    public void show() {
        if (this.LJLLI.isAdded(LJJLIIIIJ())) {
            return;
        }
        this.LJLLI.add(R.id.l5i, LJJLIIIIJ(), "EditHashTagStickerComponent");
    }

    @Override // X.C63H
    public void Dn0() {
        C6BU<C42802Gr0> LJJLIIIIJ = LJJLIIIIJ();
        if (!(LJJLIIIIJ instanceof C6BZ) || LJJLIIIIJ == null || !H7R.LJJLIIIJJIZ(LJJLIIIIJ.LLJJIJI()) || LJJLIIIIJ.LLJJIJI().mIsFromDraft || LJJLIIIIJ.LLJJIJI().isFromCrash() || LJJLIIIIJ.LLJJIJI().creativeModel.searchCreateModel.getHashTags().isEmpty()) {
            return;
        }
        LJJLIIIIJ.LJLJJLL.LJJIJIIJI(LJJLIIIIJ.getEditPreviewApi().Kh().getValue(), LJJLIIIIJ.getEditPreviewApi());
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp(-1);
        normalTrackTimeStamp.setX(0.1066f);
        normalTrackTimeStamp.setY(0.7992f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(normalTrackTimeStamp);
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(9);
        HashtagStruct hashtagStruct = new HashtagStruct();
        String str = (String) ORZ.LJLLLL(LJJLIIIIJ.LLJJIJI().creativeModel.searchCreateModel.getHashTags());
        if (str == null) {
            str = "";
        }
        hashtagStruct.setHashtagName(str);
        interactStickerStruct.setHashtagInfo(hashtagStruct);
        interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), arrayList));
        LJJLIIIIJ.LLJILJIL();
        AbstractC156286Bk<C42802Gr0> abstractC156286Bk = LJJLIIIIJ.LJLJJLL;
        o.LJII(abstractC156286Bk, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerController");
        C156346Bq c156346Bq = (C156346Bq) abstractC156286Bk;
        c156346Bq.LLII = "search_hashtag";
        C156426By LJJJJI = c156346Bq.LJJJJI(interactStickerStruct.getHashtagInfo());
        LJJJJI.postDelayed(new ARunnableS13S0300000_2(LJJJJI, c156346Bq, interactStickerStruct, 5), 300L);
    }

    @Override // X.C63H
    public void Ob0() {
        Mission mission;
        List<String> challengeNames;
        String str;
        C6BU<C42802Gr0> LJJLIIIIJ = LJJLIIIIJ();
        String str2 = null;
        if (!(LJJLIIIIJ instanceof C6BZ) || LJJLIIIIJ == null || LJJLIIIIJ.LLJJIJI().mIsFromDraft || (mission = LJJLIIIIJ.LLJJIJI().creativeModel.commerceModel.getMission()) == null || !mission.getEnableHashtagSticker() || (challengeNames = mission.getChallengeNames()) == null || challengeNames.isEmpty()) {
            return;
        }
        LJJLIIIIJ.LJLJJLL.LJJIJIIJI(LJJLIIIIJ.getEditPreviewApi().Kh().getValue(), LJJLIIIIJ.getEditPreviewApi());
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp(-1);
        normalTrackTimeStamp.setHeight(0.1f);
        normalTrackTimeStamp.setRotation(0.3f);
        normalTrackTimeStamp.setWidth(0.4f);
        normalTrackTimeStamp.setX(0.5f);
        normalTrackTimeStamp.setY(0.8436f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(normalTrackTimeStamp);
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(9);
        HashtagStruct hashtagStruct = new HashtagStruct();
        List<String> challengeNames2 = mission.getChallengeNames();
        if (challengeNames2 != null) {
            str = (String) ListProtector.get(challengeNames2, 0);
        } else {
            str = null;
        }
        hashtagStruct.setHashtagName(str);
        interactStickerStruct.setHashtagInfo(hashtagStruct);
        interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(new Gson(), arrayList));
        LJJLIIIIJ.LLJILJIL();
        AbstractC156286Bk<C42802Gr0> abstractC156286Bk = LJJLIIIIJ.LJLJJLL;
        o.LJII(abstractC156286Bk, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerController");
        C156346Bq c156346Bq = (C156346Bq) abstractC156286Bk;
        List<String> challengeNames3 = mission.getChallengeNames();
        if (challengeNames3 != null) {
            str2 = (String) ListProtector.get(challengeNames3, 0);
        }
        c156346Bq.LLIIIZ = str2;
        c156346Bq.LLII = "mission_hashtag";
        C156426By LJJJJI = c156346Bq.LJJJJI(interactStickerStruct.getHashtagInfo());
        LJJJJI.postDelayed(new ARunnableS13S0300000_2(LJJJJI, c156346Bq, interactStickerStruct, 4), 300L);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LJJLJ();
        return this;
    }

    @Override // X.AbstractC156246Bg
    public C6BU<C42802Gr0> LJJLI(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        return new C6BU<C42802Gr0>(diContainer, this) { // from class: X.6BZ
            public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
            public final C82632Wbs LJZ;
            public final C62822Ol8 LJZI;

            static {
                TBT tbt = new TBT(C6BZ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
                C65352Pkq.LIZ.getClass();
                LJZL = new InterfaceC74236TBo[]{tbt};
            }

            @Override // X.C6BU
            public final int LLJJIII() {
                return 9;
            }

            @Override // X.C6BU
            public final void LLJILJIL() {
                AbstractC156286Bk<T> abstractC156286Bk = this.LJLJJLL;
                AbstractC156316Bn<T> abstractC156316Bn = (AbstractC156316Bn) this.LJZI.getValue();
                if (abstractC156286Bk.LLIIII != null) {
                    return;
                }
                abstractC156286Bk.LLIIII = abstractC156316Bn;
                if (abstractC156316Bn != 0) {
                    abstractC156316Bn.setVisibility(8);
                }
                AbstractC156316Bn<T> abstractC156316Bn2 = abstractC156286Bk.LLIIII;
                if (abstractC156316Bn2 == 0) {
                    return;
                }
                abstractC156316Bn2.setMEditingListener(abstractC156286Bk);
            }

            @Override // X.C6BU
            public final AbstractC156286Bk<C42802Gr0> LLJJ() {
                return new C156346Bq(LLJJIJI(), this.LJLIL);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(diContainer, this);
                o.LJIIIZ(diContainer, "diContainer");
                o.LJIIIZ(this, "baseSocialStickerApi");
                this.LJZ = UCI.LJI(this.LJLIL, VideoPublishEditModel.class, null);
                this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 381));
            }

            @Override // X.InterfaceC1547265k
            public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
                String LJFF;
                o.LJIIIZ(editor, "editor");
                o.LJIIIZ(compileCallback, "compileCallback");
                if (this.LJLJJLL.LJIILLIIL()) {
                    if (interfaceC88471Ynr == null || (LJFF = interfaceC88471Ynr.invoke("hashtag_sticker", EnumC43649HBd.HASHTAG_STICKER)) == null) {
                        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJZ.LIZ(this, LJZL[0]);
                        String LJIILL = this.LJLJJLL.LJIILL();
                        o.LJIIIIZZ(LJIILL, "stickerController.stickerPath");
                        LJFF = LIZIZ.LJFF(videoPublishEditModel, LJIILL, "");
                    }
                    C10K<C76800UCe> LJIILLIIL = LLJILJILJ(compileCallback.LJLLL().LIZLLL(), compileCallback.LJLLL().LJI(), editor.LLILZ().width, editor.LLILZ().height, LJFF).LJIILLIIL(new AgS72S0300000_2(editor, this, compileCallback, 1), C10K.LJIIIIZZ);
                    o.LJIIIIZZ(LJIILLIIL, "override fun getInteract…ult(Unit)\n        }\n    }");
                    return LJIILLIIL;
                }
                C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
                o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(Unit)\n        }");
                return LJIIIZ;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156296Bl(WMH parentScene, C82622Wbi oc) {
        super(parentScene, oc);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(oc, "oc");
        this.LJLLI = parentScene;
    }
}
