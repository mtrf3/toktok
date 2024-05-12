package com.ss.android.ugc.aweme.share;

import X.A97;
import X.ATB;
import X.AUC;
import X.ActivityC45651qj;
import X.C109394Rb;
import X.C111954aN;
import X.C193597il;
import X.C193627io;
import X.C29930Bos;
import X.C38049EwX;
import X.C4KX;
import X.C4RB;
import X.C50420Jqa;
import X.C62188Oau;
import X.C62370Odq;
import X.C62381Oe1;
import X.C62387Oe7;
import X.C62394OeE;
import X.C62407OeR;
import X.C62409OeT;
import X.C62415OeZ;
import X.C62456OfE;
import X.C62594OhS;
import X.C62654OiQ;
import X.C7NR;
import X.C86K;
import X.DialogC62475OfX;
import X.DialogC72721SgP;
import X.InterfaceC62096OYq;
import X.InterfaceC62225ObV;
import X.InterfaceC72642tA;
import X.OXY;
import X.OZS;
import X.ViewOnClickListenerC62596OhU;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.model.Qna;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;

/* loaded from: classes11.dex */
public interface ShareService {
    TuxSheet LIZ(Activity activity, Fragment fragment, Aweme aweme, boolean z, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Bundle bundle);

    void LIZIZ(WeakHandler weakHandler, ActivityC45651qj activityC45651qj, User user, List list, String str);

    ViewOnClickListenerC62596OhU LIZJ(ActivityC45651qj activityC45651qj, Aweme aweme);

    void LIZLLL(Activity activity, C7NR c7nr);

    ATB LJ(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void LJFF(Activity activity, String str, String str2, String str3);

    DialogC62475OfX LJI(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void LJII(ActivityC45651qj activityC45651qj, String str);

    LiveSharePackage LJIIIIZZ(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void LJIIIZ(ActivityC45651qj activityC45651qj, Aweme aweme, Comment comment, Bundle bundle, boolean z, boolean z2, C4KX c4kx);

    TuxSheet LJIIJ(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    OZS LJIIJJI(ActivityC45651qj activityC45651qj, String str, DialogInterface.OnDismissListener onDismissListener);

    void LJIIL(ActivityC45651qj activityC45651qj, Qna qna, C62415OeZ c62415OeZ, String str);

    void LJIILIIL(ActivityC45651qj activityC45651qj, A97 a97);

    TuxSheet LJIILJJIL(Activity activity, Fragment fragment, Aweme aweme, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Bundle bundle);

    DialogC72721SgP LJIILL(User user, Activity activity, AUC auc, String str);

    void LJIILLIIL(Context context, C193627io c193627io);

    void LJIIZILJ(Activity activity, OXY oxy);

    boolean LJIJ(Context context, C193627io c193627io);

    Aweme LJIJI();

    void LJIJJ(Activity activity, C62394OeE c62394OeE, boolean z, boolean z2);

    void LJIJJLI(ActivityC45651qj activityC45651qj, Music music, C62381Oe1 c62381Oe1, List list, String str);

    void LJIL(Context context, boolean z);

    boolean LJJ(Aweme aweme);

    void LJJI(Context context, boolean z);

    void LJJIFFI();

    void LJJII(Activity activity, LiveEvent liveEvent, C111954aN c111954aN, C38049EwX c38049EwX);

    void LJJIII(C62370Odq c62370Odq, SharePackage sharePackage, String str, List list);

    C62387Oe7 LJJIIJ(Activity activity, Qna qna, C62415OeZ c62415OeZ, String str, String str2);

    C62654OiQ LJJIIJZLJL();

    void LJJIIZ(Activity activity, long j);

    void LJJIIZI(ActivityC45651qj activityC45651qj, String str, String str2, Aweme aweme, List list, ShareInfo shareInfo, boolean z, String str3);

    void LJJIJ(Context context, Aweme aweme, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, String str, String str2, String str3, String str4);

    AwemeSharePackage LJJIJIIJI(int i, Context context, Aweme aweme, String str, String str2, String str3);

    C62594OhS LJJIJIIJIL(Activity activity, Aweme aweme, Bundle bundle);

    void LJJIJIL(ActivityC45651qj activityC45651qj, ShareInfo shareInfo, String str, C62456OfE c62456OfE);

    boolean LJJIJL(AVMusic aVMusic, String str);

    void LJJIJLIJ(Activity activity, Bundle bundle);

    C109394Rb LJJIL(ActivityC45651qj activityC45651qj, Aweme aweme, CreateAwemeResponse createAwemeResponse, String[] strArr);

    void LJJIZ(ActivityC45651qj activityC45651qj, C62409OeT c62409OeT);

    void LJJJ(Aweme aweme, ActivityC45651qj activityC45651qj, Uri uri, String str, String str2, SharePackage sharePackage);

    void LJJJI(Activity activity, String str, C62188Oau c62188Oau, String str2, String str3);

    void LJJJIL(Activity activity, C193597il c193597il);

    void LJJJJ(C62394OeE c62394OeE, Activity activity, boolean z);

    void LJJJJI(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    DialogC62475OfX LJJJJIZL(ActivityC45651qj activityC45651qj, Fragment fragment, Aweme aweme, LandscapeFragmentPanel landscapeFragmentPanel, Bundle bundle);

    InterfaceC62225ObV LJJJJJ(Activity activity, Aweme aweme, String str);

    TuxSheet LJJJJJL(Activity activity, SharePackage sharePackage, String str);

    void LJJJJL(Activity activity, C62407OeR c62407OeR, C62415OeZ c62415OeZ, C4RB c4rb);

    void LJJJJLI(ActivityC45651qj activityC45651qj, C86K c86k);

    void LJJJJLL(ActivityC45651qj activityC45651qj, Challenge challenge, List list, String str, boolean z, String str2, String str3, String str4);

    void LJJJJZ(ActivityC45651qj activityC45651qj, Aweme aweme, String str);

    void LJJJJZI(Context context, Fragment fragment, Aweme aweme, boolean z, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Bundle bundle);

    void LJJJLIIL(ActivityC45651qj activityC45651qj, NewFaceStickerBean newFaceStickerBean, String str, List list, String str2);

    Aweme LJJJLL(SharePackage sharePackage);

    void shareSubscribeLink(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);
}
