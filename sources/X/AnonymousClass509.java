package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS92S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.509, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass509 extends C50A {
    public final List<String> LJIIL;
    public AqS152S0100000_2 LJIILIIL;

    @Override // X.C52A
    public final boolean LIZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        return this.LJIIL.contains(funcItem.LJ);
    }

    @Override // X.AbstractC1282851s, X.C52A
    public final boolean LIZLLL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        if (AnonymousClass515.LIZ() && TextUtils.equals(funcItem.LJ, "bottom_item_root_overlay")) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i;
        List<NLETrack> LJIJI = C124574uj.LJIJI(C79057V0z.LJJI(LJI()));
        int size = LJIJI.size();
        if (size > 0) {
            i = ((NLETimeSpaceNode) ORZ.LLFF(LJIJI)).getLayer() + 1;
        } else {
            i = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("maxPipTrackLayer=");
        LIZ.append(i);
        H7C.LJI(4, "pip", null, X1D.LIZIZ(LIZ));
        if (i < ((Number) C5BA.LIZ(EnumC127484zQ.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
            if (size == 2) {
                ActivityC45651qj activityC45651qj = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.sae);
                creativeToastBuilder.acrossActivities(true);
                C78915Uy7.LJJIIZI(activityC45651qj, 1061, creativeToastBuilder);
            }
            interfaceC65784Pro.invoke();
            return;
        }
        C78920UyC.LIZLLL(R.string.saf, this.LIZ, 1061);
    }

    public final void LJIIL(NLETrackSlot nLETrackSlot) {
        OSZ<NLETrack, NLETrackSlot> LJJJJL = LJI().getEditor().LJJJJL(nLETrackSlot, EnumC124724uy.DONE);
        C79057V0z.LJJJJL(LJI(), "delete_slot_event", new C122684rg(EnumC123864ta.VIDEO, LJJJJL.getFirst(), LJJJJL.getSecond()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass509(ActivityC45651qj activity, NavigationScene navigationScene) {
        super(activity, navigationScene);
        o.LJIIIZ(activity, "activity");
        this.LJIIL = C47261Igj.LJJIJIL("bottom_item_root_overlay", "bottom_item_overlay_add_overlay", "bottom_item_overlay_edit_split", "bottom_item_overlay_edit_speed", "bottom_item_overlay_edit_volume", "bottom_item_overlay_edit_replace", "bottom_item_overlay_edit_copy", "bottom_item_overlay_edit_crop", "bottom_item_overlay_edit_rotate", "bottom_item_overlay_edit_delete", "bottom_item_overlay_edit_capcut");
    }

    @Override // X.C52A
    public final void LIZIZ(AnonymousClass523 funcItem, View view) {
        String str;
        InterfaceC132055Gf interfaceC132055Gf;
        int indexOf;
        long j;
        o.LJIIIZ(funcItem, "funcItem");
        if (!funcItem.LJFF) {
            return;
        }
        NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
        String str2 = funcItem.LJ;
        switch (str2.hashCode()) {
            case -1411365959:
                if (!str2.equals("bottom_item_overlay_edit_speed")) {
                    return;
                }
                LJI().getPlayer().pause();
                LJIIIZ();
                VideoPublishEditModel LJII = LJII();
                if (LJII == null) {
                    return;
                }
                C5QW.LJIJJLI("speed", LJII, LJI(), null, null, false, 56);
                return;
            case -1411359092:
                if (!str2.equals("bottom_item_overlay_edit_split")) {
                    return;
                }
                if (selectedTrackSlot != null) {
                    selectedTrackSlot.setExtra("is_editor_pro_split_used", "true");
                }
                LJI().getPlayer().pause();
                LJI().getEditor().LJIIL(EnumC124724uy.DONE);
                VideoPublishEditModel LJII2 = LJII();
                if (LJII2 == null) {
                    return;
                }
                C5QW.LJIJJLI("split", LJII2, LJI(), null, null, false, 56);
                return;
            case -1274264578:
                if (!str2.equals("bottom_item_overlay_edit_capcut")) {
                    return;
                }
                int LIZIZ = C55R.LIZIZ();
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            str = "";
                        } else {
                            str = "motion_blur";
                        }
                    } else {
                        str = "animation";
                    }
                } else {
                    str = "cutout";
                }
                VideoPublishEditModel LJII3 = LJII();
                if (LJII3 != null) {
                    C5QW.LJIJJLI(str, LJII3, LJI(), null, null, true, 24);
                }
                AqS152S0100000_2 aqS152S0100000_2 = this.LJIILIIL;
                if (aqS152S0100000_2 == null) {
                    return;
                }
                aqS152S0100000_2.invoke();
                return;
            case -1242058631:
                if (!str2.equals("bottom_item_overlay_edit_delete")) {
                    return;
                }
                VideoPublishEditModel LJII4 = LJII();
                if (LJII4 != null) {
                    C5QW.LJIJJLI("delete", LJII4, LJI(), null, null, false, 56);
                }
                if (C124574uj.LJJJJL(LJI())) {
                    LJIIL(null);
                    return;
                }
                NLETrack selectedTrack = LJI().getSelectedTrack();
                if (selectedTrack != null && !selectedTrack.LJIIJ()) {
                    return;
                }
                int size = LJI().getMainTrack().LJIILL().size();
                if (size == 1) {
                    VideoPublishEditModel LJII5 = LJII();
                    if (LJII5 != null) {
                        C5QW.LJJIFFI(LJII5, LJI());
                    }
                    C78920UyC.LIZLLL(R.string.fml, this.LIZ, 1062);
                    return;
                }
                if (size != 2 || ((interfaceC132055Gf = (InterfaceC132055Gf) this.LJIIJJI.getValue()) != null && !interfaceC132055Gf.LIZJ())) {
                    LJIIL(null);
                    return;
                }
                NLETrack selectedTrack2 = LJI().getSelectedTrack();
                NLETrackSlot selectedTrackSlot2 = LJI().getSelectedTrackSlot();
                if (selectedTrack2 == null || (indexOf = selectedTrack2.LJIILLIIL().indexOf(selectedTrackSlot2)) == -1) {
                    return;
                }
                C26227ARb LIZ = C3AW.LIZ(this.LIZ);
                LIZ.LJII = false;
                LIZ.LIZ(R.string.saa);
                UC0.LIZJ(LIZ, new AqS92S0101000_2(this, indexOf, 6));
                LIZ.LJI().LIZLLL();
                return;
            case -831780823:
                if (!str2.equals("bottom_item_overlay_edit_rotate")) {
                    return;
                }
                LJI().getPlayer().pause();
                Long l = (Long) C79057V0z.LJJIIJ(LJI(), "video_position_event");
                if (l != null) {
                    l.longValue();
                    long[] jArr = new long[2];
                    LJI().getSelectedSlotTimeRange(jArr);
                    long j2 = jArr[0];
                    long j3 = jArr[1];
                    if (j2 >= l.longValue()) {
                        j = j2 + 1000;
                    } else if (l.longValue() >= j3) {
                        j = j3 - 1000;
                    }
                    if (j != -1) {
                        LJI().getPlayer().M9(j);
                    }
                }
                if (selectedTrackSlot != null) {
                    selectedTrackSlot.setExtra("is_editor_pro_rotate_used", "true");
                    selectedTrackSlot.setExtra("is_editorpro_rotate_video", "1");
                }
                LJI().getEditor().LJJJI(EnumC124724uy.DONE);
                VideoPublishEditModel LJII6 = LJII();
                if (LJII6 == null) {
                    return;
                }
                C5QW.LJIJJLI("rotate", LJII6, LJI(), null, null, false, 56);
                return;
            case -717483544:
                if (!str2.equals("bottom_item_overlay_edit_volume")) {
                    return;
                }
                LJI().getPlayer().pause();
                LJIIJ();
                VideoPublishEditModel LJII7 = LJII();
                if (LJII7 == null) {
                    return;
                }
                C5QW.LJIJJLI("volume", LJII7, LJI(), null, null, false, 56);
                return;
            case -305077850:
                if (!str2.equals("bottom_item_overlay_edit_replace")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII8 = LJII();
                if (LJII8 != null) {
                    C5QW.LJIJJLI("replace", LJII8, LJI(), null, null, false, 56);
                }
                if (selectedTrackSlot == null) {
                    return;
                }
                float measuredEndTime = (float) (selectedTrackSlot.getMeasuredEndTime() - selectedTrackSlot.getMeasuredStartTime());
                o.LJIIIIZZ(selectedTrackSlot.LJI(), "curSlot.mainSegment");
                C127804zw.LIZIZ(this.LIZ, (C124574uj.LJJI(r4) * measuredEndTime) / 1000, true, new AqS152S0100000_2(this, 874));
                return;
            case 283352715:
                if (!str2.equals("bottom_item_root_overlay")) {
                    return;
                }
                break;
            case 369636803:
                if (!str2.equals("bottom_item_overlay_edit_copy")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII9 = LJII();
                if (LJII9 != null) {
                    C5QW.LJIJJLI("copy", LJII9, LJI(), null, null, false, 56);
                }
                NLETrackSlot selectedTrackSlot3 = LJI().getSelectedTrackSlot();
                if (selectedTrackSlot3 == null) {
                    return;
                }
                if (!C52B.LJFF(selectedTrackSlot3.getEndTime(), LJI())) {
                    C132105Gk.LIZIZ(R.string.g45);
                    return;
                } else {
                    LJIIJJI(new AqS152S0100000_2(this, 875));
                    return;
                }
            case 369639646:
                if (!str2.equals("bottom_item_overlay_edit_crop")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII10 = LJII();
                if (LJII10 != null) {
                    C5QW.LJIJJLI("crop", LJII10, LJI(), null, null, false, 56);
                }
                LJIIIIZZ(new AqS168S0100000_2(this, 524));
                return;
            case 1689505195:
                if (!str2.equals("bottom_item_overlay_add_overlay")) {
                    return;
                }
                break;
            default:
                return;
        }
        if (C6ZT.LIZ(this.LIZ.findViewById(this.LIZIZ))) {
            return;
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            EditorProContext LJI = LJI();
            if (!C52B.LJFF(C79057V0z.LJIJJLI(LJI) * 1000, LJI)) {
                AnonymousClass632.LIZ(this.LIZ);
                C78920UyC.LIZLLL(R.string.ca4, this.LIZ, 1060);
                return;
            }
        }
        LJIIJJI(new AqS152S0100000_2(this, 873));
    }
}
