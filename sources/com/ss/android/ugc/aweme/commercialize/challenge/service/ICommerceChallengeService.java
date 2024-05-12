package com.ss.android.ugc.aweme.commercialize.challenge.service;

import X.C201577vd;
import X.NTG;
import X.T55;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public interface ICommerceChallengeService {
    T55 LIZ();

    void LIZJ(String str, String str2);

    void LIZLLL(Challenge challenge);

    void LJ();

    LinkedHashMap<String, Bitmap> LJFF();

    void LJI(int i);

    void LJII();

    void LJIIIIZZ(String str, String str2);

    void LJIIIZ(Uri uri, String str);

    void LJIIJ(String str, String str2);

    void LJIIJJI(TextView textView, Aweme aweme, SpannableString spannableString);

    void LJIIL(TextExtraStruct textExtraStruct);

    boolean LJIILIIL(String str);

    boolean LJIILJJIL(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2);

    boolean LJIILL(Challenge challenge);

    void LJIILLIIL(NTG ntg);

    void LJIIZILJ(C201577vd c201577vd, Aweme aweme, String str);

    UrlModel LJIJ(String str, boolean z, boolean z2);

    boolean LJIJI(Context context, String str, boolean z, TextView textView, boolean z2, String str2);

    boolean LJIJJ(Challenge challenge);

    Aweme LJIJJLI(Aweme aweme);

    void LJIL(String str);
}
