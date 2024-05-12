package X;

import android.content.Context;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3L3, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3L3 extends C3L5 implements Cloneable {
    public final String LLIIIILZ;
    public InterfaceC88472Yns<? super IMUser, C76800UCe> LLIIIJ;
    public boolean LLIIIL;
    public IMUser LLIIIZ;

    @Override // X.C3L4
    public int LJIIIIZZ() {
        return 0;
    }

    @Override // X.C3L4
    public C3OB LIZJ() {
        return new C3OB() { // from class: X.3Oq
            public TuxActionSheet LIZ;

            @Override // X.C3OB
            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                boolean z;
                String str;
                String str2;
                boolean z2;
                boolean z3;
                String str3;
                String str4;
                TuxActionSheet tuxActionSheet;
                TuxActionSheet tuxActionSheet2;
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(session, "session");
                String valueOf = String.valueOf(C81273Gx.LIZLLL(session.LJFF()));
                if (i != 0) {
                    boolean z4 = true;
                    if (i != 1 && i != 2) {
                        if (i != 3 || (tuxActionSheet = this.LIZ) == null || !tuxActionSheet.isVisible() || (tuxActionSheet2 = this.LIZ) == null) {
                            return;
                        }
                        tuxActionSheet2.dismiss();
                        return;
                    }
                    IMUser LJIJI = C3L3.this.LJIJI();
                    if (LJIJI == null) {
                        LJIJI = new IMUser();
                        C3L3 c3l3 = C3L3.this;
                        LJIJI.setUid(valueOf);
                        Object obj = c3l3.LJLJI;
                        if (obj instanceof UrlModel) {
                            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                            LJIJI.setAvatarThumb((UrlModel) obj);
                        }
                        LJIJI.setNickName(c3l3.LJ());
                    }
                    LJIJI.setType(-1);
                    C82223Ko c82223Ko = C99033ud.Companion;
                    String str5 = C3L3.this.LJLILLLLZI;
                    c82223Ko.getClass();
                    if (C82223Ko.LIZ(str5)) {
                        C96963rI.LIZJ().getClass();
                        C84503Ti.LIZIZ(activity, session);
                        return;
                    }
                    if (map != null && (str4 = map.get("has_icon")) != null) {
                        z = Boolean.parseBoolean(str4);
                    } else {
                        z = false;
                    }
                    IMChatExt iMChatExt = new IMChatExt();
                    iMChatExt.commerceScene = "msg_list";
                    InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                    C98593tv c98593tv = new C98593tv((Context) activity, LJIJI);
                    C3L3 c3l32 = C3L3.this;
                    c98593tv.setEnterFrom(3);
                    HashMap<String, String> hashMap = session.LJZ;
                    if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                        str = "message";
                    }
                    c98593tv.setEnterFromForMob(str);
                    HashMap<String, String> hashMap2 = session.LJZ;
                    if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                        str2 = "cell";
                    }
                    c98593tv.setEnterMethodForMob(str2);
                    c98593tv.setSessionId(session.LJFF());
                    c98593tv.setChatExt(iMChatExt);
                    c98593tv.setHasCameraIcon(z);
                    c98593tv.setUnreadCount(session.LJLLILLLL);
                    if (session.LJLLI != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c98593tv.setRecommendedChat(z2);
                    c98593tv.setUnreadViewState(session.LLF);
                    c98593tv.setFollowStatus(LJIJI.getFollowStatus());
                    c98593tv.setStickyTop(session.LJLLLL);
                    if (session.LJLLLLLL == 25) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c98593tv.setTCM(z3);
                    c98593tv.setActivityStatus(session.LJLJJLL.LJLILLLLZI);
                    c98593tv.setLastMessageMsgType(session.LJLJLLL);
                    if (session instanceof C3L5) {
                        C3L5 c3l5 = (C3L5) session;
                        C109544Rq LJIILJJIL = c3l5.LJIILJJIL();
                        if (LJIILJJIL == null || (str3 = LJIILJJIL.getUuid()) == null) {
                            str3 = "";
                        }
                        c98593tv.setLastMsgUUId(str3);
                        if (c3l5.LLII != EnumC96553qd.SEEN) {
                            z4 = false;
                        }
                        c98593tv.setLastMsgRead(z4);
                    }
                    c98593tv.setMediaMsgMasking(session.LLIFFJFJJ);
                    c98593tv.setHighRiskConversation(c3l32.LJIILL());
                    imChatService.LJFF(c98593tv);
                    return;
                }
                this.LIZ = C83253On.LIZ(activity, C3L3.this.LJIJI(), session, AnonymousClass367.ChatSession, null);
            }
        };
    }

    @Override // 
    /* renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public C3L3 clone() {
        C3L3 c3l3 = new C3L3(LJIJI(), this.LLIIIILZ);
        LJIJ(c3l3);
        return c3l3;
    }

    public final IMUser LJIJI() {
        if (this.LLIIIZ == null) {
            C34B.LJI("ChatSession", "getFromUser is null");
            long LIZLLL = C81273Gx.LIZLLL(this.LJLILLLLZI);
            IMUser LJFF = C80533Eb.LJFF(String.valueOf(LIZLLL), this.LLIIIILZ);
            if (LJFF != null) {
                this.LLIIIZ = LJFF;
                InterfaceC88472Yns<? super IMUser, C76800UCe> interfaceC88472Yns = this.LLIIIJ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(LJFF);
                }
                this.LLIIIJ = null;
            } else {
                C80533Eb.LJIIJJI(String.valueOf(LIZLLL), this.LLIIIILZ, false, new C3EU() { // from class: X.3DZ
                    @Override // X.C3EU
                    public final void LIZ(IMUser result) {
                        o.LJIIIZ(result, "result");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("User onQueryResult hasUSer=");
                        LIZ.append(true);
                        C34B.LJII("ChatSession", X1D.LIZIZ(LIZ));
                        C3L3 c3l3 = C3L3.this;
                        c3l3.LLIIIZ = result;
                        InterfaceC88472Yns<? super IMUser, C76800UCe> interfaceC88472Yns2 = c3l3.LLIIIJ;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(result);
                        }
                        C3L3.this.LLIIIJ = null;
                    }

                    @Override // X.C3EU
                    public final void LIZIZ(Throwable throwable) {
                        o.LJIIIZ(throwable, "throwable");
                        C34B.LIZLLL("ChatSession", "getFromUser fetch user error", throwable);
                    }
                });
            }
        }
        return this.LLIIIZ;
    }

    public void LJIJ(C3L3 c3l3) {
        c3l3.LJLILLLLZI = this.LJLILLLLZI;
        c3l3.LJLZ = this.LJLZ;
        c3l3.LJLL = this.LJLL;
        long j = this.LJLLI;
        if (j < 10000000000L) {
            c3l3.LJLLI = j * 1000;
        } else {
            c3l3.LJLLI = j;
        }
        c3l3.LLD = this.LLD;
        c3l3.LLIIIL = this.LLIIIL;
        c3l3.LJLIL = this.LJLIL;
        c3l3.LJLLILLLL = this.LJLLILLLL;
        c3l3.LJLJLJ = this.LJLJLJ;
        c3l3.LJIIJJI(this.LJLJL);
        c3l3.LJLJJI = this.LJLJJI;
        c3l3.LJLJI = this.LJLJI;
        c3l3.LJLLJ = this.LJLLJ;
        c3l3.LJLLL = this.LJLLL;
        c3l3.LJLLLL = this.LJLLLL;
        c3l3.LL = this.LL;
        c3l3.LLF = this.LLF;
        c3l3.LJLJJL = this.LJLJJL;
        c3l3.LJZI = this.LJZI;
        c3l3.LLII = this.LLII;
        c3l3.LJLLLLLL = this.LJLLLLLL;
        c3l3.LLFF = this.LLFF;
        c3l3.LLFII = this.LLFII;
        c3l3.LJLJJLL = this.LJLJJLL;
        c3l3.LLFZ = this.LLFZ;
        c3l3.LLFFF = this.LLFFF;
        c3l3.LJLJLLL = this.LJLJLLL;
        c3l3.LLIFFJFJJ = this.LLIFFJFJJ;
        c3l3.LLIIII = this.LLIIII;
    }

    public C3L3(IMUser iMUser, String str) {
        this.LLIIIILZ = str;
        this.LLIIIZ = iMUser;
    }
}
