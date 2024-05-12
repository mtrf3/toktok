package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C126784yI;
import X.C127834zz;
import X.C1284452i;
import X.C132855Jh;
import X.C135125Sa;
import X.C141335gf;
import X.C144955mV;
import X.C145785nq;
import X.C145995oB;
import X.C147295qH;
import X.C148455s9;
import X.C148605sO;
import X.C150575vZ;
import X.C169236kZ;
import X.C169326ki;
import X.C3C5;
import X.C43544H7c;
import X.C44384HbQ;
import X.C46066I6c;
import X.C5QF;
import X.C5W8;
import X.C60U;
import X.C68322mC;
import X.C76800UCe;
import X.C78764Uvg;
import X.H7R;
import X.H8F;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.XKQ;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.ITrackService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes3.dex */
public class AqS45S0110000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        FTCEditTextStickerViewState setStateImmediate = (FTCEditTextStickerViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return FTCEditTextStickerViewState.copy$default(setStateImmediate, null, false, null, null, new C150575vZ(new OSZ((TextStickerData) aqS45S0110000_2.l0, Boolean.valueOf(aqS45S0110000_2.z1))), null, null, null, null, null, null, null, null, null, null, null, null, 131055, null);
    }

    public static final Object invoke$1(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C169236kZ) aqS45S0110000_2.l0).LLIFFJFJJ().LLJILJIL(aqS45S0110000_2.z1);
            ((C169236kZ) aqS45S0110000_2.l0).LLFFF().LLJILJIL(aqS45S0110000_2.z1);
        } else {
            ((C169236kZ) aqS45S0110000_2.l0).LJJZZI(C169326ki.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3C4, java.lang.Object] */
    public static final Object invoke$10(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        int i;
        List<String> urlList;
        String str;
        Uri uri;
        EffectTemplate it = (EffectTemplate) obj;
        o.LJIIIZ(it, "it");
        if (((Boolean) ((InterfaceC88472Yns) aqS45S0110000_2.l0).invoke(it)).booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        if (aqS45S0110000_2.z1) {
            UrlModel iconUrl = it.getIconUrl();
            Uri uri2 = null;
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
                try {
                    Uri parse = UriProtector.parse(str);
                    C3C5.m7constructorimpl(parse);
                    uri = parse;
                } catch (Throwable th) {
                    ?? LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                    uri = LIZ;
                }
                if (!C3C5.m12isFailureimpl(uri)) {
                    uri2 = uri;
                }
                uri2 = uri2;
            }
            if (C78764Uvg.LJIIL(uri2)) {
                i++;
            }
        }
        return new OSZ(it.getId(), Integer.valueOf(i));
    }

    public static final Object invoke$11(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        C5QF setState = (C5QF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5QF.LIZ(setState, null, null, null, null, null, null, null, null, new OSZ(Boolean.valueOf(aqS45S0110000_2.z1), ((C68322mC) aqS45S0110000_2.l0).element), 255);
    }

    public static final Object invoke$2(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        String str;
        C145995oB editAdjustMobEvent = (C145995oB) obj;
        o.LJIIIZ(editAdjustMobEvent, "$this$editAdjustMobEvent");
        if (aqS45S0110000_2.z1) {
            str = "sync_on";
        } else {
            str = "sync_off";
        }
        editAdjustMobEvent.LJI("to_status", str);
        editAdjustMobEvent.LIZ(((C46066I6c) aqS45S0110000_2.l0).LJLIIL().videoCount, "video_cnt");
        editAdjustMobEvent.LIZ(((C46066I6c) aqS45S0110000_2.l0).LJLIIL().photoCount, "pic_cnt");
        editAdjustMobEvent.LIZ(H8F.LJIIL(((C46066I6c) aqS45S0110000_2.l0).LJLIIL()), "is_multi_content");
        editAdjustMobEvent.LJI("mix_type", H8F.LJIIJ(((C46066I6c) aqS45S0110000_2.l0).LJLIIL()));
        editAdjustMobEvent.LIZ(0, "is_editor_pro");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS45S0110000_2 aqS45S0110000_2, Object it) {
        o.LJIIIZ(it, "it");
        ((C43544H7c) aqS45S0110000_2.l0).dismissDialog();
        C43544H7c c43544H7c = (C43544H7c) aqS45S0110000_2.l0;
        boolean z = aqS45S0110000_2.z1;
        c43544H7c.LJIJJ("click");
        c43544H7c.LJIJ(3, z, false, false, false);
        XKQ xkq = c43544H7c.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C5W8 c5w8 = c43544H7c.LJI;
        if (c5w8 != null) {
            c5w8.destroy();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        C144955mV setState = (C144955mV) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C144955mV.LIZ(setState, new OSZ((Rect) aqS45S0110000_2.l0, Boolean.valueOf(aqS45S0110000_2.z1)), null, null, null, 29);
    }

    public static final Object invoke$5(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        boolean z;
        String str;
        String str2;
        C145995oB editAdjustMobEvent = (C145995oB) obj;
        o.LJIIIZ(editAdjustMobEvent, "$this$editAdjustMobEvent");
        C147295qH c147295qH = (C147295qH) aqS45S0110000_2.l0;
        VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
        if (videoPublishEditModel != null) {
            if (C44384HbQ.LJLJI(videoPublishEditModel) || c147295qH.LLJJIII().LLZZ()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            editAdjustMobEvent.LIZLLL("is_warn_shown", str);
            editAdjustMobEvent.LIZLLL("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
            if (aqS45S0110000_2.z1) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            editAdjustMobEvent.LIZLLL("segment_type", str2);
            VideoPublishEditModel videoPublishEditModel2 = ((C147295qH) aqS45S0110000_2.l0).LJLLJ;
            if (videoPublishEditModel2 != null) {
                editAdjustMobEvent.LIZ(H8F.LJIIL(videoPublishEditModel2), "is_multi_content");
                VideoPublishEditModel videoPublishEditModel3 = ((C147295qH) aqS45S0110000_2.l0).LJLLJ;
                if (videoPublishEditModel3 != null) {
                    editAdjustMobEvent.LIZLLL("enter_type", H8F.LJIIIZ(videoPublishEditModel3));
                    return C76800UCe.LIZ;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object invoke$6(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJIIIIZZ(R.string.r8_, new AqS45S0110000_2((EditorProScene) aqS45S0110000_2.l0, aqS45S0110000_2.z1, 7));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS45S0110000_2 aqS45S0110000_2, Object it) {
        C1284452i multiTrackController;
        o.LJIIIZ(it, "it");
        ITrackService LIZJ = C127834zz.LIZJ();
        if (LIZJ != null && (multiTrackController = LIZJ.getMultiTrackController()) != null) {
            C1284452i.LJIL(multiTrackController, false, 3);
        }
        EditModelProvider.Companion.getClass();
        C126784yI.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        EditorProScene editorProScene = (EditorProScene) aqS45S0110000_2.l0;
        editorProScene.isFirstOnResume = true;
        editorProScene.handleSave(aqS45S0110000_2.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        boolean z;
        boolean z2 = false;
        if (((Boolean) obj).booleanValue() && aqS45S0110000_2.z1) {
            z = true;
        } else {
            z = false;
        }
        if (((C60U) aqS45S0110000_2.l0).LLJLIL().getEditorProModel().getFromEditorProEntranceInAlbum() && !C135125Sa.LIZ().getBoolean("entranceTipsShown", false)) {
            C148605sO.LIZIZ().storeBoolean("key_show_toast", false);
        } else if (((C60U) aqS45S0110000_2.l0).LLJLIL().getEditorProModel().getFromEditorProEntranceInAlbum() || !z) {
            z2 = C148605sO.LIZIZ().getBoolean("key_show_toast", true);
        }
        C60U c60u = (C60U) aqS45S0110000_2.l0;
        if (c60u.mActivity != null) {
            c60u.LLJJLIIIJLLLLLLLZ().rb(new C148455s9(H7R.LJFF(c60u.LLJLIL()), z2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS45S0110000_2 aqS45S0110000_2, Object obj) {
        boolean z;
        String str;
        String str2;
        C145995oB editAdjustMobEvent = (C145995oB) obj;
        o.LJIIIZ(editAdjustMobEvent, "$this$editAdjustMobEvent");
        C145785nq c145785nq = (C145785nq) aqS45S0110000_2.l0;
        if (C44384HbQ.LJLJI(c145785nq.LJIIJJI()) || c145785nq.LJIIL().LLZZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        editAdjustMobEvent.LIZLLL("is_warn_shown", str);
        editAdjustMobEvent.LIZLLL("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
        if (aqS45S0110000_2.z1) {
            str2 = "single";
        } else {
            str2 = "multiple";
        }
        editAdjustMobEvent.LIZLLL("segment_type", str2);
        editAdjustMobEvent.LIZ(H8F.LJIIL(((C145785nq) aqS45S0110000_2.l0).LJIIJJI()), "is_multi_content");
        editAdjustMobEvent.LIZLLL("enter_type", H8F.LJIIIZ(((C145785nq) aqS45S0110000_2.l0).LJIIJJI()));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(C132855Jh c132855Jh, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c132855Jh;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(C145785nq c145785nq, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c145785nq;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(C147295qH c147295qH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c147295qH;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(C169236kZ c169236kZ, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c169236kZ;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(C43544H7c c43544H7c, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c43544H7c;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(Rect rect, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rect;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(TextStickerData textStickerData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(EditorProScene editorProScene, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = editorProScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS45S0110000_2(boolean z, boolean z2, C68322mC<Bitmap> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(boolean z, C60U c60u, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c60u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S0110000_2(boolean z, C46066I6c c46066I6c, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c46066I6c;
    }
}
