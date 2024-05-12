package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SWf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72225SWf implements SXL {
    public final VideoMusicTitleRefactorAssem LIZ;
    public final LinearLayout LIZIZ;
    public final ImageView LIZJ;
    public final TuxIconView LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final InterfaceC88472Yns<VideoItemParams, Boolean> LJFF;
    public final InterfaceC65784Pro<Boolean> LJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJII;

    @Override // X.SXL
    public final void LIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        MusicDetailService.LJIJJ().LJI(item.getAweme());
        C225098sT.LIZ(item, true);
    }

    @Override // X.SXL
    public final boolean LIZIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return this.LJFF.invoke(item).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r2 == null) goto L20;
     */
    @Override // X.SXL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r4) {
        /*
            r3 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.Yns<java.lang.Boolean, X.UCe> r1 = r3.LJII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r0 = com.ss.android.ugc.aweme.music.service.MusicDetailService.LJIJJ()
            r0.LJIIZILJ()
            android.widget.ImageView r0 = r3.LIZJ
            if (r0 == 0) goto L1a
            X.C17N.LJJLIIIJJI(r0)
        L1a:
            android.widget.LinearLayout r0 = r3.LIZIZ
            if (r0 == 0) goto L21
            X.C17N.LJJIIJZLJL(r0)
        L21:
            com.bytedance.tux.icon.TuxIconView r0 = r3.LIZLLL
            if (r0 == 0) goto L28
            X.C17N.LJJIIJZLJL(r0)
        L28:
            android.widget.ImageView r0 = r3.LIZJ
            r2 = 0
            if (r0 == 0) goto L7c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L31:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L38
            r2 = r1
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
        L38:
            X.Pro<java.lang.Boolean> r0 = r3.LJ
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L69
            if (r2 != 0) goto L6c
        L48:
            android.widget.ImageView r0 = r3.LIZJ
            if (r0 != 0) goto L65
        L4c:
            android.widget.ImageView r1 = r3.LIZJ
            if (r1 == 0) goto L56
            r0 = 2131233737(0x7f080bc9, float:1.808362E38)
            r1.setImageResource(r0)
        L56:
            android.widget.ImageView r2 = r3.LIZJ
            if (r2 == 0) goto L64
            com.ss.android.ugc.aweme.utils.Au2S20S0100000_12 r1 = new com.ss.android.ugc.aweme.utils.Au2S20S0100000_12
            r0 = 104(0x68, float:1.46E-43)
            r1.<init>(r3, r0)
            X.C16880lQ.LJIILLIIL(r2, r1)
        L64:
            return
        L65:
            r0.setLayoutParams(r2)
            goto L4c
        L69:
            if (r2 != 0) goto L73
            goto L48
        L6c:
            r0 = 1
            int r0 = X.C7MY.LIZIZ(r0)
            r2.topMargin = r0
        L73:
            r0 = 40
            int r0 = X.C7MY.LIZIZ(r0)
            r2.width = r0
            goto L48
        L7c:
            r1 = r2
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72225SWf.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // X.SXL
    public final boolean LIZLLL(VideoItemParams item, double d) {
        o.LJIIIZ(item, "item");
        return true;
    }

    public C72225SWf(VideoMusicTitleRefactorAssem musicTitleAssem, LinearLayout linearLayout, ImageView imageView, TuxIconView tuxIconView, AqS162S0100000_12 aqS162S0100000_12, AqS170S0100000_4 aqS170S0100000_4, AqS162S0100000_12 aqS162S0100000_122, AqS178S0100000_12 aqS178S0100000_12) {
        o.LJIIIZ(musicTitleAssem, "musicTitleAssem");
        this.LIZ = musicTitleAssem;
        this.LIZIZ = linearLayout;
        this.LIZJ = imageView;
        this.LIZLLL = tuxIconView;
        this.LJ = aqS162S0100000_12;
        this.LJFF = aqS170S0100000_4;
        this.LJI = aqS162S0100000_122;
        this.LJII = aqS178S0100000_12;
    }
}
