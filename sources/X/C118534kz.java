package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushReverseExp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118534kz {
    public final C31Y LIZ;
    public final java.util.Map<String, Integer> LIZIZ;
    public int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZ() {
        Activity LJIIIIZZ;
        Fragment LJIILIIL;
        Aweme LIZIZ;
        InterfaceC118544l0 interfaceC118544l0;
        if ((InnerPushReverseExp.LIZ() && ORY.LJJIJ(21, (int[]) InnerPushReverseExp.LIZJ.getValue())) || !C80993Fv.LIZ().LIZ.getBoolean("key_mt_inner_push_switch_on", true)) {
            return 2;
        }
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        Fragment fragment = null;
        if (!(LJIIIIZZ2 instanceof AbstractViewOnClickListenerC105754Db) && !(LJIIIIZZ2 instanceof GroupChatDetailActivity)) {
            if (LJIIIIZZ2 != null) {
                fragment = C70657RoD.LJIILIIL(LJIIIIZZ2);
            }
            if ((fragment instanceof NewChatRoomFragment) || (fragment instanceof SelectChatMsgFragment) || (fragment instanceof SessionListFragmentV2) || ((LinkedHashMap) this.LIZIZ).containsValue(2)) {
                return 2;
            }
            if (C85773Yf.LJLJI != null && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != 0) {
                String localClassName = LJIIIIZZ.getLocalClassName();
                o.LJIIIIZZ(localClassName, "curActivity.localClassName");
                if (!TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") && ((!(LJIIIIZZ instanceof InterfaceC118544l0) || (interfaceC118544l0 = (InterfaceC118544l0) LJIIIIZZ) == null || !interfaceC118544l0.LJJIJL()) && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.adaptation.saa.SAAActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity") && !TextUtils.equals(localClassName, "com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity") && !TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity") && ((LJIILIIL = C70657RoD.LJIILIIL(LJIIIIZZ)) == null || (!TextUtils.equals(LJIILIIL.getClass().getName(), "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment") && !TextUtils.equals(LJIILIIL.getClass().getName(), "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment2"))))) {
                    C118554l1.LIZ().getClass();
                    C78694UuY.LIZ().LIZ();
                    if (((((LJIIIIZZ instanceof InterfaceC55058LjC) && (((InterfaceC55058LjC) LJIIIIZZ).getCurFragment() instanceof InterfaceC54054LJi)) || (LJIIIIZZ instanceof DetailActivity)) && (LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ)) != null && LIZIZ.isAd()) || ((LinkedHashMap) this.LIZIZ).containsValue(1)) {
                        return 1;
                    }
                    return 0;
                }
            }
            return 1;
        }
        return 2;
    }

    public C118534kz(C31Q callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZ = callback;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = 2;
        this.LIZJ = LIZ();
    }
}
