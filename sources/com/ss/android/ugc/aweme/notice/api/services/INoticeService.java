package com.ss.android.ugc.aweme.notice.api.services;

import X.AbstractC53764L8e;
import X.ActivityC45651qj;
import X.C54251LQx;
import X.EFM;
import X.InterfaceC54240LQm;
import X.InterfaceC55337Lnh;
import X.InterfaceC55887LwZ;
import X.LR8;
import X.MS3;
import X.MWC;
import X.SI5;
import X.SIT;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Locale;

/* loaded from: classes10.dex */
public interface INoticeService {
    void LIZ(Context context, GuideOutPushParam guideOutPushParam);

    MWC LIZIZ();

    <T extends CommonPageFragment> Class<? extends T> LIZJ();

    Class<?> LIZLLL(Context context, GuideOutPushParam guideOutPushParam, MS3 ms3);

    void LJ(WeakHandler weakHandler, String str);

    Intent LJFF(Context context);

    void LJI(InterfaceC55887LwZ interfaceC55887LwZ);

    String LJII(String str, String str2);

    void LJIIIIZZ(int i);

    void LJIIIZ(int i);

    void LJIIJ();

    int LJIIJJI();

    <T extends AmeBaseFragment> Class<? extends T> LJIIL();

    void LJIILIIL();

    InterfaceC55337Lnh LJIILJJIL();

    void LJIILL(WeakHandler weakHandler, String str);

    boolean LJIILLIIL(Context context);

    boolean LJIIZILJ();

    void LJIJ(InterfaceC55887LwZ interfaceC55887LwZ);

    View.OnClickListener LJIJI(Context context);

    void LJIJJ();

    boolean LJIJJLI(BaseResponse baseResponse);

    LR8 LJIL(ActivityC45651qj activityC45651qj);

    void LJJ(Context context);

    boolean LJJI(boolean z);

    void LJJIFFI(Context context);

    void LJJII(C54251LQx c54251LQx);

    SIT LJJIII(SI5 si5);

    void LJJIIJ();

    InterfaceC54240LQm LJJIIJZLJL();

    boolean LJJIIZ(BaseResponse baseResponse);

    AbstractC53764L8e LJJIIZI();

    String LJJIJ();

    Intent LJJIJIIJI(Context context, String str);

    void LJJIJIIJIL();

    EFM LJJIJIL();

    boolean LJJIJL(Context context);

    boolean LJJIJLIJ(Context context, User user, boolean z);

    Object LJJIL();

    void LJJIZ(boolean z);

    void LJJJ();

    void LJJJI();

    void LJJJIL(NoticeList noticeList);

    void LJJJJ();

    void LJJJJI(Context context, GuideOutPushParam guideOutPushParam);

    boolean LJJJJIZL();

    void initLegoInflate();

    void notifyLocaleChange(Locale locale);
}
