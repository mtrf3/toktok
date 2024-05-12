package X;

import Y.AfS36S0101000_5;
import Y.IDCListenerS78S0000000_5;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.performance.LiveRequestWithTraceTag;
import com.bytedance.android.livesdk.model.UserExtra;
import com.bytedance.android.livesdk.userservice.FollowApi;
import com.bytedance.android.livesdk.userservice.FollowResult;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Bfu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29374Bfu implements InterfaceC29405BgP {
    public final C29378Bfy LIZ;
    public InterfaceC05190Ih LIZIZ;
    public final C278417k LIZJ;
    public final IHostUser LIZLLL;
    public final UserApi LJ;
    public final FollowApi LJFF;
    public final C73793Sxh<C29383Bg3> LJI;
    public final C73893SzJ<InterfaceC05190Ih> LJII;
    public final C73893SzJ<FollowPair> LJIIIIZZ;
    public C73893SzJ<InterfaceC05190Ih> LJIIIZ;
    public final C29382Bg2 LJIIJ;

    @Override // X.InterfaceC29405BgP
    public final User LJ() {
        InterfaceC05190Ih interfaceC05190Ih = this.LIZIZ;
        if (interfaceC05190Ih instanceof User) {
            return (User) interfaceC05190Ih;
        }
        return this.LIZ;
    }

    public final List<C28443BEh> LJIIJ() {
        return this.LIZLLL.getAllFriends();
    }

    public final boolean LJIIJJI() {
        IHostUser iHostUser = this.LIZLLL;
        if (iHostUser == null) {
            return false;
        }
        if (!iHostUser.isMinorMode() && !this.LIZLLL.isDeleteByAgeGate()) {
            return false;
        }
        return true;
    }

    public final C73603Sud LJIIL() {
        return this.LJII.LJJIFFI(new InterfaceC73592SuS() { // from class: X.BfC
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object obj) {
                C29374Bfu c29374Bfu = C29374Bfu.this;
                InterfaceC05190Ih interfaceC05190Ih = (InterfaceC05190Ih) obj;
                if (interfaceC05190Ih != null) {
                    if (c29374Bfu.LIZLLL != null && interfaceC05190Ih.getId() == c29374Bfu.LIZLLL.getCurUserId()) {
                        return true;
                    }
                } else {
                    c29374Bfu.getClass();
                }
                return false;
            }
        });
    }

    public final C73643SvH LJIJJLI() {
        return LJIL("UserCenter_updateCurrentUserUnknown");
    }

    @Override // X.InterfaceC29405BgP
    public final long getCurrentUserId() {
        return this.LIZIZ.getId();
    }

    @Override // X.InterfaceC29405BgP
    public final boolean isLogin() {
        if (this.LIZIZ.getId() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC29405BgP
    public final InterfaceC05190Ih getCurrentUser() {
        return this.LIZIZ;
    }

    public C29374Bfu(final IHostUser iHostUser) {
        C29378Bfy c29378Bfy = new C29378Bfy();
        this.LIZ = c29378Bfy;
        this.LIZIZ = c29378Bfy;
        this.LIZJ = new C278417k();
        this.LJI = new C73793Sxh<>();
        this.LJII = new C73893SzJ<>();
        this.LJIIIIZZ = new C73893SzJ<>();
        this.LJIIJ = new C29382Bg2(this);
        if (iHostUser == null) {
            return;
        }
        this.LIZLLL = iHostUser;
        LJIJ(iHostUser.getCurUser());
        C65814PsI.LIZ().getClass();
        this.LJ = (UserApi) C65814PsI.LIZJ(UserApi.class);
        this.LJFF = (FollowApi) Q7L.LIZIZ(FollowApi.class);
        iHostUser.registerCurrentUserUpdateListener(new InterfaceC78995UzP() { // from class: X.Bfw
            @Override // X.InterfaceC78995UzP
            public final void LIZ(boolean z) {
                C29374Bfu c29374Bfu = C29374Bfu.this;
                IHostUser iHostUser2 = iHostUser;
                c29374Bfu.getClass();
                if (z) {
                    c29374Bfu.LJIJ(iHostUser2.getCurUser());
                    c29374Bfu.LJIL("UserCenter_registerCurrentUserUpdateListener").LIZ(new C29379Bfz(c29374Bfu));
                } else {
                    c29374Bfu.LJIJ(new C29378Bfy());
                    c29374Bfu.LJI.onNext(new C29383Bg3(EnumC05180Ig.Logout, c29374Bfu.LIZIZ));
                }
            }
        });
        iHostUser.registerFollowStatusListener(new LDC(this));
        LJIL("UserCenter_init").LIZ(new C29355Bfb());
    }

    @Override // X.InterfaceC29405BgP
    public final C73603Sud LIZ(final long j) {
        return this.LJIIIIZZ.LJJIFFI(new InterfaceC73592SuS() { // from class: X.Bg1
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object obj) {
                if (((FollowPair) obj).LIZ == j) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC29405BgP
    public final boolean LIZIZ(EnumC31098CIk enumC31098CIk) {
        return this.LIZLLL.interceptOperation(enumC31098CIk.getFunc());
    }

    @Override // X.InterfaceC29405BgP
    public final String LIZJ(long j) {
        InterfaceC05190Ih interfaceC05190Ih = (InterfaceC05190Ih) this.LIZJ.get(Long.valueOf(j));
        if (interfaceC05190Ih != null) {
            return interfaceC05190Ih.getSecUid();
        }
        return null;
    }

    @Override // X.InterfaceC29405BgP
    public final void LJFF(FollowPair followPair) {
        this.LIZLLL.onFollowStatusChanged(followPair.followStatus, followPair.LIZ);
        C73943T0h.LIZ().LIZIZ(new C29289BeX(followPair));
        this.LJIIIIZZ.onNext(followPair);
    }

    public final void LJI(InterfaceC05190Ih interfaceC05190Ih) {
        if (interfaceC05190Ih != null) {
            this.LIZJ.put(Long.valueOf(interfaceC05190Ih.getId()), interfaceC05190Ih);
        }
    }

    public final T06 LJIIIIZZ(C29363Bfj c29363Bfj) {
        return LJII(1, c29363Bfj.LIZ, c29363Bfj.LIZIZ, c29363Bfj.LIZLLL, c29363Bfj.LIZJ, c29363Bfj.LJ, c29363Bfj.LJFF);
    }

    public final T06 LJIIIZ(C29370Bfq c29370Bfq) {
        return LJII(1, c29370Bfq.LIZ, c29370Bfq.LIZIZ, c29370Bfq.LIZLLL, c29370Bfq.LIZJ, false, c29370Bfq.LJFF);
    }

    public final C73603Sud LJIILIIL(final long j) {
        return this.LJII.LJJIFFI(new InterfaceC73592SuS() { // from class: X.Bg0
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object obj) {
                long j2 = j;
                InterfaceC05190Ih interfaceC05190Ih = (InterfaceC05190Ih) obj;
                if (interfaceC05190Ih != null && interfaceC05190Ih.getId() == j2) {
                    return true;
                }
                return false;
            }
        });
    }

    public final C73470SsU LJIILJJIL(HashMap hashMap) {
        AbstractC73638SvC<BaseResponse<User, UserExtra>> queryUser;
        if (LiveRequestWithTraceTag.INSTANCE.hasTraceTag()) {
            queryUser = this.LJ.queryUser(hashMap, "profileDialog_batchRequest");
        } else {
            queryUser = this.LJ.queryUser(hashMap);
        }
        return queryUser.LJJIIJ(T16.LIZ()).LJIILIIL(new AfS36S0101000_5(3, this, 42)).LJIJJ(C73969T1h.LIZIZ());
    }

    public final void LJIJ(InterfaceC05190Ih interfaceC05190Ih) {
        if (interfaceC05190Ih != null) {
            this.LIZIZ = interfaceC05190Ih;
            this.LJI.onNext(new C29383Bg3(EnumC05180Ig.Update, interfaceC05190Ih));
            this.LIZJ.put(Long.valueOf(interfaceC05190Ih.getId()), interfaceC05190Ih);
            this.LJII.onNext(interfaceC05190Ih);
            return;
        }
        this.LIZIZ = new C29378Bfy();
    }

    public final C73390SrC LJIJJ(final C29360Bfg c29360Bfg) {
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.Bfr
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                C29374Bfu c29374Bfu = C29374Bfu.this;
                C29360Bfg c29360Bfg2 = c29360Bfg;
                c29374Bfu.LIZLLL.unFollowWithConfirm(c29360Bfg2.LIZJ, c29360Bfg2.LIZIZ, c29360Bfg2.LIZ, new C29372Bfs(c29360Bfg, c29360Bfg2, c29374Bfu, (C73433Srt) interfaceC73573Su9));
            }
        });
    }

    public final C73643SvH LJIL(String str) {
        long curUserId = this.LIZLLL.getCurUserId();
        return this.LJ.queryUser(curUserId, 2L, LIZJ(curUserId), str).LJJIIJ(T16.LIZ()).LJIJI(new C61328O5c()).LJIJJ(C73969T1h.LIZIZ()).LJIILIIL(new AfS36S0101000_5(1, this, 18));
    }

    @Override // X.InterfaceC29405BgP
    public final C73454SsE LIZLLL(Context context, C29377Bfx c29377Bfx) {
        if (context.getResources().getConfiguration().orientation == 2) {
            C73943T0h.LIZ().LIZIZ(new B3N("login"));
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        if (LIZIZ != null) {
            this.LIZLLL.login(LIZIZ, this.LJIIJ, c29377Bfx.LIZ, c29377Bfx.LIZIZ, c29377Bfx.LIZJ, c29377Bfx.LIZLLL, c29377Bfx.LJ, c29377Bfx.LJFF);
            C73893SzJ<InterfaceC05190Ih> c73893SzJ = new C73893SzJ<>();
            this.LJIIIZ = c73893SzJ;
            return c73893SzJ.LJJJ(C73969T1h.LIZIZ());
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    public final C73470SsU LJIILL(long j, String str) {
        return this.LJ.queryUser(j, 2L, LIZJ(j), str).LJJIIJ(T16.LIZ()).LJIJI(new C73098SmU()).LJIILIIL(new AfS36S0101000_5(1, this, 15)).LJIJJ(C73969T1h.LIZIZ());
    }

    public final C73470SsU LJIIZILJ(String str, HashMap hashMap) {
        AbstractC73638SvC<BaseResponse<User, UserExtra>> queryUser;
        if (LiveRequestWithTraceTag.INSTANCE.hasTraceTag()) {
            queryUser = this.LJ.queryUser(hashMap, str);
        } else {
            queryUser = this.LJ.queryUser(hashMap);
        }
        return queryUser.LJJIIJ(T16.LIZ()).LJIJI(new C19N()).LJIILIIL(new AfS36S0101000_5(2, this, 13)).LJIJJ(C73969T1h.LIZIZ());
    }

    public final C73470SsU LJIILLIIL(long j, String str, String str2) {
        AbstractC73638SvC<C28467BFf<User>> queryUser;
        if (LiveRequestWithTraceTag.INSTANCE.hasTraceTag()) {
            queryUser = this.LJ.queryUser(j, 2L, LIZJ(j), str, str2);
        } else {
            queryUser = this.LJ.queryUser(j, 2L, LIZJ(j), str);
        }
        return queryUser.LJJIIJ(T16.LIZ()).LJIJI(new C72545SdZ()).LJIILIIL(new AfS36S0101000_5(4, this, 37)).LJIJJ(C73969T1h.LIZIZ());
    }

    public final void LJIJI(String str, final DialogInterfaceOnClickListenerC29331BfD dialogInterfaceOnClickListenerC29331BfD, Context context, final String str2, final long j) {
        if (context == null) {
            return;
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LIZJ = str;
        c77437UaH.LIZJ(R.string.snz, new IDCListenerS78S0000000_5(1), false);
        c77437UaH.LJ(R.string.sz9, new DialogInterface.OnClickListener() { // from class: X.BK1
            public final /* synthetic */ String LJLJI = "";
            public final /* synthetic */ boolean LJLJJI = false;
            public final /* synthetic */ String LJLJJL = "";
            public final /* synthetic */ String LJLJJLL = "";

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str3 = str2;
                long j2 = j;
                String str4 = this.LJLJI;
                boolean z = this.LJLJJI;
                String str5 = this.LJLJJL;
                String str6 = this.LJLJJLL;
                DialogInterface.OnClickListener onClickListener = dialogInterfaceOnClickListenerC29331BfD;
                try {
                    new JSONObject().put("source", str3);
                } catch (JSONException unused) {
                }
                HashMap LIZJ = C03660Ck.LIZJ("follow_source", str3);
                C43881HKb.LIZJ(j2, LIZJ, "user_id", "enter_from", str4);
                LIZJ.put("source", str4);
                if (z) {
                    LIZJ.put("event_type", "click");
                    LIZJ.put("event_belong", "video");
                    LIZJ.put("event_module", "toast");
                    if (!C38354F3m.LJ(str5)) {
                        LIZJ.put("event_page", str5);
                    }
                    if (!C38354F3m.LJ(str6)) {
                        LIZJ.put("enter_from", str6);
                    }
                }
                BZI LIZIZ = C28787BRn.LIZIZ("unfollow_popup_confirm");
                LIZIZ.LJJIFFI(LIZJ);
                LIZIZ.LJJIIJZLJL();
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        }, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4631854796621177992")).LIZ) {
            return;
        }
        LIZ.show();
    }

    public final T06 LJII(final int i, final long j, final long j2, final EnumC29290BeY enumC29290BeY, final HashMap hashMap, final boolean z, boolean z2) {
        AbstractC73672Svk<C28467BFf<FollowResult>> unfollow;
        if (i == 1) {
            C65814PsI.LIZ().getClass();
            unfollow = ((FollowApi) C65814PsI.LIZIZ(FollowApi.class)).follow(i, j, j2, this.LIZIZ.getSecUid(), LIZJ(j), z2);
        } else {
            unfollow = this.LJFF.unfollow(i, this.LIZIZ.getSecUid(), j, LIZJ(j), j2);
        }
        T06 LJJJJLL = C1EW.LIZ(unfollow).LJJIJL(new InterfaceC48038ItG() { // from class: X.BfE
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                long j3 = j;
                EnumC29290BeY enumC29290BeY2 = enumC29290BeY;
                int i2 = ((FollowResult) ((BaseResponse) obj).data).followType;
                FollowPair followPair = new FollowPair();
                if (i2 == 1) {
                    followPair.followStatus = 1;
                } else if (i2 == 2) {
                    followPair.followStatus = 2;
                } else {
                    followPair.followStatus = 0;
                }
                followPair.LIZJ = i2;
                followPair.LIZ = j3;
                followPair.LIZLLL = enumC29290BeY2;
                return followPair;
            }
        }).LJJJJLL();
        LJJJJLL.LJJJLIIL(new InterfaceC64592gB() { // from class: X.BfA
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str;
                C29374Bfu c29374Bfu = C29374Bfu.this;
                HashMap<String, String> hashMap2 = hashMap;
                boolean z3 = z;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                FollowPair followPair = (FollowPair) obj;
                c29374Bfu.LIZLLL.onFollowStatusChanged(followPair.followStatus, followPair.LIZ);
                followPair.LJFF = hashMap2;
                if (z3) {
                    C73943T0h.LIZ().LIZIZ(new CJ5(followPair));
                }
                C73943T0h.LIZ().LIZIZ(new C29289BeX(followPair));
                c29374Bfu.LJIIIIZZ.onNext(followPair);
                InterfaceC05190Ih interfaceC05190Ih = c29374Bfu.LIZIZ;
                if (interfaceC05190Ih != null) {
                    long id = interfaceC05190Ih.getId();
                    if (i2 == 1) {
                        str = "ttlive_follow";
                    } else {
                        str = "ttlive_unfollow";
                    }
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("proponent_id", Long.valueOf(id));
                    hashMap3.put("adopter_id", Long.valueOf(j3));
                    hashMap3.put("room_id", Long.valueOf(j4));
                    C0K2.LJII(0, O5Y.LJJL(str), hashMap3);
                }
            }
        }, new InterfaceC64592gB() { // from class: X.BfB
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str;
                String str2;
                C29374Bfu c29374Bfu = C29374Bfu.this;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                Throwable th = (Throwable) obj;
                InterfaceC05190Ih interfaceC05190Ih = c29374Bfu.LIZIZ;
                if (interfaceC05190Ih != null) {
                    long id = interfaceC05190Ih.getId();
                    if (i2 == 1) {
                        str = "ttlive_follow";
                    } else {
                        str = "ttlive_unfollow";
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("proponent_id", Long.valueOf(id));
                    hashMap2.put("adopter_id", Long.valueOf(j3));
                    hashMap2.put("room_id", Long.valueOf(j4));
                    if (th != null) {
                        str2 = th.getMessage();
                        if (th instanceof C276516r) {
                            hashMap2.put("error_code", Integer.valueOf(((C276516r) th).getErrorCode()));
                        }
                    } else {
                        str2 = "";
                    }
                    hashMap2.put("error_msg", str2);
                    C0K2.LJII(1, O5Y.LJJL(str), hashMap2);
                    C0K2.LJII(1, O5Y.LJJLI(str), hashMap2);
                }
            }
        });
        return LJJJJLL.LJJJJLL();
    }
}
