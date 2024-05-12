package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import X.AnonymousClass629;
import X.C09G;
import X.C107124Ii;
import X.C107274Ix;
import X.C107564Ka;
import X.C107574Kb;
import X.C107584Kc;
import X.C107614Kf;
import X.C107654Kj;
import X.C107664Kk;
import X.C107674Kl;
import X.C107684Km;
import X.C107694Kn;
import X.C107724Kq;
import X.C107814Kz;
import X.C16880lQ;
import X.C221108m2;
import X.C227768wm;
import X.C31811Ce7;
import X.C33R;
import X.C34B;
import X.C3R0;
import X.C3UE;
import X.C3W9;
import X.C3WG;
import X.C3Y4;
import X.C48690J9a;
import X.C48841JEv;
import X.C4KZ;
import X.C4LD;
import X.C4NN;
import X.C4OX;
import X.C4P8;
import X.C54838Lfe;
import X.C55247LmF;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C64962gm;
import X.C78613UtF;
import X.C78685UuP;
import X.C78949Uyf;
import X.C78966Uyw;
import X.C80993Fv;
import X.C81313Hb;
import X.C83803Qq;
import X.C98593tv;
import X.EXV;
import X.EnumC107604Ke;
import X.EnumC84133Rx;
import X.HG3;
import X.InterfaceC107704Ko;
import X.InterfaceC109364Qy;
import X.InterfaceC55251LmJ;
import X.InterfaceC80643Em;
import X.InterfaceC82613Mb;
import X.InterfaceC83893Qz;
import X.L1L;
import X.L1S;
import X.MBE;
import X.ORZ;
import X.RBX;
import X.T2R;
import X.X1D;
import X.XIA;
import X.XIF;
import X.XKQ;
import X.XKW;
import X.XKX;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import djb.IDaS66S0100000_1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class SharePanelViewModel implements GenericLifecycleObserver, DefaultLifecycleObserver, InterfaceC82613Mb {
    public static final /* synthetic */ int LLIIIZ = 0;
    public SharePackage LJLIL;
    public InterfaceC83893Qz LJLILLLLZI;
    public final List<C4NN> LJLJI;
    public final C3R0 LJLJJI;
    public final XKW LJLJJL;
    public final XKW LJLJJLL;
    public final InterfaceC80643Em LJLJL;
    public final Set<String> LJLJLJ;
    public final boolean LJLJLLL;
    public final int LJLL;
    public final EnumC84133Rx LJLLI;
    public final boolean LJLLILLLL;
    public final InterfaceC107704Ko LJLLJ;
    public final LifecycleOwner LJLLL;
    public final String LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final String LJZ;
    public final C62822Ol8 LJZI;
    public final String LJZL;
    public final User LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final C64962gm LLFII;
    public final IDaS66S0100000_1 LLFZ;
    public final C62822Ol8 LLI;
    public final List<IMContact> LLIFFJFJJ;
    public Fragment LLII;
    public C4P8 LLIIII;
    public XKQ LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;

    static {
        new C3WG();
    }

    public SharePanelViewModel() {
        throw null;
    }

    @Override // X.InterfaceC82613Mb
    public final void L8(Throwable th) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public static boolean LIZ() {
        C107814Kz.LIZ.getClass();
        if (C107814Kz.LIZIZ() == 2 || C107814Kz.LIZIZ() == 5) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        String str;
        Bundle bundle;
        Aweme LJJJLL;
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        if (o.LJ(str, "aigc_avatar")) {
            return true;
        }
        SharePackage sharePackage2 = this.LJLIL;
        if (sharePackage2 == null || (bundle = sharePackage2.extras) == null || o.LJ(bundle.getString("enter_from"), "publish_share_panel")) {
            return false;
        }
        boolean LJ = o.LJ("long_press", bundle.getString("enter_method"));
        if ((L1S.LIZIZ() && L1L.LIZIZ()) || ((!((Boolean) L1S.LIZJ.getValue()).booleanValue() && !LJ) || (LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL)) == null)) {
            return false;
        }
        return C55723Ltv.LIZIZ.LJII().LJII(LJJJLL);
    }

    public final boolean LIZLLL() {
        Bundle bundle;
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || o.LJ(bundle.getString("enter_from"), "publish_share_panel")) {
            return false;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL);
        InterfaceC109364Qy interfaceC109364Qy = (InterfaceC109364Qy) this.LLI.getValue();
        LJFF();
        boolean LIZ = interfaceC109364Qy.LIZ(LJJJLL);
        boolean LJ = o.LJ(bundle.getString("enter_method"), "download");
        boolean z = bundle.getBoolean("is_video_from_discover");
        if (!LIZ || LJ || z) {
            return false;
        }
        return true;
    }

    public final List<IMContact> LJ() {
        return (List) this.LJLLLLLL.getValue();
    }

    public final String LJFF() {
        return (String) this.LJZI.getValue();
    }

    public final C4OX LJI() {
        Bundle bundle;
        User curUser;
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null) {
            return C4OX.NONE;
        }
        if (o.LJ(bundle.getString("enter_from"), "publish_share_panel")) {
            return C4OX.NONE;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL);
        if (LJJJLL == null || C54838Lfe.LJJI(LJJJLL)) {
            return C4OX.NONE;
        }
        RBX rbx = (RBX) HG3.LJIILL();
        if (rbx.isLogin() && (curUser = rbx.getCurUser()) != null && (!curUser.isAccuratePrivateAccount()) && !C78966Uyw.LJJIJ().LIZIZ()) {
            return C4OX.LAST;
        }
        return C4OX.NONE;
    }

    public final List<MAFIMUser> LJII() {
        String str;
        String str2;
        SharePackage sharePackage = this.LJLIL;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        } else {
            str = null;
        }
        if (!o.LJ(str, "aweme")) {
            SharePackage sharePackage2 = this.LJLIL;
            if (sharePackage2 != null) {
                str2 = sharePackage2.itemType;
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, "aweme_photo")) {
                return null;
            }
        }
        Set<IMContact> LJIIIIZZ = LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : LJIIIIZZ) {
            if (iMContact instanceof MAFIMUser) {
                arrayList.add(iMContact);
            }
        }
        List<MAFIMUser> LLILII = ORZ.LLILII(new Comparator() { // from class: X.4Ki
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((MAFIMUser) obj).getSortIndex() - ((MAFIMUser) obj2).getSortIndex();
            }
        }, arrayList);
        if (LLILII.isEmpty()) {
            return null;
        }
        return LLILII;
    }

    public final Set<IMContact> LJIIIIZZ() {
        return (Set) this.LJLZ.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r1.equals("now_post") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r1.equals("now_others_post") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r1.equals("now_video") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r1.equals("now_others_video_post") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C107124Ii LJIIJ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r6.LJLIL
            r5 = 0
            if (r0 == 0) goto L32
            android.os.Bundle r4 = r0.extras
            if (r4 == 0) goto L32
            java.lang.String r1 = "author_user_name"
            java.lang.String r0 = ""
            java.lang.String r3 = r4.getString(r1, r0)
            java.lang.String r1 = "share_im_limit_tip_type"
            r0 = -1
            int r2 = r4.getInt(r1, r0)
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r6.LJLIL
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.itemType
            if (r1 == 0) goto L27
            int r0 = r1.hashCode()
            switch(r0) {
                case -1103912169: goto L6f;
                case -2348590: goto L66;
                case 3322092: goto L50;
                case 361630739: goto L47;
                case 950398559: goto L3c;
                case 1662319721: goto L33;
                default: goto L27;
            }
        L27:
            r1 = 1
        L28:
            X.4Ii r5 = new X.4Ii
            java.lang.String r0 = "userName"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r5.<init>(r3, r2, r1)
        L32:
            return r5
        L33:
            java.lang.String r0 = "now_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L78
            goto L27
        L3c:
            java.lang.String r0 = "comment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto L27
        L45:
            r1 = 2
            goto L28
        L47:
            java.lang.String r0 = "now_others_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L78
            goto L27
        L50:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L59
            goto L27
        L59:
            java.lang.String r1 = "is_sub_only_live"
            r0 = 0
            boolean r0 = r4.getBoolean(r1, r0)
            if (r0 == 0) goto L64
            r1 = 4
            goto L28
        L64:
            r1 = 0
            goto L28
        L66:
            java.lang.String r0 = "now_video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L78
            goto L27
        L6f:
            java.lang.String r0 = "now_others_video_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L78
            goto L27
        L78:
            r1 = 3
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel.LJIIJ():X.4Ii");
    }

    public final void LJIIJJI() {
        Bundle bundle;
        if (this.LLFFF) {
            SharePackage sharePackage = this.LJLIL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                bundle.putString("button_type", "search_button");
            }
            C4KZ.LJ(C4KZ.LIZ, "show", this.LJLIL);
            this.LLFFF = false;
        }
    }

    public final Set<IMContact> LJIIIZ() {
        Set<IMContact> LJIIIIZZ = LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : LJIIIIZZ) {
            if (!(iMContact instanceof MAFIMUser)) {
                arrayList.add(iMContact);
            }
        }
        return ORZ.LLJJ(arrayList);
    }

    public final void LJIILIIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh enableMAF=");
        LIZ.append(C3UE.LIZ());
        LIZ.append(", shouldLoadMAF=");
        LIZ.append(this.LJLJJI.LJIIIZ());
        LIZ.append(", preloadExperiment=");
        LIZ.append(C81313Hb.LIZ());
        C34B.LJI("SharePanelViewModel", X1D.LIZIZ(LIZ));
        if (C3UE.LIZ() && this.LJLJJI.LJIIIZ() && C81313Hb.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("refresh ");
            LIZ2.append(this.LJZ);
            LIZ2.append(" with preload");
            C34B.LJI("SharePanelViewModel", X1D.LIZIZ(LIZ2));
            XKQ xkq = this.LLIIIILZ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LLIIIILZ = XKX.LIZLLL(this.LLFII, null, null, new C83803Qq(this, null), 3);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("refresh ");
        C48690J9a.LJIIL(LIZ3, this.LJZ, LIZ3, "SharePanelViewModel");
        this.LJLJJI.LJFF(this);
        this.LJLJJI.LIZLLL();
    }

    public static boolean LIZJ(C107124Ii c107124Ii) {
        if (c107124Ii.LJLILLLLZI > 0 && C78685UuP.LJJJZ(c107124Ii.LJLIL)) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        if (this.LLFF) {
            return;
        }
        LJIILL(contact, !LJIIIIZZ().contains(contact));
    }

    @Override // X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        C34B.LIZLLL("SharePanelViewModel", "onLoadError", th);
        LJ().clear();
        InterfaceC83893Qz interfaceC83893Qz = this.LJLILLLLZI;
        if (interfaceC83893Qz != null) {
            interfaceC83893Qz.ks(LJ());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate ");
        C48690J9a.LJIIL(LIZ, this.LJZ, LIZ, "SharePanelViewModel");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Lifecycle lifecycle;
        o.LJIIIZ(owner, "owner");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy ");
        C48690J9a.LJIIL(LIZ, this.LJZ, LIZ, "SharePanelViewModel");
        C48841JEv.LIZJ(this.LLFII, null);
        C3R0 c3r0 = this.LJLJJI;
        C34B.LJI(c3r0.LJLILLLLZI, "unSubscribe");
        c3r0.LJLJI = null;
        this.LJLILLLLZI = null;
        this.LJLIL = null;
        LifecycleOwner lifecycleOwner = this.LJLLL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // X.InterfaceC82613Mb
    public final void L20(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
    }

    public final void LJIIL(int i, IMContact iMContact) {
        String str;
        Bundle bundle;
        C107724Kq c107724Kq;
        String uuid = this.LJLLLL;
        SharePackage sharePackage = this.LJLIL;
        InterfaceC107704Ko interfaceC107704Ko = this.LJLLJ;
        o.LJIIIZ(uuid, "uuid");
        LinkedHashMap linkedHashMap = (LinkedHashMap) C107574Kb.LJLJJI;
        Object obj = linkedHashMap.get(uuid);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(uuid, obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get(iMContact);
        C107724Kq c107724Kq2 = null;
        if (obj2 == null) {
            C33R LIZ = C107574Kb.LIZ(iMContact, uuid);
            Context LLLLJ = C16880lQ.LLLLJ(ActivityStack.getTopActivity());
            o.LJIIIIZZ(LLLLJ, "getTopActivity().applicationContext");
            if (interfaceC107704Ko != null && (c107724Kq = interfaceC107704Ko.getActivityStatusParams()) != null) {
                c107724Kq.LJ = "long_press_panel";
            } else {
                c107724Kq = null;
            }
            obj2 = new C107584Kc(iMContact, sharePackage, LIZ, LLLLJ, this, c107724Kq);
            map.put(iMContact, obj2);
        }
        C107584Kc c107584Kc = (C107584Kc) obj2;
        C107724Kq c107724Kq3 = c107584Kc.LJI;
        if (c107724Kq3 != null) {
            c107724Kq3.LJFF = Integer.valueOf(i);
        }
        int i2 = C107614Kf.LIZ[c107584Kc.LIZJ.getValue().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                SharePackage sharePackage2 = c107584Kc.LJFF.LJLIL;
                if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                    str = bundle.getString("enter_method");
                } else {
                    str = null;
                }
                Aweme LJJJLL = C4LD.LIZ.LJJJLL(sharePackage2);
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
                C98593tv c98593tv = new C98593tv(c107584Kc.LJ, c107584Kc.LIZ);
                c98593tv.setEnterFromForMob(c107584Kc.LJFF.LJFF());
                c98593tv.setEnterMethodForMob(str);
                c98593tv.setEnterFrom(6);
                String LIZJ = C227768wm.LIZJ(LJJJLL);
                o.LJIIIIZZ(LIZJ, "getAuthorId(aweme)");
                c98593tv.setAuthorId(LIZJ);
                c98593tv.setGroupId(C227768wm.LIZIZ(LJJJLL));
                c98593tv.setQuickChat(true);
                Map<String, String> extraMobParams = c98593tv.getExtraMobParams();
                if (str == null) {
                    str = "share_panel";
                }
                extraMobParams.put("panel_source", str);
                createIIMServicebyMonsterPlugin.getImChatService().LJFF(c98593tv);
                C4P8 c4p8 = c107584Kc.LJFF.LLIIII;
                if (c4p8 != null) {
                    c4p8.Vd(new C107694Kn());
                }
                C107724Kq c107724Kq4 = c107584Kc.LJI;
                if (c107724Kq4 != null) {
                    c107724Kq4.LJ = "chat_room";
                    c107724Kq2 = c107724Kq4;
                }
                C78949Uyf.LJJIJLIJ(c107724Kq2);
                return;
            }
            XKQ xkq = c107584Kc.LJII;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c107584Kc.LIZJ.setValue(EnumC107604Ke.INIT);
            Fragment fragment = c107584Kc.LJFF.LLII;
            if (fragment == null) {
                return;
            }
            C31811Ce7.LIZJ(fragment, R.string.a2c);
            C107274Ix.LIZJ(c107584Kc.LJFF.LJLIL, c107584Kc.LIZ, "");
            return;
        }
        XKQ xkq2 = c107584Kc.LJII;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        c107584Kc.LJII = XKX.LIZLLL(c107584Kc.LIZLLL, C78613UtF.LIZJ, null, new C107564Ka(c107584Kc, null), 2);
    }

    public final boolean LJIILL(IMContact contact, boolean z) {
        o.LJIIIZ(contact, "contact");
        InterfaceC83893Qz interfaceC83893Qz = this.LJLILLLLZI;
        if (interfaceC83893Qz != null) {
            return interfaceC83893Qz.HY(contact, z);
        }
        return false;
    }

    @Override // X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess start: ");
        LIZ.append(list.size());
        LIZ.append(' ');
        LIZ.append(this.LJLJI.size());
        LIZ.append(' ');
        C48690J9a.LJIIL(LIZ, this.LJZ, LIZ, "SharePanelViewModel");
        XKX.LIZLLL(this.LLFII, this.LJLJJLL.plus(this.LLFZ), null, new C3W9(list, this, null), 2).LJJIII(new AqS167S0100000_1(this, 179));
    }

    public SharePanelViewModel(SharePackage sharePackage, InterfaceC83893Qz interfaceC83893Qz, List batchGroups, C3R0 relationModel, boolean z, int i, EnumC84133Rx enumC84133Rx, boolean z2, InterfaceC107704Ko interfaceC107704Ko, LifecycleOwner lifecycleOwner) {
        InterfaceC80643Em interfaceC80643Em;
        String curUserId;
        Lifecycle lifecycle;
        XIF mainDispatcher = EXV.LIZ;
        XIA ioDispatcher = C78613UtF.LIZJ;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, InterfaceC80643Em.class, "source_default_key");
        if (LIZLLL != null) {
            interfaceC80643Em = (InterfaceC80643Em) LIZLLL.getSource();
        } else {
            interfaceC80643Em = null;
        }
        o.LJIIIIZZ(C80993Fv.LIZ(), "get()");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o.LJIIIZ(batchGroups, "batchGroups");
        o.LJIIIZ(relationModel, "relationModel");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = interfaceC83893Qz;
        this.LJLJI = batchGroups;
        this.LJLJJI = relationModel;
        this.LJLJJL = mainDispatcher;
        this.LJLJJLL = ioDispatcher;
        this.LJLJL = interfaceC80643Em;
        this.LJLJLJ = linkedHashSet;
        this.LJLJLLL = z;
        this.LJLL = i;
        this.LJLLI = enumC84133Rx;
        this.LJLLILLLL = z2;
        this.LJLLJ = interfaceC107704Ko;
        this.LJLLL = lifecycleOwner;
        this.LJLLLL = AnonymousClass629.LIZ("randomUUID().toString()");
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LJLLLLLL = C221108m2.LIZIZ(C107654Kj.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C107674Kl.LJLIL);
        C221108m2.LIZIZ(C107664Kk.LJLIL);
        this.LJZ = C3Y4.LIZ();
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 0));
        IAccountUserService LJIILL = HG3.LJIILL();
        this.LJZL = (LJIILL == null || (curUserId = ((RBX) LJIILL).getCurUserId()) == null) ? "" : curUserId;
        IAccountUserService LJIILL2 = HG3.LJIILL();
        this.LL = LJIILL2 != null ? ((RBX) LJIILL2).getCurUser() : null;
        this.LLFFF = true;
        this.LLFII = C48841JEv.LIZ(MBE.LIZ(T2R.LJIIJJI(), mainDispatcher));
        this.LLFZ = new IDaS66S0100000_1(CoroutineExceptionHandler.LJJJJIZL, this, 0);
        this.LLI = C221108m2.LIZIZ(C107684Km.LJLIL);
        this.LLIFFJFJJ = new ArrayList();
        this.LLIIIJ = true;
        this.LLIIIL = true;
    }
}
