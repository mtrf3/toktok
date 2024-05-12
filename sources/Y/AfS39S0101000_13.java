package Y;

import X.AbstractC31497CXt;
import X.B5G;
import X.BCC;
import X.BUL;
import X.C15380j0;
import X.C16880lQ;
import X.C188727au;
import X.C1FO;
import X.C25860ACy;
import X.C26045AKb;
import X.C28467BFf;
import X.C29044Baa;
import X.C29727Blb;
import X.C30868C9o;
import X.C30926CBu;
import X.C44432HcC;
import X.C48691J9b;
import X.C73411SrX;
import X.C75227Tfj;
import X.C75492Tk0;
import X.C75543Tkp;
import X.C75544Tkq;
import X.C75642TmQ;
import X.C75749To9;
import X.C75806Tp4;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76288Twq;
import X.C78488UrE;
import X.C78489UrF;
import X.C78495UrL;
import X.C84763XOl;
import X.CMB;
import X.CN1;
import X.EnumC29732Blg;
import X.FMX;
import X.InterfaceC31127CJn;
import X.InterfaceC31336CRo;
import X.InterfaceC63111Opn;
import X.InterfaceC64592gB;
import X.InterfaceC76359Txz;
import X.InterfaceC78491UrH;
import X.InterfaceC78493UrJ;
import X.InterfaceC78494UrK;
import X.Q7K;
import X.T5T;
import X.TYQ;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.FeedbackResponse;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.model.RegionStatus;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS39S0101000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS39S0101000_13 afS39S0101000_13, Object obj) {
        C28467BFf<BattleInfoResponse> c28467BFf = (C28467BFf) obj;
        if (((C76288Twq) afS39S0101000_13.l0).mView == 0) {
            return;
        }
        BattleInfoResponse info = c28467BFf.data;
        if (C76288Twq.LJJJJL()) {
            C76271TwZ.LIZ.LJJIJL("audience_start", c28467BFf);
        } else {
            o.LJIIIIZZ(info, "info");
            C76272Twa.LJJIJ("audience_start", info, false, false);
        }
        InterfaceC76359Txz interfaceC76359Txz = (InterfaceC76359Txz) ((C76288Twq) afS39S0101000_13.l0).mView;
        if (interfaceC76359Txz == null) {
            return;
        }
        o.LJIIIIZZ(info, "info");
        if (interfaceC76359Txz.b0(info, afS39S0101000_13.i1) || !LiveMatchQualityOptimizeSetting.INSTANCE.enableOptimize()) {
            return;
        }
        ((C76288Twq) afS39S0101000_13.l0).LJJJJI(afS39S0101000_13.i1);
    }

    public static final void accept$1(AfS39S0101000_13 afS39S0101000_13, Object obj) {
        User owner;
        switch (afS39S0101000_13.i1) {
            case 0:
                C75492Tk0 c75492Tk0 = (C75492Tk0) afS39S0101000_13.l0;
                CMB cmb = (CMB) obj;
                if (cmb == null) {
                    c75492Tk0.getClass();
                    TYQ.LIZJ("cohostInviteEvent == null");
                    return;
                }
                if (c75492Tk0.mView == 0) {
                    return;
                }
                C75642TmQ.LJJJZ("connection_invite", null, 6);
                C75749To9 info = cmb.LIZ;
                LinkerManager linkerManager = c75492Tk0.linkerManager;
                DataChannel dataChannel = c75492Tk0.dataChannel;
                T t = c75492Tk0.mView;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) t;
                Context context = ((InterfaceC31336CRo) t).getContext();
                o.LJIIIZ(info, "info");
                o.LJIIIZ(linkerManager, "linkerManager");
                o.LJIIIZ(dataChannel, "dataChannel");
                o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                o.LJIIIZ(context, "context");
                if ((B5G.LIZIZ().LJFF > 0 || B5G.LIZIZ().LJJJJJ) && !((IInteractService) CN1.LIZ(IInteractService.class)).UX()) {
                    C30868C9o.LIZJ(R.string.kh8);
                    return;
                }
                WeakReference weakReference = new WeakReference(context);
                B5G.LIZIZ().LIZJ();
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room == null) {
                    return;
                }
                long id = room.getId();
                C75544Tkq c75544Tkq = new C75544Tkq(info, dataChannel, weakReference);
                if (!C44432HcC.LJIIJ().isMultiCoHost()) {
                    return;
                }
                if (((IInteractService) CN1.LIZ(IInteractService.class)).UX()) {
                    Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
                    if (room2 != null && (owner = room2.getOwner()) != null && owner.getSecret() == 1) {
                        C75227Tfj.LIZ(context, new C75543Tkp(id, context, lifecycleOwner, info, c75544Tkq, linkerManager, dataChannel), false, info.LJ, info.LIZJ);
                        return;
                    } else {
                        C75806Tp4.LJII(id, context, lifecycleOwner, info, c75544Tkq, linkerManager, dataChannel);
                        return;
                    }
                }
                C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.kmn));
                return;
            default:
                CommentWidget commentWidget = (CommentWidget) afS39S0101000_13.l0;
                commentWidget.getClass();
                if (obj instanceof BCC) {
                    commentWidget.onEvent((BCC) obj);
                    return;
                } else if (obj instanceof C30926CBu) {
                    commentWidget.onEvent((C30926CBu) obj);
                    return;
                } else {
                    if (!(obj instanceof BUL)) {
                        return;
                    }
                    commentWidget.onEvent((BUL) obj);
                    return;
                }
        }
    }

    public static final void accept$2(AfS39S0101000_13 afS39S0101000_13, Object obj) {
        String str;
        String str2;
        switch (afS39S0101000_13.i1) {
            case 0:
                ((AbstractC31497CXt) afS39S0101000_13.l0).logThrowable((Throwable) obj);
                return;
            case 1:
                InterfaceC31127CJn interfaceC31127CJn = (InterfaceC31127CJn) afS39S0101000_13.l0;
                if (interfaceC31127CJn != null) {
                    interfaceC31127CJn.onSuccess();
                    return;
                }
                return;
            case 2:
                ((ReactiveAccountActivity) afS39S0101000_13.l0).LLFII();
                return;
            default:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS39S0101000_13.l0;
                RegionStatus regionStatus = (RegionStatus) obj;
                i18nSettingManageMyAccountActivity.LJLJL = true;
                if (Boolean.TRUE.equals(regionStatus.getEnable())) {
                    i18nSettingManageMyAccountActivity.LJLLJ.LJIIIZ(true);
                    if (regionStatus.getLocalizedCountry() != null) {
                        str = regionStatus.getLocalizedCountry();
                    } else {
                        str = "";
                    }
                    i18nSettingManageMyAccountActivity.LJLJLJ = regionStatus.getStatusEvent();
                    i18nSettingManageMyAccountActivity.LJLJLLL = regionStatus.getRedirectUrl();
                    i18nSettingManageMyAccountActivity.LJLLJ.LJIILIIL(str);
                    if (Q7K.LIZIZ("show_non_editable_region_for_wallet_users_feature_flag", 0) == 0 && ((str2 = i18nSettingManageMyAccountActivity.LJLJLLL) == null || str2.isEmpty())) {
                        C25860ACy c25860ACy = i18nSettingManageMyAccountActivity.LJLLJ;
                        c25860ACy.getClass();
                        c25860ACy.LJIIJ(new AqS47S0110000_4(c25860ACy, false, 11));
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJ(System.currentTimeMillis() - i18nSettingManageMyAccountActivity.LJLLI, "delay");
                    c188727au.LJIIIZ("enter_from", "settings_page");
                    FMX.LJIIL("account_region_status_show", c188727au.LIZ);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS39S0101000_13 afS39S0101000_13, Object obj) {
        switch (afS39S0101000_13.i1) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) afS39S0101000_13.l0;
                BaseResponse baseResponse = (BaseResponse) obj;
                commentWidget.getClass();
                if (baseResponse != null) {
                    commentWidget.LLILZLL = (ChatEmojiListData) baseResponse.data;
                    return;
                }
                return;
            case 1:
                ((InterfaceC63111Opn) afS39S0101000_13.l0).LIZ((FeedbackResponse) obj);
                return;
            default:
                InterfaceC78494UrK interfaceC78494UrK = (InterfaceC78494UrK) afS39S0101000_13.l0;
                C78495UrL c78495UrL = (C78495UrL) obj;
                if (c78495UrL != null) {
                    interfaceC78494UrK.LIZIZ(c78495UrL.LIZIZ);
                    return;
                }
                return;
        }
    }

    public static final void accept$4(AfS39S0101000_13 afS39S0101000_13, Object obj) {
        switch (afS39S0101000_13.i1) {
            case 0:
                InterfaceC63111Opn interfaceC63111Opn = (InterfaceC63111Opn) afS39S0101000_13.l0;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    interfaceC63111Opn.onFailed(th);
                    return;
                }
                return;
            case 1:
                C29727Blb c29727Blb = (C29727Blb) ((ALAdapterS4S0100000_5) afS39S0101000_13.l0).l0;
                if (c29727Blb.LJIIL == EnumC29732Blg.FOLLOW_ANIM) {
                    if (c29727Blb.LJJIIZI) {
                        c29727Blb.LIZ(EnumC29732Blg.FOLLOWED);
                        return;
                    } else {
                        c29727Blb.LIZ(EnumC29732Blg.UNSUBSCRIBE);
                        return;
                    }
                }
                return;
            case 2:
                AbsTimeLockFragment absTimeLockFragment = (AbsTimeLockFragment) afS39S0101000_13.l0;
                absTimeLockFragment.mo49getActivity().finish();
                T5T t5t = absTimeLockFragment.LJLIL;
                if (absTimeLockFragment.mo49getActivity() != null) {
                    ((InputMethodManager) C16880lQ.LLILLJJLI(absTimeLockFragment.mo49getActivity(), "input_method")).hideSoftInputFromWindow(t5t.getWindowToken(), 0);
                }
                C78488UrE LJII = C1FO.LJII();
                if (LJII != null) {
                    Boolean bool = Boolean.TRUE;
                    Iterator it = LJII.LIZ.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC78491UrH) it.next()).onSuccess(bool);
                    }
                    LJII.LIZ.clear();
                    C78489UrF LIZ = C78489UrF.LIZ();
                    synchronized (LIZ) {
                        LIZ.LIZ.values().remove(LJII);
                    }
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(absTimeLockFragment);
                c26045AKb.LJIIIIZZ(R.string.sc5);
                c26045AKb.LJIIJ();
                SharePrefCache.inst().getLastUnlockTime().LIZLLL(Long.valueOf(System.currentTimeMillis()));
                return;
            case 3:
                InterfaceC78493UrJ interfaceC78493UrJ = (InterfaceC78493UrJ) afS39S0101000_13.l0;
                C78495UrL c78495UrL = (C78495UrL) obj;
                if (c78495UrL != null) {
                    if (Boolean.TRUE.equals(Boolean.valueOf(c78495UrL.LIZIZ))) {
                        interfaceC78493UrJ.LJJIL();
                        return;
                    } else {
                        if (!Boolean.FALSE.equals(Boolean.valueOf(c78495UrL.LIZIZ))) {
                            return;
                        }
                        interfaceC78493UrJ.LLIIIZ();
                        return;
                    }
                }
                return;
            default:
                BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) afS39S0101000_13.l0;
                C48691J9b c48691J9b = (C48691J9b) obj;
                baseDiscoverAndSearchFragmentNew.getClass();
                if (c48691J9b.LIZIZ && C84763XOl.LJIIJJI) {
                    c48691J9b.LIZ.LJIIL();
                }
                C73411SrX c73411SrX = baseDiscoverAndSearchFragmentNew.LLII;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                    return;
                }
                return;
        }
    }

    public AfS39S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
