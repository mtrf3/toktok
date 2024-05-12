package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import java.util.HashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6VM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VM implements AnonymousClass684 {
    public final AVETParameter LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 314));

    public final C145995oB LJIIIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-baseParams>(...)");
        return (C145995oB) value;
    }

    public C6VM(AVETParameter aVETParameter) {
        this.LIZ = aVETParameter;
    }

    @Override // X.AnonymousClass684
    public final void LIZ(C6VN c6vn) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("text_id", c6vn.LIZIZ);
        GXR.LIZ("edit_cover_text", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LIZIZ(C6VN c6vn) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("text_id", c6vn.LIZIZ);
        LJIIIZ.LJI("font_id", c6vn.LIZJ);
        LJIIIZ.LJI("font_name", c6vn.LIZLLL);
        LJIIIZ.LJI("text_color", c6vn.LJ);
        LJIIIZ.LJI("text_style", c6vn.LJFF);
        GXR.LIZ("complete_cover_text", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LIZJ(String str) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("font", str);
        LJIIIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("select_text_font", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LIZLLL(int i) {
        C145995oB LJIIIZ = LJIIIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(Integer.toHexString(i));
        LJIIIZ.LJI("color", X1D.LIZIZ(LIZ));
        LJIIIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("select_text_color", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LJ(String alignStr) {
        o.LJIIIZ(alignStr, "alignStr");
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("paragraph_style", alignStr);
        LJIIIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("select_text_paragraph", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LJFF(C6VN c6vn) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LIZ(c6vn.LJIIIIZZ, "is_toasted");
        GXR.LIZ("cancel_cover_edit", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LJI(C6VN c6vn) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("text_id", c6vn.LIZIZ);
        GXR.LIZ("select_cover_text_type", LJIIIZ.LIZ);
    }

    @Override // X.AnonymousClass684
    public final void LJII(C6VN c6vn) {
        String str;
        String str2;
        if (C1DG.LJIIIIZZ()) {
            return;
        }
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LJI("text_id", c6vn.LIZIZ);
        LJIIIZ.LJI("font_id", c6vn.LIZJ);
        LJIIIZ.LJI("font_name", c6vn.LIZLLL);
        LJIIIZ.LJI("text_color", c6vn.LJ);
        LJIIIZ.LJI("text_style", c6vn.LJFF);
        LJIIIZ.LIZ(c6vn.LJI, "is_text");
        LJIIIZ.LIZ(c6vn.LJII, "is_pic_adjust");
        if (c6vn.LIZ) {
            str = "edit_post_page";
        } else {
            str = "video_post_page";
        }
        LJIIIZ.LJI("enter_from", str);
        if (c6vn.LIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIZ.LJI("after_post", str2);
        java.util.Map<String, String> extras = LJIIIZ.LIZ;
        if (c6vn.LJIIIZ != null) {
            o.LJIIIIZZ(extras, "extras");
            ((HashMap) extras).put("aweme_type", String.valueOf(c6vn.LJIIIZ));
        }
        GXR.LIZ("save_cover_edit", extras);
    }

    @Override // X.AnonymousClass684
    public final void LJIIIIZZ(int i) {
        C145995oB LJIIIZ = LJIIIZ();
        LJIIIZ.LIZ(i, "text_style");
        LJIIIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("select_text_style", LJIIIZ.LIZ);
    }
}
