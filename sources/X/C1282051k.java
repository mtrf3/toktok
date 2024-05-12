package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.functions.ShowPanelFragmentEvent;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.TrackState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.51k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282051k implements InterfaceC1286152z {
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final C62822Ol8 LIZLLL;
    public boolean LJ;
    public final AnonymousClass523 LJFF;
    public final C62822Ol8 LJI;
    public ArrayList<AnonymousClass523> LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C1282151l LJIIIZ;
    public final List<String> LJIIJ;
    public final AnonymousClass523 LJIIJJI;
    public final List<AnonymousClass523> LJIIL;
    public final List<AnonymousClass523> LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final AnonymousClass523 LJIILL;
    public final AnonymousClass523 LJIILLIIL;
    public final AnonymousClass523 LJIIZILJ;
    public final AnonymousClass523 LJIJ;
    public final AnonymousClass523 LJIJI;
    public final AnonymousClass523 LJIJJ;
    public final AnonymousClass523 LJIJJLI;
    public final AnonymousClass523 LJIL;
    public final AnonymousClass523 LJJ;
    public final AnonymousClass523 LJJI;
    public final AnonymousClass523 LJJIFFI;
    public final AnonymousClass523 LJJII;
    public final AnonymousClass523 LJJIII;
    public final AnonymousClass523 LJJIIJ;
    public final AnonymousClass523 LJJIIJZLJL;
    public final AnonymousClass523 LJJIIZ;
    public final AnonymousClass523 LJJIIZI;
    public final AnonymousClass523 LJJIJ;
    public final AnonymousClass523 LJJIJIIJI;
    public final AnonymousClass523 LJJIJIIJIL;
    public final ArrayList<AnonymousClass523> LJJIJIL;
    public final AnonymousClass523 LJJIJL;
    public final C62822Ol8 LJJIJLIJ;
    public final C62822Ol8 LJJIL;

    public static VideoPublishEditModel LJIIIZ() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    @Override // X.InterfaceC1286152z
    public final ArrayList<AnonymousClass523> LIZJ() {
        SY9 LJIIL;
        Object obj;
        Object obj2;
        Object obj3;
        if (this.LJ) {
            return this.LJJIJIL;
        }
        ArrayList<AnonymousClass523> arrayList = this.LJII;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<AnonymousClass523> arrayList2 = new ArrayList<>();
        if (!C44701HgX.LIZJ(LJIIIZ())) {
            AnonymousClass522 anonymousClass522 = new AnonymousClass522();
            anonymousClass522.LIZ = this.LIZ.getString(R.string.fn0);
            anonymousClass522.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_circle_fill, this.LIZ);
            anonymousClass522.LIZJ = "bottom_item_root_sound_sync";
            arrayList2.add(anonymousClass522.LIZ());
        }
        AnonymousClass522 anonymousClass5222 = new AnonymousClass522();
        anonymousClass5222.LIZ = this.LIZ.getString(R.string.fmj);
        anonymousClass5222.LIZJ = "bottom_item_root_edit";
        if (C00F.LIZ(31744, 0, "studio_change_edit_icon", true) == 1) {
            LJIIL = C52B.LJIIL(R.raw.icon_scissors_fill, this.LIZ);
        } else {
            LJIIL = C52B.LJIIL(R.raw.icon_video_play_split_fill, this.LIZ);
        }
        anonymousClass5222.LIZIZ = LJIIL;
        List<AnonymousClass523> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIL);
        ArrayList<AnonymousClass523> arrayList3 = null;
        if (C53142KtO.LIZ() || C1283251w.LIZ() || C1283451y.LIZ()) {
            ArrayList arrayList4 = (ArrayList) LLJILJILJ;
            Iterator it = arrayList4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((AnonymousClass523) obj).LJ, "bottom_item_edit_speed")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ListProtector.add(LLJILJILJ, arrayList4.indexOf(obj) + 1, this.LJJI);
        } else {
            ((ArrayList) LLJILJILJ).add(this.LJJI);
        }
        if (this.LIZIZ && !((Boolean) C53142KtO.LIZJ.getValue()).booleanValue()) {
            ListProtector.add(LLJILJILJ, this.LJIIL.size() - 1, this.LJIILL);
        }
        ArrayList arrayList5 = (ArrayList) LLJILJILJ;
        Iterator it2 = arrayList5.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (o.LJ(((AnonymousClass523) obj2).LJ, "bottom_item_edit_volume")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        int indexOf = arrayList5.indexOf(obj2);
        if (C1283451y.LIZ()) {
            ListProtector.add(LLJILJILJ, indexOf + 1, this.LJIIZILJ);
        }
        if (C1283251w.LIZ()) {
            ListProtector.add(LLJILJILJ, indexOf + 1, this.LJIILLIIL);
        }
        if (((Boolean) C53142KtO.LIZJ.getValue()).booleanValue() || (((Boolean) C53142KtO.LIZIZ.getValue()).booleanValue() && !this.LIZIZ)) {
            ListProtector.add(LLJILJILJ, indexOf + 1, this.LJFF);
        }
        if (C1293155r.LIZ()) {
            Iterator it3 = arrayList5.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj3 = it3.next();
                    if (o.LJ(((AnonymousClass523) obj3).LJ, "bottom_item_edit_delete")) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            int indexOf2 = arrayList5.indexOf(obj3);
            int size = arrayList5.size();
            int i = indexOf2 + 1;
            if (i >= 0 && i < size) {
                ListProtector.add(LLJILJILJ, i, this.LJIIJJI);
            } else {
                arrayList5.add(this.LJIIJJI);
            }
        }
        if (C55R.LIZ()) {
            if (arrayList5.size() >= 4) {
                ListProtector.add(LLJILJILJ, 4, this.LJJIJLIJ.getValue());
            } else {
                arrayList5.add(this.LJJIJLIJ.getValue());
            }
        }
        anonymousClass5222.LIZLLL = LLJILJILJ;
        arrayList2.add(anonymousClass5222.LIZ());
        AnonymousClass522 anonymousClass5223 = new AnonymousClass522();
        anonymousClass5223.LIZ = this.LIZ.getString(R.string.fmw);
        anonymousClass5223.LIZJ = "bottom_item_root_sound";
        anonymousClass5223.LIZIZ = C52B.LJIIL(R.raw.icon_music_note_s_alt, this.LIZ);
        anonymousClass5223.LIZLLL = LJIIIIZZ(LiveGiftNewGifterBadgeSetting.DEFAULT, false);
        arrayList2.add(anonymousClass5223.LIZ());
        AnonymousClass522 anonymousClass5224 = new AnonymousClass522();
        anonymousClass5224.LIZ = this.LIZ.getString(R.string.fn2);
        anonymousClass5224.LIZJ = "bottom_item_root_text";
        anonymousClass5224.LIZIZ = C52B.LJIIL(R.raw.icon_text_latin, this.LIZ);
        AnonymousClass522 anonymousClass5225 = new AnonymousClass522();
        anonymousClass5225.LIZ = this.LIZ.getString(R.string.fn3);
        anonymousClass5225.LJ = 1000L;
        anonymousClass5225.LIZIZ = C52B.LJIIL(R.raw.icon_text_plus, this.LIZ);
        anonymousClass5225.LIZJ = "bottom_item_text_add_text";
        AnonymousClass522 anonymousClass5226 = new AnonymousClass522();
        anonymousClass5226.LIZ = this.LIZ.getString(R.string.bwy);
        anonymousClass5226.LJ = 1000L;
        anonymousClass5226.LIZIZ = C52B.LJIIL(R.raw.icon_closed_caption_fill, this.LIZ);
        anonymousClass5226.LIZJ = "bottom_item_text_captions";
        ArrayList LJII = C47261Igj.LJII(anonymousClass5225.LIZ(), anonymousClass5226.LIZ());
        if (C55S.LIZ()) {
            AnonymousClass522 anonymousClass5227 = new AnonymousClass522();
            anonymousClass5227.LIZ = this.LIZ.getString(R.string.s6p);
            anonymousClass5227.LJ = 1000L;
            anonymousClass5227.LIZIZ = C52B.LJIIL(R.raw.icon_text_template_fill, this.LIZ);
            anonymousClass5227.LIZJ = "bottom_item_text_text_template";
            anonymousClass5227.LIZIZ(Boolean.TRUE, "is_capcut_entrance");
            int i2 = C1293855y.LIZLLL;
            anonymousClass5227.LIZIZ(C52B.LJIILIIL(i2, i2, this.LIZ), "small_drawable");
            LJII.add(anonymousClass5227.LIZ());
        }
        anonymousClass5224.LIZLLL = LJII;
        arrayList2.add(anonymousClass5224.LIZ());
        AnonymousClass522 anonymousClass5228 = new AnonymousClass522();
        anonymousClass5228.LIZ = this.LIZ.getString(R.string.fmu);
        anonymousClass5228.LIZJ = "bottom_item_root_overlay";
        anonymousClass5228.LIZIZ = C52B.LJIIL(R.raw.icon_rec_in_rec_fill, this.LIZ);
        anonymousClass5228.LIZLLL = LJIIJJI();
        arrayList2.add(anonymousClass5228.LIZ());
        if (this.LIZJ) {
            AnonymousClass522 anonymousClass5229 = new AnonymousClass522();
            anonymousClass5229.LIZ = this.LIZ.getString(R.string.flc);
            anonymousClass5229.LIZJ = "bottom_item_root_effects";
            anonymousClass5229.LIZIZ = C52B.LJIIL(R.raw.icon_effect_rectangle_alt_fill, this.LIZ);
            if (!C124574uj.LJIILIIL(C79057V0z.LJJI(LJIIJ())).isEmpty()) {
                arrayList3 = this.LJJIJIL;
            }
            anonymousClass5229.LIZLLL = arrayList3;
            arrayList2.add(anonymousClass5229.LIZ());
        }
        this.LJII = arrayList2;
        return arrayList2;
    }

    @Override // X.InterfaceC1286152z
    public final AnonymousClass523 LJFF() {
        AnonymousClass522 anonymousClass522 = new AnonymousClass522();
        anonymousClass522.LIZJ = "bottom_item_bgm_edit_adjust";
        return anonymousClass522.LIZ();
    }

    @Override // X.InterfaceC1286152z
    public final AnonymousClass523 LJI() {
        AnonymousClass522 anonymousClass522 = new AnonymousClass522();
        anonymousClass522.LIZJ = "bottom_item_video_transition";
        return anonymousClass522.LIZ();
    }

    public final EditorProContext LJIIJ() {
        return (EditorProContext) this.LJI.getValue();
    }

    public final List<AnonymousClass523> LJIIJJI() {
        if (!C124574uj.LJIJI(C79057V0z.LJJI(LJIIJ())).isEmpty()) {
            AnonymousClass522 anonymousClass522 = new AnonymousClass522();
            anonymousClass522.LIZ = this.LIZ.getString(R.string.fmv);
            anonymousClass522.LJ = 1000L;
            anonymousClass522.LIZIZ = C52B.LJIIL(R.raw.icon_plus_in_rec_fill, this.LIZ);
            anonymousClass522.LIZJ = "bottom_item_overlay_add_overlay";
            return C47261Igj.LJII(anonymousClass522.LIZ());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AnonymousClass523 LJII(boolean r7) {
        /*
            r6 = this;
            int r0 = X.C55R.LIZIZ()
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == r2) goto Ld
            if (r0 == r3) goto L77
            if (r0 == r4) goto L73
        Ld:
            r5 = 2131827533(0x7f111b4d, float:1.9287981E38)
        L10:
            int r0 = X.C55R.LIZIZ()
            r1 = 2131755605(0x7f100255, float:1.9142094E38)
            if (r0 == r2) goto L6c
            if (r0 == r3) goto L62
            if (r0 == r4) goto L58
            X.1qj r0 = r6.LIZ
            X.SY9 r4 = X.C52B.LJIILJJIL(r1, r0)
        L23:
            if (r7 == 0) goto L55
            java.lang.String r3 = "bottom_item_overlay_edit_capcut"
        L27:
            X.522 r2 = new X.522
            r2.<init>()
            X.1qj r0 = r6.LIZ
            java.lang.String r0 = r0.getString(r5)
            r2.LIZ = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.LJ = r0
            r2.LIZIZ = r4
            r2.LIZJ = r3
            java.lang.String r1 = "is_capcut_entrance"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.LIZIZ(r0, r1)
            int r1 = X.C1293855y.LIZLLL
            X.1qj r0 = r6.LIZ
            X.SY9 r1 = X.C52B.LJIILIIL(r1, r1, r0)
            java.lang.String r0 = "small_drawable"
            r2.LIZIZ(r1, r0)
            X.523 r0 = r2.LIZ()
            return r0
        L55:
            java.lang.String r3 = "bottom_item_edit_capcut"
            goto L27
        L58:
            r1 = 2131756179(0x7f100493, float:1.9143258E38)
            X.1qj r0 = r6.LIZ
            X.SY9 r4 = X.C52B.LJIIL(r1, r0)
            goto L23
        L62:
            r1 = 2131755703(0x7f1002b7, float:1.9142293E38)
            X.1qj r0 = r6.LIZ
            X.SY9 r4 = X.C52B.LJIILJJIL(r1, r0)
            goto L23
        L6c:
            X.1qj r0 = r6.LIZ
            X.SY9 r4 = X.C52B.LJIILJJIL(r1, r0)
            goto L23
        L73:
            r5 = 2131845684(0x7f116234, float:1.9324796E38)
            goto L10
        L77:
            r5 = 2131823862(0x7f110cf6, float:1.9280536E38)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282051k.LJII(boolean):X.523");
    }

    @Override // X.InterfaceC1286152z
    public final boolean LIZ(AnonymousClass523 anonymousClass523, QXX qxx) {
        AnonymousClass525 LJI;
        AnonymousClass525 LJI2;
        InterfaceC1278950f previewPanel;
        AnonymousClass525 LJI3;
        InterfaceC1278950f previewPanel2;
        AnonymousClass525 LJI4;
        String str;
        String str2;
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        String str3 = null;
        if (LJIIIZ != null) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI("bottom_item_bgm_edit_", "bottom_item_sound_effect_edit_", "bottom_item_audio_voice_cover_edit_");
            if (anonymousClass523 != null) {
                str = anonymousClass523.LJ;
            } else {
                str = null;
            }
            if (o.LJ(str, "bottom_item_text_edit_")) {
                C5QW.LJJIZ(LJIIIZ, LJIIJ(), "click_return");
            } else {
                if (anonymousClass523 != null) {
                    str2 = anonymousClass523.LJ;
                } else {
                    str2 = null;
                }
                if (ORZ.LJLJJI(str2, LJJIJIIJI)) {
                    C5QW.LJJIJLIJ(LJIIIZ, LJIIJ(), "click_return");
                }
            }
        }
        if (anonymousClass523 != null) {
            str3 = anonymousClass523.LJIIIZ;
        }
        if (o.LJ(str3, "root_item")) {
            if (o.LJ(qxx, C50Y.LJLIL)) {
                C50Q c50q = (C50Q) this.LJIIIIZZ.getValue();
                if (c50q != null && (LJI4 = c50q.LJI()) != null) {
                    LJI4.LJII("bottom_item_root_text");
                }
                IPreviewService LIZIZ = C127834zz.LIZIZ();
                if (LIZIZ != null && (previewPanel2 = LIZIZ.getPreviewPanel()) != null) {
                    previewPanel2.k6("text_sticker_material");
                }
                VideoPublishEditModel LJIIIZ2 = LJIIIZ();
                if (LJIIIZ2 != null) {
                    C5QW.LJJIZ(LJIIIZ2, LJIIJ(), "click_return");
                }
            } else if (o.LJ(qxx, C50W.LJLIL)) {
                C50Q c50q2 = (C50Q) this.LJIIIIZZ.getValue();
                if (c50q2 != null && (LJI3 = c50q2.LJI()) != null) {
                    LJI3.LJII("bottom_item_root_overlay");
                }
                IPreviewService LIZIZ2 = C127834zz.LIZIZ();
                if (LIZIZ2 != null && (previewPanel = LIZIZ2.getPreviewPanel()) != null) {
                    previewPanel.k6("video_material");
                }
            } else if (o.LJ(qxx, C50S.LJLIL)) {
                C50Q c50q3 = (C50Q) this.LJIIIIZZ.getValue();
                if (c50q3 != null && (LJI2 = c50q3.LJI()) != null) {
                    LJI2.LJII("bottom_item_root_sound");
                }
                VideoPublishEditModel LJIIIZ3 = LJIIIZ();
                if (LJIIIZ3 != null) {
                    C5QW.LJJIJLIJ(LJIIIZ3, LJIIJ(), "click_return");
                }
            } else if (o.LJ(qxx, C50Z.LJLIL)) {
                C50Q c50q4 = (C50Q) this.LJIIIIZZ.getValue();
                if (c50q4 != null && (LJI = c50q4.LJI()) != null) {
                    LJI.LJII("bottom_item_root_effects");
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1286152z
    public final boolean LJ(AnonymousClass523 anonymousClass523, boolean z) {
        if (z && this.LJ) {
            return true;
        }
        if (anonymousClass523 != null) {
            if (o.LJ(anonymousClass523.LJ, "bottom_item_root_effects") || o.LJ(anonymousClass523.LJ, "bottom_item_effect_add_effects") || o.LJ(anonymousClass523.LJ, "bottom_item_sound_voiceover")) {
                return true;
            }
            return false;
        }
        AnonymousClass516 anonymousClass516 = (AnonymousClass516) C79057V0z.LJJIIJ(LJIIJ(), "panel_bounce_event");
        if (anonymousClass516 != null && anonymousClass516.LIZ && o.LJ(anonymousClass516.LIZJ, "video_transition")) {
            return true;
        }
        return false;
    }

    public final ArrayList<AnonymousClass523> LJIIIIZZ(String str, boolean z) {
        boolean z2;
        AnonymousClass523 anonymousClass523;
        ArrayList<AnonymousClass523> LJII;
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            z2 = LJIIIZ.creativeModel.soundEffectInfoModel.enableStatus;
        } else {
            z2 = false;
        }
        boolean LIZ = C52M.LIZ(C79057V0z.LJJI(LJIIJ()));
        int hashCode = str.hashCode();
        if (hashCode != -1477447462) {
            if (hashCode != 104263205) {
                if (hashCode == 1182494401 && str.equals("sound_effect")) {
                    return C47261Igj.LJII(this.LJJIJ, this.LJJIJIIJI, this.LJJIJIIJIL);
                }
            } else if (str.equals("music")) {
                if (z) {
                    if (((Boolean) this.LIZLLL.getValue()).booleanValue()) {
                        ArrayList<AnonymousClass523> LJII2 = C47261Igj.LJII(this.LJIL, this.LJJ, this.LJJIIJ, this.LJJIIJZLJL, this.LJJII, this.LJJIII);
                        C44423Hc3 LJ = C73098SmU.LJ();
                        if (LJ != null && LJ.LJI() == 3) {
                            LJII2.remove(this.LJJIIJZLJL);
                        }
                        ((C169426ks) C169426ks.LIZIZ.getValue()).LIZ(new C138965cq(new AqS133S0200000_2((ArrayList) LJII2, (ArrayList<AnonymousClass523>) this, (C1282051k) 142)));
                        if (!C44701HgX.LJIILJJIL(LJIIIZ())) {
                            LJII2.remove(this.LJJ);
                        }
                        C1282951t.LIZ.getClass();
                        if (!C1282951t.LIZ()) {
                            return LJII2;
                        }
                        ListProtector.add(LJII2, 0, this.LJJIIZ);
                        return LJII2;
                    }
                    ArrayList<AnonymousClass523> LJII3 = C47261Igj.LJII(this.LJIL, this.LJJ, this.LJJII, this.LJJIII);
                    if (!C44701HgX.LJIILJJIL(LJIIIZ())) {
                        LJII3.remove(this.LJJ);
                    }
                    C1282951t.LIZ.getClass();
                    if (!C1282951t.LIZ()) {
                        return LJII3;
                    }
                    ListProtector.add(LJII3, 0, this.LJJIIZ);
                    return LJII3;
                }
                return C47261Igj.LJII(this.LJIJJLI);
            }
        } else if (str.equals("audio_record")) {
            return (ArrayList) this.LJIILJJIL.getValue();
        }
        if (z2 || LIZ) {
            ArrayList<AnonymousClass523> arrayList = new ArrayList<>();
            if (z) {
                anonymousClass523 = this.LJIL;
            } else {
                anonymousClass523 = this.LJIJJLI;
            }
            arrayList.add(anonymousClass523);
            if (LIZ) {
                arrayList.add(this.LJJIJL);
            }
            if (z2) {
                arrayList.add(this.LJJIIZI);
                return arrayList;
            }
            return arrayList;
        }
        if (z) {
            if (((Boolean) this.LIZLLL.getValue()).booleanValue()) {
                LJII = C47261Igj.LJII(this.LJIL, this.LJJIIJ, this.LJJIIJZLJL, this.LJJII, this.LJJIII);
            } else {
                LJII = C47261Igj.LJII(this.LJIL, this.LJJII, this.LJJIII);
            }
            C1282951t.LIZ.getClass();
            if (!C1282951t.LIZ()) {
                return LJII;
            }
            ListProtector.add(LJII, 0, this.LJJIIZ);
            return LJII;
        }
        return C47261Igj.LJII(this.LJIJJLI);
    }

    public C1282051k(ActivityC45651qj activity, boolean z, boolean z2) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = C221108m2.LIZIZ(C1282551p.LJLIL);
        AnonymousClass522 anonymousClass522 = new AnonymousClass522();
        anonymousClass522.LIZ = activity.getString(R.string.g4a);
        anonymousClass522.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_double_direction_fill, activity);
        anonymousClass522.LIZJ = "bottom_item_edit_replace";
        this.LJFF = anonymousClass522.LIZ();
        this.LJI = C221108m2.LIZIZ(C1282651q.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C1282451o.LJLIL);
        this.LJIIIZ = new C1282151l(this, activity);
        this.LJIIJ = C47261Igj.LJJIJIL("bottom_item_overlay_edit_", "bottom_item_effect_edit_", "bottom_item_text_edit_", "bottom_item_bgm_edit_", "bottom_item_sound_effect_edit_", "bottom_item_audio_voice_cover_edit_");
        AnonymousClass522 anonymousClass5222 = new AnonymousClass522();
        anonymousClass5222.LIZ = activity.getString(R.string.tru);
        anonymousClass5222.LIZIZ = C52B.LJIIL(R.raw.icon_audio_editing, activity);
        anonymousClass5222.LIZJ = "bottom_item_edit_voice_effect";
        this.LJIIJJI = anonymousClass5222.LIZ();
        AnonymousClass522 anonymousClass5223 = new AnonymousClass522();
        anonymousClass5223.LIZ = activity.getString(R.string.fmp);
        anonymousClass5223.LIZIZ = C52B.LJIIL(R.raw.icon_split_fill, activity);
        anonymousClass5223.LIZJ = "bottom_item_edit_split";
        AnonymousClass522 anonymousClass5224 = new AnonymousClass522();
        anonymousClass5224.LIZ = activity.getString(R.string.fmo);
        anonymousClass5224.LIZIZ = C52B.LJIIL(R.raw.icon_speed_meter_fill, activity);
        anonymousClass5224.LIZJ = "bottom_item_edit_speed";
        AnonymousClass522 anonymousClass5225 = new AnonymousClass522();
        anonymousClass5225.LIZ = activity.getString(R.string.fmt);
        anonymousClass5225.LIZIZ = C52B.LJIIL(R.raw.icon_speaker_2_fill_ltr, activity);
        anonymousClass5225.LIZJ = "bottom_item_edit_volume";
        AnonymousClass522 anonymousClass5226 = new AnonymousClass522();
        anonymousClass5226.LIZ = activity.getString(R.string.fmn);
        anonymousClass5226.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_turn_right_rectangle, activity);
        anonymousClass5226.LJ = 100L;
        anonymousClass5226.LIZJ = "bottom_item_edit_rotate";
        this.LJIIL = C47261Igj.LJJIJIIJI(anonymousClass5223.LIZ(), anonymousClass5224.LIZ(), anonymousClass5225.LIZ(), anonymousClass5226.LIZ());
        AnonymousClass522 anonymousClass5227 = new AnonymousClass522();
        anonymousClass5227.LIZ = activity.getString(R.string.fmp);
        anonymousClass5227.LIZIZ = C52B.LJIIL(R.raw.icon_split_fill, activity);
        anonymousClass5227.LIZJ = "bottom_item_overlay_edit_split";
        AnonymousClass522 anonymousClass5228 = new AnonymousClass522();
        anonymousClass5228.LIZ = activity.getString(R.string.fmo);
        anonymousClass5228.LIZIZ = C52B.LJIIL(R.raw.icon_speed_meter_fill, activity);
        anonymousClass5228.LIZJ = "bottom_item_overlay_edit_speed";
        AnonymousClass522 anonymousClass5229 = new AnonymousClass522();
        anonymousClass5229.LIZ = activity.getString(R.string.fmt);
        anonymousClass5229.LIZIZ = C52B.LJIIL(R.raw.icon_speaker_2_fill_ltr, activity);
        anonymousClass5229.LIZJ = "bottom_item_overlay_edit_volume";
        AnonymousClass522 anonymousClass52210 = new AnonymousClass522();
        anonymousClass52210.LIZ = activity.getString(R.string.fmn);
        anonymousClass52210.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_turn_right_rectangle, activity);
        anonymousClass52210.LIZJ = "bottom_item_overlay_edit_rotate";
        this.LJIILIIL = C47261Igj.LJJIJIIJI(anonymousClass5227.LIZ(), anonymousClass5228.LIZ(), anonymousClass5229.LIZ(), anonymousClass52210.LIZ());
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 989));
        AnonymousClass522 anonymousClass52211 = new AnonymousClass522();
        anonymousClass52211.LIZ = activity.getString(R.string.fmr);
        anonymousClass52211.LIZIZ = C52B.LJIIL(R.raw.icon_camera_clockwise_fill, activity);
        anonymousClass52211.LJ = 1000L;
        anonymousClass52211.LIZJ = "bottom_item_edit_start_over";
        this.LJIILL = anonymousClass52211.LIZ();
        AnonymousClass522 anonymousClass52212 = new AnonymousClass522();
        anonymousClass52212.LIZ = activity.getString(R.string.g44);
        anonymousClass52212.LIZIZ = C52B.LJIIL(R.raw.icon_doc_on_doc_fill, activity);
        anonymousClass52212.LIZJ = "bottom_item_edit_copy";
        this.LJIILLIIL = anonymousClass52212.LIZ();
        AnonymousClass522 anonymousClass52213 = new AnonymousClass522();
        anonymousClass52213.LIZ = activity.getString(R.string.pde);
        anonymousClass52213.LIZIZ = C52B.LJIIL(R.raw.icon_crop_fill, activity);
        anonymousClass52213.LIZJ = "bottom_item_edit_crop";
        this.LJIIZILJ = anonymousClass52213.LIZ();
        AnonymousClass522 anonymousClass52214 = new AnonymousClass522();
        anonymousClass52214.LIZ = activity.getString(R.string.g44);
        anonymousClass52214.LIZIZ = C52B.LJIIL(R.raw.icon_doc_on_doc_fill, activity);
        anonymousClass52214.LIZJ = "bottom_item_overlay_edit_copy";
        this.LJIJ = anonymousClass52214.LIZ();
        AnonymousClass522 anonymousClass52215 = new AnonymousClass522();
        anonymousClass52215.LIZ = activity.getString(R.string.pde);
        anonymousClass52215.LIZIZ = C52B.LJIIL(R.raw.icon_crop_fill, activity);
        anonymousClass52215.LIZJ = "bottom_item_overlay_edit_crop";
        this.LJIJI = anonymousClass52215.LIZ();
        AnonymousClass522 anonymousClass52216 = new AnonymousClass522();
        anonymousClass52216.LIZ = activity.getString(R.string.g4a);
        anonymousClass52216.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_double_direction_fill, activity);
        anonymousClass52216.LIZJ = "bottom_item_overlay_edit_replace";
        this.LJIJJ = anonymousClass52216.LIZ();
        AnonymousClass522 anonymousClass52217 = new AnonymousClass522();
        anonymousClass52217.LIZ = activity.getString(R.string.fmx);
        anonymousClass52217.LIZIZ = C52B.LJIIL(R.raw.icon_sound_plus, activity);
        anonymousClass52217.LJ = 1000L;
        anonymousClass52217.LIZJ = "bottom_item_sound_add_sound";
        this.LJIJJLI = anonymousClass52217.LIZ();
        AnonymousClass522 anonymousClass52218 = new AnonymousClass522();
        anonymousClass52218.LIZ = activity.getString(R.string.fmz);
        anonymousClass52218.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_double_direction_fill, activity);
        anonymousClass52218.LIZJ = "bottom_item_sound_replace_sound";
        anonymousClass52218.LJ = 1000L;
        this.LJIL = anonymousClass52218.LIZ();
        AnonymousClass522 anonymousClass52219 = new AnonymousClass522();
        anonymousClass52219.LIZ = activity.getString(R.string.rgv);
        anonymousClass52219.LIZJ = "bottom_item_bgm_edit_sound_beats";
        anonymousClass52219.LIZIZ = C52B.LJIIL(R.raw.icon_flag_flat, activity);
        this.LJJ = anonymousClass52219.LIZ();
        AnonymousClass522 anonymousClass52220 = new AnonymousClass522();
        anonymousClass52220.LIZ = activity.getString(R.string.fmk);
        anonymousClass52220.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, activity);
        anonymousClass52220.LIZJ = "bottom_item_edit_delete";
        this.LJJI = anonymousClass52220.LIZ();
        AnonymousClass522 anonymousClass52221 = new AnonymousClass522();
        anonymousClass52221.LIZ = activity.getString(R.string.fmk);
        anonymousClass52221.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, activity);
        anonymousClass52221.LIZJ = "bottom_item_overlay_edit_delete";
        this.LJJIFFI = anonymousClass52221.LIZ();
        AnonymousClass522 anonymousClass52222 = new AnonymousClass522();
        anonymousClass52222.LIZ = activity.getString(R.string.fn1);
        anonymousClass52222.LIZIZ = C52B.LJIIL(R.raw.icon_speaker_2_fill_ltr, activity);
        anonymousClass52222.LIZJ = "bottom_item_bgm_edit_volume";
        this.LJJII = anonymousClass52222.LIZ();
        AnonymousClass522 anonymousClass52223 = new AnonymousClass522();
        anonymousClass52223.LIZ = activity.getString(R.string.fmy);
        anonymousClass52223.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, activity);
        anonymousClass52223.LIZJ = "bottom_item_bgm_edit_delete";
        this.LJJIII = anonymousClass52223.LIZ();
        AnonymousClass522 anonymousClass52224 = new AnonymousClass522();
        anonymousClass52224.LIZ = activity.getString(R.string.rgt);
        anonymousClass52224.LIZIZ = C52B.LJIIL(R.raw.icon_speed_meter_fill, activity);
        anonymousClass52224.LIZJ = "bottom_item_bgm_edit_sound_speed";
        this.LJJIIJ = anonymousClass52224.LIZ();
        AnonymousClass522 anonymousClass52225 = new AnonymousClass522();
        anonymousClass52225.LIZ = activity.getString(R.string.rgs);
        anonymousClass52225.LIZIZ = C52B.LJIIL(R.raw.icon_music_note_star_fill, activity);
        anonymousClass52225.LIZJ = "bottom_item_bgm_edit_sound_filter";
        this.LJJIIJZLJL = anonymousClass52225.LIZ();
        AnonymousClass522 anonymousClass52226 = new AnonymousClass522();
        anonymousClass52226.LIZ = activity.getString(R.string.fnx);
        anonymousClass52226.LIZIZ = C52B.LJIIL(R.raw.icon_adjust, activity);
        anonymousClass52226.LIZJ = "bottom_item_bgm_edit_adjust";
        this.LJJIIZ = anonymousClass52226.LIZ();
        AnonymousClass522 anonymousClass52227 = new AnonymousClass522();
        anonymousClass52227.LIZ = activity.getString(R.string.fmh);
        anonymousClass52227.LIZIZ = C52B.LJIIL(R.raw.icon_music_note_star, activity);
        anonymousClass52227.LIZJ = "bottom_item_sound_sound_effect";
        anonymousClass52227.LJ = 1000L;
        this.LJJIIZI = anonymousClass52227.LIZ();
        AnonymousClass522 anonymousClass52228 = new AnonymousClass522();
        anonymousClass52228.LIZ = activity.getString(R.string.fn1);
        anonymousClass52228.LIZIZ = C52B.LJIIL(R.raw.icon_speaker_2_fill_ltr, activity);
        anonymousClass52228.LIZJ = "bottom_item_sound_effect_edit_volume";
        this.LJJIJ = anonymousClass52228.LIZ();
        AnonymousClass522 anonymousClass52229 = new AnonymousClass522();
        anonymousClass52229.LIZ = activity.getString(R.string.fn4);
        anonymousClass52229.LIZIZ = C52B.LJIIL(R.raw.icon_doc_on_doc_fill, activity);
        anonymousClass52229.LIZJ = "bottom_item_sound_effect_edit_copy";
        this.LJJIJIIJI = anonymousClass52229.LIZ();
        AnonymousClass522 anonymousClass52230 = new AnonymousClass522();
        anonymousClass52230.LIZ = activity.getString(R.string.fmy);
        anonymousClass52230.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, activity);
        anonymousClass52230.LIZJ = "bottom_item_sound_effect_edit_delete";
        this.LJJIJIIJIL = anonymousClass52230.LIZ();
        AnonymousClass522 anonymousClass52231 = new AnonymousClass522();
        anonymousClass52231.LIZ = activity.getString(R.string.fle);
        anonymousClass52231.LJ = 1000L;
        anonymousClass52231.LIZIZ = C52B.LJIIL(R.raw.icon_plus_in_rec_fill, activity);
        anonymousClass52231.LIZJ = "bottom_item_effect_add_effects";
        this.LJJIJIL = C47261Igj.LJII(anonymousClass52231.LIZ());
        AnonymousClass522 anonymousClass52232 = new AnonymousClass522();
        anonymousClass52232.LIZ = activity.getString(R.string.trv);
        anonymousClass52232.LJ = 1000L;
        anonymousClass52232.LIZIZ = C52B.LJIIL(R.raw.icon_mic_fill, activity);
        anonymousClass52232.LIZJ = "bottom_item_sound_voiceover";
        this.LJJIJL = anonymousClass52232.LIZ();
        this.LJJIJLIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 990));
        this.LJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 991));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1286152z
    public final AnonymousClass523 LIZLLL(NLETrack track, NLETrackSlot slot, AnonymousClass525 anonymousClass525) {
        boolean z;
        C1279550l c1279550l;
        C58D c58d;
        Fragment LJJJIL;
        C58D c58d2;
        C58D c58d3;
        boolean z2;
        boolean z3;
        String str;
        C58D c58d4;
        C58D c58d5;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        C1282151l c1282151l = this.LJIIIZ;
        c1282151l.getClass();
        boolean z4 = false;
        if (C124574uj.LJJJI(slot)) {
            C1284452i LIZIZ = c1282151l.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJIJJLI(TrackState.VIDEOEFFECT);
            }
            C1284452i LIZIZ2 = c1282151l.LIZIZ();
            if (LIZIZ2 != null && (c58d5 = LIZIZ2.LJLIL) != null) {
                c58d5.showOrHideNullAudioTrack(false);
            }
            C1284452i LIZIZ3 = c1282151l.LIZIZ();
            if (LIZIZ3 != null && (c58d4 = LIZIZ3.LJLIL) != null) {
                c58d4.showOrHideNullEffectTrack(C124574uj.LJIILIIL(C79057V0z.LJJI(c1282151l.LIZ())).isEmpty());
            }
            if (c1282151l.LIZ.LJ) {
                str = "bottom_item_effect_add_effects";
            } else {
                str = "bottom_item_root_effects";
            }
            AnonymousClass522 anonymousClass522 = new AnonymousClass522();
            anonymousClass522.LIZJ = "bottom_item_effect_edit_";
            anonymousClass522.LJI = str;
            AnonymousClass522 anonymousClass5222 = new AnonymousClass522();
            anonymousClass5222.LIZ = c1282151l.LIZIZ.getString(R.string.fld);
            anonymousClass5222.LIZIZ = C52B.LJIIL(R.raw.icon_arrow_double_direction_fill, c1282151l.LIZIZ);
            anonymousClass5222.LIZJ = "bottom_item_effect_edit_replace_effect";
            anonymousClass5222.LJ = 1000L;
            AnonymousClass522 anonymousClass5223 = new AnonymousClass522();
            anonymousClass5223.LIZ = c1282151l.LIZIZ.getString(R.string.fn4);
            anonymousClass5223.LIZIZ = C52B.LJIIL(R.raw.icon_doc_on_doc_fill, c1282151l.LIZIZ);
            anonymousClass5223.LIZJ = "bottom_item_effect_edit_copy";
            AnonymousClass522 anonymousClass5224 = new AnonymousClass522();
            anonymousClass5224.LIZ = c1282151l.LIZIZ.getString(R.string.flb);
            anonymousClass5224.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, c1282151l.LIZIZ);
            anonymousClass5224.LIZJ = "bottom_item_effect_edit_delete";
            anonymousClass522.LIZLLL = C47261Igj.LJJIJIIJI(anonymousClass5222.LIZ(), anonymousClass5223.LIZ(), anonymousClass5224.LIZ());
            return anonymousClass522.LIZ();
        }
        Object obj = null;
        if (C124574uj.LJJL(track)) {
            VideoPublishEditModel LIZIZ4 = C132805Jc.LIZIZ(EditModelProvider.Companion);
            if (LIZIZ4 != null) {
                boolean LJIIJ = track.LJIIJ();
                EditorProContext editorContext = c1282151l.LIZ();
                o.LJIIIZ(editorContext, "editorContext");
                C43045Guv.LIZIZ(new C5QY(LIZIZ4, editorContext, false, LJIIJ));
            }
            if (track.LJIIJ()) {
                AnonymousClass516 anonymousClass516 = (AnonymousClass516) C79057V0z.LJJIIJ(c1282151l.LIZ(), "panel_bounce_event");
                if (anonymousClass516 != null && anonymousClass516.LIZ && o.LJ(anonymousClass516.LIZJ, "magic_panel")) {
                    return null;
                }
                return anonymousClass525.LIZIZ.LIZ("bottom_item_root_edit");
            }
            List list = (List) c1282151l.LJ.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (o.LJ(((AnonymousClass523) obj2).LJ, "bottom_item_overlay_edit_volume")) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass523 anonymousClass523 = (AnonymousClass523) it.next();
                NLETrackSlot selectedTrackSlot = c1282151l.LIZ().getSelectedTrackSlot();
                if (selectedTrackSlot != null && C124574uj.LJJIJIIJI(selectedTrackSlot)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                anonymousClass523.LJFF = z3;
            }
            List list2 = (List) c1282151l.LJ.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (o.LJ(((AnonymousClass523) obj3).LJ, "bottom_item_overlay_edit_speed")) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass523 anonymousClass5232 = (AnonymousClass523) it2.next();
                NLETrackSlot selectedTrackSlot2 = c1282151l.LIZ().getSelectedTrackSlot();
                if (selectedTrackSlot2 != null && !C124574uj.LJJJJ(selectedTrackSlot2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                anonymousClass5232.LJFF = z2;
            }
            C1284452i LIZIZ5 = c1282151l.LIZIZ();
            if (LIZIZ5 != null) {
                LIZIZ5.LJIJJLI(TrackState.PIP);
            }
            C1284452i LIZIZ6 = c1282151l.LIZIZ();
            if (LIZIZ6 != null && (c58d3 = LIZIZ6.LJLIL) != null) {
                c58d3.showOrHideNullAudioTrack(false);
            }
            C1284452i LIZIZ7 = c1282151l.LIZIZ();
            if (LIZIZ7 != null && (c58d2 = LIZIZ7.LJLIL) != null) {
                c58d2.showOrHideNullEffectTrack(false);
            }
            List LJJIJIIJI = C47261Igj.LJJIJIIJI("video_transition", "magic_panel");
            AnonymousClass516 anonymousClass5162 = (AnonymousClass516) C79057V0z.LJJIIJ(c1282151l.LIZ(), "panel_bounce_event");
            if (anonymousClass5162 != null && anonymousClass5162.LIZ && (!(LJJIJIIJI instanceof Collection) || !LJJIJIIJI.isEmpty())) {
                Iterator it3 = LJJIJIIJI.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (o.LJ(anonymousClass5162.LIZJ, it3.next())) {
                        String value = ((ShowPanelFragmentEvent) c1282151l.LJFF.getValue()).LJLIL.getValue();
                        if (value != null && (LJJJIL = c1282151l.LIZIZ.getSupportFragmentManager().LJJJIL(value)) != null) {
                            C151035wJ.LIZ(LJJJIL);
                            C79057V0z.LJJJJL(c1282151l.LIZ(), "panel_bounce_event", new AnonymousClass516(anonymousClass5162.LIZJ, anonymousClass5162.LIZIZ, false));
                            C79057V0z.LJJJJL(c1282151l.LIZ(), "is_bottom_panel_showing", Boolean.FALSE);
                        }
                    }
                }
            }
            AnonymousClass522 anonymousClass5225 = new AnonymousClass522();
            anonymousClass5225.LIZJ = "bottom_item_overlay_edit_";
            anonymousClass5225.LJI = "bottom_item_root_overlay";
            anonymousClass5225.LIZLLL = (List) c1282151l.LJ.getValue();
            return anonymousClass5225.LIZ();
        }
        if (C124574uj.LJJIJLIJ(track)) {
            C1284452i LIZIZ8 = c1282151l.LIZIZ();
            if (LIZIZ8 != null) {
                LIZIZ8.LJIJJLI(TrackState.AUDIO);
            }
            if (C124604um.LJII(slot, c1282151l.LIZ())) {
                AnonymousClass522 anonymousClass5226 = new AnonymousClass522();
                anonymousClass5226.LIZJ = "bottom_item_sound_effect_edit_";
                anonymousClass5226.LJI = "bottom_item_root_sound";
                anonymousClass5226.LIZLLL = c1282151l.LIZ.LJIIIIZZ("sound_effect", false);
                return anonymousClass5226.LIZ();
            }
            if (C124604um.LJ(slot)) {
                AnonymousClass522 anonymousClass5227 = new AnonymousClass522();
                anonymousClass5227.LIZJ = "bottom_item_audio_voice_cover_edit_";
                anonymousClass5227.LJI = "bottom_item_root_sound";
                ArrayList<AnonymousClass523> LJIIIIZZ = c1282151l.LIZ.LJIIIIZZ("audio_record", false);
                Iterator<AnonymousClass523> it4 = LJIIIIZZ.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (o.LJ(((AnonymousClass523) next).LJ, "bottom_item_voiceover_edit_copy")) {
                        obj = next;
                        break;
                    }
                }
                AnonymousClass523 anonymousClass5233 = (AnonymousClass523) obj;
                if (anonymousClass5233 != null) {
                    if (c1282151l.LIZ().getPlayer().s5() - (slot.getEndTime() / 1000) >= 100) {
                        z4 = true;
                    }
                    anonymousClass5233.LJFF = z4;
                }
                anonymousClass5227.LIZLLL = LJIIIIZZ;
                return anonymousClass5227.LIZ();
            }
            AnonymousClass522 anonymousClass5228 = new AnonymousClass522();
            anonymousClass5228.LIZJ = "bottom_item_bgm_edit_";
            anonymousClass5228.LJI = "bottom_item_root_sound";
            anonymousClass5228.LIZLLL = c1282151l.LIZ.LJIIIIZZ("music", true);
            return anonymousClass5228.LIZ();
        }
        EnumC123864ta LJIIZILJ = track.LJIIZILJ();
        EnumC123864ta enumC123864ta = EnumC123864ta.STICKER;
        if ((LJIIZILJ != enumC123864ta && track.LJII() != enumC123864ta) || NLESegmentTextSticker.LJFF(slot.LJI()) == null) {
            return null;
        }
        C1284452i LIZIZ9 = c1282151l.LIZIZ();
        if (LIZIZ9 != null) {
            LIZIZ9.LJIJJLI(TrackState.TEXT);
        }
        C1284452i LIZIZ10 = c1282151l.LIZIZ();
        if (LIZIZ10 != null && (c58d = LIZIZ10.LJLIL) != null) {
            c58d.showOrHideNullAudioTrack(false);
        }
        if (AnonymousClass636.LJIIL(slot)) {
            AnonymousClass522 anonymousClass5229 = new AnonymousClass522();
            anonymousClass5229.LIZJ = "bottom_item_text_edit_";
            anonymousClass5229.LJI = "bottom_item_root_text";
            C1282051k c1282051k = c1282151l.LIZ;
            c1282051k.getClass();
            AnonymousClass522 anonymousClass52210 = new AnonymousClass522();
            anonymousClass52210.LIZ = c1282051k.LIZ.getString(R.string.fm_);
            anonymousClass52210.LIZJ = "bottom_item_captions_edit_bulk_edit";
            anonymousClass52210.LIZIZ = C52B.LJIIL(R.raw.icon_pen_fill, c1282051k.LIZ);
            AnonymousClass522 anonymousClass52211 = new AnonymousClass522();
            anonymousClass52211.LIZ = c1282051k.LIZ.getString(R.string.fmb);
            anonymousClass52211.LIZJ = "bottom_item_captions_edit_split";
            anonymousClass52211.LIZIZ = C52B.LJIIL(R.raw.icon_split_fill, c1282051k.LIZ);
            AnonymousClass522 anonymousClass52212 = new AnonymousClass522();
            anonymousClass52212.LIZ = c1282051k.LIZ.getString(R.string.fn5);
            anonymousClass52212.LIZJ = "bottom_item_captions_edit_delete";
            anonymousClass52212.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, c1282051k.LIZ);
            anonymousClass5229.LIZLLL = C47261Igj.LJII(anonymousClass52210.LIZ(), anonymousClass52211.LIZ(), anonymousClass52212.LIZ());
            return anonymousClass5229.LIZ();
        }
        C1284452i LIZIZ11 = c1282151l.LIZIZ();
        if (LIZIZ11 != null && (c1279550l = (C1279550l) LIZIZ11.LJLILLLLZI.LLIILZL.getValue()) != null) {
            obj = c1279550l.LJ;
        }
        if (obj == EnumC127354zD.CLIP) {
            boolean hasExtra = slot.hasExtra("text_tts_id");
            AnonymousClass522 anonymousClass52213 = new AnonymousClass522();
            anonymousClass52213.LIZJ = "bottom_item_text_edit_";
            anonymousClass52213.LJI = "bottom_item_root_text";
            C1282051k c1282051k2 = c1282151l.LIZ;
            if (C138535c9.LIZ() && !C138515c7.LIZ() && hasExtra) {
                z = true;
            } else {
                z = false;
            }
            c1282051k2.getClass();
            AnonymousClass522 anonymousClass52214 = new AnonymousClass522();
            anonymousClass52214.LIZIZ = C52B.LJIIL(R.raw.icon_human_soundwave_fill, c1282051k2.LIZ);
            anonymousClass52214.LIZJ = "bottom_item_text_edit_text_to_speech";
            if (z) {
                anonymousClass52214.LIZ = c1282051k2.LIZ.getString(R.string.cg_);
            } else {
                anonymousClass52214.LIZ = c1282051k2.LIZ.getString(R.string.fn6);
            }
            AnonymousClass522 anonymousClass52215 = new AnonymousClass522();
            anonymousClass52215.LIZ = c1282051k2.LIZ.getString(R.string.fn4);
            anonymousClass52215.LIZJ = "bottom_item_text_edit_copy";
            anonymousClass52215.LIZIZ = C52B.LJIIL(R.raw.icon_doc_on_doc_fill, c1282051k2.LIZ);
            AnonymousClass522 anonymousClass52216 = new AnonymousClass522();
            anonymousClass52216.LIZ = c1282051k2.LIZ.getString(R.string.fn5);
            anonymousClass52216.LIZJ = "bottom_item_text_edit_delete";
            anonymousClass52216.LIZIZ = C52B.LJIIL(R.raw.icon_trash_bin_fill, c1282051k2.LIZ);
            ArrayList LJII = C47261Igj.LJII(anonymousClass52215.LIZ(), anonymousClass52216.LIZ());
            if (C138535c9.LIZ()) {
                ListProtector.add(LJII, 0, anonymousClass52214.LIZ());
            }
            anonymousClass52213.LIZLLL = LJII;
            return anonymousClass52213.LIZ();
        }
        return anonymousClass525.LIZIZ.LIZ("bottom_item_root_text");
    }

    @Override // X.InterfaceC1286152z
    public final boolean LIZIZ(NLETrackSlot nLETrackSlot, NLETrack nLETrack, NLETrackSlot nLETrackSlot2, boolean z, boolean z2, AnonymousClass523 anonymousClass523, String str) {
        boolean z3;
        String uuid;
        if (nLETrackSlot2 != null && (uuid = nLETrackSlot2.getUUID()) != null && C78596Usy.LJJIIJZLJL(C79057V0z.LJJI(LJIIJ()), uuid) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C127644zg.LIZ() && z && nLETrackSlot == null && nLETrackSlot2 != null && !z3 && !z2) {
            return false;
        }
        if (C127644zg.LIZIZ() && ((nLETrack == null || !nLETrack.LJIIJ()) && nLETrackSlot2 != null && o.LJ(str, "root_item") && !z3 && !z2)) {
            return false;
        }
        if (o.LJ(anonymousClass523.LJ, "bottom_item_effect_edit_") && this.LJ) {
            return false;
        }
        return this.LJIIJ.contains(anonymousClass523.LJ);
    }
}
