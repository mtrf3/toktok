package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import kotlin.jvm.internal.o;

/* renamed from: X.5px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147095px implements InterfaceC139695e1 {
    public final /* synthetic */ C134665Qg LIZ;

    @Override // X.InterfaceC139695e1
    public final void LIZ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ;
        C138735cT.LJFF(new ShortVideoCommonParams(videoPublishEditModel.mShootWay, H7R.LJIIIIZZ(videoPublishEditModel), H7R.LJIIIZ(this.LIZ.LIZ), this.LIZ.LIZ.getCreationId()));
    }

    @Override // X.InterfaceC139695e1
    public final void LIZIZ() {
        String LJIIIIZZ = H7R.LJIIIIZZ(this.LIZ.LIZ);
        String creationId = this.LIZ.LIZ.getCreationId();
        o.LJIIIIZZ(creationId, "publishEditModel.creationId");
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ;
        String str = videoPublishEditModel.mShootWay;
        String LJIIIZ = H7R.LJIIIZ(videoPublishEditModel);
        String enterFrom = this.LIZ.LIZ.getEnterFrom();
        C188727au c188727au = new C188727au();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = "";
        }
        c188727au.LJIIIZ("content_source", LJIIIIZZ);
        c188727au.LJIIIZ("creation_id", creationId);
        if (LJIIIZ == null) {
            LJIIIZ = "";
        }
        c188727au.LJIIIZ("content_type", LJIIIZ);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("shoot_way", str);
        if (enterFrom == null) {
            enterFrom = "";
        }
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("adjust_text_roll_bar", c188727au.LIZ);
    }

    @Override // X.InterfaceC139695e1
    public final void LJI() {
        String LJIIIIZZ = H7R.LJIIIIZZ(this.LIZ.LIZ);
        String creationId = this.LIZ.LIZ.getCreationId();
        o.LJIIIIZZ(creationId, "publishEditModel.creationId");
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ;
        String str = videoPublishEditModel.mShootWay;
        String LJIIIZ = H7R.LJIIIZ(videoPublishEditModel);
        String enterFrom = this.LIZ.LIZ.getEnterFrom();
        C188727au c188727au = new C188727au();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = "";
        }
        c188727au.LJIIIZ("content_source", LJIIIIZZ);
        c188727au.LJIIIZ("creation_id", creationId);
        if (LJIIIZ == null) {
            LJIIIZ = "";
        }
        c188727au.LJIIIZ("content_type", LJIIIZ);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("shoot_way", str);
        if (enterFrom == null) {
            enterFrom = "";
        }
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("click_color_dropper_entrance", c188727au.LIZ);
    }

    public C147095px(C134665Qg c134665Qg) {
        this.LIZ = c134665Qg;
    }

    @Override // X.InterfaceC139695e1
    public final void LJII(C147105py c147105py) {
        C145995oB LIZ = this.LIZ.LIZ();
        if (c147105py.LIZ) {
            LIZ.LIZLLL("text_added", "1");
            if (c147105py.LIZIZ) {
                LIZ.LIZLLL("anchor_added", "1");
                LIZ.LIZLLL("anchor_type", "wiki");
            }
        }
        LIZ.LIZ(c147105py.LIZLLL, "is_editor_pro");
        LIZ.LIZLLL("text_add_type", c147105py.LIZJ);
        LIZ.LIZLLL("text_type", c147105py.LJ);
        if (o.LJ(c147105py.LJ, "ai_text")) {
            LIZ.LIZ(c147105py.LJIIIZ ? 1 : 0, "is_change_auto_meme");
        }
        if (o.LJ(c147105py.LJ, "caption")) {
            LIZ.LIZLLL("asr_model_lang", this.LIZ.LIZIZ(c147105py.LJFF));
        }
        LIZ.LIZLLL("font", c147105py.LJI);
        LIZ.LIZ(c147105py.LJII ? 1 : 0, "is_text_reading");
        LIZ.LIZLLL("tone_choice_method", "manually");
        LIZ.LIZLLL("tone_id", c147105py.LJIIIIZZ);
        FMX.LJIIL("text_complete", LIZ.LIZ);
    }

    @Override // X.InterfaceC139695e1
    public final void LIZLLL(int i, String str) {
        C145995oB LIZ = this.LIZ.LIZ();
        LIZ.LIZ(i, "is_editor_pro");
        LIZ.LJI("text_type", "caption");
        LIZ.LJI("asr_model_lang", this.LIZ.LIZIZ(str));
        FMX.LJIIL("text_cancel", LIZ.LIZ);
    }

    @Override // X.InterfaceC139695e1
    public final void LJFF(int i, String alignStr, String str, String str2) {
        String str3;
        o.LJIIIZ(alignStr, "alignStr");
        C145995oB LIZ = this.LIZ.LIZ();
        this.LIZ.getClass();
        int parseInt = CastIntegerProtector.parseInt(alignStr);
        if (parseInt != 1) {
            if (parseInt == 2 || parseInt != 3) {
                str3 = "center";
            } else {
                str3 = "right";
            }
        } else {
            str3 = "left";
        }
        LIZ.LJI("paragraph_style", str3);
        LIZ.LIZ(i, "is_editor_pro");
        LIZ.LJI("text_type", str);
        if (o.LJ(str, "caption")) {
            LIZ.LIZLLL("asr_model_lang", this.LIZ.LIZIZ(str2));
        }
        FMX.LJIIL("select_text_paragraph", LIZ.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r6 != 4) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    @Override // X.InterfaceC139695e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r6, int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            X.5Qg r0 = r5.LIZ
            X.5oB r2 = r0.LIZ()
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = ""
            r4.append(r0)
            X.5Qg r0 = r5.LIZ
            r0.getClass()
            r1 = 1
            r3 = 0
            if (r6 == r1) goto L21
            r0 = 2
            if (r6 == r0) goto L22
            r1 = 3
            if (r6 == r1) goto L58
            r0 = 4
            if (r6 == r0) goto L22
        L21:
            r1 = 0
        L22:
            r4.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r4)
            java.lang.String r0 = "text_style"
            r2.LJI(r0, r1)
            java.lang.String r0 = "is_subtitle"
            r2.LIZ(r3, r0)
            java.lang.String r0 = "is_editor_pro"
            r2.LIZ(r7, r0)
            java.lang.String r0 = "text_type"
            r2.LJI(r0, r8)
            java.lang.String r0 = "caption"
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L50
            X.5Qg r0 = r5.LIZ
            java.lang.String r1 = r0.LIZIZ(r9)
            java.lang.String r0 = "asr_model_lang"
            r2.LIZLLL(r0, r1)
        L50:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "select_text_style"
            X.FMX.LJIIL(r0, r1)
            return
        L58:
            r1 = 2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147095px.LJIIIIZZ(int, int, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC139695e1
    public final void LIZJ(TextFontStyleData type, int i, String str, String str2, boolean z) {
        o.LJIIIZ(type, "type");
        C145995oB LIZ = this.LIZ.LIZ();
        LIZ.LJI("font", type.title);
        LIZ.LIZ(0, "is_subtitle");
        LIZ.LIZ(i, "is_editor_pro");
        LIZ.LJI("text_type", str);
        LIZ.LIZ(!z ? 1 : 0, "is_select_all");
        if (o.LJ(str, "caption")) {
            LIZ.LIZLLL("asr_model_lang", this.LIZ.LIZIZ(str2));
        }
        FMX.LJIIL("select_text_font", LIZ.LIZ);
    }

    @Override // X.InterfaceC139695e1
    public final void LJ(int i, int i2, String str, String str2, boolean z) {
        C145995oB LIZ = this.LIZ.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(Integer.toHexString(i));
        LIZ.LJI("color", X1D.LIZIZ(LIZ2));
        LIZ.LIZ(0, "is_subtitle");
        LIZ.LIZ(i2, "is_editor_pro");
        LIZ.LJI("text_type", str);
        LIZ.LIZ(!z ? 1 : 0, "is_select_all");
        if (o.LJ(str, "caption")) {
            LIZ.LIZLLL("asr_model_lang", this.LIZ.LIZIZ(str2));
        }
        FMX.LJIIL("select_text_color", LIZ.LIZ);
    }
}
