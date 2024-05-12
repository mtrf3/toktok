package com.ss.android.ugc.aweme.music.search.cell;

import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C7Y9;
import X.C7YF;
import X.C8FC;
import X.C99W;
import X.EnumC240399c3;
import X.OUP;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.search.SearchMusicArg;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicCellThirdLineAssem extends DefaultThirdLineAssem {
    public final C55749LuL LLFFF;

    public SearchMusicCellThirdLineAssem() {
        new LinkedHashMap();
        this.LLFFF = new C55749LuL(C47704Ins.LIZJ(this, SearchMusicArg.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem
    public final void m4(EnumC240399c3 pinStatus, MusicModel model, boolean z) {
        MusicReleaseInfo musicReleaseInfo;
        o.LJIIIZ(pinStatus, "pinStatus");
        o.LJIIIZ(model, "model");
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(model.getPresenterDuration()));
            int i = 4;
            if (C7Y9.LIZ() && pinStatus == EnumC240399c3.PINNED && (((SearchMusicArg) this.LLFFF.getValue()).isMe() || !z)) {
                C7YF c7yf = new C7YF(context, null, 0);
                if (C99W.LIZ) {
                    OUP.LJJJJLI(c7yf, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
                }
                c7yf.setFont(72);
                c7yf.setText(R.string.jiv);
                C8FC c8fc = new C8FC(c7yf);
                SpannableString spannableString = new SpannableString(" ");
                spannableString.setSpan(c8fc, spannableString.length() - 1, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            if (C7Y9.LIZ() && (musicReleaseInfo = model.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                C7YF c7yf2 = new C7YF(context, null, 0);
                if (C99W.LIZ) {
                    OUP.LJJJJLI(c7yf2, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
                }
                c7yf2.setFont(72);
                C8FC c8fc2 = new C8FC(c7yf2);
                SpannableString spannableString2 = new SpannableString(" ");
                spannableString2.setSpan(c8fc2, spannableString2.length() - 1, spannableString2.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
            TuxTextView tuxTextView = this.LLFF;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
            }
            TuxTextView tuxTextView2 = this.LLFF;
            if (tuxTextView2 == null) {
                return;
            }
            if (model.getPresenterDuration() > 0) {
                i = 0;
            }
            tuxTextView2.setVisibility(i);
        }
    }
}
