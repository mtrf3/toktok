package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C240719cZ;
import X.C32151Nz;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C7Y9;
import X.C7YF;
import X.C8FC;
import X.C99W;
import X.EnumC240399c3;
import X.FMX;
import X.OUP;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellThirdLineAssem extends DefaultThirdLineAssem {
    public final C55749LuL LLFFF;

    public MusicCellThirdLineAssem() {
        new LinkedHashMap();
        this.LLFFF = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem
    public final void m4(EnumC240399c3 pinStatus, MusicModel model, boolean z) {
        String str;
        Object obj;
        MusicReleaseInfo musicReleaseInfo;
        o.LJIIIZ(pinStatus, "pinStatus");
        o.LJIIIZ(model, "model");
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(model.getPresenterDuration()));
            int i = 4;
            if (C7Y9.LIZ() && pinStatus == EnumC240399c3.PINNED && !z) {
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
            MusicReleaseInfo musicReleaseInfo2 = model.getMusicReleaseInfo();
            if (musicReleaseInfo2 != null && musicReleaseInfo2.isNewReleaseSong()) {
                HashMap hashMap = new HashMap();
                if (((OriginMusicArg) this.LLFFF.getValue()).isMe()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                hashMap.put("enter_from", str);
                hashMap.put("music_id", model.getMusicId());
                hashMap.put("group_id", model.getAwemeId());
                String str2 = "1";
                if (C7Y9.LIZ()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("music_new_show", obj);
                hashMap.put("location", "music_tab");
                if (!((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("highlight", str2);
                FMX.LJIIL("new_release_show", hashMap);
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
