package com.ss.android.ugc.aweme.ad.comment.depend;

import X.C74R;
import X.InterfaceC1803976d;
import Y.AObjectS52S0101000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public interface IAdCommentDepend extends InterfaceC1803976d {
    boolean LIZ(Context context, Aweme aweme, int i, C74R c74r);

    List LIZIZ(Context context, CommentStruct commentStruct, Aweme aweme);

    void LIZJ(Context context, Aweme aweme);

    NewCommentAdWidget LJ(AObjectS52S0101000_7 aObjectS52S0101000_7);

    boolean LJFF(Aweme aweme);

    void LJII(Context context, String str);

    List<TextExtraStruct> LJIIJ(Context context, CommentStruct commentStruct);

    void LJIIJJI(Context context, String str, String str2);

    String LJIIL();

    void LJIILIIL(Context context, Aweme aweme, String str);

    void LJIILJJIL(AwemeRawAd awemeRawAd);

    void LJIILL(Aweme aweme, String str, boolean z, String str2);

    void LJIIZILJ(Context context, String str, String str2);

    boolean LJIJ(String str);

    CommentHeaderWidget LJIJI(AqS153S0100000_3 aqS153S0100000_3);

    void LJIJJ(Context context, LinkData linkData, Aweme aweme);

    String LJJ(CommentStruct commentStruct);

    List LJJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AqS153S0100000_3 aqS153S0100000_3);

    void LJJIII(Context context, User user);

    void LJJIIJ(String str, Context context, LinkData linkData, Aweme aweme, String str2);
}
