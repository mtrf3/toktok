package X;

import Y.ACListenerS25S0100000_5;
import Y.AObjectS125S0200000_5;
import Y.AObjectS81S0300000_5;
import Y.AfS20S1100000_5;
import Y.AfS54S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BXT extends DialogC29865Bnp implements View.OnClickListener, InterfaceC28458BEw, BXW, InterfaceC28558BIs {
    public final Context LJLJL;
    public final CQO<?> LJLJLJ;
    public User LJLJLLL;
    public final Room LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final CR6 LJLLJ;
    public final InterfaceC05190Ih LJLLL;
    public final C30779C6d LJLLLL;
    public final String LJLLLLLL;
    public final boolean LJLZ;
    public final boolean LJZ;
    public final boolean LJZI;
    public final String LJZL;
    public final java.util.Map<String, String> LL;
    public final InterfaceC65784Pro<C76800UCe> LLD;
    public final InterfaceC65784Pro<C76800UCe> LLF;
    public final FragmentManager LLFF;
    public final InterfaceC65784Pro<C76800UCe> LLFFF;
    public final boolean LLFII;
    public final DataChannel LLFZ;
    public final BXV LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final boolean LLIIII;
    public View LLIIIILZ;
    public View LLIIIJ;
    public C47091t3 LLIIIL;

    @Override // X.InterfaceC28458BEw
    public final void Hh() {
    }

    @Override // X.InterfaceC28458BEw
    public final void k1(C28465BFd c28465BFd, Exception exc) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLIFFJFJJ = false;
        this.LLI.detachView();
        super.onDetachedFromWindow();
    }

    @Override // X.BXW
    public final void LJJZ() {
        if (!this.LLIFFJFJJ) {
            return;
        }
        this.LLII = false;
        LJJIIZI(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIFFJFJJ = true;
    }

    @Override // X.DialogC29865Bnp, X.DialogC38611fN, android.app.Dialog
    public final void onStart() {
        ViewGroup.LayoutParams layoutParams;
        View view;
        View decorView;
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setNavigationBarColor(C259910h.LIZIZ(R.attr.bme, getContext()));
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setLayout(-1, -1);
        }
        Activity LJIILJJIL = g0.LJIILJJIL(this.LJLJL);
        if (LJIILJJIL != null && C29306Beo.LJIIZILJ(LJIILJJIL.getRequestedOrientation())) {
            View findViewById = findViewById(R.id.o4);
            WindowManager.LayoutParams layoutParams2 = null;
            if (findViewById != null) {
                layoutParams = findViewById.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams3.width = Math.min(C81185Vtd.LIZIZ(), C81185Vtd.LIZLLL());
            C47151t9 c47151t9 = (C47151t9) findViewById(R.id.o4);
            if (c47151t9 != null) {
                c47151t9.setBottomEndRadius(C15380j0.LIZ(12.0f));
            }
            C47151t9 c47151t92 = (C47151t9) findViewById(R.id.o4);
            if (c47151t92 != null) {
                c47151t92.setBottomStartRadius(C15380j0.LIZ(12.0f));
            }
            C47151t9 c47151t93 = (C47151t9) findViewById(R.id.o4);
            if (c47151t93 != null) {
                c47151t93.setTopEndRadius(C15380j0.LIZ(12.0f));
            }
            C47151t9 c47151t94 = (C47151t9) findViewById(R.id.o4);
            if (c47151t94 != null) {
                c47151t94.setTopStartRadius(C15380j0.LIZ(12.0f));
            }
            layoutParams3.setMargins(0, 0, 0, C15380j0.LIZ(8.0f));
            layoutParams3.gravity = 81;
            Window window6 = getWindow();
            if (window6 != null) {
                view = window6.getDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.setSystemUiVisibility(3846);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Window window7 = getWindow();
                if (window7 != null && (layoutParams2 = window7.getAttributes()) != null) {
                    layoutParams2.layoutInDisplayCutoutMode = 1;
                }
                Window window8 = getWindow();
                if (window8 != null) {
                    window8.setAttributes(layoutParams2);
                }
                Window window9 = getWindow();
                if (window9 == null || (decorView = window9.getDecorView()) == null) {
                    return;
                }
                decorView.setSystemUiVisibility(3846);
            }
        }
    }

    @Override // X.BXW
    public final void C4(InterfaceC05190Ih interfaceC05190Ih) {
        if (!this.LLIFFJFJJ) {
            return;
        }
        if (interfaceC05190Ih != null && interfaceC05190Ih.getId() > 0) {
            User from = User.from(interfaceC05190Ih);
            if (from != null) {
                this.LJLJLLL = from;
                this.LLII = true;
                LJJIIZI(false);
                return;
            } else {
                new IllegalArgumentException("User is invalid");
                LJJZ();
                return;
            }
        }
        new IllegalArgumentException("User is invalid");
        LJJZ();
    }

    public final java.util.Map LJJIIJ(boolean z) {
        long j;
        Boolean LIZJ;
        String str;
        String str2;
        Room room;
        User owner;
        Room room2;
        HashMap hashMap = new HashMap();
        DataChannel dataChannel = this.LLFZ;
        long j2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        if (!z) {
            DataChannel dataChannel2 = this.LLFZ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
                j2 = owner.getId();
            }
            hashMap.put("anchor_id", String.valueOf(j2));
        }
        hashMap.put("type", "global_default_on");
        if (!z) {
            LIZJ = InterfaceC30442Bx8.u0.LIZJ();
            str = "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value";
        } else {
            LIZJ = InterfaceC30442Bx8.x0.LIZJ();
            str = "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value";
        }
        o.LJIIIIZZ(LIZJ, str);
        if (LIZJ.booleanValue()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        hashMap.put("from_status", str2);
        hashMap.put("position", "long_press");
        return hashMap;
    }

    public final void LJJIIJZLJL(int i) {
        String content;
        if (this.LLFF == null) {
            return;
        }
        CR6 cr6 = this.LJLLJ;
        if (cr6 instanceof ChatMessage) {
            content = ((ChatMessage) cr6).content;
        } else {
            content = "";
        }
        IAdminSettingService iAdminSettingService = (IAdminSettingService) CN1.LIZ(IAdminSettingService.class);
        long id = this.LJLL.getId();
        o.LJIIIIZZ(content, "content");
        iAdminSettingService.jE(id, content, this.LLFF, i);
    }

    public final void LJJIIZ(String str) {
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).af0().LJJIFFI(new AfS20S1100000_5(this, str, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00d9, code lost:
    
        if (X.C29306Beo.LJIL(java.lang.Boolean.valueOf(r2)) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(boolean r11) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXT.LJJIIZI(boolean):void");
    }

    @Override // X.InterfaceC28558BIs
    public final void U3(Exception exc) {
        if (!this.LLIFFJFJJ) {
            return;
        }
        BPP.LIZLLL(this.LJLJL, exc, R.string.svg);
    }

    @Override // X.InterfaceC28558BIs
    public final void ck(boolean z) {
        if (z) {
            LJJIIJZLJL(1);
        }
        if (!this.LLIFFJFJJ) {
            return;
        }
        LJJIIZI(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        BEF bef;
        C30926CBu c30926CBu;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        String str = "";
        if (num == null || num.intValue() != R.id.iww) {
            boolean z = true;
            String str2 = "anchor";
            if (num != null) {
                if (num.intValue() == R.id.iw1) {
                    User user = this.LJLJLLL;
                    if (this.LJLLJ instanceof ChatMessage) {
                        String LIZ = C05170If.LIZ(user);
                        ChatMessage chatMessage = (ChatMessage) this.LJLLJ;
                        String str3 = chatMessage.content;
                        if (str3 == null) {
                            str3 = "";
                        }
                        List list = chatMessage.f117emotes;
                        if (list == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        c30926CBu = new C30926CBu(LIZ, "", str3, list);
                    } else {
                        c30926CBu = new C30926CBu(1, C05170If.LIZ(user), "", false);
                    }
                    c30926CBu.LJIIJJI = this.LJLLJ.getMessageId();
                    c30926CBu.LJIIL = this.LJLJLJ.LJIILLIIL.LIZ;
                    c30926CBu.LJIIIIZZ = "message";
                    c30926CBu.LIZLLL = user;
                    ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
                    sender.getLogArgs().clear();
                    java.util.Map<String, String> map = this.LL;
                    if (map != null) {
                        sender.setLogArgs(map);
                    }
                    if (this.LLFII) {
                        sender.getLogArgs().put("reply_method", "pin");
                    } else if (this.LJLL.getOwnerUserId() == this.LJLJLLL.getId()) {
                        sender.getLogArgs().put("reply_method", "anchor");
                    } else {
                        sender.getLogArgs().put("reply_method", "viewer");
                    }
                    c30926CBu.LJIIIZ = sender;
                    C73943T0h.LIZ().LIZIZ(c30926CBu);
                    BKY.LIZIZ().LJFF(true);
                    dismiss();
                    return;
                }
                if (num.intValue() == R.id.hpq) {
                    DataChannel dataChannel = this.LLFZ;
                    if (dataChannel != null && (bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class)) != null && bef.LJLJJL) {
                        if (C29306Beo.LJIIJ(this.LLFZ)) {
                            C30868C9o.LIZJ(R.string.o8f);
                        }
                        if (C79146V4k.LJJJI(this.LLFZ)) {
                            C30868C9o.LIZJ(R.string.o8y);
                            return;
                        }
                        return;
                    }
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLF;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                    Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                        C12530eP c12530eP = EnumC12540eQ.Companion;
                        int i = anchorLevelPermission.pin;
                        c12530eP.getClass();
                        if (C12530eP.LIZ(i) != EnumC12540eQ.ON) {
                            return;
                        }
                    }
                    dismiss();
                    return;
                }
            }
            if (num == null) {
                return;
            }
            if (num.intValue() == R.id.guh) {
                if (this.LJLJLLL.getUserAttr() != null && this.LJLJLLL.getUserAttr().isMuted) {
                    z = false;
                }
                IUserManageService iUserManageService = (IUserManageService) CN1.LIZ(IUserManageService.class);
                if (z) {
                    iUserManageService.af0().LJJIFFI(new AfS54S0200000_5(iUserManageService, this, 60));
                } else {
                    iUserManageService.Qu(this.LJLL.getId(), this.LJLJLLL, this);
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_unmute_comment");
                    LIZ2.LJIIZILJ();
                    if (!this.LJLLI) {
                        str2 = "admin";
                    }
                    LIZ2.LJIJJ(str2, "admin_type");
                    LIZ2.LJIJJ(Long.valueOf(this.LJLL.getOwnerUserId()), "anchor_id");
                    LIZ2.LJIJJ(Long.valueOf(this.LJLL.getId()), "room_id");
                    LIZ2.LJIJJ(Long.valueOf(this.LJLJLLL.getId()), "to_user_id");
                    LIZ2.LJJIIJZLJL();
                }
                dismiss();
                return;
            }
            if (num.intValue() == R.id.fef) {
                User user2 = this.LJLJLLL;
                DialogC28454BEs XI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).XI(this.LJLJL, this.LJLL.getId(), this.LJLL.getOwnerUserId(), user2.getId(), new BXX(this));
                if (XI != null) {
                    C16880lQ.LIZ(XI);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(this.LJLL.getOwnerUserId()));
                String idStr = this.LJLL.getIdStr();
                o.LJIIIIZZ(idStr, "mRoom.idStr");
                hashMap.put("room_id", idStr);
                if (!this.LJLLI) {
                    str2 = "admin";
                }
                hashMap.put("admin_type", str2);
                hashMap.put("user_id", String.valueOf(user2.getId()));
                BZI LIZ3 = C28787BRn.LIZ("blocked_list_click");
                LIZ3.LJIIZILJ();
                LIZ3.LJJIFFI(hashMap);
                LIZ3.LJIIIZ("relation");
                LIZ3.LJIIL("click");
                LIZ3.LJJIIJZLJL();
                LJJIIZ("block");
                dismiss();
                return;
            }
            if (num.intValue() == R.id.izm) {
                LJJIIZI(false);
                return;
            }
            if (num.intValue() == R.id.aau) {
                boolean z2 = this.LJLLI;
                int i2 = R.string.oq4;
                String str4 = "on";
                if (z2) {
                    C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.x0;
                    c48459J0d.LIZ(Boolean.valueOf(true ^ c48459J0d.LIZJ().booleanValue()));
                    Boolean LIZJ = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
                    if (LIZJ.booleanValue()) {
                        i2 = R.string.oq8;
                    }
                    C30868C9o.LIZJ(i2);
                    BZI LIZ4 = C28787BRn.LIZ("livesdk_live_anchor_translation_click");
                    LIZ4.LJIILLIIL(this.LLFZ);
                    java.util.Map LJJIIJ = LJJIIJ(this.LJLLI);
                    if (!c48459J0d.LIZJ().booleanValue()) {
                        obj3 = "on";
                    } else {
                        obj3 = "off";
                    }
                    ((HashMap) LJJIIJ).put("from_status", obj3);
                    LIZ4.LJJIFFI(LJJIIJ);
                    LIZ4.LJJIIJZLJL();
                    BZI LIZ5 = C28787BRn.LIZ("livesdk_live_anchor_translation_update");
                    LIZ5.LJIILLIIL(this.LLFZ);
                    java.util.Map LJJIIJ2 = LJJIIJ(this.LJLLI);
                    if (!c48459J0d.LIZJ().booleanValue()) {
                        obj4 = "on";
                    } else {
                        obj4 = "off";
                    }
                    HashMap hashMap2 = (HashMap) LJJIIJ2;
                    hashMap2.put("from_status", obj4);
                    Boolean LIZJ2 = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ2, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
                    if (!LIZJ2.booleanValue()) {
                        str4 = "off";
                    }
                    hashMap2.put("to_status", str4);
                    LIZ5.LJJIFFI(LJJIIJ2);
                    LIZ5.LJJIIJZLJL();
                } else {
                    C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.u0;
                    c48459J0d2.LIZ(Boolean.valueOf(true ^ c48459J0d2.LIZJ().booleanValue()));
                    Boolean LIZJ3 = c48459J0d2.LIZJ();
                    o.LJIIIIZZ(LIZJ3, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
                    if (LIZJ3.booleanValue()) {
                        i2 = R.string.oq8;
                    }
                    C30868C9o.LIZJ(i2);
                    BZI LIZ6 = C28787BRn.LIZ("livesdk_live_translation_click");
                    LIZ6.LJIILLIIL(this.LLFZ);
                    java.util.Map LJJIIJ3 = LJJIIJ(this.LJLLI);
                    if (!c48459J0d2.LIZJ().booleanValue()) {
                        obj = "on";
                    } else {
                        obj = "off";
                    }
                    ((HashMap) LJJIIJ3).put("from_status", obj);
                    LIZ6.LJJIFFI(LJJIIJ3);
                    LIZ6.LJJIIJZLJL();
                    BZI LIZ7 = C28787BRn.LIZ("livesdk_live_translation_update");
                    LIZ7.LJIILLIIL(this.LLFZ);
                    java.util.Map LJJIIJ4 = LJJIIJ(this.LJLLI);
                    if (!c48459J0d2.LIZJ().booleanValue()) {
                        obj2 = "on";
                    } else {
                        obj2 = "off";
                    }
                    HashMap hashMap3 = (HashMap) LJJIIJ4;
                    hashMap3.put("from_status", obj2);
                    Boolean LIZJ4 = c48459J0d2.LIZJ();
                    o.LJIIIIZZ(LIZJ4, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
                    if (!LIZJ4.booleanValue()) {
                        str4 = "off";
                    }
                    hashMap3.put("to_status", str4);
                    LIZ7.LJJIFFI(LJJIIJ4);
                    LIZ7.LJJIIJZLJL();
                    Boolean LIZJ5 = c48459J0d2.LIZJ();
                    o.LJIIIIZZ(LIZJ5, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
                    if (LIZJ5.booleanValue()) {
                        BZI LIZ8 = C28787BRn.LIZ("livesdk_live_translation_open_show");
                        LIZ8.LJIILLIIL(this.LLFZ);
                        java.util.Map LJJIIJ5 = LJJIIJ(this.LJLLI);
                        HashMap hashMap4 = (HashMap) LJJIIJ5;
                        hashMap4.remove("from_status");
                        hashMap4.put("status", "success");
                        LIZ8.LJJIFFI(LJJIIJ5);
                        LIZ8.LJJIIJZLJL();
                    }
                }
                dismiss();
                return;
            }
            if (num.intValue() == R.id.lk1) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LLD;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
                dismiss();
                return;
            }
            if (num.intValue() != R.id.a6y) {
                return;
            }
            BZI LIZ9 = C28787BRn.LIZ("livesdk_comment_filter_long_press_approve");
            LIZ9.LJIIZILJ();
            if (!this.LJLLI) {
                str2 = "admin";
            }
            LIZ9.LJIJJ(str2, "admin_type");
            LIZ9.LJIJJ(Long.valueOf(this.LJLLJ.getMessageId()), "msg_id");
            LIZ9.LJJIIJZLJL();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LLFFF;
            if (interfaceC65784Pro3 != null) {
                interfaceC65784Pro3.invoke();
            }
            dismiss();
            return;
        }
        String LJFF = BJM.LJFF();
        String LJIIIIZZ = BJM.LJIIIIZZ();
        IUserManageService iUserManageService2 = (IUserManageService) CN1.LIZ(IUserManageService.class);
        Context context = this.LJLJL;
        long id = this.LJLL.getId();
        long ownerUserId = this.LJLL.getOwnerUserId();
        long id2 = this.LJLJLLL.getId();
        String secUid = this.LJLJLLL.getSecUid();
        long messageId = this.LJLLJ.getMessageId();
        CQO<?> cqo = this.LJLJLJ;
        long j = cqo.LJIILLIIL.LIZ;
        if (cqo instanceof CQK) {
            str = ((CQK) cqo).LLI();
        }
        Boolean bool = null;
        C28555BIp c28555BIp = new C28555BIp(id, ownerUserId, id2, secUid, "comment", messageId, j, str, BJM.LJIILIIL(), LJFF, LJIIIIZZ, this.LJLLLL.LIZ, "1", C28835BTj.LIZIZ(null, null, "user_live_duration"), this.LJLLLLLL);
        c28555BIp.LJJI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        C30779C6d c30779C6d = this.LJLLLL;
        c28555BIp.LJIILL = c30779C6d.LIZJ;
        c28555BIp.LJIJI = c30779C6d.LJ;
        c28555BIp.LJIJJ = c30779C6d.LIZLLL;
        Activity LJIILJJIL = g0.LJIILJJIL(this.LJLJL);
        if (LJIILJJIL != null) {
            bool = Boolean.valueOf(C29306Beo.LJIIZILJ(LJIILJJIL.getRequestedOrientation()));
        }
        c28555BIp.LJIIL = C29306Beo.LJIL(bool);
        iUserManageService2.Qp0(context, c28555BIp);
        LJJIIZ("report");
        dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        setContentView(C16880lQ.LLLZIIL(R.layout.cy3, getLayoutInflater(), null));
        C16880lQ.LJIILJJIL((FrameLayout) findViewById(R.id.liz), new ACListenerS25S0100000_5(this, 356));
        DataChannel dataChannel = this.LLFZ;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, CppSeeDetailsClickEvent.class, new AqS171S0100000_5(this, 754));
        }
        Drawable LIZIZ = C04270Et.LIZIZ(getContext(), R.drawable.ciy);
        if (LIZIZ != null) {
            LIZIZ.mutate();
            C07820Sk.LJI(LIZIZ, C259910h.LIZIZ(R.attr.bn5, getContext()));
        } else {
            LIZIZ = null;
        }
        ((LinearLayout) findViewById(R.id.gw9)).setDividerDrawable(LIZIZ);
        View findViewById = findViewById(R.id.izm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.retry)");
        this.LLIIIILZ = findViewById;
        View findViewById2 = findViewById(R.id.hpq);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.pin_comment)");
        this.LLIIIL = (C47091t3) findViewById2;
        View findViewById3 = findViewById(R.id.ia9);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.progress)");
        this.LLIIIJ = findViewById3;
        View view = this.LLIIIILZ;
        if (view != null) {
            C16880lQ.LJIIJ(this, view);
            C47091t3 c47091t3 = (C47091t3) findViewById(R.id.b3n);
            if (c47091t3 != null) {
                C16880lQ.LJJIFFI(c47091t3, new ACListenerS25S0100000_5(this, 357));
            }
            C47091t3 c47091t32 = (C47091t3) findViewById(R.id.iww);
            if (c47091t32 != null) {
                C16880lQ.LJJIFFI(c47091t32, this);
            }
            C47091t3 c47091t33 = (C47091t3) findViewById(R.id.iw1);
            if (c47091t33 != null) {
                C16880lQ.LJJIFFI(c47091t33, this);
            }
            C47091t3 c47091t34 = this.LLIIIL;
            if (c47091t34 != null) {
                C16880lQ.LJJIFFI(c47091t34, this);
                C47091t3 c47091t35 = (C47091t3) findViewById(R.id.guh);
                if (c47091t35 != null) {
                    C16880lQ.LJJIFFI(c47091t35, this);
                }
                C47091t3 c47091t36 = (C47091t3) findViewById(R.id.fef);
                if (c47091t36 != null) {
                    C16880lQ.LJJIFFI(c47091t36, this);
                }
                C47091t3 c47091t37 = (C47091t3) findViewById(R.id.aau);
                if (c47091t37 != null) {
                    C16880lQ.LJJIFFI(c47091t37, this);
                }
                C16880lQ.LJJIFFI((C47091t3) findViewById(R.id.lk1), this);
                C16880lQ.LJJIFFI((C47091t3) findViewById(R.id.a6y), this);
                int i = 0;
                LJJIIZI(false);
                if (this.LJLZ) {
                    findViewById(R.id.aau).setVisibility(0);
                    boolean z = this.LJLLI;
                    int i2 = R.string.mup;
                    if (!z) {
                        C47091t3 c47091t38 = (C47091t3) findViewById(R.id.aau);
                        Boolean LIZJ = InterfaceC30442Bx8.u0.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_AUDIENCE.value");
                        if (!LIZJ.booleanValue()) {
                            i2 = R.string.mun;
                        }
                        c47091t38.setText(i2);
                        BZI LIZ = C28787BRn.LIZ("livesdk_live_translation_show");
                        LIZ.LJIILLIIL(this.LLFZ);
                        LIZ.LJJIFFI(LJJIIJ(this.LJLLI));
                        LIZ.LJJIIJZLJL();
                    } else {
                        C47091t3 c47091t39 = (C47091t3) findViewById(R.id.aau);
                        Boolean LIZJ2 = InterfaceC30442Bx8.x0.LIZJ();
                        o.LJIIIIZZ(LIZJ2, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
                        if (!LIZJ2.booleanValue()) {
                            i2 = R.string.mun;
                        }
                        c47091t39.setText(i2);
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_anchor_translation_show");
                        LIZ2.LJIILLIIL(this.LLFZ);
                        LIZ2.LJJIFFI(LJJIIJ(this.LJLLI));
                        LIZ2.LJJIIJZLJL();
                    }
                } else {
                    findViewById(R.id.aau).setVisibility(8);
                }
                if (this.LJZ) {
                    findViewById(R.id.lk1).setVisibility(0);
                    ((C47091t3) findViewById(R.id.lk1)).setText(this.LJZL);
                } else {
                    findViewById(R.id.lk1).setVisibility(8);
                }
                CR6 cr6 = this.LJLLJ;
                if ((cr6 instanceof ChatMessage) && ((ChatMessage) cr6).communityflaggedStatus == 1) {
                    findViewById(R.id.a6y).setVisibility(0);
                } else {
                    findViewById(R.id.a6y).setVisibility(8);
                }
                C47091t3 c47091t310 = this.LLIIIL;
                if (c47091t310 != null) {
                    C29306Beo.LJJLIIIJJI(c47091t310, this.LJZI);
                    if (C29306Beo.LJJII(this.LLFZ)) {
                        C47091t3 c47091t311 = this.LLIIIL;
                        if (c47091t311 != null) {
                            c47091t311.setAlpha(1.0f);
                        } else {
                            o.LJIJI("pin");
                            throw null;
                        }
                    } else {
                        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(null, C28904BWa.LJLIL, new AqS171S0100000_5(this, 756), null, null, null);
                    }
                    if (!this.LJLLI) {
                        View findViewById4 = findViewById(R.id.iw1);
                        if (C29232Bdc.LJFF(this.LLFZ)) {
                            i = 8;
                        }
                        findViewById4.setVisibility(i);
                    }
                    DataChannel dataChannel2 = this.LLFZ;
                    if (dataChannel2 != null) {
                        dataChannel2.lv0(dataChannel2.LJLJJI, LiveBanCapabilityChannel.class, new AqS171S0100000_5(this, 755));
                        return;
                    }
                    return;
                }
                o.LJIJI("pin");
                throw null;
            }
            o.LJIJI("pin");
            throw null;
        }
        o.LJIJI("retry");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BXT(Context mContext, CQO model, User mUser, Room mRoom, boolean z, boolean z2, CR6 msg, InterfaceC05190Ih interfaceC05190Ih, C30779C6d c30779C6d, String str, boolean z3, boolean z4, boolean z5, String str2, java.util.Map map, AObjectS81S0300000_5 aObjectS81S0300000_5, InterfaceC65784Pro interfaceC65784Pro, FragmentManager fragmentManager, AObjectS125S0200000_5 aObjectS125S0200000_5, boolean z6, DataChannel dataChannel) {
        super(mContext, true);
        long j;
        o.LJIIIZ(mContext, "mContext");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(mUser, "mUser");
        o.LJIIIZ(mRoom, "mRoom");
        o.LJIIIZ(msg, "msg");
        this.LJLJL = mContext;
        this.LJLJLJ = model;
        this.LJLJLLL = mUser;
        this.LJLL = mRoom;
        this.LJLLI = z;
        this.LJLLILLLL = z2;
        this.LJLLJ = msg;
        this.LJLLL = interfaceC05190Ih;
        this.LJLLLL = c30779C6d;
        this.LJLLLLLL = str;
        this.LJLZ = z3;
        this.LJZ = z4;
        this.LJZI = z5;
        this.LJZL = str2;
        this.LL = map;
        this.LLD = aObjectS81S0300000_5;
        this.LLF = interfaceC65784Pro;
        this.LLFF = fragmentManager;
        this.LLFFF = aObjectS125S0200000_5;
        this.LLFII = z6;
        this.LLFZ = dataChannel;
        BXV bxv = new BXV();
        bxv.attachView(this);
        this.LLI = bxv;
        long id = this.LJLJLLL.getId();
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        this.LLIIII = id == j;
    }
}
