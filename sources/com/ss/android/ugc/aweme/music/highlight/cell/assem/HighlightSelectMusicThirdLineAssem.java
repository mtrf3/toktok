package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.AnonymousClass391;
import X.C26338AVi;
import X.C32151Nz;
import X.C7YF;
import X.C8FC;
import X.C99W;
import X.EnumC240399c3;
import X.OUP;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectMusicThirdLineAssem extends DefaultThirdLineAssem {
    public HighlightSelectMusicThirdLineAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C26338AVi.LJI(Y3(), null, AnonymousClass391.LIZJ(10), null, null, false, 29);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem
    public final void m4(EnumC240399c3 pinStatus, MusicModel model, boolean z) {
        o.LJIIIZ(pinStatus, "pinStatus");
        o.LJIIIZ(model, "model");
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(model.getPresenterDuration()));
            MusicReleaseInfo musicReleaseInfo = model.getMusicReleaseInfo();
            int i = 0;
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong() && 1 != 0) {
                C7YF c7yf = new C7YF(context, null, 0);
                if (C99W.LIZ) {
                    OUP.LJJJJLI(c7yf, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
                }
                c7yf.setFont(72);
                C8FC c8fc = new C8FC(c7yf);
                SpannableString spannableString = new SpannableString(" ");
                spannableString.setSpan(c8fc, spannableString.length() - 1, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            TuxTextView tuxTextView = this.LLFF;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
            }
            TuxTextView tuxTextView2 = this.LLFF;
            if (tuxTextView2 == null) {
                return;
            }
            if (model.getPresenterDuration() <= 0) {
                i = 4;
            }
            tuxTextView2.setVisibility(i);
        }
    }
}
