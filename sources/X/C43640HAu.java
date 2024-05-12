package X;

import android.util.Size;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HAu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43640HAu implements InterfaceC45485HtB {
    @Override // X.InterfaceC45485HtB
    public final void LJ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("content_type", "mv");
        c145995oB.LJI("upload_type", "multiple_content");
        FMX.LJIIL("select_photo_album", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIJ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", shortVideoContext.enterFrom);
        FMX.LJIIL("move_timeline_button", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZIZ(ShortVideoContext shortVideoContext, ArrayList arrayList) {
        String str;
        String str2;
        if (C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return;
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((MediaModel) it.next()).duration;
        }
        C145995oB c145995oB = new C145995oB();
        String str3 = "";
        if (shortVideoContext == null || (str = shortVideoContext.LJI()) == null) {
            str = "";
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LIZIZ(j, "creation_duration");
        c145995oB.LJI("content_source", "upload");
        if (shortVideoContext != null && (str2 = shortVideoContext.shootWay) != null) {
            str3 = str2;
        }
        c145995oB.LJI("shoot_way", str3);
        int i = 1;
        if (arrayList.size() <= 1) {
            i = 0;
        }
        c145995oB.LIZ(i, "is_multi_content");
        c145995oB.LJI("enter_method", "manual");
        FMX.LJIIL("re_enter_upload_page", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZLLL(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        String str3;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (shortVideoContext == null || (str = shortVideoContext.LJI()) == null) {
            str = "";
        }
        c145995oB.LJI("creation_id", str);
        if (shortVideoContext != null && (str3 = shortVideoContext.shootWay) != null) {
            str4 = str3;
        }
        c145995oB.LJI("shoot_way", str4);
        if (z) {
            str2 = "multiple";
        } else {
            str2 = "single";
        }
        c145995oB.LJI("to_status", str2);
        FMX.LJIIL("change_upload_mode", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LJFF(ShortVideoContext shortVideoContext, MediaState previewMediaState) {
        String str;
        String str2;
        int i;
        String str3;
        o.LJIIIZ(previewMediaState, "previewMediaState");
        if (previewMediaState.getMedia() != null) {
            C145995oB c145995oB = new C145995oB();
            String str4 = "";
            if (shortVideoContext == null || (str = shortVideoContext.LJI()) == null) {
                str = "";
            }
            c145995oB.LJI("creation_id", str);
            if (shortVideoContext != null && (str3 = shortVideoContext.shootWay) != null) {
                str4 = str3;
            }
            c145995oB.LJI("shoot_way", str4);
            if (previewMediaState.getMedia().LJI()) {
                str2 = "video";
            } else {
                str2 = "photo";
            }
            c145995oB.LJI("content_type", str2);
            if (previewMediaState.getMedia().selectIndex >= 0) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_select");
            FMX.LJIIL("slide_content_detail", c145995oB.LIZ);
        }
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIL(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        String str3;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (shortVideoContext == null || (str = shortVideoContext.LJI()) == null) {
            str = "";
        }
        c145995oB.LJI("creation_id", str);
        if (shortVideoContext != null && (str3 = shortVideoContext.shootWay) != null) {
            str4 = str3;
        }
        c145995oB.LJI("shoot_way", str4);
        if (z) {
            str2 = "click";
        } else {
            str2 = "slide";
        }
        c145995oB.LJI("enter_method", str2);
        FMX.LJIIL("album_scroll", c145995oB.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.InterfaceC45485HtB
    public final void LJIIIIZZ(ShortVideoContext shortVideoContext, long j, long j2) {
        ?? r4;
        String str;
        ?? r5 = 0;
        if (shortVideoContext != null) {
            r4 = shortVideoContext.LJJIJ();
            r5 = shortVideoContext.LJJIJIIJIL();
        } else {
            r4 = 0;
        }
        ?? c145995oB = new C145995oB();
        c145995oB.LIZIZ(System.currentTimeMillis() - j, "first_selection_duration");
        c145995oB.LIZIZ(System.currentTimeMillis() - j2, "page_stay_duration");
        c145995oB.LIZ(r4, "is_use_sound_sync");
        c145995oB.LIZ(r5, "is_ugc_template_from_anchor");
        if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        GXR.LIZ("upload_page_duration", c145995oB.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.InterfaceC45485HtB
    public final void LJII(ShortVideoContext shortVideoContext, MyMediaModel media, String str, String str2) {
        ?? r5;
        String str3;
        String str4;
        String str5;
        o.LJIIIZ(media, "media");
        int i = 0;
        if (shortVideoContext != null) {
            r5 = shortVideoContext.LJJIJ();
        } else {
            r5 = 0;
        }
        ?? c145995oB = new C145995oB();
        if (shortVideoContext == null || (str3 = shortVideoContext.LJI()) == null) {
            str3 = "";
        }
        c145995oB.LJI("creation_id", str3);
        if (shortVideoContext == null || (str5 = shortVideoContext.shootWay) == null) {
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = str5;
        }
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LIZ(r5, "is_use_sound_sync");
        if (media.LJI()) {
            str4 = "video";
        } else {
            str4 = "photo";
        }
        c145995oB.LJI("content_type", str4);
        if (media.selectIndex >= 0) {
            i = 1;
        }
        c145995oB.LIZ(i, "is_select");
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("mv_id", str);
        FMX.LJIIL("click_content_detail", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, String str3, int i, int i2, String str4) {
        String str5;
        String LJI;
        String str6;
        if (i > 0) {
            if (i2 > 0) {
                str5 = "mix";
            } else {
                str5 = "photo";
            }
        } else if (i2 > 0) {
            str5 = "video";
        } else {
            str5 = "no_content";
        }
        C145995oB c145995oB = new C145995oB();
        if (str4 == null) {
            str4 = "album_panel";
        }
        c145995oB.LJI("enter_from", str4);
        if (shortVideoContext == null || (str6 = shortVideoContext.shootWay) == null) {
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = str6;
        }
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("content_type", str5);
        if (shortVideoContext == null || (LJI = shortVideoContext.LJI()) == null) {
            if (str3 == null) {
                str3 = "";
            }
        } else {
            str3 = LJI;
        }
        c145995oB.LJI("creation_id", str3);
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("mv_id", str);
        FMX.LJIIL("exit_upload_page", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LJI(String str, String str2, String str3, long j, String str4, ArrayList<MyMediaModel> arrayList, boolean z, String str5) {
        int i;
        String str6 = str5;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator<MyMediaModel> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().LJ() && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        int size = arrayList.size() - i;
        C145995oB c145995oB = new C145995oB();
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        if (str2 == null) {
            str2 = "";
        }
        c145995oB.LJI("creation_id", str2);
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("content_type", str3);
        c145995oB.LIZIZ(j, "creation_duration");
        if (arrayList.size() > 1) {
            i2 = 1;
        }
        c145995oB.LIZ(i2, "is_multi_content");
        if (str6 == null) {
            str6 = "";
        }
        c145995oB.LJI("music_id", str6);
        c145995oB.LIZ(i, "pic_cnt");
        c145995oB.LIZ(size, "video_cnt");
        c145995oB.LIZ(z ? 1 : 0, "is_editor_pro");
        if (str4 != null) {
            c145995oB.LIZLLL("draft_way", str4);
        }
        FMX.LJIIL("click_content_tab", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45485HtB
    public final void LJIIJJI(ShortVideoContext shortVideoContext, String str, int i, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4) {
        String str4;
        String str5;
        String LJI;
        C145995oB c145995oB = new C145995oB();
        if (shortVideoContext == null || (LJI = shortVideoContext.LJI()) == null) {
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = LJI;
        }
        c145995oB.LJI("creation_id", str2);
        if (shortVideoContext == null || (str5 = shortVideoContext.shootWay) == null) {
            if (str3 == null) {
                str3 = "";
            }
        } else {
            str3 = str5;
        }
        c145995oB.LJI("shoot_way", str3);
        c145995oB.LJI("tab_name", str);
        c145995oB.LIZ(z4 ? 1 : 0, "is_upload_direct_enter");
        c145995oB.LIZ(z ? 1 : 0, "is_editor_pro");
        c145995oB.LIZ(z2 ? 1 : 0, "is_pip");
        c145995oB.LIZ(z3 ? 1 : 0, "is_replace");
        if (i == 15) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_through_library", str4);
        FMX.LJIIL("click_upload_tab", c145995oB.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v19 */
    @Override // X.InterfaceC45485HtB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r8, X.EnumC44979Hl1 r9, java.lang.String r10, android.util.Size r11, java.lang.String r12, int r13, java.lang.Integer r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, java.lang.String r19, int r20, int r21, boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43640HAu.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.Hl1, java.lang.String, android.util.Size, java.lang.String, int, java.lang.Integer, boolean, boolean, boolean, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // X.InterfaceC45485HtB
    public final void LIZ(ShortVideoContext shortVideoContext, List list, EnumC44979Hl1 enumC44979Hl1, String str, Size size, String str2, int i, Integer num, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, int i2, int i3, boolean z5, boolean z6) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String LJIJI;
        if (C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return;
        }
        long j = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j += ((MediaModel) it.next()).duration;
            }
        }
        String str11 = "";
        String str12 = null;
        if (z) {
            str5 = "click_button";
        } else if (z6) {
            str5 = "click_upload_tab";
        } else if (shortVideoContext == null || (str5 = shortVideoContext.enterAlbumMethod) == null) {
            str5 = "";
        }
        ?? c145995oB = new C145995oB();
        c145995oB.LIZLLL("content_type", "video");
        boolean z7 = true;
        if (i == 1) {
            str6 = "single_content";
        } else {
            str6 = "multiple_content";
        }
        c145995oB.LIZLLL("upload_type", str6);
        c145995oB.LIZ(i, "current_content_nums");
        if (shortVideoContext == null || (str7 = shortVideoContext.shootWay) == null) {
            if (str4 == null) {
                str7 = "";
            } else {
                str7 = str4;
            }
        }
        c145995oB.LIZLLL("shoot_way", str7);
        if (shortVideoContext == null || (str8 = shortVideoContext.LJI()) == null) {
            if (str3 == null) {
                str8 = "";
            } else {
                str8 = str3;
            }
        }
        c145995oB.LIZLLL("creation_id", str8);
        c145995oB.LIZ(z5 ? 1 : 0, "is_upload_direct_enter");
        if (shortVideoContext != null && (LJIJI = shortVideoContext.LJIJI()) != null) {
            str11 = LJIJI;
        }
        c145995oB.LIZLLL("shoot_tab_name", str11);
        c145995oB.LIZLLL("select_method", "normal");
        c145995oB.LIZLLL("enter_method", str5);
        ?? r6 = 0;
        if (enumC44979Hl1 != null) {
            c145995oB.LIZ(enumC44979Hl1.value, "in_detail");
            if (enumC44979Hl1.value == EnumC44979Hl1.PREVIEW.value && shortVideoContext != null && shortVideoContext.isAutoSelectedAlbumPreview) {
                c145995oB.LIZLLL("select_method", "preview_next_auto");
            }
        }
        if (str != null) {
            c145995oB.LIZLLL("material_ratio", str);
        }
        if (size != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(size.getWidth());
            LIZ.append('*');
            LIZ.append(size.getHeight());
            c145995oB.LIZLLL("content_size", X1D.LIZIZ(LIZ));
        }
        if (shortVideoContext == null || !V16.LJJIJIIJI(shortVideoContext)) {
            z7 = false;
        }
        if (z7) {
            c145995oB.LIZLLL("upload_tab_position", "now");
        }
        c145995oB.LIZIZ(j, "duration_ms");
        c145995oB.LIZ(z ? 1 : 0, "is_editor_pro");
        if (shortVideoContext != null) {
            r6 = shortVideoContext.LJJIJ();
        }
        c145995oB.LIZ(r6, "is_use_sound_sync");
        c145995oB.LIZ(z2 ? 1 : 0, "is_pip");
        c145995oB.LIZ(z3 ? 1 : 0, "is_replace");
        if (C78685UuP.LJJJZ(str2)) {
            c145995oB.LIZLLL("mv_id", str2);
        }
        if (num != null) {
            if (num.intValue() == 15) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            c145995oB.LIZLLL("is_through_library", str10);
        }
        c145995oB.LIZ(z4 ? 1 : 0, "is_from_preview_page");
        c145995oB.LIZ(i2, "is_mv_anchor");
        if (shortVideoContext != null) {
            str9 = shortVideoContext.shootWay;
        } else {
            str9 = null;
        }
        if (o.LJ(str9, "ec_write_review")) {
            RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                str12 = recordPageOptionalConfig.previousPage;
            }
            c145995oB.LIZLLL("previous_page", str12);
        }
        if (V16.LJJIJIIJI(shortVideoContext)) {
            c145995oB.LIZLLL("upload_tab_position", "now");
        }
        c145995oB.LIZ(i3, "is_capcut");
        FMX.LJIIL("choose_upload_content", c145995oB.LIZ);
    }
}
