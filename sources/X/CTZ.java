package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TTEXT_MODEL; */
/* loaded from: classes6.dex */
public final class CTZ extends C6L {
    public final /* synthetic */ CQK LJLJJL;
    public final /* synthetic */ CUF<TEXT_MODEL, PINNED_MODEL> LJLJJLL;

    @Override // X.C8FQ
    public final void LIZ(View view) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // X.C6L
    public final void LIZIZ(View widget) {
        DataChannel dataChannel;
        String str;
        o.LJIIIZ(widget, "widget");
        ((CSC) this.LJLJJL).LJJIZ(false);
        CQQ cqq = this.LJLJJLL.LJLIL;
        if (cqq != null) {
            cqq.LJFF(this.LJLJJL);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_undo_translate_comment");
        CQQ cqq2 = this.LJLJJLL.LJLIL;
        Boolean bool = null;
        if (cqq2 != null) {
            dataChannel = cqq2.LJIIIIZZ;
        } else {
            dataChannel = null;
        }
        LIZ.LJIILLIIL(dataChannel);
        CQQ cqq3 = this.LJLJJLL.LJLIL;
        if (cqq3 != null) {
            bool = Boolean.valueOf(cqq3.LJFF);
        }
        if (C29306Beo.LJJIFFI(bool)) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ("revert_icon", "click_icon");
        LIZ.LJIJJ(Long.valueOf(this.LJLJJL.LJLILLLLZI()), "to_user_id");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Incorrect types in method signature: (TTEXT_MODEL;LX/CUF<TTEXT_MODEL;TPINNED_MODEL;>;)V */
    public CTZ(CQK cqk, CUF cuf) {
        this.LJLJJL = cqk;
        this.LJLJJLL = cuf;
    }
}
