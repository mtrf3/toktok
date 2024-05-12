package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6N6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N6 extends AbstractC29891Fh<InterfaceC148865so> implements InterfaceC148865so, InterfaceC135635Tz {
    public static final C6ND LJZI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final ActivityC45651qj LJLJLLL;
    public NLENode LJLL;
    public final C5H3 LJLLI;
    public final C6N6 LJLLILLLL;
    public final C29901Fi<C76800UCe> LJLLJ;
    public final LiveEvent<C76800UCe> LJLLL;
    public final C29901Fi<C76800UCe> LJLLLL;
    public final LiveEvent<C76800UCe> LJLLLLLL;
    public final C29901Fi<C76800UCe> LJLZ;
    public final LiveEvent<C76800UCe> LJZ;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.6ND] */
    static {
        TBT tbt = new TBT(C6N6.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C65352Pkq.LIZ.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt, new TBT(C6N6.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C6N6.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new TBT(C6N6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new TBT(C6N6.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/BaseEditStickerApi;", 0), new TBT(C6N6.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new TBT(C6N6.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0)};
        LJZI = new Object() { // from class: X.6ND
        };
    }

    private final InterfaceC150685vk LJJLIIIJILLIZJL() {
        return (InterfaceC150685vk) this.LJLJLJ.LIZ(this, LJZL[6]);
    }

    private final InterfaceC145815nt LJJLIIJ() {
        return (InterfaceC145815nt) this.LJLJL.LIZ(this, LJZL[5]);
    }

    public final C6N7 LJJLIIIJJI() {
        return (C6N7) this.LJLLI.getValue();
    }

    public final C6NA LJJLIIIJJIZ() {
        return (C6NA) this.LJLJJI.LIZ(this, LJZL[2]);
    }

    public final VideoPublishEditModel LJJLIIIJLLLLLLLZ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJZL[1]);
    }

    public final InterfaceC140385f8 LJJLJ() {
        return (InterfaceC140385f8) this.LJLJJLL.LIZ(this, LJZL[4]);
    }

    public final AbstractC42651GoZ LJJLJLI() {
        return (AbstractC42651GoZ) this.LJLILLLLZI.LIZ(this, LJZL[0]);
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJJL.LIZ(this, LJZL[3]);
    }

    private final boolean LJJLL() {
        if (LJJLIIIJLLLLLLLZ().getOriginal() == 0 && !LJJLIIIJLLLLLLLZ().isTemplateMv() && !C44384HbQ.LLJI(LJJLIIIJLLLLLLLZ())) {
            return true;
        }
        return false;
    }

    private final boolean LJJZZI() {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null) {
            C133765Mu c133765Mu = (C133765Mu) value;
            if (this.LJLL != null) {
                return !r1.unorderEquals(c133765Mu.LJFF());
            }
            o.LJIJI("originalNleNode");
            throw null;
        }
        return false;
    }

    private final boolean LJJZZIII() {
        int i;
        if (LJJLIIIJLLLLLLLZ().getOriginal() == 0 || LJJLIIIJLLLLLLLZ().getOriginal() == 2) {
            if (!D1()) {
                LJJLI();
                return true;
            }
            LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 358));
            return true;
        }
        boolean z = false;
        if (C44384HbQ.LJLLILLLL(LJJLIIIJLLLLLLLZ()) || C44384HbQ.LJZI(LJJLIIIJLLLLLLLZ())) {
            if (D1()) {
                LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 359));
                return true;
            }
            if (e1.LIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
                LJJLI();
                return true;
            }
            C6N7 LJJLIIIJJI = LJJLIIIJJI();
            if (C44384HbQ.LJZI(LJJLIIIJLLLLLLLZ())) {
                i = R.string.jlb;
            } else {
                i = R.string.e39;
            }
            LJJLIIIJJI.LJI(i, R.raw.icon_arrow_turn_left, C6NI.LJLIL, false);
            return true;
        }
        if (LJJLIIIJLLLLLLLZ().getOriginal() == 1 && LJJLIIIJLLLLLLLZ().recordMode == 0 && !D1()) {
            boolean LJI = C124934vJ.LJI(Ll0().r9());
            C6N7 LJJLIIIJJI2 = LJJLIIIJJI();
            if (C140435fD.LIZ(LJJLIIIJLLLLLLLZ()) && !LJI) {
                z = true;
            }
            LJJLIIIJJI2.LJI(R.string.e33, R.raw.icon_camera, new AqS152S0100000_2(this, 360), z);
            return true;
        }
        if (LJJLIIIJLLLLLLLZ().getOriginal() != 1 || LJJLIIIJLLLLLLLZ().recordMode != 0 || !D1()) {
            return false;
        }
        boolean LJI2 = C124934vJ.LJI(Ll0().r9());
        if (C140435fD.LIZ(LJJLIIIJLLLLLLLZ()) && !LJI2) {
            C141515gx.LIZIZ(LJJLIIIJLLLLLLLZ(), Ll0().r9(), this.LJLJLLL, new AqS152S0100000_2(this, 361));
            return true;
        }
        C135145Sc.LIZJ();
        LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 362));
        return true;
    }

    private final boolean LJLIIL() {
        if (!D1()) {
            if (LJJLIIIJLLLLLLLZ().getOriginal() == 1) {
                H78.LIZ("EditExitComponent -> tap draft to publish ->  back to record page");
                LJLJLJ();
            } else {
                H78.LIZ("EditExitComponent -> tap draft to publish -> back to draft page");
                LJJLI();
            }
            return true;
        }
        LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 363));
        return true;
    }

    private final boolean LJLJJL() {
        if (LJJLIIIJLLLLLLLZ().isTemplateMv() || LJJLL()) {
            LJJLIIIJJI().LJ(R.raw.icon_trash_bin, R.string.e32, new AqS152S0100000_2(this, 364));
            return true;
        }
        if (LJJLIIIJLLLLLLLZ().isDuet()) {
            LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 365));
            return true;
        }
        if (C44384HbQ.LLJI(LJJLIIIJLLLLLLLZ())) {
            if (D1()) {
                LJJLIIIJJI().LJ(R.raw.icon_trash_bin, R.string.e32, new AqS152S0100000_2(this, 366));
            } else {
                LJJLIIIIJ();
            }
            return true;
        }
        if (C44384HbQ.LJLLILLLL(LJJLIIIJLLLLLLLZ()) || C44384HbQ.LJZI(LJJLIIIJLLLLLLLZ())) {
            if (D1()) {
                LJJLIIIJJI().LJ(R.raw.icon_trash_bin, R.string.e32, new AqS152S0100000_2(this, 367));
            } else {
                LJLJLJ();
            }
            return true;
        }
        if ((LJJLIIIJLLLLLLLZ().getOriginal() == 1 || LJJLIIIJLLLLLLLZ().getOriginal() == 2) && LJJLIIIJLLLLLLLZ().recordMode == 0) {
            if (D1()) {
                LJJLIIIJJI().LJ(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 368));
            } else {
                LJLJLJ();
            }
            return true;
        }
        return false;
    }

    private final void LJLJJLL() {
        C6NJ c6nj;
        C6NJ c6nj2;
        C6N7 LJJLIIIJJI = LJJLIIIJJI();
        AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 369);
        LJJLIIIJJI.getClass();
        C6NJ c6nj3 = LJJLIIIJJI.LJIIJ;
        if (c6nj3 != null && c6nj3.LIZIZ() && (c6nj2 = LJJLIIIJJI.LJIIJ) != null) {
            c6nj2.LIZ();
        }
        LJJLIIIJJI.LJII.clear();
        ArrayList<C6NK> arrayList = LJJLIIIJJI.LJII;
        int i = LJJLIIIJJI.LJI;
        arrayList.add(new C6NK(R.raw.icon_trash_bin, R.string.e32, i, i, new AqS152S0100000_2(aqS152S0100000_2, 374), 176));
        View view = LJJLIIIJJI.LIZIZ;
        if (view != null) {
            c6nj = new C6NJ(view, LJJLIIIJJI.LJII, LJJLIIIJJI.LJIIIZ);
        } else {
            c6nj = null;
        }
        LJJLIIIJJI.LJIIJ = c6nj;
        if (c6nj != null) {
            c6nj.LIZJ();
        }
    }

    @Override // X.InterfaceC148865so
    public boolean D1() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditExitComponent -> hasEdited() -> hasStickers = ");
        C6NA LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            z = LJJLIIIJJIZ.LLZZ();
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", nleHasEdited() = ");
        LIZ.append(LJJZZI());
        H78.LIZ(X1D.LIZIZ(LIZ));
        C6NA LJJLIIIJJIZ2 = LJJLIIIJJIZ();
        if ((LJJLIIIJJIZ2 == null || !LJJLIIIJJIZ2.LLZZ()) && !LJJZZI()) {
            return false;
        }
        return true;
    }

    public final void LJJLI() {
        InterfaceC150685vk LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.JZ();
        }
        LJJLIIIJJI().LIZ(false);
    }

    public final void LJJLIIIIJ() {
        InterfaceC150685vk LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.JZ();
        }
        LJJLIIIJJI().LIZIZ();
    }

    public final void LJLJLJ() {
        if (C60903NvH.LJIIJJI().LJJIII().shouldDisable10MinDraftRecord(LJJLIIIJLLLLLLLZ())) {
            C5S1 c5s1 = new C5S1(this.LJLJLLL);
            c5s1.LIZJ(R.string.b91);
            c5s1.LJ();
        } else {
            C149905uU.LIZLLL(LJJLIIIJLLLLLLLZ());
            Ll0().dq0();
            InterfaceC150685vk LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.JZ();
            }
        }
    }

    public final void LJLLILLLL() {
        int i;
        ArrayList<TimeSpeedModelExtension> arrayList;
        List<TextStickerData> YU;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null) {
            i = value.getDuration();
        } else {
            i = 0;
        }
        NLEModel r9 = Ll0().r9();
        if (r9 != null) {
            ArrayList arrayList2 = new ArrayList();
            InterfaceC139655dx LIZ = ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).mu().LIZ();
            if (LIZ != null && (YU = LIZ.YU()) != null) {
                Iterator<TextStickerData> it = YU.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            VideoPublishEditModel model = LJJLIIIJLLLLLLLZ();
            o.LJIIIZ(model, "model");
            C135145Sc.LIZJ();
            String creationId = model.getCreationId();
            o.LJIIIIZZ(creationId, "model.creationId");
            C135145Sc.LIZ = creationId;
            ArrayList arrayList3 = (ArrayList) C135145Sc.LIZIZ;
            arrayList3.clear();
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.4zO
                public final ArrayList<StickerItemModel> LIZ = new ArrayList<>();
                public final ArrayList<NLETrack> LIZIZ = new ArrayList<>();
                public long LIZJ;

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    this.LIZIZ.clear();
                    this.LIZ.clear();
                    this.LIZJ = 0L;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return EnumC123864ta.STICKER;
                }

                public final NLETrackSlot LIZ(String str) {
                    ArrayList<NLETrack> arrayList4 = this.LIZIZ;
                    if (arrayList4 != null) {
                        Iterator<NLETrack> it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Iterator<NLETrackSlot> it3 = it2.next().LJIILL().iterator();
                            while (it3.hasNext()) {
                                NLETrackSlot next = it3.next();
                                if (o.LJ(next.getUUID(), str)) {
                                    return next;
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                    Iterator<NLETrack> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        nLEEditor.LJ().addTrack(it2.next());
                    }
                    this.LIZIZ.clear();
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                    Iterator<StickerItemModel> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        addSticker.invoke(it2.next());
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    if (o.LJ(nLETrack.getExtra("StickerTrackType"), "INFO") || o.LJ(nLETrack.getExtra("StickerTrackType"), "IMAGE")) {
                        this.LIZIZ.add(NLETrack.LJFF(nLETrack.deepClone()));
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    List<StickerItemModel> list;
                    String str;
                    o.LJIIIZ(model2, "model");
                    Iterator<StickerItemModel> it2 = this.LIZ.iterator();
                    o.LJIIIIZZ(it2, "stickers.iterator()");
                    while (it2.hasNext()) {
                        StickerItemModel next = it2.next();
                        o.LJIIIIZZ(next, "iterator.next()");
                        StickerItemModel stickerItemModel = next;
                        if (stickerItemModel.isPin) {
                            stickerItemModel.isPin = false;
                        }
                        long j = i2;
                        if (stickerItemModel.startTime * 1000 >= j) {
                            it2.remove();
                            String str2 = stickerItemModel.uuid;
                            o.LJIIIIZZ(str2, "it.uuid");
                            Iterator<NLETrack> it3 = this.LIZIZ.iterator();
                            o.LJIIIIZZ(it3, "stickerTracks.iterator()");
                            while (it3.hasNext()) {
                                NLETrack next2 = it3.next();
                                o.LJIIIIZZ(next2, "iterator.next()");
                                NLENode nLENode = (NLENode) ORZ.LJLLLL(next2.LJIILL());
                                if (nLENode != null) {
                                    str = nLENode.getUUID();
                                } else {
                                    str = null;
                                }
                                if (o.LJ(str, str2)) {
                                    it3.remove();
                                }
                            }
                        } else {
                            long j2 = stickerItemModel.endTime * 1000;
                            if (j2 > j || (Math.abs(j2 - this.LIZJ) < 1000000 && stickerItemModel.startTime == 0)) {
                                int i3 = i2 / 1000;
                                stickerItemModel.endTime = i3;
                                stickerItemModel.uiEndTime = i3;
                                String str3 = stickerItemModel.uuid;
                                o.LJIIIIZZ(str3, "it.uuid");
                                NLETrackSlot LIZ2 = LIZ(str3);
                                if (LIZ2 != null) {
                                    LIZ2.setEndTime(j);
                                }
                            }
                        }
                        String str4 = stickerItemModel.uuid;
                        o.LJIIIIZZ(str4, "it.uuid");
                        NLETrackSlot LIZ3 = LIZ(str4);
                        if (LIZ3 != null) {
                            LIZ3.LJIILIIL(null);
                        }
                    }
                    if (!this.LIZ.isEmpty()) {
                        if (model2.infoStickerModel == null) {
                            model2.infoStickerModel = new InfoStickerModel();
                        }
                        InfoStickerModel infoStickerModel = model2.infoStickerModel;
                        if (infoStickerModel.stickers == null) {
                            infoStickerModel.stickers = new ArrayList();
                        }
                        Iterator<StickerItemModel> it4 = this.LIZ.iterator();
                        while (it4.hasNext()) {
                            StickerItemModel next3 = it4.next();
                            if (next3.endTime > i2) {
                                next3.endTime = i2;
                            }
                        }
                        InfoStickerModel infoStickerModel2 = model2.infoStickerModel;
                        if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
                            list.addAll(this.LIZ);
                        }
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                    List<StickerItemModel> list2;
                    this.LIZJ = i2 * 1000;
                    InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                    if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
                        ArrayList<StickerItemModel> arrayList4 = this.LIZ;
                        ArrayList arrayList5 = new ArrayList();
                        for (StickerItemModel stickerItemModel : list2) {
                            int i3 = stickerItemModel.type;
                            if (i3 == 0 || i3 == 11 || i3 == 10) {
                                arrayList5.add(stickerItemModel);
                            }
                        }
                        arrayList4.addAll(arrayList5);
                    }
                }
            });
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.4zM
                public final List<NLETrack> LIZ = new ArrayList();

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    o.LJIIIZ(model2, "model");
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    ((ArrayList) this.LIZ).clear();
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return EnumC123864ta.AUDIO;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                    String str;
                    Iterator it2 = ((ArrayList) this.LIZ).iterator();
                    while (it2.hasNext()) {
                        NLETrack nLETrack = (NLETrack) it2.next();
                        NLENode nLENode = (NLENode) ORZ.LJLLLL(nLETrack.LJIILL());
                        if (nLENode == null || (str = nLENode.getUUID()) == null) {
                            str = "";
                        }
                        Iterator it3 = ((ArrayList) C135145Sc.LIZIZ).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                InterfaceC135135Sb interfaceC135135Sb = (InterfaceC135135Sb) it3.next();
                                if (interfaceC135135Sb.LJZL() != null) {
                                    List<TextStickerData> LJZL2 = interfaceC135135Sb.LJZL();
                                    if (LJZL2 != null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        for (TextStickerData textStickerData : LJZL2) {
                                            if (o.LJ(textStickerData.getNleUuid(), str)) {
                                                arrayList4.add(textStickerData);
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            nLEEditor.LJ().addTrack(nLETrack);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.TEXT_SPEAK.name())) {
                        List<NLETrack> list = this.LIZ;
                        NLETrack LJFF = NLETrack.LJFF(nLETrack.deepClone());
                        o.LJIIIIZZ(LJFF, "dynamicCast(track.deepClone())");
                        ((ArrayList) list).add(LJFF);
                    }
                }
            });
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.5Zz
                public final ArrayList<TextStickerData> LIZ = new ArrayList<>();
                public final List<AVChallenge> LIZIZ = new LinkedList();

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    this.LIZ.clear();
                    ((LinkedList) this.LIZIZ).clear();
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                    Iterator<TextStickerData> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        addSticker.invoke(it2.next());
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    o.LJIIIZ(model2, "model");
                    Iterator<TextStickerData> it2 = this.LIZ.iterator();
                    o.LJIIIIZZ(it2, "textStickerData.iterator()");
                    String str = null;
                    if (!this.LIZ.isEmpty()) {
                        TTSVoiceModel ttsVoiceModel = model2.getTtsVoiceModel();
                        if (ttsVoiceModel != null) {
                            str = ttsVoiceModel.getEffectId();
                        }
                        if (C78685UuP.LJJJZ(str)) {
                            model2.autoAddTTSStickerOnce();
                        }
                    }
                    while (it2.hasNext()) {
                        TextStickerData next = it2.next();
                        o.LJIIIIZZ(next, "iterator.next()");
                        TextStickerData textStickerData = next;
                        long j = i2;
                        if (textStickerData.getStartTime() * 1000 >= j) {
                            it2.remove();
                            for (String challengeId : textStickerData.getTtsHashTagIds()) {
                                o.LJIIIZ(challengeId, "challengeId");
                                Iterator<AVChallenge> it3 = this.LIZIZ.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        AVChallenge next2 = it3.next();
                                        if (o.LJ(next2.cid, challengeId)) {
                                            if (next2 != null) {
                                                ((LinkedList) this.LIZIZ).remove(next2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (textStickerData.getEndTime() * 1000 > j || (C42000Ge4.LJIILIIL(model2) && textStickerData.getEndTime() == 0)) {
                            textStickerData.setEndTime(i2 / 1000);
                        }
                    }
                    for (AVChallenge aVChallenge : this.LIZIZ) {
                        TextStickerChallenges textStickerChallenges = model2.getTextStickerChallenges();
                        if (textStickerChallenges != null) {
                            textStickerChallenges.addReadTextChallenge(aVChallenge);
                        }
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        TextStickerData textStickerData = (TextStickerData) it2.next();
                        if (o.LJ(textStickerData.getType(), "type_text_sticker")) {
                            if (textStickerData.getEndTime() == i2 && textStickerData.getStartTime() == 0) {
                                textStickerData.setEndTime(0);
                            }
                            this.LIZ.add(textStickerData.m110clone());
                        }
                    }
                    TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
                    if (textStickerChallenges != null) {
                        Iterator<AVChallenge> it3 = textStickerChallenges.getReadTextChallenges().iterator();
                        while (it3.hasNext()) {
                            ((LinkedList) this.LIZIZ).add(it3.next());
                        }
                    }
                }
            });
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.4zL
                public final List<NLETrack> LIZ = new ArrayList();
                public MusicBuzModel LIZIZ;
                public Float LIZJ;
                public boolean LIZLLL;
                public long LJ;

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    ((ArrayList) this.LIZ).clear();
                    this.LIZIZ = null;
                    this.LIZLLL = false;
                    this.LJ = 0L;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    if (this.LIZIZ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    if (this.LIZIZ != null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return EnumC123864ta.AUDIO;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                    Iterator it2 = ((ArrayList) this.LIZ).iterator();
                    while (it2.hasNext()) {
                        nLEEditor.LJ().addTrack((NLETrack) it2.next());
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    NLETrackSlot nLETrackSlot;
                    if (this.LIZIZ != null && o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        List<NLETrack> list = this.LIZ;
                        NLETrack LJFF = NLETrack.LJFF(nLETrack.deepClone());
                        o.LJIIIIZZ(LJFF, "dynamicCast(track.deepClone())");
                        ((ArrayList) list).add(LJFF);
                        NLETrack nLETrack2 = (NLETrack) ORZ.LJLLLL(this.LIZ);
                        if (nLETrack2 == null || (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILL())) == null || nLETrackSlot.LJI() == null) {
                            return;
                        }
                        NLEResourceAV LJ = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI()).LJ();
                        if (LJ != null) {
                            LJ.getDuration();
                        }
                        if (nLETrackSlot.getStartTime() != 0) {
                            return;
                        }
                        if (nLETrackSlot.getEndTime() != this.LJ && nLETrackSlot.getEndTime() != -2) {
                            return;
                        }
                        this.LIZLLL = true;
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    NLETrackSlot nLETrackSlot;
                    long j;
                    o.LJIIIZ(model2, "model");
                    if (model2.creativeModel.musicBuzModel.isUseMusicBeforeEdit) {
                        LL();
                        return;
                    }
                    MusicBuzModel musicBuzModel = this.LIZIZ;
                    if (musicBuzModel != null) {
                        NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(this.LIZ);
                        if (nLETrack != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) != null) {
                            if (this.LIZLLL) {
                                nLETrackSlot.setEndTime(-2L);
                                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                                if (LIZLLL != null) {
                                    LIZLLL.LJIJJ(LIZLLL.LJIILIIL() + i2);
                                    long LJIIL = LIZLLL.LJIIL();
                                    NLEResourceAV LJ = LIZLLL.LJ();
                                    long j2 = 0;
                                    if (LJ != null) {
                                        j = LJ.getDuration();
                                    } else {
                                        j = 0;
                                    }
                                    if (LJIIL > j) {
                                        NLEResourceAV LJ2 = LIZLLL.LJ();
                                        if (LJ2 != null) {
                                            j2 = LJ2.getDuration();
                                        }
                                        LIZLLL.LJIJJ(j2);
                                        nLETrackSlot.setEndTime((LIZLLL.LJIIL() - LIZLLL.LJIILIIL()) + nLETrackSlot.getStartTime());
                                    }
                                    musicBuzModel.musicEnd = (int) (LIZLLL.LJIIL() / 1000);
                                }
                            } else {
                                long j3 = i2;
                                if (j3 < this.LJ) {
                                    nLETrackSlot.setEndTime(j3);
                                }
                                if (nLETrackSlot.getStartTime() >= j3) {
                                    LL();
                                    return;
                                } else {
                                    CreativeModel creativeModel = model2.creativeModel;
                                    creativeModel.getClass();
                                    creativeModel.musicBuzModel = musicBuzModel;
                                }
                            }
                        }
                        CreativeModel creativeModel2 = model2.creativeModel;
                        creativeModel2.getClass();
                        creativeModel2.musicBuzModel = musicBuzModel;
                    }
                    Float f = this.LIZJ;
                    if (f != null) {
                        model2.musicVolume = f.floatValue();
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                    if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel) != null) {
                        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                        if (!musicBuzModel.isUseMusicBeforeEdit && !C78685UuP.LJJJZ(musicBuzModel.stsTemplateId)) {
                            this.LIZIZ = (MusicBuzModel) C78946Uyc.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel);
                            this.LIZJ = Float.valueOf(videoPublishEditModel.musicVolume);
                            this.LJ = i2 * 1000;
                        }
                    }
                }
            });
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.4zN
                public final List<NLETrack> LIZ = new ArrayList();
                public final List<EffectPointModel> LIZIZ = new ArrayList();
                public long LIZJ;

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    ((ArrayList) this.LIZ).clear();
                    ((ArrayList) this.LIZIZ).clear();
                    this.LIZJ = 0L;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    return !this.LIZIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return EnumC123864ta.EFFECT;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                    Iterator it2 = ((ArrayList) this.LIZ).iterator();
                    while (it2.hasNext()) {
                        nLEEditor.LJ().addTrack((NLETrack) it2.next());
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                    if (!((ArrayList) this.LIZIZ).isEmpty()) {
                        addEffect.invoke(this.LIZIZ);
                    }
                    LL();
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    List<NLETrack> list = this.LIZ;
                    NLETrack LJFF = NLETrack.LJFF(nLETrack.deepClone());
                    o.LJIIIIZZ(LJFF, "dynamicCast(track.deepClone())");
                    ((ArrayList) list).add(LJFF);
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    List<NLETrack> list;
                    o.LJIIIZ(model2, "model");
                    Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                    while (it2.hasNext()) {
                        EffectPointModel effectPointModel = (EffectPointModel) it2.next();
                        long j = i2;
                        if (effectPointModel.getStartPoint() * 1000 >= j) {
                            it2.remove();
                            String uuid = effectPointModel.getUuid();
                            if (uuid != null) {
                                Iterator it3 = ((ArrayList) this.LIZ).iterator();
                                while (it3.hasNext()) {
                                    NLETrack nLETrack = (NLETrack) it3.next();
                                    Iterator<NLETrackSlot> it4 = nLETrack.LJIILL().iterator();
                                    o.LJIIIIZZ(it4, "slots.iterator()");
                                    while (it4.hasNext()) {
                                        NLETrackSlot next = it4.next();
                                        if (o.LJ(next.getUUID(), uuid)) {
                                            nLETrack.LJIJJLI(next);
                                        }
                                    }
                                    if (nLETrack.LJIILL().isEmpty()) {
                                        it3.remove();
                                    }
                                }
                            }
                        } else if (effectPointModel.getEndPoint() * 1000 > j || (Math.abs((effectPointModel.getEndPoint() * 1000) - this.LIZJ) < 1000000 && effectPointModel.getStartPoint() == 0)) {
                            int i3 = i2 / 1000;
                            effectPointModel.setEndPoint(i3);
                            effectPointModel.setUiEndPoint(i3);
                            String uuid2 = effectPointModel.getUuid();
                            if (uuid2 != null && (list = this.LIZ) != null) {
                                Iterator it5 = ((ArrayList) list).iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        Iterator<NLETrackSlot> it6 = ((NLETrack) it5.next()).LJIILL().iterator();
                                        while (it6.hasNext()) {
                                            NLETrackSlot next2 = it6.next();
                                            if (o.LJ(next2.getUUID(), uuid2)) {
                                                next2.setEndTime(j);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    model2.getEffectList().addAll(this.LIZIZ);
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                    this.LIZJ = i2 * 1000;
                    ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
                    o.LJIIIIZZ(effectList, "model.effectList");
                    Iterator<EffectPointModel> it2 = effectList.iterator();
                    while (it2.hasNext()) {
                        EffectPointModel next = it2.next();
                        List<EffectPointModel> list2 = this.LIZIZ;
                        EffectPointModel m113clone = next.m113clone();
                        o.LJIIIIZZ(m113clone, "it.clone()");
                        ((ArrayList) list2).add(m113clone);
                    }
                }
            });
            arrayList3.add(new InterfaceC135135Sb() { // from class: X.4zK
                public String LIZIZ;
                public String LIZJ;
                public String LIZLLL;
                public final List<NLETrack> LIZ = new ArrayList();
                public float LJ = -1.0f;

                @Override // X.InterfaceC135135Sb
                public final List<TextStickerData> LJZL() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final EnumC123864ta LLD() {
                    return null;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFFF() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLFII() {
                    return false;
                }

                @Override // X.InterfaceC135135Sb
                public final void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC135135Sb
                public final void LL() {
                    ((ArrayList) this.LIZ).clear();
                    this.LIZIZ = null;
                }

                @Override // X.InterfaceC135135Sb
                public final boolean LLI() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFF(NLEEditor nLEEditor) {
                    Iterator it2 = ((ArrayList) this.LIZ).iterator();
                    while (it2.hasNext()) {
                        nLEEditor.LJ().addTrack((NLETrack) it2.next());
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> addSticker) {
                    o.LJIIIZ(addSticker, "addSticker");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> addEffect) {
                    o.LJIIIZ(addEffect, "addEffect");
                }

                @Override // X.InterfaceC135135Sb
                public final void LLIIIILZ(int i2, VideoPublishEditModel model2) {
                    o.LJIIIZ(model2, "model");
                    String str = this.LIZIZ;
                    if (str != null) {
                        model2.mSelectedFilterId = str;
                        model2.mSelectedFilterLabel = this.LIZJ;
                        model2.mSelectedFilterResId = this.LIZLLL;
                        model2.mSelectedFilterIntensity = this.LJ;
                    }
                }

                @Override // X.InterfaceC135135Sb
                public final void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i2) {
                    String str = videoPublishEditModel.mSelectedFilterId;
                    if (str != null) {
                        this.LIZIZ = str;
                        this.LIZJ = videoPublishEditModel.mSelectedFilterLabel;
                        this.LIZLLL = videoPublishEditModel.mSelectedFilterResId;
                        this.LJ = videoPublishEditModel.mSelectedFilterIntensity;
                    }
                    VecNLETrackSPtr tracks = nLEModel.getTracks();
                    ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        NLETrack next = it2.next();
                        NLETrack it3 = next;
                        o.LJIIIIZZ(it3, "it");
                        if (o.LJ(C77357UXp.LJIIZILJ(it3), EnumC121554pr.COLOR_NO_COMPOSER.name()) || o.LJ(C77357UXp.LJIIZILJ(it3), EnumC121534pp.COLOR.name())) {
                            LIZ2.add(next);
                        }
                    }
                    Iterator it4 = LIZ2.iterator();
                    while (it4.hasNext()) {
                        NLENode nLENode = (NLENode) it4.next();
                        List<NLETrack> list2 = this.LIZ;
                        NLETrack LJFF = NLETrack.LJFF(nLENode.deepClone());
                        o.LJIIIIZZ(LJFF, "dynamicCast(it.deepClone())");
                        ((ArrayList) list2).add(LJFF);
                    }
                }
            });
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && (arrayList = multiEditVideoStatusRecordData.originalSegments) != null) {
                Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String createId = it2.next().getCreateId();
                    if (createId != null) {
                        C135145Sc.LIZJ.add(createId);
                    }
                }
            }
            Iterator it3 = ((ArrayList) C135145Sc.LIZIZ).iterator();
            while (it3.hasNext()) {
                ((InterfaceC135135Sb) it3.next()).LLF(model, r9, arrayList2, i);
            }
            Iterator LIZJ = t1.LIZJ(r9, "nleModel.tracks");
            while (LIZJ.hasNext()) {
                NLETrack track = (NLETrack) LIZJ.next();
                List<InterfaceC135135Sb> list = C135145Sc.LIZIZ;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = ((ArrayList) list).iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    o.LJIIIIZZ(track, "track");
                    if (C78983UzD.LJJJJLI(track) == ((InterfaceC135135Sb) next).LLD()) {
                        arrayList4.add(next);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    InterfaceC135135Sb interfaceC135135Sb = (InterfaceC135135Sb) it5.next();
                    o.LJIIIIZZ(track, "track");
                    interfaceC135135Sb.LLII(track, model);
                }
            }
            InterfaceC139655dx LIZ2 = ((InterfaceC142515iZ) getDiContainer().LJ(InterfaceC142515iZ.class, null)).mu().LIZ();
            if (LIZ2 != null) {
                LIZ2.t8();
            }
        }
        this.LJLZ.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC148865so
    public void Vd0() {
        LJJLIIIJJI().LIZIZ();
    }

    @Override // X.InterfaceC148865so
    public void Zd() {
        NLEModel LJJ;
        NLENode deepClone;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null && (deepClone = LJJ.deepClone()) != null) {
            this.LJLL = deepClone;
        }
    }

    @Override // X.InterfaceC148865so
    public boolean jw() {
        C6NJ c6nj = LJJLIIIJJI().LJIIJ;
        if (c6nj != null && c6nj.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null) {
            NLENode deepClone = ((C133765Mu) value).LJFF().deepClone();
            o.LJIIIIZZ(deepClone, "it.nleModel.deepClone()");
            this.LJLL = deepClone;
        }
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> e2() {
        return this.LJLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC148865so getApiComponent() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> o70() {
        return this.LJZ;
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> ve0() {
        return this.LJLLLLLL;
    }

    public C6N6(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), C6NA.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC140385f8.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC145815nt.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC150685vk.class, null);
        this.LJLJLLL = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 356));
        this.LJLLILLLL = this;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLLJ = c29901Fi;
        this.LJLLL = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLLLL = c29901Fi2;
        this.LJLLLLLL = c29901Fi2;
        C29901Fi<C76800UCe> c29901Fi3 = new C29901Fi<>();
        this.LJLZ = c29901Fi3;
        this.LJZ = c29901Fi3;
    }

    @Override // X.InterfaceC148865so
    public boolean yV(View view) {
        o.LJIIIZ(view, "view");
        InterfaceC145815nt LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null) {
            LJJLIIJ.ap("quit edit page!");
        }
        if (TextUtils.equals(LJJLIIIJLLLLLLLZ().enterFrom, "effect_qr_scan")) {
            LJJLJLI().LLJLLL(0, null);
            LJJLJLI().LLJJI();
            return true;
        }
        C6NA LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && LJJLIIIJJIZ.w8()) {
            LJJLIIIJJIZ.y8();
            return false;
        }
        if (LJJLIIIJLLLLLLLZ().getOriginal() == 1 && LJJLIIIJLLLLLLLZ().recordMode == 1) {
            return false;
        }
        LJJLIIIJJI().LIZIZ = view;
        if (C79004UzY.LJJIZ(LJJLIIIJLLLLLLLZ().canvasVideoData) && LJJLIIIJLLLLLLLZ().creativeModel.forwardEditPublishData != null) {
            LJLJJLL();
            return true;
        }
        if (!LJJLIIIJLLLLLLLZ().mIsFromDraft || (LJJLIIIJLLLLLLLZ().mIsFromDraft && (LJJLIIIJLLLLLLLZ().draftFromShoot || LJJLIIIJLLLLLLLZ().isFromCrash()))) {
            boolean LJI = C124934vJ.LJI(Ll0().r9());
            if (C140435fD.LIZ(LJJLIIIJLLLLLLLZ()) && !LJI) {
                if (D1()) {
                    C141515gx.LIZIZ(LJJLIIIJLLLLLLLZ(), Ll0().r9(), this.LJLJLLL, new AqS152S0100000_2(this, 357));
                } else {
                    LJLLILLLL();
                    LJLJLJ();
                }
                return true;
            }
            C135145Sc.LIZJ();
            if (LJLJJL()) {
                return true;
            }
        }
        if (!C153255zt.LIZ() && LJLIIL()) {
            return true;
        }
        return LJJZZIII();
    }

    @Override // X.InterfaceC148865so
    public void Rd0(boolean z, String saveScene) {
        o.LJIIIZ(saveScene, "saveScene");
        LJJLIIIJJI().LIZLLL(z, saveScene);
    }
}
