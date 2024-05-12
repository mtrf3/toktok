package com.bytedance.android.livesdk.usercard.profilev3;

import X.AbstractC019505v;
import X.AbstractC29482Bhe;
import X.B83;
import X.BJM;
import X.BZI;
import X.C05170If;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C199097rd;
import X.C28388BCe;
import X.C28447BEl;
import X.C28448BEm;
import X.C28450BEo;
import X.C28555BIp;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C29356Bfc;
import X.C29374Bfu;
import X.C29377Bfx;
import X.C29456BhE;
import X.C29463BhL;
import X.C29484Bhg;
import X.C29494Bhq;
import X.C29500Bhw;
import X.C29504Bi0;
import X.C29510Bi6;
import X.C29512Bi8;
import X.C29514BiA;
import X.C29516BiC;
import X.C29518BiE;
import X.C2NU;
import X.C30868C9o;
import X.C31470CWs;
import X.C31499CXv;
import X.C32537Cpp;
import X.C32I;
import X.C47061t0;
import X.C47121t6;
import X.C62814Ol0;
import X.C72818Shy;
import X.C73318Sq2;
import X.C74838TYs;
import X.C78501UrR;
import X.C78720Uuy;
import X.CN1;
import X.EnumC29509Bi5;
import X.EnumC29515BiB;
import X.InterfaceC29405BgP;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.ACListenerS25S0100000_5;
import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.api.revenue.UserBorderUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.ClickHorizontalPrivilegeCenterEvent;
import com.bytedance.android.livesdk.dataChannel.ShowPrivilegeCenterEvent;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveStreamerLayoutBGSetting;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.rank.api.RankBorderChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.Gson;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveProfileHeaderCell extends AbstractC29482Bhe<Boolean> implements GenericLifecycleObserver, InterfaceC72822Si2 {
    public C47061t0 LJLJJL;
    public View LJLJJLL;
    public C47061t0 LJLJL;
    public C31499CXv LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47061t0 LJLL;
    public C47121t6 LJLLI;
    public C31470CWs LJLLILLLL;
    public C29512Bi8 LJLLJ;
    public LiveIconView LJLLL;
    public C47121t6 LJLLLL;
    public ViewGroup LJLLLLLL;
    public C47121t6 LJLZ;
    public C47121t6 LJZ;
    public C47121t6 LJZI;
    public C47121t6 LJZL;
    public C47121t6 LL;
    public Animator LLD;
    public final C73318Sq2 LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public EnumC29509Bi5 LLFII;
    public View LLFZ;
    public User LLI;
    public User LLIFFJFJJ;
    public Room LLII;
    public UserProfileEvent LLIIII;
    public C29518BiE LLIIIILZ;
    public final boolean LLIIIJ;
    public final boolean LLIIIL;

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return 0;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private final void onCreate() {
        C72818Shy.LIZLLL("user_border_update_event", this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        Animator animator = this.LLD;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
            animator.cancel();
        }
        this.LLF.LIZLLL();
        C72818Shy.LJII("user_border_update_event", this);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bytedance.android.live.base.model.user.User, O] */
    public final void LJIIJJI() {
        String str;
        if (C2NU.LIZ.LIZIZ()) {
            FragmentManager fragmentManager = (FragmentManager) this.LJLILLLLZI.kv0(C29494Bhq.class);
            if (fragmentManager != null) {
                if (this.LJLIL.LIZJ.LIZJ()) {
                    new LiveAdminSettingDialog().show(fragmentManager, "LiveProfileDialog");
                } else {
                    DataChannel dataChannel = this.LJLILLLLZI;
                    ?? r1 = this.LLIFFJFJJ;
                    if (r1 != 0) {
                        ((C32537Cpp) dataChannel.gv0(C28450BEo.class)).LIZ = r1;
                        C28448BEm c28448BEm = new C28448BEm();
                        c28448BEm.setMsgId(this.LJLIL.LIZJ.LIZ.msgId);
                        c28448BEm.setReleaseId(this.LJLIL.LIZJ.LIZ.releaseId);
                        String str2 = this.LJLIL.LIZJ.LIZ.content;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        c28448BEm.setMsgContent(str2);
                        String str4 = this.LJLIL.LIZJ.LIZ.mReportType;
                        o.LJIIIIZZ(str4, "config.profileRoleInfo.event.mReportType");
                        c28448BEm.setReportType(str4);
                        String str5 = this.LJLIL.LJI;
                        if (str5 != null) {
                            str3 = str5;
                        }
                        c28448BEm.setSource(str3);
                        if (o.LJ("normal", this.LJLIL.LIZJ.LIZ.clickMethod)) {
                            c28448BEm.setReportContent("normal");
                        } else if (o.LJ("pin", this.LJLIL.LIZJ.LIZ.clickMethod)) {
                            c28448BEm.setReportContent("pin_comment");
                            c28448BEm.setPinId(this.LJLIL.LIZJ.LIZ.pinId);
                            c28448BEm.setPinMsgId(this.LJLIL.LIZJ.LIZ.pinMsgId);
                        }
                        C28447BEl.LIZ(this.LJLIL.LJ, c28448BEm).show(fragmentManager, "LiveProfileDialog");
                    } else {
                        o.LJIJI("targetUser");
                        throw null;
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            User user = this.LLI;
            if (user != null) {
                linkedHashMap.put("user_id", String.valueOf(user.getId()));
                User user2 = this.LLIFFJFJJ;
                if (user2 != null) {
                    linkedHashMap.put("to_user_id", String.valueOf(user2.getId()));
                    if (this.LJLIL.LIZJ.LIZ()) {
                        str = "anchor";
                    } else {
                        str = "admin";
                    }
                    linkedHashMap.put("admin_type", str);
                    BZI LIZ = C28787BRn.LIZ("livesdk_manage_click");
                    LIZ.LJIILLIIL(this.LJLILLLLZI);
                    LIZ.LJIIL("click");
                    LIZ.LJJIFFI(linkedHashMap);
                    LIZ.LJJIIJZLJL();
                    return;
                }
                o.LJIJI("targetUser");
                throw null;
            }
            o.LJIJI("selfUser");
            throw null;
        }
        C30868C9o.LIZJ(R.string.n0o);
    }

    public final void LJIIL() {
        if (this.LJLIL.LJ) {
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            Context context = this.LJLIL.LIZ;
            Room room = this.LLII;
            if (room != null) {
                iHybridContainerService.Vs0(context, C62814Ol0.LJIIZILJ(context, room, "personal_profile"), null);
                return;
            } else {
                o.LJIJI("room");
                throw null;
            }
        }
        this.LJLILLLLZI.pv0(ClickHorizontalPrivilegeCenterEvent.class);
    }

    public final void LJIILIIL() {
        String str;
        C28555BIp c28555BIp;
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            Context context = this.LJLIL.LIZ;
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sot);
            c29356Bfc.LIZJ = -1;
            c29356Bfc.LJ = "live_detail";
            c29356Bfc.LJFF = "user_report";
            c29356Bfc.LIZLLL = "popup";
            ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new C29510Bi6(this));
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            if (((IShareService) CN1.LIZ(IShareService.class)).un0() == null) {
                return;
            }
            if (this.LJLIL.LIZJ.LIZJ()) {
                str = "anchor_profile";
            } else {
                str = "user_profile";
            }
            UserProfileEvent userProfileEvent = this.LLIIII;
            if (userProfileEvent != null) {
                if (userProfileEvent.msgId != 0 && !TextUtils.isEmpty(userProfileEvent.content)) {
                    Room room = this.LLII;
                    if (room != null) {
                        long id = room.getId();
                        Room room2 = this.LLII;
                        if (room2 != null) {
                            long ownerUserId = room2.getOwnerUserId();
                            User user = this.LLIFFJFJJ;
                            if (user != null) {
                                long id2 = user.getId();
                                User user2 = this.LLIFFJFJJ;
                                if (user2 != null) {
                                    String secUid = user2.getSecUid();
                                    UserProfileEvent userProfileEvent2 = this.LLIIII;
                                    if (userProfileEvent2 != null) {
                                        long j = userProfileEvent2.msgId;
                                        long j2 = userProfileEvent2.releaseId;
                                        String str2 = userProfileEvent2.content;
                                        String LJIILIIL = BJM.LJIILIIL();
                                        String LJFF = BJM.LJFF();
                                        String LJIIIIZZ = BJM.LJIIIIZZ();
                                        UserProfileEvent userProfileEvent3 = this.LLIIII;
                                        if (userProfileEvent3 != null) {
                                            c28555BIp = new C28555BIp(id, ownerUserId, id2, secUid, str, j, j2, str2, LJIILIIL, LJFF, LJIIIIZZ, userProfileEvent3.mReportType, userProfileEvent3.chatType, C28835BTj.LIZIZ(null, this.LJLILLLLZI, "user_live_duration"), (String) this.LJLILLLLZI.kv0(C28388BCe.class));
                                        } else {
                                            o.LJIJI("event");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("event");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("targetUser");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("targetUser");
                                throw null;
                            }
                        } else {
                            o.LJIJI("room");
                            throw null;
                        }
                    } else {
                        o.LJIJI("room");
                        throw null;
                    }
                } else {
                    Room room3 = this.LLII;
                    if (room3 != null) {
                        long id3 = room3.getId();
                        Room room4 = this.LLII;
                        if (room4 != null) {
                            long ownerUserId2 = room4.getOwnerUserId();
                            User user3 = this.LLIFFJFJJ;
                            if (user3 != null) {
                                long id4 = user3.getId();
                                User user4 = this.LLIFFJFJJ;
                                if (user4 != null) {
                                    String secUid2 = user4.getSecUid();
                                    String LJFF2 = BJM.LJFF();
                                    String LJIIIIZZ2 = BJM.LJIIIIZZ();
                                    String str3 = (String) this.LJLILLLLZI.kv0(C28388BCe.class);
                                    UserProfileEvent userProfileEvent4 = this.LLIIII;
                                    if (userProfileEvent4 != null) {
                                        c28555BIp = new C28555BIp(id3, ownerUserId2, id4, secUid2, str, LJFF2, LJIIIIZZ2, str3, userProfileEvent4.mReportType, BJM.LJIILIIL(), C28835BTj.LIZIZ(null, this.LJLILLLLZI, "user_live_duration"));
                                    } else {
                                        o.LJIJI("event");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("targetUser");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("targetUser");
                                throw null;
                            }
                        } else {
                            o.LJIJI("room");
                            throw null;
                        }
                    } else {
                        o.LJIJI("room");
                        throw null;
                    }
                }
                UserProfileEvent userProfileEvent5 = this.LLIIII;
                if (userProfileEvent5 != null) {
                    if (o.LJ("normal", userProfileEvent5.clickMethod)) {
                        c28555BIp.LJIILL = "normal";
                    }
                    UserProfileEvent userProfileEvent6 = this.LLIIII;
                    if (userProfileEvent6 != null) {
                        if (o.LJ("pin", userProfileEvent6.clickMethod)) {
                            c28555BIp.LJIILL = "pin_comment";
                            UserProfileEvent userProfileEvent7 = this.LLIIII;
                            if (userProfileEvent7 != null) {
                                c28555BIp.LJIJI = userProfileEvent7.pinId;
                                c28555BIp.LJIJJ = userProfileEvent7.pinMsgId;
                            } else {
                                o.LJIJI("event");
                                throw null;
                            }
                        }
                        c28555BIp.LJJI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
                        c28555BIp.LJJ = C74838TYs.LJ().LJIIZILJ;
                        c28555BIp.LJIIL = this.LJLIL.LJ;
                        ((IUserManageService) CN1.LIZ(IUserManageService.class)).oo(this.LJLIL.LIZ, c28555BIp, this.LJLILLLLZI);
                        return;
                    }
                    o.LJIJI("event");
                    throw null;
                }
                o.LJIJI("event");
                throw null;
            }
            o.LJIJI("event");
            throw null;
        }
        C30868C9o.LIZJ(R.string.n0o);
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJ() {
        return this.LLIIIL;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LLIIIJ;
    }

    public LiveProfileHeaderCell(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        this.LLF = new C73318Sq2();
        this.LLFII = EnumC29509Bi5.REPORT;
        c29484Bhg.LIZIZ.getLifecycle().addObserver(this);
        this.LLIIIJ = true;
        this.LLIIIL = c29484Bhg.LIZJ.LIZLLL();
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cyd, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…header_cell, null, false)");
        this.LLFZ = LLLLIILL;
        this.LJLJJL = (C47061t0) LLLLIILL.findViewById(R.id.abh);
        View view = this.LLFZ;
        if (view != null) {
            this.LJLJJLL = view.findViewById(R.id.ac2);
            View view2 = this.LLFZ;
            if (view2 != null) {
                this.LJLJL = (C47061t0) view2.findViewById(R.id.abp);
                View view3 = this.LLFZ;
                if (view3 != null) {
                    this.LJLJLJ = (C31499CXv) view3.findViewById(R.id.h1c);
                    View view4 = this.LLFZ;
                    if (view4 != null) {
                        this.LJLJLLL = (C47121t6) view4.findViewById(R.id.h1_);
                        View view5 = this.LLFZ;
                        if (view5 != null) {
                            this.LJLL = (C47061t0) view5.findViewById(R.id.a_u);
                            View view6 = this.LLFZ;
                            if (view6 != null) {
                                this.LJLLI = (C47121t6) view6.findViewById(R.id.mzt);
                                View view7 = this.LLFZ;
                                if (view7 != null) {
                                    this.LJLLILLLL = (C31470CWs) view7.findViewById(R.id.ag1);
                                    View view8 = this.LLFZ;
                                    if (view8 != null) {
                                        this.LJLLJ = (C29512Bi8) view8.findViewById(R.id.o4);
                                        View view9 = this.LLFZ;
                                        if (view9 != null) {
                                            this.LJLLL = (LiveIconView) view9.findViewById(R.id.o9);
                                            View view10 = this.LLFZ;
                                            if (view10 != null) {
                                                this.LJLLLL = (C47121t6) view10.findViewById(R.id.ov);
                                                View view11 = this.LLFZ;
                                                if (view11 != null) {
                                                    this.LJLLLLLL = (ViewGroup) view11.findViewById(R.id.d2z);
                                                    View view12 = this.LLFZ;
                                                    if (view12 != null) {
                                                        this.LJZ = (C47121t6) view12.findViewById(R.id.dl4);
                                                        View view13 = this.LLFZ;
                                                        if (view13 != null) {
                                                            this.LJZL = (C47121t6) view13.findViewById(R.id.dle);
                                                            View view14 = this.LLFZ;
                                                            if (view14 != null) {
                                                                this.LJLZ = (C47121t6) view14.findViewById(R.id.dl1);
                                                                View view15 = this.LLFZ;
                                                                if (view15 != null) {
                                                                    this.LJZI = (C47121t6) view15.findViewById(R.id.dld);
                                                                    View view16 = this.LLFZ;
                                                                    if (view16 != null) {
                                                                        this.LL = (C47121t6) view16.findViewById(R.id.h9r);
                                                                        View view17 = this.LLFZ;
                                                                        if (view17 != null) {
                                                                            AbstractC019505v abstractC019505v = (AbstractC019505v) view17.findViewById(R.id.cc3);
                                                                            if (abstractC019505v != null) {
                                                                                abstractC019505v.setReferencedIds(new int[]{R.id.h1c, R.id.mzt, R.id.dk7});
                                                                            }
                                                                            if (this.LJLIL.LIZJ.LIZJ()) {
                                                                                this.LJLILLLLZI.lv0(this.LJLIL.LIZIZ, RankBorderChannel.class, new AqS171S0100000_5(this, 913));
                                                                            }
                                                                            if (this.LJLIL.LIZJ.LIZLLL()) {
                                                                                this.LJLILLLLZI.lv0(this.LJLIL.LIZIZ, UserBorderUpdateChannel.class, new AqS171S0100000_5(this, 914));
                                                                                this.LJLILLLLZI.lv0(this.LJLIL.LIZIZ, ShowPrivilegeCenterEvent.class, new AqS171S0100000_5(this, 915));
                                                                            }
                                                                            View view18 = this.LLFZ;
                                                                            if (view18 != null) {
                                                                                return view18;
                                                                            }
                                                                            o.LJIJI("contentView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("contentView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("contentView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("contentView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("contentView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("contentView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("contentView");
                                                    throw null;
                                                }
                                                o.LJIJI("contentView");
                                                throw null;
                                            }
                                            o.LJIJI("contentView");
                                            throw null;
                                        }
                                        o.LJIJI("contentView");
                                        throw null;
                                    }
                                    o.LJIJI("contentView");
                                    throw null;
                                }
                                o.LJIJI("contentView");
                                throw null;
                            }
                            o.LJIJI("contentView");
                            throw null;
                        }
                        o.LJIJI("contentView");
                        throw null;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final C29463BhL LJIIIIZZ(User user) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ArrayList arrayList;
        ArrayList arrayList2;
        EnumC29509Bi5 enumC29509Bi5;
        UserAttr userAttr;
        long j;
        long j2;
        long j3;
        String newBio;
        String LJIILJJIL;
        ImageModel imageModel3;
        C29463BhL c29463BhL = new C29463BhL(false, EnumC29515BiB.HEAD);
        ImageModel avatarThumb = user.getAvatarThumb();
        User user2 = this.LLIFFJFJJ;
        if (user2 != null) {
            if (!C29500Bhw.LIZ(avatarThumb, user2.getAvatarThumb())) {
                c29463BhL.LIZ = true;
                C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(user.getAvatarThumb());
                LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_CENTER);
                LJIIIZ.LJIIJJI(this.LJLJJL);
            }
            BorderInfo LIZ = C29504Bi0.LIZ(user);
            User user3 = this.LLIFFJFJJ;
            if (user3 != null) {
                BorderInfo LIZ2 = C29504Bi0.LIZ(user3);
                if (LIZ == null ? LIZ2 != null : LIZ2 == null || !C29500Bhw.LIZ(LIZ.icon, LIZ2.icon)) {
                    c29463BhL.LIZ = true;
                    BorderInfo LIZ3 = C29504Bi0.LIZ(user);
                    if (LIZ3 == null) {
                        C29306Beo.LJI(this.LJLJL);
                        C29306Beo.LJJLJLI(this.LJLJJLL);
                    } else {
                        C29306Beo.LJJLJLI(this.LJLJL);
                        C29306Beo.LJI(this.LJLJJLL);
                        C15650jR.LIZ().LJIIIZ(LIZ3.icon).LJIIJJI(this.LJLJL);
                        C29504Bi0.LIZIZ(user, "profile_card", this.LJLIL.LIZJ.LIZ(), C29504Bi0.LIZ(user));
                    }
                }
                String LIZLLL = C05170If.LIZLLL(user);
                User user4 = this.LLIFFJFJJ;
                if (user4 != null) {
                    if (!TextUtils.equals(LIZLLL, C05170If.LIZLLL(user4))) {
                        c29463BhL.LIZ = true;
                        C47121t6 c47121t6 = this.LJLJLLL;
                        if (c47121t6 != null) {
                            c47121t6.setText(C05170If.LIZLLL(user));
                        }
                        C47121t6 c47121t62 = this.LJLJLLL;
                        if (c47121t62 != null) {
                            c47121t62.requestLayout();
                        }
                    }
                    AuthenticationInfo authenticationInfo = user.getAuthenticationInfo();
                    if (authenticationInfo != null) {
                        imageModel = authenticationInfo.authenticationBadge;
                    } else {
                        imageModel = null;
                    }
                    User user5 = this.LLIFFJFJJ;
                    if (user5 != null) {
                        AuthenticationInfo authenticationInfo2 = user5.getAuthenticationInfo();
                        if (authenticationInfo2 != null) {
                            imageModel2 = authenticationInfo2.authenticationBadge;
                        } else {
                            imageModel2 = null;
                        }
                        if (!C29500Bhw.LIZ(imageModel, imageModel2)) {
                            c29463BhL.LIZ = true;
                            AuthenticationInfo authenticationInfo3 = user.getAuthenticationInfo();
                            if (authenticationInfo3 != null && (imageModel3 = authenticationInfo3.authenticationBadge) != null) {
                                C29306Beo.LJJLJLI(this.LJLL);
                                C78720Uuy LJIIIZ2 = C15650jR.LIZ().LJIIIZ(imageModel3);
                                LJIIIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
                                LJIIIZ2.LJIIJJI(this.LJLL);
                            } else {
                                C29306Beo.LJI(this.LJLL);
                            }
                        }
                        String LJ = C05170If.LJ(user);
                        User user6 = this.LLIFFJFJJ;
                        if (user6 != null) {
                            if (!o.LJ(LJ, C05170If.LJ(user6))) {
                                c29463BhL.LIZ = true;
                                C47121t6 c47121t63 = this.LJLLI;
                                if (c47121t63 != null) {
                                    c47121t63.setText(C05170If.LJ(user));
                                }
                            }
                            User user7 = this.LLIFFJFJJ;
                            if (user7 != null) {
                                List<BadgeStruct> badgeList = user7.getBadgeList();
                                if (badgeList != null) {
                                    arrayList = new ArrayList();
                                    for (BadgeStruct badgeStruct : badgeList) {
                                        if (badgeStruct.exhibitionType == 1) {
                                            arrayList.add(badgeStruct);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                List<BadgeStruct> badgeList2 = user.getBadgeList();
                                if (badgeList2 != null) {
                                    arrayList2 = new ArrayList();
                                    for (BadgeStruct badgeStruct2 : badgeList2) {
                                        if (badgeStruct2.exhibitionType == 1) {
                                            arrayList2.add(badgeStruct2);
                                        }
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                if (arrayList != null) {
                                    if (arrayList2 != null) {
                                        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(Integer.valueOf(((BadgeStruct) it.next()).badgeScene));
                                        }
                                        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList2, 10));
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(Integer.valueOf(((BadgeStruct) it2.next()).badgeScene));
                                        }
                                        if (!arrayList3.containsAll(arrayList4) || !arrayList4.containsAll(arrayList3)) {
                                            LJIIJ(arrayList2);
                                        }
                                    } else {
                                        C29306Beo.LJI(this.LJLLILLLL);
                                    }
                                    c29463BhL.LIZ = true;
                                } else if (arrayList2 != null) {
                                    LJIIJ(arrayList2);
                                    c29463BhL.LIZ = true;
                                }
                                C29456BhE c29456BhE = this.LJLIL.LIZJ;
                                if (c29456BhE.LIZLLL()) {
                                    enumC29509Bi5 = EnumC29509Bi5.PRIVILEGE;
                                } else if (c29456BhE.LJ() || (!c29456BhE.LIZ() && (!c29456BhE.LIZIZ() || c29456BhE.LIZJ() || ((userAttr = user.getUserAttr()) != null && userAttr.isAdmin)))) {
                                    enumC29509Bi5 = EnumC29509Bi5.REPORT;
                                } else {
                                    enumC29509Bi5 = EnumC29509Bi5.MANAGE;
                                }
                                EnumC29509Bi5 enumC29509Bi52 = this.LLFII;
                                if (enumC29509Bi5 != enumC29509Bi52) {
                                    int ordinal = enumC29509Bi52.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            if (ordinal == 2) {
                                                LiveIconView liveIconView = this.LJLLL;
                                                if (liveIconView != null) {
                                                    liveIconView.setIconAttr(R.attr.atg);
                                                }
                                                C47121t6 c47121t64 = this.LJLLLL;
                                                if (c47121t64 != null) {
                                                    c47121t64.setText(R.string.svu);
                                                }
                                                C29512Bi8 c29512Bi8 = this.LJLLJ;
                                                if (c29512Bi8 != null) {
                                                    C16880lQ.LJJIJ(c29512Bi8, new ACListenerS25S0100000_5(this, 474));
                                                }
                                            }
                                        } else {
                                            LiveIconView liveIconView2 = this.LJLLL;
                                            if (liveIconView2 != null) {
                                                liveIconView2.setIconAttr(R.attr.at_);
                                            }
                                            C29512Bi8 c29512Bi82 = this.LJLLJ;
                                            if (c29512Bi82 != null) {
                                                C16880lQ.LJJIJ(c29512Bi82, new ACListenerS25S0100000_5(this, 472));
                                            }
                                        }
                                    } else {
                                        if (this.LLFF) {
                                            LiveIconView liveIconView3 = this.LJLLL;
                                            if (liveIconView3 != null) {
                                                liveIconView3.setIcon(R.drawable.d_5);
                                            }
                                            C47121t6 c47121t65 = this.LJLLLL;
                                            if (c47121t65 != null) {
                                                c47121t65.setText(R.string.ml3);
                                            }
                                            C29512Bi8 c29512Bi83 = this.LJLLJ;
                                            if (c29512Bi83 != null) {
                                                C16880lQ.LJJIJ(c29512Bi83, new ACListenerS25S0100000_5(this, 470));
                                            }
                                            C29306Beo.LJJLJLI(this.LJLLJ);
                                            DataChannel dataChannel = this.LJLILLLLZI;
                                            Room room = this.LLII;
                                            if (room != null) {
                                                C62814Ol0.LJJIII(room, dataChannel, "show", "personal_profile");
                                            } else {
                                                o.LJIJI("room");
                                                throw null;
                                            }
                                        } else {
                                            C29306Beo.LJI(this.LJLLJ);
                                        }
                                        InterfaceC30442Bx8.B2.LIZJ(Boolean.valueOf(this.LLFF));
                                    }
                                    c29463BhL.LIZ = true;
                                }
                                FollowInfo followInfo = user.getFollowInfo();
                                long j4 = 0;
                                if (followInfo != null) {
                                    j = followInfo.getFollowerCount();
                                } else {
                                    j = 0;
                                }
                                String LJIILLIIL = b.LJIILLIIL(j);
                                User user8 = this.LLIFFJFJJ;
                                if (user8 != null) {
                                    FollowInfo followInfo2 = user8.getFollowInfo();
                                    if (followInfo2 != null) {
                                        j2 = followInfo2.getFollowerCount();
                                    } else {
                                        j2 = 0;
                                    }
                                    if (!o.LJ(LJIILLIIL, b.LJIILLIIL(j2))) {
                                        c29463BhL.LIZ = true;
                                        C47121t6 c47121t66 = this.LJZ;
                                        if (c47121t66 != null) {
                                            c47121t66.setText(LJIILLIIL);
                                        }
                                    }
                                    FollowInfo followInfo3 = user.getFollowInfo();
                                    if (followInfo3 != null) {
                                        j3 = followInfo3.getFollowingCount();
                                    } else {
                                        j3 = 0;
                                    }
                                    String LJIILLIIL2 = b.LJIILLIIL(j3);
                                    User user9 = this.LLIFFJFJJ;
                                    if (user9 != null) {
                                        FollowInfo followInfo4 = user9.getFollowInfo();
                                        if (followInfo4 != null) {
                                            j4 = followInfo4.getFollowingCount();
                                        }
                                        if (!o.LJ(LJIILLIIL2, b.LJIILLIIL(j4))) {
                                            c29463BhL.LIZ = true;
                                            C47121t6 c47121t67 = this.LJZL;
                                            if (c47121t67 != null) {
                                                c47121t67.setText(LJIILLIIL2);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(user.getAutoGraph())) {
                                            newBio = user.getAutoGraph();
                                        } else {
                                            newBio = C15380j0.LJIILJJIL(R.string.spl);
                                        }
                                        User user10 = this.LLIFFJFJJ;
                                        if (user10 != null) {
                                            if (!TextUtils.isEmpty(user10.getAutoGraph())) {
                                                User user11 = this.LLIFFJFJJ;
                                                if (user11 != null) {
                                                    LJIILJJIL = user11.getAutoGraph();
                                                } else {
                                                    o.LJIJI("targetUser");
                                                    throw null;
                                                }
                                            } else {
                                                LJIILJJIL = C15380j0.LJIILJJIL(R.string.spl);
                                            }
                                            if (!o.LJ(newBio, LJIILJJIL)) {
                                                c29463BhL.LIZ = true;
                                                C47121t6 c47121t68 = this.LL;
                                                if (c47121t68 != null) {
                                                    o.LJIIIIZZ(newBio, "newBio");
                                                    c47121t68.setText(ujb.o.LJJJJZ(newBio, "\n", " ", false));
                                                }
                                            }
                                            this.LLIFFJFJJ = user;
                                            return c29463BhL;
                                        }
                                        o.LJIJI("targetUser");
                                        throw null;
                                    }
                                    o.LJIJI("targetUser");
                                    throw null;
                                }
                                o.LJIJI("targetUser");
                                throw null;
                            }
                            o.LJIJI("targetUser");
                            throw null;
                        }
                        o.LJIJI("targetUser");
                        throw null;
                    }
                    o.LJIJI("targetUser");
                    throw null;
                }
                o.LJIJI("targetUser");
                throw null;
            }
            o.LJIJI("targetUser");
            throw null;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C29508Bi4
            if (r0 == 0) goto L1f
            r5 = r9
            X.Bi4 r5 = (X.C29508Bi4) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L72
        L1f:
            X.Bi4 r5 = new X.Bi4
            r5.<init>(r8, r9)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi> r0 = com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Throwable -> L86
            com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi r6 = (com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi) r6     // Catch: java.lang.Throwable -> L86
            X.Bhg r0 = r8.LJLIL     // Catch: java.lang.Throwable -> L86
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF     // Catch: java.lang.Throwable -> L86
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L86
            X.Bhg r0 = r8.LJLIL     // Catch: java.lang.Throwable -> L86
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF     // Catch: java.lang.Throwable -> L86
            long r0 = r0.getOwnerUserId()     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L86
            X.Bi7 r0 = X.EnumC29511Bi7.REQUEST_FROM_SCENE_PERSONAL_CARD     // Catch: java.lang.Throwable -> L86
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L86
            X.Svk r1 = r6.getUserPrivilegeInfo(r7, r2, r1, r0)     // Catch: java.lang.Throwable -> L86
            X.T0k r0 = X.T16.LIZ()     // Catch: java.lang.Throwable -> L86
            X.Sro r0 = r1.LJJL(r0)     // Catch: java.lang.Throwable -> L86
            r5.LJLJI = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = X.C29306Beo.LJJIIZ(r0, r5)     // Catch: java.lang.Throwable -> L86
            if (r1 != r4) goto L75
            return r4
        L72:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L86
        L75:
            tikcast.api.privilege.QueryUserPrivilegesResponse r1 = (tikcast.api.privilege.QueryUserPrivilegesResponse) r1     // Catch: java.lang.Throwable -> L86
            tikcast.api.privilege.QueryUserPrivilegesResponse$Data r0 = r1.data     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L84
            boolean r0 = r0.showEntrance     // Catch: java.lang.Throwable -> L86
            if (r0 != r3) goto L84
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L86
            goto L88
        L84:
            r3 = 0
            goto L7f
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final void LJIIJ(List<BadgeStruct> list) {
        C31470CWs c31470CWs = this.LJLLILLLL;
        if (c31470CWs != null) {
            boolean LIZ = this.LJLIL.LIZJ.LIZ();
            User user = this.LLIFFJFJJ;
            if (user != null) {
                C31470CWs.LIZIZ(c31470CWs, LIZ, list, user, 7, new AqS171S0100000_5(this, 497), 64);
                c31470CWs.setOnBadgeClickListener(new C29516BiC(this));
                C29306Beo.LJJLJLI(c31470CWs);
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        for (BadgeStruct badgeStruct : list) {
            if (C29514BiA.LIZ(badgeStruct)) {
                User user2 = this.LLIFFJFJJ;
                if (user2 != null) {
                    C29514BiA.LIZLLL("livesdk_top_active_user_rank_badge_show", "personal_profile", user2.getId(), this.LJLILLLLZI);
                } else {
                    o.LJIJI("targetUser");
                    throw null;
                }
            }
            if (C29514BiA.LIZIZ(badgeStruct)) {
                User user3 = this.LLIFFJFJJ;
                if (user3 != null) {
                    C29514BiA.LJFF(user3.getId(), "personal_profile", C29306Beo.LJIIJ(this.LJLIL.LJIIIIZZ));
                } else {
                    o.LJIJI("targetUser");
                    throw null;
                }
            }
        }
    }

    public final void LJIILJJIL(BorderInfo borderInfo) {
        if (borderInfo == null) {
            C29306Beo.LJI(this.LJLJL);
            C29306Beo.LJJLJLI(this.LJLJJLL);
            return;
        }
        C29306Beo.LJJLJLI(this.LJLJL);
        C29306Beo.LJI(this.LJLJJLL);
        C15650jR.LIZ().LJIIIZ(borderInfo.icon).LJIIJJI(this.LJLJL);
        User user = this.LLIFFJFJJ;
        if (user == null) {
            return;
        }
        C29504Bi0.LIZIZ(user, "profile_card", this.LJLIL.LIZJ.LIZ(), C29504Bi0.LIZ(user));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        InterfaceC78280Uns map;
        InterfaceC78280Uns map2;
        InterfaceC78280Uns map3;
        if (this.LJLIL.LIZJ.LIZLLL() && o.LJ(c199097rd.LJLIL, "user_border_update_event")) {
            try {
                String str2 = null;
                if (!LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
                    InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                    if (interfaceC78280Uns != null && (map3 = interfaceC78280Uns.getMap("icon")) != null) {
                        ImageModel imageModel = (ImageModel) new Gson().LJI(C78501UrR.LIZIZ(map3).toString(), ImageModel.class);
                        BorderInfo borderInfo = new BorderInfo();
                        borderInfo.icon = imageModel;
                        LJIILJJIL(borderInfo);
                        return;
                    }
                    return;
                }
                BorderInfo borderInfo2 = new BorderInfo();
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && interfaceC78280Uns2.getInt("is_anchor_avatar") == 1) {
                    if (!this.LJLIL.LIZJ.LIZJ()) {
                        return;
                    }
                } else if (this.LJLIL.LIZJ.LIZJ()) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null && (map2 = interfaceC78280Uns3.getMap("icon")) != null) {
                    borderInfo2.icon = (ImageModel) new Gson().LJI(C78501UrR.LIZIZ(map2).toString(), ImageModel.class);
                }
                InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns4 != null && (map = interfaceC78280Uns4.getMap("personal_card_v2")) != null) {
                    borderInfo2.profileDecorationRibbon = (ImageModel) new Gson().LJI(C78501UrR.LIZIZ(map).toString(), ImageModel.class);
                }
                InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns5 != null) {
                    str = interfaceC78280Uns5.getString("avatar_background_color");
                } else {
                    str = null;
                }
                borderInfo2.avatarBackgroundColor = str;
                InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns6 != null) {
                    str2 = interfaceC78280Uns6.getString("avatar_background_border_color");
                }
                borderInfo2.avatarBackgroundBorderColor = str2;
                LJIILJJIL(borderInfo2);
                this.LJLILLLLZI.rv0(UserBorderUpdateChannel.class, borderInfo2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0431, code lost:
    
        if (r0.isAdmin == true) goto L216;
     */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.live.base.model.user.User r16, boolean r17, boolean r18, java.lang.Boolean r19) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell.LJII(com.bytedance.android.live.base.model.user.User, boolean, boolean, java.lang.Object):void");
    }
}
