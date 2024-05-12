package kotlin.jvm.internal;

import X.A90;
import X.AbstractC65781Prl;
import X.AnonymousClass519;
import X.C121914qR;
import X.C122034qd;
import X.C126844yO;
import X.C127594zb;
import X.C1301058s;
import X.C130535Aj;
import X.C131935Ft;
import X.C132005Ga;
import X.C132615Ij;
import X.C132815Jd;
import X.C133715Mp;
import X.C134215On;
import X.C137805ay;
import X.C138525c8;
import X.C139795eB;
import X.C141225gU;
import X.C145995oB;
import X.C147295qH;
import X.C1540162r;
import X.C1553267s;
import X.C1553767x;
import X.C1559169z;
import X.C158806Lc;
import X.C162716a3;
import X.C162756a7;
import X.C162776a9;
import X.C16880lQ;
import X.C172196pL;
import X.C172216pN;
import X.C29S;
import X.C2ND;
import X.C32151Nz;
import X.C36636EZk;
import X.C44701HgX;
import X.C44704Hga;
import X.C48841JEv;
import X.C5KW;
import X.C5P6;
import X.C5QW;
import X.C5V0;
import X.C5XB;
import X.C5XD;
import X.C64M;
import X.C64N;
import X.C64W;
import X.C67W;
import X.C68322mC;
import X.C6LY;
import X.C6QO;
import X.C6UV;
import X.C6UY;
import X.C6UZ;
import X.C6YK;
import X.C6ZI;
import X.C76800UCe;
import X.C78613UtF;
import X.C79057V0z;
import X.C82622Wbi;
import X.EnumC122254qz;
import X.EnumC124724uy;
import X.EnumC126814yL;
import X.EnumC132095Gj;
import X.EnumC157656Gr;
import X.FMX;
import X.H78;
import X.InterfaceC123794tT;
import X.InterfaceC133095Kf;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.SFS;
import X.V1B;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.util.ArrayMap;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import com.ss.android.ugc.gamora.editorpro.soundeffect.ui.SoundEffectFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS91S0300000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS91S0300000_2 aqS91S0300000_2) {
        try {
            ((C132615Ij) aqS91S0300000_2.l0).LJLIL.getNleSession().R8((NLEModel) aqS91S0300000_2.l1);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setDataSource::error = ");
            LIZ.append(e.getMessage());
            C131935Ft.LIZLLL("DefaultPlayer", X1D.LIZIZ(LIZ));
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS91S0300000_2.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object invoke$1(AqS91S0300000_2 aqS91S0300000_2) {
        if (((NLEEditor) aqS91S0300000_2.l1).LJ() != null) {
            ((C5KW) aqS91S0300000_2.l0).LJJIJIIJI((NLEEditor) aqS91S0300000_2.l1, (InterfaceC133095Kf) aqS91S0300000_2.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS91S0300000_2 aqS91S0300000_2) {
        ((EditorProScene) aqS91S0300000_2.l0).handleTextDurationEnterEPLogic();
        ((EditorProScene) aqS91S0300000_2.l0).getEditorContext().getPlayer().fa(((NLETrackSlot) aqS91S0300000_2.l1).getMeasuredStartTime(), (AnonymousClass519) aqS91S0300000_2.l2);
        C2ND.LIZ(new AqS149S0200000_2((EditorProScene) aqS91S0300000_2.l0, (NLETrackSlot) aqS91S0300000_2.l1, 58), 50L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS91S0300000_2 aqS91S0300000_2) {
        boolean z;
        String str;
        String str2;
        String extra;
        if (((Number) ((OSZ) aqS91S0300000_2.l0).getFirst()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        String id = V1B.LJJLIIIJLLLLLLLZ(((C141225gU) aqS91S0300000_2.l1).LJLIL);
        int intValue = ((Number) ((OSZ) aqS91S0300000_2.l0).getSecond()).intValue() + 1;
        SoundEffectTabModel soundEffectTabModel = (SoundEffectTabModel) ORZ.LJLLLLLL(((Number) ((OSZ) aqS91S0300000_2.l0).getFirst()).intValue(), ((SoundEffectFragment) aqS91S0300000_2.l2).LJZI);
        String str3 = "";
        if (soundEffectTabModel == null || (str = soundEffectTabModel.name) == null) {
            str = "";
        }
        VideoPublishEditModel em = ((SoundEffectFragment) aqS91S0300000_2.l2).em();
        EditorProContext Jl = ((SoundEffectFragment) aqS91S0300000_2.l2).Jl();
        o.LJIIIZ(id, "id");
        if (em != null && Jl != null) {
            C145995oB LJFF = C5QW.LJFF(em, Jl);
            LJFF.LJI("tab_name", str);
            LJFF.LIZ(intValue, "index");
            NLETrack LJIJI = C32151Nz.LJIJI(Jl);
            if (LJIJI != null && (extra = LJIJI.getExtra("slot_extra_music_id")) != null) {
                str3 = extra;
            }
            LJFF.LJI("music_id", str3);
            if (z) {
                str2 = "favorite";
            } else {
                str2 = "other";
            }
            LJFF.LJI("sound_effect_source", str2);
            LJFF.LJI("sound_effect_id", id);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("sound_effect_show", LJFF.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS91S0300000_2 aqS91S0300000_2) {
        ((C162776a9) aqS91S0300000_2.l0).LIZIZ();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C162716a3((C162756a7) aqS91S0300000_2.l1, (C68322mC) aqS91S0300000_2.l2, (C162776a9) aqS91S0300000_2.l0, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS91S0300000_2 aqS91S0300000_2) {
        int LIZ;
        ((StaticLayout) aqS91S0300000_2.l0).draw((Canvas) aqS91S0300000_2.l1);
        float width = ((StaticLayout) aqS91S0300000_2.l0).getWidth() + ((C67W) aqS91S0300000_2.l2).LJJ;
        float height = ((StaticLayout) aqS91S0300000_2.l0).getHeight();
        Paint paint = (Paint) ((C67W) aqS91S0300000_2.l2).LJJJJLI.getValue();
        if (C138525c8.LIZ()) {
            LIZ = C1553267s.LIZ(((C67W) aqS91S0300000_2.l2).LJJIIZI.getColor());
        } else {
            LIZ = C1553767x.LIZ(((C67W) aqS91S0300000_2.l2).LJJIIZI.getColor());
        }
        paint.setColor(LIZ);
        Canvas canvas = (Canvas) aqS91S0300000_2.l1;
        C67W c67w = (C67W) aqS91S0300000_2.l2;
        canvas.drawRect((-c67w.LJJ) / 2, 0.0f, width, height, (Paint) c67w.LJJJJLI.getValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS91S0300000_2 aqS91S0300000_2) {
        C67W c67w = (C67W) aqS91S0300000_2.l0;
        c67w.LJIL(new AqS91S0300000_2((Canvas) aqS91S0300000_2.l2, (StaticLayout) aqS91S0300000_2.l1, c67w, 13));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS91S0300000_2 aqS91S0300000_2) {
        C64M c64m = (C64M) aqS91S0300000_2.l0;
        C64N sticker = (C64N) aqS91S0300000_2.l1;
        C1559169z stickerEditLayout = (C1559169z) aqS91S0300000_2.l2;
        c64m.getClass();
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(stickerEditLayout, "stickerEditLayout");
        FrameLayout frameLayout = c64m.LIZ.LJLILLLLZI;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(stickerEditLayout, frameLayout);
            FrameLayout frameLayout2 = c64m.LIZ.LJLILLLLZI;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
                c64m.LIZ.getMStickerLayer().setVisibility(0);
                return C76800UCe.LIZ;
            }
            o.LJIJI("stickerEditLayer");
            throw null;
        }
        o.LJIJI("stickerEditLayer");
        throw null;
    }

    public static final Object invoke$16(AqS91S0300000_2 aqS91S0300000_2) {
        ((C130535Aj) aqS91S0300000_2.l0).LIZ((Map) aqS91S0300000_2.l1, (Map) aqS91S0300000_2.l2);
        ((C130535Aj) aqS91S0300000_2.l0).requestLayout();
        ((C130535Aj) aqS91S0300000_2.l0).postInvalidate();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS91S0300000_2 aqS91S0300000_2) {
        MediaItem mediaItem = (MediaItem) aqS91S0300000_2.l0;
        if (mediaItem.isMutable) {
            ((C172196pL) aqS91S0300000_2.l1).LJLILLLLZI.invoke(mediaItem, Integer.valueOf(((C172216pN) aqS91S0300000_2.l2).getAdapterPosition()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS91S0300000_2 aqS91S0300000_2) {
        if (((AddYoursStickerExtras) aqS91S0300000_2.l0).getAutoEnterStickerEdit()) {
            C6UY c6uy = (C6UY) aqS91S0300000_2.l1;
            c6uy.LJLLI = true;
            c6uy.sp();
        } else if (((AddYoursStickerExtras) aqS91S0300000_2.l0).getAutoEnterAlbum()) {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C6UZ((C6QO) ORZ.LJLLLL(((C6UV) aqS91S0300000_2.l2).LLIIJLIL(EnumC157656Gr.ADD_YOURS)), (C6UV) aqS91S0300000_2.l2, (C6UY) aqS91S0300000_2.l1, null), 3);
        }
        ((AddYoursStickerExtras) aqS91S0300000_2.l0).setAutoEnterStickerEdit(false);
        ((AddYoursStickerExtras) aqS91S0300000_2.l0).setAutoEnterAlbum(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS91S0300000_2 aqS91S0300000_2) {
        InterfaceC123794tT LJFF;
        C121914qR LJJIII;
        InterfaceC123794tT LJFF2;
        long endTime = ((NLETrackSlot) aqS91S0300000_2.l0).getEndTime();
        C126844yO c126844yO = (C126844yO) aqS91S0300000_2.l1;
        VecNLETrackSPtr tracks = c126844yO.LJIIIIZZ().getTracks();
        o.LJIIIIZZ(tracks, "getNleModel().tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name()) || o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.AUDIO_RECORD.name())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILL(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (NLESegmentAudio.LIZLLL(((NLETrackSlot) next2).LJI()) != null) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ((NLETimeSpaceNode) it4.next()).setEndTime(endTime);
            }
        }
        C122034qd c122034qd = c126844yO.LIZIZ;
        if (c122034qd != null && (LJFF = c122034qd.LJFF()) != null && (LJJIII = LJFF.LJJIII()) != null) {
            LJJIII.LJFF = endTime / 1000;
            C122034qd c122034qd2 = c126844yO.LIZIZ;
            if (c122034qd2 != null && (LJFF2 = c122034qd2.LJFF()) != null) {
                LJFF2.LJJJJJL(LJJIII);
            }
        }
        A90 LJII = ((C126844yO) aqS91S0300000_2.l1).LJII();
        if (LJII != null) {
            LJII.dismiss();
        }
        ((C126844yO) aqS91S0300000_2.l1).LIZLLL(EnumC124724uy.DONE, EnumC126814yL.ADD_VIDEO_EFFECT.getNameId());
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS91S0300000_2.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS91S0300000_2 aqS91S0300000_2) {
        C5XB c5xb = (C5XB) aqS91S0300000_2.l0;
        ((ArrayList) c5xb.LIZ).add(new C5XD((InterfaceC153045zY) aqS91S0300000_2.l1, (VideoPublishEditModel) aqS91S0300000_2.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS91S0300000_2 aqS91S0300000_2) {
        C5XB c5xb = (C5XB) aqS91S0300000_2.l0;
        ((ArrayList) c5xb.LIZ).add(new C5XD((InterfaceC153045zY) aqS91S0300000_2.l1, (VideoPublishEditModel) aqS91S0300000_2.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS91S0300000_2 aqS91S0300000_2) {
        ((C5V0) aqS91S0300000_2.l0).LIZ.setServerRenderingCompleted(true);
        ((InterfaceC65784Pro) aqS91S0300000_2.l1).invoke();
        ((InterfaceC88472Yns) aqS91S0300000_2.l2).invoke("success");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS91S0300000_2 aqS91S0300000_2) {
        Context sceneContext = ((C147295qH) aqS91S0300000_2.l0).getSceneContext();
        C82622Wbi c82622Wbi = (C82622Wbi) aqS91S0300000_2.l1;
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) aqS91S0300000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            C44701HgX.LJIILL(sceneContext, c82622Wbi, (C44704Hga) aqS91S0300000_2.l2, videoPublishEditModel);
            return C76800UCe.LIZ;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object invoke$8(AqS91S0300000_2 aqS91S0300000_2) {
        C158806Lc c158806Lc = (C158806Lc) aqS91S0300000_2.l0;
        ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) aqS91S0300000_2.l1;
        C6LY c6ly = c158806Lc.LJLL.LJLIL.LJLJI;
        if (c6ly != null) {
            c6ly.LLFF(readTextEffectBean);
        }
        C6LY c6ly2 = ((EditTTSPanelFragment) aqS91S0300000_2.l2).LJLJI;
        if (c6ly2 == null || !c6ly2.LLD(((ReadTextEffectBean) aqS91S0300000_2.l1).mSpeaker.speakreID)) {
            C158806Lc.M((C158806Lc) aqS91S0300000_2.l0, 2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS91S0300000_2 aqS91S0300000_2) {
        int LJIJJLI;
        int LJIJJLI2;
        String str;
        long j;
        TextStickerData textStickerData = (TextStickerData) aqS91S0300000_2.l0;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) aqS91S0300000_2.l1;
        long j2 = 0;
        if (nLETrackSlot != null && nLETrackSlot.getStartTime() != 0) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) aqS91S0300000_2.l1;
            if (nLETrackSlot2 != null) {
                j = nLETrackSlot2.getStartTime();
            } else {
                j = 0;
            }
            LJIJJLI = ((int) j) / 1000;
        } else {
            LJIJJLI = (int) C79057V0z.LJIJJLI(((EditorProScene) aqS91S0300000_2.l2).getEditorContext());
        }
        textStickerData.setStartTime(LJIJJLI);
        TextStickerData textStickerData2 = (TextStickerData) aqS91S0300000_2.l0;
        NLETrackSlot nLETrackSlot3 = (NLETrackSlot) aqS91S0300000_2.l1;
        if (nLETrackSlot3 != null && nLETrackSlot3.getEndTime() != 0) {
            NLETrackSlot nLETrackSlot4 = (NLETrackSlot) aqS91S0300000_2.l1;
            if (nLETrackSlot4 != null) {
                j2 = nLETrackSlot4.getEndTime();
            }
            LJIJJLI2 = ((int) j2) / 1000;
        } else {
            LJIJJLI2 = (int) (C79057V0z.LJIJJLI(((EditorProScene) aqS91S0300000_2.l2).getEditorContext()) + 3000);
        }
        textStickerData2.setEndTime(LJIJJLI2);
        C132815Jd.LIZ((NLETrackSlot) aqS91S0300000_2.l1, (TextStickerData) aqS91S0300000_2.l0, EnumC132095Gj.EditorProEdit, ((EditorProScene) aqS91S0300000_2.l2).getEditPageTextLayoutWidth(), ((EditorProScene) aqS91S0300000_2.l2).getEditPageTextLayoutHeight(), ((EditorProScene) aqS91S0300000_2.l2).getEditorContext(), true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProScene -> textStickerEditLayout.currentIsCaption = ");
        LIZ.append(((EditorProScene) aqS91S0300000_2.l2).getTextStickerEditLayout().getCurrentIsCaption());
        LIZ.append(",CaptionStickerKeva().getApplyToALL() = ");
        LIZ.append(new C1540162r().LIZ());
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (((EditorProScene) aqS91S0300000_2.l2).getTextStickerEditLayout().getCurrentIsCaption() && ((EditorProScene) aqS91S0300000_2.l2).getTextStickerEditLayout().getApplyToAll()) {
            EditorProScene editorProScene = (EditorProScene) aqS91S0300000_2.l2;
            TextStickerData textStickerData3 = (TextStickerData) aqS91S0300000_2.l0;
            NLETrackSlot nLETrackSlot5 = (NLETrackSlot) aqS91S0300000_2.l1;
            if (nLETrackSlot5 != null) {
                editorProScene.updateCaptionSlotAfterKeyBoardHide(textStickerData3, nLETrackSlot5);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        NLETrackSlot nLETrackSlot6 = (NLETrackSlot) aqS91S0300000_2.l1;
        if (nLETrackSlot6 != null) {
            TextStickerData textStickerData4 = (TextStickerData) aqS91S0300000_2.l0;
            EditorProScene editorProScene2 = (EditorProScene) aqS91S0300000_2.l2;
            if (nLETrackSlot6.hasExtra("text_tts_id") && nLETrackSlot6.hasExtra("text_tts_content") && !o.LJ(nLETrackSlot6.getExtra("text_tts_content"), textStickerData4.getTextStr())) {
                if (nLETrackSlot6.hasExtra("text_tts_speaker")) {
                    str = nLETrackSlot6.getExtra("text_tts_speaker");
                    o.LJIIIIZZ(str, "it.getExtra(KEY_TTS_SPEAKER)");
                } else {
                    str = "";
                }
                C134215On.LIZIZ(nLETrackSlot6, editorProScene2.getEditorContext());
                C29S requireAppCompatActivity = editorProScene2.requireAppCompatActivity();
                VideoPublishEditModel editModel = editorProScene2.getEditModel();
                if (editModel != null) {
                    new C137805ay(requireAppCompatActivity, editModel, editorProScene2.getEditorContext()).LJIILL(false, textStickerData4.getTextStr(), nLETrackSlot6, str, new AqS133S0200000_2(editorProScene2, nLETrackSlot6, 77));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                LIZ$0(editorProScene2, nLETrackSlot6);
            }
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final void LIZ$0(EditorProScene editorProScene, NLETrackSlot nLETrackSlot) {
        String uuid;
        C79057V0z.LJIILL(editorProScene.getEditorContext(), C6YK.LIZ(new C139795eB(EnumC126814yL.EDIT_TEXT.getNameId(), null, null, null, null, 30)));
        C132005Ga textMaterial = editorProScene.getTextMaterial();
        if (textMaterial != null) {
            String id = editorProScene.getTextStickerEditLayout().getCurrentSlotId();
            o.LJIIIZ(id, "id");
            View view = (View) ((ArrayMap) textMaterial.LJLL).get(id);
            if (view != null) {
                view.setVisibility(0);
            }
            textMaterial.LJLLL = false;
        }
        C132005Ga textMaterial2 = editorProScene.getTextMaterial();
        if (textMaterial2 != null) {
            textMaterial2.LJZI = "";
        }
        if (nLETrackSlot != null && (uuid = nLETrackSlot.getUUID()) != null) {
            C79057V0z.LJJJJL(editorProScene.getEditorContext(), "select_slot_event", new C127594zb(SFS.LJIJJ(C79057V0z.LJJI(editorProScene.getEditorContext()), uuid), null, 14));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS91S0300000_2(android.graphics.Canvas r3, android.text.StaticLayout r4, X.C67W r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 13: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS91S0300000_2.<init>(android.graphics.Canvas, android.text.StaticLayout, X.67W, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0300000_2(C130535Aj c130535Aj, C130535Aj c130535Aj2, Map<NLETrackSlot, C1301058s> map, Map<String, ArrayList<OSZ<Long, Float>>> map2) {
        super(0);
        this.$t = map2;
        this.l0 = c130535Aj;
        this.l1 = c130535Aj2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0300000_2(C132615Ij c132615Ij, C132615Ij c132615Ij2, NLEModel nLEModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c132615Ij;
        this.l1 = c132615Ij2;
        this.l2 = nLEModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C5KW c5kw, NLEEditor nLEEditor, VEPreviewParams vEPreviewParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5kw;
        this.l1 = nLEEditor;
        this.l2 = vEPreviewParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C5P6 c5p6, InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5p6;
        this.l1 = interfaceC153045zY;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C5V0 c5v0, InterfaceC65784Pro interfaceC65784Pro, C133715Mp c133715Mp, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5v0;
        this.l1 = interfaceC65784Pro;
        this.l2 = c133715Mp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C147295qH c147295qH, C82622Wbi c82622Wbi, C44704Hga c44704Hga, int i) {
        super(0);
        this.$t = i;
        this.l0 = c147295qH;
        this.l1 = c82622Wbi;
        this.l2 = c44704Hga;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C64M c64m, C64W c64w, C1559169z c1559169z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c64m;
        this.l1 = c64w;
        this.l2 = c1559169z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(C158806Lc c158806Lc, ReadTextEffectBean readTextEffectBean, EditTTSPanelFragment editTTSPanelFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c158806Lc;
        this.l1 = readTextEffectBean;
        this.l2 = editTTSPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0300000_2(C162776a9 c162776a9, C162776a9 c162776a92, C162756a7 c162756a7, C68322mC<C6ZI> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = c162776a9;
        this.l1 = c162776a92;
        this.l2 = c162756a7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0300000_2(OSZ osz, OSZ<Integer, Integer> osz2, C141225gU c141225gU, SoundEffectFragment soundEffectFragment) {
        super(0);
        this.$t = soundEffectFragment;
        this.l0 = osz;
        this.l1 = osz2;
        this.l2 = c141225gU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0300000_2(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, C126844yO c126844yO, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = nLETrackSlot;
        this.l1 = nLETrackSlot2;
        this.l2 = c126844yO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(AddYoursStickerExtras addYoursStickerExtras, C6UY c6uy, C6UV c6uv, int i) {
        super(0);
        this.$t = i;
        this.l0 = addYoursStickerExtras;
        this.l1 = c6uy;
        this.l2 = c6uv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(TextStickerData textStickerData, NLETrackSlot nLETrackSlot, EditorProScene editorProScene, int i) {
        super(0);
        this.$t = i;
        this.l0 = textStickerData;
        this.l1 = nLETrackSlot;
        this.l2 = editorProScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(MediaItem mediaItem, C172196pL c172196pL, C172216pN c172216pN, int i) {
        super(0);
        this.$t = i;
        this.l0 = mediaItem;
        this.l1 = c172196pL;
        this.l2 = c172216pN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0300000_2(EditorProScene editorProScene, NLETrackSlot nLETrackSlot, AnonymousClass519 anonymousClass519, int i) {
        super(0);
        this.$t = i;
        this.l0 = editorProScene;
        this.l1 = nLETrackSlot;
        this.l2 = anonymousClass519;
    }
}
