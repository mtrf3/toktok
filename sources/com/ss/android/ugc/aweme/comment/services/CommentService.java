package com.ss.android.ugc.aweme.comment.services;

import X.ActivityC45651qj;
import X.C174366sq;
import X.C175426uY;
import X.C176996x5;
import X.C177156xL;
import X.C75J;
import X.C76800UCe;
import X.C76F;
import X.C79R;
import X.C79S;
import X.EnumC178066yo;
import X.EnumC178426zO;
import X.InterfaceC177046xA;
import X.InterfaceC178126yu;
import X.InterfaceC178496zV;
import X.InterfaceC1794272k;
import X.InterfaceC1800674w;
import X.InterfaceC55317LnN;
import X.InterfaceC65784Pro;
import X.M89;
import X.ViewOnClickListenerC178036yl;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.widget.CommentPreloadInstanceTask;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadTask;
import com.ss.android.ugc.aweme.comment.service.assem.CommentHomeViewPagerAssem;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public interface CommentService {
    public static final C175426uY LIZ = C175426uY.LIZ;

    void LIZ(Context context);

    List LIZIZ(Context context, CommentStruct commentStruct, Aweme aweme);

    boolean LIZJ(Aweme aweme, M89 m89);

    InterfaceC55317LnN LIZLLL(View view, FragmentManager fragmentManager, String str, InterfaceC178496zV interfaceC178496zV, InterfaceC178126yu interfaceC178126yu, String str2);

    boolean LJ(String str, Aweme aweme);

    void LJFF(Activity activity, Aweme aweme, String str, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str2, boolean z2);

    String LJI(Aweme aweme);

    void LJII(Context context);

    boolean LJIIIIZZ();

    List<String> LJIIIZ(boolean z);

    void LJIIJ(Context context, FragmentManager fragmentManager, CommentRethinkPopup commentRethinkPopup, boolean z, String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, String str3);

    boolean LJIIJJI();

    void LJIIL(Comment comment, String str);

    void LJIILIIL(String str);

    String LJIILJJIL(String str);

    BaseCommentResponse LJIILL(String str, String str2, String str3);

    boolean LJIILLIIL(Aweme aweme);

    CommentViewModel LJIIZILJ(ActivityC45651qj activityC45651qj);

    void LJIJ();

    void LJIJI(Context context, QaStruct qaStruct, String str, String str2, String str3, String str4, String str5, String str6);

    void LJIJJ(Aweme aweme, CharSequence charSequence, String str, String str2, String str3, String str4, int i, C177156xL c177156xL);

    boolean LJIJJLI(ViewGroup viewGroup, Aweme aweme, M89 m89);

    void LJIL(String str, Aweme aweme);

    EnumC178426zO LJJ(Aweme aweme);

    void LJJI();

    boolean LJJIFFI(Context context, Exception exc);

    void LJJII(int i, String str, List list);

    boolean LJJIII(M89 m89, Aweme aweme, Boolean bool, Integer num, String str);

    CommentPreloadTask LJJIIJ(Context context);

    List<TextExtraStruct> LJJIIJZLJL(Context context, CommentStruct commentStruct);

    boolean LJJIIZ(Context context);

    ViewOnClickListenerC178036yl LJJIIZI(Context context, Fragment fragment, Comment comment, Aweme aweme, EnumC178066yo enumC178066yo, RecyclerView.ViewHolder viewHolder);

    void LJJIJ(Aweme aweme, Integer num, int i);

    boolean LJJIJIIJI(Aweme aweme);

    boolean LJJIJIIJIL(int i);

    CommentListPageFragment LJJIJIL(Activity activity, Aweme aweme, C174366sq c174366sq);

    void LJJIJL(C76F c76f, String str, String str2, String str3);

    void LJJIJLIJ(Context context, Aweme aweme, M89 m89, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    CommentPreloadInstanceTask LJJIL();

    void LJJIZ(Context context, int i, String str);

    void LJJJ(Fragment fragment, Aweme aweme, InterfaceC1794272k interfaceC1794272k);

    CommentHomeViewPagerAssem LJJJI();

    List<C75J> LJJJIL(ActivityC45651qj activityC45651qj);

    void LJJJJ(ViewGroup viewGroup, Aweme aweme, M89 m89);

    List LJJJJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AqS153S0100000_3 aqS153S0100000_3);

    void LJJJJIZL(String str, boolean z);

    void LJJJJJ(String str);

    boolean LJJJJJL(ViewStub viewStub, M89 m89, Aweme aweme);

    void LJJJJL();

    C79R LJJJJLI(C79S c79s);

    void LJJJJLL();

    void LJJJJZ(InterfaceC1800674w interfaceC1800674w);

    void LJJJJZI(int i, String str, String str2, String str3, String str4);

    CommentStruct LJJJLIIL(Aweme aweme);

    CommentRefactorPreloadTask LJJJLL();

    C176996x5 LJJJLZIJ(Fragment fragment, int i, InterfaceC177046xA interfaceC177046xA);

    String LJJJZ(CommentStruct commentStruct);

    void removeAllCache();
}
