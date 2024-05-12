package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gl8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42438Gl8 extends ClickableSpan {
    public final /* synthetic */ C42437Gl7 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        if (this.LJLIL.LJLILLLLZI.isPhotoMode()) {
            ReplaceMusicDownloadService.LIZJ().LIZ(this.LJLILLLLZI, this.LJLIL.LJLILLLLZI);
        } else {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLILLLLZI);
            if (LJIJJ != null) {
                C42437Gl7 c42437Gl7 = this.LJLIL;
                IReplaceMusicDownloadService LIZJ = ReplaceMusicDownloadService.LIZJ();
                String aid = c42437Gl7.LJLILLLLZI.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                LIZJ.LIZIZ(LJIJJ, aid, "copyright");
            }
        }
        String aid2 = this.LJLIL.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        Music music = this.LJLIL.LJLILLLLZI.getMusic();
        if (music != null) {
            str = music.getIdStr();
        } else {
            str = null;
        }
        C2UQ.LIZ(aid2, str, "replace");
        C42437Gl7 c42437Gl72 = this.LJLIL;
        c42437Gl72.LJLJJL = true;
        AKH akh = c42437Gl72.LJLJJI;
        if (akh != null) {
            akh.LIZ();
        } else {
            o.LJIJI("copyrightViolationNotice");
            throw null;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Integer LJI = C79045V0n.LJI(R.attr.e2, this.LJLILLLLZI);
        if (LJI != null) {
            ds.setColor(LJI.intValue());
            T5S t5s = new T5S();
            t5s.LIZ(62);
            ds.setTypeface(t5s.getTypeface());
        }
        ds.setUnderlineText(false);
    }

    public C42438Gl8(C42437Gl7 c42437Gl7, Context context) {
        this.LJLIL = c42437Gl7;
        this.LJLILLLLZI = context;
    }
}
