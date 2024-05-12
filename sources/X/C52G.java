package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.52G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52G extends AbstractC1282851s {
    public final C55Y LJ;
    public final List<String> LJFF;
    public final C55V LJI;
    public AqS168S0100000_2 LJII;
    public AqS152S0100000_2 LJIIIIZZ;
    public AqS152S0100000_2 LJIIIZ;
    public AqS168S0100000_2 LJIIJ;
    public AqS133S0200000_2 LJIIJJI;
    public AqS149S0200000_2 LJIIL;
    public AqS152S0100000_2 LJIILIIL;
    public AqS152S0100000_2 LJIILJJIL;
    public AqS168S0100000_2 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    public static final VideoPublishEditModel LJI() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    public final EditorProContext LJII() {
        return (EditorProContext) this.LJIILLIIL.getValue();
    }

    @Override // X.C52A
    public final boolean LIZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        return this.LJFF.contains(funcItem.LJ);
    }

    @Override // X.AbstractC1282851s, X.C52A
    public final boolean LIZLLL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        if (AnonymousClass515.LIZ() && TextUtils.equals(funcItem.LJ, "bottom_item_root_text")) {
            return true;
        }
        return false;
    }

    public final void LJFF(boolean z) {
        InterfaceC1278950f previewPanel;
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            if ((C124574uj.LIZLLL(C79057V0z.LJJI(LJII())) - (C79057V0z.LJIJJLI(LJII()) * 1000)) / 1000 < ((Number) C5BA.LIZ(EnumC127484zQ.IMPORT_LIMIT, 100)).intValue()) {
                C78920UyC.LIZLLL(R.string.ca4, this.LIZ, 6007);
                return;
            }
        }
        IPreviewService LIZIZ = C127834zz.LIZIZ();
        if (LIZIZ != null && (previewPanel = LIZIZ.getPreviewPanel()) != null) {
            previewPanel.k6("text_sticker_material");
        }
        AqS168S0100000_2 aqS168S0100000_2 = this.LJII;
        if (aqS168S0100000_2 != null) {
            aqS168S0100000_2.invoke(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52G(ActivityC45651qj activity, C55Y actionMenuController) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(actionMenuController, "actionMenuController");
        this.LJ = actionMenuController;
        actionMenuController.LJFF = new AqS168S0100000_2(this, 520);
        this.LJFF = C47261Igj.LJJIJIL("bottom_item_root_text", "bottom_item_text_add_text", "bottom_item_text_edit_text_to_speech", "bottom_item_text_edit_copy", "bottom_item_text_edit_delete", "bottom_item_text_captions", "bottom_item_captions_edit_bulk_edit", "bottom_item_captions_edit_split", "bottom_item_captions_edit_delete", "bottom_item_text_text_template");
        this.LJI = new C55V(1);
        this.LJIILLIIL = C221108m2.LIZIZ(C123544t4.LJLIL);
    }

    @Override // X.C52A
    public final void LIZIZ(AnonymousClass523 funcItem, View view) {
        AqS149S0200000_2 aqS149S0200000_2;
        AqS152S0100000_2 aqS152S0100000_2;
        AqS152S0100000_2 aqS152S0100000_22;
        NLETrackSlot selectedTrackSlot;
        AqS133S0200000_2 aqS133S0200000_2;
        AqS168S0100000_2 aqS168S0100000_2;
        o.LJIIIZ(funcItem, "funcItem");
        if (funcItem.LJFF) {
            String str = funcItem.LJ;
            switch (str.hashCode()) {
                case -1530551726:
                    if (!str.equals("bottom_item_text_text_template") || (aqS168S0100000_2 = this.LJIILL) == null) {
                        return;
                    }
                    aqS168S0100000_2.invoke("click_secondary_menu");
                    return;
                case -1256230777:
                    if (!str.equals("bottom_item_text_captions") || (aqS133S0200000_2 = this.LJIIJJI) == null) {
                        return;
                    }
                    aqS133S0200000_2.invoke(Boolean.FALSE);
                    return;
                case -602076528:
                    if (!str.equals("bottom_item_text_edit_copy")) {
                        return;
                    }
                    VideoPublishEditModel LJI = LJI();
                    if (LJI != null) {
                        EditorProContext editorContext = LJII();
                        o.LJIIIZ(editorContext, "editorContext");
                        FMX.LJIIL("click_text_copy_tab", C5QW.LJFF(LJI, editorContext).LIZ);
                        C5QW.LJIJJLI("copy", LJI, LJII(), null, null, false, 56);
                    }
                    AqS152S0100000_2 aqS152S0100000_23 = this.LJIIIZ;
                    if (aqS152S0100000_23 == null) {
                        return;
                    }
                    aqS152S0100000_23.invoke();
                    return;
                case 471574511:
                    if (!str.equals("bottom_item_text_edit_text_to_speech") || (selectedTrackSlot = LJII().getSelectedTrackSlot()) == null) {
                        return;
                    }
                    if (C138535c9.LIZ() && !C138515c7.LIZ()) {
                        if (selectedTrackSlot.hasExtra("text") && !selectedTrackSlot.hasExtra("text_tts_id")) {
                            String extra = selectedTrackSlot.getExtra("text");
                            o.LJIIIIZZ(extra, "it.getExtra(KEY_CONTENT_FOR_SLOT)");
                            ActivityC45651qj activityC45651qj = this.LIZ;
                            VideoPublishEditModel LJI2 = LJI();
                            o.LJI(LJI2);
                            new C137805ay(activityC45651qj, LJI2, LJII()).LJIILL(true, extra, selectedTrackSlot, "", new AqS133S0200000_2(funcItem, this, 121));
                            VideoPublishEditModel LJI3 = LJI();
                            if (LJI3 != null) {
                                C138735cT.LIZJ(new ShortVideoCommonParams(LJI3.mShootWay, H7R.LJIIIIZZ(LJI3), H7R.LJIIIZ(LJI3), LJI3.getCreationId()), null, null, null, "1", 14);
                                C5QW.LJIJJLI("cancel", LJI3, LJII(), null, null, false, 56);
                            }
                        } else if (selectedTrackSlot.hasExtra("text") && selectedTrackSlot.hasExtra("text_tts_id")) {
                            C134215On.LIZIZ(selectedTrackSlot, LJII());
                            funcItem.LIZJ = this.LIZ.getString(R.string.fn6);
                            AqS168S0100000_2 aqS168S0100000_22 = this.LJIIJ;
                            if (aqS168S0100000_22 != null) {
                                aqS168S0100000_22.invoke(funcItem);
                            }
                            g0.LJIIL(C79057V0z.LJJ(LJII()), EnumC126814yL.TEXT_TO_SPEECH.getNameId());
                            VideoPublishEditModel LJI4 = LJI();
                            if (LJI4 != null) {
                                C138735cT.LIZ(new ShortVideoCommonParams(LJI4.mShootWay, H7R.LJIIIIZZ(LJI4), H7R.LJIIIZ(LJI4), LJI4.getCreationId()), "1", null, 4);
                            }
                        }
                    }
                    if (!C138535c9.LIZ() || !C138515c7.LIZ()) {
                        return;
                    }
                    C79057V0z.LJJI(LJII()).setExtra("enter_tts_panel", String.valueOf(System.currentTimeMillis()));
                    TTSFragment tTSFragment = new TTSFragment();
                    String extra2 = selectedTrackSlot.getExtra("text");
                    o.LJIIIIZZ(extra2, "it.getExtra(KEY_CONTENT_FOR_SLOT)");
                    C55V ttsDataCenter = this.LJI;
                    o.LJIIIZ(ttsDataCenter, "ttsDataCenter");
                    tTSFragment.LJZI = extra2;
                    tTSFragment.LJZL = selectedTrackSlot;
                    tTSFragment.LL = ttsDataCenter;
                    LJ(tTSFragment);
                    VideoPublishEditModel LJI5 = LJI();
                    if (LJI5 == null) {
                        return;
                    }
                    C138735cT.LIZJ(new ShortVideoCommonParams(LJI5.mShootWay, H7R.LJIIIIZZ(LJI5), H7R.LJIIIZ(LJI5), LJI5.getCreationId()), null, null, null, "1", 14);
                    C5QW.LJIJJLI("text_to_speech", LJI5, LJII(), null, null, false, 56);
                    return;
                case 1028537663:
                    if (!str.equals("bottom_item_captions_edit_split") || (aqS152S0100000_22 = this.LJIILJJIL) == null) {
                        return;
                    }
                    aqS152S0100000_22.invoke();
                    return;
                case 1244300806:
                    if (!str.equals("bottom_item_text_edit_delete")) {
                        return;
                    }
                    VideoPublishEditModel LJI6 = LJI();
                    if (LJI6 != null) {
                        C5QW.LJIJJLI("delete", LJI6, LJII(), null, null, false, 56);
                    }
                    AqS152S0100000_2 aqS152S0100000_24 = this.LJIIIIZZ;
                    if (aqS152S0100000_24 == null) {
                        return;
                    }
                    aqS152S0100000_24.invoke();
                    return;
                case 1380296742:
                    if (!str.equals("bottom_item_captions_edit_delete") || (aqS152S0100000_2 = this.LJIILIIL) == null) {
                        return;
                    }
                    aqS152S0100000_2.invoke();
                    return;
                case 1853001541:
                    if (!str.equals("bottom_item_text_add_text")) {
                        return;
                    }
                    LJFF(false);
                    return;
                case 1990932668:
                    if (!str.equals("bottom_item_captions_edit_bulk_edit") || (aqS149S0200000_2 = this.LJIIL) == null) {
                        return;
                    }
                    aqS149S0200000_2.invoke();
                    return;
                case 2073595090:
                    if (!str.equals("bottom_item_root_text") || view == null) {
                        return;
                    }
                    VideoPublishEditModel LJI7 = LJI();
                    if (LJI7 != null) {
                        C5QW.LJJIZ(LJI7, LJII(), "click_button");
                    }
                    C55Y c55y = this.LJ;
                    c55y.getClass();
                    view.setAlpha(0.6f);
                    if (c55y.LIZIZ().LIZJ()) {
                        c55y.LIZIZ().LIZ();
                        View view2 = c55y.LIZ;
                        if (view2 != null) {
                            view2.setAlpha(1.0f);
                        }
                        c55y.LJI = true;
                    }
                    c55y.LIZJ().LJ(view);
                    c55y.LIZ = view;
                    return;
                default:
                    return;
            }
        }
        if (!o.LJ(funcItem.LJ, "bottom_item_text_captions")) {
            return;
        }
        C5S1 c5s1 = new C5S1(C83739Wtj.LIZ());
        c5s1.LIZJ(R.string.eim);
        c5s1.LJ();
    }
}
