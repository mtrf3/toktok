package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.model.PushHistoryInfo;
import com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi;
import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XxA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86500XxA implements LEA {
    public static final C86500XxA LJLIL = new C86500XxA();
    public static boolean LJLILLLLZI = true;
    public static boolean LJLJI;
    public static boolean LJLJJI;
    public static volatile boolean LJLJJL;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initOnceReal: ");
        C62822Ol8 c62822Ol8 = C52335KgN.LIZ;
        LIZ.append(((Boolean) c62822Ol8.getValue()).booleanValue());
        C86478Xwo.LIZLLL("InnerPushManager", X1D.LIZIZ(LIZ));
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            AccountService.LJIJ().LJIILJJIL(this);
            C84763XOl.LJI().LJJJJZI(C86523XxX.LJLIL);
            C84763XOl.LJII().LJJJJZI(C86530Xxe.LJLIL);
            C86502XxC c86502XxC = C86502XxC.LJLIL;
            if (C35154Dqw.LIZ()) {
                C67128QWe c67128QWe = C67128QWe.LIZIZ;
                c67128QWe.LJIIIIZZ(c86502XxC);
                c67128QWe.LIZJ(C86502XxC.LIZJ().LJLIL, C86502XxC.LIZJ().LJLILLLLZI, c86502XxC);
                if (C52207KeJ.LIZ) {
                    C86478Xwo.LIZ("FrontierNotifier", "register livePsmIdentifier ");
                    c67128QWe.LIZJ(C86502XxC.LIZIZ().LJLIL, C86502XxC.LIZIZ().LJLILLLLZI, c86502XxC);
                }
            } else {
                C67143QWt c67143QWt = QWY.LJIIIZ;
                c67143QWt.LIZ().LIZJ(c86502XxC);
                c67143QWt.LIZ().LIZLLL(C86502XxC.LIZJ(), c86502XxC);
                if (C52207KeJ.LIZ) {
                    C86478Xwo.LIZ("FrontierNotifier", "register livePsmIdentifier ");
                    c67143QWt.LIZ().LIZLLL(C86502XxC.LIZIZ(), c86502XxC);
                }
            }
            C86547Xxv.LIZ = true;
            C58242MtS.LIZIZ(new C86484Xwu());
            C58242MtS.LIZIZ(new C86495Xx5());
            C58242MtS.LIZIZ(new InterfaceC86486Xww() { // from class: X.4I5
                public InterfaceC112564bM LIZ;
                public boolean LIZJ;
                public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4I6.LJLIL);
                public final int[] LIZLLL = {29, 1004};

                @Override // X.InterfaceC86486Xww
                public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                    return false;
                }

                @Override // X.InterfaceC86486Xww
                public final boolean LJFF(InnerPushMessage innerPushMessage) {
                    return true;
                }

                @Override // X.InterfaceC86486Xww
                public final boolean LJIIIIZZ(InnerPushMessage message) {
                    o.LJIIIZ(message, "message");
                    return true;
                }

                @Override // X.InterfaceC86486Xww
                public final int[] LIZ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC86486Xww
                public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
                    InnerPushUITemplate uiTemplate;
                    User user;
                    String uid;
                    HashMap hashMap;
                    if (i != 3 || this.LIZJ || (uiTemplate = innerPushMessage.getUiTemplate()) == null) {
                        return false;
                    }
                    uiTemplate.setRightType(1);
                    uiTemplate.setRightImageUrl(null);
                    uiTemplate.setRightImageResId(0);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
                    c2068389v.LJ = Integer.valueOf(R.attr.arb);
                    uiTemplate.setRightImageDrawable(c2068389v.LIZ(EF7.LIZIZ()));
                    uiTemplate.setRightImageHeight(16);
                    uiTemplate.setRightImageWidth(16);
                    uiTemplate.setRightImageRadius(0);
                    uiTemplate.setGlobalSchemaUrl(uiTemplate.getRightSchemaUrl());
                    uiTemplate.setContent(EF7.LIZIZ().getString(R.string.esl));
                    List<User> fromUsers = uiTemplate.getFromUsers();
                    if (fromUsers != null && (user = (User) ListProtector.get(fromUsers, 0)) != null && (uid = user.getUid()) != null) {
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3U9(innerPushMessage, uid, null), 3);
                        if (innerPushMessage.getType() == 1004) {
                            hashMap = C113554cx.LJJJLZIJ(new OSZ("is_recommended_chat", "1"));
                        } else {
                            hashMap = new HashMap();
                        }
                        ((C4I7) this.LIZIZ.getValue()).LIZ(hashMap);
                    }
                    InterfaceC112564bM interfaceC112564bM = this.LIZ;
                    if (interfaceC112564bM != null) {
                        interfaceC112564bM.LIZ(innerPushMessage, new int[]{3, 2});
                        this.LIZJ = true;
                        return true;
                    }
                    o.LJIJI("controller");
                    throw null;
                }

                @Override // X.InterfaceC86486Xww
                public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
                    HashMap hashMap;
                    if (innerPushMessage.getType() == 1004) {
                        hashMap = C113554cx.LJJJLZIJ(new OSZ("is_recommended_chat", "1"), new OSZ("enter_method", "inner_push"));
                    } else {
                        hashMap = new HashMap();
                    }
                    this.LIZ = c86507XxH;
                    ((C4I7) this.LIZIZ.getValue()).LIZIZ(hashMap);
                    this.LIZJ = false;
                    return null;
                }
            });
            boolean booleanValue = ((Boolean) C52748Kn2.LIZ.getValue()).booleanValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[registerLiveBroadcastStatusChangeListener], isPureModeEnabled=");
            LIZ2.append(booleanValue);
            C86478Xwo.LIZLLL("InnerPushManager", X1D.LIZIZ(LIZ2));
            if (!booleanValue) {
                return;
            }
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL.LJJIJIIJI()) {
                LJJJLL.LJJIJIL().LJJJI(C86527Xxb.LIZ);
            } else {
                LJJJLL.LJFF(new C86529Xxd(LJJJLL));
            }
        }
    }

    public static void LIZIZ(boolean z) {
        List arrayList;
        StringBuilder LJI = JBR.LJI("onAppForeground: ", z, ", ");
        LJI.append(LJLILLLLZI);
        LJI.append(", ");
        LJI.append(LJLJI);
        C86478Xwo.LIZLLL("InnerPushManager", X1D.LIZIZ(LJI));
        if (z) {
            C10K.LJII(PullSettings.LIZ().hotStartDelaySeconds).LIZLLL(C86521XxV.LIZ);
            if (LJLILLLLZI) {
                String string = C86497Xx7.LJ().getString("wait_status_messages", "");
                if (!TextUtils.isEmpty(string)) {
                    arrayList = C75792yF.LIZLLL(Object[].class, string);
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty()) {
                    PushHistoryInfo pushHistoryInfo = new PushHistoryInfo(Long.valueOf(System.currentTimeMillis() / 1000), 0L, 0, 6, null);
                    EnumC86511XxL enumC86511XxL = EnumC86511XxL.START;
                    C86496Xx6.LJIIL(null, enumC86511XxL);
                    InnerPushApi.Api api = (InnerPushApi.Api) InnerPushApi.LIZIZ.getValue();
                    int value = enumC86511XxL.getValue();
                    String LIZLLL = JsonParseUtils.LIZLLL(pushHistoryInfo);
                    o.LJIIIIZZ(LIZLLL, "toJSONString(historyInfo)");
                    C78999UzT.LJFF(api.markStatus(0L, value, LIZLLL).LJJL(T16.LIZ()).LJJJLL(C86520XxU.LJLIL, new InterfaceC64592gB() { // from class: X.9Eu
                        @Override // X.InterfaceC64592gB
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        }
                    }, C86544Xxs.LIZ), (C73318Sq2) InnerPushApi.LIZJ.getValue());
                }
                C86499Xx9.LIZ(EnumC86518XxS.COLD_START);
            } else if (LJLJI) {
                C86499Xx9.LIZ(EnumC86518XxS.WARM_START);
            } else {
                C86499Xx9.LIZ(EnumC86518XxS.HOT_START);
            }
            LJLILLLLZI = false;
            LJLJI = false;
        }
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String str;
        if (!z) {
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("onAccountResult, LOGIN, type = ", i, ", ");
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        LJ.append(str);
        C86478Xwo.LIZLLL("InnerPushManager", X1D.LIZIZ(LJ));
        HandlerC86501XxB.LIZ.getClass();
        C57419MgB.LJIIIZ(C86535Xxj.LJLIL);
        C86499Xx9.LIZ(EnumC86518XxS.ACCOUNT_LOGIN);
    }
}
