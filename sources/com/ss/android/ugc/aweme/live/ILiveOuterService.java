package com.ss.android.ugc.aweme.live;

import X.C1PH;
import X.C28838BTm;
import X.C31130CJq;
import X.C32186CkA;
import X.C35692Dzc;
import X.C36933EeX;
import X.C38957FQr;
import X.C40116Fom;
import X.C47192Ifc;
import X.C53508KzI;
import X.C54710Lda;
import X.C54742Le6;
import X.C55077LjV;
import X.C55382LoQ;
import X.C62046OWs;
import X.C71272Ry8;
import X.C72929Sjl;
import X.C73994T2g;
import X.C78461Uqn;
import X.C78473Uqz;
import X.C78484UrA;
import X.C83575Wr5;
import X.C86393XvR;
import X.EnumC28411BDb;
import X.EnumC72797Shd;
import X.InterfaceC32188CkC;
import X.InterfaceC39796Fjc;
import X.InterfaceC78482Ur8;
import X.LQF;
import X.V2B;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingDialog;

/* loaded from: classes14.dex */
public interface ILiveOuterService {
    C47192Ifc LIZ();

    void LIZIZ();

    void LIZJ();

    C83575Wr5 LIZLLL();

    boolean LJ();

    void LJFF(InterfaceC39796Fjc interfaceC39796Fjc);

    void LJI(String str);

    void LJII();

    void LJIIIIZZ(Context context);

    void LJIIIZ(C40116Fom c40116Fom);

    void LJIIJ(Context context, String str);

    void LJIIJJI();

    void LJIIL();

    C72929Sjl LJIILIIL();

    boolean LJIILJJIL();

    C78461Uqn LJIILL();

    BasePreviewSettingDialog LJIILLIIL(EnumC28411BDb enumC28411BDb);

    boolean LJIIZILJ(Activity activity);

    C54742Le6 LJIJ();

    C35692Dzc LJIJI();

    C71272Ry8 LJIJJ();

    void LJIJJLI();

    void LJIL();

    void LJJ(Fragment fragment, int i, Uri uri);

    C31130CJq LJJI();

    C36933EeX LJJIFFI();

    void LJJII();

    C53508KzI LJJIII();

    C38957FQr LJJIIJ();

    InteractServiceDel LJJIIJZLJL();

    void LJJIIZ();

    void LJJIIZI();

    boolean LJJIJ();

    boolean LJJIJIIJI();

    void LJJIJIIJIL();

    C86393XvR LJJIJIL();

    DialogFragment LJJIJL(EnumC28411BDb enumC28411BDb);

    void LJJIJLIJ();

    String LJJIL();

    C55382LoQ LJJIZ();

    String LJJJ(Context context, Uri uri);

    C1PH LJJJI();

    C78473Uqz LJJJIL();

    String LJJJJ();

    void LJJJJI(Context context, String str);

    C62046OWs LJJJJIZL();

    C78484UrA LJJJJJ();

    void LJJJJJL();

    C54710Lda LJJJJL();

    C73994T2g LJJJJLI();

    LQF LJJJJLL(boolean z);

    void LJJJJZ(long j);

    C32186CkA LJJJJZI(InterfaceC32188CkC interfaceC32188CkC, EnumC72797Shd enumC72797Shd);

    void LJJJLIIL(Activity activity, int i, Uri uri);

    C28838BTm getLivePreloadService();

    C55077LjV getLiveStateManager();

    boolean isBroadcastSmoothGoLive();

    void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC78482Ur8 interfaceC78482Ur8);

    void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    V2B startLiveManager();
}
